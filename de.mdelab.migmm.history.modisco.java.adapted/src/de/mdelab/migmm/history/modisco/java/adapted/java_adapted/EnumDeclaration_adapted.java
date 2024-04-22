/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Declaration adapted</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.EnumDeclaration_adapted#getEnumConstants <em>Enum Constants</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getEnumDeclaration_adapted()
 * @model
 * @generated
 */
public interface EnumDeclaration_adapted extends AbstractTypeDeclaration_adapted {
	/**
	 * Returns the value of the '<em><b>Enum Constants</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.EnumDeclaration_adapted_enumConstantsItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Constants</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getEnumDeclaration_adapted_EnumConstants()
	 * @model
	 * @generated
	 */
	EList<EnumDeclaration_adapted_enumConstantsItem> getEnumConstants();

} // EnumDeclaration_adapted
