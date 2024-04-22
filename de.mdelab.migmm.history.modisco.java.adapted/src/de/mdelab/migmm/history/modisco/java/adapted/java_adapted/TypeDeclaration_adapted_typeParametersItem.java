/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import de.mdelab.migmm.history.ContainmentEdgeWithHistory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Declaration adapted type Parameters Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TypeDeclaration_adapted_typeParametersItem#getTypeParameters <em>Type Parameters</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getTypeDeclaration_adapted_typeParametersItem()
 * @model
 * @generated
 */
public interface TypeDeclaration_adapted_typeParametersItem extends ContainmentEdgeWithHistory {
	/**
	 * Returns the value of the '<em><b>Type Parameters</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Parameters</em>' reference.
	 * @see #setTypeParameters(TypeParameter_adapted)
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getTypeDeclaration_adapted_typeParametersItem_TypeParameters()
	 * @model required="true"
	 * @generated
	 */
	TypeParameter_adapted getTypeParameters();

	/**
	 * Sets the value of the '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TypeDeclaration_adapted_typeParametersItem#getTypeParameters <em>Type Parameters</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Parameters</em>' reference.
	 * @see #getTypeParameters()
	 * @generated
	 */
	void setTypeParameters(TypeParameter_adapted value);

} // TypeDeclaration_adapted_typeParametersItem
