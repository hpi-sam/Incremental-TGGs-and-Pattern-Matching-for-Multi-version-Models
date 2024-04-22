/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Declaration Fragment adapted</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.VariableDeclarationFragment_adapted#getVariablesContainer <em>Variables Container</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getVariableDeclarationFragment_adapted()
 * @model
 * @generated
 */
public interface VariableDeclarationFragment_adapted extends VariableDeclaration_adapted {
	/**
	 * Returns the value of the '<em><b>Variables Container</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.VariableDeclarationFragment_adapted_variablesContainerItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables Container</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getVariableDeclarationFragment_adapted_VariablesContainer()
	 * @model ordered="false"
	 * @generated
	 */
	EList<VariableDeclarationFragment_adapted_variablesContainerItem> getVariablesContainer();

} // VariableDeclarationFragment_adapted
