/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.NodeWithHistoryImpl;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ManifestEntry_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ManifestEntry_adapted_attributesItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ManifestEntry_adapted_nameValue;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manifest Entry adapted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.ManifestEntry_adaptedImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.ManifestEntry_adaptedImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ManifestEntry_adaptedImpl extends NodeWithHistoryImpl implements ManifestEntry_adapted {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected EList<ManifestEntry_adapted_nameValue> name;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<ManifestEntry_adapted_attributesItem> attributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManifestEntry_adaptedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getManifestEntry_adapted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ManifestEntry_adapted_nameValue> getName() {
		if (name == null) {
			name = new EObjectResolvingEList<ManifestEntry_adapted_nameValue>(ManifestEntry_adapted_nameValue.class, this, Java_adaptedPackage.MANIFEST_ENTRY_ADAPTED__NAME);
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ManifestEntry_adapted_attributesItem> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectResolvingEList<ManifestEntry_adapted_attributesItem>(ManifestEntry_adapted_attributesItem.class, this, Java_adaptedPackage.MANIFEST_ENTRY_ADAPTED__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.MANIFEST_ENTRY_ADAPTED__NAME:
				return getName();
			case Java_adaptedPackage.MANIFEST_ENTRY_ADAPTED__ATTRIBUTES:
				return getAttributes();
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
			case Java_adaptedPackage.MANIFEST_ENTRY_ADAPTED__NAME:
				getName().clear();
				getName().addAll((Collection<? extends ManifestEntry_adapted_nameValue>)newValue);
				return;
			case Java_adaptedPackage.MANIFEST_ENTRY_ADAPTED__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends ManifestEntry_adapted_attributesItem>)newValue);
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
			case Java_adaptedPackage.MANIFEST_ENTRY_ADAPTED__NAME:
				getName().clear();
				return;
			case Java_adaptedPackage.MANIFEST_ENTRY_ADAPTED__ATTRIBUTES:
				getAttributes().clear();
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
			case Java_adaptedPackage.MANIFEST_ENTRY_ADAPTED__NAME:
				return name != null && !name.isEmpty();
			case Java_adaptedPackage.MANIFEST_ENTRY_ADAPTED__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ManifestEntry_adaptedImpl
