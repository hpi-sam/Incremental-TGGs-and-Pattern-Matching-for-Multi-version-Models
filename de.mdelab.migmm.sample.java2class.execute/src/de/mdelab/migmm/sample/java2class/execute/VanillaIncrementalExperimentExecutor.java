package de.mdelab.migmm.sample.java2class.execute;

import java.io.IOException;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.modisco.java.Model;

import de.mdelab.migmm.history.AttributeWithHistory;
import de.mdelab.migmm.history.EdgeWithHistory;
import de.mdelab.migmm.history.ElementWithHistory;
import de.mdelab.migmm.history.History;
import de.mdelab.migmm.history.HistoryPackage;
import de.mdelab.migmm.history.NodeWithHistory;
import de.mdelab.migmm.history.TimingUnit;
import de.mdelab.migmm.history.execute.StandardTransformationExecutor;
import de.mdelab.migmm.history.execute.TransformationExecutor;
import de.mdelab.migmm.history.timing.DAGVersion;
import de.mdelab.mltgg.mote2.sdm.SdmOperationalTGG;
import mapping.Mapping;
import mapping.MappingRoot;

public class VanillaIncrementalExperimentExecutor extends IncrementalExperimentExecutor{

	protected Map<EModelElement, EClass> metaMapping;
	protected Map<EClass, EModelElement> inverseMetaMapping;
	
	protected Map<DAGVersion, Collection<ElementWithHistory>> potentialCreations = new LinkedHashMap<DAGVersion, Collection<ElementWithHistory>>();

	private EObject mappingDummy = EcoreFactory.eINSTANCE.createEObject();

	public static void main(String[] args) {
		if(args.length < 3) {
			System.out.println("3 arguments: inputModel, tggPath, mappingPath");
			return;
		}
		String inputModelPath = args[0];
		String tggPath = args[1];
		String mappingPath = args[2];
		
		registerEPackages();

		
		Map<EModelElement, EClass> metaMapping = loadMapping(mappingPath);
		
		new VanillaIncrementalExperimentExecutor(metaMapping).warmup(inputModelPath, tggPath);
		
		OUTPUT_ENABLED = true;
		VanillaIncrementalExperimentExecutor executor = new VanillaIncrementalExperimentExecutor(metaMapping);
		executor.execute(inputModelPath, tggPath);
	}
	
	public VanillaIncrementalExperimentExecutor(Map<EModelElement, EClass> metaMapping) {
		this.metaMapping = metaMapping;
		this.inverseMetaMapping = new LinkedHashMap<EClass, EModelElement>();
		for(Entry<EModelElement, EClass> entry:metaMapping.entrySet()) {
			inverseMetaMapping.put(entry.getValue(), entry.getKey());
		}
	}

	@Override
	protected void createIndices(History fullHistory) {
		super.createIndices(fullHistory);
		
		for(TimingUnit t:fullHistory.getOwnedTimingUnits()) {
			DAGVersion v = (DAGVersion) t;
			if(v.getPredecessors().size() > 1) {
				registerPotentialCreations(fullHistory, v);
			}
		}
	}

	
	private void registerPotentialCreations(History fullHistory, DAGVersion v) {
		for(ElementWithHistory element:fullHistory.getOwnedElements()) {
			if(element.getValidIn().contains(v)) {
				if(!potentialCreations.containsKey(v)) {
					potentialCreations.put(v, new LinkedHashSet<ElementWithHistory>());
				}
				potentialCreations.get(v).add(element);
			}
		}
	}

	@Override
	protected void execute(String inputModelPath, String tggPath) {
		try {			
			//create resources
			TransformationExecutor executor = createTransformationExecutor();
			
			History fullHistory = (History) loadInput(inputModelPath);
			List<DAGVersion> topologicalSorting = getTopologicalVersionSorting(fullHistory);
			createIndices(fullHistory);

			Map<DAGVersion, Map<EObject, EObject>> allModels = new LinkedHashMap<DAGVersion, Map<EObject, EObject>>();
			
			//create and transform initial model
			Map<EObject, EObject> originalModel = getReductionToRootVersion(fullHistory, topologicalSorting.get(0));
			allModels.put(topologicalSorting.get(0), originalModel);
			System.gc();

			SdmOperationalTGG tgg = loadTGG(tggPath);
			EcoreUtil.resolveAll(tgg);
			SdmOperationalTGG tggCopy = EcoreUtil.copy(tgg);
			
			StringBuffer syncBuffer = new StringBuffer();
			StringBuffer copyBuffer = new StringBuffer();
			
			long transformationTime = executeTransformation(executor, getModelRoot(originalModel), tggCopy);
			syncBuffer.append("0=" + (transformationTime /1000000) + "\n");
			
			for(int i = 1; i < topologicalSorting.size(); i++) {
				tggCopy = EcoreUtil.copy(tgg);
				
				DAGVersion currentVersion = topologicalSorting.get(i);
				DAGVersion predecessorVersion = topologicalSorting.get(i).getPredecessors().get(0);
				Map<EObject, EObject> predecessorModel = allModels.get(predecessorVersion);
				
				EObject root = getModelRoot(predecessorModel);
				
				Copier modelCopy = new EcoreUtil.Copier();
				long gcStart = getGarbageCollectionTime();
				long startCopy = System.nanoTime();
				
				modelCopy.copy(root);
				
				long endCopy = System.nanoTime();
				long gcEnd = getGarbageCollectionTime();
				long copyTime = (endCopy - startCopy) - ((gcEnd - gcStart) * 1000000);
				
				Map<EObject, EObject> currentModel = getCurrentModel(modelCopy, predecessorModel);
				allModels.put(currentVersion, currentModel);
				executeTransformation(executor, getModelRoot(currentModel), tggCopy);
				
				integrateVersion(currentModel, fullHistory, currentVersion);
				gcStart = getGarbageCollectionTime();
				long synchronizationTime = executeSynchronization(executor);
				gcEnd = getGarbageCollectionTime();
				
				syncBuffer.append(i + "=" + ((synchronizationTime/1000000) - (gcEnd - gcStart)) + "\n");
				copyBuffer.append(i + "=" + copyTime/1000000  + "\n");
				
				//clean up predecessors that are no longer required so gc can pick them up
				for(DAGVersion predecessor:currentVersion.getPredecessors()) {
					if(allModels.keySet().containsAll(predecessor.getSuccessors())) {
						allModels.remove(predecessor);
					}
				}

//				if(i % 25 == 0) {
//					String modelName = inputModelPath.substring(inputModelPath.lastIndexOf("/") + 1, inputModelPath.lastIndexOf("."));
//					saveModel(engine.getLeftInputElements(), "vanilla_incremental_source_" + modelName + "_" + currentVersion.getId() + ".java");
//					saveModel(engine.getRightInputElements(), "vanilla_incremental_target_" + modelName + "_" + currentVersion.getId() + ".classDiagram");
//				}
			}
			
			print("----------TRANSFORMATION----------");
			print(syncBuffer.toString());
			print("----------COPYING----------");
			print(copyBuffer.toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private Map<EObject, EObject> getCurrentModel(Copier modelCopy, Map<EObject, EObject> predecessorModel) {
		Map<EObject, EObject> currentModel = new LinkedHashMap<EObject, EObject>();
		for(Entry<EObject, EObject> entry:predecessorModel.entrySet()) {
			if(entry.getValue() == mappingDummy) {
				currentModel.put(entry.getKey(), mappingDummy);
			}
			else {
				currentModel.put(entry.getKey(), modelCopy.get(entry.getValue()));
			}
		}
		return currentModel;
	}

	private EObject getModelRoot(Map<EObject, EObject> model) {
		for(EObject o:model.values()) {
			if(o instanceof Model && o.eContainer() == null) {
				return o;
			}
		}
		return null;
	}

	private static Map<EModelElement, EClass> loadMapping(String mappingPath) {
		Map<EModelElement, EClass> metaMapping = new LinkedHashMap<EModelElement, EClass>();
		
		MappingRoot mappingRoot = (MappingRoot) loadEObject(mappingPath);
		
		for(Mapping m:mappingRoot.getMappings()) {
			metaMapping.put((EModelElement) m.getSource(), (EClass) m.getTarget());
		}
		
		return metaMapping;
	}

	protected static EObject loadEObject(String path) {
		ResourceSet rs = new ResourceSetImpl();
		Resource r = rs.createResource(URI.createFileURI(path));
		try {
			r.load(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return r.getContents().get(0);
	}


	@Override
	protected long integrateVersion(Map<EObject, EObject> mapping, History fullHistory,
			DAGVersion version) {
		deleteDeletedElements(version, mapping);
		copyCreatedElements(version, mapping);
		return 0;
	}

	private void deleteDeletedElements(DAGVersion version, Map<EObject, EObject> mapping) {
		if(!deletedElements.containsKey(version)) {
			return;
		}
		
		for(ElementWithHistory element:deletedElements.get(version)) {
			if(isAttribute(element.eClass())) {
				deleteAttribute((AttributeWithHistory) element, mapping);
			}
			else if(isEdge(element.eClass())) {
				deleteEdge((EdgeWithHistory) element, mapping);
			}
		}
	}

	private void deleteEdge(EdgeWithHistory element, Map<EObject, EObject> mapping) {
		EObject source = mapping.get(edgeSources.get(element));
		if(source == null) {
			//if the edge is deleted in a merged version, the selected predecessor may not contain the edge or adjacent vertices in the first place
			return;
		}
		
		EObject target = mapping.get(element.eGet(getTargetReference(element.eClass())));
		
		EReference reference = (EReference) inverseMetaMapping.get(element.eClass());
		if(reference.isMany()) {
			((Collection<?>) source.eGet(reference)).remove(target);
		}
		else {
			source.eSet(reference, null);
		}
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void copyEdge(EdgeWithHistory edge, Map<EObject, EObject> mapping) {
		NodeWithHistory edgeSource = (NodeWithHistory) edgeSources.get(edge);
		EObject source = mapping.get(edgeSources.get(edge));
		if(source == null) {
			source = copyNode(edgeSource);
			mapping.put(edgeSource, source);
		}
		
		NodeWithHistory edgeTarget = (NodeWithHistory) edge.eGet(getTargetReference(edge.eClass()));
		EObject target = mapping.get(edgeTarget);
		if(target == null) {
			target = copyNode(edgeTarget);
			mapping.put(edgeTarget, target);
		}
		
		EReference reference = (EReference) inverseMetaMapping.get(edge.eClass());
		if(reference.isMany()) {
			((Collection) source.eGet(reference)).add(target);
		}
		else {
			source.eSet(reference, target);
		}
	}

	private void deleteAttribute(AttributeWithHistory element, Map<EObject, EObject> mapping) {
		EObject owner = mapping.get(attributeOwners.get(element));
		EAttribute valueFeature = getValueAttribute(element.eClass());
		Object value = element.eGet(valueFeature);
		
		EAttribute attribute = (EAttribute) inverseMetaMapping.get(element.eClass());
		if(attribute.isMany()) {
			((Collection<?>) owner.eGet(attribute)).remove(value);
		}
		else {
//			owner.eSet(attribute, null);
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void copyAttribute(AttributeWithHistory element, Map<EObject, EObject> mapping) {
		NodeWithHistory attributeOwner = (NodeWithHistory) attributeOwners.get(element);
		EObject owner = mapping.get(attributeOwner);
		if(owner == null) {
			owner = copyNode(attributeOwner);
			mapping.put(attributeOwner, owner);
		}
		
		EAttribute valueFeature = getValueAttribute(element.eClass());
		Object value = element.eGet(valueFeature);
		
		EAttribute attribute = (EAttribute) inverseMetaMapping.get(element.eClass());
		if(attribute.isMany()) {
			((Collection) owner.eGet(attribute)).add(value);
		}
		else {
			owner.eSet(attribute, value);
		}
	}

	@Override
	protected Map<EObject, EObject> getReductionToRootVersion(History fullHistory, DAGVersion rootVersion) {
		Map<EObject, EObject> mapping = new LinkedHashMap<EObject, EObject>();
		copyCreatedElements(rootVersion, mapping);
		return mapping;
	}

	private void copyCreatedElements(DAGVersion version, Map<EObject, EObject> mapping) {
		//copy nodes
		if(createdElements.containsKey(version)) {
			for(ElementWithHistory element:createdElements.get(version)) {
				if(isNode(element.eClass())) {
					EObject copy = copyNode((NodeWithHistory) element);
					mapping.put(element, copy);
				}
			}
		}
		if(potentialCreations.containsKey(version)) {
			for(ElementWithHistory element:potentialCreations.get(version)) {
				if(isNode(element.eClass()) && !mapping.containsKey(element)) {
					EObject copy = copyNode((NodeWithHistory) element);
					mapping.put(element, copy);
				}
			}
		}
		
		//copy features
		if(createdElements.containsKey(version)) {
			for(ElementWithHistory element:createdElements.get(version)) {
				if(isAttribute(element.eClass())) {
					copyAttribute((AttributeWithHistory) element, mapping);
					mapping.put(element, mappingDummy);
				}
				else if(isEdge(element.eClass())) {
					copyEdge((EdgeWithHistory) element, mapping);
					mapping.put(element, mappingDummy);
				}
			}
		}
		if(potentialCreations.containsKey(version)) {
			for(ElementWithHistory element:potentialCreations.get(version)) {
				if(isAttribute(element.eClass()) && !mapping.containsKey(element)) {
					copyAttribute((AttributeWithHistory) element, mapping);
					mapping.put(element, mappingDummy);
				}
				else if(isEdge(element.eClass()) && !mapping.containsKey(element)) {
					copyEdge((EdgeWithHistory) element, mapping);
					mapping.put(element, mappingDummy);
				}
			}
		}
	}

	private EReference getTargetReference(EClass eClass) {
		for(EReference ref:eClass.getEReferences()) {
			if(ref != HistoryPackage.Literals.EDGE_WITH_HISTORY__EDGE_SOURCE &&
					ref != HistoryPackage.Literals.EDGE_WITH_HISTORY__EDGE_TARGET &&
					isNode(ref.getEType())) {
				return ref;
			}
		}
		return null;
	}

	private EAttribute getValueAttribute(EClass eClass) {
		return (EAttribute) eClass.getEStructuralFeature("value");
	}

	private boolean isNode(EClassifier eType) {
		return eType instanceof EClass && ((EClass)eType).getEAllSuperTypes().contains(HistoryPackage.Literals.NODE_WITH_HISTORY);
	}

	private boolean isEdge(EClassifier eType) {
		return eType instanceof EClass && ((EClass)eType).getEAllSuperTypes().contains(HistoryPackage.Literals.EDGE_WITH_HISTORY);
	}

	private boolean isAttribute(EClassifier eType) {
		return eType instanceof EClass && ((EClass)eType).getEAllSuperTypes().contains(HistoryPackage.Literals.ATTRIBUTE_WITH_HISTORY);
	}

	protected EObject copyNode(NodeWithHistory element) {
		EClass c = (EClass) inverseMetaMapping.get(element.eClass());
		EPackage pkg = c.getEPackage();
		EObject copy = (EObject) pkg.getEFactoryInstance().create(c);
		return copy;
	}

	@Override
	protected TransformationExecutor createTransformationExecutor() {
		return new StandardTransformationExecutor();
	}

	protected void warmup(String inputModelPath, String tggPath) {
		try {
			//create resources
			TransformationExecutor executor = createTransformationExecutor();
			
			History fullHistory = (History) loadInput(inputModelPath);
			List<DAGVersion> topologicalSorting = getTopologicalVersionSorting(fullHistory);
			createIndices(fullHistory);
		
			Map<DAGVersion, Map<EObject, EObject>> allModels = new LinkedHashMap<DAGVersion, Map<EObject, EObject>>();
			
			//create and transform initial model
			Map<EObject, EObject> originalModel = getReductionToRootVersion(fullHistory, topologicalSorting.get(0));
			allModels.put(topologicalSorting.get(0), originalModel);
		
			SdmOperationalTGG tgg = loadTGG(tggPath);
			executeTransformation(executor, getModelRoot(originalModel), tgg);
			
			for(int i = 1; i < topologicalSorting.size() / 4; i++) {
				tgg = loadTGG(tggPath);
				
				DAGVersion currentVersion = topologicalSorting.get(i);
				DAGVersion predecessorVersion = topologicalSorting.get(i).getPredecessors().get(0);
				Map<EObject, EObject> predecessorModel = allModels.get(predecessorVersion);
				
				EObject root = getModelRoot(predecessorModel);
				Copier modelCopy = new EcoreUtil.Copier();
				modelCopy.copy(root);
				
				Map<EObject, EObject> currentModel = getCurrentModel(modelCopy, predecessorModel);
				allModels.put(currentVersion, currentModel);
				executeTransformation(executor, getModelRoot(currentModel), tgg);
				
				integrateVersion(currentModel, fullHistory, currentVersion);
				executeSynchronization(executor);
				
				
				//clean up predecessors that are no longer required so gc can pick them up
				for(DAGVersion predecessor:currentVersion.getPredecessors()) {
					if(allModels.keySet().containsAll(predecessor.getSuccessors())) {
						allModels.remove(predecessor);
					}
				}
				
		//		if(i % 25 == 0) {
		//			saveModel(engine.getLeftInputElements(), "vanilla_incremental_source_" + modelName + "_" + currentVersion.getId() + ".java");
		//			saveModel(engine.getRightInputElements(), "vanilla_incremental_target_" + modelName + "_" + currentVersion.getId() + ".classDiagram");
		//		}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
