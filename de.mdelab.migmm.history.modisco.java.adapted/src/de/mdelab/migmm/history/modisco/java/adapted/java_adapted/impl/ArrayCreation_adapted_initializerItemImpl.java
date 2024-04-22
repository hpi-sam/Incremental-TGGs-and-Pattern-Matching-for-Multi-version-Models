/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.ContainmentEdgeWithHistoryImpl;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ArrayCreation_adapted_initializerItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ArrayInitializer_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Creation adapted initializer Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.ArrayCreation_adapted_initializerItemImpl#getInitializer <em>Initializer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrayCreation_adapted_initializerItemImpl extends ContainmentEdgeWithHistoryImpl implements ArrayCreation_adapted_initializerItem {
	/**
	 * The cached value of the '{@link #getInitializer() <em>Initializer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitializer()
	 * @generated
	 * @ordered
	 */
	protected ArrayInitializer_adapted initializer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayCreation_adapted_initializerItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getArrayCreation_adapted_initializerItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrayInitializer_adapted getInitializer() {
		if (initializer != null && initializer.eIsProxy()) {
			InternalEObject oldInitializer = (InternalEObject)initializer;
			initializer = (ArrayInitializer_adapted)eResolveProxy(oldInitializer);
			if (initializer != oldInitializer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Java_adaptedPackage.ARRAY_CREATION_ADAPTED_INITIALIZER_ITEM__INITIALIZER, oldInitializer, initializer));
			}
		}
		return initializer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayInitializer_adapted basicGetInitializer() {
		return initializer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitializer(ArrayInitializer_adapted newInitializer) {
		ArrayInitializer_adapted oldInitializer = initializer;
		initializer = newInitializer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_adaptedPackage.ARRAY_CREATION_ADAPTED_INITIALIZER_ITEM__INITIALIZER, oldInitializer, initializer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.ARRAY_CREATION_ADAPTED_INITIALIZER_ITEM__INITIALIZER:
				if (resolve) return getInitializer();
				return basicGetInitializer();
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
			case Java_adaptedPackage.ARRAY_CREATION_ADAPTED_INITIALIZER_ITEM__INITIALIZER:
				setInitializer((ArrayInitializer_adapted)newValue);
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
			case Java_adaptedPackage.ARRAY_CREATION_ADAPTED_INITIALIZER_ITEM__INITIALIZER:
				setInitializer((ArrayInitializer_adapted)null);
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
			case Java_adaptedPackage.ARRAY_CREATION_ADAPTED_INITIALIZER_ITEM__INITIALIZER:
				return initializer != null;
		}
		return super.eIsSet(featureID);
	}

} //ArrayCreation_adapted_initializerItemImpl
