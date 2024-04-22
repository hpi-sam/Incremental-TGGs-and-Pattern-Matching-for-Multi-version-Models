/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.NodeWithHistoryImpl;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Manifest_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Manifest_adapted_entryAttributesItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Manifest_adapted_mainAttributesItem;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manifest adapted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.Manifest_adaptedImpl#getMainAttributes <em>Main Attributes</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.Manifest_adaptedImpl#getEntryAttributes <em>Entry Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Manifest_adaptedImpl extends NodeWithHistoryImpl implements Manifest_adapted {
	/**
	 * The cached value of the '{@link #getMainAttributes() <em>Main Attributes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Manifest_adapted_mainAttributesItem> mainAttributes;

	/**
	 * The cached value of the '{@link #getEntryAttributes() <em>Entry Attributes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Manifest_adapted_entryAttributesItem> entryAttributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Manifest_adaptedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getManifest_adapted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Manifest_adapted_mainAttributesItem> getMainAttributes() {
		if (mainAttributes == null) {
			mainAttributes = new EObjectResolvingEList<Manifest_adapted_mainAttributesItem>(Manifest_adapted_mainAttributesItem.class, this, Java_adaptedPackage.MANIFEST_ADAPTED__MAIN_ATTRIBUTES);
		}
		return mainAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Manifest_adapted_entryAttributesItem> getEntryAttributes() {
		if (entryAttributes == null) {
			entryAttributes = new EObjectResolvingEList<Manifest_adapted_entryAttributesItem>(Manifest_adapted_entryAttributesItem.class, this, Java_adaptedPackage.MANIFEST_ADAPTED__ENTRY_ATTRIBUTES);
		}
		return entryAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.MANIFEST_ADAPTED__MAIN_ATTRIBUTES:
				return getMainAttributes();
			case Java_adaptedPackage.MANIFEST_ADAPTED__ENTRY_ATTRIBUTES:
				return getEntryAttributes();
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
			case Java_adaptedPackage.MANIFEST_ADAPTED__MAIN_ATTRIBUTES:
				getMainAttributes().clear();
				getMainAttributes().addAll((Collection<? extends Manifest_adapted_mainAttributesItem>)newValue);
				return;
			case Java_adaptedPackage.MANIFEST_ADAPTED__ENTRY_ATTRIBUTES:
				getEntryAttributes().clear();
				getEntryAttributes().addAll((Collection<? extends Manifest_adapted_entryAttributesItem>)newValue);
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
			case Java_adaptedPackage.MANIFEST_ADAPTED__MAIN_ATTRIBUTES:
				getMainAttributes().clear();
				return;
			case Java_adaptedPackage.MANIFEST_ADAPTED__ENTRY_ATTRIBUTES:
				getEntryAttributes().clear();
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
			case Java_adaptedPackage.MANIFEST_ADAPTED__MAIN_ATTRIBUTES:
				return mainAttributes != null && !mainAttributes.isEmpty();
			case Java_adaptedPackage.MANIFEST_ADAPTED__ENTRY_ATTRIBUTES:
				return entryAttributes != null && !entryAttributes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Manifest_adaptedImpl
