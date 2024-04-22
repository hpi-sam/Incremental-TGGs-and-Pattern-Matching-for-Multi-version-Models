/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.EdgeWithHistoryImpl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractTypeDeclaration_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.BodyDeclaration_adapted_abstractTypeDeclarationItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Body Declaration adapted abstract Type Declaration Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.BodyDeclaration_adapted_abstractTypeDeclarationItemImpl#getAbstractTypeDeclaration <em>Abstract Type Declaration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BodyDeclaration_adapted_abstractTypeDeclarationItemImpl extends EdgeWithHistoryImpl implements BodyDeclaration_adapted_abstractTypeDeclarationItem {
	/**
	 * The cached value of the '{@link #getAbstractTypeDeclaration() <em>Abstract Type Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractTypeDeclaration()
	 * @generated
	 * @ordered
	 */
	protected AbstractTypeDeclaration_adapted abstractTypeDeclaration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BodyDeclaration_adapted_abstractTypeDeclarationItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getBodyDeclaration_adapted_abstractTypeDeclarationItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractTypeDeclaration_adapted getAbstractTypeDeclaration() {
		if (abstractTypeDeclaration != null && abstractTypeDeclaration.eIsProxy()) {
			InternalEObject oldAbstractTypeDeclaration = (InternalEObject)abstractTypeDeclaration;
			abstractTypeDeclaration = (AbstractTypeDeclaration_adapted)eResolveProxy(oldAbstractTypeDeclaration);
			if (abstractTypeDeclaration != oldAbstractTypeDeclaration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Java_adaptedPackage.BODY_DECLARATION_ADAPTED_ABSTRACT_TYPE_DECLARATION_ITEM__ABSTRACT_TYPE_DECLARATION, oldAbstractTypeDeclaration, abstractTypeDeclaration));
			}
		}
		return abstractTypeDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTypeDeclaration_adapted basicGetAbstractTypeDeclaration() {
		return abstractTypeDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbstractTypeDeclaration(AbstractTypeDeclaration_adapted newAbstractTypeDeclaration) {
		AbstractTypeDeclaration_adapted oldAbstractTypeDeclaration = abstractTypeDeclaration;
		abstractTypeDeclaration = newAbstractTypeDeclaration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_adaptedPackage.BODY_DECLARATION_ADAPTED_ABSTRACT_TYPE_DECLARATION_ITEM__ABSTRACT_TYPE_DECLARATION, oldAbstractTypeDeclaration, abstractTypeDeclaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.BODY_DECLARATION_ADAPTED_ABSTRACT_TYPE_DECLARATION_ITEM__ABSTRACT_TYPE_DECLARATION:
				if (resolve) return getAbstractTypeDeclaration();
				return basicGetAbstractTypeDeclaration();
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
			case Java_adaptedPackage.BODY_DECLARATION_ADAPTED_ABSTRACT_TYPE_DECLARATION_ITEM__ABSTRACT_TYPE_DECLARATION:
				setAbstractTypeDeclaration((AbstractTypeDeclaration_adapted)newValue);
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
			case Java_adaptedPackage.BODY_DECLARATION_ADAPTED_ABSTRACT_TYPE_DECLARATION_ITEM__ABSTRACT_TYPE_DECLARATION:
				setAbstractTypeDeclaration((AbstractTypeDeclaration_adapted)null);
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
			case Java_adaptedPackage.BODY_DECLARATION_ADAPTED_ABSTRACT_TYPE_DECLARATION_ITEM__ABSTRACT_TYPE_DECLARATION:
				return abstractTypeDeclaration != null;
		}
		return super.eIsSet(featureID);
	}

} //BodyDeclaration_adapted_abstractTypeDeclarationItemImpl
