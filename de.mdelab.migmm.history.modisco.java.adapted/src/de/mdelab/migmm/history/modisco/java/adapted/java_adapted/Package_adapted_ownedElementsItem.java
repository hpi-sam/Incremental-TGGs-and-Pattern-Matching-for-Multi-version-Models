/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import de.mdelab.migmm.history.ContainmentEdgeWithHistory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package adapted owned Elements Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Package_adapted_ownedElementsItem#getOwnedElements <em>Owned Elements</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getPackage_adapted_ownedElementsItem()
 * @model
 * @generated
 */
public interface Package_adapted_ownedElementsItem extends ContainmentEdgeWithHistory {
	/**
	 * Returns the value of the '<em><b>Owned Elements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Elements</em>' reference.
	 * @see #setOwnedElements(AbstractTypeDeclaration_adapted)
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getPackage_adapted_ownedElementsItem_OwnedElements()
	 * @model required="true"
	 * @generated
	 */
	AbstractTypeDeclaration_adapted getOwnedElements();

	/**
	 * Sets the value of the '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Package_adapted_ownedElementsItem#getOwnedElements <em>Owned Elements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Elements</em>' reference.
	 * @see #getOwnedElements()
	 * @generated
	 */
	void setOwnedElements(AbstractTypeDeclaration_adapted value);

} // Package_adapted_ownedElementsItem
