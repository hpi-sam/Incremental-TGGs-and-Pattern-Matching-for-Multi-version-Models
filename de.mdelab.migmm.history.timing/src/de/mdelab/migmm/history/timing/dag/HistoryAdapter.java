package de.mdelab.migmm.history.timing.dag;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.mdelab.migmm.history.AttributeWithHistory;
import de.mdelab.migmm.history.EdgeWithHistory;
import de.mdelab.migmm.history.ElementWithHistory;
import de.mdelab.migmm.history.History;
import de.mdelab.migmm.history.Interval;
import de.mdelab.migmm.history.NodeWithHistory;
import de.mdelab.migmm.history.timing.DAGInterval;
import de.mdelab.migmm.history.timing.DAGVersion;
import de.mdelab.migmm.history.timing.impl.DAGIntervalImpl;
import de.mdelab.migmm.history.timing.util.DAGVersionUtil;

public class HistoryAdapter {

	public void removeRecreations(History h) {
		System.out.println("EXECUTING TOPOSORT");
		List<DAGVersion> orderedVersions = DAGVersionUtil.orderTopologically(h.getOwnedTimingUnits());
		
		System.out.println("CREATING VERSION INDEX");
		DAGAdapter dagAdapter = createDAGAdapter(orderedVersions);

		System.out.println("CREATING MERGES LIST");
		List<DAGVersion> orderedMerges = new ArrayList<DAGVersion>();
		for(DAGVersion v:orderedVersions) {
			if(v.getPredecessors().size() > 1) {
				orderedMerges.add(v);
			}
		}

		int count = 1;
		for(DAGVersion v:orderedMerges) {
			System.out.println("PROCESSING VERSION " + count + "/" + orderedMerges.size());
			count++;
			
			Collection<ElementWithHistory> recreatedElements = collectRecreatedElements(h, v, dagAdapter);
			Map<ElementWithHistory, ElementWithHistory> splitElements = new LinkedHashMap<ElementWithHistory, ElementWithHistory>();
			
			for(ElementWithHistory original:recreatedElements) {
				ElementWithHistory copy = splitElementAt(original, v, h);
				splitElements.put(original, copy);
			}
			
			for(ElementWithHistory original:recreatedElements) {
				rewireCopy(original, splitElements);
			}
		}
		
		setRecreatingFlags(h);
	}

	private void setRecreatingFlags(History h) {
		for(ElementWithHistory e:h.getOwnedElements()) {
			if(e.getValidIn() instanceof DAGInterval) {
				((DAGInterval) e.getValidIn()).setRecreating(false);
			}
		}
	}

	private DAGAdapter createDAGAdapter(Collection<DAGVersion> versions) {
		DAGAdapter dagAdapter = new DAGAdapter();
		for(DAGVersion v:versions) {
			dagAdapter.addAdapter(v);
		}
		dagAdapter.recomputeIndices();
		return dagAdapter;
	}

	private Collection<ElementWithHistory> collectRecreatedElements(History h, DAGVersion v, DAGAdapter dagAdapter) {
		Collection<ElementWithHistory> recreatedElements = new ArrayList<ElementWithHistory>();
		for(ElementWithHistory element:h.getOwnedElements()) {
			if(!(element.getValidIn() instanceof DAGInterval)) {
				continue;
			}
			
			Collection<DAGVersion> deletionVersions = ((DAGInterval) element.getValidIn()).getDts();
			if(element.getValidIn().contains(v) && DAGVersionUtil.succeedsAnyReflexive(v, deletionVersions, dagAdapter)) {
				recreatedElements.add(element);
			}
		}
		return recreatedElements;
	}

	private ElementWithHistory splitElementAt(ElementWithHistory original, DAGVersion v, History h) {
		EClass eClass = original.eClass();
		EFactory factory = eClass.getEPackage().getEFactoryInstance();
		ElementWithHistory copy = (ElementWithHistory) factory.create(eClass);
		if(original instanceof AttributeWithHistory) {
			EStructuralFeature valueFeature = original.eClass().getEStructuralFeature("value");
			copy.eSet(valueFeature, original.eGet(valueFeature));
			
			((AttributeWithHistory) copy).setAttributeValue(((AttributeWithHistory) original).getAttributeValue());
		}
		h.getOwnedElements().add(copy);

		DAGInterval originalValidIn = (DAGInterval) original.getValidIn();
		Interval copyValidIn = createInterval(v, originalValidIn.getDts());
		Interval newOriginalValidIn = originalValidIn.minus(copyValidIn);
		
		original.setValidIn(newOriginalValidIn);
		copy.setValidIn(copyValidIn);		
		
		return copy;
	}

	private Interval createInterval(DAGVersion c, List<DAGVersion> dts) {
		Collection<DAGVersion> relevantDts = new LinkedHashSet<DAGVersion>();
		
		Deque<DAGVersion> queue = new LinkedList<DAGVersion>();
		Set<DAGVersion> visited = new LinkedHashSet<DAGVersion>();
		queue.addLast(c);
		
		while(!queue.isEmpty()) {
			DAGVersion current = queue.removeFirst();
			if(visited.contains(current)) {
				continue;
			}
			else {
				visited.add(current);
				if(dts.contains(current)) {
					relevantDts.add(current);
				}
				else {
					for(DAGVersion successor:current.getSuccessors()) {
						queue.addLast(successor);
					}
				}
			}
		}
		return DAGIntervalImpl.create(Collections.singletonList(c), relevantDts);
	}

	@SuppressWarnings("unchecked")
	private void rewireCopy(ElementWithHistory original, Map<ElementWithHistory, ElementWithHistory> splitElements) {
		if(original instanceof EdgeWithHistory) {
			EdgeWithHistory originalEdge = (EdgeWithHistory) original;
			EdgeWithHistory copy = (EdgeWithHistory) splitElements.get(original);
			NodeWithHistory copySource = splitElements.containsKey(originalEdge.getEdgeSource()) ?
					(NodeWithHistory) splitElements.get(originalEdge.getEdgeSource()) :
					originalEdge.getEdgeSource();
			NodeWithHistory copyTarget = splitElements.containsKey(originalEdge.getEdgeTarget()) ?
					(NodeWithHistory) splitElements.get(originalEdge.getEdgeTarget()) :
					originalEdge.getEdgeTarget();
			
			copy.setEdgeSource(copySource);
			copy.setEdgeTarget(copyTarget);
			
			//TODO check whether this is needed/works!!!
			EStructuralFeature sourceFeature = getMatchingFeatureFeature(copySource.eClass(), copy.eClass());
			((Collection<EObject>) copySource.eGet(sourceFeature)).add(copy);
			EStructuralFeature targetFeature = getMatchingTargetFeature(copy.eClass(), copyTarget.eClass());
			copy.eSet(targetFeature, copyTarget);
		}
		else if(original instanceof AttributeWithHistory) {
			AttributeWithHistory originalAttribute = (AttributeWithHistory) original;
			AttributeWithHistory copy = (AttributeWithHistory) splitElements.get(original);
			NodeWithHistory copyNode = splitElements.containsKey(originalAttribute.getContainingNode()) ?
					(NodeWithHistory) splitElements.get(originalAttribute.getContainingNode()) :
					originalAttribute.getContainingNode();

			copy.setContainingNode(copyNode);
			
			//TODO check whether this is needed/works!!!
			EStructuralFeature attributeFeature = getMatchingFeatureFeature(copyNode.eClass(), copy.eClass());
			((Collection<EObject>) copyNode.eGet(attributeFeature)).add(copy);
		}
	}

	private EStructuralFeature getMatchingFeatureFeature(EClass eClass, EClass edgeClass) {
		for(EStructuralFeature feature:eClass.getEAllStructuralFeatures()) {
			if(feature.getEType() == edgeClass) {
				return feature;
			}
		}
		return null;
	}
	
	private EStructuralFeature getMatchingTargetFeature(EClass edgeClass, EClass targetClass) {
		for(EStructuralFeature feature:edgeClass.getEStructuralFeatures()) {
			if(feature.getEType() == targetClass || targetClass.getEAllSuperTypes().contains(feature.getEType())) {
				return feature;
			}
		}
		return null;
	}

}
