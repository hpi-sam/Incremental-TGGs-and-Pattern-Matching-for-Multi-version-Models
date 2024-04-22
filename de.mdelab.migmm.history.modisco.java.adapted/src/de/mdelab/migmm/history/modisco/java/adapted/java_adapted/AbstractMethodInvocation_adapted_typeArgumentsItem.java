/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import de.mdelab.migmm.history.ContainmentEdgeWithHistory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Method Invocation adapted type Arguments Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractMethodInvocation_adapted_typeArgumentsItem#getTypeArguments <em>Type Arguments</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getAbstractMethodInvocation_adapted_typeArgumentsItem()
 * @model
 * @generated
 */
public interface AbstractMethodInvocation_adapted_typeArgumentsItem extends ContainmentEdgeWithHistory {
	/**
	 * Returns the value of the '<em><b>Type Arguments</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Arguments</em>' reference.
	 * @see #setTypeArguments(TypeAccess_adapted)
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getAbstractMethodInvocation_adapted_typeArgumentsItem_TypeArguments()
	 * @model required="true"
	 * @generated
	 */
	TypeAccess_adapted getTypeArguments();

	/**
	 * Sets the value of the '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractMethodInvocation_adapted_typeArgumentsItem#getTypeArguments <em>Type Arguments</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Arguments</em>' reference.
	 * @see #getTypeArguments()
	 * @generated
	 */
	void setTypeArguments(TypeAccess_adapted value);

} // AbstractMethodInvocation_adapted_typeArgumentsItem
