package de.mdelab.migmm.history.merge;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

import de.mdelab.migmm.history.EdgeWithHistory;
import de.mdelab.migmm.history.ElementWithHistory;
import de.mdelab.migmm.history.util.HistoryUtil;
import de.mdelab.mltgg.mote2.TGGNode;
import de.mdelab.mltgg.mote2.TransformationDirectionEnum;

public class HistoryIdentityMerger extends HistoryMerger {

	private TransformationDirectionEnum direction;
	
	public HistoryIdentityMerger(TransformationDirectionEnum direction) {
		this.direction = direction;
	}
	
	@Override
	public void mergeElements(Collection<EObject> sourceObjects, Collection<TGGNode> correspondenceNodes,
			Collection<EObject> targetObjects) {
		Collection<ElementWithHistory> allElements = collectAllObjects(targetObjects);
		//TODO object mapping is implicit and relies on static creation order!!!
		Map<List<ElementWithHistory>, List<List<ElementWithHistory>>> mergeCandidates = new HashMap<List<ElementWithHistory>, List<List<ElementWithHistory>>>();
		for(TGGNode corrNode:correspondenceNodes) {
			List<ElementWithHistory> source = getSourceNodes(corrNode);
			
			if(!mergeCandidates.containsKey(source)) {
				mergeCandidates.put(source, new ArrayList<List<ElementWithHistory>>());
			}
			
			mergeCandidates.get(source).add(getTargetNodes(corrNode));
		}
		
		for(List<List<ElementWithHistory>> candidates:mergeCandidates.values()) {
			while(candidates.size() > 1) {
				List<ElementWithHistory> target1 = candidates.remove(0);
				List<ElementWithHistory> target2 = candidates.remove(0);
				
				List<ElementWithHistory> mergedElements = new ArrayList<ElementWithHistory>();
				for(int i = 0; i < target1.size(); i++) {
					ElementWithHistory e1 = target1.get(i);
					ElementWithHistory e2 = target2.get(i);
					
					if(e1 == e2) {
						continue;
					}
					
					ElementWithHistory merged;
					
					if(HistoryUtil.isEdgeWithHistory(e1)) {
						merged = mergeEdges((EdgeWithHistory) e1, (EdgeWithHistory) e2);
					}
					else {
						merged = mergeElements(allElements, e1, e2);
					}
					
					mergedElements.add(merged);
					
					allElements.remove(e1);
					allElements.remove(e2);
					allElements.add(merged);
				}
				candidates.add(mergedElements);
			}
		}
	}

	private List<ElementWithHistory> getTargetNodes(TGGNode corrNode) {
		if(direction == TransformationDirectionEnum.FORWARD) {
			return getRightNodes(corrNode);
		}
		else if(direction == TransformationDirectionEnum.BACKWARD){
			return getLeftNodes(corrNode);
		}
		else {
			return null;
		}
	}

	private List<ElementWithHistory> getSourceNodes(TGGNode corrNode) {
		if(direction == TransformationDirectionEnum.FORWARD) {
			return getLeftNodes(corrNode);
		}
		else if(direction == TransformationDirectionEnum.BACKWARD){
			return getRightNodes(corrNode);
		}
		else {
			return null;
		}
	}

	private List<ElementWithHistory> getLeftNodes(TGGNode corrNode) {
		return getNonEdgeElements(corrNode.getLeftNodes());
	}

	private List<ElementWithHistory> getRightNodes(TGGNode corrNode) {
		return getNonEdgeElements(corrNode.getRightNodes());
	}

	private List<ElementWithHistory> getNonEdgeElements(List<EObject> nodes) {
		List<ElementWithHistory> elements = new ArrayList<ElementWithHistory>();
		for(EObject node:nodes) {
			if(HistoryUtil.isElementWithHistory(node) && !HistoryUtil.isEdgeWithHistory(node)) {
				elements.add((ElementWithHistory) node);
			}
		}
		return elements;
	}

}
