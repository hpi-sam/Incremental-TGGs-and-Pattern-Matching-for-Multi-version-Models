/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Declaration Statement adapted</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TypeDeclarationStatement_adapted#getDeclaration <em>Declaration</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getTypeDeclarationStatement_adapted()
 * @model
 * @generated
 */
public interface TypeDeclarationStatement_adapted extends Statement_adapted {
	/**
	 * Returns the value of the '<em><b>Declaration</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TypeDeclarationStatement_adapted_declarationItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declaration</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getTypeDeclarationStatement_adapted_Declaration()
	 * @model ordered="false"
	 * @generated
	 */
	EList<TypeDeclarationStatement_adapted_declarationItem> getDeclaration();

} // TypeDeclarationStatement_adapted
