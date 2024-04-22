/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Literal adapted</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.NumberLiteral_adapted#getTokenValue <em>Token Value</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getNumberLiteral_adapted()
 * @model
 * @generated
 */
public interface NumberLiteral_adapted extends Expression_adapted {
	/**
	 * Returns the value of the '<em><b>Token Value</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.NumberLiteral_adapted_tokenValueValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token Value</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getNumberLiteral_adapted_TokenValue()
	 * @model ordered="false"
	 * @generated
	 */
	EList<NumberLiteral_adapted_tokenValueValue> getTokenValue();

} // NumberLiteral_adapted
