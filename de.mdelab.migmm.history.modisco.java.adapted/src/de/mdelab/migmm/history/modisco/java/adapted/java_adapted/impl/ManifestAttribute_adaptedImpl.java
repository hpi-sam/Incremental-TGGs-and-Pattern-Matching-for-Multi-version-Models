/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.NodeWithHistoryImpl;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ManifestAttribute_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ManifestAttribute_adapted_keyValue;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ManifestAttribute_adapted_valueValue;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manifest Attribute adapted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.ManifestAttribute_adaptedImpl#getKey <em>Key</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.ManifestAttribute_adaptedImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ManifestAttribute_adaptedImpl extends NodeWithHistoryImpl implements ManifestAttribute_adapted {
	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected EList<ManifestAttribute_adapted_keyValue> key;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected EList<ManifestAttribute_adapted_valueValue> value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManifestAttribute_adaptedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getManifestAttribute_adapted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ManifestAttribute_adapted_keyValue> getKey() {
		if (key == null) {
			key = new EObjectResolvingEList<ManifestAttribute_adapted_keyValue>(ManifestAttribute_adapted_keyValue.class, this, Java_adaptedPackage.MANIFEST_ATTRIBUTE_ADAPTED__KEY);
		}
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ManifestAttribute_adapted_valueValue> getValue() {
		if (value == null) {
			value = new EObjectResolvingEList<ManifestAttribute_adapted_valueValue>(ManifestAttribute_adapted_valueValue.class, this, Java_adaptedPackage.MANIFEST_ATTRIBUTE_ADAPTED__VALUE);
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.MANIFEST_ATTRIBUTE_ADAPTED__KEY:
				return getKey();
			case Java_adaptedPackage.MANIFEST_ATTRIBUTE_ADAPTED__VALUE:
				return getValue();
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
			case Java_adaptedPackage.MANIFEST_ATTRIBUTE_ADAPTED__KEY:
				getKey().clear();
				getKey().addAll((Collection<? extends ManifestAttribute_adapted_keyValue>)newValue);
				return;
			case Java_adaptedPackage.MANIFEST_ATTRIBUTE_ADAPTED__VALUE:
				getValue().clear();
				getValue().addAll((Collection<? extends ManifestAttribute_adapted_valueValue>)newValue);
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
			case Java_adaptedPackage.MANIFEST_ATTRIBUTE_ADAPTED__KEY:
				getKey().clear();
				return;
			case Java_adaptedPackage.MANIFEST_ATTRIBUTE_ADAPTED__VALUE:
				getValue().clear();
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
			case Java_adaptedPackage.MANIFEST_ATTRIBUTE_ADAPTED__KEY:
				return key != null && !key.isEmpty();
			case Java_adaptedPackage.MANIFEST_ATTRIBUTE_ADAPTED__VALUE:
				return value != null && !value.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ManifestAttribute_adaptedImpl
