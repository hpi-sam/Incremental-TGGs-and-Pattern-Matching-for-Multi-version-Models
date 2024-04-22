/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import de.mdelab.migmm.history.ContainmentEdgeWithHistory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Creation adapted dimensions Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ArrayCreation_adapted_dimensionsItem#getDimensions <em>Dimensions</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getArrayCreation_adapted_dimensionsItem()
 * @model
 * @generated
 */
public interface ArrayCreation_adapted_dimensionsItem extends ContainmentEdgeWithHistory {
	/**
	 * Returns the value of the '<em><b>Dimensions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimensions</em>' reference.
	 * @see #setDimensions(Expression_adapted)
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getArrayCreation_adapted_dimensionsItem_Dimensions()
	 * @model required="true"
	 * @generated
	 */
	Expression_adapted getDimensions();

	/**
	 * Sets the value of the '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ArrayCreation_adapted_dimensionsItem#getDimensions <em>Dimensions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimensions</em>' reference.
	 * @see #getDimensions()
	 * @generated
	 */
	void setDimensions(Expression_adapted value);

} // ArrayCreation_adapted_dimensionsItem
