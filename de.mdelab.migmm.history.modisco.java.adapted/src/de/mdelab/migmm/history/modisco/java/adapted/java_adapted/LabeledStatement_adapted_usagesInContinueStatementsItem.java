/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import de.mdelab.migmm.history.EdgeWithHistory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Labeled Statement adapted usages In Continue Statements Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.LabeledStatement_adapted_usagesInContinueStatementsItem#getUsagesInContinueStatements <em>Usages In Continue Statements</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getLabeledStatement_adapted_usagesInContinueStatementsItem()
 * @model
 * @generated
 */
public interface LabeledStatement_adapted_usagesInContinueStatementsItem extends EdgeWithHistory {
	/**
	 * Returns the value of the '<em><b>Usages In Continue Statements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usages In Continue Statements</em>' reference.
	 * @see #setUsagesInContinueStatements(ContinueStatement_adapted)
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getLabeledStatement_adapted_usagesInContinueStatementsItem_UsagesInContinueStatements()
	 * @model required="true"
	 * @generated
	 */
	ContinueStatement_adapted getUsagesInContinueStatements();

	/**
	 * Sets the value of the '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.LabeledStatement_adapted_usagesInContinueStatementsItem#getUsagesInContinueStatements <em>Usages In Continue Statements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usages In Continue Statements</em>' reference.
	 * @see #getUsagesInContinueStatements()
	 * @generated
	 */
	void setUsagesInContinueStatements(ContinueStatement_adapted value);

} // LabeledStatement_adapted_usagesInContinueStatementsItem
