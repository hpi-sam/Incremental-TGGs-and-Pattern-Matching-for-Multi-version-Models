/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.EdgeWithHistoryImpl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SingleVariableAccess_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.VariableDeclaration_adapted_usageInVariableAccessItem;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Declaration adapted usage In Variable Access Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.VariableDeclaration_adapted_usageInVariableAccessItemImpl#getUsageInVariableAccess <em>Usage In Variable Access</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableDeclaration_adapted_usageInVariableAccessItemImpl extends EdgeWithHistoryImpl implements VariableDeclaration_adapted_usageInVariableAccessItem {
	/**
	 * The cached value of the '{@link #getUsageInVariableAccess() <em>Usage In Variable Access</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageInVariableAccess()
	 * @generated
	 * @ordered
	 */
	protected SingleVariableAccess_adapted usageInVariableAccess;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableDeclaration_adapted_usageInVariableAccessItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getVariableDeclaration_adapted_usageInVariableAccessItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SingleVariableAccess_adapted getUsageInVariableAccess() {
		if (usageInVariableAccess != null && usageInVariableAccess.eIsProxy()) {
			InternalEObject oldUsageInVariableAccess = (InternalEObject)usageInVariableAccess;
			usageInVariableAccess = (SingleVariableAccess_adapted)eResolveProxy(oldUsageInVariableAccess);
			if (usageInVariableAccess != oldUsageInVariableAccess) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Java_adaptedPackage.VARIABLE_DECLARATION_ADAPTED_USAGE_IN_VARIABLE_ACCESS_ITEM__USAGE_IN_VARIABLE_ACCESS, oldUsageInVariableAccess, usageInVariableAccess));
			}
		}
		return usageInVariableAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleVariableAccess_adapted basicGetUsageInVariableAccess() {
		return usageInVariableAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsageInVariableAccess(SingleVariableAccess_adapted newUsageInVariableAccess) {
		SingleVariableAccess_adapted oldUsageInVariableAccess = usageInVariableAccess;
		usageInVariableAccess = newUsageInVariableAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_adaptedPackage.VARIABLE_DECLARATION_ADAPTED_USAGE_IN_VARIABLE_ACCESS_ITEM__USAGE_IN_VARIABLE_ACCESS, oldUsageInVariableAccess, usageInVariableAccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.VARIABLE_DECLARATION_ADAPTED_USAGE_IN_VARIABLE_ACCESS_ITEM__USAGE_IN_VARIABLE_ACCESS:
				if (resolve) return getUsageInVariableAccess();
				return basicGetUsageInVariableAccess();
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
			case Java_adaptedPackage.VARIABLE_DECLARATION_ADAPTED_USAGE_IN_VARIABLE_ACCESS_ITEM__USAGE_IN_VARIABLE_ACCESS:
				setUsageInVariableAccess((SingleVariableAccess_adapted)newValue);
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
			case Java_adaptedPackage.VARIABLE_DECLARATION_ADAPTED_USAGE_IN_VARIABLE_ACCESS_ITEM__USAGE_IN_VARIABLE_ACCESS:
				setUsageInVariableAccess((SingleVariableAccess_adapted)null);
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
			case Java_adaptedPackage.VARIABLE_DECLARATION_ADAPTED_USAGE_IN_VARIABLE_ACCESS_ITEM__USAGE_IN_VARIABLE_ACCESS:
				return usageInVariableAccess != null;
		}
		return super.eIsSet(featureID);
	}

} //VariableDeclaration_adapted_usageInVariableAccessItemImpl
