package de.mdelab.migmm.history.execute.conflict;

import java.util.Collection;
import java.util.Iterator;

import de.mdelab.migmm.history.ElementWithHistory;
import de.mdelab.migmm.history.TimingUnit;

public class DanglingEdgeConflict extends Conflict {

	private ElementWithHistory edge;
	private ElementWithHistory node;

	private Collection<TimingUnit> p;
	private Collection<TimingUnit> d;

	public DanglingEdgeConflict(ElementWithHistory edge, ElementWithHistory node, Collection<TimingUnit> p, Collection<TimingUnit> d) {
		this.edge = edge;
		this.node = node;
		this.p = p;
		this.d = d;
	}
	
	public ElementWithHistory getEdge() {
		return edge;
	}
	
	public ElementWithHistory getNode() {
		return node;
	}

	@Override
	public Iterator<Tuple<TimingUnit, TimingUnit>> getConflictPairs() {
		return new CartesianProductIterator<TimingUnit, TimingUnit>(p, d);
	}
	
}
