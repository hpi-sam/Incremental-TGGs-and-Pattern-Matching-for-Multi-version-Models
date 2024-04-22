package de.mdelab.migmm.history.execute.conflict;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;

import de.mdelab.migmm.history.ContainmentEdgeWithHistory;
import de.mdelab.migmm.history.TimingUnit;

public class DoubleContainmentConflict extends Conflict {

	private final ContainmentEdgeWithHistory containment1;
	private final ContainmentEdgeWithHistory containment2;
	private final EObject node;

	private Collection<TimingUnit> p1;
	private Collection<TimingUnit> p2;

	public DoubleContainmentConflict(ContainmentEdgeWithHistory containment1, ContainmentEdgeWithHistory containment2,
			EObject node, Collection<TimingUnit> p1, Collection<TimingUnit> p2) {
		this.containment1 = containment1;
		this.containment2 = containment2;
		this.node = node;
		this.p1 = p1;
		this.p2 = p2;
	}

	public ContainmentEdgeWithHistory getContainment1() {
		return containment1;
	}

	public ContainmentEdgeWithHistory getContainment2() {
		return containment2;
	}

	public EObject getNode() {
		return node;
	}

	@Override
	public Iterator<Tuple<TimingUnit, TimingUnit>> getConflictPairs() {
		return new CartesianProductIterator<>(p1, p2);
	}

}
