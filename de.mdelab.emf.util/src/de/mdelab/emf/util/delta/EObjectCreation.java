package de.mdelab.emf.util.delta;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

public class EObjectCreation extends EMFChange {

	private final EClass eClass;
	private final long id;
	
	public EObjectCreation(EClass eClass, long id) {
		this.eClass = eClass;
		this.id = id;
	}

	public EClass getEClass() {
		return eClass;
	}

	public long getID() {
		return id;
	}

	@Override
	public void apply(Map<Long, EObject> objects, Map<EObject, Long> ids) {
		EObject o = eClass.getEPackage().getEFactoryInstance().create(eClass);
		objects.put(id, o);
		ids.put(o, id);
	}
	
}
