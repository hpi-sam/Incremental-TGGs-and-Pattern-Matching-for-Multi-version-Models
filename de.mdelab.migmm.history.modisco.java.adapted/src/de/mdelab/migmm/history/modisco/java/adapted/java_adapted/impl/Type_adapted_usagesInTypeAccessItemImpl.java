/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.EdgeWithHistoryImpl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TypeAccess_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Type_adapted_usagesInTypeAccessItem;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type adapted usages In Type Access Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.Type_adapted_usagesInTypeAccessItemImpl#getUsagesInTypeAccess <em>Usages In Type Access</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Type_adapted_usagesInTypeAccessItemImpl extends EdgeWithHistoryImpl implements Type_adapted_usagesInTypeAccessItem {
	/**
	 * The cached value of the '{@link #getUsagesInTypeAccess() <em>Usages In Type Access</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsagesInTypeAccess()
	 * @generated
	 * @ordered
	 */
	protected TypeAccess_adapted usagesInTypeAccess;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Type_adapted_usagesInTypeAccessItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getType_adapted_usagesInTypeAccessItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeAccess_adapted getUsagesInTypeAccess() {
		if (usagesInTypeAccess != null && usagesInTypeAccess.eIsProxy()) {
			InternalEObject oldUsagesInTypeAccess = (InternalEObject)usagesInTypeAccess;
			usagesInTypeAccess = (TypeAccess_adapted)eResolveProxy(oldUsagesInTypeAccess);
			if (usagesInTypeAccess != oldUsagesInTypeAccess) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Java_adaptedPackage.TYPE_ADAPTED_USAGES_IN_TYPE_ACCESS_ITEM__USAGES_IN_TYPE_ACCESS, oldUsagesInTypeAccess, usagesInTypeAccess));
			}
		}
		return usagesInTypeAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAccess_adapted basicGetUsagesInTypeAccess() {
		return usagesInTypeAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsagesInTypeAccess(TypeAccess_adapted newUsagesInTypeAccess) {
		TypeAccess_adapted oldUsagesInTypeAccess = usagesInTypeAccess;
		usagesInTypeAccess = newUsagesInTypeAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_adaptedPackage.TYPE_ADAPTED_USAGES_IN_TYPE_ACCESS_ITEM__USAGES_IN_TYPE_ACCESS, oldUsagesInTypeAccess, usagesInTypeAccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.TYPE_ADAPTED_USAGES_IN_TYPE_ACCESS_ITEM__USAGES_IN_TYPE_ACCESS:
				if (resolve) return getUsagesInTypeAccess();
				return basicGetUsagesInTypeAccess();
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
			case Java_adaptedPackage.TYPE_ADAPTED_USAGES_IN_TYPE_ACCESS_ITEM__USAGES_IN_TYPE_ACCESS:
				setUsagesInTypeAccess((TypeAccess_adapted)newValue);
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
			case Java_adaptedPackage.TYPE_ADAPTED_USAGES_IN_TYPE_ACCESS_ITEM__USAGES_IN_TYPE_ACCESS:
				setUsagesInTypeAccess((TypeAccess_adapted)null);
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
			case Java_adaptedPackage.TYPE_ADAPTED_USAGES_IN_TYPE_ACCESS_ITEM__USAGES_IN_TYPE_ACCESS:
				return usagesInTypeAccess != null;
		}
		return super.eIsSet(featureID);
	}

} //Type_adapted_usagesInTypeAccessItemImpl
