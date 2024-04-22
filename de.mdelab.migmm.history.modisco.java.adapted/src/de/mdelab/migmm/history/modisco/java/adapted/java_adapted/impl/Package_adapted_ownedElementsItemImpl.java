/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.ContainmentEdgeWithHistoryImpl;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractTypeDeclaration_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Package_adapted_ownedElementsItem;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package adapted owned Elements Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.Package_adapted_ownedElementsItemImpl#getOwnedElements <em>Owned Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Package_adapted_ownedElementsItemImpl extends ContainmentEdgeWithHistoryImpl implements Package_adapted_ownedElementsItem {
	/**
	 * The cached value of the '{@link #getOwnedElements() <em>Owned Elements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElements()
	 * @generated
	 * @ordered
	 */
	protected AbstractTypeDeclaration_adapted ownedElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Package_adapted_ownedElementsItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getPackage_adapted_ownedElementsItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractTypeDeclaration_adapted getOwnedElements() {
		if (ownedElements != null && ownedElements.eIsProxy()) {
			InternalEObject oldOwnedElements = (InternalEObject)ownedElements;
			ownedElements = (AbstractTypeDeclaration_adapted)eResolveProxy(oldOwnedElements);
			if (ownedElements != oldOwnedElements) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Java_adaptedPackage.PACKAGE_ADAPTED_OWNED_ELEMENTS_ITEM__OWNED_ELEMENTS, oldOwnedElements, ownedElements));
			}
		}
		return ownedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTypeDeclaration_adapted basicGetOwnedElements() {
		return ownedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnedElements(AbstractTypeDeclaration_adapted newOwnedElements) {
		AbstractTypeDeclaration_adapted oldOwnedElements = ownedElements;
		ownedElements = newOwnedElements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_adaptedPackage.PACKAGE_ADAPTED_OWNED_ELEMENTS_ITEM__OWNED_ELEMENTS, oldOwnedElements, ownedElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.PACKAGE_ADAPTED_OWNED_ELEMENTS_ITEM__OWNED_ELEMENTS:
				if (resolve) return getOwnedElements();
				return basicGetOwnedElements();
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
			case Java_adaptedPackage.PACKAGE_ADAPTED_OWNED_ELEMENTS_ITEM__OWNED_ELEMENTS:
				setOwnedElements((AbstractTypeDeclaration_adapted)newValue);
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
			case Java_adaptedPackage.PACKAGE_ADAPTED_OWNED_ELEMENTS_ITEM__OWNED_ELEMENTS:
				setOwnedElements((AbstractTypeDeclaration_adapted)null);
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
			case Java_adaptedPackage.PACKAGE_ADAPTED_OWNED_ELEMENTS_ITEM__OWNED_ELEMENTS:
				return ownedElements != null;
		}
		return super.eIsSet(featureID);
	}

} //Package_adapted_ownedElementsItemImpl
