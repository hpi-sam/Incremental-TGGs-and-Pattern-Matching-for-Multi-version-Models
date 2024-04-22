/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import de.mdelab.migmm.history.ContainmentEdgeWithHistory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model adapted orphan Types Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Model_adapted_orphanTypesItem#getOrphanTypes <em>Orphan Types</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getModel_adapted_orphanTypesItem()
 * @model
 * @generated
 */
public interface Model_adapted_orphanTypesItem extends ContainmentEdgeWithHistory {
	/**
	 * Returns the value of the '<em><b>Orphan Types</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orphan Types</em>' reference.
	 * @see #setOrphanTypes(Type_adapted)
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getModel_adapted_orphanTypesItem_OrphanTypes()
	 * @model required="true"
	 * @generated
	 */
	Type_adapted getOrphanTypes();

	/**
	 * Sets the value of the '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Model_adapted_orphanTypesItem#getOrphanTypes <em>Orphan Types</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orphan Types</em>' reference.
	 * @see #getOrphanTypes()
	 * @generated
	 */
	void setOrphanTypes(Type_adapted value);

} // Model_adapted_orphanTypesItem
