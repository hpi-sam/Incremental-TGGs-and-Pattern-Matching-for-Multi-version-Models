/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Declaration adapted</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TypeDeclaration_adapted#getTypeParameters <em>Type Parameters</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getTypeDeclaration_adapted()
 * @model abstract="true"
 * @generated
 */
public interface TypeDeclaration_adapted extends AbstractTypeDeclaration_adapted {
	/**
	 * Returns the value of the '<em><b>Type Parameters</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TypeDeclaration_adapted_typeParametersItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Parameters</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getTypeDeclaration_adapted_TypeParameters()
	 * @model
	 * @generated
	 */
	EList<TypeDeclaration_adapted_typeParametersItem> getTypeParameters();

} // TypeDeclaration_adapted
