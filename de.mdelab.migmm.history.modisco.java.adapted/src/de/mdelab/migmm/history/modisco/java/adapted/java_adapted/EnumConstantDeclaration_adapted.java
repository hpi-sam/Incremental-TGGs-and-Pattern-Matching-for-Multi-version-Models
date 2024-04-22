/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Constant Declaration adapted</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.EnumConstantDeclaration_adapted#getAnonymousClassDeclaration <em>Anonymous Class Declaration</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.EnumConstantDeclaration_adapted#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getEnumConstantDeclaration_adapted()
 * @model
 * @generated
 */
public interface EnumConstantDeclaration_adapted extends BodyDeclaration_adapted, VariableDeclaration_adapted {
	/**
	 * Returns the value of the '<em><b>Anonymous Class Declaration</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.EnumConstantDeclaration_adapted_anonymousClassDeclarationItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anonymous Class Declaration</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getEnumConstantDeclaration_adapted_AnonymousClassDeclaration()
	 * @model ordered="false"
	 * @generated
	 */
	EList<EnumConstantDeclaration_adapted_anonymousClassDeclarationItem> getAnonymousClassDeclaration();

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.EnumConstantDeclaration_adapted_argumentsItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getEnumConstantDeclaration_adapted_Arguments()
	 * @model
	 * @generated
	 */
	EList<EnumConstantDeclaration_adapted_argumentsItem> getArguments();

} // EnumConstantDeclaration_adapted
