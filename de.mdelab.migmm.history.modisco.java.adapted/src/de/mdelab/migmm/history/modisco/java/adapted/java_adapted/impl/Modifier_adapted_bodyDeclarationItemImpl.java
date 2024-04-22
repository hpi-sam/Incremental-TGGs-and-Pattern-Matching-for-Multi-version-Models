/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.EdgeWithHistoryImpl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.BodyDeclaration_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted_bodyDeclarationItem;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modifier adapted body Declaration Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.Modifier_adapted_bodyDeclarationItemImpl#getBodyDeclaration <em>Body Declaration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Modifier_adapted_bodyDeclarationItemImpl extends EdgeWithHistoryImpl implements Modifier_adapted_bodyDeclarationItem {
	/**
	 * The cached value of the '{@link #getBodyDeclaration() <em>Body Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyDeclaration()
	 * @generated
	 * @ordered
	 */
	protected BodyDeclaration_adapted bodyDeclaration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Modifier_adapted_bodyDeclarationItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getModifier_adapted_bodyDeclarationItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BodyDeclaration_adapted getBodyDeclaration() {
		if (bodyDeclaration != null && bodyDeclaration.eIsProxy()) {
			InternalEObject oldBodyDeclaration = (InternalEObject)bodyDeclaration;
			bodyDeclaration = (BodyDeclaration_adapted)eResolveProxy(oldBodyDeclaration);
			if (bodyDeclaration != oldBodyDeclaration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Java_adaptedPackage.MODIFIER_ADAPTED_BODY_DECLARATION_ITEM__BODY_DECLARATION, oldBodyDeclaration, bodyDeclaration));
			}
		}
		return bodyDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BodyDeclaration_adapted basicGetBodyDeclaration() {
		return bodyDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBodyDeclaration(BodyDeclaration_adapted newBodyDeclaration) {
		BodyDeclaration_adapted oldBodyDeclaration = bodyDeclaration;
		bodyDeclaration = newBodyDeclaration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_adaptedPackage.MODIFIER_ADAPTED_BODY_DECLARATION_ITEM__BODY_DECLARATION, oldBodyDeclaration, bodyDeclaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.MODIFIER_ADAPTED_BODY_DECLARATION_ITEM__BODY_DECLARATION:
				if (resolve) return getBodyDeclaration();
				return basicGetBodyDeclaration();
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
			case Java_adaptedPackage.MODIFIER_ADAPTED_BODY_DECLARATION_ITEM__BODY_DECLARATION:
				setBodyDeclaration((BodyDeclaration_adapted)newValue);
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
			case Java_adaptedPackage.MODIFIER_ADAPTED_BODY_DECLARATION_ITEM__BODY_DECLARATION:
				setBodyDeclaration((BodyDeclaration_adapted)null);
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
			case Java_adaptedPackage.MODIFIER_ADAPTED_BODY_DECLARATION_ITEM__BODY_DECLARATION:
				return bodyDeclaration != null;
		}
		return super.eIsSet(featureID);
	}

} //Modifier_adapted_bodyDeclarationItemImpl
