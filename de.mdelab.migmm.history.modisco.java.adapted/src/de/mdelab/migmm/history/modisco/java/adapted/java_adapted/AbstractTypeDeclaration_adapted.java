/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Type Declaration adapted</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractTypeDeclaration_adapted#getBodyDeclarations <em>Body Declarations</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractTypeDeclaration_adapted#getCommentsBeforeBody <em>Comments Before Body</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractTypeDeclaration_adapted#getCommentsAfterBody <em>Comments After Body</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractTypeDeclaration_adapted#getPackage <em>Package</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractTypeDeclaration_adapted#getSuperInterfaces <em>Super Interfaces</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getAbstractTypeDeclaration_adapted()
 * @model abstract="true"
 * @generated
 */
public interface AbstractTypeDeclaration_adapted extends BodyDeclaration_adapted, Type_adapted {
	/**
	 * Returns the value of the '<em><b>Body Declarations</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractTypeDeclaration_adapted_bodyDeclarationsItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body Declarations</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getAbstractTypeDeclaration_adapted_BodyDeclarations()
	 * @model
	 * @generated
	 */
	EList<AbstractTypeDeclaration_adapted_bodyDeclarationsItem> getBodyDeclarations();

	/**
	 * Returns the value of the '<em><b>Comments Before Body</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractTypeDeclaration_adapted_commentsBeforeBodyItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments Before Body</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getAbstractTypeDeclaration_adapted_CommentsBeforeBody()
	 * @model
	 * @generated
	 */
	EList<AbstractTypeDeclaration_adapted_commentsBeforeBodyItem> getCommentsBeforeBody();

	/**
	 * Returns the value of the '<em><b>Comments After Body</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractTypeDeclaration_adapted_commentsAfterBodyItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments After Body</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getAbstractTypeDeclaration_adapted_CommentsAfterBody()
	 * @model
	 * @generated
	 */
	EList<AbstractTypeDeclaration_adapted_commentsAfterBodyItem> getCommentsAfterBody();

	/**
	 * Returns the value of the '<em><b>Package</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractTypeDeclaration_adapted_packageItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getAbstractTypeDeclaration_adapted_Package()
	 * @model ordered="false"
	 * @generated
	 */
	EList<AbstractTypeDeclaration_adapted_packageItem> getPackage();

	/**
	 * Returns the value of the '<em><b>Super Interfaces</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractTypeDeclaration_adapted_superInterfacesItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Interfaces</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getAbstractTypeDeclaration_adapted_SuperInterfaces()
	 * @model
	 * @generated
	 */
	EList<AbstractTypeDeclaration_adapted_superInterfacesItem> getSuperInterfaces();

} // AbstractTypeDeclaration_adapted
