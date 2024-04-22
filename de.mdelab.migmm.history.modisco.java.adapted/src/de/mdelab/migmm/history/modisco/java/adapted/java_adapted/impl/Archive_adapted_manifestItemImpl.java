/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.ContainmentEdgeWithHistoryImpl;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Archive_adapted_manifestItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Manifest_adapted;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Archive adapted manifest Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.Archive_adapted_manifestItemImpl#getManifest <em>Manifest</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Archive_adapted_manifestItemImpl extends ContainmentEdgeWithHistoryImpl implements Archive_adapted_manifestItem {
	/**
	 * The cached value of the '{@link #getManifest() <em>Manifest</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManifest()
	 * @generated
	 * @ordered
	 */
	protected Manifest_adapted manifest;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Archive_adapted_manifestItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getArchive_adapted_manifestItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Manifest_adapted getManifest() {
		if (manifest != null && manifest.eIsProxy()) {
			InternalEObject oldManifest = (InternalEObject)manifest;
			manifest = (Manifest_adapted)eResolveProxy(oldManifest);
			if (manifest != oldManifest) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Java_adaptedPackage.ARCHIVE_ADAPTED_MANIFEST_ITEM__MANIFEST, oldManifest, manifest));
			}
		}
		return manifest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Manifest_adapted basicGetManifest() {
		return manifest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setManifest(Manifest_adapted newManifest) {
		Manifest_adapted oldManifest = manifest;
		manifest = newManifest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_adaptedPackage.ARCHIVE_ADAPTED_MANIFEST_ITEM__MANIFEST, oldManifest, manifest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.ARCHIVE_ADAPTED_MANIFEST_ITEM__MANIFEST:
				if (resolve) return getManifest();
				return basicGetManifest();
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
			case Java_adaptedPackage.ARCHIVE_ADAPTED_MANIFEST_ITEM__MANIFEST:
				setManifest((Manifest_adapted)newValue);
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
			case Java_adaptedPackage.ARCHIVE_ADAPTED_MANIFEST_ITEM__MANIFEST:
				setManifest((Manifest_adapted)null);
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
			case Java_adaptedPackage.ARCHIVE_ADAPTED_MANIFEST_ITEM__MANIFEST:
				return manifest != null;
		}
		return super.eIsSet(featureID);
	}

} //Archive_adapted_manifestItemImpl
