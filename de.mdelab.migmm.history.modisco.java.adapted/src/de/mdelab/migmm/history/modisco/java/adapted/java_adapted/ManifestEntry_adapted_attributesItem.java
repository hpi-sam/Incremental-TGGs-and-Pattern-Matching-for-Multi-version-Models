/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import de.mdelab.migmm.history.ContainmentEdgeWithHistory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manifest Entry adapted attributes Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ManifestEntry_adapted_attributesItem#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getManifestEntry_adapted_attributesItem()
 * @model
 * @generated
 */
public interface ManifestEntry_adapted_attributesItem extends ContainmentEdgeWithHistory {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' reference.
	 * @see #setAttributes(ManifestAttribute_adapted)
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getManifestEntry_adapted_attributesItem_Attributes()
	 * @model required="true"
	 * @generated
	 */
	ManifestAttribute_adapted getAttributes();

	/**
	 * Sets the value of the '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ManifestEntry_adapted_attributesItem#getAttributes <em>Attributes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attributes</em>' reference.
	 * @see #getAttributes()
	 * @generated
	 */
	void setAttributes(ManifestAttribute_adapted value);

} // ManifestEntry_adapted_attributesItem
