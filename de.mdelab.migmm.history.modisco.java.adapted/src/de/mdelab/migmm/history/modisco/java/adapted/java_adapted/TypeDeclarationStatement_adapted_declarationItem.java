/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import de.mdelab.migmm.history.ContainmentEdgeWithHistory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Declaration Statement adapted declaration Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TypeDeclarationStatement_adapted_declarationItem#getDeclaration <em>Declaration</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getTypeDeclarationStatement_adapted_declarationItem()
 * @model
 * @generated
 */
public interface TypeDeclarationStatement_adapted_declarationItem extends ContainmentEdgeWithHistory {
	/**
	 * Returns the value of the '<em><b>Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declaration</em>' reference.
	 * @see #setDeclaration(AbstractTypeDeclaration_adapted)
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getTypeDeclarationStatement_adapted_declarationItem_Declaration()
	 * @model required="true"
	 * @generated
	 */
	AbstractTypeDeclaration_adapted getDeclaration();

	/**
	 * Sets the value of the '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TypeDeclarationStatement_adapted_declarationItem#getDeclaration <em>Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declaration</em>' reference.
	 * @see #getDeclaration()
	 * @generated
	 */
	void setDeclaration(AbstractTypeDeclaration_adapted value);

} // TypeDeclarationStatement_adapted_declarationItem
