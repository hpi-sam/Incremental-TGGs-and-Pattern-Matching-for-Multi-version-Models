/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Super Field Access adapted</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SuperFieldAccess_adapted#getField <em>Field</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getSuperFieldAccess_adapted()
 * @model
 * @generated
 */
public interface SuperFieldAccess_adapted extends AbstractTypeQualifiedExpression_adapted {
	/**
	 * Returns the value of the '<em><b>Field</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SuperFieldAccess_adapted_fieldItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getSuperFieldAccess_adapted_Field()
	 * @model ordered="false"
	 * @generated
	 */
	EList<SuperFieldAccess_adapted_fieldItem> getField();

} // SuperFieldAccess_adapted
