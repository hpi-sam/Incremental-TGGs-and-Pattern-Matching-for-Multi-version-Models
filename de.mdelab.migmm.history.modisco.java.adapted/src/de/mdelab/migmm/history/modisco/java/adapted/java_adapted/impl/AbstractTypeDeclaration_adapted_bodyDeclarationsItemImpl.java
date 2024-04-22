/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.ContainmentEdgeWithHistoryImpl;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractTypeDeclaration_adapted_bodyDeclarationsItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.BodyDeclaration_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Type Declaration adapted body Declarations Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.AbstractTypeDeclaration_adapted_bodyDeclarationsItemImpl#getBodyDeclarations <em>Body Declarations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractTypeDeclaration_adapted_bodyDeclarationsItemImpl extends ContainmentEdgeWithHistoryImpl implements AbstractTypeDeclaration_adapted_bodyDeclarationsItem {
	/**
	 * The cached value of the '{@link #getBodyDeclarations() <em>Body Declarations</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyDeclarations()
	 * @generated
	 * @ordered
	 */
	protected BodyDeclaration_adapted bodyDeclarations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractTypeDeclaration_adapted_bodyDeclarationsItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getAbstractTypeDeclaration_adapted_bodyDeclarationsItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BodyDeclaration_adapted getBodyDeclarations() {
		if (bodyDeclarations != null && bodyDeclarations.eIsProxy()) {
			InternalEObject oldBodyDeclarations = (InternalEObject)bodyDeclarations;
			bodyDeclarations = (BodyDeclaration_adapted)eResolveProxy(oldBodyDeclarations);
			if (bodyDeclarations != oldBodyDeclarations) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Java_adaptedPackage.ABSTRACT_TYPE_DECLARATION_ADAPTED_BODY_DECLARATIONS_ITEM__BODY_DECLARATIONS, oldBodyDeclarations, bodyDeclarations));
			}
		}
		return bodyDeclarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BodyDeclaration_adapted basicGetBodyDeclarations() {
		return bodyDeclarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBodyDeclarations(BodyDeclaration_adapted newBodyDeclarations) {
		BodyDeclaration_adapted oldBodyDeclarations = bodyDeclarations;
		bodyDeclarations = newBodyDeclarations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_adaptedPackage.ABSTRACT_TYPE_DECLARATION_ADAPTED_BODY_DECLARATIONS_ITEM__BODY_DECLARATIONS, oldBodyDeclarations, bodyDeclarations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.ABSTRACT_TYPE_DECLARATION_ADAPTED_BODY_DECLARATIONS_ITEM__BODY_DECLARATIONS:
				if (resolve) return getBodyDeclarations();
				return basicGetBodyDeclarations();
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
			case Java_adaptedPackage.ABSTRACT_TYPE_DECLARATION_ADAPTED_BODY_DECLARATIONS_ITEM__BODY_DECLARATIONS:
				setBodyDeclarations((BodyDeclaration_adapted)newValue);
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
			case Java_adaptedPackage.ABSTRACT_TYPE_DECLARATION_ADAPTED_BODY_DECLARATIONS_ITEM__BODY_DECLARATIONS:
				setBodyDeclarations((BodyDeclaration_adapted)null);
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
			case Java_adaptedPackage.ABSTRACT_TYPE_DECLARATION_ADAPTED_BODY_DECLARATIONS_ITEM__BODY_DECLARATIONS:
				return bodyDeclarations != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractTypeDeclaration_adapted_bodyDeclarationsItemImpl
