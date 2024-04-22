/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import de.mdelab.migmm.history.EdgeWithHistory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Method Declaration adapted usages Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractMethodDeclaration_adapted_usagesItem#getUsages <em>Usages</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getAbstractMethodDeclaration_adapted_usagesItem()
 * @model
 * @generated
 */
public interface AbstractMethodDeclaration_adapted_usagesItem extends EdgeWithHistory {
	/**
	 * Returns the value of the '<em><b>Usages</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usages</em>' reference.
	 * @see #setUsages(AbstractMethodInvocation_adapted)
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getAbstractMethodDeclaration_adapted_usagesItem_Usages()
	 * @model required="true"
	 * @generated
	 */
	AbstractMethodInvocation_adapted getUsages();

	/**
	 * Sets the value of the '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractMethodDeclaration_adapted_usagesItem#getUsages <em>Usages</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usages</em>' reference.
	 * @see #getUsages()
	 * @generated
	 */
	void setUsages(AbstractMethodInvocation_adapted value);

} // AbstractMethodDeclaration_adapted_usagesItem
