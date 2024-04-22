/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.NumberLiteral_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.NumberLiteral_adapted_tokenValueValue;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Number Literal adapted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.NumberLiteral_adaptedImpl#getTokenValue <em>Token Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NumberLiteral_adaptedImpl extends Expression_adaptedImpl implements NumberLiteral_adapted {
	/**
	 * The cached value of the '{@link #getTokenValue() <em>Token Value</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenValue()
	 * @generated
	 * @ordered
	 */
	protected EList<NumberLiteral_adapted_tokenValueValue> tokenValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumberLiteral_adaptedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getNumberLiteral_adapted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NumberLiteral_adapted_tokenValueValue> getTokenValue() {
		if (tokenValue == null) {
			tokenValue = new EObjectResolvingEList<NumberLiteral_adapted_tokenValueValue>(NumberLiteral_adapted_tokenValueValue.class, this, Java_adaptedPackage.NUMBER_LITERAL_ADAPTED__TOKEN_VALUE);
		}
		return tokenValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.NUMBER_LITERAL_ADAPTED__TOKEN_VALUE:
				return getTokenValue();
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
			case Java_adaptedPackage.NUMBER_LITERAL_ADAPTED__TOKEN_VALUE:
				getTokenValue().clear();
				getTokenValue().addAll((Collection<? extends NumberLiteral_adapted_tokenValueValue>)newValue);
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
			case Java_adaptedPackage.NUMBER_LITERAL_ADAPTED__TOKEN_VALUE:
				getTokenValue().clear();
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
			case Java_adaptedPackage.NUMBER_LITERAL_ADAPTED__TOKEN_VALUE:
				return tokenValue != null && !tokenValue.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NumberLiteral_adaptedImpl
