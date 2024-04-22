/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MethodDeclaration_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MethodDeclaration_adapted_extraArrayDimensionsValue;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MethodDeclaration_adapted_redefinedMethodDeclarationItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MethodDeclaration_adapted_redefinitionsItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MethodDeclaration_adapted_returnTypeItem;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Declaration adapted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.MethodDeclaration_adaptedImpl#getExtraArrayDimensions <em>Extra Array Dimensions</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.MethodDeclaration_adaptedImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.MethodDeclaration_adaptedImpl#getRedefinedMethodDeclaration <em>Redefined Method Declaration</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.MethodDeclaration_adaptedImpl#getRedefinitions <em>Redefinitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodDeclaration_adaptedImpl extends AbstractMethodDeclaration_adaptedImpl implements MethodDeclaration_adapted {
	/**
	 * The cached value of the '{@link #getExtraArrayDimensions() <em>Extra Array Dimensions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtraArrayDimensions()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodDeclaration_adapted_extraArrayDimensionsValue> extraArrayDimensions;

	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodDeclaration_adapted_returnTypeItem> returnType;

	/**
	 * The cached value of the '{@link #getRedefinedMethodDeclaration() <em>Redefined Method Declaration</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedMethodDeclaration()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodDeclaration_adapted_redefinedMethodDeclarationItem> redefinedMethodDeclaration;

	/**
	 * The cached value of the '{@link #getRedefinitions() <em>Redefinitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodDeclaration_adapted_redefinitionsItem> redefinitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodDeclaration_adaptedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getMethodDeclaration_adapted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MethodDeclaration_adapted_extraArrayDimensionsValue> getExtraArrayDimensions() {
		if (extraArrayDimensions == null) {
			extraArrayDimensions = new EObjectResolvingEList<MethodDeclaration_adapted_extraArrayDimensionsValue>(MethodDeclaration_adapted_extraArrayDimensionsValue.class, this, Java_adaptedPackage.METHOD_DECLARATION_ADAPTED__EXTRA_ARRAY_DIMENSIONS);
		}
		return extraArrayDimensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MethodDeclaration_adapted_returnTypeItem> getReturnType() {
		if (returnType == null) {
			returnType = new EObjectResolvingEList<MethodDeclaration_adapted_returnTypeItem>(MethodDeclaration_adapted_returnTypeItem.class, this, Java_adaptedPackage.METHOD_DECLARATION_ADAPTED__RETURN_TYPE);
		}
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MethodDeclaration_adapted_redefinedMethodDeclarationItem> getRedefinedMethodDeclaration() {
		if (redefinedMethodDeclaration == null) {
			redefinedMethodDeclaration = new EObjectResolvingEList<MethodDeclaration_adapted_redefinedMethodDeclarationItem>(MethodDeclaration_adapted_redefinedMethodDeclarationItem.class, this, Java_adaptedPackage.METHOD_DECLARATION_ADAPTED__REDEFINED_METHOD_DECLARATION);
		}
		return redefinedMethodDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MethodDeclaration_adapted_redefinitionsItem> getRedefinitions() {
		if (redefinitions == null) {
			redefinitions = new EObjectResolvingEList<MethodDeclaration_adapted_redefinitionsItem>(MethodDeclaration_adapted_redefinitionsItem.class, this, Java_adaptedPackage.METHOD_DECLARATION_ADAPTED__REDEFINITIONS);
		}
		return redefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.METHOD_DECLARATION_ADAPTED__EXTRA_ARRAY_DIMENSIONS:
				return getExtraArrayDimensions();
			case Java_adaptedPackage.METHOD_DECLARATION_ADAPTED__RETURN_TYPE:
				return getReturnType();
			case Java_adaptedPackage.METHOD_DECLARATION_ADAPTED__REDEFINED_METHOD_DECLARATION:
				return getRedefinedMethodDeclaration();
			case Java_adaptedPackage.METHOD_DECLARATION_ADAPTED__REDEFINITIONS:
				return getRedefinitions();
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
			case Java_adaptedPackage.METHOD_DECLARATION_ADAPTED__EXTRA_ARRAY_DIMENSIONS:
				getExtraArrayDimensions().clear();
				getExtraArrayDimensions().addAll((Collection<? extends MethodDeclaration_adapted_extraArrayDimensionsValue>)newValue);
				return;
			case Java_adaptedPackage.METHOD_DECLARATION_ADAPTED__RETURN_TYPE:
				getReturnType().clear();
				getReturnType().addAll((Collection<? extends MethodDeclaration_adapted_returnTypeItem>)newValue);
				return;
			case Java_adaptedPackage.METHOD_DECLARATION_ADAPTED__REDEFINED_METHOD_DECLARATION:
				getRedefinedMethodDeclaration().clear();
				getRedefinedMethodDeclaration().addAll((Collection<? extends MethodDeclaration_adapted_redefinedMethodDeclarationItem>)newValue);
				return;
			case Java_adaptedPackage.METHOD_DECLARATION_ADAPTED__REDEFINITIONS:
				getRedefinitions().clear();
				getRedefinitions().addAll((Collection<? extends MethodDeclaration_adapted_redefinitionsItem>)newValue);
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
			case Java_adaptedPackage.METHOD_DECLARATION_ADAPTED__EXTRA_ARRAY_DIMENSIONS:
				getExtraArrayDimensions().clear();
				return;
			case Java_adaptedPackage.METHOD_DECLARATION_ADAPTED__RETURN_TYPE:
				getReturnType().clear();
				return;
			case Java_adaptedPackage.METHOD_DECLARATION_ADAPTED__REDEFINED_METHOD_DECLARATION:
				getRedefinedMethodDeclaration().clear();
				return;
			case Java_adaptedPackage.METHOD_DECLARATION_ADAPTED__REDEFINITIONS:
				getRedefinitions().clear();
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
			case Java_adaptedPackage.METHOD_DECLARATION_ADAPTED__EXTRA_ARRAY_DIMENSIONS:
				return extraArrayDimensions != null && !extraArrayDimensions.isEmpty();
			case Java_adaptedPackage.METHOD_DECLARATION_ADAPTED__RETURN_TYPE:
				return returnType != null && !returnType.isEmpty();
			case Java_adaptedPackage.METHOD_DECLARATION_ADAPTED__REDEFINED_METHOD_DECLARATION:
				return redefinedMethodDeclaration != null && !redefinedMethodDeclaration.isEmpty();
			case Java_adaptedPackage.METHOD_DECLARATION_ADAPTED__REDEFINITIONS:
				return redefinitions != null && !redefinitions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MethodDeclaration_adaptedImpl
