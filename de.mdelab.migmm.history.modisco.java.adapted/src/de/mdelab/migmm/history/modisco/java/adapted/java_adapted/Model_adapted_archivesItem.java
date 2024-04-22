/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import de.mdelab.migmm.history.ContainmentEdgeWithHistory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model adapted archives Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Model_adapted_archivesItem#getArchives <em>Archives</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getModel_adapted_archivesItem()
 * @model
 * @generated
 */
public interface Model_adapted_archivesItem extends ContainmentEdgeWithHistory {
	/**
	 * Returns the value of the '<em><b>Archives</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Archives</em>' reference.
	 * @see #setArchives(Archive_adapted)
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getModel_adapted_archivesItem_Archives()
	 * @model required="true"
	 * @generated
	 */
	Archive_adapted getArchives();

	/**
	 * Sets the value of the '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Model_adapted_archivesItem#getArchives <em>Archives</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Archives</em>' reference.
	 * @see #getArchives()
	 * @generated
	 */
	void setArchives(Archive_adapted value);

} // Model_adapted_archivesItem
