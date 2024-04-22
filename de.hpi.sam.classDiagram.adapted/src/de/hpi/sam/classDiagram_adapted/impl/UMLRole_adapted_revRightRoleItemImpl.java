/**
 */
package de.hpi.sam.classDiagram_adapted.impl;

import de.hpi.sam.classDiagram_adapted.ClassDiagram_adaptedPackage;
import de.hpi.sam.classDiagram_adapted.UMLAssoc_adapted;
import de.hpi.sam.classDiagram_adapted.UMLRole_adapted_revRightRoleItem;

import de.mdelab.migmm.history.impl.EdgeWithHistoryImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UML Role adapted rev Right Role Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.hpi.sam.classDiagram_adapted.impl.UMLRole_adapted_revRightRoleItemImpl#getRevRightRole <em>Rev Right Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UMLRole_adapted_revRightRoleItemImpl extends EdgeWithHistoryImpl implements UMLRole_adapted_revRightRoleItem {
	/**
	 * The cached value of the '{@link #getRevRightRole() <em>Rev Right Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevRightRole()
	 * @generated
	 * @ordered
	 */
	protected UMLAssoc_adapted revRightRole;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UMLRole_adapted_revRightRoleItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassDiagram_adaptedPackage.Literals.UML_ROLE_ADAPTED_REV_RIGHT_ROLE_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UMLAssoc_adapted getRevRightRole() {
		if (revRightRole != null && revRightRole.eIsProxy()) {
			InternalEObject oldRevRightRole = (InternalEObject)revRightRole;
			revRightRole = (UMLAssoc_adapted)eResolveProxy(oldRevRightRole);
			if (revRightRole != oldRevRightRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassDiagram_adaptedPackage.UML_ROLE_ADAPTED_REV_RIGHT_ROLE_ITEM__REV_RIGHT_ROLE, oldRevRightRole, revRightRole));
			}
		}
		return revRightRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLAssoc_adapted basicGetRevRightRole() {
		return revRightRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRevRightRole(UMLAssoc_adapted newRevRightRole) {
		UMLAssoc_adapted oldRevRightRole = revRightRole;
		revRightRole = newRevRightRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagram_adaptedPackage.UML_ROLE_ADAPTED_REV_RIGHT_ROLE_ITEM__REV_RIGHT_ROLE, oldRevRightRole, revRightRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassDiagram_adaptedPackage.UML_ROLE_ADAPTED_REV_RIGHT_ROLE_ITEM__REV_RIGHT_ROLE:
				if (resolve) return getRevRightRole();
				return basicGetRevRightRole();
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
			case ClassDiagram_adaptedPackage.UML_ROLE_ADAPTED_REV_RIGHT_ROLE_ITEM__REV_RIGHT_ROLE:
				setRevRightRole((UMLAssoc_adapted)newValue);
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
			case ClassDiagram_adaptedPackage.UML_ROLE_ADAPTED_REV_RIGHT_ROLE_ITEM__REV_RIGHT_ROLE:
				setRevRightRole((UMLAssoc_adapted)null);
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
			case ClassDiagram_adaptedPackage.UML_ROLE_ADAPTED_REV_RIGHT_ROLE_ITEM__REV_RIGHT_ROLE:
				return revRightRole != null;
		}
		return super.eIsSet(featureID);
	}

} //UMLRole_adapted_revRightRoleItemImpl
