/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import de.mdelab.migmm.history.EdgeWithHistory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Declaration adapted usage In Variable Access Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.VariableDeclaration_adapted_usageInVariableAccessItem#getUsageInVariableAccess <em>Usage In Variable Access</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getVariableDeclaration_adapted_usageInVariableAccessItem()
 * @model
 * @generated
 */
public interface VariableDeclaration_adapted_usageInVariableAccessItem extends EdgeWithHistory {
	/**
	 * Returns the value of the '<em><b>Usage In Variable Access</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage In Variable Access</em>' reference.
	 * @see #setUsageInVariableAccess(SingleVariableAccess_adapted)
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getVariableDeclaration_adapted_usageInVariableAccessItem_UsageInVariableAccess()
	 * @model required="true"
	 * @generated
	 */
	SingleVariableAccess_adapted getUsageInVariableAccess();

	/**
	 * Sets the value of the '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.VariableDeclaration_adapted_usageInVariableAccessItem#getUsageInVariableAccess <em>Usage In Variable Access</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage In Variable Access</em>' reference.
	 * @see #getUsageInVariableAccess()
	 * @generated
	 */
	void setUsageInVariableAccess(SingleVariableAccess_adapted value);

} // VariableDeclaration_adapted_usageInVariableAccessItem
