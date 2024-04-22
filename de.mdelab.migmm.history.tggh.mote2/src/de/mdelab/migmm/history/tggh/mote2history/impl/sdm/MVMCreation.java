package de.mdelab.migmm.history.tggh.mote2history.impl.sdm;

import de.mdelab.migmm.history.ElementWithHistory;
import de.mdelab.mltgg.mote2.TransformationDirectionEnum;

public class MVMCreation {

	public ElementWithHistory anchorElement;
	public ElementWithHistory newElement;
	public TransformationDirectionEnum direction;
	
	public MVMCreation(ElementWithHistory element, ElementWithHistory newElement, TransformationDirectionEnum direction) {
		this.anchorElement = element;
		this.newElement = newElement;
		this.direction = direction;
	}
	
}
