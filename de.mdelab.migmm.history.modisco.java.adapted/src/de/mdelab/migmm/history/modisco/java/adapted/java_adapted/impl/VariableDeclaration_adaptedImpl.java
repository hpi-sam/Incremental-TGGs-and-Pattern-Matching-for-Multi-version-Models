/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.VariableDeclaration_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.VariableDeclaration_adapted_extraArrayDimensionsValue;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.VariableDeclaration_adapted_initializerItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.VariableDeclaration_adapted_usageInVariableAccessItem;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Declaration adapted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.VariableDeclaration_adaptedImpl#getExtraArrayDimensions <em>Extra Array Dimensions</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.VariableDeclaration_adaptedImpl#getInitializer <em>Initializer</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.VariableDeclaration_adaptedImpl#getUsageInVariableAccess <em>Usage In Variable Access</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class VariableDeclaration_adaptedImpl extends NamedElement_adaptedImpl implements VariableDeclaration_adapted {
	/**
	 * The cached value of the '{@link #getExtraArrayDimensions() <em>Extra Array Dimensions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtraArrayDimensions()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableDeclaration_adapted_extraArrayDimensionsValue> extraArrayDimensions;

	/**
	 * The cached value of the '{@link #getInitializer() <em>Initializer</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitializer()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableDeclaration_adapted_initializerItem> initializer;

	/**
	 * The cached value of the '{@link #getUsageInVariableAccess() <em>Usage In Variable Access</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageInVariableAccess()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableDeclaration_adapted_usageInVariableAccessItem> usageInVariableAccess;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableDeclaration_adaptedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getVariableDeclaration_adapted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VariableDeclaration_adapted_extraArrayDimensionsValue> getExtraArrayDimensions() {
		if (extraArrayDimensions == null) {
			extraArrayDimensions = new EObjectResolvingEList<VariableDeclaration_adapted_extraArrayDimensionsValue>(VariableDeclaration_adapted_extraArrayDimensionsValue.class, this, Java_adaptedPackage.VARIABLE_DECLARATION_ADAPTED__EXTRA_ARRAY_DIMENSIONS);
		}
		return extraArrayDimensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VariableDeclaration_adapted_initializerItem> getInitializer() {
		if (initializer == null) {
			initializer = new EObjectResolvingEList<VariableDeclaration_adapted_initializerItem>(VariableDeclaration_adapted_initializerItem.class, this, Java_adaptedPackage.VARIABLE_DECLARATION_ADAPTED__INITIALIZER);
		}
		return initializer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VariableDeclaration_adapted_usageInVariableAccessItem> getUsageInVariableAccess() {
		if (usageInVariableAccess == null) {
			usageInVariableAccess = new EObjectResolvingEList<VariableDeclaration_adapted_usageInVariableAccessItem>(VariableDeclaration_adapted_usageInVariableAccessItem.class, this, Java_adaptedPackage.VARIABLE_DECLARATION_ADAPTED__USAGE_IN_VARIABLE_ACCESS);
		}
		return usageInVariableAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.VARIABLE_DECLARATION_ADAPTED__EXTRA_ARRAY_DIMENSIONS:
				return getExtraArrayDimensions();
			case Java_adaptedPackage.VARIABLE_DECLARATION_ADAPTED__INITIALIZER:
				return getInitializer();
			case Java_adaptedPackage.VARIABLE_DECLARATION_ADAPTED__USAGE_IN_VARIABLE_ACCESS:
				return getUsageInVariableAccess();
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
			case Java_adaptedPackage.VARIABLE_DECLARATION_ADAPTED__EXTRA_ARRAY_DIMENSIONS:
				getExtraArrayDimensions().clear();
				getExtraArrayDimensions().addAll((Collection<? extends VariableDeclaration_adapted_extraArrayDimensionsValue>)newValue);
				return;
			case Java_adaptedPackage.VARIABLE_DECLARATION_ADAPTED__INITIALIZER:
				getInitializer().clear();
				getInitializer().addAll((Collection<? extends VariableDeclaration_adapted_initializerItem>)newValue);
				return;
			case Java_adaptedPackage.VARIABLE_DECLARATION_ADAPTED__USAGE_IN_VARIABLE_ACCESS:
				getUsageInVariableAccess().clear();
				getUsageInVariableAccess().addAll((Collection<? extends VariableDeclaration_adapted_usageInVariableAccessItem>)newValue);
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
			case Java_adaptedPackage.VARIABLE_DECLARATION_ADAPTED__EXTRA_ARRAY_DIMENSIONS:
				getExtraArrayDimensions().clear();
				return;
			case Java_adaptedPackage.VARIABLE_DECLARATION_ADAPTED__INITIALIZER:
				getInitializer().clear();
				return;
			case Java_adaptedPackage.VARIABLE_DECLARATION_ADAPTED__USAGE_IN_VARIABLE_ACCESS:
				getUsageInVariableAccess().clear();
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
			case Java_adaptedPackage.VARIABLE_DECLARATION_ADAPTED__EXTRA_ARRAY_DIMENSIONS:
				return extraArrayDimensions != null && !extraArrayDimensions.isEmpty();
			case Java_adaptedPackage.VARIABLE_DECLARATION_ADAPTED__INITIALIZER:
				return initializer != null && !initializer.isEmpty();
			case Java_adaptedPackage.VARIABLE_DECLARATION_ADAPTED__USAGE_IN_VARIABLE_ACCESS:
				return usageInVariableAccess != null && !usageInVariableAccess.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VariableDeclaration_adaptedImpl
