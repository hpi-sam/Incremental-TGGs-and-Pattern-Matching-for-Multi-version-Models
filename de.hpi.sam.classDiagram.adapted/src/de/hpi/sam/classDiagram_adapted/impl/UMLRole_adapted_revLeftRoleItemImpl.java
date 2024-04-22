/**
 */
package de.hpi.sam.classDiagram_adapted.impl;

import de.hpi.sam.classDiagram_adapted.ClassDiagram_adaptedPackage;
import de.hpi.sam.classDiagram_adapted.UMLAssoc_adapted;
import de.hpi.sam.classDiagram_adapted.UMLRole_adapted_revLeftRoleItem;

import de.mdelab.migmm.history.impl.EdgeWithHistoryImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UML Role adapted rev Left Role Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.hpi.sam.classDiagram_adapted.impl.UMLRole_adapted_revLeftRoleItemImpl#getRevLeftRole <em>Rev Left Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UMLRole_adapted_revLeftRoleItemImpl extends EdgeWithHistoryImpl implements UMLRole_adapted_revLeftRoleItem {
	/**
	 * The cached value of the '{@link #getRevLeftRole() <em>Rev Left Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevLeftRole()
	 * @generated
	 * @ordered
	 */
	protected UMLAssoc_adapted revLeftRole;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UMLRole_adapted_revLeftRoleItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassDiagram_adaptedPackage.Literals.UML_ROLE_ADAPTED_REV_LEFT_ROLE_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UMLAssoc_adapted getRevLeftRole() {
		if (revLeftRole != null && revLeftRole.eIsProxy()) {
			InternalEObject oldRevLeftRole = (InternalEObject)revLeftRole;
			revLeftRole = (UMLAssoc_adapted)eResolveProxy(oldRevLeftRole);
			if (revLeftRole != oldRevLeftRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassDiagram_adaptedPackage.UML_ROLE_ADAPTED_REV_LEFT_ROLE_ITEM__REV_LEFT_ROLE, oldRevLeftRole, revLeftRole));
			}
		}
		return revLeftRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLAssoc_adapted basicGetRevLeftRole() {
		return revLeftRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRevLeftRole(UMLAssoc_adapted newRevLeftRole) {
		UMLAssoc_adapted oldRevLeftRole = revLeftRole;
		revLeftRole = newRevLeftRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagram_adaptedPackage.UML_ROLE_ADAPTED_REV_LEFT_ROLE_ITEM__REV_LEFT_ROLE, oldRevLeftRole, revLeftRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassDiagram_adaptedPackage.UML_ROLE_ADAPTED_REV_LEFT_ROLE_ITEM__REV_LEFT_ROLE:
				if (resolve) return getRevLeftRole();
				return basicGetRevLeftRole();
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
			case ClassDiagram_adaptedPackage.UML_ROLE_ADAPTED_REV_LEFT_ROLE_ITEM__REV_LEFT_ROLE:
				setRevLeftRole((UMLAssoc_adapted)newValue);
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
			case ClassDiagram_adaptedPackage.UML_ROLE_ADAPTED_REV_LEFT_ROLE_ITEM__REV_LEFT_ROLE:
				setRevLeftRole((UMLAssoc_adapted)null);
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
			case ClassDiagram_adaptedPackage.UML_ROLE_ADAPTED_REV_LEFT_ROLE_ITEM__REV_LEFT_ROLE:
				return revLeftRole != null;
		}
		return super.eIsSet(featureID);
	}

} //UMLRole_adapted_revLeftRoleItemImpl
