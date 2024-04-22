/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.ContainmentEdgeWithHistoryImpl;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Model_adapted_unresolvedItemsItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.UnresolvedItem_adapted;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model adapted unresolved Items Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.Model_adapted_unresolvedItemsItemImpl#getUnresolvedItems <em>Unresolved Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Model_adapted_unresolvedItemsItemImpl extends ContainmentEdgeWithHistoryImpl implements Model_adapted_unresolvedItemsItem {
	/**
	 * The cached value of the '{@link #getUnresolvedItems() <em>Unresolved Items</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnresolvedItems()
	 * @generated
	 * @ordered
	 */
	protected UnresolvedItem_adapted unresolvedItems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Model_adapted_unresolvedItemsItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getModel_adapted_unresolvedItemsItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnresolvedItem_adapted getUnresolvedItems() {
		if (unresolvedItems != null && unresolvedItems.eIsProxy()) {
			InternalEObject oldUnresolvedItems = (InternalEObject)unresolvedItems;
			unresolvedItems = (UnresolvedItem_adapted)eResolveProxy(oldUnresolvedItems);
			if (unresolvedItems != oldUnresolvedItems) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Java_adaptedPackage.MODEL_ADAPTED_UNRESOLVED_ITEMS_ITEM__UNRESOLVED_ITEMS, oldUnresolvedItems, unresolvedItems));
			}
		}
		return unresolvedItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnresolvedItem_adapted basicGetUnresolvedItems() {
		return unresolvedItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnresolvedItems(UnresolvedItem_adapted newUnresolvedItems) {
		UnresolvedItem_adapted oldUnresolvedItems = unresolvedItems;
		unresolvedItems = newUnresolvedItems;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_adaptedPackage.MODEL_ADAPTED_UNRESOLVED_ITEMS_ITEM__UNRESOLVED_ITEMS, oldUnresolvedItems, unresolvedItems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.MODEL_ADAPTED_UNRESOLVED_ITEMS_ITEM__UNRESOLVED_ITEMS:
				if (resolve) return getUnresolvedItems();
				return basicGetUnresolvedItems();
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
			case Java_adaptedPackage.MODEL_ADAPTED_UNRESOLVED_ITEMS_ITEM__UNRESOLVED_ITEMS:
				setUnresolvedItems((UnresolvedItem_adapted)newValue);
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
			case Java_adaptedPackage.MODEL_ADAPTED_UNRESOLVED_ITEMS_ITEM__UNRESOLVED_ITEMS:
				setUnresolvedItems((UnresolvedItem_adapted)null);
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
			case Java_adaptedPackage.MODEL_ADAPTED_UNRESOLVED_ITEMS_ITEM__UNRESOLVED_ITEMS:
				return unresolvedItems != null;
		}
		return super.eIsSet(featureID);
	}

} //Model_adapted_unresolvedItemsItemImpl
