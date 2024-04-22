/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import de.mdelab.migmm.history.ContainmentEdgeWithHistory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Method Invocation adapted arguments Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractMethodInvocation_adapted_argumentsItem#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getAbstractMethodInvocation_adapted_argumentsItem()
 * @model
 * @generated
 */
public interface AbstractMethodInvocation_adapted_argumentsItem extends ContainmentEdgeWithHistory {
	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' reference.
	 * @see #setArguments(Expression_adapted)
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getAbstractMethodInvocation_adapted_argumentsItem_Arguments()
	 * @model required="true"
	 * @generated
	 */
	Expression_adapted getArguments();

	/**
	 * Sets the value of the '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractMethodInvocation_adapted_argumentsItem#getArguments <em>Arguments</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arguments</em>' reference.
	 * @see #getArguments()
	 * @generated
	 */
	void setArguments(Expression_adapted value);

} // AbstractMethodInvocation_adapted_argumentsItem
