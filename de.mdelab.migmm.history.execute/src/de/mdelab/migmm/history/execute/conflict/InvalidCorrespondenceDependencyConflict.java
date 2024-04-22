package de.mdelab.migmm.history.execute.conflict;

import java.util.Collection;
import java.util.Iterator;

import de.mdelab.migmm.history.TimingUnit;
import tggh.TGGNodeWithHistory;

public class InvalidCorrespondenceDependencyConflict extends Conflict {

	private final TGGNodeWithHistory parent;
	private final TGGNodeWithHistory child;

	private Collection<TimingUnit> p;
	private Collection<TimingUnit> d;

	public InvalidCorrespondenceDependencyConflict(TGGNodeWithHistory parent, TGGNodeWithHistory child,
			Collection<TimingUnit> p, Collection<TimingUnit> d) {
		this.parent = parent;
		this.child = child;
		this.p = p;
		this.d = d;
	}

	public TGGNodeWithHistory getParent() {
		return parent;
	}

	public TGGNodeWithHistory getChild() {
		return child;
	}

	@Override
	public Iterator<Tuple<TimingUnit, TimingUnit>> getConflictPairs() {
		return new CartesianProductIterator<>(p, d);
	}

}
