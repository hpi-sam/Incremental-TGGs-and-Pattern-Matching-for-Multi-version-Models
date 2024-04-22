/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import de.mdelab.migmm.history.ContainmentEdgeWithHistory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return Statement adapted expression Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ReturnStatement_adapted_expressionItem#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getReturnStatement_adapted_expressionItem()
 * @model
 * @generated
 */
public interface ReturnStatement_adapted_expressionItem extends ContainmentEdgeWithHistory {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' reference.
	 * @see #setExpression(Expression_adapted)
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getReturnStatement_adapted_expressionItem_Expression()
	 * @model required="true"
	 * @generated
	 */
	Expression_adapted getExpression();

	/**
	 * Sets the value of the '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ReturnStatement_adapted_expressionItem#getExpression <em>Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression_adapted value);

} // ReturnStatement_adapted_expressionItem
