/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import de.mdelab.migmm.history.ContainmentEdgeWithHistory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block adapted statements Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Block_adapted_statementsItem#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getBlock_adapted_statementsItem()
 * @model
 * @generated
 */
public interface Block_adapted_statementsItem extends ContainmentEdgeWithHistory {
	/**
	 * Returns the value of the '<em><b>Statements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' reference.
	 * @see #setStatements(Statement_adapted)
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getBlock_adapted_statementsItem_Statements()
	 * @model required="true"
	 * @generated
	 */
	Statement_adapted getStatements();

	/**
	 * Sets the value of the '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Block_adapted_statementsItem#getStatements <em>Statements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statements</em>' reference.
	 * @see #getStatements()
	 * @generated
	 */
	void setStatements(Statement_adapted value);

} // Block_adapted_statementsItem
