/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.ContainmentEdgeWithHistoryImpl;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Expression_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ForStatement_adapted_initializersItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Statement adapted initializers Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.ForStatement_adapted_initializersItemImpl#getInitializers <em>Initializers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForStatement_adapted_initializersItemImpl extends ContainmentEdgeWithHistoryImpl implements ForStatement_adapted_initializersItem {
	/**
	 * The cached value of the '{@link #getInitializers() <em>Initializers</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitializers()
	 * @generated
	 * @ordered
	 */
	protected Expression_adapted initializers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForStatement_adapted_initializersItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getForStatement_adapted_initializersItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression_adapted getInitializers() {
		if (initializers != null && initializers.eIsProxy()) {
			InternalEObject oldInitializers = (InternalEObject)initializers;
			initializers = (Expression_adapted)eResolveProxy(oldInitializers);
			if (initializers != oldInitializers) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Java_adaptedPackage.FOR_STATEMENT_ADAPTED_INITIALIZERS_ITEM__INITIALIZERS, oldInitializers, initializers));
			}
		}
		return initializers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_adapted basicGetInitializers() {
		return initializers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitializers(Expression_adapted newInitializers) {
		Expression_adapted oldInitializers = initializers;
		initializers = newInitializers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_adaptedPackage.FOR_STATEMENT_ADAPTED_INITIALIZERS_ITEM__INITIALIZERS, oldInitializers, initializers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.FOR_STATEMENT_ADAPTED_INITIALIZERS_ITEM__INITIALIZERS:
				if (resolve) return getInitializers();
				return basicGetInitializers();
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
			case Java_adaptedPackage.FOR_STATEMENT_ADAPTED_INITIALIZERS_ITEM__INITIALIZERS:
				setInitializers((Expression_adapted)newValue);
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
			case Java_adaptedPackage.FOR_STATEMENT_ADAPTED_INITIALIZERS_ITEM__INITIALIZERS:
				setInitializers((Expression_adapted)null);
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
			case Java_adaptedPackage.FOR_STATEMENT_ADAPTED_INITIALIZERS_ITEM__INITIALIZERS:
				return initializers != null;
		}
		return super.eIsSet(featureID);
	}

} //ForStatement_adapted_initializersItemImpl
