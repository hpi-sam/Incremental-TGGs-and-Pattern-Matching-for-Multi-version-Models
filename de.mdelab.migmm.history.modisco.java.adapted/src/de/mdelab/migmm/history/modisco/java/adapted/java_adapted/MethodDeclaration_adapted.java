/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Declaration adapted</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MethodDeclaration_adapted#getExtraArrayDimensions <em>Extra Array Dimensions</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MethodDeclaration_adapted#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MethodDeclaration_adapted#getRedefinedMethodDeclaration <em>Redefined Method Declaration</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MethodDeclaration_adapted#getRedefinitions <em>Redefinitions</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getMethodDeclaration_adapted()
 * @model
 * @generated
 */
public interface MethodDeclaration_adapted extends AbstractMethodDeclaration_adapted {
	/**
	 * Returns the value of the '<em><b>Extra Array Dimensions</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MethodDeclaration_adapted_extraArrayDimensionsValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extra Array Dimensions</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getMethodDeclaration_adapted_ExtraArrayDimensions()
	 * @model ordered="false"
	 * @generated
	 */
	EList<MethodDeclaration_adapted_extraArrayDimensionsValue> getExtraArrayDimensions();

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MethodDeclaration_adapted_returnTypeItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getMethodDeclaration_adapted_ReturnType()
	 * @model ordered="false"
	 * @generated
	 */
	EList<MethodDeclaration_adapted_returnTypeItem> getReturnType();

	/**
	 * Returns the value of the '<em><b>Redefined Method Declaration</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MethodDeclaration_adapted_redefinedMethodDeclarationItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redefined Method Declaration</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getMethodDeclaration_adapted_RedefinedMethodDeclaration()
	 * @model ordered="false"
	 * @generated
	 */
	EList<MethodDeclaration_adapted_redefinedMethodDeclarationItem> getRedefinedMethodDeclaration();

	/**
	 * Returns the value of the '<em><b>Redefinitions</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MethodDeclaration_adapted_redefinitionsItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redefinitions</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getMethodDeclaration_adapted_Redefinitions()
	 * @model ordered="false"
	 * @generated
	 */
	EList<MethodDeclaration_adapted_redefinitionsItem> getRedefinitions();

} // MethodDeclaration_adapted
