/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Declaration Statement adapted</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.VariableDeclarationStatement_adapted#getExtraArrayDimensions <em>Extra Array Dimensions</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.VariableDeclarationStatement_adapted#getModifier <em>Modifier</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.VariableDeclarationStatement_adapted#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getVariableDeclarationStatement_adapted()
 * @model
 * @generated
 */
public interface VariableDeclarationStatement_adapted extends Statement_adapted, AbstractVariablesContainer_adapted {
	/**
	 * Returns the value of the '<em><b>Extra Array Dimensions</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.VariableDeclarationStatement_adapted_extraArrayDimensionsValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extra Array Dimensions</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getVariableDeclarationStatement_adapted_ExtraArrayDimensions()
	 * @model ordered="false"
	 * @generated
	 */
	EList<VariableDeclarationStatement_adapted_extraArrayDimensionsValue> getExtraArrayDimensions();

	/**
	 * Returns the value of the '<em><b>Modifier</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.VariableDeclarationStatement_adapted_modifierItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modifier</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getVariableDeclarationStatement_adapted_Modifier()
	 * @model ordered="false"
	 * @generated
	 */
	EList<VariableDeclarationStatement_adapted_modifierItem> getModifier();

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.VariableDeclarationStatement_adapted_annotationsItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getVariableDeclarationStatement_adapted_Annotations()
	 * @model
	 * @generated
	 */
	EList<VariableDeclarationStatement_adapted_annotationsItem> getAnnotations();

} // VariableDeclarationStatement_adapted
