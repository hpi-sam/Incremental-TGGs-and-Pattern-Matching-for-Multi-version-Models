/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modifier adapted</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted#getInheritance <em>Inheritance</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted#getStatic <em>Static</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted#getTransient <em>Transient</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted#getVolatile <em>Volatile</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted#getNative <em>Native</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted#getStrictfp <em>Strictfp</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted#getSynchronized <em>Synchronized</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted#getBodyDeclaration <em>Body Declaration</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted#getSingleVariableDeclaration <em>Single Variable Declaration</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted#getVariableDeclarationStatement <em>Variable Declaration Statement</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted#getVariableDeclarationExpression <em>Variable Declaration Expression</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getModifier_adapted()
 * @model
 * @generated
 */
public interface Modifier_adapted extends ASTNode_adapted {
	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted_visibilityValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getModifier_adapted_Visibility()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Modifier_adapted_visibilityValue> getVisibility();

	/**
	 * Returns the value of the '<em><b>Inheritance</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted_inheritanceValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inheritance</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getModifier_adapted_Inheritance()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Modifier_adapted_inheritanceValue> getInheritance();

	/**
	 * Returns the value of the '<em><b>Static</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted_staticValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getModifier_adapted_Static()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Modifier_adapted_staticValue> getStatic();

	/**
	 * Returns the value of the '<em><b>Transient</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted_transientValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transient</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getModifier_adapted_Transient()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Modifier_adapted_transientValue> getTransient();

	/**
	 * Returns the value of the '<em><b>Volatile</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted_volatileValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volatile</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getModifier_adapted_Volatile()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Modifier_adapted_volatileValue> getVolatile();

	/**
	 * Returns the value of the '<em><b>Native</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted_nativeValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Native</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getModifier_adapted_Native()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Modifier_adapted_nativeValue> getNative();

	/**
	 * Returns the value of the '<em><b>Strictfp</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted_strictfpValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strictfp</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getModifier_adapted_Strictfp()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Modifier_adapted_strictfpValue> getStrictfp();

	/**
	 * Returns the value of the '<em><b>Synchronized</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted_synchronizedValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synchronized</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getModifier_adapted_Synchronized()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Modifier_adapted_synchronizedValue> getSynchronized();

	/**
	 * Returns the value of the '<em><b>Body Declaration</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted_bodyDeclarationItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body Declaration</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getModifier_adapted_BodyDeclaration()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Modifier_adapted_bodyDeclarationItem> getBodyDeclaration();

	/**
	 * Returns the value of the '<em><b>Single Variable Declaration</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted_singleVariableDeclarationItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Single Variable Declaration</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getModifier_adapted_SingleVariableDeclaration()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Modifier_adapted_singleVariableDeclarationItem> getSingleVariableDeclaration();

	/**
	 * Returns the value of the '<em><b>Variable Declaration Statement</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted_variableDeclarationStatementItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Declaration Statement</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getModifier_adapted_VariableDeclarationStatement()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Modifier_adapted_variableDeclarationStatementItem> getVariableDeclarationStatement();

	/**
	 * Returns the value of the '<em><b>Variable Declaration Expression</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted_variableDeclarationExpressionItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Declaration Expression</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getModifier_adapted_VariableDeclarationExpression()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Modifier_adapted_variableDeclarationExpressionItem> getVariableDeclarationExpression();

} // Modifier_adapted
