/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.StringLiteral_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.StringLiteral_adapted_escapedValueValue;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Literal adapted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.StringLiteral_adaptedImpl#getEscapedValue <em>Escaped Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StringLiteral_adaptedImpl extends Expression_adaptedImpl implements StringLiteral_adapted {
	/**
	 * The cached value of the '{@link #getEscapedValue() <em>Escaped Value</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEscapedValue()
	 * @generated
	 * @ordered
	 */
	protected EList<StringLiteral_adapted_escapedValueValue> escapedValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringLiteral_adaptedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getStringLiteral_adapted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StringLiteral_adapted_escapedValueValue> getEscapedValue() {
		if (escapedValue == null) {
			escapedValue = new EObjectResolvingEList<StringLiteral_adapted_escapedValueValue>(StringLiteral_adapted_escapedValueValue.class, this, Java_adaptedPackage.STRING_LITERAL_ADAPTED__ESCAPED_VALUE);
		}
		return escapedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.STRING_LITERAL_ADAPTED__ESCAPED_VALUE:
				return getEscapedValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_adaptedPackage.STRING_LITERAL_ADAPTED__ESCAPED_VALUE:
				getEscapedValue().clear();
				getEscapedValue().addAll((Collection<? extends StringLiteral_adapted_escapedValueValue>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Java_adaptedPackage.STRING_LITERAL_ADAPTED__ESCAPED_VALUE:
				getEscapedValue().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_adaptedPackage.STRING_LITERAL_ADAPTED__ESCAPED_VALUE:
				return escapedValue != null && !escapedValue.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StringLiteral_adaptedImpl
