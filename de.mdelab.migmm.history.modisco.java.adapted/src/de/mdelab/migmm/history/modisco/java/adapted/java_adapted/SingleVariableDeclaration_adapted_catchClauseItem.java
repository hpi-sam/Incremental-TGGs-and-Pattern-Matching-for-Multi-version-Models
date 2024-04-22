/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import de.mdelab.migmm.history.EdgeWithHistory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Variable Declaration adapted catch Clause Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SingleVariableDeclaration_adapted_catchClauseItem#getCatchClause <em>Catch Clause</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getSingleVariableDeclaration_adapted_catchClauseItem()
 * @model
 * @generated
 */
public interface SingleVariableDeclaration_adapted_catchClauseItem extends EdgeWithHistory {
	/**
	 * Returns the value of the '<em><b>Catch Clause</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catch Clause</em>' reference.
	 * @see #setCatchClause(CatchClause_adapted)
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getSingleVariableDeclaration_adapted_catchClauseItem_CatchClause()
	 * @model required="true"
	 * @generated
	 */
	CatchClause_adapted getCatchClause();

	/**
	 * Sets the value of the '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SingleVariableDeclaration_adapted_catchClauseItem#getCatchClause <em>Catch Clause</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Catch Clause</em>' reference.
	 * @see #getCatchClause()
	 * @generated
	 */
	void setCatchClause(CatchClause_adapted value);

} // SingleVariableDeclaration_adapted_catchClauseItem
