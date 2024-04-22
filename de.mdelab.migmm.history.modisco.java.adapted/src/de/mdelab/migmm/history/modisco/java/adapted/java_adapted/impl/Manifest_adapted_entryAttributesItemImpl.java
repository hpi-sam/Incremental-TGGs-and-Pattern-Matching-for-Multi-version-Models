/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.ContainmentEdgeWithHistoryImpl;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ManifestEntry_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Manifest_adapted_entryAttributesItem;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manifest adapted entry Attributes Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.Manifest_adapted_entryAttributesItemImpl#getEntryAttributes <em>Entry Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Manifest_adapted_entryAttributesItemImpl extends ContainmentEdgeWithHistoryImpl implements Manifest_adapted_entryAttributesItem {
	/**
	 * The cached value of the '{@link #getEntryAttributes() <em>Entry Attributes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryAttributes()
	 * @generated
	 * @ordered
	 */
	protected ManifestEntry_adapted entryAttributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Manifest_adapted_entryAttributesItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getManifest_adapted_entryAttributesItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ManifestEntry_adapted getEntryAttributes() {
		if (entryAttributes != null && entryAttributes.eIsProxy()) {
			InternalEObject oldEntryAttributes = (InternalEObject)entryAttributes;
			entryAttributes = (ManifestEntry_adapted)eResolveProxy(oldEntryAttributes);
			if (entryAttributes != oldEntryAttributes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Java_adaptedPackage.MANIFEST_ADAPTED_ENTRY_ATTRIBUTES_ITEM__ENTRY_ATTRIBUTES, oldEntryAttributes, entryAttributes));
			}
		}
		return entryAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManifestEntry_adapted basicGetEntryAttributes() {
		return entryAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntryAttributes(ManifestEntry_adapted newEntryAttributes) {
		ManifestEntry_adapted oldEntryAttributes = entryAttributes;
		entryAttributes = newEntryAttributes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_adaptedPackage.MANIFEST_ADAPTED_ENTRY_ATTRIBUTES_ITEM__ENTRY_ATTRIBUTES, oldEntryAttributes, entryAttributes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.MANIFEST_ADAPTED_ENTRY_ATTRIBUTES_ITEM__ENTRY_ATTRIBUTES:
				if (resolve) return getEntryAttributes();
				return basicGetEntryAttributes();
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
			case Java_adaptedPackage.MANIFEST_ADAPTED_ENTRY_ATTRIBUTES_ITEM__ENTRY_ATTRIBUTES:
				setEntryAttributes((ManifestEntry_adapted)newValue);
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
			case Java_adaptedPackage.MANIFEST_ADAPTED_ENTRY_ATTRIBUTES_ITEM__ENTRY_ATTRIBUTES:
				setEntryAttributes((ManifestEntry_adapted)null);
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
			case Java_adaptedPackage.MANIFEST_ADAPTED_ENTRY_ATTRIBUTES_ITEM__ENTRY_ATTRIBUTES:
				return entryAttributes != null;
		}
		return super.eIsSet(featureID);
	}

} //Manifest_adapted_entryAttributesItemImpl
