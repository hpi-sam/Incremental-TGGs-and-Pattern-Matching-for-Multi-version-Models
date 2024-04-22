/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.ContainmentEdgeWithHistoryImpl;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ConditionalExpression_adapted_elseExpressionItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Expression_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Expression adapted else Expression Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.ConditionalExpression_adapted_elseExpressionItemImpl#getElseExpression <em>Else Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionalExpression_adapted_elseExpressionItemImpl extends ContainmentEdgeWithHistoryImpl implements ConditionalExpression_adapted_elseExpressionItem {
	/**
	 * The cached value of the '{@link #getElseExpression() <em>Else Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression_adapted elseExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalExpression_adapted_elseExpressionItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getConditionalExpression_adapted_elseExpressionItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression_adapted getElseExpression() {
		if (elseExpression != null && elseExpression.eIsProxy()) {
			InternalEObject oldElseExpression = (InternalEObject)elseExpression;
			elseExpression = (Expression_adapted)eResolveProxy(oldElseExpression);
			if (elseExpression != oldElseExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Java_adaptedPackage.CONDITIONAL_EXPRESSION_ADAPTED_ELSE_EXPRESSION_ITEM__ELSE_EXPRESSION, oldElseExpression, elseExpression));
			}
		}
		return elseExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_adapted basicGetElseExpression() {
		return elseExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElseExpression(Expression_adapted newElseExpression) {
		Expression_adapted oldElseExpression = elseExpression;
		elseExpression = newElseExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_adaptedPackage.CONDITIONAL_EXPRESSION_ADAPTED_ELSE_EXPRESSION_ITEM__ELSE_EXPRESSION, oldElseExpression, elseExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.CONDITIONAL_EXPRESSION_ADAPTED_ELSE_EXPRESSION_ITEM__ELSE_EXPRESSION:
				if (resolve) return getElseExpression();
				return basicGetElseExpression();
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
			case Java_adaptedPackage.CONDITIONAL_EXPRESSION_ADAPTED_ELSE_EXPRESSION_ITEM__ELSE_EXPRESSION:
				setElseExpression((Expression_adapted)newValue);
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
			case Java_adaptedPackage.CONDITIONAL_EXPRESSION_ADAPTED_ELSE_EXPRESSION_ITEM__ELSE_EXPRESSION:
				setElseExpression((Expression_adapted)null);
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
			case Java_adaptedPackage.CONDITIONAL_EXPRESSION_ADAPTED_ELSE_EXPRESSION_ITEM__ELSE_EXPRESSION:
				return elseExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //ConditionalExpression_adapted_elseExpressionItemImpl
