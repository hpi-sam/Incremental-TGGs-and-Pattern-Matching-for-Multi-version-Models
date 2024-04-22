/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import de.mdelab.migmm.history.ContainmentEdgeWithHistory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Infix Expression adapted extended Operands Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.InfixExpression_adapted_extendedOperandsItem#getExtendedOperands <em>Extended Operands</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getInfixExpression_adapted_extendedOperandsItem()
 * @model
 * @generated
 */
public interface InfixExpression_adapted_extendedOperandsItem extends ContainmentEdgeWithHistory {
	/**
	 * Returns the value of the '<em><b>Extended Operands</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended Operands</em>' reference.
	 * @see #setExtendedOperands(Expression_adapted)
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getInfixExpression_adapted_extendedOperandsItem_ExtendedOperands()
	 * @model required="true"
	 * @generated
	 */
	Expression_adapted getExtendedOperands();

	/**
	 * Sets the value of the '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.InfixExpression_adapted_extendedOperandsItem#getExtendedOperands <em>Extended Operands</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended Operands</em>' reference.
	 * @see #getExtendedOperands()
	 * @generated
	 */
	void setExtendedOperands(Expression_adapted value);

} // InfixExpression_adapted_extendedOperandsItem
