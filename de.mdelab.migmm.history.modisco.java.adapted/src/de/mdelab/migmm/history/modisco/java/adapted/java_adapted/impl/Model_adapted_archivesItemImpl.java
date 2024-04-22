/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.ContainmentEdgeWithHistoryImpl;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Archive_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Model_adapted_archivesItem;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model adapted archives Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.Model_adapted_archivesItemImpl#getArchives <em>Archives</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Model_adapted_archivesItemImpl extends ContainmentEdgeWithHistoryImpl implements Model_adapted_archivesItem {
	/**
	 * The cached value of the '{@link #getArchives() <em>Archives</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchives()
	 * @generated
	 * @ordered
	 */
	protected Archive_adapted archives;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Model_adapted_archivesItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getModel_adapted_archivesItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Archive_adapted getArchives() {
		if (archives != null && archives.eIsProxy()) {
			InternalEObject oldArchives = (InternalEObject)archives;
			archives = (Archive_adapted)eResolveProxy(oldArchives);
			if (archives != oldArchives) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Java_adaptedPackage.MODEL_ADAPTED_ARCHIVES_ITEM__ARCHIVES, oldArchives, archives));
			}
		}
		return archives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Archive_adapted basicGetArchives() {
		return archives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArchives(Archive_adapted newArchives) {
		Archive_adapted oldArchives = archives;
		archives = newArchives;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_adaptedPackage.MODEL_ADAPTED_ARCHIVES_ITEM__ARCHIVES, oldArchives, archives));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.MODEL_ADAPTED_ARCHIVES_ITEM__ARCHIVES:
				if (resolve) return getArchives();
				return basicGetArchives();
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
			case Java_adaptedPackage.MODEL_ADAPTED_ARCHIVES_ITEM__ARCHIVES:
				setArchives((Archive_adapted)newValue);
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
			case Java_adaptedPackage.MODEL_ADAPTED_ARCHIVES_ITEM__ARCHIVES:
				setArchives((Archive_adapted)null);
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
			case Java_adaptedPackage.MODEL_ADAPTED_ARCHIVES_ITEM__ARCHIVES:
				return archives != null;
		}
		return super.eIsSet(featureID);
	}

} //Model_adapted_archivesItemImpl
