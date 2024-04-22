/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Statement adapted</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.IfStatement_adapted#getExpression <em>Expression</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.IfStatement_adapted#getThenStatement <em>Then Statement</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.IfStatement_adapted#getElseStatement <em>Else Statement</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getIfStatement_adapted()
 * @model
 * @generated
 */
public interface IfStatement_adapted extends Statement_adapted {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.IfStatement_adapted_expressionItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getIfStatement_adapted_Expression()
	 * @model ordered="false"
	 * @generated
	 */
	EList<IfStatement_adapted_expressionItem> getExpression();

	/**
	 * Returns the value of the '<em><b>Then Statement</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.IfStatement_adapted_thenStatementItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then Statement</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getIfStatement_adapted_ThenStatement()
	 * @model ordered="false"
	 * @generated
	 */
	EList<IfStatement_adapted_thenStatementItem> getThenStatement();

	/**
	 * Returns the value of the '<em><b>Else Statement</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.IfStatement_adapted_elseStatementItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Statement</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getIfStatement_adapted_ElseStatement()
	 * @model ordered="false"
	 * @generated
	 */
	EList<IfStatement_adapted_elseStatementItem> getElseStatement();

} // IfStatement_adapted
