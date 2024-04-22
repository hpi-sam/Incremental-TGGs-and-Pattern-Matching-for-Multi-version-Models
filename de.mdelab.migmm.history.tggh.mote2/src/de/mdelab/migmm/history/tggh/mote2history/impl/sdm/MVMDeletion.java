package de.mdelab.migmm.history.tggh.mote2history.impl.sdm;

import java.util.Collection;

import de.mdelab.migmm.history.ElementWithHistory;
import de.mdelab.migmm.history.TimingUnit;
import de.mdelab.mltgg.mote2.TransformationDirectionEnum;

public class MVMDeletion {

	public ElementWithHistory element;
	public Collection<TimingUnit> newDts;
	public TransformationDirectionEnum direction;
	
	public MVMDeletion(ElementWithHistory element, Collection<TimingUnit> newDts, TransformationDirectionEnum direction) {
		this.element = element;
		this.newDts = newDts;
		this.direction = direction;
	}
	
}
