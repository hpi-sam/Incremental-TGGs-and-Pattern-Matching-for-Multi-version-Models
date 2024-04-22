/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ParameterizedType_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ParameterizedType_adapted_typeArgumentsItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ParameterizedType_adapted_typeItem;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameterized Type adapted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.ParameterizedType_adaptedImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.ParameterizedType_adaptedImpl#getTypeArguments <em>Type Arguments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterizedType_adaptedImpl extends Type_adaptedImpl implements ParameterizedType_adapted {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterizedType_adapted_typeItem> type;

	/**
	 * The cached value of the '{@link #getTypeArguments() <em>Type Arguments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterizedType_adapted_typeArgumentsItem> typeArguments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterizedType_adaptedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getParameterizedType_adapted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ParameterizedType_adapted_typeItem> getType() {
		if (type == null) {
			type = new EObjectResolvingEList<ParameterizedType_adapted_typeItem>(ParameterizedType_adapted_typeItem.class, this, Java_adaptedPackage.PARAMETERIZED_TYPE_ADAPTED__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ParameterizedType_adapted_typeArgumentsItem> getTypeArguments() {
		if (typeArguments == null) {
			typeArguments = new EObjectResolvingEList<ParameterizedType_adapted_typeArgumentsItem>(ParameterizedType_adapted_typeArgumentsItem.class, this, Java_adaptedPackage.PARAMETERIZED_TYPE_ADAPTED__TYPE_ARGUMENTS);
		}
		return typeArguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.PARAMETERIZED_TYPE_ADAPTED__TYPE:
				return getType();
			case Java_adaptedPackage.PARAMETERIZED_TYPE_ADAPTED__TYPE_ARGUMENTS:
				return getTypeArguments();
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
			case Java_adaptedPackage.PARAMETERIZED_TYPE_ADAPTED__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends ParameterizedType_adapted_typeItem>)newValue);
				return;
			case Java_adaptedPackage.PARAMETERIZED_TYPE_ADAPTED__TYPE_ARGUMENTS:
				getTypeArguments().clear();
				getTypeArguments().addAll((Collection<? extends ParameterizedType_adapted_typeArgumentsItem>)newValue);
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
			case Java_adaptedPackage.PARAMETERIZED_TYPE_ADAPTED__TYPE:
				getType().clear();
				return;
			case Java_adaptedPackage.PARAMETERIZED_TYPE_ADAPTED__TYPE_ARGUMENTS:
				getTypeArguments().clear();
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
			case Java_adaptedPackage.PARAMETERIZED_TYPE_ADAPTED__TYPE:
				return type != null && !type.isEmpty();
			case Java_adaptedPackage.PARAMETERIZED_TYPE_ADAPTED__TYPE_ARGUMENTS:
				return typeArguments != null && !typeArguments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ParameterizedType_adaptedImpl
