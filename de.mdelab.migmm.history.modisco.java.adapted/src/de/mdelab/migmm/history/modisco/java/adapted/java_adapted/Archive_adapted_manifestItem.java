/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import de.mdelab.migmm.history.ContainmentEdgeWithHistory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Archive adapted manifest Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Archive_adapted_manifestItem#getManifest <em>Manifest</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getArchive_adapted_manifestItem()
 * @model
 * @generated
 */
public interface Archive_adapted_manifestItem extends ContainmentEdgeWithHistory {
	/**
	 * Returns the value of the '<em><b>Manifest</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manifest</em>' reference.
	 * @see #setManifest(Manifest_adapted)
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getArchive_adapted_manifestItem_Manifest()
	 * @model required="true"
	 * @generated
	 */
	Manifest_adapted getManifest();

	/**
	 * Sets the value of the '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Archive_adapted_manifestItem#getManifest <em>Manifest</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manifest</em>' reference.
	 * @see #getManifest()
	 * @generated
	 */
	void setManifest(Manifest_adapted value);

} // Archive_adapted_manifestItem
