/**
 */
package de.hpi.sam.classDiagram_adapted.impl;

import de.hpi.sam.classDiagram_adapted.ClassDiagram_adaptedPackage;
import de.hpi.sam.classDiagram_adapted.UMLAssoc_adapted_rightRoleItem;
import de.hpi.sam.classDiagram_adapted.UMLRole_adapted;

import de.mdelab.migmm.history.impl.EdgeWithHistoryImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UML Assoc adapted right Role Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.hpi.sam.classDiagram_adapted.impl.UMLAssoc_adapted_rightRoleItemImpl#getRightRole <em>Right Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UMLAssoc_adapted_rightRoleItemImpl extends EdgeWithHistoryImpl implements UMLAssoc_adapted_rightRoleItem {
	/**
	 * The cached value of the '{@link #getRightRole() <em>Right Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightRole()
	 * @generated
	 * @ordered
	 */
	protected UMLRole_adapted rightRole;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UMLAssoc_adapted_rightRoleItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassDiagram_adaptedPackage.Literals.UML_ASSOC_ADAPTED_RIGHT_ROLE_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UMLRole_adapted getRightRole() {
		if (rightRole != null && rightRole.eIsProxy()) {
			InternalEObject oldRightRole = (InternalEObject)rightRole;
			rightRole = (UMLRole_adapted)eResolveProxy(oldRightRole);
			if (rightRole != oldRightRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassDiagram_adaptedPackage.UML_ASSOC_ADAPTED_RIGHT_ROLE_ITEM__RIGHT_ROLE, oldRightRole, rightRole));
			}
		}
		return rightRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLRole_adapted basicGetRightRole() {
		return rightRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRightRole(UMLRole_adapted newRightRole) {
		UMLRole_adapted oldRightRole = rightRole;
		rightRole = newRightRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagram_adaptedPackage.UML_ASSOC_ADAPTED_RIGHT_ROLE_ITEM__RIGHT_ROLE, oldRightRole, rightRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassDiagram_adaptedPackage.UML_ASSOC_ADAPTED_RIGHT_ROLE_ITEM__RIGHT_ROLE:
				if (resolve) return getRightRole();
				return basicGetRightRole();
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
			case ClassDiagram_adaptedPackage.UML_ASSOC_ADAPTED_RIGHT_ROLE_ITEM__RIGHT_ROLE:
				setRightRole((UMLRole_adapted)newValue);
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
			case ClassDiagram_adaptedPackage.UML_ASSOC_ADAPTED_RIGHT_ROLE_ITEM__RIGHT_ROLE:
				setRightRole((UMLRole_adapted)null);
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
			case ClassDiagram_adaptedPackage.UML_ASSOC_ADAPTED_RIGHT_ROLE_ITEM__RIGHT_ROLE:
				return rightRole != null;
		}
		return super.eIsSet(featureID);
	}

} //UMLAssoc_adapted_rightRoleItemImpl
