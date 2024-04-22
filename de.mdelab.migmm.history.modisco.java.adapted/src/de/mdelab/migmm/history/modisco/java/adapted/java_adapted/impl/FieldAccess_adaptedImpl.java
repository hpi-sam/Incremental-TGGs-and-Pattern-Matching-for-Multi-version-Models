/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.FieldAccess_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.FieldAccess_adapted_expressionItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.FieldAccess_adapted_fieldItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field Access adapted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.FieldAccess_adaptedImpl#getField <em>Field</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.FieldAccess_adaptedImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FieldAccess_adaptedImpl extends Expression_adaptedImpl implements FieldAccess_adapted {
	/**
	 * The cached value of the '{@link #getField() <em>Field</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getField()
	 * @generated
	 * @ordered
	 */
	protected EList<FieldAccess_adapted_fieldItem> field;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected EList<FieldAccess_adapted_expressionItem> expression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldAccess_adaptedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getFieldAccess_adapted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FieldAccess_adapted_fieldItem> getField() {
		if (field == null) {
			field = new EObjectResolvingEList<FieldAccess_adapted_fieldItem>(FieldAccess_adapted_fieldItem.class, this, Java_adaptedPackage.FIELD_ACCESS_ADAPTED__FIELD);
		}
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FieldAccess_adapted_expressionItem> getExpression() {
		if (expression == null) {
			expression = new EObjectResolvingEList<FieldAccess_adapted_expressionItem>(FieldAccess_adapted_expressionItem.class, this, Java_adaptedPackage.FIELD_ACCESS_ADAPTED__EXPRESSION);
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
			case Java_adaptedPackage.FIELD_ACCESS_ADAPTED__FIELD:
				return getField();
			case Java_adaptedPackage.FIELD_ACCESS_ADAPTED__EXPRESSION:
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
			case Java_adaptedPackage.FIELD_ACCESS_ADAPTED__FIELD:
				getField().clear();
				getField().addAll((Collection<? extends FieldAccess_adapted_fieldItem>)newValue);
				return;
			case Java_adaptedPackage.FIELD_ACCESS_ADAPTED__EXPRESSION:
				getExpression().clear();
				getExpression().addAll((Collection<? extends FieldAccess_adapted_expressionItem>)newValue);
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
			case Java_adaptedPackage.FIELD_ACCESS_ADAPTED__FIELD:
				getField().clear();
				return;
			case Java_adaptedPackage.FIELD_ACCESS_ADAPTED__EXPRESSION:
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
			case Java_adaptedPackage.FIELD_ACCESS_ADAPTED__FIELD:
				return field != null && !field.isEmpty();
			case Java_adaptedPackage.FIELD_ACCESS_ADAPTED__EXPRESSION:
				return expression != null && !expression.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FieldAccess_adaptedImpl
