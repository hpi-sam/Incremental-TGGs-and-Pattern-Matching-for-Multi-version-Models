/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.ContainmentEdgeWithHistoryImpl;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ArrayInitializer_adapted_expressionsItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Expression_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Initializer adapted expressions Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.ArrayInitializer_adapted_expressionsItemImpl#getExpressions <em>Expressions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrayInitializer_adapted_expressionsItemImpl extends ContainmentEdgeWithHistoryImpl implements ArrayInitializer_adapted_expressionsItem {
	/**
	 * The cached value of the '{@link #getExpressions() <em>Expressions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressions()
	 * @generated
	 * @ordered
	 */
	protected Expression_adapted expressions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayInitializer_adapted_expressionsItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getArrayInitializer_adapted_expressionsItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression_adapted getExpressions() {
		if (expressions != null && expressions.eIsProxy()) {
			InternalEObject oldExpressions = (InternalEObject)expressions;
			expressions = (Expression_adapted)eResolveProxy(oldExpressions);
			if (expressions != oldExpressions) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Java_adaptedPackage.ARRAY_INITIALIZER_ADAPTED_EXPRESSIONS_ITEM__EXPRESSIONS, oldExpressions, expressions));
			}
		}
		return expressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_adapted basicGetExpressions() {
		return expressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpressions(Expression_adapted newExpressions) {
		Expression_adapted oldExpressions = expressions;
		expressions = newExpressions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_adaptedPackage.ARRAY_INITIALIZER_ADAPTED_EXPRESSIONS_ITEM__EXPRESSIONS, oldExpressions, expressions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.ARRAY_INITIALIZER_ADAPTED_EXPRESSIONS_ITEM__EXPRESSIONS:
				if (resolve) return getExpressions();
				return basicGetExpressions();
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
			case Java_adaptedPackage.ARRAY_INITIALIZER_ADAPTED_EXPRESSIONS_ITEM__EXPRESSIONS:
				setExpressions((Expression_adapted)newValue);
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
			case Java_adaptedPackage.ARRAY_INITIALIZER_ADAPTED_EXPRESSIONS_ITEM__EXPRESSIONS:
				setExpressions((Expression_adapted)null);
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
			case Java_adaptedPackage.ARRAY_INITIALIZER_ADAPTED_EXPRESSIONS_ITEM__EXPRESSIONS:
				return expressions != null;
		}
		return super.eIsSet(featureID);
	}

} //ArrayInitializer_adapted_expressionsItemImpl
