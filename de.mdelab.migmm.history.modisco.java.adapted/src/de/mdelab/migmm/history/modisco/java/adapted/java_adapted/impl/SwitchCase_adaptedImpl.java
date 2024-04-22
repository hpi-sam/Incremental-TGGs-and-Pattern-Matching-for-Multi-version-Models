/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SwitchCase_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SwitchCase_adapted_defaultValue;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SwitchCase_adapted_expressionItem;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switch Case adapted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.SwitchCase_adaptedImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.SwitchCase_adaptedImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwitchCase_adaptedImpl extends Statement_adaptedImpl implements SwitchCase_adapted {
	/**
	 * The cached value of the '{@link #getDefault() <em>Default</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected EList<SwitchCase_adapted_defaultValue> default_;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected EList<SwitchCase_adapted_expressionItem> expression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwitchCase_adaptedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getSwitchCase_adapted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SwitchCase_adapted_defaultValue> getDefault() {
		if (default_ == null) {
			default_ = new EObjectResolvingEList<SwitchCase_adapted_defaultValue>(SwitchCase_adapted_defaultValue.class, this, Java_adaptedPackage.SWITCH_CASE_ADAPTED__DEFAULT);
		}
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SwitchCase_adapted_expressionItem> getExpression() {
		if (expression == null) {
			expression = new EObjectResolvingEList<SwitchCase_adapted_expressionItem>(SwitchCase_adapted_expressionItem.class, this, Java_adaptedPackage.SWITCH_CASE_ADAPTED__EXPRESSION);
		}
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.SWITCH_CASE_ADAPTED__DEFAULT:
				return getDefault();
			case Java_adaptedPackage.SWITCH_CASE_ADAPTED__EXPRESSION:
				return getExpression();
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
			case Java_adaptedPackage.SWITCH_CASE_ADAPTED__DEFAULT:
				getDefault().clear();
				getDefault().addAll((Collection<? extends SwitchCase_adapted_defaultValue>)newValue);
				return;
			case Java_adaptedPackage.SWITCH_CASE_ADAPTED__EXPRESSION:
				getExpression().clear();
				getExpression().addAll((Collection<? extends SwitchCase_adapted_expressionItem>)newValue);
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
			case Java_adaptedPackage.SWITCH_CASE_ADAPTED__DEFAULT:
				getDefault().clear();
				return;
			case Java_adaptedPackage.SWITCH_CASE_ADAPTED__EXPRESSION:
				getExpression().clear();
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
			case Java_adaptedPackage.SWITCH_CASE_ADAPTED__DEFAULT:
				return default_ != null && !default_.isEmpty();
			case Java_adaptedPackage.SWITCH_CASE_ADAPTED__EXPRESSION:
				return expression != null && !expression.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SwitchCase_adaptedImpl
