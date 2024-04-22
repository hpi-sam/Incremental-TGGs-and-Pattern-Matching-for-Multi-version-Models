package de.mdelab.migmm.history.execute;

import de.mdelab.mltgg.mote2.sdm.MoTE2Sdm;

public class StandardTransformationExecutor extends TransformationExecutor {

	@Override
	protected MoTE2Sdm createMoTE() {
		return new MoTE2Sdm();
	}

}
