/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import de.mdelab.migmm.history.ContainmentEdgeWithHistory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Type Qualified Expression adapted qualifier Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractTypeQualifiedExpression_adapted_qualifierItem#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getAbstractTypeQualifiedExpression_adapted_qualifierItem()
 * @model
 * @generated
 */
public interface AbstractTypeQualifiedExpression_adapted_qualifierItem extends ContainmentEdgeWithHistory {
	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier</em>' reference.
	 * @see #setQualifier(TypeAccess_adapted)
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getAbstractTypeQualifiedExpression_adapted_qualifierItem_Qualifier()
	 * @model required="true"
	 * @generated
	 */
	TypeAccess_adapted getQualifier();

	/**
	 * Sets the value of the '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractTypeQualifiedExpression_adapted_qualifierItem#getQualifier <em>Qualifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifier</em>' reference.
	 * @see #getQualifier()
	 * @generated
	 */
	void setQualifier(TypeAccess_adapted value);

} // AbstractTypeQualifiedExpression_adapted_qualifierItem
