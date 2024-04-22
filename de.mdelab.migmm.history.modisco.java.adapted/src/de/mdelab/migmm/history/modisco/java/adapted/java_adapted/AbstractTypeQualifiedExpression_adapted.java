/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Type Qualified Expression adapted</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractTypeQualifiedExpression_adapted#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getAbstractTypeQualifiedExpression_adapted()
 * @model abstract="true"
 * @generated
 */
public interface AbstractTypeQualifiedExpression_adapted extends Expression_adapted {
	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractTypeQualifiedExpression_adapted_qualifierItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getAbstractTypeQualifiedExpression_adapted_Qualifier()
	 * @model ordered="false"
	 * @generated
	 */
	EList<AbstractTypeQualifiedExpression_adapted_qualifierItem> getQualifier();

} // AbstractTypeQualifiedExpression_adapted
