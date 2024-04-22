/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Instance Creation adapted</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ClassInstanceCreation_adapted#getAnonymousClassDeclaration <em>Anonymous Class Declaration</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ClassInstanceCreation_adapted#getExpression <em>Expression</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ClassInstanceCreation_adapted#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getClassInstanceCreation_adapted()
 * @model
 * @generated
 */
public interface ClassInstanceCreation_adapted extends Expression_adapted, AbstractMethodInvocation_adapted {
	/**
	 * Returns the value of the '<em><b>Anonymous Class Declaration</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ClassInstanceCreation_adapted_anonymousClassDeclarationItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anonymous Class Declaration</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getClassInstanceCreation_adapted_AnonymousClassDeclaration()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ClassInstanceCreation_adapted_anonymousClassDeclarationItem> getAnonymousClassDeclaration();

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ClassInstanceCreation_adapted_expressionItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getClassInstanceCreation_adapted_Expression()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ClassInstanceCreation_adapted_expressionItem> getExpression();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ClassInstanceCreation_adapted_typeItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getClassInstanceCreation_adapted_Type()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ClassInstanceCreation_adapted_typeItem> getType();

} // ClassInstanceCreation_adapted
