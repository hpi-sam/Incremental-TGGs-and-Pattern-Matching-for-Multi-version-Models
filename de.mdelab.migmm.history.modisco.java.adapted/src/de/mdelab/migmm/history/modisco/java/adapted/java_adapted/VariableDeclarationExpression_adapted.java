/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Declaration Expression adapted</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.VariableDeclarationExpression_adapted#getModifier <em>Modifier</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.VariableDeclarationExpression_adapted#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getVariableDeclarationExpression_adapted()
 * @model
 * @generated
 */
public interface VariableDeclarationExpression_adapted extends Expression_adapted, AbstractVariablesContainer_adapted {
	/**
	 * Returns the value of the '<em><b>Modifier</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.VariableDeclarationExpression_adapted_modifierItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modifier</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getVariableDeclarationExpression_adapted_Modifier()
	 * @model ordered="false"
	 * @generated
	 */
	EList<VariableDeclarationExpression_adapted_modifierItem> getModifier();

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.VariableDeclarationExpression_adapted_annotationsItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getVariableDeclarationExpression_adapted_Annotations()
	 * @model
	 * @generated
	 */
	EList<VariableDeclarationExpression_adapted_annotationsItem> getAnnotations();

} // VariableDeclarationExpression_adapted
