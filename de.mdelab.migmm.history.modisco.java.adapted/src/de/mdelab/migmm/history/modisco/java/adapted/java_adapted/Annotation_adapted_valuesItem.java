/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import de.mdelab.migmm.history.ContainmentEdgeWithHistory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation adapted values Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Annotation_adapted_valuesItem#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getAnnotation_adapted_valuesItem()
 * @model
 * @generated
 */
public interface Annotation_adapted_valuesItem extends ContainmentEdgeWithHistory {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' reference.
	 * @see #setValues(AnnotationMemberValuePair_adapted)
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getAnnotation_adapted_valuesItem_Values()
	 * @model required="true"
	 * @generated
	 */
	AnnotationMemberValuePair_adapted getValues();

	/**
	 * Sets the value of the '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Annotation_adapted_valuesItem#getValues <em>Values</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Values</em>' reference.
	 * @see #getValues()
	 * @generated
	 */
	void setValues(AnnotationMemberValuePair_adapted value);

} // Annotation_adapted_valuesItem
