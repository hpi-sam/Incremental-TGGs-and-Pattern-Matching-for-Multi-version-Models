package de.mdelab.migmm.sample.java2class.execute;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.mdelab.emf.util.EMFUtil;
import de.mdelab.migmm.history.History;
import de.mdelab.migmm.history.execute.StandardTransformationExecutor;
import de.mdelab.migmm.history.execute.TransformationExecutor;
import de.mdelab.migmm.history.timing.DAGVersion;
import de.mdelab.mlsdm.interpreter.searchModel.MLSDMSearchModelBasedInterpreter;
import de.mdelab.mltgg.mote2.sdm.SdmOperationalTGG;

public class VanillaBatchExperimentExecutor extends BatchExperimentExecutor {

	protected String fileName;
	
	public static void main(String[] args) {
		if(args.length < 5) {
			System.out.println("5 arguments: inputModel, tggPath, versionPortion, fileName, produceXMI");
			return;
		}
		String inputModelPath = args[0];
		String tggPath = args[1];
		double versionPortion = Double.parseDouble(args[2]);
		String fileName = args[3];
		boolean produceXMI = Boolean.parseBoolean(args[4]);
		
		registerEPackages();

		new VanillaBatchExperimentExecutor(fileName, false).warmup(inputModelPath, tggPath);
		
		OUTPUT_ENABLED = true;
		new VanillaBatchExperimentExecutor(fileName, produceXMI).execute(inputModelPath, tggPath, versionPortion);
	}

	private boolean produceXMI;
	
	public VanillaBatchExperimentExecutor(String fileName, boolean produceXMI) {
		this.fileName = fileName;
		this.produceXMI = produceXMI;
	}
	
	@Override
	protected void execute(String inputModelPath, String tggPath, double versionPortion) {
		try {

			SdmOperationalTGG tgg = loadTGG(tggPath);
			EcoreUtil.resolveAll(tgg);
			
			History history = (History) loadInput(inputModelPath);
			String snapshotDir = inputModelPath.substring(0, inputModelPath.lastIndexOf('.'));
			Collection<DAGVersion> versionSubset = getVersionSubset(history, versionPortion);
			System.gc();
			
			long gcStart = getGarbageCollectionTime();
			long time = 0;
			MLSDMSearchModelBasedInterpreter.INDEX_TIME = 0;
			MLSDMSearchModelBasedInterpreter.EXECUTE_TIME = 0;
			
			for(DAGVersion v:versionSubset) {
				EObject model = loadInput(snapshotDir + "/" + fileName + "_" + v.getId() + ".java");
				SdmOperationalTGG tggCopy = EcoreUtil.copy(tgg);
				TransformationExecutor executor = createTransformationExecutor();
				time += executeTransformation(executor, model, tggCopy);
				
				String modelName = inputModelPath.substring(inputModelPath.lastIndexOf("/") + 1, inputModelPath.lastIndexOf("."));
				saveModel(lastEngine.getRightInputElements(), modelName + "_" + v.getId() + ".classDiagram");
				saveModel(lastEngine.getLeftInputElements(), modelName + "_" + v.getId() + ".java");
				saveModel(new ArrayList<EObject>(lastEngine.getTggNodes().keySet()), modelName + "_" + v.getId() + ".java2class");
			}
			
			long gcEnd = getGarbageCollectionTime();
			print("TOTAL TIME=" + ((time/1000000) - (gcEnd - gcStart)));
			print("INDEX TIME=" + (MLSDMSearchModelBasedInterpreter.INDEX_TIME/1000000));
			print("EXECUTE TIME=" + (MLSDMSearchModelBasedInterpreter.EXECUTE_TIME/1000000));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void saveModel(Collection<EObject> model, String string) {
		if(OUTPUT_ENABLED) {
			if(produceXMI) {
				EMFUtil.writeXMI(model, string);
			}
			else {
				EMFUtil.writeMDELabModel(model, string);
			}
		}
	}

	@Override
	protected TransformationExecutor createTransformationExecutor() {
		return new StandardTransformationExecutor();
	}

	protected EObject loadEObject(String path) {
		return EMFUtil.loadXmi(path);
	}
	
	private static long getGarbageCollectionTime() {
	    long collectionTime = 0;
	    for (GarbageCollectorMXBean garbageCollectorMXBean : ManagementFactory.getGarbageCollectorMXBeans()) {
	        collectionTime += garbageCollectorMXBean.getCollectionTime();
	    }
	    return collectionTime;
	}
}
