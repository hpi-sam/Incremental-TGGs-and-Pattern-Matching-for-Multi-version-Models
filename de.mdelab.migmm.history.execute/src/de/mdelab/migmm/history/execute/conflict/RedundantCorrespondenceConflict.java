package de.mdelab.migmm.history.execute.conflict;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;

import de.mdelab.migmm.history.TimingUnit;
import tggh.TGGNodeWithHistory;

public class RedundantCorrespondenceConflict extends Conflict {

	private final TGGNodeWithHistory corr1;
	private final TGGNodeWithHistory corr2;
	
	private final EObject element;

	private Collection<TimingUnit> p1;
	private Collection<TimingUnit> p2;

	public RedundantCorrespondenceConflict(TGGNodeWithHistory corr1, TGGNodeWithHistory corr2, EObject element, Collection<TimingUnit> p1, Collection<TimingUnit> p2) {
		this.corr1 = corr1;
		this.corr2 = corr2;
		this.element = element;
		this.p1 = p1;
		this.p2 = p2;
	}

	public TGGNodeWithHistory getCorr1() {
		return corr1;
	}

	public TGGNodeWithHistory getCorr2() {
		return corr2;
	}

	public EObject getElement() {
		return element;
	}

	@Override
	public Iterator<Tuple<TimingUnit, TimingUnit>> getConflictPairs() {
		return new CartesianProductIterator<>(p1, p2);
	}
}
