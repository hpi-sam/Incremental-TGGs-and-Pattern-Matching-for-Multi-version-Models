/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instanceof Expression adapted</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.InstanceofExpression_adapted#getRightOperand <em>Right Operand</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.InstanceofExpression_adapted#getLeftOperand <em>Left Operand</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getInstanceofExpression_adapted()
 * @model
 * @generated
 */
public interface InstanceofExpression_adapted extends Expression_adapted {
	/**
	 * Returns the value of the '<em><b>Right Operand</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.InstanceofExpression_adapted_rightOperandItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Operand</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getInstanceofExpression_adapted_RightOperand()
	 * @model ordered="false"
	 * @generated
	 */
	EList<InstanceofExpression_adapted_rightOperandItem> getRightOperand();

	/**
	 * Returns the value of the '<em><b>Left Operand</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.InstanceofExpression_adapted_leftOperandItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Operand</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getInstanceofExpression_adapted_LeftOperand()
	 * @model ordered="false"
	 * @generated
	 */
	EList<InstanceofExpression_adapted_leftOperandItem> getLeftOperand();

} // InstanceofExpression_adapted
