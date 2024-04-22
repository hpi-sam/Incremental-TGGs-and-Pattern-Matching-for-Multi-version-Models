/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ArrayType_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ArrayType_adapted_dimensionsValue;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ArrayType_adapted_elementTypeItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Type adapted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.ArrayType_adaptedImpl#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.ArrayType_adaptedImpl#getElementType <em>Element Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrayType_adaptedImpl extends Type_adaptedImpl implements ArrayType_adapted {
	/**
	 * The cached value of the '{@link #getDimensions() <em>Dimensions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensions()
	 * @generated
	 * @ordered
	 */
	protected EList<ArrayType_adapted_dimensionsValue> dimensions;

	/**
	 * The cached value of the '{@link #getElementType() <em>Element Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementType()
	 * @generated
	 * @ordered
	 */
	protected EList<ArrayType_adapted_elementTypeItem> elementType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayType_adaptedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getArrayType_adapted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArrayType_adapted_dimensionsValue> getDimensions() {
		if (dimensions == null) {
			dimensions = new EObjectResolvingEList<ArrayType_adapted_dimensionsValue>(ArrayType_adapted_dimensionsValue.class, this, Java_adaptedPackage.ARRAY_TYPE_ADAPTED__DIMENSIONS);
		}
		return dimensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArrayType_adapted_elementTypeItem> getElementType() {
		if (elementType == null) {
			elementType = new EObjectResolvingEList<ArrayType_adapted_elementTypeItem>(ArrayType_adapted_elementTypeItem.class, this, Java_adaptedPackage.ARRAY_TYPE_ADAPTED__ELEMENT_TYPE);
		}
		return elementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.ARRAY_TYPE_ADAPTED__DIMENSIONS:
				return getDimensions();
			case Java_adaptedPackage.ARRAY_TYPE_ADAPTED__ELEMENT_TYPE:
				return getElementType();
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
			case Java_adaptedPackage.ARRAY_TYPE_ADAPTED__DIMENSIONS:
				getDimensions().clear();
				getDimensions().addAll((Collection<? extends ArrayType_adapted_dimensionsValue>)newValue);
				return;
			case Java_adaptedPackage.ARRAY_TYPE_ADAPTED__ELEMENT_TYPE:
				getElementType().clear();
				getElementType().addAll((Collection<? extends ArrayType_adapted_elementTypeItem>)newValue);
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
			case Java_adaptedPackage.ARRAY_TYPE_ADAPTED__DIMENSIONS:
				getDimensions().clear();
				return;
			case Java_adaptedPackage.ARRAY_TYPE_ADAPTED__ELEMENT_TYPE:
				getElementType().clear();
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
			case Java_adaptedPackage.ARRAY_TYPE_ADAPTED__DIMENSIONS:
				return dimensions != null && !dimensions.isEmpty();
			case Java_adaptedPackage.ARRAY_TYPE_ADAPTED__ELEMENT_TYPE:
				return elementType != null && !elementType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArrayType_adaptedImpl
