package de.mdelab.migmm.history.timing.dag;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import de.mdelab.migmm.history.timing.DAGVersion;
import de.mdelab.migmm.history.timing.TimingPackage;
import de.mdelab.migmm.history.timing.util.DAGVersionUtil;

public class DAGAdapter implements Adapter {

	private int currentID = 0;
	private List<DAGVersion> versions = new ArrayList<DAGVersion>();
	private Collection<DAGVersion>[] exclusivePredecessors;
	private Collection<DAGVersion>[][] earliestCommonSuccessors;
	
	@SuppressWarnings("unchecked")
	@Override
	public void notifyChanged(Notification notification) {
		if(notification.getFeature() == TimingPackage.Literals.DAG_VERSION__SUCCESSORS) {
			List<DAGVersion> newSuccessors;
			if(notification.getEventType() == Notification.ADD) {
				newSuccessors = Collections.singletonList((DAGVersion) notification.getNewValue());
			}
			else if(notification.getEventType() == Notification.ADD_MANY) {
				newSuccessors = (List<DAGVersion>) notification.getNewValue();
			}
			else {
				newSuccessors = Collections.emptyList();
			}
			
			for(DAGVersion newSuccessor:newSuccessors) {
				if(!newSuccessor.eAdapters().contains(this)) {
					addAdapter(newSuccessor);
				}
				recomputeIndices(newSuccessor);
			}
		}
	}

	public void recomputeIndices(DAGVersion newSuccessor) {
		if(newSuccessor.getSuccessors().size() == 0) {
			recomputePredecessorIndex(newSuccessor);
			recomputeCommonSuccessorIndex(newSuccessor);
		}
		else {
			System.out.println("???");
			recomputePredecessorIndex();
			recomputeCommonSuccessorIndex();
		}
	}

	public void recomputeIndices() {
		recomputePredecessorIndex();
		recomputeCommonSuccessorIndex();
	}

	public void addAdapter(DAGVersion v) {
		v.eAdapters().add(this);
		versions.add(v);
		v.setIntID(currentID);
		currentID++;
	}

	public Collection<DAGVersion> getEarliestCommonSuccessors(DAGVersion v1, DAGVersion v2) {
		return earliestCommonSuccessors[v1.getIntID()][v2.getIntID()];
	}

	public Collection<DAGVersion> getExclusivePredecessors(DAGVersion v) {
		return exclusivePredecessors[v.getIntID()];
	}
	
	public void recomputeCommonSuccessorIndex(DAGVersion newSuccessor) {
		if(currentID >= earliestCommonSuccessors.length) {
			growIndices();
		}
		
		for(int i = 0; i < currentID; i++) {
			earliestCommonSuccessors[i][newSuccessor.getIntID()] = new ArrayList<DAGVersion>();
			earliestCommonSuccessors[newSuccessor.getIntID()][i] = new ArrayList<DAGVersion>();
		}
		
		earliestCommonSuccessors[newSuccessor.getIntID()][newSuccessor.getIntID()] = Collections.singletonList(newSuccessor);
		
		Collection<DAGVersion> newPredecessors = exclusivePredecessors[newSuccessor.getIntID()];
		for(DAGVersion predecessor:newPredecessors) {
			earliestCommonSuccessors[predecessor.getIntID()][newSuccessor.getIntID()] = Collections.singletonList(newSuccessor);
			earliestCommonSuccessors[newSuccessor.getIntID()][predecessor.getIntID()] = Collections.singletonList(newSuccessor);
		}
		
		if(newSuccessor.getPredecessors().size() > 1) {
			
			if(newSuccessor.getPredecessors().size() == 2) {
				DAGVersion p1 = newSuccessor.getPredecessors().get(0);
				DAGVersion p2 = newSuccessor.getPredecessors().get(1);
				
				Collection<DAGVersion> p1Predecessors = new LinkedHashSet<DAGVersion>();
				LinkedList<DAGVersion> queue = new LinkedList<DAGVersion>();
				queue.add(p1);
				while(!queue.isEmpty()) {
					DAGVersion current = queue.poll();
					if(p1Predecessors.contains(current)) {
						continue;
					}
					
					if(!exclusivePredecessors[p2.getIntID()].contains(current)) {
						p1Predecessors.add(current);
						for(DAGVersion currentPredecessor:current.getPredecessors()) {
							queue.add(currentPredecessor);
						}
					}
				}
				
				Collection<DAGVersion> p2Predecessors = new LinkedHashSet<DAGVersion>();
				queue = new LinkedList<DAGVersion>();
				queue.add(p2);
				while(!queue.isEmpty()) {
					DAGVersion current = queue.poll();
					if(p2Predecessors.contains(current)) {
						continue;
					}
					
					if(!exclusivePredecessors[p1.getIntID()].contains(current)) {
						p2Predecessors.add(current);
						for(DAGVersion currentPredecessor:current.getPredecessors()) {
							queue.add(currentPredecessor);
						}
					}
				}
				
				for(DAGVersion p1Predecessor:p1Predecessors) {
					for(DAGVersion p2Predecessor:p2Predecessors) {
						earliestCommonSuccessors[p1Predecessor.getIntID()][p2Predecessor.getIntID()].add(newSuccessor);
						earliestCommonSuccessors[p2Predecessor.getIntID()][p1Predecessor.getIntID()].add(newSuccessor);
					}
				}
				
			}
			else {
				for(DAGVersion predecessor:newPredecessors) {
					for(DAGVersion predecessor2:newPredecessors) {
						boolean addSuccessor = true;
						Collection<DAGVersion> oldCommonSuccessors = earliestCommonSuccessors[predecessor.getIntID()][predecessor2.getIntID()];
						for(DAGVersion oldCommonSuccessor:oldCommonSuccessors) {
							if(newPredecessors.contains(oldCommonSuccessor)) {
								addSuccessor = false;
								break;
							}
						}
						if(addSuccessor) {
							earliestCommonSuccessors[predecessor.getIntID()][predecessor2.getIntID()].add(newSuccessor);
							earliestCommonSuccessors[predecessor2.getIntID()][predecessor.getIntID()].add(newSuccessor);
						}
					}
				}
			}
			
		}
	}

	@SuppressWarnings("unchecked")
	private void growIndices() {
		Collection<DAGVersion>[] oldPredecessors = exclusivePredecessors;
		exclusivePredecessors = (Collection<DAGVersion>[]) new Collection[currentID * 2];
		for(int i = 0; i < currentID - 1; i++) {
			exclusivePredecessors[i] = oldPredecessors[i];
		}
		
		
		Collection<DAGVersion>[][] oldSuccessors = earliestCommonSuccessors;
		earliestCommonSuccessors = (Collection<DAGVersion> [][]) new Collection[currentID * 2][currentID * 2];

		for(int i = 0; i < currentID - 1; i++) {
			for(int j = 0; j < currentID - 1; j++) {
				earliestCommonSuccessors[i][j] = oldSuccessors[i][j];
			}
		}
	}

	@SuppressWarnings("unchecked")
	public void recomputeCommonSuccessorIndex() {
		earliestCommonSuccessors = (Collection<DAGVersion> [][]) new Collection[currentID][currentID];
		
		List<DAGVersion> sorting = DAGVersionUtil.orderTopologically(versions);
		
		for(int i = sorting.size() - 1; i >= 0; i--) {
			DAGVersion v1 = sorting.get(i);
			earliestCommonSuccessors[v1.getIntID()][v1.getIntID()] = Collections.singleton(v1);
			
			for(int j = sorting.size() - 1; j > i; j--) {
				DAGVersion v2 = sorting.get(j);
				
				Collection<DAGVersion> commonSuccessors = new LinkedHashSet<DAGVersion>();
				for(DAGVersion s:v1.getSuccessors()) {
					commonSuccessors = unionNonRedundantCommonSuccessors(commonSuccessors, earliestCommonSuccessors[s.getIntID()][v2.getIntID()]);
				}

				earliestCommonSuccessors[v1.getIntID()][v2.getIntID()] = commonSuccessors;
				earliestCommonSuccessors[v2.getIntID()][v1.getIntID()] = commonSuccessors;
			}
		}
	}
	
	protected Collection<DAGVersion> unionNonRedundantCommonSuccessors(Collection<DAGVersion> c1, Collection<DAGVersion> c2) {
		Collection<DAGVersion> union = new LinkedHashSet<DAGVersion>();

		for(DAGVersion v1:c1) {
			boolean redundant = false;
			for(DAGVersion v2:c2) {
				if(exclusivePredecessors[v1.getIntID()].contains(v2)) {
					redundant = true;
					break;
				}
			}
			if(!redundant) {
				union.add(v1);
			}
		}

		for(DAGVersion v2:c2) {
			boolean redundant = false;
			for(DAGVersion v1:c1) {
				if(v2 == v1 || exclusivePredecessors[v2.getIntID()].contains(v1)) {
					redundant = true;
					break;
				}
			}
			if(!redundant) {
				union.add(v2);
			}
		}
		
		return union;
	}

	public void recomputePredecessorIndex(DAGVersion newSuccessor) {
		if(currentID >= exclusivePredecessors.length) {
			growIndices();
		}
		exclusivePredecessors[newSuccessor.getIntID()] = computeExclusivePredecessors(newSuccessor);
	}

	@SuppressWarnings("unchecked")
	public void recomputePredecessorIndex() {
		exclusivePredecessors = (Collection<DAGVersion> []) new Collection[currentID];
		for(DAGVersion version:versions) {
			exclusivePredecessors[version.getIntID()] = computeExclusivePredecessors(version);
		}
	}

	private Collection<DAGVersion> computeExclusivePredecessors(DAGVersion version) {
		LinkedList<DAGVersion> queue = new LinkedList<DAGVersion>();
		queue.add(version);
		
		Set<DAGVersion> exclusivePredecessors = new LinkedHashSet<DAGVersion>();
		
		while(!queue.isEmpty()) {
			DAGVersion predecessor = queue.poll();
			
			for(DAGVersion previousPredecessor:predecessor.getPredecessors()) {
				if(!exclusivePredecessors.contains(previousPredecessor)) {
					queue.add(previousPredecessor);
					exclusivePredecessors.add(previousPredecessor);
				}
			}
		}
		
		return exclusivePredecessors;
	}

	@Override
	public Notifier getTarget() {
		return null;
	}

	@Override
	public void setTarget(Notifier newTarget) {
	}

	@Override
	public boolean isAdapterForType(Object type) {
		return false;
	}
}
