package de.mdelab.migmm.sample.java2class.execute;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.mdelab.emf.util.EMFUtil;
import de.mdelab.migmm.history.ElementWithHistory;
import de.mdelab.migmm.history.History;
import de.mdelab.migmm.history.TimingUnit;
import de.mdelab.migmm.history.execute.HistoryIntegratedExecutor;
import de.mdelab.migmm.history.execute.TransformationExecutor;
import de.mdelab.migmm.history.timing.DAGInterval;
import de.mdelab.migmm.history.timing.DAGVersion;
import de.mdelab.migmm.history.timing.dag.DAGAdapter;
import de.mdelab.migmm.history.timing.impl.DAGIntervalImpl;
import de.mdelab.mlsdm.interpreter.searchModel.MLSDMSearchModelBasedInterpreter;
import de.mdelab.mlsdm.interpreter.searchModel.patternMatcher.MLSDMReferenceIndex;
import de.mdelab.mltgg.mote2.sdm.SdmOperationalTGG;

public class HistoryBatchExperimentExecutor extends BatchExperimentExecutor {

	public static void main(String[] args) {
		if(args.length < 5) {
			System.out.println("5 arguments: inputModel, tggPath, versionPortion, produceXMI, optimizeIntersection");
			return;
		}
		String inputModelPath = args[0];
		String tggPath = args[1];
		double versionPortion = Double.parseDouble(args[2]);
		boolean produceXMI = Boolean.parseBoolean(args[3]);
		boolean optimizeIntersection = Boolean.parseBoolean(args[4]);

		DAGIntervalImpl.OPTIMIZE_INTERSECTION = optimizeIntersection;
		
		registerEPackages();
		
		new HistoryBatchExperimentExecutor(produceXMI).warmup(inputModelPath, tggPath);
		
		OUTPUT_ENABLED = true;
		new HistoryBatchExperimentExecutor(produceXMI).execute(inputModelPath, tggPath, versionPortion);
	}
	
	private boolean produceXMI;
	
	public HistoryBatchExperimentExecutor(boolean produceXMI) {
		this.produceXMI = produceXMI;
	}

	@Override
	protected void execute(String inputModelPath, String tggPath, double versionPortion) {
		try {
			SdmOperationalTGG tgg = loadTGG(tggPath);
			EcoreUtil.resolveAll(tgg);
			
			History subsetHistory = getSubsetHistory((History) loadInput(inputModelPath), versionPortion);
			
			DAGAdapter dagAdapter = new DAGAdapter();
			for(TimingUnit t:subsetHistory.getOwnedTimingUnits()) {
				dagAdapter.addAdapter((DAGVersion) t);
			}
			dagAdapter.recomputeIndices();
			
			TransformationExecutor executor = createTransformationExecutor();
			System.gc();
			
			MLSDMSearchModelBasedInterpreter.INDEX_TIME = 0;
			MLSDMSearchModelBasedInterpreter.EXECUTE_TIME = 0;
			DAGIntervalImpl.OPTIMIZED_INTERSECTS = 0;
			DAGIntervalImpl.UNOPTIMIZED_INTERSECTS = 0;
			
			long time = executeTransformation(executor, subsetHistory, tgg);
			
			print("TOTAL TIME=" + time/1000000);
			print("INDEX TIME=" + (MLSDMSearchModelBasedInterpreter.INDEX_TIME/1000000));
			print("EXECUTE TIME=" + (MLSDMSearchModelBasedInterpreter.EXECUTE_TIME/1000000));
			print("OPTIMIZED INTERSECTS=" + DAGIntervalImpl.OPTIMIZED_INTERSECTS);
			print("UNOPTIMIZED INTERSECTS=" + DAGIntervalImpl.UNOPTIMIZED_INTERSECTS);
			
			String modelName = inputModelPath.substring(inputModelPath.lastIndexOf("/") + 1, inputModelPath.lastIndexOf("."));
			saveModel(lastEngine.getLeftInputElements(), "history_batch_source_" + modelName + "_" + versionPortion +".history");
			saveModel(lastEngine.getRightInputElements(), "history_batch_target_" + modelName + "_" + versionPortion +".history");
			saveModel(new ArrayList<EObject>(lastEngine.getTggNodes().keySet()), "history_batch_corr_" + modelName + "_" + versionPortion +".history");
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

	protected History getSubsetHistory(History h, double versionPortion) throws Exception {
		long start = System.nanoTime();
		History subsetHistory = EcoreUtil.copy(h);
		long end = System.nanoTime();
		print("copying history took " + ((end - start) / 1000000) + "ms");
		
		Collection<DAGVersion> versionSubset = getVersionSubset(subsetHistory, versionPortion);

		start = System.nanoTime();
		MLSDMReferenceIndex referenceIndex = new MLSDMReferenceIndex();
		referenceIndex.registerEObject(subsetHistory);
		end = System.nanoTime();
		print("creating index took " + ((end - start) / 1000000) + "ms");
		print("index contains " + referenceIndex.getRegisteredObjects().size() + " elements");

		start = System.nanoTime();
		for(int i = subsetHistory.getOwnedElements().size() - 1; i >= 0 ; i--) {
			ElementWithHistory e = subsetHistory.getOwnedElements().get(i);
			boolean inSubset = false;
			for(DAGVersion cts:((DAGInterval) e.getValidIn()).getCts()) {
				if(versionSubset.contains(cts)) {
					inSubset = true;
					break;
				}
			}
			
			if(!inSubset) {
				for(Entry<EReference, Set<EObject>> entry:new ArrayList<Entry<EReference, Set<EObject>>>(referenceIndex.getInverseReferences(e).entrySet())) {
					for(EObject source:new ArrayList<EObject>(entry.getValue())) {
						deleteReference(source, e, entry.getKey());
					}
				}
			}
		}
		end = System.nanoTime();
		print("deleting elements took " + ((end - start) / 1000000) + "ms");

		start = System.nanoTime();
		for(int i = subsetHistory.getOwnedTimingUnits().size() - 1; i >= 0; i--) {
			TimingUnit t = subsetHistory.getOwnedTimingUnits().get(i);
			if(!versionSubset.contains(t)) {
				for(Entry<EReference, Set<EObject>> entry:new ArrayList<Entry<EReference, Set<EObject>>>(referenceIndex.getInverseReferences(t).entrySet())) {
					for(EObject source:new ArrayList<EObject>(entry.getValue())) {
						deleteReference(source, t, entry.getKey());
					}
				}
			}
		}
		end = System.nanoTime();
		print("deleting versions took " + ((end - start) / 1000000) + "ms");
		return subsetHistory;
	}

	@SuppressWarnings("unchecked")
	private static void deleteReference(EObject source, EObject target, EReference reference) {
		if(reference.isMany()) {
			((Collection<? extends EObject>) source.eGet(reference)).remove(target);
		}
		else {
			source.eSet(reference, null);
		}
	}

	@Override
	protected TransformationExecutor createTransformationExecutor() {
		return new HistoryIntegratedExecutor();
	}

}
