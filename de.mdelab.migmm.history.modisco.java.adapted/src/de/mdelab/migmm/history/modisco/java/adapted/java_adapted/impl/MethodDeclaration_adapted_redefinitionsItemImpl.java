/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.EdgeWithHistoryImpl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MethodDeclaration_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MethodDeclaration_adapted_redefinitionsItem;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Declaration adapted redefinitions Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.MethodDeclaration_adapted_redefinitionsItemImpl#getRedefinitions <em>Redefinitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodDeclaration_adapted_redefinitionsItemImpl extends EdgeWithHistoryImpl implements MethodDeclaration_adapted_redefinitionsItem {
	/**
	 * The cached value of the '{@link #getRedefinitions() <em>Redefinitions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinitions()
	 * @generated
	 * @ordered
	 */
	protected MethodDeclaration_adapted redefinitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodDeclaration_adapted_redefinitionsItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getMethodDeclaration_adapted_redefinitionsItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodDeclaration_adapted getRedefinitions() {
		if (redefinitions != null && redefinitions.eIsProxy()) {
			InternalEObject oldRedefinitions = (InternalEObject)redefinitions;
			redefinitions = (MethodDeclaration_adapted)eResolveProxy(oldRedefinitions);
			if (redefinitions != oldRedefinitions) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Java_adaptedPackage.METHOD_DECLARATION_ADAPTED_REDEFINITIONS_ITEM__REDEFINITIONS, oldRedefinitions, redefinitions));
			}
		}
		return redefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodDeclaration_adapted basicGetRedefinitions() {
		return redefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRedefinitions(MethodDeclaration_adapted newRedefinitions) {
		MethodDeclaration_adapted oldRedefinitions = redefinitions;
		redefinitions = newRedefinitions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_adaptedPackage.METHOD_DECLARATION_ADAPTED_REDEFINITIONS_ITEM__REDEFINITIONS, oldRedefinitions, redefinitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.METHOD_DECLARATION_ADAPTED_REDEFINITIONS_ITEM__REDEFINITIONS:
				if (resolve) return getRedefinitions();
				return basicGetRedefinitions();
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
			case Java_adaptedPackage.METHOD_DECLARATION_ADAPTED_REDEFINITIONS_ITEM__REDEFINITIONS:
				setRedefinitions((MethodDeclaration_adapted)newValue);
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
			case Java_adaptedPackage.METHOD_DECLARATION_ADAPTED_REDEFINITIONS_ITEM__REDEFINITIONS:
				setRedefinitions((MethodDeclaration_adapted)null);
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
			case Java_adaptedPackage.METHOD_DECLARATION_ADAPTED_REDEFINITIONS_ITEM__REDEFINITIONS:
				return redefinitions != null;
		}
		return super.eIsSet(featureID);
	}

} //MethodDeclaration_adapted_redefinitionsItemImpl
