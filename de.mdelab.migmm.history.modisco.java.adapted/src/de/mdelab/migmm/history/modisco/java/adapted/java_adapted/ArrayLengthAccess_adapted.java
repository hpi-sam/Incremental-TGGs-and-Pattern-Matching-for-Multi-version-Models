/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Length Access adapted</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ArrayLengthAccess_adapted#getArray <em>Array</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getArrayLengthAccess_adapted()
 * @model
 * @generated
 */
public interface ArrayLengthAccess_adapted extends Expression_adapted {
	/**
	 * Returns the value of the '<em><b>Array</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ArrayLengthAccess_adapted_arrayItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getArrayLengthAccess_adapted_Array()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ArrayLengthAccess_adapted_arrayItem> getArray();

} // ArrayLengthAccess_adapted
