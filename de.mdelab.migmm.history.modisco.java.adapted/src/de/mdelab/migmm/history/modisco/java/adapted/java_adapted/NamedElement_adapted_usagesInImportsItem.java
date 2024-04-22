/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import de.mdelab.migmm.history.EdgeWithHistory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Element adapted usages In Imports Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.NamedElement_adapted_usagesInImportsItem#getUsagesInImports <em>Usages In Imports</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getNamedElement_adapted_usagesInImportsItem()
 * @model
 * @generated
 */
public interface NamedElement_adapted_usagesInImportsItem extends EdgeWithHistory {
	/**
	 * Returns the value of the '<em><b>Usages In Imports</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usages In Imports</em>' reference.
	 * @see #setUsagesInImports(ImportDeclaration_adapted)
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getNamedElement_adapted_usagesInImportsItem_UsagesInImports()
	 * @model required="true"
	 * @generated
	 */
	ImportDeclaration_adapted getUsagesInImports();

	/**
	 * Sets the value of the '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.NamedElement_adapted_usagesInImportsItem#getUsagesInImports <em>Usages In Imports</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usages In Imports</em>' reference.
	 * @see #getUsagesInImports()
	 * @generated
	 */
	void setUsagesInImports(ImportDeclaration_adapted value);

} // NamedElement_adapted_usagesInImportsItem
