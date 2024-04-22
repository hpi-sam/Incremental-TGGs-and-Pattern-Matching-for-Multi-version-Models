package de.mdelab.migmm.history.tggh.mote2history.impl.sdm;

import de.mdelab.migmm.history.timing.DAGVersion;
import de.mdelab.mltgg.mote2.TransformationDirectionEnum;

public class MVMMerge {

	public DAGVersion version;
	public TransformationDirectionEnum direction;
	
	public MVMMerge(DAGVersion version, TransformationDirectionEnum direction) {
		this.version = version;
		this.direction = direction;
	}

}
