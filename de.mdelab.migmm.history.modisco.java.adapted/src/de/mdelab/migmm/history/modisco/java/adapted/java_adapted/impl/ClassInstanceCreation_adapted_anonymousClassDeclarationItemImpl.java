/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.ContainmentEdgeWithHistoryImpl;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AnonymousClassDeclaration_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ClassInstanceCreation_adapted_anonymousClassDeclarationItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Instance Creation adapted anonymous Class Declaration Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.ClassInstanceCreation_adapted_anonymousClassDeclarationItemImpl#getAnonymousClassDeclaration <em>Anonymous Class Declaration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassInstanceCreation_adapted_anonymousClassDeclarationItemImpl extends ContainmentEdgeWithHistoryImpl implements ClassInstanceCreation_adapted_anonymousClassDeclarationItem {
	/**
	 * The cached value of the '{@link #getAnonymousClassDeclaration() <em>Anonymous Class Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnonymousClassDeclaration()
	 * @generated
	 * @ordered
	 */
	protected AnonymousClassDeclaration_adapted anonymousClassDeclaration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassInstanceCreation_adapted_anonymousClassDeclarationItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getClassInstanceCreation_adapted_anonymousClassDeclarationItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnonymousClassDeclaration_adapted getAnonymousClassDeclaration() {
		if (anonymousClassDeclaration != null && anonymousClassDeclaration.eIsProxy()) {
			InternalEObject oldAnonymousClassDeclaration = (InternalEObject)anonymousClassDeclaration;
			anonymousClassDeclaration = (AnonymousClassDeclaration_adapted)eResolveProxy(oldAnonymousClassDeclaration);
			if (anonymousClassDeclaration != oldAnonymousClassDeclaration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Java_adaptedPackage.CLASS_INSTANCE_CREATION_ADAPTED_ANONYMOUS_CLASS_DECLARATION_ITEM__ANONYMOUS_CLASS_DECLARATION, oldAnonymousClassDeclaration, anonymousClassDeclaration));
			}
		}
		return anonymousClassDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnonymousClassDeclaration_adapted basicGetAnonymousClassDeclaration() {
		return anonymousClassDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnonymousClassDeclaration(AnonymousClassDeclaration_adapted newAnonymousClassDeclaration) {
		AnonymousClassDeclaration_adapted oldAnonymousClassDeclaration = anonymousClassDeclaration;
		anonymousClassDeclaration = newAnonymousClassDeclaration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_adaptedPackage.CLASS_INSTANCE_CREATION_ADAPTED_ANONYMOUS_CLASS_DECLARATION_ITEM__ANONYMOUS_CLASS_DECLARATION, oldAnonymousClassDeclaration, anonymousClassDeclaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.CLASS_INSTANCE_CREATION_ADAPTED_ANONYMOUS_CLASS_DECLARATION_ITEM__ANONYMOUS_CLASS_DECLARATION:
				if (resolve) return getAnonymousClassDeclaration();
				return basicGetAnonymousClassDeclaration();
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
			case Java_adaptedPackage.CLASS_INSTANCE_CREATION_ADAPTED_ANONYMOUS_CLASS_DECLARATION_ITEM__ANONYMOUS_CLASS_DECLARATION:
				setAnonymousClassDeclaration((AnonymousClassDeclaration_adapted)newValue);
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
			case Java_adaptedPackage.CLASS_INSTANCE_CREATION_ADAPTED_ANONYMOUS_CLASS_DECLARATION_ITEM__ANONYMOUS_CLASS_DECLARATION:
				setAnonymousClassDeclaration((AnonymousClassDeclaration_adapted)null);
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
			case Java_adaptedPackage.CLASS_INSTANCE_CREATION_ADAPTED_ANONYMOUS_CLASS_DECLARATION_ITEM__ANONYMOUS_CLASS_DECLARATION:
				return anonymousClassDeclaration != null;
		}
		return super.eIsSet(featureID);
	}

} //ClassInstanceCreation_adapted_anonymousClassDeclarationItemImpl
