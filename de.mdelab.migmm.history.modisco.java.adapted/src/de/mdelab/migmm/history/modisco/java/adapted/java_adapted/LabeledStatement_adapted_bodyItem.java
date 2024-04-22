/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import de.mdelab.migmm.history.ContainmentEdgeWithHistory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Labeled Statement adapted body Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.LabeledStatement_adapted_bodyItem#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getLabeledStatement_adapted_bodyItem()
 * @model
 * @generated
 */
public interface LabeledStatement_adapted_bodyItem extends ContainmentEdgeWithHistory {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' reference.
	 * @see #setBody(Statement_adapted)
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getLabeledStatement_adapted_bodyItem_Body()
	 * @model required="true"
	 * @generated
	 */
	Statement_adapted getBody();

	/**
	 * Sets the value of the '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.LabeledStatement_adapted_bodyItem#getBody <em>Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(Statement_adapted value);

} // LabeledStatement_adapted_bodyItem
