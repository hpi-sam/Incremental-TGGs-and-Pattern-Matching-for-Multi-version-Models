package de.mdelab.emf.util.delta;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

import de.mdelab.emf.util.EMFUtil;

public class EReferenceDeletion extends EMFChange {

	private final EReference eReference;
	private final long sourceID;
	private final long targetID;
	
	public EReferenceDeletion(EReference eReference, long sourceID, long targetID) {
		this.eReference = eReference;
		this.sourceID = sourceID;
		this.targetID = targetID;
	}

	public EReference getEReference() {
		return eReference;
	}

	public long getSourceID() {
		return sourceID;
	}

	public long getTargetID() {
		return targetID;
	}

	@Override
	public void apply(Map<Long, EObject> objects, Map<EObject, Long> ids) {
		EObject source = objects.get(sourceID);
		EObject target = objects.get(targetID);
		EMFUtil.removeReferenceValue(source, eReference, target);
	}
	
}
