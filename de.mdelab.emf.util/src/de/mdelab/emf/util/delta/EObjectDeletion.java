package de.mdelab.emf.util.delta;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;

public class EObjectDeletion extends EMFChange {

	private final long id;

	public EObjectDeletion(long id) {
		this.id = id;
	}

	public long getID() {
		return id;
	}

	@Override
	public void apply(Map<Long, EObject> objects, Map<EObject, Long> ids) {
		//TODO maybe do something here
	}
	
}
