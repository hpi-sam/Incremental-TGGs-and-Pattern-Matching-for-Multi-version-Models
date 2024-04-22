/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Type Member Declaration adapted</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AnnotationTypeMemberDeclaration_adapted#getDefault <em>Default</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AnnotationTypeMemberDeclaration_adapted#getType <em>Type</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AnnotationTypeMemberDeclaration_adapted#getUsages <em>Usages</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getAnnotationTypeMemberDeclaration_adapted()
 * @model
 * @generated
 */
public interface AnnotationTypeMemberDeclaration_adapted extends BodyDeclaration_adapted {
	/**
	 * Returns the value of the '<em><b>Default</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AnnotationTypeMemberDeclaration_adapted_defaultItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getAnnotationTypeMemberDeclaration_adapted_Default()
	 * @model ordered="false"
	 * @generated
	 */
	EList<AnnotationTypeMemberDeclaration_adapted_defaultItem> getDefault();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AnnotationTypeMemberDeclaration_adapted_typeItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getAnnotationTypeMemberDeclaration_adapted_Type()
	 * @model ordered="false"
	 * @generated
	 */
	EList<AnnotationTypeMemberDeclaration_adapted_typeItem> getType();

	/**
	 * Returns the value of the '<em><b>Usages</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AnnotationTypeMemberDeclaration_adapted_usagesItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usages</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getAnnotationTypeMemberDeclaration_adapted_Usages()
	 * @model ordered="false"
	 * @generated
	 */
	EList<AnnotationTypeMemberDeclaration_adapted_usagesItem> getUsages();

} // AnnotationTypeMemberDeclaration_adapted
