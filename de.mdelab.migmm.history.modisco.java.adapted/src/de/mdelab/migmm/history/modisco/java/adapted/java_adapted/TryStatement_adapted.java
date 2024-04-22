/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Try Statement adapted</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TryStatement_adapted#getBody <em>Body</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TryStatement_adapted#getFinally <em>Finally</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TryStatement_adapted#getCatchClauses <em>Catch Clauses</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getTryStatement_adapted()
 * @model
 * @generated
 */
public interface TryStatement_adapted extends Statement_adapted {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TryStatement_adapted_bodyItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getTryStatement_adapted_Body()
	 * @model ordered="false"
	 * @generated
	 */
	EList<TryStatement_adapted_bodyItem> getBody();

	/**
	 * Returns the value of the '<em><b>Finally</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TryStatement_adapted_finallyItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finally</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getTryStatement_adapted_Finally()
	 * @model ordered="false"
	 * @generated
	 */
	EList<TryStatement_adapted_finallyItem> getFinally();

	/**
	 * Returns the value of the '<em><b>Catch Clauses</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TryStatement_adapted_catchClausesItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catch Clauses</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getTryStatement_adapted_CatchClauses()
	 * @model
	 * @generated
	 */
	EList<TryStatement_adapted_catchClausesItem> getCatchClauses();

} // TryStatement_adapted
