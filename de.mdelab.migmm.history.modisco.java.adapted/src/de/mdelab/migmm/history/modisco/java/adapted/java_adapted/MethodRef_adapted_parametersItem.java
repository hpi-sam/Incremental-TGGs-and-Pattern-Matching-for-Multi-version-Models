/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import de.mdelab.migmm.history.ContainmentEdgeWithHistory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Ref adapted parameters Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MethodRef_adapted_parametersItem#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getMethodRef_adapted_parametersItem()
 * @model
 * @generated
 */
public interface MethodRef_adapted_parametersItem extends ContainmentEdgeWithHistory {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' reference.
	 * @see #setParameters(MethodRefParameter_adapted)
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getMethodRef_adapted_parametersItem_Parameters()
	 * @model required="true"
	 * @generated
	 */
	MethodRefParameter_adapted getParameters();

	/**
	 * Sets the value of the '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MethodRef_adapted_parametersItem#getParameters <em>Parameters</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameters</em>' reference.
	 * @see #getParameters()
	 * @generated
	 */
	void setParameters(MethodRefParameter_adapted value);

} // MethodRef_adapted_parametersItem
