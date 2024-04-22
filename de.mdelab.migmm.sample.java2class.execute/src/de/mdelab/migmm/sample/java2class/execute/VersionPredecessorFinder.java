package de.mdelab.migmm.sample.java2class.execute;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import de.mdelab.emf.util.EMFUtil;
import de.mdelab.migmm.history.History;
import de.mdelab.migmm.history.HistoryPackage;
import de.mdelab.migmm.history.TimingUnit;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.timing.DAGVersion;
import de.mdelab.migmm.history.timing.TimingPackage;

public class VersionPredecessorFinder {

	public static void main(String[] args) {
		if(args.length < 1) {
			System.out.println("1 argument: historyPath");
			return;
		}
		
		String historyPath = args[0];
		
		System.out.println("registering packages");
		registerEPackages();
		
		System.out.println("loading history");
		History h = (History) EMFUtil.loadMDELabModel(historyPath).getContents().get(0);
		
		System.out.println("indexing predecessors");
		List<TimingUnit> versions = h.getOwnedTimingUnits();
		Map<DAGVersion, Set<DAGVersion>> predecessors = indexPredecessors(versions);
		
		System.out.println("finding best predecessors");
		findBestPredecessors(versions, predecessors);
	}

	private static void registerEPackages() {
		HistoryPackage.eINSTANCE.getName();
		TimingPackage.eINSTANCE.getName();
		Java_adaptedPackage.eINSTANCE.getName();
	}

	private static void findBestPredecessors(List<TimingUnit> versions, Map<DAGVersion, Set<DAGVersion>> predecessors) {
		for(int i = 0; i < versions.size() - 1; i++) {
			TimingUnit v1 = versions.get(i);
			
			for(int j = i + 1; j < versions.size(); j++) {
				TimingUnit v2 = versions.get(j);
				
				if(predecessors.get(v1).contains(v2) ||
						predecessors.get(v2).contains(v1)) {
					continue;
				}
				
				Set<TimingUnit> commonPredecessors = new LinkedHashSet<TimingUnit>(predecessors.get(v1));
				commonPredecessors.retainAll(predecessors.get(v2));
				
				Set<TimingUnit> bestPredecessors = new LinkedHashSet<TimingUnit>();
				for(TimingUnit predecessor:commonPredecessors) {
					DAGVersion predecessorVersion = (DAGVersion) predecessor;
					
					boolean isBest = true;
					for(DAGVersion successorVersion:predecessorVersion.getSuccessors()) {
						if(commonPredecessors.contains(successorVersion)) {
							isBest = false;
							break;
						}
					}
					if(isBest) {
						bestPredecessors.add(predecessorVersion);
					}
				}
				
				if(bestPredecessors.size() > 1) {
					System.out.println("V1: " + ((DAGVersion) v1).getId());
					System.out.println("V2: " + ((DAGVersion) v2).getId());
					System.out.println(bestPredecessors);
					System.out.println("--------------------");
				}
			}
		}
	}

	private static Map<DAGVersion, Set<DAGVersion>> indexPredecessors(List<TimingUnit> ownedTimingUnits) {
		Map<DAGVersion, Set<DAGVersion>> index = new LinkedHashMap<DAGVersion, Set<DAGVersion>>();
		
		for(TimingUnit v:ownedTimingUnits) {
			if(!(v instanceof DAGVersion)) {
				continue;
			}
			
			index.put((DAGVersion) v, collectAllPredecessors((DAGVersion) v));
		}
		
		return index;
	}

	private static Set<DAGVersion> collectAllPredecessors(DAGVersion v) {
		Set<DAGVersion> predecessors = new LinkedHashSet<DAGVersion>();
		
		LinkedList<DAGVersion> queue = new LinkedList<DAGVersion>();
		queue.add(v);
		
		while(!queue.isEmpty()) {
			DAGVersion current = queue.poll();
			if(predecessors.contains(current)) {
				continue;
			}
			
			predecessors.add(current);
			for(DAGVersion predecessor:current.getPredecessors()) {
				queue.add(predecessor);
			}
		}
		
		return predecessors;
	}

}
