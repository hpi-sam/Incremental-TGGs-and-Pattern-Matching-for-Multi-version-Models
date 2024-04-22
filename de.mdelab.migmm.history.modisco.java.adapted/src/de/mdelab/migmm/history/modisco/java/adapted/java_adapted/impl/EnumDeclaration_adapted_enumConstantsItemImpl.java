/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.ContainmentEdgeWithHistoryImpl;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.EnumConstantDeclaration_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.EnumDeclaration_adapted_enumConstantsItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum Declaration adapted enum Constants Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.EnumDeclaration_adapted_enumConstantsItemImpl#getEnumConstants <em>Enum Constants</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumDeclaration_adapted_enumConstantsItemImpl extends ContainmentEdgeWithHistoryImpl implements EnumDeclaration_adapted_enumConstantsItem {
	/**
	 * The cached value of the '{@link #getEnumConstants() <em>Enum Constants</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumConstants()
	 * @generated
	 * @ordered
	 */
	protected EnumConstantDeclaration_adapted enumConstants;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumDeclaration_adapted_enumConstantsItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getEnumDeclaration_adapted_enumConstantsItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumConstantDeclaration_adapted getEnumConstants() {
		if (enumConstants != null && enumConstants.eIsProxy()) {
			InternalEObject oldEnumConstants = (InternalEObject)enumConstants;
			enumConstants = (EnumConstantDeclaration_adapted)eResolveProxy(oldEnumConstants);
			if (enumConstants != oldEnumConstants) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Java_adaptedPackage.ENUM_DECLARATION_ADAPTED_ENUM_CONSTANTS_ITEM__ENUM_CONSTANTS, oldEnumConstants, enumConstants));
			}
		}
		return enumConstants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumConstantDeclaration_adapted basicGetEnumConstants() {
		return enumConstants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnumConstants(EnumConstantDeclaration_adapted newEnumConstants) {
		EnumConstantDeclaration_adapted oldEnumConstants = enumConstants;
		enumConstants = newEnumConstants;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_adaptedPackage.ENUM_DECLARATION_ADAPTED_ENUM_CONSTANTS_ITEM__ENUM_CONSTANTS, oldEnumConstants, enumConstants));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.ENUM_DECLARATION_ADAPTED_ENUM_CONSTANTS_ITEM__ENUM_CONSTANTS:
				if (resolve) return getEnumConstants();
				return basicGetEnumConstants();
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
			case Java_adaptedPackage.ENUM_DECLARATION_ADAPTED_ENUM_CONSTANTS_ITEM__ENUM_CONSTANTS:
				setEnumConstants((EnumConstantDeclaration_adapted)newValue);
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
			case Java_adaptedPackage.ENUM_DECLARATION_ADAPTED_ENUM_CONSTANTS_ITEM__ENUM_CONSTANTS:
				setEnumConstants((EnumConstantDeclaration_adapted)null);
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
			case Java_adaptedPackage.ENUM_DECLARATION_ADAPTED_ENUM_CONSTANTS_ITEM__ENUM_CONSTANTS:
				return enumConstants != null;
		}
		return super.eIsSet(featureID);
	}

} //EnumDeclaration_adapted_enumConstantsItemImpl
