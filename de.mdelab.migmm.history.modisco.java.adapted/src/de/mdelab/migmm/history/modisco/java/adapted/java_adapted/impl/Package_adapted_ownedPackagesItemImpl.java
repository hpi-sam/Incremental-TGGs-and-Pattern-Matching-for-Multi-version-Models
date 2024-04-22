/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.ContainmentEdgeWithHistoryImpl;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Package_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Package_adapted_ownedPackagesItem;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package adapted owned Packages Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.Package_adapted_ownedPackagesItemImpl#getOwnedPackages <em>Owned Packages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Package_adapted_ownedPackagesItemImpl extends ContainmentEdgeWithHistoryImpl implements Package_adapted_ownedPackagesItem {
	/**
	 * The cached value of the '{@link #getOwnedPackages() <em>Owned Packages</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPackages()
	 * @generated
	 * @ordered
	 */
	protected Package_adapted ownedPackages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Package_adapted_ownedPackagesItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getPackage_adapted_ownedPackagesItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Package_adapted getOwnedPackages() {
		if (ownedPackages != null && ownedPackages.eIsProxy()) {
			InternalEObject oldOwnedPackages = (InternalEObject)ownedPackages;
			ownedPackages = (Package_adapted)eResolveProxy(oldOwnedPackages);
			if (ownedPackages != oldOwnedPackages) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Java_adaptedPackage.PACKAGE_ADAPTED_OWNED_PACKAGES_ITEM__OWNED_PACKAGES, oldOwnedPackages, ownedPackages));
			}
		}
		return ownedPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Package_adapted basicGetOwnedPackages() {
		return ownedPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnedPackages(Package_adapted newOwnedPackages) {
		Package_adapted oldOwnedPackages = ownedPackages;
		ownedPackages = newOwnedPackages;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_adaptedPackage.PACKAGE_ADAPTED_OWNED_PACKAGES_ITEM__OWNED_PACKAGES, oldOwnedPackages, ownedPackages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.PACKAGE_ADAPTED_OWNED_PACKAGES_ITEM__OWNED_PACKAGES:
				if (resolve) return getOwnedPackages();
				return basicGetOwnedPackages();
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
			case Java_adaptedPackage.PACKAGE_ADAPTED_OWNED_PACKAGES_ITEM__OWNED_PACKAGES:
				setOwnedPackages((Package_adapted)newValue);
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
			case Java_adaptedPackage.PACKAGE_ADAPTED_OWNED_PACKAGES_ITEM__OWNED_PACKAGES:
				setOwnedPackages((Package_adapted)null);
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
			case Java_adaptedPackage.PACKAGE_ADAPTED_OWNED_PACKAGES_ITEM__OWNED_PACKAGES:
				return ownedPackages != null;
		}
		return super.eIsSet(featureID);
	}

} //Package_adapted_ownedPackagesItemImpl
