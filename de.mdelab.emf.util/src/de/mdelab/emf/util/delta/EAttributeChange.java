package de.mdelab.emf.util.delta;

import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;

public class EAttributeChange extends EMFChange {

	private final EAttribute eAttribute;
	private final long id;
	private final Object newValue;
	
	public EAttributeChange(EAttribute eAttribute, long id, Object newValue) {
		this.eAttribute = eAttribute;
		this.id = id;
		this.newValue = newValue;
	}

	public EAttribute getEAttribute() {
		return eAttribute;
	}

	public long getID() {
		return id;
	}

	public Object getNewValue() {
		return newValue;
	}

	@Override
	public void apply(Map<Long, EObject> objects, Map<EObject, Long> ids) {
		objects.get(id).eSet(eAttribute, newValue);
	}

}
