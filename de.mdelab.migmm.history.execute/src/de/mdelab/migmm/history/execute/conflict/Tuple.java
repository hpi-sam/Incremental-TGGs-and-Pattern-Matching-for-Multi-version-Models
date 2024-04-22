package de.mdelab.migmm.history.execute.conflict;

public class Tuple<E1, E2> {

	public E1 e1;
	public E2 e2;
	
	public Tuple(E1 e1, E2 e2) {
		this.e1 = e1;
		this.e2 = e2;
	}
	
	@Override
	public String toString() {
		return "(" + e1 + ", " + e2 + ")";
	}
}
