/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import de.mdelab.migmm.history.EdgeWithHistory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Labeled Statement adapted usages In Break Statements Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.LabeledStatement_adapted_usagesInBreakStatementsItem#getUsagesInBreakStatements <em>Usages In Break Statements</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getLabeledStatement_adapted_usagesInBreakStatementsItem()
 * @model
 * @generated
 */
public interface LabeledStatement_adapted_usagesInBreakStatementsItem extends EdgeWithHistory {
	/**
	 * Returns the value of the '<em><b>Usages In Break Statements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usages In Break Statements</em>' reference.
	 * @see #setUsagesInBreakStatements(BreakStatement_adapted)
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getLabeledStatement_adapted_usagesInBreakStatementsItem_UsagesInBreakStatements()
	 * @model required="true"
	 * @generated
	 */
	BreakStatement_adapted getUsagesInBreakStatements();

	/**
	 * Sets the value of the '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.LabeledStatement_adapted_usagesInBreakStatementsItem#getUsagesInBreakStatements <em>Usages In Break Statements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usages In Break Statements</em>' reference.
	 * @see #getUsagesInBreakStatements()
	 * @generated
	 */
	void setUsagesInBreakStatements(BreakStatement_adapted value);

} // LabeledStatement_adapted_usagesInBreakStatementsItem
