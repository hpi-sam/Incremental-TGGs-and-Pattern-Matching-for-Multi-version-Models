package de.mdelab.migmm.sample.java2class.execute;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import de.mdelab.migmm.history.AttributeWithHistory;
import de.mdelab.migmm.history.EdgeWithHistory;
import de.mdelab.migmm.history.ElementWithHistory;
import de.mdelab.migmm.history.History;
import de.mdelab.migmm.history.HistoryFactory;
import de.mdelab.migmm.history.HistoryPackage;
import de.mdelab.migmm.history.NodeWithHistory;
import de.mdelab.migmm.history.execute.HistoryIntegratedExecutor;
import de.mdelab.migmm.history.execute.TransformationExecutor;
import de.mdelab.migmm.history.projection.HistoryProjector;
import de.mdelab.migmm.history.timing.DAGInterval;
import de.mdelab.migmm.history.timing.DAGVersion;
import de.mdelab.migmm.history.timing.TimingFactory;
import de.mdelab.migmm.history.timing.impl.DAGIntervalImpl;
import de.mdelab.mltgg.mote2.sdm.SdmOperationalTGG;

public class HistoryIncrementalExperimentExecutor extends IncrementalExperimentExecutor{

	public static void main(String[] args) {
		if(args.length < 3) {
			System.out.println("2 arguments: inputModel, tggPath, optimizeIntersection");
			return;
		}
		String inputModelPath = args[0];
		String tggPath = args[1];
		boolean optimizeIntersection = Boolean.parseBoolean(args[2]);

		DAGIntervalImpl.OPTIMIZE_INTERSECTION = optimizeIntersection;
		
		registerEPackages();

		new HistoryIncrementalExperimentExecutor().warmup(inputModelPath, tggPath);
		
		OUTPUT_ENABLED = true;
		new HistoryIncrementalExperimentExecutor().execute(inputModelPath, tggPath);
	}
	
	@Override
	public void execute(String inputModelPath, String tggPath) {
		DAGIntervalImpl.INTERSECT_TIME = 0;
		DAGIntervalImpl.MINUS_TIME = 0;
		DAGIntervalImpl.COMPLEMENT_TIME = 0;
		DAGIntervalImpl.UNION_TIME = 0;
		DAGIntervalImpl.OPTIMIZED_INTERSECTS = 0;
		DAGIntervalImpl.UNOPTIMIZED_INTERSECTS = 0;
		super.execute(inputModelPath, tggPath);
		String modelName = inputModelPath.substring(inputModelPath.lastIndexOf("/") + 1, inputModelPath.lastIndexOf("."));
		System.out.println("INTERSECT TIME=" + DAGIntervalImpl.INTERSECT_TIME / 1000000);
		System.out.println("MINUS TIME=" + DAGIntervalImpl.MINUS_TIME / 1000000);
		System.out.println("COMPLEMENT TIME=" + DAGIntervalImpl.COMPLEMENT_TIME / 1000000);
		System.out.println("UNION TIME=" + DAGIntervalImpl.UNION_TIME / 1000000);
		System.out.println("OPTIMIZED INTERSECTS=" + DAGIntervalImpl.OPTIMIZED_INTERSECTS);
		System.out.println("UNOPTIMIZED INTERSECTS=" + DAGIntervalImpl.UNOPTIMIZED_INTERSECTS);
		if(OUTPUT_ENABLED) {
			saveModel(engine.getLeftInputElements(), "history_incremental_source_" + modelName + ".history");
			saveModel(engine.getRightInputElements(), "history_incremental_target_" + modelName + ".history");
		}
	}
	
	@Override
	protected long integrateVersion(Map<EObject, EObject> mapping, History fullHistory,
			DAGVersion version) {
		History reducedHistory = (History) mapping.get(fullHistory);
		
		long startDag = System.nanoTime();
		long startGC = getGarbageCollectionTime();
		DAGVersion versionCopy = copyVersion(version, mapping);
		long endGC = getGarbageCollectionTime();
		long endDag = System.nanoTime();
		
		mapping.put(version, versionCopy);
		reducedHistory.getOwnedTimingUnits().add(versionCopy);
		
		copyCreatedElements(version, versionCopy, reducedHistory, mapping);
		deleteDeletedElements(version, versionCopy, mapping);
		
		return ((endDag - startDag) / 1000000) - (endGC - startGC);
	}

	private void deleteDeletedElements(DAGVersion originalVersion, DAGVersion versionCopy, Map<EObject, EObject> mapping) {
		if(!deletedElements.containsKey(originalVersion)) {
			return;
		}
		
		for(ElementWithHistory element:deletedElements.get(originalVersion)) {
			ElementWithHistory mappedElement = (ElementWithHistory) mapping.get(element);
			((DAGInterval) mappedElement.getValidIn()).getDts().add(versionCopy);
		}
	}

	@Override
	protected Map<EObject, EObject> getReductionToRootVersion(History fullHistory, DAGVersion rootVersion) {
		Map<EObject, EObject> mapping = new LinkedHashMap<EObject, EObject>();
		
		History reducedHistory = HistoryFactory.eINSTANCE.createHistory();
		mapping.put(fullHistory, reducedHistory);
		
		DAGVersion versionCopy = copyVersion(rootVersion, mapping);
		mapping.put(rootVersion, versionCopy);
		reducedHistory.getOwnedTimingUnits().add(versionCopy);
		
		DAGInterval historyValidity = TimingFactory.eINSTANCE.createDAGInterval();
		historyValidity.getCts().add(versionCopy);
		historyValidity.setRecreating(((DAGInterval) fullHistory.getValidIn()).isRecreating());
		reducedHistory.setValidIn(historyValidity);
		
		copyCreatedElements(rootVersion, versionCopy, reducedHistory, mapping);
		return mapping;
	}

	private void copyCreatedElements(DAGVersion originalVersion, DAGVersion versionCopy, History targetHistory, Map<EObject, EObject> mapping) {
		if(!createdElements.containsKey(originalVersion)) {
			return;
		}
		
		//copy nodes
		for(ElementWithHistory element:createdElements.get(originalVersion)) {
			if(isNode(element.eClass())) {
				NodeWithHistory copy = copyNode((NodeWithHistory) element, versionCopy, targetHistory);
				mapping.put(element, copy);
			}
		}
		//copy features
		for(ElementWithHistory element:createdElements.get(originalVersion)) {
			if(isAttribute(element.eClass())) {
				AttributeWithHistory attributeCopy = copyAttribute((AttributeWithHistory) element,
						versionCopy, targetHistory, mapping);
				mapping.put(element, attributeCopy);
			}
			else if(isEdge(element.eClass())) {
				EdgeWithHistory edgeCopy = copyEdge((EdgeWithHistory) element,
						versionCopy, targetHistory, mapping);
				mapping.put(element, edgeCopy);
			}
		}
	}

	private EReference getContainingRef(ElementWithHistory element) {
		if(isAttribute(element.eClass())) {
			return getMatchingRef(attributeOwners.get(element).eClass(), element.eClass());
		}
		else if(isEdge(element.eClass())) {
			return getMatchingRef(edgeSources.get(element).eClass(), element.eClass());
		}
		return null;
	}

	private EReference getMatchingRef(EClass eClass, EClass eClass2) {
		for(EReference ref:eClass.getEAllReferences()) {
			if(ref.getEType() == eClass2) {
				return ref;
			}
		}
		return null;
	}

	private EdgeWithHistory copyEdge(EdgeWithHistory edge, DAGVersion version, History history, Map<EObject, EObject> mapping) {
		EObject source = edgeSources.get(edge);
		
		EPackage pkg = edge.eClass().getEPackage();
		EdgeWithHistory edgeCopy = (EdgeWithHistory) pkg.getEFactoryInstance().create(edge.eClass());
		DAGInterval validIn = TimingFactory.eINSTANCE.createDAGInterval();
		validIn.setRecreating(((DAGInterval) edge.getValidIn()).isRecreating());
		edgeCopy.setValidIn(validIn);
		((DAGInterval) edgeCopy.getValidIn()).getCts().add(version);
		
		history.getOwnedElements().add(edgeCopy);

		EReference ref = getContainingRef(edge);
		
		//set source
		createReference(mapping.get(source), ref, edgeCopy);
		createReference(edgeCopy, HistoryPackage.Literals.EDGE_WITH_HISTORY__EDGE_SOURCE, mapping.get(source));
		
		//set target
		EReference targetRef = getTargetReference((EClass) edge.eClass());
		EObject target = (EObject) edge.eGet(targetRef);
		createReference(edgeCopy, targetRef, mapping.get(target));
		createReference(edgeCopy, HistoryPackage.Literals.EDGE_WITH_HISTORY__EDGE_TARGET, mapping.get(target));
		return edgeCopy;
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

	private AttributeWithHistory copyAttribute(AttributeWithHistory attribute, DAGVersion version, History history, Map<EObject, EObject> mapping) {
		EObject owner = attributeOwners.get(attribute);
		
		EPackage pkg = attribute.eClass().getEPackage();
		AttributeWithHistory attributeCopy = (AttributeWithHistory) pkg.getEFactoryInstance().create(attribute.eClass());
		DAGInterval validIn = TimingFactory.eINSTANCE.createDAGInterval();
		validIn.setRecreating(((DAGInterval) attribute.getValidIn()).isRecreating());
		attributeCopy.setValidIn(validIn);
		
		EAttribute valueAttribute = getValueAttribute(attribute.eClass());
		attributeCopy.eSet(valueAttribute, attribute.eGet(valueAttribute));

		EReference ref = getContainingRef(attribute);
		((DAGInterval) attributeCopy.getValidIn()).getCts().add(version);
		createReference(mapping.get(owner), ref, attributeCopy);
		history.getOwnedElements().add(attributeCopy);
		return attributeCopy;
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

	protected NodeWithHistory copyNode(NodeWithHistory element, DAGVersion versionCopy, History targetHistory) {
		EPackage pkg = element.eClass().getEPackage();
		NodeWithHistory copy = (NodeWithHistory) pkg.getEFactoryInstance().create(element.eClass());
		DAGInterval validIn = TimingFactory.eINSTANCE.createDAGInterval();
		validIn.setRecreating(((DAGInterval) element.getValidIn()).isRecreating());
		copy.setValidIn(validIn);

		((DAGInterval) copy.getValidIn()).getCts().add(versionCopy);
		targetHistory.getOwnedElements().add(copy);
		return copy;
	}

	private DAGVersion copyVersion(DAGVersion version, Map<EObject, EObject> mapping) {
		DAGVersion copy = TimingFactory.eINSTANCE.createDAGVersion();
		copy.setId(version.getId());
		for(DAGVersion predecessor:version.getPredecessors()) {
			copy.getPredecessors().add((DAGVersion) mapping.get(predecessor));
		}
		return copy;
	}

	@Override
	protected TransformationExecutor createTransformationExecutor() {
		return new HistoryIntegratedExecutor();
	}

	protected void warmup(String inputModelPath, String tggPath) {try {
		//create resources
		SdmOperationalTGG tgg = loadTGG(tggPath);
		TransformationExecutor executor = createTransformationExecutor();
		
		History fullHistory = (History) loadInput(inputModelPath);
		List<DAGVersion> topologicalSorting = getTopologicalVersionSorting(fullHistory);
		createIndices(fullHistory);

		//create and transform initial model
		Map<EObject, EObject> currentModel = getReductionToRootVersion(fullHistory, topologicalSorting.get(0));
		History partialHistory = (History) currentModel.get(fullHistory);
		HistoryProjector projector = new HistoryProjector();
		projector.setUnhandled(partialHistory);
		executeTransformation(executor, partialHistory, tgg);
		
		for(int i = 1; i < topologicalSorting.size() / 2; i++) {
			DAGVersion currentVersion = topologicalSorting.get(i);
			integrateVersion(currentModel, fullHistory, currentVersion);
			executeSynchronization(executor);
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
