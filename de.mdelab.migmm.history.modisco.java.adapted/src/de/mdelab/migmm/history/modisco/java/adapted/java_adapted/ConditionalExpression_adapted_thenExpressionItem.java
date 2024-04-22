/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import de.mdelab.migmm.history.ContainmentEdgeWithHistory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Expression adapted then Expression Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ConditionalExpression_adapted_thenExpressionItem#getThenExpression <em>Then Expression</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getConditionalExpression_adapted_thenExpressionItem()
 * @model
 * @generated
 */
public interface ConditionalExpression_adapted_thenExpressionItem extends ContainmentEdgeWithHistory {
	/**
	 * Returns the value of the '<em><b>Then Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then Expression</em>' reference.
	 * @see #setThenExpression(Expression_adapted)
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getConditionalExpression_adapted_thenExpressionItem_ThenExpression()
	 * @model required="true"
	 * @generated
	 */
	Expression_adapted getThenExpression();

	/**
	 * Sets the value of the '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ConditionalExpression_adapted_thenExpressionItem#getThenExpression <em>Then Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then Expression</em>' reference.
	 * @see #getThenExpression()
	 * @generated
	 */
	void setThenExpression(Expression_adapted value);

} // ConditionalExpression_adapted_thenExpressionItem
