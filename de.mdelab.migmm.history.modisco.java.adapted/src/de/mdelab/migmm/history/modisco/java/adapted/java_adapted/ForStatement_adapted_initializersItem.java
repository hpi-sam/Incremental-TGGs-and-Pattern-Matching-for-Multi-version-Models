/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import de.mdelab.migmm.history.ContainmentEdgeWithHistory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Statement adapted initializers Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ForStatement_adapted_initializersItem#getInitializers <em>Initializers</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getForStatement_adapted_initializersItem()
 * @model
 * @generated
 */
public interface ForStatement_adapted_initializersItem extends ContainmentEdgeWithHistory {
	/**
	 * Returns the value of the '<em><b>Initializers</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initializers</em>' reference.
	 * @see #setInitializers(Expression_adapted)
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getForStatement_adapted_initializersItem_Initializers()
	 * @model required="true"
	 * @generated
	 */
	Expression_adapted getInitializers();

	/**
	 * Sets the value of the '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ForStatement_adapted_initializersItem#getInitializers <em>Initializers</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initializers</em>' reference.
	 * @see #getInitializers()
	 * @generated
	 */
	void setInitializers(Expression_adapted value);

} // ForStatement_adapted_initializersItem
