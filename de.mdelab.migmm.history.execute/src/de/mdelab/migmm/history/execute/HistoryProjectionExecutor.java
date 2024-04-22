package de.mdelab.migmm.history.execute;

import java.util.Collection;
import java.util.Collections;
import org.eclipse.emf.ecore.EObject;

import de.mdelab.migmm.history.History;
import de.mdelab.migmm.history.TimingUnit;
import de.mdelab.migmm.history.projection.HistoryProjector;
import de.mdelab.mltgg.mote2.TransformationDirectionEnum;
import de.mdelab.mltgg.mote2.sdm.MoTE2Sdm;

public class HistoryProjectionExecutor extends TransformationExecutor {

	private HistoryProjector projector;

	public HistoryProjectionExecutor() {
		this.projector = new HistoryProjector();
	}
	
	@Override
	protected long execute(MoTE2Sdm engine,
			TransformationDirectionEnum direction, boolean synchronize) {
		Collection<EObject> inputElements = direction == TransformationDirectionEnum.FORWARD ? engine.getLeftInputElements() : engine.getRightInputElements();
		Collection<TimingUnit> timingUnits = collectTimingUnits(inputElements);
		
		long start = System.nanoTime();
		for(TimingUnit t:timingUnits) {
			projector.project(t, inputElements);
			
			engine.transform(direction, synchronize, false, false, false, null);
			
			projector.unproject(inputElements);	
		}
		long end = System.nanoTime();
		
		return end - start;
	}

	private Collection<TimingUnit> collectTimingUnits(Collection<EObject> inputElements) {
		for(EObject element:inputElements) {
			if(element instanceof History) {
				return ((History) element).getOwnedTimingUnits();
			}
		}
		return Collections.emptySet();
	}

	@Override
	protected MoTE2Sdm createMoTE() {
		return new MoTE2Sdm();
	}
}
