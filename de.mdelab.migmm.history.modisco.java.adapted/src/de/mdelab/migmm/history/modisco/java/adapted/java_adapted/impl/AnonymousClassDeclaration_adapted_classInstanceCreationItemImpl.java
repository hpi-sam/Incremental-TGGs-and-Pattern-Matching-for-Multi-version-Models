/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.EdgeWithHistoryImpl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AnonymousClassDeclaration_adapted_classInstanceCreationItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ClassInstanceCreation_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Anonymous Class Declaration adapted class Instance Creation Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.AnonymousClassDeclaration_adapted_classInstanceCreationItemImpl#getClassInstanceCreation <em>Class Instance Creation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnonymousClassDeclaration_adapted_classInstanceCreationItemImpl extends EdgeWithHistoryImpl implements AnonymousClassDeclaration_adapted_classInstanceCreationItem {
	/**
	 * The cached value of the '{@link #getClassInstanceCreation() <em>Class Instance Creation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassInstanceCreation()
	 * @generated
	 * @ordered
	 */
	protected ClassInstanceCreation_adapted classInstanceCreation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnonymousClassDeclaration_adapted_classInstanceCreationItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getAnonymousClassDeclaration_adapted_classInstanceCreationItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassInstanceCreation_adapted getClassInstanceCreation() {
		if (classInstanceCreation != null && classInstanceCreation.eIsProxy()) {
			InternalEObject oldClassInstanceCreation = (InternalEObject)classInstanceCreation;
			classInstanceCreation = (ClassInstanceCreation_adapted)eResolveProxy(oldClassInstanceCreation);
			if (classInstanceCreation != oldClassInstanceCreation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Java_adaptedPackage.ANONYMOUS_CLASS_DECLARATION_ADAPTED_CLASS_INSTANCE_CREATION_ITEM__CLASS_INSTANCE_CREATION, oldClassInstanceCreation, classInstanceCreation));
			}
		}
		return classInstanceCreation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassInstanceCreation_adapted basicGetClassInstanceCreation() {
		return classInstanceCreation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClassInstanceCreation(ClassInstanceCreation_adapted newClassInstanceCreation) {
		ClassInstanceCreation_adapted oldClassInstanceCreation = classInstanceCreation;
		classInstanceCreation = newClassInstanceCreation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_adaptedPackage.ANONYMOUS_CLASS_DECLARATION_ADAPTED_CLASS_INSTANCE_CREATION_ITEM__CLASS_INSTANCE_CREATION, oldClassInstanceCreation, classInstanceCreation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.ANONYMOUS_CLASS_DECLARATION_ADAPTED_CLASS_INSTANCE_CREATION_ITEM__CLASS_INSTANCE_CREATION:
				if (resolve) return getClassInstanceCreation();
				return basicGetClassInstanceCreation();
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
			case Java_adaptedPackage.ANONYMOUS_CLASS_DECLARATION_ADAPTED_CLASS_INSTANCE_CREATION_ITEM__CLASS_INSTANCE_CREATION:
				setClassInstanceCreation((ClassInstanceCreation_adapted)newValue);
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
			case Java_adaptedPackage.ANONYMOUS_CLASS_DECLARATION_ADAPTED_CLASS_INSTANCE_CREATION_ITEM__CLASS_INSTANCE_CREATION:
				setClassInstanceCreation((ClassInstanceCreation_adapted)null);
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
			case Java_adaptedPackage.ANONYMOUS_CLASS_DECLARATION_ADAPTED_CLASS_INSTANCE_CREATION_ITEM__CLASS_INSTANCE_CREATION:
				return classInstanceCreation != null;
		}
		return super.eIsSet(featureID);
	}

} //AnonymousClassDeclaration_adapted_classInstanceCreationItemImpl
