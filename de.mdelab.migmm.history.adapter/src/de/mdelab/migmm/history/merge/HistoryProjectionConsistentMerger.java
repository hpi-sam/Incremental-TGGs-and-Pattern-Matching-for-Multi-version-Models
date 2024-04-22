package de.mdelab.migmm.history.merge;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.mdelab.migmm.history.EdgeWithHistory;
import de.mdelab.migmm.history.ElementWithHistory;
import de.mdelab.migmm.history.HistoryPackage;
import de.mdelab.migmm.history.util.HistoryUtil;
import de.mdelab.mltgg.mote2.TGGNode;

public class HistoryProjectionConsistentMerger extends HistoryMerger {

	@Override
	public void mergeElements(Collection<EObject> sourceObjects, Collection<TGGNode> correspondenceNodes,
			Collection<EObject> targetObjects) {
		mergeElements(targetObjects);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<? extends EObject> mergeElements(Collection<EObject> targetObjects) {
		Collection<ElementWithHistory> allObjectsSet = collectAllObjects(targetObjects);
		Collection<EdgeWithHistory> allEdgesSet = collectAllEdges(targetObjects);
		for(EObject root:targetObjects) {
			if(HistoryUtil.isElementWithHistory(root)) {
				allObjectsSet.add((ElementWithHistory) root);
				if(HistoryUtil.isEdgeWithHistory((ElementWithHistory) root)) {
					allEdgesSet.add((EdgeWithHistory) root);
				}
			}
			
			for(Iterator<EObject> it = root.eAllContents(); it.hasNext();) {
				EObject content = it.next();
				if(HistoryUtil.isElementWithHistory(content)) {
					allObjectsSet.add((ElementWithHistory) content);
					if(HistoryUtil.isEdgeWithHistory((ElementWithHistory) content)) {
						allEdgesSet.add((EdgeWithHistory) content);
					}
				}
			}
		}
		
		List<ElementWithHistory> allObjects = new ArrayList<ElementWithHistory>(allObjectsSet);
		for(int i = 0; i < allObjects.size(); i++) {
			for(int j = i + 1; j < allObjects.size(); j++) {
				ElementWithHistory o1 = allObjects.get(i);
				ElementWithHistory o2 = allObjects.get(j);
				
				if(!HistoryUtil.isEdgeWithHistory(o1) && !HistoryUtil.isEdgeWithHistory(o2) && areAttributeEquivalent(o1, o2) && areIntervalDisjoint(o1, o2)) {					
					allObjects.remove(j);
					allObjects.remove(i);

					ElementWithHistory merged = EcoreUtil.copy(o1);
					merged.setValidIn(o1.getValidIn().union(o2.getValidIn()));
					allObjects.add(merged);
					
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
					
					i--;
					break;
				}
			}
		}

		List<EdgeWithHistory> allEdges = new ArrayList<EdgeWithHistory>(allEdgesSet);
		for(int i = 0; i < allEdges.size(); i++) {
			for(int j = i + 1; j < allEdges.size(); j++) {
				EdgeWithHistory e1 = allEdges.get(i);
				EdgeWithHistory e2 = allEdges.get(j);
				
				if(areIntervalDisjoint(e1, e2) && areReferenceEquivalent(e1, e2)) {					
					EObject container = e1.eContainer();
					EReference containmentFeature = e1.eContainmentFeature();
					
					allObjects.remove(j);
					allObjects.remove(i);

					EdgeWithHistory merged = EcoreUtil.copy(e1);
					merged.setValidIn(e1.getValidIn().union(e2.getValidIn()));
					
					/*
					 * this is definitely a collection, otherwise it could not contain both e1 and e2
					 */
					((Collection) container.eGet(containmentFeature)).remove(e1);
					((Collection) container.eGet(containmentFeature)).remove(e2);
					((Collection) container.eGet(containmentFeature)).add(merged);
					
					i--;
					break;
				}
			}
		}
		
		return allObjects;
	}

	private boolean areReferenceEquivalent(ElementWithHistory e1, ElementWithHistory e2) {
		if(e1.eClass() != e2.eClass() || e1.eContainer() != e2.eContainer()) {
			return false;
		}
		for(EReference reference:e1.eClass().getEAllReferences()) {
			if(!(reference == HistoryPackage.Literals.ELEMENT_WITH_HISTORY__VALID_IN ||
					reference == HistoryPackage.Literals.ELEMENT_WITH_HISTORY__UNHANDLED)) {
				if(!(e1.eGet(reference).equals(e2.eGet(reference)))) {
					return false;
				}
			}
		}
		return false;
	}

	private boolean areIntervalDisjoint(ElementWithHistory o1, ElementWithHistory o2) {
		return o1.getValidIn().intersect(o2.getValidIn()).isEmpty();
	}

	private boolean areAttributeEquivalent(ElementWithHistory o1, ElementWithHistory o2) {
		if(o1.eClass() != o2.eClass()) {
			return false;
		}
		
		for(EAttribute attribute:o1.eClass().getEAllAttributes()) {
			Object value1 = o1.eGet(attribute);
			Object value2 = o2.eGet(attribute);
			if(!value1.equals(value2)) {
				return false;
			}
		}
			
		return true;
	}
}
