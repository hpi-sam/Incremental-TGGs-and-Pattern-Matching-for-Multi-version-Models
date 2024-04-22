/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import de.mdelab.migmm.history.ContainmentEdgeWithHistory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Statement adapted updaters Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ForStatement_adapted_updatersItem#getUpdaters <em>Updaters</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getForStatement_adapted_updatersItem()
 * @model
 * @generated
 */
public interface ForStatement_adapted_updatersItem extends ContainmentEdgeWithHistory {
	/**
	 * Returns the value of the '<em><b>Updaters</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Updaters</em>' reference.
	 * @see #setUpdaters(Expression_adapted)
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getForStatement_adapted_updatersItem_Updaters()
	 * @model required="true"
	 * @generated
	 */
	Expression_adapted getUpdaters();

	/**
	 * Sets the value of the '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ForStatement_adapted_updatersItem#getUpdaters <em>Updaters</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Updaters</em>' reference.
	 * @see #getUpdaters()
	 * @generated
	 */
	void setUpdaters(Expression_adapted value);

} // ForStatement_adapted_updatersItem
