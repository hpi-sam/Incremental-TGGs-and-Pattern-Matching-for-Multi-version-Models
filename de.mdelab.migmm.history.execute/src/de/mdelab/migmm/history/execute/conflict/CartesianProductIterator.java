package de.mdelab.migmm.history.execute.conflict;

import java.util.Collection;
import java.util.Iterator;

public class CartesianProductIterator<T1, T2> implements Iterator<Tuple<T1, T2>> {

	private Collection<T2> c2;
	
	private Iterator<T1> it1;
	private Iterator<T2> it2;

	private T1 current1;
	
	private Tuple<T1, T2> next;
	
	public CartesianProductIterator(Collection<T1> c1, Collection<T2> c2) {
		this.it1 = c1.iterator();
		this.c2 = c2;
	}
	
	@Override
	public boolean hasNext() {
		if(next == null) {
			computeNext();
		}
		return next != null;
	}

	private void computeNext() {
		while((it2 == null || !it2.hasNext()) && it1.hasNext()) {
			current1 = it1.next();
			it2 = c2.iterator();
		}
		
		if(it2.hasNext()) {
			next = new Tuple<T1, T2>(current1, it2.next());
		}
	}

	@Override
	public Tuple<T1, T2> next() {
		if(next == null) {
			computeNext();
		}
		
		Tuple<T1, T2> tuple = next;
		next = null;
		return tuple;
	}

}
