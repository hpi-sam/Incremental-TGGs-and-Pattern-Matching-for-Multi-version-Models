/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.EdgeWithHistoryImpl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MethodDeclaration_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MethodDeclaration_adapted_redefinedMethodDeclarationItem;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Declaration adapted redefined Method Declaration Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.MethodDeclaration_adapted_redefinedMethodDeclarationItemImpl#getRedefinedMethodDeclaration <em>Redefined Method Declaration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodDeclaration_adapted_redefinedMethodDeclarationItemImpl extends EdgeWithHistoryImpl implements MethodDeclaration_adapted_redefinedMethodDeclarationItem {
	/**
	 * The cached value of the '{@link #getRedefinedMethodDeclaration() <em>Redefined Method Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedMethodDeclaration()
	 * @generated
	 * @ordered
	 */
	protected MethodDeclaration_adapted redefinedMethodDeclaration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodDeclaration_adapted_redefinedMethodDeclarationItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getMethodDeclaration_adapted_redefinedMethodDeclarationItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodDeclaration_adapted getRedefinedMethodDeclaration() {
		if (redefinedMethodDeclaration != null && redefinedMethodDeclaration.eIsProxy()) {
			InternalEObject oldRedefinedMethodDeclaration = (InternalEObject)redefinedMethodDeclaration;
			redefinedMethodDeclaration = (MethodDeclaration_adapted)eResolveProxy(oldRedefinedMethodDeclaration);
			if (redefinedMethodDeclaration != oldRedefinedMethodDeclaration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Java_adaptedPackage.METHOD_DECLARATION_ADAPTED_REDEFINED_METHOD_DECLARATION_ITEM__REDEFINED_METHOD_DECLARATION, oldRedefinedMethodDeclaration, redefinedMethodDeclaration));
			}
		}
		return redefinedMethodDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodDeclaration_adapted basicGetRedefinedMethodDeclaration() {
		return redefinedMethodDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRedefinedMethodDeclaration(MethodDeclaration_adapted newRedefinedMethodDeclaration) {
		MethodDeclaration_adapted oldRedefinedMethodDeclaration = redefinedMethodDeclaration;
		redefinedMethodDeclaration = newRedefinedMethodDeclaration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_adaptedPackage.METHOD_DECLARATION_ADAPTED_REDEFINED_METHOD_DECLARATION_ITEM__REDEFINED_METHOD_DECLARATION, oldRedefinedMethodDeclaration, redefinedMethodDeclaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.METHOD_DECLARATION_ADAPTED_REDEFINED_METHOD_DECLARATION_ITEM__REDEFINED_METHOD_DECLARATION:
				if (resolve) return getRedefinedMethodDeclaration();
				return basicGetRedefinedMethodDeclaration();
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
			case Java_adaptedPackage.METHOD_DECLARATION_ADAPTED_REDEFINED_METHOD_DECLARATION_ITEM__REDEFINED_METHOD_DECLARATION:
				setRedefinedMethodDeclaration((MethodDeclaration_adapted)newValue);
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
			case Java_adaptedPackage.METHOD_DECLARATION_ADAPTED_REDEFINED_METHOD_DECLARATION_ITEM__REDEFINED_METHOD_DECLARATION:
				setRedefinedMethodDeclaration((MethodDeclaration_adapted)null);
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
			case Java_adaptedPackage.METHOD_DECLARATION_ADAPTED_REDEFINED_METHOD_DECLARATION_ITEM__REDEFINED_METHOD_DECLARATION:
				return redefinedMethodDeclaration != null;
		}
		return super.eIsSet(featureID);
	}

} //MethodDeclaration_adapted_redefinedMethodDeclarationItemImpl
