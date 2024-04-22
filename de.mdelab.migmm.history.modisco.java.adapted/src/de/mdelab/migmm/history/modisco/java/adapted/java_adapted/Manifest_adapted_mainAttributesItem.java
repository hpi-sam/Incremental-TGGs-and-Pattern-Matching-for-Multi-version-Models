/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import de.mdelab.migmm.history.ContainmentEdgeWithHistory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manifest adapted main Attributes Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Manifest_adapted_mainAttributesItem#getMainAttributes <em>Main Attributes</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getManifest_adapted_mainAttributesItem()
 * @model
 * @generated
 */
public interface Manifest_adapted_mainAttributesItem extends ContainmentEdgeWithHistory {
	/**
	 * Returns the value of the '<em><b>Main Attributes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Attributes</em>' reference.
	 * @see #setMainAttributes(ManifestAttribute_adapted)
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getManifest_adapted_mainAttributesItem_MainAttributes()
	 * @model required="true"
	 * @generated
	 */
	ManifestAttribute_adapted getMainAttributes();

	/**
	 * Sets the value of the '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Manifest_adapted_mainAttributesItem#getMainAttributes <em>Main Attributes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Attributes</em>' reference.
	 * @see #getMainAttributes()
	 * @generated
	 */
	void setMainAttributes(ManifestAttribute_adapted value);

} // Manifest_adapted_mainAttributesItem
