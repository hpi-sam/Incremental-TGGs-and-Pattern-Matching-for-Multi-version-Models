/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ArrayLengthAccess_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ArrayLengthAccess_adapted_arrayItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Length Access adapted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.ArrayLengthAccess_adaptedImpl#getArray <em>Array</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrayLengthAccess_adaptedImpl extends Expression_adaptedImpl implements ArrayLengthAccess_adapted {
	/**
	 * The cached value of the '{@link #getArray() <em>Array</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArray()
	 * @generated
	 * @ordered
	 */
	protected EList<ArrayLengthAccess_adapted_arrayItem> array;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayLengthAccess_adaptedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getArrayLengthAccess_adapted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArrayLengthAccess_adapted_arrayItem> getArray() {
		if (array == null) {
			array = new EObjectResolvingEList<ArrayLengthAccess_adapted_arrayItem>(ArrayLengthAccess_adapted_arrayItem.class, this, Java_adaptedPackage.ARRAY_LENGTH_ACCESS_ADAPTED__ARRAY);
		}
		return array;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.ARRAY_LENGTH_ACCESS_ADAPTED__ARRAY:
				return getArray();
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
			case Java_adaptedPackage.ARRAY_LENGTH_ACCESS_ADAPTED__ARRAY:
				getArray().clear();
				getArray().addAll((Collection<? extends ArrayLengthAccess_adapted_arrayItem>)newValue);
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
			case Java_adaptedPackage.ARRAY_LENGTH_ACCESS_ADAPTED__ARRAY:
				getArray().clear();
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
			case Java_adaptedPackage.ARRAY_LENGTH_ACCESS_ADAPTED__ARRAY:
				return array != null && !array.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArrayLengthAccess_adaptedImpl
