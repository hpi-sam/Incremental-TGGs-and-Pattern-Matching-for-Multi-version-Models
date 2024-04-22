/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anonymous Class Declaration adapted</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AnonymousClassDeclaration_adapted#getBodyDeclarations <em>Body Declarations</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AnonymousClassDeclaration_adapted#getClassInstanceCreation <em>Class Instance Creation</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getAnonymousClassDeclaration_adapted()
 * @model
 * @generated
 */
public interface AnonymousClassDeclaration_adapted extends ASTNode_adapted {
	/**
	 * Returns the value of the '<em><b>Body Declarations</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AnonymousClassDeclaration_adapted_bodyDeclarationsItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body Declarations</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getAnonymousClassDeclaration_adapted_BodyDeclarations()
	 * @model
	 * @generated
	 */
	EList<AnonymousClassDeclaration_adapted_bodyDeclarationsItem> getBodyDeclarations();

	/**
	 * Returns the value of the '<em><b>Class Instance Creation</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AnonymousClassDeclaration_adapted_classInstanceCreationItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Instance Creation</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getAnonymousClassDeclaration_adapted_ClassInstanceCreation()
	 * @model ordered="false"
	 * @generated
	 */
	EList<AnonymousClassDeclaration_adapted_classInstanceCreationItem> getClassInstanceCreation();

} // AnonymousClassDeclaration_adapted
