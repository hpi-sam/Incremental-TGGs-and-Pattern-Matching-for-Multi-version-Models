/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import de.mdelab.migmm.history.ContainmentEdgeWithHistory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manifest adapted entry Attributes Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Manifest_adapted_entryAttributesItem#getEntryAttributes <em>Entry Attributes</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getManifest_adapted_entryAttributesItem()
 * @model
 * @generated
 */
public interface Manifest_adapted_entryAttributesItem extends ContainmentEdgeWithHistory {
	/**
	 * Returns the value of the '<em><b>Entry Attributes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Attributes</em>' reference.
	 * @see #setEntryAttributes(ManifestEntry_adapted)
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getManifest_adapted_entryAttributesItem_EntryAttributes()
	 * @model required="true"
	 * @generated
	 */
	ManifestEntry_adapted getEntryAttributes();

	/**
	 * Sets the value of the '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Manifest_adapted_entryAttributesItem#getEntryAttributes <em>Entry Attributes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Attributes</em>' reference.
	 * @see #getEntryAttributes()
	 * @generated
	 */
	void setEntryAttributes(ManifestEntry_adapted value);

} // Manifest_adapted_entryAttributesItem
