/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Declaration adapted</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.VariableDeclaration_adapted#getExtraArrayDimensions <em>Extra Array Dimensions</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.VariableDeclaration_adapted#getInitializer <em>Initializer</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.VariableDeclaration_adapted#getUsageInVariableAccess <em>Usage In Variable Access</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getVariableDeclaration_adapted()
 * @model abstract="true"
 * @generated
 */
public interface VariableDeclaration_adapted extends NamedElement_adapted {
	/**
	 * Returns the value of the '<em><b>Extra Array Dimensions</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.VariableDeclaration_adapted_extraArrayDimensionsValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extra Array Dimensions</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getVariableDeclaration_adapted_ExtraArrayDimensions()
	 * @model ordered="false"
	 * @generated
	 */
	EList<VariableDeclaration_adapted_extraArrayDimensionsValue> getExtraArrayDimensions();

	/**
	 * Returns the value of the '<em><b>Initializer</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.VariableDeclaration_adapted_initializerItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initializer</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getVariableDeclaration_adapted_Initializer()
	 * @model ordered="false"
	 * @generated
	 */
	EList<VariableDeclaration_adapted_initializerItem> getInitializer();

	/**
	 * Returns the value of the '<em><b>Usage In Variable Access</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.VariableDeclaration_adapted_usageInVariableAccessItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage In Variable Access</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getVariableDeclaration_adapted_UsageInVariableAccess()
	 * @model ordered="false"
	 * @generated
	 */
	EList<VariableDeclaration_adapted_usageInVariableAccessItem> getUsageInVariableAccess();

} // VariableDeclaration_adapted
