/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Element adapted</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.NamedElement_adapted#getName <em>Name</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.NamedElement_adapted#getProxy <em>Proxy</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.NamedElement_adapted#getUsagesInImports <em>Usages In Imports</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getNamedElement_adapted()
 * @model abstract="true"
 * @generated
 */
public interface NamedElement_adapted extends ASTNode_adapted {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.NamedElement_adapted_nameValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getNamedElement_adapted_Name()
	 * @model ordered="false"
	 * @generated
	 */
	EList<NamedElement_adapted_nameValue> getName();

	/**
	 * Returns the value of the '<em><b>Proxy</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.NamedElement_adapted_proxyValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proxy</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getNamedElement_adapted_Proxy()
	 * @model ordered="false"
	 * @generated
	 */
	EList<NamedElement_adapted_proxyValue> getProxy();

	/**
	 * Returns the value of the '<em><b>Usages In Imports</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.NamedElement_adapted_usagesInImportsItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usages In Imports</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getNamedElement_adapted_UsagesInImports()
	 * @model ordered="false"
	 * @generated
	 */
	EList<NamedElement_adapted_usagesInImportsItem> getUsagesInImports();

} // NamedElement_adapted
