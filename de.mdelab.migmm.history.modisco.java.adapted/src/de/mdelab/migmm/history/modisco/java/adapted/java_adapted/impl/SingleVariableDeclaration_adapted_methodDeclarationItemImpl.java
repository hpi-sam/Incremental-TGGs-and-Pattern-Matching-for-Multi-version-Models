/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.EdgeWithHistoryImpl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractMethodDeclaration_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SingleVariableDeclaration_adapted_methodDeclarationItem;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Variable Declaration adapted method Declaration Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.SingleVariableDeclaration_adapted_methodDeclarationItemImpl#getMethodDeclaration <em>Method Declaration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SingleVariableDeclaration_adapted_methodDeclarationItemImpl extends EdgeWithHistoryImpl implements SingleVariableDeclaration_adapted_methodDeclarationItem {
	/**
	 * The cached value of the '{@link #getMethodDeclaration() <em>Method Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodDeclaration()
	 * @generated
	 * @ordered
	 */
	protected AbstractMethodDeclaration_adapted methodDeclaration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleVariableDeclaration_adapted_methodDeclarationItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getSingleVariableDeclaration_adapted_methodDeclarationItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractMethodDeclaration_adapted getMethodDeclaration() {
		if (methodDeclaration != null && methodDeclaration.eIsProxy()) {
			InternalEObject oldMethodDeclaration = (InternalEObject)methodDeclaration;
			methodDeclaration = (AbstractMethodDeclaration_adapted)eResolveProxy(oldMethodDeclaration);
			if (methodDeclaration != oldMethodDeclaration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Java_adaptedPackage.SINGLE_VARIABLE_DECLARATION_ADAPTED_METHOD_DECLARATION_ITEM__METHOD_DECLARATION, oldMethodDeclaration, methodDeclaration));
			}
		}
		return methodDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractMethodDeclaration_adapted basicGetMethodDeclaration() {
		return methodDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMethodDeclaration(AbstractMethodDeclaration_adapted newMethodDeclaration) {
		AbstractMethodDeclaration_adapted oldMethodDeclaration = methodDeclaration;
		methodDeclaration = newMethodDeclaration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_adaptedPackage.SINGLE_VARIABLE_DECLARATION_ADAPTED_METHOD_DECLARATION_ITEM__METHOD_DECLARATION, oldMethodDeclaration, methodDeclaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.SINGLE_VARIABLE_DECLARATION_ADAPTED_METHOD_DECLARATION_ITEM__METHOD_DECLARATION:
				if (resolve) return getMethodDeclaration();
				return basicGetMethodDeclaration();
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
			case Java_adaptedPackage.SINGLE_VARIABLE_DECLARATION_ADAPTED_METHOD_DECLARATION_ITEM__METHOD_DECLARATION:
				setMethodDeclaration((AbstractMethodDeclaration_adapted)newValue);
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
			case Java_adaptedPackage.SINGLE_VARIABLE_DECLARATION_ADAPTED_METHOD_DECLARATION_ITEM__METHOD_DECLARATION:
				setMethodDeclaration((AbstractMethodDeclaration_adapted)null);
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
			case Java_adaptedPackage.SINGLE_VARIABLE_DECLARATION_ADAPTED_METHOD_DECLARATION_ITEM__METHOD_DECLARATION:
				return methodDeclaration != null;
		}
		return super.eIsSet(featureID);
	}

} //SingleVariableDeclaration_adapted_methodDeclarationItemImpl
