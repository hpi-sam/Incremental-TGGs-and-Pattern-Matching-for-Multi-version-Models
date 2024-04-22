/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.EdgeWithHistoryImpl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.UnresolvedItemAccess_adapted_elementItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.UnresolvedItem_adapted;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unresolved Item Access adapted element Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.UnresolvedItemAccess_adapted_elementItemImpl#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnresolvedItemAccess_adapted_elementItemImpl extends EdgeWithHistoryImpl implements UnresolvedItemAccess_adapted_elementItem {
	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected UnresolvedItem_adapted element;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnresolvedItemAccess_adapted_elementItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getUnresolvedItemAccess_adapted_elementItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnresolvedItem_adapted getElement() {
		if (element != null && element.eIsProxy()) {
			InternalEObject oldElement = (InternalEObject)element;
			element = (UnresolvedItem_adapted)eResolveProxy(oldElement);
			if (element != oldElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Java_adaptedPackage.UNRESOLVED_ITEM_ACCESS_ADAPTED_ELEMENT_ITEM__ELEMENT, oldElement, element));
			}
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnresolvedItem_adapted basicGetElement() {
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElement(UnresolvedItem_adapted newElement) {
		UnresolvedItem_adapted oldElement = element;
		element = newElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_adaptedPackage.UNRESOLVED_ITEM_ACCESS_ADAPTED_ELEMENT_ITEM__ELEMENT, oldElement, element));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.UNRESOLVED_ITEM_ACCESS_ADAPTED_ELEMENT_ITEM__ELEMENT:
				if (resolve) return getElement();
				return basicGetElement();
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
			case Java_adaptedPackage.UNRESOLVED_ITEM_ACCESS_ADAPTED_ELEMENT_ITEM__ELEMENT:
				setElement((UnresolvedItem_adapted)newValue);
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
			case Java_adaptedPackage.UNRESOLVED_ITEM_ACCESS_ADAPTED_ELEMENT_ITEM__ELEMENT:
				setElement((UnresolvedItem_adapted)null);
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
			case Java_adaptedPackage.UNRESOLVED_ITEM_ACCESS_ADAPTED_ELEMENT_ITEM__ELEMENT:
				return element != null;
		}
		return super.eIsSet(featureID);
	}

} //UnresolvedItemAccess_adapted_elementItemImpl
