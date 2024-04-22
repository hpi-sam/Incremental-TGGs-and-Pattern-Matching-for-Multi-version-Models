package de.mdelab.migmm.history.timing.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import de.mdelab.migmm.history.TimingUnit;
import de.mdelab.migmm.history.timing.DAGVersion;
import de.mdelab.migmm.history.timing.dag.DAGAdapter;

public class DAGVersionUtil {
	
	public static List<DAGVersion> orderTopologically(Collection<? extends TimingUnit> timingUnits) {
		Map<DAGVersion, Integer> unorderedPredecessors = new LinkedHashMap<DAGVersion, Integer>();
		Deque<DAGVersion> orderableVersions = new LinkedList<DAGVersion>();
		for(TimingUnit t:timingUnits) {
			if(t instanceof DAGVersion) {
				DAGVersion v = (DAGVersion) t;
				unorderedPredecessors.put(v, v.getPredecessors().size());
				
				if(v.getPredecessors().isEmpty()) {
					orderableVersions.addLast(v);
				}
			}
		}
		
		List<DAGVersion> order = new ArrayList<DAGVersion>();
		while(!orderableVersions.isEmpty()) {
			DAGVersion v = orderableVersions.removeFirst();
			order.add(v);
			
			for(DAGVersion successor:v.getSuccessors()) {
				int currentUnorderedPredecessors = unorderedPredecessors.get(successor);
				int newUnorderedPredecessors = currentUnorderedPredecessors - 1;
				unorderedPredecessors.put(successor, newUnorderedPredecessors);
				
				if(newUnorderedPredecessors == 0) {
					orderableVersions.add(successor);
				}
			}
		}
		
		return order;
	}
	
	public static List<DAGVersion> unionNonRedundantCts(List<DAGVersion> candidateCts1,
			Collection<DAGVersion> candidateCts2, DAGAdapter dagAdapter) {
		List<DAGVersion> union = new ArrayList<DAGVersion>(candidateCts1.size() + candidateCts2.size());
		for(DAGVersion c1:candidateCts1) {
			if(!succeedsAnyNonReflexive(c1, candidateCts2, dagAdapter)) {
				union.add(c1);
			}
		}
		
		for(DAGVersion c2:candidateCts2) {
			if(!succeedsAnyReflexive(c2, candidateCts1, dagAdapter)) {
				union.add(c2);
			}
		}
		return union;
	}

	public static List<DAGVersion> eliminateRedundantDts(Collection<DAGVersion> candidateDts,
			Collection<DAGVersion> candidateCts, DAGAdapter dagAdapter) {
		List<DAGVersion> dts = new ArrayList<DAGVersion>(candidateDts.size());
		for(DAGVersion d:candidateDts) {
			if(hasPresentPredecessor(d, candidateDts, candidateCts, dagAdapter)) {
				dts.add(d);
			}
		}
		
		return dts;
	}

	public static boolean hasPresentPredecessor(DAGVersion d, Collection<DAGVersion> candidateDts, Collection<DAGVersion> candidateCts,
			DAGAdapter dagAdapter) {
		for(DAGVersion predecessor:d.getPredecessors()) {
			if(succeedsAnyReflexive(predecessor, candidateCts, dagAdapter) && !succeedsAnyReflexive(predecessor, candidateDts, dagAdapter)) {
				return true;
			}
		}
		return false;
	}

	public static Collection<DAGVersion> filterDeletedSuccessors(Collection<DAGVersion> successors,
			Collection<DAGVersion> candidateDts,
			DAGAdapter dagAdapter) {
		Collection<DAGVersion> filteredSuccessors = new ArrayList<DAGVersion>(successors.size());
		for(DAGVersion successor:successors) {
			if(!succeedsAnyReflexive(successor, candidateDts, dagAdapter)) {
				filteredSuccessors.add(successor);
			}
		}
		return filteredSuccessors;
	}

	public static boolean succeedsAnyReflexive(DAGVersion version, Collection<DAGVersion> candidatePredecessors, DAGAdapter dagAdapter) {
		for(DAGVersion candidatePredecessor:candidatePredecessors) {
			if(candidatePredecessor == version) {
				return true;
			}
		}
		return succeedsAnyNonReflexive(version, candidatePredecessors, dagAdapter);
	}
	
	public static boolean succeedsAnyNonReflexive(DAGVersion version, Collection<DAGVersion> candidatePredecessors, DAGAdapter dagAdapter) {
		Collection<DAGVersion> predecessors = dagAdapter.getExclusivePredecessors(version);
		for(DAGVersion candidatePredecessor:candidatePredecessors) {
			if(predecessors.contains(candidatePredecessor)) {
				return true;
			}
		}
		return false;
	}
}
