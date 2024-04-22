/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Body Declaration adapted</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.BodyDeclaration_adapted#getAbstractTypeDeclaration <em>Abstract Type Declaration</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.BodyDeclaration_adapted#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.BodyDeclaration_adapted#getAnonymousClassDeclarationOwner <em>Anonymous Class Declaration Owner</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.BodyDeclaration_adapted#getModifier <em>Modifier</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getBodyDeclaration_adapted()
 * @model abstract="true"
 * @generated
 */
public interface BodyDeclaration_adapted extends NamedElement_adapted {
	/**
	 * Returns the value of the '<em><b>Abstract Type Declaration</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.BodyDeclaration_adapted_abstractTypeDeclarationItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Type Declaration</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getBodyDeclaration_adapted_AbstractTypeDeclaration()
	 * @model ordered="false"
	 * @generated
	 */
	EList<BodyDeclaration_adapted_abstractTypeDeclarationItem> getAbstractTypeDeclaration();

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.BodyDeclaration_adapted_annotationsItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getBodyDeclaration_adapted_Annotations()
	 * @model
	 * @generated
	 */
	EList<BodyDeclaration_adapted_annotationsItem> getAnnotations();

	/**
	 * Returns the value of the '<em><b>Anonymous Class Declaration Owner</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.BodyDeclaration_adapted_anonymousClassDeclarationOwnerItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anonymous Class Declaration Owner</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getBodyDeclaration_adapted_AnonymousClassDeclarationOwner()
	 * @model ordered="false"
	 * @generated
	 */
	EList<BodyDeclaration_adapted_anonymousClassDeclarationOwnerItem> getAnonymousClassDeclarationOwner();

	/**
	 * Returns the value of the '<em><b>Modifier</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.BodyDeclaration_adapted_modifierItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modifier</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getBodyDeclaration_adapted_Modifier()
	 * @model ordered="false"
	 * @generated
	 */
	EList<BodyDeclaration_adapted_modifierItem> getModifier();

} // BodyDeclaration_adapted
