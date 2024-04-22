/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.ContainmentEdgeWithHistoryImpl;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ConditionalExpression_adapted_thenExpressionItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Expression_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Expression adapted then Expression Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.ConditionalExpression_adapted_thenExpressionItemImpl#getThenExpression <em>Then Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionalExpression_adapted_thenExpressionItemImpl extends ContainmentEdgeWithHistoryImpl implements ConditionalExpression_adapted_thenExpressionItem {
	/**
	 * The cached value of the '{@link #getThenExpression() <em>Then Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThenExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression_adapted thenExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalExpression_adapted_thenExpressionItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getConditionalExpression_adapted_thenExpressionItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression_adapted getThenExpression() {
		if (thenExpression != null && thenExpression.eIsProxy()) {
			InternalEObject oldThenExpression = (InternalEObject)thenExpression;
			thenExpression = (Expression_adapted)eResolveProxy(oldThenExpression);
			if (thenExpression != oldThenExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Java_adaptedPackage.CONDITIONAL_EXPRESSION_ADAPTED_THEN_EXPRESSION_ITEM__THEN_EXPRESSION, oldThenExpression, thenExpression));
			}
		}
		return thenExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_adapted basicGetThenExpression() {
		return thenExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThenExpression(Expression_adapted newThenExpression) {
		Expression_adapted oldThenExpression = thenExpression;
		thenExpression = newThenExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_adaptedPackage.CONDITIONAL_EXPRESSION_ADAPTED_THEN_EXPRESSION_ITEM__THEN_EXPRESSION, oldThenExpression, thenExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.CONDITIONAL_EXPRESSION_ADAPTED_THEN_EXPRESSION_ITEM__THEN_EXPRESSION:
				if (resolve) return getThenExpression();
				return basicGetThenExpression();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_adaptedPackage.CONDITIONAL_EXPRESSION_ADAPTED_THEN_EXPRESSION_ITEM__THEN_EXPRESSION:
				setThenExpression((Expression_adapted)newValue);
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
			case Java_adaptedPackage.CONDITIONAL_EXPRESSION_ADAPTED_THEN_EXPRESSION_ITEM__THEN_EXPRESSION:
				setThenExpression((Expression_adapted)null);
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
			case Java_adaptedPackage.CONDITIONAL_EXPRESSION_ADAPTED_THEN_EXPRESSION_ITEM__THEN_EXPRESSION:
				return thenExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //ConditionalExpression_adapted_thenExpressionItemImpl
