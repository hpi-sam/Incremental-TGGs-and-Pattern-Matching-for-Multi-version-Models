/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.ContainmentEdgeWithHistoryImpl;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ParameterizedType_adapted_typeArgumentsItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TypeAccess_adapted;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameterized Type adapted type Arguments Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.ParameterizedType_adapted_typeArgumentsItemImpl#getTypeArguments <em>Type Arguments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterizedType_adapted_typeArgumentsItemImpl extends ContainmentEdgeWithHistoryImpl implements ParameterizedType_adapted_typeArgumentsItem {
	/**
	 * The cached value of the '{@link #getTypeArguments() <em>Type Arguments</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeArguments()
	 * @generated
	 * @ordered
	 */
	protected TypeAccess_adapted typeArguments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterizedType_adapted_typeArgumentsItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getParameterizedType_adapted_typeArgumentsItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeAccess_adapted getTypeArguments() {
		if (typeArguments != null && typeArguments.eIsProxy()) {
			InternalEObject oldTypeArguments = (InternalEObject)typeArguments;
			typeArguments = (TypeAccess_adapted)eResolveProxy(oldTypeArguments);
			if (typeArguments != oldTypeArguments) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Java_adaptedPackage.PARAMETERIZED_TYPE_ADAPTED_TYPE_ARGUMENTS_ITEM__TYPE_ARGUMENTS, oldTypeArguments, typeArguments));
			}
		}
		return typeArguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAccess_adapted basicGetTypeArguments() {
		return typeArguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypeArguments(TypeAccess_adapted newTypeArguments) {
		TypeAccess_adapted oldTypeArguments = typeArguments;
		typeArguments = newTypeArguments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_adaptedPackage.PARAMETERIZED_TYPE_ADAPTED_TYPE_ARGUMENTS_ITEM__TYPE_ARGUMENTS, oldTypeArguments, typeArguments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.PARAMETERIZED_TYPE_ADAPTED_TYPE_ARGUMENTS_ITEM__TYPE_ARGUMENTS:
				if (resolve) return getTypeArguments();
				return basicGetTypeArguments();
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
			case Java_adaptedPackage.PARAMETERIZED_TYPE_ADAPTED_TYPE_ARGUMENTS_ITEM__TYPE_ARGUMENTS:
				setTypeArguments((TypeAccess_adapted)newValue);
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
			case Java_adaptedPackage.PARAMETERIZED_TYPE_ADAPTED_TYPE_ARGUMENTS_ITEM__TYPE_ARGUMENTS:
				setTypeArguments((TypeAccess_adapted)null);
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
			case Java_adaptedPackage.PARAMETERIZED_TYPE_ADAPTED_TYPE_ARGUMENTS_ITEM__TYPE_ARGUMENTS:
				return typeArguments != null;
		}
		return super.eIsSet(featureID);
	}

} //ParameterizedType_adapted_typeArgumentsItemImpl
