/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.EdgeWithHistoryImpl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.PackageAccess_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Package_adapted_usagesInPackageAccessItem;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package adapted usages In Package Access Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.Package_adapted_usagesInPackageAccessItemImpl#getUsagesInPackageAccess <em>Usages In Package Access</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Package_adapted_usagesInPackageAccessItemImpl extends EdgeWithHistoryImpl implements Package_adapted_usagesInPackageAccessItem {
	/**
	 * The cached value of the '{@link #getUsagesInPackageAccess() <em>Usages In Package Access</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsagesInPackageAccess()
	 * @generated
	 * @ordered
	 */
	protected PackageAccess_adapted usagesInPackageAccess;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Package_adapted_usagesInPackageAccessItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getPackage_adapted_usagesInPackageAccessItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PackageAccess_adapted getUsagesInPackageAccess() {
		if (usagesInPackageAccess != null && usagesInPackageAccess.eIsProxy()) {
			InternalEObject oldUsagesInPackageAccess = (InternalEObject)usagesInPackageAccess;
			usagesInPackageAccess = (PackageAccess_adapted)eResolveProxy(oldUsagesInPackageAccess);
			if (usagesInPackageAccess != oldUsagesInPackageAccess) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Java_adaptedPackage.PACKAGE_ADAPTED_USAGES_IN_PACKAGE_ACCESS_ITEM__USAGES_IN_PACKAGE_ACCESS, oldUsagesInPackageAccess, usagesInPackageAccess));
			}
		}
		return usagesInPackageAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageAccess_adapted basicGetUsagesInPackageAccess() {
		return usagesInPackageAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsagesInPackageAccess(PackageAccess_adapted newUsagesInPackageAccess) {
		PackageAccess_adapted oldUsagesInPackageAccess = usagesInPackageAccess;
		usagesInPackageAccess = newUsagesInPackageAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_adaptedPackage.PACKAGE_ADAPTED_USAGES_IN_PACKAGE_ACCESS_ITEM__USAGES_IN_PACKAGE_ACCESS, oldUsagesInPackageAccess, usagesInPackageAccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.PACKAGE_ADAPTED_USAGES_IN_PACKAGE_ACCESS_ITEM__USAGES_IN_PACKAGE_ACCESS:
				if (resolve) return getUsagesInPackageAccess();
				return basicGetUsagesInPackageAccess();
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
			case Java_adaptedPackage.PACKAGE_ADAPTED_USAGES_IN_PACKAGE_ACCESS_ITEM__USAGES_IN_PACKAGE_ACCESS:
				setUsagesInPackageAccess((PackageAccess_adapted)newValue);
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
			case Java_adaptedPackage.PACKAGE_ADAPTED_USAGES_IN_PACKAGE_ACCESS_ITEM__USAGES_IN_PACKAGE_ACCESS:
				setUsagesInPackageAccess((PackageAccess_adapted)null);
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
			case Java_adaptedPackage.PACKAGE_ADAPTED_USAGES_IN_PACKAGE_ACCESS_ITEM__USAGES_IN_PACKAGE_ACCESS:
				return usagesInPackageAccess != null;
		}
		return super.eIsSet(featureID);
	}

} //Package_adapted_usagesInPackageAccessItemImpl
