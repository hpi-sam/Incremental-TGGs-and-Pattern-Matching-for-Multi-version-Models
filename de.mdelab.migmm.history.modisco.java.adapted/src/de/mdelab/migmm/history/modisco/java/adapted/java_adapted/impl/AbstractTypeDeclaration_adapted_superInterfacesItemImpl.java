/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.ContainmentEdgeWithHistoryImpl;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractTypeDeclaration_adapted_superInterfacesItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TypeAccess_adapted;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Type Declaration adapted super Interfaces Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.AbstractTypeDeclaration_adapted_superInterfacesItemImpl#getSuperInterfaces <em>Super Interfaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractTypeDeclaration_adapted_superInterfacesItemImpl extends ContainmentEdgeWithHistoryImpl implements AbstractTypeDeclaration_adapted_superInterfacesItem {
	/**
	 * The cached value of the '{@link #getSuperInterfaces() <em>Super Interfaces</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperInterfaces()
	 * @generated
	 * @ordered
	 */
	protected TypeAccess_adapted superInterfaces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractTypeDeclaration_adapted_superInterfacesItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getAbstractTypeDeclaration_adapted_superInterfacesItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeAccess_adapted getSuperInterfaces() {
		if (superInterfaces != null && superInterfaces.eIsProxy()) {
			InternalEObject oldSuperInterfaces = (InternalEObject)superInterfaces;
			superInterfaces = (TypeAccess_adapted)eResolveProxy(oldSuperInterfaces);
			if (superInterfaces != oldSuperInterfaces) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Java_adaptedPackage.ABSTRACT_TYPE_DECLARATION_ADAPTED_SUPER_INTERFACES_ITEM__SUPER_INTERFACES, oldSuperInterfaces, superInterfaces));
			}
		}
		return superInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAccess_adapted basicGetSuperInterfaces() {
		return superInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSuperInterfaces(TypeAccess_adapted newSuperInterfaces) {
		TypeAccess_adapted oldSuperInterfaces = superInterfaces;
		superInterfaces = newSuperInterfaces;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_adaptedPackage.ABSTRACT_TYPE_DECLARATION_ADAPTED_SUPER_INTERFACES_ITEM__SUPER_INTERFACES, oldSuperInterfaces, superInterfaces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.ABSTRACT_TYPE_DECLARATION_ADAPTED_SUPER_INTERFACES_ITEM__SUPER_INTERFACES:
				if (resolve) return getSuperInterfaces();
				return basicGetSuperInterfaces();
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
			case Java_adaptedPackage.ABSTRACT_TYPE_DECLARATION_ADAPTED_SUPER_INTERFACES_ITEM__SUPER_INTERFACES:
				setSuperInterfaces((TypeAccess_adapted)newValue);
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
			case Java_adaptedPackage.ABSTRACT_TYPE_DECLARATION_ADAPTED_SUPER_INTERFACES_ITEM__SUPER_INTERFACES:
				setSuperInterfaces((TypeAccess_adapted)null);
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
			case Java_adaptedPackage.ABSTRACT_TYPE_DECLARATION_ADAPTED_SUPER_INTERFACES_ITEM__SUPER_INTERFACES:
				return superInterfaces != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractTypeDeclaration_adapted_superInterfacesItemImpl
