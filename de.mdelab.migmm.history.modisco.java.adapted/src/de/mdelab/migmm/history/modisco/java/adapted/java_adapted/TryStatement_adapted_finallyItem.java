/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import de.mdelab.migmm.history.ContainmentEdgeWithHistory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Try Statement adapted finally Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TryStatement_adapted_finallyItem#getFinally <em>Finally</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getTryStatement_adapted_finallyItem()
 * @model
 * @generated
 */
public interface TryStatement_adapted_finallyItem extends ContainmentEdgeWithHistory {
	/**
	 * Returns the value of the '<em><b>Finally</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finally</em>' reference.
	 * @see #setFinally(Block_adapted)
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getTryStatement_adapted_finallyItem_Finally()
	 * @model required="true"
	 * @generated
	 */
	Block_adapted getFinally();

	/**
	 * Sets the value of the '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TryStatement_adapted_finallyItem#getFinally <em>Finally</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finally</em>' reference.
	 * @see #getFinally()
	 * @generated
	 */
	void setFinally(Block_adapted value);

} // TryStatement_adapted_finallyItem
