/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Expression adapted</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ConditionalExpression_adapted#getElseExpression <em>Else Expression</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ConditionalExpression_adapted#getExpression <em>Expression</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ConditionalExpression_adapted#getThenExpression <em>Then Expression</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getConditionalExpression_adapted()
 * @model
 * @generated
 */
public interface ConditionalExpression_adapted extends Expression_adapted {
	/**
	 * Returns the value of the '<em><b>Else Expression</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ConditionalExpression_adapted_elseExpressionItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Expression</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getConditionalExpression_adapted_ElseExpression()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ConditionalExpression_adapted_elseExpressionItem> getElseExpression();

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ConditionalExpression_adapted_expressionItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getConditionalExpression_adapted_Expression()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ConditionalExpression_adapted_expressionItem> getExpression();

	/**
	 * Returns the value of the '<em><b>Then Expression</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ConditionalExpression_adapted_thenExpressionItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then Expression</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getConditionalExpression_adapted_ThenExpression()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ConditionalExpression_adapted_thenExpressionItem> getThenExpression();

} // ConditionalExpression_adapted
