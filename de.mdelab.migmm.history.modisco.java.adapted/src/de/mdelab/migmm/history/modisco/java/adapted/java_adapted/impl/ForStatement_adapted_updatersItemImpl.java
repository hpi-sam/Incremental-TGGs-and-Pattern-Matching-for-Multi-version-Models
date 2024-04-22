/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.ContainmentEdgeWithHistoryImpl;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Expression_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ForStatement_adapted_updatersItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Statement adapted updaters Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.ForStatement_adapted_updatersItemImpl#getUpdaters <em>Updaters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForStatement_adapted_updatersItemImpl extends ContainmentEdgeWithHistoryImpl implements ForStatement_adapted_updatersItem {
	/**
	 * The cached value of the '{@link #getUpdaters() <em>Updaters</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdaters()
	 * @generated
	 * @ordered
	 */
	protected Expression_adapted updaters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForStatement_adapted_updatersItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getForStatement_adapted_updatersItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression_adapted getUpdaters() {
		if (updaters != null && updaters.eIsProxy()) {
			InternalEObject oldUpdaters = (InternalEObject)updaters;
			updaters = (Expression_adapted)eResolveProxy(oldUpdaters);
			if (updaters != oldUpdaters) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Java_adaptedPackage.FOR_STATEMENT_ADAPTED_UPDATERS_ITEM__UPDATERS, oldUpdaters, updaters));
			}
		}
		return updaters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_adapted basicGetUpdaters() {
		return updaters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpdaters(Expression_adapted newUpdaters) {
		Expression_adapted oldUpdaters = updaters;
		updaters = newUpdaters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_adaptedPackage.FOR_STATEMENT_ADAPTED_UPDATERS_ITEM__UPDATERS, oldUpdaters, updaters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.FOR_STATEMENT_ADAPTED_UPDATERS_ITEM__UPDATERS:
				if (resolve) return getUpdaters();
				return basicGetUpdaters();
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
			case Java_adaptedPackage.FOR_STATEMENT_ADAPTED_UPDATERS_ITEM__UPDATERS:
				setUpdaters((Expression_adapted)newValue);
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
			case Java_adaptedPackage.FOR_STATEMENT_ADAPTED_UPDATERS_ITEM__UPDATERS:
				setUpdaters((Expression_adapted)null);
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
			case Java_adaptedPackage.FOR_STATEMENT_ADAPTED_UPDATERS_ITEM__UPDATERS:
				return updaters != null;
		}
		return super.eIsSet(featureID);
	}

} //ForStatement_adapted_updatersItemImpl
