package de.mdelab.emf.util.delta;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

public class EMFDelta {

	private final List<EObjectCreation> objectCreations;
	private final List<EObjectDeletion> objectDeletions;
	private final List<EReferenceCreation> referenceCreations;
	private final List<EReferenceDeletion> referenceDeletions;
	private final List<EAttributeChange> attributeChanges;
	
	public EMFDelta() {
		this.objectCreations = new ArrayList<EObjectCreation>();
		this.objectDeletions = new ArrayList<EObjectDeletion>();
		this.referenceCreations = new ArrayList<EReferenceCreation>();
		this.referenceDeletions = new ArrayList<EReferenceDeletion>();
		this.attributeChanges = new ArrayList<EAttributeChange>();
	}

	public List<EObjectCreation> getObjectCreations() {
		return objectCreations;
	}

	public List<EObjectDeletion> getObjectDeletions() {
		return objectDeletions;
	}

	public List<EReferenceCreation> getReferenceCreations() {
		return referenceCreations;
	}

	public List<EReferenceDeletion> getReferenceDeletions() {
		return referenceDeletions;
	}

	public List<EAttributeChange> getAttributeChanges() {
		return attributeChanges;
	}

	public void apply(Map<Long, EObject> objects, Map<EObject, Long> ids) {
		applyChanges(referenceDeletions, objects, ids);
		applyChanges(objectCreations, objects, ids);
		applyChanges(referenceCreations, objects, ids);
		applyChanges(objectDeletions, objects, ids);
		applyChanges(attributeChanges, objects, ids);
	}

	private void applyChanges(Collection<? extends EMFChange> changes, Map<Long, EObject> objects, Map<EObject, Long> ids) {
		for(EMFChange change:changes) {
			change.apply(objects, ids);
		}
	}
	
}
