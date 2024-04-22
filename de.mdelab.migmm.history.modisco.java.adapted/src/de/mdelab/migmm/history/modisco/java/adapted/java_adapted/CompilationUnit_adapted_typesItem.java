/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import de.mdelab.migmm.history.EdgeWithHistory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compilation Unit adapted types Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.CompilationUnit_adapted_typesItem#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getCompilationUnit_adapted_typesItem()
 * @model
 * @generated
 */
public interface CompilationUnit_adapted_typesItem extends EdgeWithHistory {
	/**
	 * Returns the value of the '<em><b>Types</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' reference.
	 * @see #setTypes(AbstractTypeDeclaration_adapted)
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getCompilationUnit_adapted_typesItem_Types()
	 * @model required="true"
	 * @generated
	 */
	AbstractTypeDeclaration_adapted getTypes();

	/**
	 * Sets the value of the '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.CompilationUnit_adapted_typesItem#getTypes <em>Types</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Types</em>' reference.
	 * @see #getTypes()
	 * @generated
	 */
	void setTypes(AbstractTypeDeclaration_adapted value);

} // CompilationUnit_adapted_typesItem
