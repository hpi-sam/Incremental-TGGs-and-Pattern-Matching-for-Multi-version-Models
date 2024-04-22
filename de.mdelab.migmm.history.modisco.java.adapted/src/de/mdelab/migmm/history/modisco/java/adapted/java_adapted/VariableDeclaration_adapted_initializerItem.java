/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import de.mdelab.migmm.history.ContainmentEdgeWithHistory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Declaration adapted initializer Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.VariableDeclaration_adapted_initializerItem#getInitializer <em>Initializer</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getVariableDeclaration_adapted_initializerItem()
 * @model
 * @generated
 */
public interface VariableDeclaration_adapted_initializerItem extends ContainmentEdgeWithHistory {
	/**
	 * Returns the value of the '<em><b>Initializer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initializer</em>' reference.
	 * @see #setInitializer(Expression_adapted)
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getVariableDeclaration_adapted_initializerItem_Initializer()
	 * @model required="true"
	 * @generated
	 */
	Expression_adapted getInitializer();

	/**
	 * Sets the value of the '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.VariableDeclaration_adapted_initializerItem#getInitializer <em>Initializer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initializer</em>' reference.
	 * @see #getInitializer()
	 * @generated
	 */
	void setInitializer(Expression_adapted value);

} // VariableDeclaration_adapted_initializerItem
