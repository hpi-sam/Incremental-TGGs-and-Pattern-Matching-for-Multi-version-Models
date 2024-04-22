package de.mdelab.migmm.sample.java2class.execute;

import java.io.IOException;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import de.mdelab.emf.util.EMFUtil;

public class HistoryMemoryMeasurer extends HistoryBatchExperimentExecutor{

	public static void main(String[] args) {
		if(args.length < 4) {
			System.out.println("4 argument: sourceModelFile, targetModelFile, corrModelFile, isXMI");
			return;
		}
		String sourceModelFile = args[0];
		String targetModelFile = args[1];
		String corrModelFile = args[2];
		boolean isXMI = Boolean.parseBoolean(args[3]);
		
		registerEPackages();
		
		HistoryMemoryMeasurer memoryMeasurer = new HistoryMemoryMeasurer(isXMI);
		memoryMeasurer.execute(sourceModelFile, targetModelFile, corrModelFile, null, -1);
	}
	
	private boolean isXMI;
	private ResourceSet rs;
	
	public HistoryMemoryMeasurer(boolean isXMI) {
		super(isXMI);
		this.isXMI = isXMI;
		this.rs = new ResourceSetImpl();
	}

	protected void execute(String sourceModelFile, String targetModelFile, String corrModelFile, String tggPath, double versionPortion) {
		try {
			long previousMemory = getMemory();
			List<EObject> corrHistory;
			List<EObject> sourceHistory;
			List<EObject> targetHistory;
			if(isXMI) {
				sourceHistory = (List<EObject>) loadXmi(sourceModelFile);
				targetHistory = (List<EObject>) loadXmi(targetModelFile);
				corrHistory = (List<EObject>) loadXmi(corrModelFile);
			}
			else {
				sourceHistory = (List<EObject>) EMFUtil.loadMDELabModel(sourceModelFile).getContents();
				targetHistory = (List<EObject>) EMFUtil.loadMDELabModel(targetModelFile).getContents();
				corrHistory = (List<EObject>) EMFUtil.loadMDELabModel(corrModelFile).getContents();
			}
			long currentMemory = getMemory();
			System.out.println("MEMORY CONSUMPTION=" + (currentMemory - previousMemory));
			sourceHistory.get(0);
			targetHistory.get(0);
			corrHistory.get(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static long getMemory() {
		System.gc();
		Runtime r = Runtime.getRuntime();
		return r.totalMemory() - r.freeMemory();
	}
	
	private List<EObject> loadXmi(String modelFile) {
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put(modelFile.substring(modelFile.lastIndexOf('.') + 1), new XMIResourceFactoryImpl());
		
		Resource r = rs.createResource(URI.createFileURI(modelFile));
		try {
			r.load(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		for(EObject element:r.getContents()) {
			EcoreUtil.resolveAll(element);
		}
		return r.getContents();
	}
}
