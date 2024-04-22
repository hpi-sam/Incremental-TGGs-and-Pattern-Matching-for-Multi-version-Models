/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Literal adapted</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.StringLiteral_adapted#getEscapedValue <em>Escaped Value</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getStringLiteral_adapted()
 * @model
 * @generated
 */
public interface StringLiteral_adapted extends Expression_adapted {
	/**
	 * Returns the value of the '<em><b>Escaped Value</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.StringLiteral_adapted_escapedValueValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Escaped Value</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getStringLiteral_adapted_EscapedValue()
	 * @model ordered="false"
	 * @generated
	 */
	EList<StringLiteral_adapted_escapedValueValue> getEscapedValue();

} // StringLiteral_adapted
