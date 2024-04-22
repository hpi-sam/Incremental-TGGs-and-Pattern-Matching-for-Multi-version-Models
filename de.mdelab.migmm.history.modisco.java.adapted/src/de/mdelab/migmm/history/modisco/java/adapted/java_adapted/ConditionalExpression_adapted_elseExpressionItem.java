/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import de.mdelab.migmm.history.ContainmentEdgeWithHistory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Expression adapted else Expression Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ConditionalExpression_adapted_elseExpressionItem#getElseExpression <em>Else Expression</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getConditionalExpression_adapted_elseExpressionItem()
 * @model
 * @generated
 */
public interface ConditionalExpression_adapted_elseExpressionItem extends ContainmentEdgeWithHistory {
	/**
	 * Returns the value of the '<em><b>Else Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Expression</em>' reference.
	 * @see #setElseExpression(Expression_adapted)
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getConditionalExpression_adapted_elseExpressionItem_ElseExpression()
	 * @model required="true"
	 * @generated
	 */
	Expression_adapted getElseExpression();

	/**
	 * Sets the value of the '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ConditionalExpression_adapted_elseExpressionItem#getElseExpression <em>Else Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Expression</em>' reference.
	 * @see #getElseExpression()
	 * @generated
	 */
	void setElseExpression(Expression_adapted value);

} // ConditionalExpression_adapted_elseExpressionItem
