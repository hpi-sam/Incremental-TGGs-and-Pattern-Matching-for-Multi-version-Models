/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.EnumConstantDeclaration_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.EnumConstantDeclaration_adapted_anonymousClassDeclarationItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.EnumConstantDeclaration_adapted_argumentsItem;
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
 * An implementation of the model object '<em><b>Enum Constant Declaration adapted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.EnumConstantDeclaration_adaptedImpl#getExtraArrayDimensions <em>Extra Array Dimensions</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.EnumConstantDeclaration_adaptedImpl#getInitializer <em>Initializer</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.EnumConstantDeclaration_adaptedImpl#getUsageInVariableAccess <em>Usage In Variable Access</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.EnumConstantDeclaration_adaptedImpl#getAnonymousClassDeclaration <em>Anonymous Class Declaration</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.EnumConstantDeclaration_adaptedImpl#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumConstantDeclaration_adaptedImpl extends BodyDeclaration_adaptedImpl implements EnumConstantDeclaration_adapted {
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
	 * The cached value of the '{@link #getAnonymousClassDeclaration() <em>Anonymous Class Declaration</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnonymousClassDeclaration()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumConstantDeclaration_adapted_anonymousClassDeclarationItem> anonymousClassDeclaration;

	/**
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumConstantDeclaration_adapted_argumentsItem> arguments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumConstantDeclaration_adaptedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getEnumConstantDeclaration_adapted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VariableDeclaration_adapted_extraArrayDimensionsValue> getExtraArrayDimensions() {
		if (extraArrayDimensions == null) {
			extraArrayDimensions = new EObjectResolvingEList<VariableDeclaration_adapted_extraArrayDimensionsValue>(VariableDeclaration_adapted_extraArrayDimensionsValue.class, this, Java_adaptedPackage.ENUM_CONSTANT_DECLARATION_ADAPTED__EXTRA_ARRAY_DIMENSIONS);
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
			initializer = new EObjectResolvingEList<VariableDeclaration_adapted_initializerItem>(VariableDeclaration_adapted_initializerItem.class, this, Java_adaptedPackage.ENUM_CONSTANT_DECLARATION_ADAPTED__INITIALIZER);
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
			usageInVariableAccess = new EObjectResolvingEList<VariableDeclaration_adapted_usageInVariableAccessItem>(VariableDeclaration_adapted_usageInVariableAccessItem.class, this, Java_adaptedPackage.ENUM_CONSTANT_DECLARATION_ADAPTED__USAGE_IN_VARIABLE_ACCESS);
		}
		return usageInVariableAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EnumConstantDeclaration_adapted_anonymousClassDeclarationItem> getAnonymousClassDeclaration() {
		if (anonymousClassDeclaration == null) {
			anonymousClassDeclaration = new EObjectResolvingEList<EnumConstantDeclaration_adapted_anonymousClassDeclarationItem>(EnumConstantDeclaration_adapted_anonymousClassDeclarationItem.class, this, Java_adaptedPackage.ENUM_CONSTANT_DECLARATION_ADAPTED__ANONYMOUS_CLASS_DECLARATION);
		}
		return anonymousClassDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EnumConstantDeclaration_adapted_argumentsItem> getArguments() {
		if (arguments == null) {
			arguments = new EObjectResolvingEList<EnumConstantDeclaration_adapted_argumentsItem>(EnumConstantDeclaration_adapted_argumentsItem.class, this, Java_adaptedPackage.ENUM_CONSTANT_DECLARATION_ADAPTED__ARGUMENTS);
		}
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.ENUM_CONSTANT_DECLARATION_ADAPTED__EXTRA_ARRAY_DIMENSIONS:
				return getExtraArrayDimensions();
			case Java_adaptedPackage.ENUM_CONSTANT_DECLARATION_ADAPTED__INITIALIZER:
				return getInitializer();
			case Java_adaptedPackage.ENUM_CONSTANT_DECLARATION_ADAPTED__USAGE_IN_VARIABLE_ACCESS:
				return getUsageInVariableAccess();
			case Java_adaptedPackage.ENUM_CONSTANT_DECLARATION_ADAPTED__ANONYMOUS_CLASS_DECLARATION:
				return getAnonymousClassDeclaration();
			case Java_adaptedPackage.ENUM_CONSTANT_DECLARATION_ADAPTED__ARGUMENTS:
				return getArguments();
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
			case Java_adaptedPackage.ENUM_CONSTANT_DECLARATION_ADAPTED__EXTRA_ARRAY_DIMENSIONS:
				getExtraArrayDimensions().clear();
				getExtraArrayDimensions().addAll((Collection<? extends VariableDeclaration_adapted_extraArrayDimensionsValue>)newValue);
				return;
			case Java_adaptedPackage.ENUM_CONSTANT_DECLARATION_ADAPTED__INITIALIZER:
				getInitializer().clear();
				getInitializer().addAll((Collection<? extends VariableDeclaration_adapted_initializerItem>)newValue);
				return;
			case Java_adaptedPackage.ENUM_CONSTANT_DECLARATION_ADAPTED__USAGE_IN_VARIABLE_ACCESS:
				getUsageInVariableAccess().clear();
				getUsageInVariableAccess().addAll((Collection<? extends VariableDeclaration_adapted_usageInVariableAccessItem>)newValue);
				return;
			case Java_adaptedPackage.ENUM_CONSTANT_DECLARATION_ADAPTED__ANONYMOUS_CLASS_DECLARATION:
				getAnonymousClassDeclaration().clear();
				getAnonymousClassDeclaration().addAll((Collection<? extends EnumConstantDeclaration_adapted_anonymousClassDeclarationItem>)newValue);
				return;
			case Java_adaptedPackage.ENUM_CONSTANT_DECLARATION_ADAPTED__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends EnumConstantDeclaration_adapted_argumentsItem>)newValue);
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
			case Java_adaptedPackage.ENUM_CONSTANT_DECLARATION_ADAPTED__EXTRA_ARRAY_DIMENSIONS:
				getExtraArrayDimensions().clear();
				return;
			case Java_adaptedPackage.ENUM_CONSTANT_DECLARATION_ADAPTED__INITIALIZER:
				getInitializer().clear();
				return;
			case Java_adaptedPackage.ENUM_CONSTANT_DECLARATION_ADAPTED__USAGE_IN_VARIABLE_ACCESS:
				getUsageInVariableAccess().clear();
				return;
			case Java_adaptedPackage.ENUM_CONSTANT_DECLARATION_ADAPTED__ANONYMOUS_CLASS_DECLARATION:
				getAnonymousClassDeclaration().clear();
				return;
			case Java_adaptedPackage.ENUM_CONSTANT_DECLARATION_ADAPTED__ARGUMENTS:
				getArguments().clear();
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
			case Java_adaptedPackage.ENUM_CONSTANT_DECLARATION_ADAPTED__EXTRA_ARRAY_DIMENSIONS:
				return extraArrayDimensions != null && !extraArrayDimensions.isEmpty();
			case Java_adaptedPackage.ENUM_CONSTANT_DECLARATION_ADAPTED__INITIALIZER:
				return initializer != null && !initializer.isEmpty();
			case Java_adaptedPackage.ENUM_CONSTANT_DECLARATION_ADAPTED__USAGE_IN_VARIABLE_ACCESS:
				return usageInVariableAccess != null && !usageInVariableAccess.isEmpty();
			case Java_adaptedPackage.ENUM_CONSTANT_DECLARATION_ADAPTED__ANONYMOUS_CLASS_DECLARATION:
				return anonymousClassDeclaration != null && !anonymousClassDeclaration.isEmpty();
			case Java_adaptedPackage.ENUM_CONSTANT_DECLARATION_ADAPTED__ARGUMENTS:
				return arguments != null && !arguments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == VariableDeclaration_adapted.class) {
			switch (derivedFeatureID) {
				case Java_adaptedPackage.ENUM_CONSTANT_DECLARATION_ADAPTED__EXTRA_ARRAY_DIMENSIONS: return Java_adaptedPackage.VARIABLE_DECLARATION_ADAPTED__EXTRA_ARRAY_DIMENSIONS;
				case Java_adaptedPackage.ENUM_CONSTANT_DECLARATION_ADAPTED__INITIALIZER: return Java_adaptedPackage.VARIABLE_DECLARATION_ADAPTED__INITIALIZER;
				case Java_adaptedPackage.ENUM_CONSTANT_DECLARATION_ADAPTED__USAGE_IN_VARIABLE_ACCESS: return Java_adaptedPackage.VARIABLE_DECLARATION_ADAPTED__USAGE_IN_VARIABLE_ACCESS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == VariableDeclaration_adapted.class) {
			switch (baseFeatureID) {
				case Java_adaptedPackage.VARIABLE_DECLARATION_ADAPTED__EXTRA_ARRAY_DIMENSIONS: return Java_adaptedPackage.ENUM_CONSTANT_DECLARATION_ADAPTED__EXTRA_ARRAY_DIMENSIONS;
				case Java_adaptedPackage.VARIABLE_DECLARATION_ADAPTED__INITIALIZER: return Java_adaptedPackage.ENUM_CONSTANT_DECLARATION_ADAPTED__INITIALIZER;
				case Java_adaptedPackage.VARIABLE_DECLARATION_ADAPTED__USAGE_IN_VARIABLE_ACCESS: return Java_adaptedPackage.ENUM_CONSTANT_DECLARATION_ADAPTED__USAGE_IN_VARIABLE_ACCESS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //EnumConstantDeclaration_adaptedImpl
