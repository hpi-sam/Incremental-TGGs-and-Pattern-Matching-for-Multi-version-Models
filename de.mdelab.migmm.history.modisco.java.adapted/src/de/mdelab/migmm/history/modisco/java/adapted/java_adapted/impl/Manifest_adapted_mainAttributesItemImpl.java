/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.ContainmentEdgeWithHistoryImpl;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ManifestAttribute_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Manifest_adapted_mainAttributesItem;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manifest adapted main Attributes Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.Manifest_adapted_mainAttributesItemImpl#getMainAttributes <em>Main Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Manifest_adapted_mainAttributesItemImpl extends ContainmentEdgeWithHistoryImpl implements Manifest_adapted_mainAttributesItem {
	/**
	 * The cached value of the '{@link #getMainAttributes() <em>Main Attributes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainAttributes()
	 * @generated
	 * @ordered
	 */
	protected ManifestAttribute_adapted mainAttributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Manifest_adapted_mainAttributesItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getManifest_adapted_mainAttributesItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ManifestAttribute_adapted getMainAttributes() {
		if (mainAttributes != null && mainAttributes.eIsProxy()) {
			InternalEObject oldMainAttributes = (InternalEObject)mainAttributes;
			mainAttributes = (ManifestAttribute_adapted)eResolveProxy(oldMainAttributes);
			if (mainAttributes != oldMainAttributes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Java_adaptedPackage.MANIFEST_ADAPTED_MAIN_ATTRIBUTES_ITEM__MAIN_ATTRIBUTES, oldMainAttributes, mainAttributes));
			}
		}
		return mainAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManifestAttribute_adapted basicGetMainAttributes() {
		return mainAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMainAttributes(ManifestAttribute_adapted newMainAttributes) {
		ManifestAttribute_adapted oldMainAttributes = mainAttributes;
		mainAttributes = newMainAttributes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_adaptedPackage.MANIFEST_ADAPTED_MAIN_ATTRIBUTES_ITEM__MAIN_ATTRIBUTES, oldMainAttributes, mainAttributes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.MANIFEST_ADAPTED_MAIN_ATTRIBUTES_ITEM__MAIN_ATTRIBUTES:
				if (resolve) return getMainAttributes();
				return basicGetMainAttributes();
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
			case Java_adaptedPackage.MANIFEST_ADAPTED_MAIN_ATTRIBUTES_ITEM__MAIN_ATTRIBUTES:
				setMainAttributes((ManifestAttribute_adapted)newValue);
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
			case Java_adaptedPackage.MANIFEST_ADAPTED_MAIN_ATTRIBUTES_ITEM__MAIN_ATTRIBUTES:
				setMainAttributes((ManifestAttribute_adapted)null);
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
			case Java_adaptedPackage.MANIFEST_ADAPTED_MAIN_ATTRIBUTES_ITEM__MAIN_ATTRIBUTES:
				return mainAttributes != null;
		}
		return super.eIsSet(featureID);
	}

} //Manifest_adapted_mainAttributesItemImpl
