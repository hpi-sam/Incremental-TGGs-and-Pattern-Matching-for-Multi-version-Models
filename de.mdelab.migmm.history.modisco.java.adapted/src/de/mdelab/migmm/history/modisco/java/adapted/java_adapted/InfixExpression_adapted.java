/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Infix Expression adapted</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.InfixExpression_adapted#getOperator <em>Operator</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.InfixExpression_adapted#getRightOperand <em>Right Operand</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.InfixExpression_adapted#getLeftOperand <em>Left Operand</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.InfixExpression_adapted#getExtendedOperands <em>Extended Operands</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getInfixExpression_adapted()
 * @model
 * @generated
 */
public interface InfixExpression_adapted extends Expression_adapted {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.InfixExpression_adapted_operatorValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getInfixExpression_adapted_Operator()
	 * @model ordered="false"
	 * @generated
	 */
	EList<InfixExpression_adapted_operatorValue> getOperator();

	/**
	 * Returns the value of the '<em><b>Right Operand</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.InfixExpression_adapted_rightOperandItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Operand</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getInfixExpression_adapted_RightOperand()
	 * @model ordered="false"
	 * @generated
	 */
	EList<InfixExpression_adapted_rightOperandItem> getRightOperand();

	/**
	 * Returns the value of the '<em><b>Left Operand</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.InfixExpression_adapted_leftOperandItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Operand</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getInfixExpression_adapted_LeftOperand()
	 * @model ordered="false"
	 * @generated
	 */
	EList<InfixExpression_adapted_leftOperandItem> getLeftOperand();

	/**
	 * Returns the value of the '<em><b>Extended Operands</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.InfixExpression_adapted_extendedOperandsItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended Operands</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getInfixExpression_adapted_ExtendedOperands()
	 * @model
	 * @generated
	 */
	EList<InfixExpression_adapted_extendedOperandsItem> getExtendedOperands();

} // InfixExpression_adapted
