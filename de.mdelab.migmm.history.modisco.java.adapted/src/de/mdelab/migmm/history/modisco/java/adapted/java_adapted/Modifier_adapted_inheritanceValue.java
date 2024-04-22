/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import de.mdelab.migmm.history.AttributeWithHistory;

import org.eclipse.modisco.java.InheritanceKind;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modifier adapted inheritance Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted_inheritanceValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getModifier_adapted_inheritanceValue()
 * @model
 * @generated
 */
public interface Modifier_adapted_inheritanceValue extends AttributeWithHistory {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.modisco.java.InheritanceKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.eclipse.modisco.java.InheritanceKind
	 * @see #setValue(InheritanceKind)
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getModifier_adapted_inheritanceValue_Value()
	 * @model required="true"
	 * @generated
	 */
	InheritanceKind getValue();

	/**
	 * Sets the value of the '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted_inheritanceValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.eclipse.modisco.java.InheritanceKind
	 * @see #getValue()
	 * @generated
	 */
	void setValue(InheritanceKind value);

} // Modifier_adapted_inheritanceValue
