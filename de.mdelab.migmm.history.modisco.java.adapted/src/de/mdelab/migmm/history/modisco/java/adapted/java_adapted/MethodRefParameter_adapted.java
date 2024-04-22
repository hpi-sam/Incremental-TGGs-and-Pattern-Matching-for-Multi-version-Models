/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Ref Parameter adapted</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MethodRefParameter_adapted#getName <em>Name</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MethodRefParameter_adapted#getVarargs <em>Varargs</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MethodRefParameter_adapted#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getMethodRefParameter_adapted()
 * @model
 * @generated
 */
public interface MethodRefParameter_adapted extends ASTNode_adapted {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MethodRefParameter_adapted_nameValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getMethodRefParameter_adapted_Name()
	 * @model ordered="false"
	 * @generated
	 */
	EList<MethodRefParameter_adapted_nameValue> getName();

	/**
	 * Returns the value of the '<em><b>Varargs</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MethodRefParameter_adapted_varargsValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Varargs</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getMethodRefParameter_adapted_Varargs()
	 * @model ordered="false"
	 * @generated
	 */
	EList<MethodRefParameter_adapted_varargsValue> getVarargs();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MethodRefParameter_adapted_typeItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getMethodRefParameter_adapted_Type()
	 * @model ordered="false"
	 * @generated
	 */
	EList<MethodRefParameter_adapted_typeItem> getType();

} // MethodRefParameter_adapted
