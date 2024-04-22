/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import de.mdelab.migmm.history.AttributeWithHistory;

import org.eclipse.modisco.java.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modifier adapted visibility Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted_visibilityValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getModifier_adapted_visibilityValue()
 * @model
 * @generated
 */
public interface Modifier_adapted_visibilityValue extends AttributeWithHistory {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.modisco.java.VisibilityKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.eclipse.modisco.java.VisibilityKind
	 * @see #setValue(VisibilityKind)
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getModifier_adapted_visibilityValue_Value()
	 * @model required="true"
	 * @generated
	 */
	VisibilityKind getValue();

	/**
	 * Sets the value of the '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted_visibilityValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.eclipse.modisco.java.VisibilityKind
	 * @see #getValue()
	 * @generated
	 */
	void setValue(VisibilityKind value);

} // Modifier_adapted_visibilityValue
