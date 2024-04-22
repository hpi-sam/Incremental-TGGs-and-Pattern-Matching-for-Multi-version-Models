/**
 */
package de.hpi.sam.classDiagram_adapted.impl;

import de.hpi.sam.classDiagram_adapted.ClassDiagram_adaptedPackage;
import de.hpi.sam.classDiagram_adapted.UMLAssoc_adapted_leftRoleItem;
import de.hpi.sam.classDiagram_adapted.UMLRole_adapted;

import de.mdelab.migmm.history.impl.EdgeWithHistoryImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UML Assoc adapted left Role Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.hpi.sam.classDiagram_adapted.impl.UMLAssoc_adapted_leftRoleItemImpl#getLeftRole <em>Left Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UMLAssoc_adapted_leftRoleItemImpl extends EdgeWithHistoryImpl implements UMLAssoc_adapted_leftRoleItem {
	/**
	 * The cached value of the '{@link #getLeftRole() <em>Left Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftRole()
	 * @generated
	 * @ordered
	 */
	protected UMLRole_adapted leftRole;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UMLAssoc_adapted_leftRoleItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassDiagram_adaptedPackage.Literals.UML_ASSOC_ADAPTED_LEFT_ROLE_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UMLRole_adapted getLeftRole() {
		if (leftRole != null && leftRole.eIsProxy()) {
			InternalEObject oldLeftRole = (InternalEObject)leftRole;
			leftRole = (UMLRole_adapted)eResolveProxy(oldLeftRole);
			if (leftRole != oldLeftRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassDiagram_adaptedPackage.UML_ASSOC_ADAPTED_LEFT_ROLE_ITEM__LEFT_ROLE, oldLeftRole, leftRole));
			}
		}
		return leftRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLRole_adapted basicGetLeftRole() {
		return leftRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLeftRole(UMLRole_adapted newLeftRole) {
		UMLRole_adapted oldLeftRole = leftRole;
		leftRole = newLeftRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagram_adaptedPackage.UML_ASSOC_ADAPTED_LEFT_ROLE_ITEM__LEFT_ROLE, oldLeftRole, leftRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassDiagram_adaptedPackage.UML_ASSOC_ADAPTED_LEFT_ROLE_ITEM__LEFT_ROLE:
				if (resolve) return getLeftRole();
				return basicGetLeftRole();
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
			case ClassDiagram_adaptedPackage.UML_ASSOC_ADAPTED_LEFT_ROLE_ITEM__LEFT_ROLE:
				setLeftRole((UMLRole_adapted)newValue);
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
			case ClassDiagram_adaptedPackage.UML_ASSOC_ADAPTED_LEFT_ROLE_ITEM__LEFT_ROLE:
				setLeftRole((UMLRole_adapted)null);
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
			case ClassDiagram_adaptedPackage.UML_ASSOC_ADAPTED_LEFT_ROLE_ITEM__LEFT_ROLE:
				return leftRole != null;
		}
		return super.eIsSet(featureID);
	}

} //UMLAssoc_adapted_leftRoleItemImpl
