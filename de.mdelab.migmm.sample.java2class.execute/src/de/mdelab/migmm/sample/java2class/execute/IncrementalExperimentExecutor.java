package de.mdelab.migmm.sample.java2class.execute;

import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.modisco.java.emf.JavaPackage;

import de.hpi.sam.classDiagram.ClassDiagramPackage;
import de.hpi.sam.classDiagram_adapted.ClassDiagram_adaptedPackage;
import de.mdelab.emf.util.EMFUtil;
import de.mdelab.migmm.history.AttributeWithHistory;
import de.mdelab.migmm.history.EdgeWithHistory;
import de.mdelab.migmm.history.ElementWithHistory;
import de.mdelab.migmm.history.History;
import de.mdelab.migmm.history.HistoryPackage;
import de.mdelab.migmm.history.TimingUnit;
import de.mdelab.migmm.history.execute.TransformationExecutor;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.projection.HistoryProjector;
import de.mdelab.migmm.history.tggh.mote2history.Mote2historyPackage;
import de.mdelab.migmm.history.timing.DAGInterval;
import de.mdelab.migmm.history.timing.DAGVersion;
import de.mdelab.migmm.history.timing.TimingPackage;
import de.mdelab.migmm.history.timing.dag.DAGAdapter;
import de.mdelab.migmm.java2class_adapted.Java2class_adaptedPackage;
import de.mdelab.mltgg.java2class.java2class.Java2classPackage;
import de.mdelab.mltgg.mote2.TransformationDirectionEnum;
import de.mdelab.mltgg.mote2.sdm.MoTE2Sdm;
import de.mdelab.mltgg.mote2.sdm.SdmOperationalTGG;
import mapping.MappingPackage;

public abstract class IncrementalExperimentExecutor {

	public static boolean OUTPUT_ENABLED = false;

	protected MoTE2Sdm engine;
	
	protected Map<AttributeWithHistory, EObject> attributeOwners = new LinkedHashMap<AttributeWithHistory, EObject>();
	protected Map<EdgeWithHistory, EObject> edgeSources = new LinkedHashMap<EdgeWithHistory, EObject>();
	
	protected Map<DAGVersion, Collection<ElementWithHistory>> createdElements = new LinkedHashMap<DAGVersion, Collection<ElementWithHistory>>();
	protected Map<DAGVersion, Collection<ElementWithHistory>> deletedElements = new LinkedHashMap<DAGVersion, Collection<ElementWithHistory>>();
	
	protected void print(String s) {
		if(OUTPUT_ENABLED) {
			System.out.println(s);
		}
	}

	protected static long getGarbageCollectionTime() {
	    long collectionTime = 0;
	    for (GarbageCollectorMXBean garbageCollectorMXBean : ManagementFactory.getGarbageCollectorMXBeans()) {
	        collectionTime += garbageCollectorMXBean.getCollectionTime();
	    }
	    return collectionTime;
	}
	
	protected static void registerEPackages() {
		JavaPackage.eINSTANCE.getName();
		Java2classPackage.eINSTANCE.getName();
		ClassDiagramPackage.eINSTANCE.getName();
		
		HistoryPackage.eINSTANCE.getName();
		TimingPackage.eINSTANCE.getName();
		Java_adaptedPackage.eINSTANCE.getName();
		Java2class_adaptedPackage.eINSTANCE.getName();
		ClassDiagram_adaptedPackage.eINSTANCE.getName();
		Mote2historyPackage.eINSTANCE.getName();
		
		MappingPackage.eINSTANCE.getName();

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("history", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("mlsdm", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("mlsp", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("mapping", new XMIResourceFactoryImpl());
	}

	protected void execute(String inputModelPath, String tggPath) {
		try {
			//create resources
			SdmOperationalTGG tgg = loadTGG(tggPath);
			EcoreUtil.resolveAll(tgg);
			TransformationExecutor executor = createTransformationExecutor();
			
			History fullHistory = (History) loadInput(inputModelPath);
			List<DAGVersion> topologicalSorting = getTopologicalVersionSorting(fullHistory);
			createIndices(fullHistory);

			//create and transform initial model
			Map<EObject, EObject> currentModel = getReductionToRootVersion(fullHistory, topologicalSorting.get(0));
			History partialHistory = (History) currentModel.get(fullHistory);
			
			DAGAdapter dagAdapter = new DAGAdapter();
			for(TimingUnit t:partialHistory.getOwnedTimingUnits()) {
				dagAdapter.addAdapter((DAGVersion) t);
			}
			dagAdapter.recomputeIndices();
			
			HistoryProjector projector = new HistoryProjector();
			projector.setUnhandled(partialHistory);
			System.gc();
			long gcStart = getGarbageCollectionTime();
			long transformationTime = executeTransformation(executor, partialHistory, tgg);
			long gcEnd = getGarbageCollectionTime();
			print("0=" + ((transformationTime/1000000) - (gcEnd - gcStart)));
			
			for(int i = 1; i < topologicalSorting.size(); i++) {
				DAGVersion currentVersion = topologicalSorting.get(i);
				long adapterTime = integrateVersion(currentModel, fullHistory, currentVersion);
				long synchronizationTime = executeSynchronization(executor);
				print(i + "=" + ((synchronizationTime/1000000) + adapterTime));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void saveModel(Collection<EObject> model, String string) {
		if(OUTPUT_ENABLED) {
			EMFUtil.writeXMI(model, string);
		}
	}

	protected abstract Map<EObject, EObject> getReductionToRootVersion(History fullHistory, DAGVersion rootVersion);

	protected void createIndices(History fullHistory) {
		for(ElementWithHistory element:fullHistory.getOwnedElements()) {
			DAGInterval validIn = (DAGInterval) element.getValidIn();

			for(DAGVersion cts:validIn.getCts()) {
				if(!createdElements.containsKey(cts)) {
					createdElements.put(cts, new LinkedHashSet<ElementWithHistory>());
				}
				createdElements.get(cts).add(element);
			}
			
			for(DAGVersion dts:validIn.getDts()) {
				if(!deletedElements.containsKey(dts)) {
					deletedElements.put(dts, new LinkedHashSet<ElementWithHistory>());
				}
				deletedElements.get(dts).add(element);
			}
			
			if(isNode(element.eClass())) {
				for(EReference ref:element.eClass().getEAllReferences()) {
					if(isAttribute(ref.getEType())) {
						for(EObject attribute:getReferenceTargets(element, ref)) {
							attributeOwners.put((AttributeWithHistory) attribute, element);
						}
					}
					else if(isEdge(ref.getEType())) {
						for(EObject edge:getReferenceTargets(element, ref)) {
							edgeSources.put((EdgeWithHistory) edge, element);
						}
					}
				}
			}
		}
	}

	protected long executeTransformation(TransformationExecutor executor, EObject model, SdmOperationalTGG tgg) {
		long time = executor.executeTransformation(Collections.singleton(model), TransformationDirectionEnum.FORWARD, tgg);
		engine = executor.lastEngine;
		return time;
	}

	protected long executeSynchronization(TransformationExecutor executor) {
		long time = executor.executeSynchronization(engine, TransformationDirectionEnum.FORWARD);
		return time;
	}

	protected abstract long integrateVersion(Map<EObject, EObject> mapping, History fullHistory,
			DAGVersion version);

	@SuppressWarnings("unchecked")
	protected void createReference(EObject source, EReference ref, EObject target) {
		if(ref.isMany()) {
			((Collection<EObject>) source.eGet(ref)).add(target);
		}
		else {
			source.eSet(ref, target);
		}
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

	protected List<DAGVersion> getTopologicalVersionSorting(History fullHistory) throws Exception {
		Map<DAGVersion, Integer> predecessors = new LinkedHashMap<DAGVersion, Integer>();
		Queue<DAGVersion> removableVersions = new LinkedList<DAGVersion>();
		for(TimingUnit t:fullHistory.getOwnedTimingUnits()) {
			DAGVersion v = (DAGVersion) t;
			predecessors.put(v, v.getPredecessors().size());
			if(v.getPredecessors().size() == 0) {
				removableVersions.add(v);
			}
		}
		List<DAGVersion> ordering = new ArrayList<DAGVersion>();
		while(!removableVersions.isEmpty()) {
			DAGVersion v = removableVersions.poll();
			ordering.add(v);
			
			for(DAGVersion successor:v.getSuccessors()) {
				int newPredecessors = predecessors.get(successor) - 1;
				predecessors.put(successor, newPredecessors);
				if(newPredecessors == 0) {
					removableVersions.add(successor);
				}
			}
		}
		
		if(ordering.size() != fullHistory.getOwnedTimingUnits().size()) {
			throw new Exception("invalid topological ordering");
		}
		
		return ordering;
	}

	protected SdmOperationalTGG loadTGG(String tggPath) {
		ResourceSet rs = new ResourceSetImpl();
		Resource r = rs.createResource(URI.createFileURI(tggPath));
		try {
			r.load(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return (SdmOperationalTGG) r.getContents().get(0);
	}

	protected EObject loadInput(String inputModelPath) {
		return EMFUtil.loadMDELabModel(inputModelPath).getContents().get(0);
	}

	protected abstract TransformationExecutor createTransformationExecutor();

	protected abstract void warmup(String inputModelPath, String tggPath);
	
	@SuppressWarnings("unchecked")
	protected Collection<EObject> getReferenceTargets(EObject source, EReference ref) {
		if(ref.isMany()) {
			return (Collection<EObject>) source.eGet(ref);
		}
		else {
			return Collections.singleton((EObject) source.eGet(ref));
		}
	}

}
