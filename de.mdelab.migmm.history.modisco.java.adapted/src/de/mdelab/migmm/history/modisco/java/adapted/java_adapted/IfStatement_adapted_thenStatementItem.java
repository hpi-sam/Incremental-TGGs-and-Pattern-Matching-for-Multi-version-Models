/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import de.mdelab.migmm.history.ContainmentEdgeWithHistory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Statement adapted then Statement Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.IfStatement_adapted_thenStatementItem#getThenStatement <em>Then Statement</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getIfStatement_adapted_thenStatementItem()
 * @model
 * @generated
 */
public interface IfStatement_adapted_thenStatementItem extends ContainmentEdgeWithHistory {
	/**
	 * Returns the value of the '<em><b>Then Statement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then Statement</em>' reference.
	 * @see #setThenStatement(Statement_adapted)
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getIfStatement_adapted_thenStatementItem_ThenStatement()
	 * @model required="true"
	 * @generated
	 */
	Statement_adapted getThenStatement();

	/**
	 * Sets the value of the '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.IfStatement_adapted_thenStatementItem#getThenStatement <em>Then Statement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then Statement</em>' reference.
	 * @see #getThenStatement()
	 * @generated
	 */
	void setThenStatement(Statement_adapted value);

} // IfStatement_adapted_thenStatementItem
