/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wild Card Type adapted</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.WildCardType_adapted#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.WildCardType_adapted#getBound <em>Bound</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getWildCardType_adapted()
 * @model
 * @generated
 */
public interface WildCardType_adapted extends Type_adapted {
	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.WildCardType_adapted_upperBoundValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getWildCardType_adapted_UpperBound()
	 * @model ordered="false"
	 * @generated
	 */
	EList<WildCardType_adapted_upperBoundValue> getUpperBound();

	/**
	 * Returns the value of the '<em><b>Bound</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.WildCardType_adapted_boundItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getWildCardType_adapted_Bound()
	 * @model ordered="false"
	 * @generated
	 */
	EList<WildCardType_adapted_boundItem> getBound();

} // WildCardType_adapted
