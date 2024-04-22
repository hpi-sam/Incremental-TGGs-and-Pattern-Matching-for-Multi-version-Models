package de.mdelab.migmm.history.timing.folding;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import mapping.Mapping;
import mapping.MappingRoot;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import de.mdelab.emf.util.EMFUtil;
//import de.mdelab.emf.util.mapping.InstanceMapping;
//import de.mdelab.emf.util.mapping.InstanceMappingStrategy;
import de.mdelab.migmm.history.AttributeWithHistory;
import de.mdelab.migmm.history.EdgeWithHistory;
import de.mdelab.migmm.history.ElementWithHistory;
import de.mdelab.migmm.history.History;
import de.mdelab.migmm.history.HistoryFactory;
import de.mdelab.migmm.history.Interval;
import de.mdelab.migmm.history.NodeWithHistory;
import de.mdelab.migmm.history.timing.DAGInterval;
import de.mdelab.migmm.history.timing.DAGVersion;
import de.mdelab.migmm.history.timing.TimingFactory;
import de.mdelab.migmm.history.timing.impl.DAGIntervalImpl;

public class SnapshotFolder {
//
//	private final Map<EObject, EClass> metaMappings;
//	private final InstanceMappingStrategy instanceMappingStrategy;
//	
//	public SnapshotFolder(MappingRoot metaMappingRoot, InstanceMappingStrategy instanceMappingStrategy) {
//		this.metaMappings = createRuntimeMapping(metaMappingRoot);
//		this.instanceMappingStrategy = instanceMappingStrategy;
//	}
//	
//	private Map<EObject, EClass> createRuntimeMapping(MappingRoot mappingRoot) {
//		Map<EObject, EClass> mappings = new HashMap<EObject, EClass>();
//		
//		for(Mapping mapping:mappingRoot.getMappings()) {
//			EObject source = getRuntimeObject(mapping.getSource());
//			EClass target = (EClass) getRuntimeObject(mapping.getTarget());
//			mappings.put(source, target);
//		}
//		return mappings;
//	}
//
//	private EObject getRuntimeObject(EObject o) {
//		if(o.eClass() == EcorePackage.Literals.ECLASS) {
//			return getRuntimeClassifier((EClassifier) o);
//		}
//		else if(o.eClass() == EcorePackage.Literals.EREFERENCE) {
//			return getRuntimeReference((EReference) o);
//		}
//		else if(o.eClass() == EcorePackage.Literals.EATTRIBUTE) {
//			return getRuntimeAttribute((EAttribute) o);
//		}
//		else {
//			return null;
//		}
//	}
//
//	private EObject getRuntimeClassifier(EClassifier classifier) {
//		EPackage pkg = classifier.getEPackage();
//		EPackage runtimePackage = EPackage.Registry.INSTANCE.getEPackage(pkg.getNsURI());
//		
//		return runtimePackage.getEClassifier(classifier.getName());
//	}
//
//	private EReference getRuntimeReference(EReference reference) {
//		EClass runtimeClass = (EClass) getRuntimeClassifier(reference.getEContainingClass());
//		return (EReference) runtimeClass.getEStructuralFeature(reference.getName());
//	}
//
//	private EAttribute getRuntimeAttribute(EAttribute attribute) {
//		EClass runtimeClass = (EClass) getRuntimeClassifier(attribute.getEContainingClass());
//		return (EAttribute) runtimeClass.getEStructuralFeature(attribute.getName());
//	}
//
//	public History fold(Map<DAGVersion, ? extends EObject> versionDAG) {
//		History h = HistoryFactory.eINSTANCE.createHistory();
//
//		DAGInterval hInterval = TimingFactory.eINSTANCE.createDAGInterval();
//		h.setValidIn(hInterval);
//		
//		List<DAGVersion> orderedVersions = orderTopologically(versionDAG.keySet());
//
//		DAGVersion initialVersion = orderedVersions.get(0);
//		hInterval.getCts().add(initialVersion);
//		h.getOwnedTimingUnits().add(initialVersion);
//		
//		Map<EObject, Map<EObject, NodeWithHistory>> historyMappings = new HashMap<EObject, Map<EObject, NodeWithHistory>>();
//		System.out.println("initializing history from initial commit...");
//		EObject initialRoot = versionDAG.get(initialVersion);
//		Map<EObject, NodeWithHistory> currentHistoryMapping = initializeHistoryFromSnapshot(initialRoot, h, initialVersion);
//		historyMappings.put(initialRoot, currentHistoryMapping);
//		
//		for(int i = 1; i < orderedVersions.size(); i++) {
//			DAGVersion currentVersion = orderedVersions.get(i);
//			h.getOwnedTimingUnits().add(currentVersion);
//			
//			EObject currentRoot = versionDAG.get(currentVersion);
//			Collection<EObject> predecessors = new LinkedList<EObject>();
//			for(DAGVersion predecessorVersion:currentVersion.getPredecessors()) {
//				predecessors.add(versionDAG.get(predecessorVersion));
//			}
//				
//			System.out.println("merging commit " + i + "...");
//			currentHistoryMapping = mergeCurrentSnapshot(predecessors, currentRoot, h, currentVersion, historyMappings);
//			historyMappings.put(currentRoot, currentHistoryMapping);
//		}
//		
//		return h;
//	}
//
//	private List<DAGVersion> orderTopologically(Collection<DAGVersion> versions) {
//		Map<DAGVersion, Integer> remainingPredecessors = new HashMap<DAGVersion, Integer>();
//		for(DAGVersion version:versions) {
//			remainingPredecessors.put(version, version.getPredecessors().size());
//		}
//		
//		List<DAGVersion> currentLevel = new LinkedList<DAGVersion>();
//		for(DAGVersion version:versions) {
//			if(remainingPredecessors.get(version) == 0) {
//				currentLevel.add(version);
//			}
//		}
//
//		assert currentLevel.size() == 1;
//		
//		List<DAGVersion> orderedVersions = new LinkedList<DAGVersion>();
//		while(!currentLevel.isEmpty()) {
//			List<DAGVersion> nextLevel = new LinkedList<DAGVersion>();
//			for(DAGVersion current:currentLevel) {
//				orderedVersions.add(current);
//				for(DAGVersion successor:current.getSuccessors()) {
//					int remaining = remainingPredecessors.get(successor) - 1;
//					remainingPredecessors.put(successor, remaining);
//					if(remaining == 0) {
//						nextLevel.add(successor);
//					}
//				}
//			}
//			
//			currentLevel = nextLevel;
//		}
//
//		assert orderedVersions.size() == versions.size();
//		
//		return orderedVersions;
//	}
//
//	private Map<EObject, NodeWithHistory> mergeCurrentSnapshot(Collection<EObject> predecessors, EObject currentRoot, History h,
//			DAGVersion currentVersion, Map<EObject, Map<EObject, NodeWithHistory>> predecessorHistoryMappings) {
//		Map<EObject, NodeWithHistory> currentHistoryMapping = new HashMap<EObject, NodeWithHistory>();
//
//		for(EObject predecessor:predecessors) {
//			InstanceMapping instanceMapping = instanceMappingStrategy.createInstanceMapping(predecessor, currentRoot);
//			Map<EObject, NodeWithHistory> predecessorHistoryMapping = predecessorHistoryMappings.get(predecessor);
//			for(Entry<EObject, EObject> entry:instanceMapping.getMapping().entrySet()) {
//				if(!currentHistoryMapping.containsKey(entry.getValue())) {
//					currentHistoryMapping.put(entry.getValue(), predecessorHistoryMapping.get(entry.getKey()));
//				}
//			}
//		}
//		Set<EObject> missingObjects = collectMissingObjects(currentRoot, currentHistoryMapping);
//		Set<NodeWithHistory> removedElements = collectRemovedElements(predecessors, currentHistoryMapping, predecessorHistoryMappings);
//		
//		for(Entry<EObject, NodeWithHistory> entry:currentHistoryMapping.entrySet()) {
//			EObject currentObject = entry.getKey();
//			adaptAttributes(currentObject, entry.getValue(), h, currentVersion);
//		}
//		createMissingElements(missingObjects, h, currentVersion, currentHistoryMapping);
//		
//		relinkObjects(currentHistoryMapping, h, currentVersion);
//		
//		deleteNodes(removedElements, currentVersion);
//		
//		return currentHistoryMapping;
//	}
//
//	private Set<NodeWithHistory> collectRemovedElements(Collection<EObject> predecessors,
//			Map<EObject, NodeWithHistory> currentHistoryMapping,
//			Map<EObject, Map<EObject, NodeWithHistory>> predecessorHistoryMappings) {
//		Set<NodeWithHistory> removedElements = new LinkedHashSet<NodeWithHistory>();
//		for(EObject predecessor:predecessors) {
//			removedElements.addAll(collectRemovedElements(predecessor, new LinkedHashSet<NodeWithHistory>(currentHistoryMapping.values()), predecessorHistoryMappings.get(predecessor)));
//		}
//		return removedElements;
//	}
//
//	private Collection<NodeWithHistory> collectRemovedElements(EObject predecessorRoot,
//			LinkedHashSet<NodeWithHistory> preservedElements, Map<EObject, NodeWithHistory> predecessorHistoryMapping) {
//		Set<NodeWithHistory> removedElements = new LinkedHashSet<NodeWithHistory>();
//		Collection<EObject> allPredecessors = EMFUtil.collectReachableObjects(predecessorRoot);
//		
//		for(EObject eObject:allPredecessors) {
//			NodeWithHistory mappedChild = predecessorHistoryMapping.get(eObject);
//			if(!preservedElements.contains(mappedChild)) {
//				removedElements.add(mappedChild);
//			}
//		}
//		return removedElements;
//	}
//
//	private Set<EObject> collectMissingObjects(EObject root, Map<EObject, NodeWithHistory> currentHistoryMapping) {
//		Set<EObject> missingObjects = new LinkedHashSet<EObject>();
//		Collection<EObject> allObjects = EMFUtil.collectReachableObjects(root);
//		for(EObject eObject:allObjects) {
//			if(!currentHistoryMapping.containsKey(eObject)) {
//				missingObjects.add(eObject);
//			}
//		}
//		return missingObjects;
//	}
//
//	private void relinkObjects(Map<EObject, NodeWithHistory> currentHistoryMapping,
//			History h, DAGVersion currentVersion) {
//		for(Entry<EObject, NodeWithHistory> entry:currentHistoryMapping.entrySet()) {
//			relinkMappedObject(entry.getKey(), entry.getValue(), currentHistoryMapping, h, currentVersion);
//		}
//	}
//
//	private void relinkMappedObject(EObject current, NodeWithHistory mappedObject, Map<EObject, NodeWithHistory> currentHistoryMapping,
//			History h, DAGVersion currentVersion) {
//		for(EReference reference:current.eClass().getEAllReferences()) {
//			Collection<EObject> currentTargets = EMFUtil.getReferenceValues(current, reference);
//			Set<NodeWithHistory> currentTargetElements = new LinkedHashSet<NodeWithHistory>();
//			for(EObject currentTarget:currentTargets) {
//				currentTargetElements.add(currentHistoryMapping.get(currentTarget));
//			}
//
//			Collection<ElementWithHistory> previousReferenceElements = getFeatureValuesInVersion(mappedObject, reference, currentVersion);								
//			Set<NodeWithHistory> previousTargetElements = new LinkedHashSet<NodeWithHistory>();
//			for(ElementWithHistory previousReferenceElement:previousReferenceElements) {
//				NodeWithHistory previousTargetElement = getTargetElement(previousReferenceElement);
//				previousTargetElements.add(previousTargetElement);
//				
//				if(!currentTargetElements.contains(previousTargetElement)) {
//					deleteElement(previousReferenceElement, currentVersion);
//				}
//			}
//			
//			for(NodeWithHistory currentTargetElement:currentTargetElements) {
//				if(!previousTargetElements.contains(currentTargetElement)) {
//					createReference(mappedObject, reference, currentTargetElement, h, currentVersion);
//				}
//			}
//		}
//	}
//
//	private void adaptAttributes(EObject current, NodeWithHistory mapped, History h, DAGVersion currentVersion) {
//		for(EAttribute attribute:current.eClass().getEAllAttributes()) {
//			Collection<ElementWithHistory> previousValueElements = getFeatureValuesInVersion((ElementWithHistory) mapped, attribute, currentVersion);
//			Set<Object> currentValues = new HashSet<Object>(getAttributeValues(current, attribute));
//			Set<Object> previousValues = new HashSet<Object>();
//			
//			for(ElementWithHistory oldValueElement:previousValueElements) {
//				Object oldValue = oldValueElement.eGet(getValueFeature(oldValueElement));
//				previousValues.add(oldValue);
//				if(!currentValues.contains(oldValue)) {
//					deleteElement(oldValueElement, currentVersion);
//				}
//			}
//			for(Object newValue:currentValues) {
//				if(!previousValues.contains(newValue)) {
//					createAttributeValue(mapped, attribute, newValue, h, currentVersion);
//				}
//			}
//		}
//	}
//
//	private void createMissingElements(Set<EObject> missingObjects, History h,
//			DAGVersion currentVersion, Map<EObject, NodeWithHistory> historyMapping) {
//		for(EObject missingObject:missingObjects) {
//			NodeWithHistory mappedObject = createMappedObject(missingObject, h, currentVersion);
//			initializeMappedObject(missingObject, mappedObject, h, currentVersion);
//			h.getOwnedElements().add(mappedObject);
//			historyMapping.put(missingObject, mappedObject);
//		}
//	}
//
//	private Map<EObject, NodeWithHistory> initializeHistoryFromSnapshot(EObject eObject, History h, DAGVersion lastVersion) {
//		Map<EObject, NodeWithHistory> historyMapping = initializeHistoryMapping(eObject, h, lastVersion);
//		
//		for(Entry<EObject, NodeWithHistory> entry:historyMapping.entrySet()) {
//			initializeMappedObject(entry.getKey(), entry.getValue(), h, lastVersion);
//			linkMappedObject(entry.getKey(), entry.getValue(), historyMapping, h, lastVersion);
//		}
//		
//		return historyMapping;
//	}
//
//	private Map<EObject, NodeWithHistory> initializeHistoryMapping(EObject eObject, History h, DAGVersion version) {
//		Map<EObject, NodeWithHistory> historyMapping = new HashMap<EObject, NodeWithHistory>();
//		
//		Set<EObject> newObjects = new LinkedHashSet<EObject>();
//		newObjects.add(eObject);
//		
//		while(!newObjects.isEmpty()) {
//			Set<EObject> nextObjects = new LinkedHashSet<EObject>();
//			
//			for(EObject newObject:newObjects) {
//				NodeWithHistory mappedContainedObject = createMappedObject(newObject, h, version);
//				historyMapping.put(newObject, mappedContainedObject);
//				h.getOwnedElements().add((ElementWithHistory) mappedContainedObject);
//				
//				for(EReference reference:newObject.eClass().getEAllReferences()) {
//					Collection<EObject> referencedObjects = EMFUtil.getReferenceValues(newObject, reference);
//					for(EObject referencedObject:referencedObjects) {
//						if(!historyMapping.containsKey(referencedObject)) {
//							nextObjects.add(referencedObject);
//						}
//					}
//				}
//			}
//			
//			newObjects = nextObjects;
//		}
//		
//		return historyMapping;
//	}
//
//	private void initializeMappedObject(EObject original, NodeWithHistory mapped, History h, DAGVersion lastVersion) {
//		for(EAttribute attribute:original.eClass().getEAllAttributes()) {
//			initializeAttribute(original, mapped, attribute, h, lastVersion);
//		}
//	}
//
//	@SuppressWarnings("unchecked")
//	private void initializeAttribute(EObject original, NodeWithHistory mapped, EAttribute attribute, History h, DAGVersion version) {
//		Collection<Object> values = attribute.isMany() ?
//										(Collection<Object>) original.eGet(attribute) : 
//										Collections.singleton(original.eGet(attribute));
//						
//		for(Object value:values) {
//			createAttributeValue(mapped, attribute, value, h, version);
//		}
//	}
//	
//	@SuppressWarnings("unchecked")
//	private void createAttributeValue(NodeWithHistory mapped, EAttribute attribute, Object value, History h, DAGVersion version) {
//		EClass valueClass = metaMappings.get(attribute);
//		EReference valueReference = getMatchingReference(mapped.eClass(), valueClass);
//						
//		AttributeWithHistory valueObject = (AttributeWithHistory) createInstance(valueClass);
//		valueObject.eSet(getValueFeature(valueClass), value);
//		valueObject.setAttributeValue(value);
//		valueObject.setValidIn(createInterval(h, version));
//		h.getOwnedElements().add(valueObject);
//		
//		((Collection<EObject>) mapped.eGet(valueReference)).add(valueObject);
//		valueObject.setContainingNode(mapped);
//	}
//
//	private void deleteElement(ElementWithHistory element, DAGVersion version) {
//		((DAGInterval) element.getValidIn()).getDts().add(version);
//	}
//
//	private void deleteNodes(Collection<NodeWithHistory> elements, DAGVersion version) {
//		for(NodeWithHistory element:elements) {
//			deleteElement(element, version);
//
//			for(EdgeWithHistory edge:element.getInEdges()) {
//				if(edge.getValidIn().contains(version)) {
//					deleteElement(edge, version);
//				}
//			}
//			
//			for(EdgeWithHistory edge:element.getOutEdges()) {
//				if(edge.getValidIn().contains(version)) {
//					deleteElement(edge, version);
//				}
//			}
//
//			for(AttributeWithHistory attribute:element.getNodeAttributes()) {
//				if(attribute.getValidIn().contains(version)) {
//					deleteElement(attribute, version);
//				}
//			}
//		}
//	}
//
//	private void linkMappedObject(EObject original, NodeWithHistory mapped, Map<EObject, NodeWithHistory> historyMapping,
//			History h, DAGVersion lastVersion) {
//		for(EReference reference:original.eClass().getEAllReferences()) {
//			initializeReference(original, mapped, reference, historyMapping, h, lastVersion);
//		}
//	}
//
//	private void initializeReference(EObject original, NodeWithHistory mapped, EReference reference,
//			Map<EObject, NodeWithHistory> historyMapping, History h, DAGVersion lastVersion) {
//		Collection<EObject> items = EMFUtil.getReferenceValues(original, reference);
//										
//		for(EObject item:items) {
//			NodeWithHistory mappedItem = historyMapping.get(item);
//			createReference(mapped, reference, mappedItem, h, lastVersion);
//		}
//	}
//
//	@SuppressWarnings("unchecked")
//	private Collection<ElementWithHistory> getFeatureValuesInVersion(ElementWithHistory element, EStructuralFeature feature,
//			DAGVersion currentVersion) {
//		EClass valueClass = metaMappings.get(feature);
//		EReference valueReference = getMatchingReference(element, valueClass);
//		Collection<ElementWithHistory> values = new ArrayList<ElementWithHistory>();
//		for(EObject valueObject:((Collection<EObject>) element.eGet(valueReference))) {
//			ElementWithHistory valueElement = (ElementWithHistory) valueObject;
//			if(valueElement.getValidIn().contains(currentVersion)) {
//				values.add(valueElement);
//			}
//		}
//		return values;
//	}
//
//	@SuppressWarnings("unchecked")
//	private Collection<Object> getAttributeValues(EObject eObject, EAttribute attribute) {
//		Object value = eObject.eGet(attribute);
//		if(attribute.isMany()) {
//			return (Collection<Object>) value;
//		}
//		else if(value != null) {
//			return Collections.singleton(value);
//		}
//		else {
//			return Collections.emptySet();
//		}
//	}
//
//	@SuppressWarnings("unchecked")
//	private void createReference(NodeWithHistory mappedSource, EReference reference, NodeWithHistory mappedTarget, History h,
//			DAGVersion lastVersion) {
//		EClass itemClass = metaMappings.get(reference);
//		EReference itemReference = getMatchingReference(mappedSource.eClass(), itemClass);
//		
//		EdgeWithHistory itemObject = (EdgeWithHistory) createInstance(itemClass);
//		
//		itemObject.eSet(getMatchingReference(itemClass, mappedTarget.eClass()), mappedTarget);
//		itemObject.setValidIn(createInterval(h, lastVersion));
//		h.getOwnedElements().add((ElementWithHistory) itemObject);
//
//		((Collection<EObject>) mappedSource.eGet(itemReference)).add(itemObject);
//		itemObject.setEdgeSource(mappedSource);
//		itemObject.setEdgeTarget(mappedTarget);
//	}
//
//	private NodeWithHistory createMappedObject(EObject eObject, History h, DAGVersion lastVersion) {
//		EClass mappedClass = metaMappings.get(eObject.eClass());
//		NodeWithHistory mappedObject = (NodeWithHistory) createInstance(mappedClass);
//		mappedObject.setValidIn(createInterval(h, lastVersion));
//		return mappedObject;
//	}
//
//	private EObject createInstance(EClass eClass) {
//		return eClass.getEPackage().getEFactoryInstance().create(eClass);
//	}
//
//	private EStructuralFeature getValueFeature(EObject attributeObject) {
//		return getValueFeature(attributeObject.eClass());
//	}
//
//	private EStructuralFeature getValueFeature(EClass valueClass) {
//		return valueClass.getEStructuralFeature("value");
//	}
//
//	private NodeWithHistory getTargetElement(EObject referenceObject) {
//		return (NodeWithHistory) referenceObject.eGet(getTargetFeature(referenceObject.eClass()));
//	}
//
//	private EStructuralFeature getTargetFeature(EClass eClass) {
//		return eClass.getEStructuralFeatures().get(0);
//	}
//
//	private EReference getMatchingReference(EObject eObject, EClass targetClass) {
//		return getMatchingReference(eObject.eClass(), targetClass);
//	}
//
//	private EReference getMatchingReference(EClass eClass, EClass targetClass) {	//TODO improve reference selection
//		for(EReference reference:eClass.getEAllReferences()) {
//			if(((EClassifier) reference.eContainer()).getEPackage().getName().equals("history")) {
//				continue;
//			}
//			
//			if(reference.getEType() == targetClass || targetClass.getEAllSuperTypes().contains(reference.getEType())) {
//				return reference;
//			}
//		}
//		return null;
//	}
//
//	private Interval createInterval(History h, DAGVersion cts) {
//		Interval i = DAGIntervalImpl.create(Collections.singleton(cts), Collections.emptySet());
//		h.getOwnedIntervals().add(i);
//		return i;
//	}

}
