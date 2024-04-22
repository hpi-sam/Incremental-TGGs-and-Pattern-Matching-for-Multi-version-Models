/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import de.mdelab.migmm.history.ContainmentEdgeWithHistory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Creation adapted initializer Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ArrayCreation_adapted_initializerItem#getInitializer <em>Initializer</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getArrayCreation_adapted_initializerItem()
 * @model
 * @generated
 */
public interface ArrayCreation_adapted_initializerItem extends ContainmentEdgeWithHistory {
	/**
	 * Returns the value of the '<em><b>Initializer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initializer</em>' reference.
	 * @see #setInitializer(ArrayInitializer_adapted)
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getArrayCreation_adapted_initializerItem_Initializer()
	 * @model required="true"
	 * @generated
	 */
	ArrayInitializer_adapted getInitializer();

	/**
	 * Sets the value of the '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ArrayCreation_adapted_initializerItem#getInitializer <em>Initializer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initializer</em>' reference.
	 * @see #getInitializer()
	 * @generated
	 */
	void setInitializer(ArrayInitializer_adapted value);

} // ArrayCreation_adapted_initializerItem
