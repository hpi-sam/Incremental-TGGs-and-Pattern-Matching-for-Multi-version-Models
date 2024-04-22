package de.mdelab.migmm.history.execute.conflict;

import java.util.Iterator;

import de.mdelab.migmm.history.TimingUnit;

public abstract class Conflict {

	public abstract Iterator<Tuple<TimingUnit, TimingUnit>> getConflictPairs();
	
}
