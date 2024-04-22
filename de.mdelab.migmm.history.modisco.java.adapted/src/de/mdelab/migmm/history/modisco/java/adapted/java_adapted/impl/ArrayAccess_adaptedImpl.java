/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ArrayAccess_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ArrayAccess_adapted_arrayItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ArrayAccess_adapted_indexItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Access adapted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.ArrayAccess_adaptedImpl#getArray <em>Array</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.ArrayAccess_adaptedImpl#getIndex <em>Index</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrayAccess_adaptedImpl extends Expression_adaptedImpl implements ArrayAccess_adapted {
	/**
	 * The cached value of the '{@link #getArray() <em>Array</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArray()
	 * @generated
	 * @ordered
	 */
	protected EList<ArrayAccess_adapted_arrayItem> array;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected EList<ArrayAccess_adapted_indexItem> index;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayAccess_adaptedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getArrayAccess_adapted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArrayAccess_adapted_arrayItem> getArray() {
		if (array == null) {
			array = new EObjectResolvingEList<ArrayAccess_adapted_arrayItem>(ArrayAccess_adapted_arrayItem.class, this, Java_adaptedPackage.ARRAY_ACCESS_ADAPTED__ARRAY);
		}
		return array;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArrayAccess_adapted_indexItem> getIndex() {
		if (index == null) {
			index = new EObjectResolvingEList<ArrayAccess_adapted_indexItem>(ArrayAccess_adapted_indexItem.class, this, Java_adaptedPackage.ARRAY_ACCESS_ADAPTED__INDEX);
		}
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.ARRAY_ACCESS_ADAPTED__ARRAY:
				return getArray();
			case Java_adaptedPackage.ARRAY_ACCESS_ADAPTED__INDEX:
				return getIndex();
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
			case Java_adaptedPackage.ARRAY_ACCESS_ADAPTED__ARRAY:
				getArray().clear();
				getArray().addAll((Collection<? extends ArrayAccess_adapted_arrayItem>)newValue);
				return;
			case Java_adaptedPackage.ARRAY_ACCESS_ADAPTED__INDEX:
				getIndex().clear();
				getIndex().addAll((Collection<? extends ArrayAccess_adapted_indexItem>)newValue);
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
			case Java_adaptedPackage.ARRAY_ACCESS_ADAPTED__ARRAY:
				getArray().clear();
				return;
			case Java_adaptedPackage.ARRAY_ACCESS_ADAPTED__INDEX:
				getIndex().clear();
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
			case Java_adaptedPackage.ARRAY_ACCESS_ADAPTED__ARRAY:
				return array != null && !array.isEmpty();
			case Java_adaptedPackage.ARRAY_ACCESS_ADAPTED__INDEX:
				return index != null && !index.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArrayAccess_adaptedImpl
