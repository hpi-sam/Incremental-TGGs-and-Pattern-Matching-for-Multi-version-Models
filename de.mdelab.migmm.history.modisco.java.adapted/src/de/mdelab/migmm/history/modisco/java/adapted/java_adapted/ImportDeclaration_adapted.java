/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import Declaration adapted</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ImportDeclaration_adapted#getStatic <em>Static</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ImportDeclaration_adapted#getImportedElement <em>Imported Element</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getImportDeclaration_adapted()
 * @model
 * @generated
 */
public interface ImportDeclaration_adapted extends ASTNode_adapted {
	/**
	 * Returns the value of the '<em><b>Static</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ImportDeclaration_adapted_staticValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getImportDeclaration_adapted_Static()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ImportDeclaration_adapted_staticValue> getStatic();

	/**
	 * Returns the value of the '<em><b>Imported Element</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ImportDeclaration_adapted_importedElementItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Element</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getImportDeclaration_adapted_ImportedElement()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ImportDeclaration_adapted_importedElementItem> getImportedElement();

} // ImportDeclaration_adapted
