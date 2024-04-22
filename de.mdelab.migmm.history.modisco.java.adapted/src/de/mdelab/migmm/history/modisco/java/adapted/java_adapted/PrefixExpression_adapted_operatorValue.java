/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import de.mdelab.migmm.history.AttributeWithHistory;

import org.eclipse.modisco.java.PrefixExpressionKind;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prefix Expression adapted operator Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.PrefixExpression_adapted_operatorValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getPrefixExpression_adapted_operatorValue()
 * @model
 * @generated
 */
public interface PrefixExpression_adapted_operatorValue extends AttributeWithHistory {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.modisco.java.PrefixExpressionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.eclipse.modisco.java.PrefixExpressionKind
	 * @see #setValue(PrefixExpressionKind)
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getPrefixExpression_adapted_operatorValue_Value()
	 * @model required="true"
	 * @generated
	 */
	PrefixExpressionKind getValue();

	/**
	 * Sets the value of the '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.PrefixExpression_adapted_operatorValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.eclipse.modisco.java.PrefixExpressionKind
	 * @see #getValue()
	 * @generated
	 */
	void setValue(PrefixExpressionKind value);

} // PrefixExpression_adapted_operatorValue
