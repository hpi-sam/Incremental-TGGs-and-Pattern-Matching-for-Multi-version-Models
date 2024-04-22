/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import de.mdelab.migmm.history.ContainmentEdgeWithHistory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment adapted right Hand Side Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Assignment_adapted_rightHandSideItem#getRightHandSide <em>Right Hand Side</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getAssignment_adapted_rightHandSideItem()
 * @model
 * @generated
 */
public interface Assignment_adapted_rightHandSideItem extends ContainmentEdgeWithHistory {
	/**
	 * Returns the value of the '<em><b>Right Hand Side</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Hand Side</em>' reference.
	 * @see #setRightHandSide(Expression_adapted)
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getAssignment_adapted_rightHandSideItem_RightHandSide()
	 * @model required="true"
	 * @generated
	 */
	Expression_adapted getRightHandSide();

	/**
	 * Sets the value of the '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Assignment_adapted_rightHandSideItem#getRightHandSide <em>Right Hand Side</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Hand Side</em>' reference.
	 * @see #getRightHandSide()
	 * @generated
	 */
	void setRightHandSide(Expression_adapted value);

} // Assignment_adapted_rightHandSideItem
