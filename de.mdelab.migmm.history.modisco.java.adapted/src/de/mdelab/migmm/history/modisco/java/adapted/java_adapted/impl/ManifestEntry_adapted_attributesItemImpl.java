/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.ContainmentEdgeWithHistoryImpl;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ManifestAttribute_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ManifestEntry_adapted_attributesItem;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manifest Entry adapted attributes Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.ManifestEntry_adapted_attributesItemImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ManifestEntry_adapted_attributesItemImpl extends ContainmentEdgeWithHistoryImpl implements ManifestEntry_adapted_attributesItem {
	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected ManifestAttribute_adapted attributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManifestEntry_adapted_attributesItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getManifestEntry_adapted_attributesItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ManifestAttribute_adapted getAttributes() {
		if (attributes != null && attributes.eIsProxy()) {
			InternalEObject oldAttributes = (InternalEObject)attributes;
			attributes = (ManifestAttribute_adapted)eResolveProxy(oldAttributes);
			if (attributes != oldAttributes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Java_adaptedPackage.MANIFEST_ENTRY_ADAPTED_ATTRIBUTES_ITEM__ATTRIBUTES, oldAttributes, attributes));
			}
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManifestAttribute_adapted basicGetAttributes() {
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttributes(ManifestAttribute_adapted newAttributes) {
		ManifestAttribute_adapted oldAttributes = attributes;
		attributes = newAttributes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_adaptedPackage.MANIFEST_ENTRY_ADAPTED_ATTRIBUTES_ITEM__ATTRIBUTES, oldAttributes, attributes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.MANIFEST_ENTRY_ADAPTED_ATTRIBUTES_ITEM__ATTRIBUTES:
				if (resolve) return getAttributes();
				return basicGetAttributes();
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
			case Java_adaptedPackage.MANIFEST_ENTRY_ADAPTED_ATTRIBUTES_ITEM__ATTRIBUTES:
				setAttributes((ManifestAttribute_adapted)newValue);
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
			case Java_adaptedPackage.MANIFEST_ENTRY_ADAPTED_ATTRIBUTES_ITEM__ATTRIBUTES:
				setAttributes((ManifestAttribute_adapted)null);
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
			case Java_adaptedPackage.MANIFEST_ENTRY_ADAPTED_ATTRIBUTES_ITEM__ATTRIBUTES:
				return attributes != null;
		}
		return super.eIsSet(featureID);
	}

} //ManifestEntry_adapted_attributesItemImpl
