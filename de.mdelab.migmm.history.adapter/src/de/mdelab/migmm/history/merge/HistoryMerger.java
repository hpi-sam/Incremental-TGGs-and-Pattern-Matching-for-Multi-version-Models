package de.mdelab.migmm.history.merge;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.mdelab.migmm.history.EdgeWithHistory;
import de.mdelab.migmm.history.ElementWithHistory;
import de.mdelab.migmm.history.util.HistoryUtil;
import de.mdelab.mltgg.mote2.TGGNode;

public abstract class HistoryMerger {

	public abstract void mergeElements(Collection<EObject> sourceObjects, Collection<TGGNode> correspondenceNodes, Collection<EObject> targetObjects);

	@SuppressWarnings({ "unchecked", "rawtypes" })
	protected ElementWithHistory mergeElements(Collection<ElementWithHistory> allObjects, ElementWithHistory o1, ElementWithHistory o2) {
		ElementWithHistory merged = EcoreUtil.copy(o1);
		merged.setValidIn(o1.getValidIn().union(o2.getValidIn()));
		for(EObject ref:allObjects) {
			for(EReference feature:ref.eClass().getEAllReferences()) {
				if(feature.isMany()) {
					boolean removed = ((Collection)ref.eGet(feature)).remove(o1);
					removed = ((Collection)ref.eGet(feature)).remove(o2) || removed;
					if(removed) {
						((Collection)ref.eGet(feature)).add(merged);
					}
				}
				else {
					if(ref.eGet(feature) == o1 || ref.eGet(feature) == o2) {
						ref.eSet(feature, merged);
					}
				}
			}
		}
		
		return merged;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	protected EdgeWithHistory mergeEdges(EdgeWithHistory e1, EdgeWithHistory e2) {			
		EObject container = e1.eContainer();
		EReference containmentFeature = e1.eContainmentFeature();
		
		EdgeWithHistory merged = EcoreUtil.copy(e1);
		merged.setValidIn(e1.getValidIn().union(e2.getValidIn()));
		
		/*
		 * this is definitely a collection, otherwise it could not contain both e1 and e2
		 */
		((Collection) container.eGet(containmentFeature)).remove(e1);
		((Collection) container.eGet(containmentFeature)).remove(e2);
		((Collection) container.eGet(containmentFeature)).add(merged);
		
		return merged;
	}

	protected Collection<ElementWithHistory> collectAllObjects(Iterable<EObject> roots) {
		Set<ElementWithHistory> allObjectsSet = new HashSet<ElementWithHistory>();
		for(EObject root:roots) {
			if(HistoryUtil.isElementWithHistory(root)) {
				allObjectsSet.add((ElementWithHistory) root);
			}
			
			for(Iterator<EObject> it = root.eAllContents(); it.hasNext();) {
				EObject content = it.next();
				if(HistoryUtil.isElementWithHistory(content)) {
					allObjectsSet.add((ElementWithHistory) content);
				}
			}
		}
		return allObjectsSet;
	}

	protected Collection<EdgeWithHistory> collectAllEdges(Collection<EObject> roots) {
		Set<EdgeWithHistory> allEdgesSet = new HashSet<EdgeWithHistory>();
		for(EObject root:roots) {
			if(HistoryUtil.isElementWithHistory(root) && HistoryUtil.isEdgeWithHistory((ElementWithHistory) root)) {
				allEdgesSet.add((EdgeWithHistory) root);
			}
			
			for(Iterator<EObject> it = root.eAllContents(); it.hasNext();) {
				EObject content = it.next();
				if(HistoryUtil.isElementWithHistory(content) && HistoryUtil.isEdgeWithHistory((ElementWithHistory) content)) {
					allEdgesSet.add((EdgeWithHistory) content);
				}
			}
		}
		return allEdgesSet;
	}

}
