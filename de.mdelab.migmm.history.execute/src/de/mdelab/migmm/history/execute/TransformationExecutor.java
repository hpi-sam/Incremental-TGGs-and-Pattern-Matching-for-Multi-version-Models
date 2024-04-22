package de.mdelab.migmm.history.execute;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Collection;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import de.mdelab.mltgg.mote2.TransformationDirectionEnum;
import de.mdelab.mltgg.mote2.sdm.MoTE2Sdm;
import de.mdelab.mltgg.mote2.sdm.SdmOperationalTGG;

public abstract class TransformationExecutor {

	public MoTE2Sdm lastEngine;
	
	public long executeTransformation(Collection<EObject> inputModel,
			TransformationDirectionEnum direction, SdmOperationalTGG operationaTGG) {
		lastEngine = createMoTE();
		lastEngine.initRules(operationaTGG);
		
		long startInit = System.nanoTime();
		long gcStart = getGarbageCollectionTime();
		EList<EObject> leftElements = new BasicEList<EObject>();
		EList<EObject> rightElements = new BasicEList<EObject>();
		if(direction == TransformationDirectionEnum.FORWARD) {
			leftElements.addAll(inputModel);
		}
		else if(direction == TransformationDirectionEnum.BACKWARD){
			rightElements.addAll(inputModel);
		}
		lastEngine.initModels(leftElements, rightElements);
		long gcEnd = getGarbageCollectionTime();
		long endInit = System.nanoTime();
		long initTime = (endInit - startInit) - ((gcEnd - gcStart) * 1000000);		
		
		return initTime + execute(lastEngine, direction, false);
	}

	protected abstract MoTE2Sdm createMoTE();
	
	public long executeSynchronization(MoTE2Sdm engine,
			TransformationDirectionEnum direction) {			
		return execute(engine, direction, true);
	}
	
	protected long execute(MoTE2Sdm engine,
			TransformationDirectionEnum direction, boolean synchronize) {
		long start = System.nanoTime();
		long gcStart = getGarbageCollectionTime();
		engine.transform(direction, synchronize, false, false, false, null);
		long gcEnd = getGarbageCollectionTime();
		long end = System.nanoTime();
		return (end - start) - ((gcEnd - gcStart) * 1000000);
	}

	private static long getGarbageCollectionTime() {
	    long collectionTime = 0;
	    for (GarbageCollectorMXBean garbageCollectorMXBean : ManagementFactory.getGarbageCollectorMXBeans()) {
	        collectionTime += garbageCollectorMXBean.getCollectionTime();
	    }
	    return collectionTime;
	}
}
