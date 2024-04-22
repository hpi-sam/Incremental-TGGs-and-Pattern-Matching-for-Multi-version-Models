/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Variable Declaration adapted</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SingleVariableDeclaration_adapted#getModifier <em>Modifier</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SingleVariableDeclaration_adapted#getVarargs <em>Varargs</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SingleVariableDeclaration_adapted#getType <em>Type</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SingleVariableDeclaration_adapted#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SingleVariableDeclaration_adapted#getMethodDeclaration <em>Method Declaration</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SingleVariableDeclaration_adapted#getCatchClause <em>Catch Clause</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SingleVariableDeclaration_adapted#getEnhancedForStatement <em>Enhanced For Statement</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getSingleVariableDeclaration_adapted()
 * @model
 * @generated
 */
public interface SingleVariableDeclaration_adapted extends VariableDeclaration_adapted {
	/**
	 * Returns the value of the '<em><b>Modifier</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SingleVariableDeclaration_adapted_modifierItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modifier</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getSingleVariableDeclaration_adapted_Modifier()
	 * @model ordered="false"
	 * @generated
	 */
	EList<SingleVariableDeclaration_adapted_modifierItem> getModifier();

	/**
	 * Returns the value of the '<em><b>Varargs</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SingleVariableDeclaration_adapted_varargsValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Varargs</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getSingleVariableDeclaration_adapted_Varargs()
	 * @model ordered="false"
	 * @generated
	 */
	EList<SingleVariableDeclaration_adapted_varargsValue> getVarargs();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SingleVariableDeclaration_adapted_typeItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getSingleVariableDeclaration_adapted_Type()
	 * @model ordered="false"
	 * @generated
	 */
	EList<SingleVariableDeclaration_adapted_typeItem> getType();

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SingleVariableDeclaration_adapted_annotationsItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getSingleVariableDeclaration_adapted_Annotations()
	 * @model
	 * @generated
	 */
	EList<SingleVariableDeclaration_adapted_annotationsItem> getAnnotations();

	/**
	 * Returns the value of the '<em><b>Method Declaration</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SingleVariableDeclaration_adapted_methodDeclarationItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Declaration</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getSingleVariableDeclaration_adapted_MethodDeclaration()
	 * @model ordered="false"
	 * @generated
	 */
	EList<SingleVariableDeclaration_adapted_methodDeclarationItem> getMethodDeclaration();

	/**
	 * Returns the value of the '<em><b>Catch Clause</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SingleVariableDeclaration_adapted_catchClauseItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catch Clause</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getSingleVariableDeclaration_adapted_CatchClause()
	 * @model ordered="false"
	 * @generated
	 */
	EList<SingleVariableDeclaration_adapted_catchClauseItem> getCatchClause();

	/**
	 * Returns the value of the '<em><b>Enhanced For Statement</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SingleVariableDeclaration_adapted_enhancedForStatementItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enhanced For Statement</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getSingleVariableDeclaration_adapted_EnhancedForStatement()
	 * @model ordered="false"
	 * @generated
	 */
	EList<SingleVariableDeclaration_adapted_enhancedForStatementItem> getEnhancedForStatement();

} // SingleVariableDeclaration_adapted
