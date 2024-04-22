/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.ContainmentEdgeWithHistoryImpl;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Model_adapted_orphanTypesItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Type_adapted;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model adapted orphan Types Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.Model_adapted_orphanTypesItemImpl#getOrphanTypes <em>Orphan Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Model_adapted_orphanTypesItemImpl extends ContainmentEdgeWithHistoryImpl implements Model_adapted_orphanTypesItem {
	/**
	 * The cached value of the '{@link #getOrphanTypes() <em>Orphan Types</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrphanTypes()
	 * @generated
	 * @ordered
	 */
	protected Type_adapted orphanTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Model_adapted_orphanTypesItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getModel_adapted_orphanTypesItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type_adapted getOrphanTypes() {
		if (orphanTypes != null && orphanTypes.eIsProxy()) {
			InternalEObject oldOrphanTypes = (InternalEObject)orphanTypes;
			orphanTypes = (Type_adapted)eResolveProxy(oldOrphanTypes);
			if (orphanTypes != oldOrphanTypes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Java_adaptedPackage.MODEL_ADAPTED_ORPHAN_TYPES_ITEM__ORPHAN_TYPES, oldOrphanTypes, orphanTypes));
			}
		}
		return orphanTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type_adapted basicGetOrphanTypes() {
		return orphanTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrphanTypes(Type_adapted newOrphanTypes) {
		Type_adapted oldOrphanTypes = orphanTypes;
		orphanTypes = newOrphanTypes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_adaptedPackage.MODEL_ADAPTED_ORPHAN_TYPES_ITEM__ORPHAN_TYPES, oldOrphanTypes, orphanTypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.MODEL_ADAPTED_ORPHAN_TYPES_ITEM__ORPHAN_TYPES:
				if (resolve) return getOrphanTypes();
				return basicGetOrphanTypes();
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
			case Java_adaptedPackage.MODEL_ADAPTED_ORPHAN_TYPES_ITEM__ORPHAN_TYPES:
				setOrphanTypes((Type_adapted)newValue);
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
			case Java_adaptedPackage.MODEL_ADAPTED_ORPHAN_TYPES_ITEM__ORPHAN_TYPES:
				setOrphanTypes((Type_adapted)null);
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
			case Java_adaptedPackage.MODEL_ADAPTED_ORPHAN_TYPES_ITEM__ORPHAN_TYPES:
				return orphanTypes != null;
		}
		return super.eIsSet(featureID);
	}

} //Model_adapted_orphanTypesItemImpl
