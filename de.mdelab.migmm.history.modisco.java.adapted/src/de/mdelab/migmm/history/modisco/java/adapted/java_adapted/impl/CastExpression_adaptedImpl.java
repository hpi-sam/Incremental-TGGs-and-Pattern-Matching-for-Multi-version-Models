/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.CastExpression_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.CastExpression_adapted_expressionItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.CastExpression_adapted_typeItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cast Expression adapted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.CastExpression_adaptedImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.CastExpression_adaptedImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CastExpression_adaptedImpl extends Expression_adaptedImpl implements CastExpression_adapted {
	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected EList<CastExpression_adapted_expressionItem> expression;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EList<CastExpression_adapted_typeItem> type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CastExpression_adaptedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getCastExpression_adapted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CastExpression_adapted_expressionItem> getExpression() {
		if (expression == null) {
			expression = new EObjectResolvingEList<CastExpression_adapted_expressionItem>(CastExpression_adapted_expressionItem.class, this, Java_adaptedPackage.CAST_EXPRESSION_ADAPTED__EXPRESSION);
		}
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CastExpression_adapted_typeItem> getType() {
		if (type == null) {
			type = new EObjectResolvingEList<CastExpression_adapted_typeItem>(CastExpression_adapted_typeItem.class, this, Java_adaptedPackage.CAST_EXPRESSION_ADAPTED__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.CAST_EXPRESSION_ADAPTED__EXPRESSION:
				return getExpression();
			case Java_adaptedPackage.CAST_EXPRESSION_ADAPTED__TYPE:
				return getType();
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
			case Java_adaptedPackage.CAST_EXPRESSION_ADAPTED__EXPRESSION:
				getExpression().clear();
				getExpression().addAll((Collection<? extends CastExpression_adapted_expressionItem>)newValue);
				return;
			case Java_adaptedPackage.CAST_EXPRESSION_ADAPTED__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends CastExpression_adapted_typeItem>)newValue);
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
			case Java_adaptedPackage.CAST_EXPRESSION_ADAPTED__EXPRESSION:
				getExpression().clear();
				return;
			case Java_adaptedPackage.CAST_EXPRESSION_ADAPTED__TYPE:
				getType().clear();
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
			case Java_adaptedPackage.CAST_EXPRESSION_ADAPTED__EXPRESSION:
				return expression != null && !expression.isEmpty();
			case Java_adaptedPackage.CAST_EXPRESSION_ADAPTED__TYPE:
				return type != null && !type.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CastExpression_adaptedImpl
