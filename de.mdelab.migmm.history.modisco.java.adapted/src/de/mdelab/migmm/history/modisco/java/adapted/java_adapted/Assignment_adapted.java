/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment adapted</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Assignment_adapted#getLeftHandSide <em>Left Hand Side</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Assignment_adapted#getOperator <em>Operator</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Assignment_adapted#getRightHandSide <em>Right Hand Side</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getAssignment_adapted()
 * @model
 * @generated
 */
public interface Assignment_adapted extends Expression_adapted {
	/**
	 * Returns the value of the '<em><b>Left Hand Side</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Assignment_adapted_leftHandSideItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Hand Side</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getAssignment_adapted_LeftHandSide()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Assignment_adapted_leftHandSideItem> getLeftHandSide();

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Assignment_adapted_operatorValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getAssignment_adapted_Operator()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Assignment_adapted_operatorValue> getOperator();

	/**
	 * Returns the value of the '<em><b>Right Hand Side</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Assignment_adapted_rightHandSideItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Hand Side</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getAssignment_adapted_RightHandSide()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Assignment_adapted_rightHandSideItem> getRightHandSide();

} // Assignment_adapted
