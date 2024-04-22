/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import de.mdelab.migmm.history.ContainmentEdgeWithHistory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compilation Unit adapted imports Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.CompilationUnit_adapted_importsItem#getImports <em>Imports</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getCompilationUnit_adapted_importsItem()
 * @model
 * @generated
 */
public interface CompilationUnit_adapted_importsItem extends ContainmentEdgeWithHistory {
	/**
	 * Returns the value of the '<em><b>Imports</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' reference.
	 * @see #setImports(ImportDeclaration_adapted)
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getCompilationUnit_adapted_importsItem_Imports()
	 * @model required="true"
	 * @generated
	 */
	ImportDeclaration_adapted getImports();

	/**
	 * Sets the value of the '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.CompilationUnit_adapted_importsItem#getImports <em>Imports</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imports</em>' reference.
	 * @see #getImports()
	 * @generated
	 */
	void setImports(ImportDeclaration_adapted value);

} // CompilationUnit_adapted_importsItem
