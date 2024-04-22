/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.EnumDeclaration_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.EnumDeclaration_adapted_enumConstantsItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum Declaration adapted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.EnumDeclaration_adaptedImpl#getEnumConstants <em>Enum Constants</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumDeclaration_adaptedImpl extends AbstractTypeDeclaration_adaptedImpl implements EnumDeclaration_adapted {
	/**
	 * The cached value of the '{@link #getEnumConstants() <em>Enum Constants</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumConstants()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumDeclaration_adapted_enumConstantsItem> enumConstants;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumDeclaration_adaptedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getEnumDeclaration_adapted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EnumDeclaration_adapted_enumConstantsItem> getEnumConstants() {
		if (enumConstants == null) {
			enumConstants = new EObjectResolvingEList<EnumDeclaration_adapted_enumConstantsItem>(EnumDeclaration_adapted_enumConstantsItem.class, this, Java_adaptedPackage.ENUM_DECLARATION_ADAPTED__ENUM_CONSTANTS);
		}
		return enumConstants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.ENUM_DECLARATION_ADAPTED__ENUM_CONSTANTS:
				return getEnumConstants();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_adaptedPackage.ENUM_DECLARATION_ADAPTED__ENUM_CONSTANTS:
				getEnumConstants().clear();
				getEnumConstants().addAll((Collection<? extends EnumDeclaration_adapted_enumConstantsItem>)newValue);
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
			case Java_adaptedPackage.ENUM_DECLARATION_ADAPTED__ENUM_CONSTANTS:
				getEnumConstants().clear();
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
			case Java_adaptedPackage.ENUM_DECLARATION_ADAPTED__ENUM_CONSTANTS:
				return enumConstants != null && !enumConstants.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EnumDeclaration_adaptedImpl
