package de.mdelab.migmm.sample.java2class.execute;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.modisco.java.emf.JavaPackage;

import de.hpi.sam.classDiagram.ClassDiagramPackage;
import de.hpi.sam.classDiagram_adapted.ClassDiagram_adaptedPackage;
import de.mdelab.emf.util.EMFUtil;
import de.mdelab.migmm.history.History;
import de.mdelab.migmm.history.HistoryPackage;
import de.mdelab.migmm.history.TimingUnit;
import de.mdelab.migmm.history.execute.TransformationExecutor;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.tggh.mote2history.Mote2historyPackage;
import de.mdelab.migmm.history.timing.DAGVersion;
import de.mdelab.migmm.history.timing.TimingPackage;
import de.mdelab.migmm.java2class_adapted.Java2class_adaptedPackage;
import de.mdelab.mltgg.java2class.java2class.Java2classPackage;
import de.mdelab.mltgg.mote2.TransformationDirectionEnum;
import de.mdelab.mltgg.mote2.impl.MoTE2;
import de.mdelab.mltgg.mote2.sdm.SdmOperationalTGG;

public abstract class BatchExperimentExecutor {

	protected static boolean OUTPUT_ENABLED = false;
	
	protected MoTE2 lastEngine;
	
	protected static void print(String s) {
		if(OUTPUT_ENABLED) {
			System.out.println(s);
		}
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

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("history", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("mlsdm", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("mlsp", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
	}

	protected abstract void execute(String inputModelPath, String tggPath, double versionPortion);

	protected void saveModel(Collection<EObject> model, String string) {
		if(OUTPUT_ENABLED) {
			EMFUtil.writeMDELabModel(model, string);
		}
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

	protected Collection<DAGVersion> getVersionSubset(History h, double versionPortion) throws Exception {
		DAGVersion root = findRootVersion(h.getOwnedTimingUnits());
		Set<DAGVersion> visited = new LinkedHashSet<DAGVersion>();
		Queue<DAGVersion> queue = new LinkedList<DAGVersion>();
		queue.add(root);
		while(!queue.isEmpty() && visited.size() < versionPortion * h.getOwnedTimingUnits().size()) {
			DAGVersion current = queue.poll();
			if(visited.contains(current)) {
				continue;
			}
			else {
				visited.add(current);
				for(DAGVersion successor:current.getSuccessors()) {
					queue.add(successor);
				}
			}
		}
		if(visited.size() < versionPortion * h.getOwnedTimingUnits().size()) {
			throw new Exception("unable to find enough versions");
		}
		return visited;
	}

	protected DAGVersion findRootVersion(EList<TimingUnit> timingUnits) {
		for(TimingUnit t:timingUnits) {
			if((t instanceof DAGVersion) && ((DAGVersion) t).getPredecessors().isEmpty()) {
				return (DAGVersion) t;
			}
		}
		return null;
	}

	protected EObject loadInput(String inputModelPath) {
		return EMFUtil.loadMDELabModel(inputModelPath).getContents().get(0);
	}

	protected abstract TransformationExecutor createTransformationExecutor();

	protected long executeTransformation(TransformationExecutor executor, EObject model, SdmOperationalTGG tgg) {
		long time = executor.executeTransformation(Collections.singleton(model), TransformationDirectionEnum.FORWARD, tgg);
		lastEngine = executor.lastEngine;
		return time;
	}

	protected void warmup(String inputModelPath, String tggPath) {
		execute(inputModelPath, tggPath, 0.25);
	}

}
