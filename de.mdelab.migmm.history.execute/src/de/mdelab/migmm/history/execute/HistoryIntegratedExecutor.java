package de.mdelab.migmm.history.execute;

import de.mdelab.migmm.history.tggh.mote2history.impl.sdm.MoTE2HistorySdm;
import de.mdelab.mltgg.mote2.sdm.MoTE2Sdm;

public class HistoryIntegratedExecutor extends TransformationExecutor {

	@Override
	protected MoTE2Sdm createMoTE() {
		return new MoTE2HistorySdm();
	}
}
