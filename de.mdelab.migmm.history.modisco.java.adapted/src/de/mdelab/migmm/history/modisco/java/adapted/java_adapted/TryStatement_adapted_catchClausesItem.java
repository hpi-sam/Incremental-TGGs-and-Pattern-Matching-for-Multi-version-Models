/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import de.mdelab.migmm.history.ContainmentEdgeWithHistory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Try Statement adapted catch Clauses Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TryStatement_adapted_catchClausesItem#getCatchClauses <em>Catch Clauses</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getTryStatement_adapted_catchClausesItem()
 * @model
 * @generated
 */
public interface TryStatement_adapted_catchClausesItem extends ContainmentEdgeWithHistory {
	/**
	 * Returns the value of the '<em><b>Catch Clauses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catch Clauses</em>' reference.
	 * @see #setCatchClauses(CatchClause_adapted)
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getTryStatement_adapted_catchClausesItem_CatchClauses()
	 * @model required="true"
	 * @generated
	 */
	CatchClause_adapted getCatchClauses();

	/**
	 * Sets the value of the '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TryStatement_adapted_catchClausesItem#getCatchClauses <em>Catch Clauses</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Catch Clauses</em>' reference.
	 * @see #getCatchClauses()
	 * @generated
	 */
	void setCatchClauses(CatchClause_adapted value);

} // TryStatement_adapted_catchClausesItem
