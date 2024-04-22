/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.EdgeWithHistoryImpl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AnonymousClassDeclaration_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.BodyDeclaration_adapted_anonymousClassDeclarationOwnerItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Body Declaration adapted anonymous Class Declaration Owner Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.BodyDeclaration_adapted_anonymousClassDeclarationOwnerItemImpl#getAnonymousClassDeclarationOwner <em>Anonymous Class Declaration Owner</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BodyDeclaration_adapted_anonymousClassDeclarationOwnerItemImpl extends EdgeWithHistoryImpl implements BodyDeclaration_adapted_anonymousClassDeclarationOwnerItem {
	/**
	 * The cached value of the '{@link #getAnonymousClassDeclarationOwner() <em>Anonymous Class Declaration Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnonymousClassDeclarationOwner()
	 * @generated
	 * @ordered
	 */
	protected AnonymousClassDeclaration_adapted anonymousClassDeclarationOwner;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BodyDeclaration_adapted_anonymousClassDeclarationOwnerItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getBodyDeclaration_adapted_anonymousClassDeclarationOwnerItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnonymousClassDeclaration_adapted getAnonymousClassDeclarationOwner() {
		if (anonymousClassDeclarationOwner != null && anonymousClassDeclarationOwner.eIsProxy()) {
			InternalEObject oldAnonymousClassDeclarationOwner = (InternalEObject)anonymousClassDeclarationOwner;
			anonymousClassDeclarationOwner = (AnonymousClassDeclaration_adapted)eResolveProxy(oldAnonymousClassDeclarationOwner);
			if (anonymousClassDeclarationOwner != oldAnonymousClassDeclarationOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Java_adaptedPackage.BODY_DECLARATION_ADAPTED_ANONYMOUS_CLASS_DECLARATION_OWNER_ITEM__ANONYMOUS_CLASS_DECLARATION_OWNER, oldAnonymousClassDeclarationOwner, anonymousClassDeclarationOwner));
			}
		}
		return anonymousClassDeclarationOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnonymousClassDeclaration_adapted basicGetAnonymousClassDeclarationOwner() {
		return anonymousClassDeclarationOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnonymousClassDeclarationOwner(AnonymousClassDeclaration_adapted newAnonymousClassDeclarationOwner) {
		AnonymousClassDeclaration_adapted oldAnonymousClassDeclarationOwner = anonymousClassDeclarationOwner;
		anonymousClassDeclarationOwner = newAnonymousClassDeclarationOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_adaptedPackage.BODY_DECLARATION_ADAPTED_ANONYMOUS_CLASS_DECLARATION_OWNER_ITEM__ANONYMOUS_CLASS_DECLARATION_OWNER, oldAnonymousClassDeclarationOwner, anonymousClassDeclarationOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.BODY_DECLARATION_ADAPTED_ANONYMOUS_CLASS_DECLARATION_OWNER_ITEM__ANONYMOUS_CLASS_DECLARATION_OWNER:
				if (resolve) return getAnonymousClassDeclarationOwner();
				return basicGetAnonymousClassDeclarationOwner();
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
			case Java_adaptedPackage.BODY_DECLARATION_ADAPTED_ANONYMOUS_CLASS_DECLARATION_OWNER_ITEM__ANONYMOUS_CLASS_DECLARATION_OWNER:
				setAnonymousClassDeclarationOwner((AnonymousClassDeclaration_adapted)newValue);
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
			case Java_adaptedPackage.BODY_DECLARATION_ADAPTED_ANONYMOUS_CLASS_DECLARATION_OWNER_ITEM__ANONYMOUS_CLASS_DECLARATION_OWNER:
				setAnonymousClassDeclarationOwner((AnonymousClassDeclaration_adapted)null);
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
			case Java_adaptedPackage.BODY_DECLARATION_ADAPTED_ANONYMOUS_CLASS_DECLARATION_OWNER_ITEM__ANONYMOUS_CLASS_DECLARATION_OWNER:
				return anonymousClassDeclarationOwner != null;
		}
		return super.eIsSet(featureID);
	}

} //BodyDeclaration_adapted_anonymousClassDeclarationOwnerItemImpl
