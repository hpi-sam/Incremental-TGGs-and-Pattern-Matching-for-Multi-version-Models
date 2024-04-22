package de.mdelab.migmm.sample.java2class.execute;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import de.mdelab.migmm.history.History;
import de.mdelab.migmm.history.timing.DAGVersion;

public class VanillaMemoryMeasurer extends VanillaBatchExperimentExecutor {

	public static void main(String[] args) {
		if(args.length < 3) {
			System.out.println("3 arguments: modelFile, versionPortion, isXMI");
			return;
		}
		String modelFile = args[0];
		double versionPortion = Double.parseDouble(args[1]);
		boolean isXMI = Boolean.parseBoolean(args[2]);
		
		registerEPackages();
		
		VanillaMemoryMeasurer memoryMeasurer = new VanillaMemoryMeasurer(null, isXMI);
		memoryMeasurer.execute(modelFile, null, versionPortion);
	}

	private boolean isXMI;
	private ResourceSet rs;
	
	public VanillaMemoryMeasurer(String fileName, boolean isXMI) {
		super(fileName, isXMI);
		this.isXMI = isXMI;
		this.rs = new ResourceSetImpl();
	}

	@Override
	protected void execute(String inputModelPath, String tggPath, double versionPortion) {
		try {
			String modelName = inputModelPath.substring(inputModelPath.lastIndexOf("/") + 1, inputModelPath.lastIndexOf("."));
			
			History history = (History) loadInput(inputModelPath);
			Collection<DAGVersion> versionSubset = getVersionSubset(history, versionPortion);
			List<List<EObject>> models = new ArrayList<List<EObject>>();
			
			long previousMemory = getMemory();
			for(DAGVersion v:versionSubset) {
				String sourceFile = inputModelPath.substring(inputModelPath.lastIndexOf("/") + 1, inputModelPath.lastIndexOf(".")) + "/" + modelName + "_" + v.getId() + ".java";
				String targetFile = inputModelPath.substring(inputModelPath.lastIndexOf("/") + 1, inputModelPath.lastIndexOf(".")) + "/" + modelName + "_" + v.getId() + ".classDiagram";
				String corrFile = inputModelPath.substring(inputModelPath.lastIndexOf("/") + 1, inputModelPath.lastIndexOf(".")) + "/" + modelName + "_" + v.getId() + ".java2class";
				List<EObject> sourceModel;
				List<EObject> targetModel;
				List<EObject> corrModel;
				if(isXMI) {
					sourceModel = loadXmi(sourceFile);
					targetModel = loadXmi(targetFile);
					corrModel = loadXmi(corrFile);
				}
				else {
					sourceModel = Collections.singletonList(loadInput(sourceFile));
					targetModel = Collections.singletonList(loadInput(targetFile));
					corrModel = Collections.singletonList(loadInput(corrFile));
				}
				models.add(sourceModel);
				models.add(targetModel);
				models.add(corrModel);
			}
			long currentMemory = getMemory();
			System.out.println("MEMORY CONSUMPTION=" + (currentMemory - previousMemory));
			models.get(0);
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
