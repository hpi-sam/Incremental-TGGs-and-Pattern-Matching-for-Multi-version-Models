/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import de.mdelab.migmm.history.ContainmentEdgeWithHistory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Statement adapted else Statement Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.IfStatement_adapted_elseStatementItem#getElseStatement <em>Else Statement</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getIfStatement_adapted_elseStatementItem()
 * @model
 * @generated
 */
public interface IfStatement_adapted_elseStatementItem extends ContainmentEdgeWithHistory {
	/**
	 * Returns the value of the '<em><b>Else Statement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Statement</em>' reference.
	 * @see #setElseStatement(Statement_adapted)
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getIfStatement_adapted_elseStatementItem_ElseStatement()
	 * @model required="true"
	 * @generated
	 */
	Statement_adapted getElseStatement();

	/**
	 * Sets the value of the '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.IfStatement_adapted_elseStatementItem#getElseStatement <em>Else Statement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Statement</em>' reference.
	 * @see #getElseStatement()
	 * @generated
	 */
	void setElseStatement(Statement_adapted value);

} // IfStatement_adapted_elseStatementItem
