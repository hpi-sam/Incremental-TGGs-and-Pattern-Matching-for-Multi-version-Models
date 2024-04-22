package de.mdelab.emf.util.delta;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;

public abstract class EMFChange {

	public abstract void apply(Map<Long, EObject> objects, Map<EObject, Long> ids);

}
