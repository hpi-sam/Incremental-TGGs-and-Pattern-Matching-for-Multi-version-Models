/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import de.mdelab.migmm.history.ContainmentEdgeWithHistory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enhanced For Statement adapted parameter Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.EnhancedForStatement_adapted_parameterItem#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getEnhancedForStatement_adapted_parameterItem()
 * @model
 * @generated
 */
public interface EnhancedForStatement_adapted_parameterItem extends ContainmentEdgeWithHistory {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(SingleVariableDeclaration_adapted)
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getEnhancedForStatement_adapted_parameterItem_Parameter()
	 * @model required="true"
	 * @generated
	 */
	SingleVariableDeclaration_adapted getParameter();

	/**
	 * Sets the value of the '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.EnhancedForStatement_adapted_parameterItem#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(SingleVariableDeclaration_adapted value);

} // EnhancedForStatement_adapted_parameterItem
