/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Package_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Package_adapted_modelItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Package_adapted_ownedElementsItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Package_adapted_ownedPackagesItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Package_adapted_packageItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Package_adapted_usagesInPackageAccessItem;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package adapted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.Package_adaptedImpl#getOwnedElements <em>Owned Elements</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.Package_adaptedImpl#getModel <em>Model</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.Package_adaptedImpl#getOwnedPackages <em>Owned Packages</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.Package_adaptedImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.Package_adaptedImpl#getUsagesInPackageAccess <em>Usages In Package Access</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Package_adaptedImpl extends NamedElement_adaptedImpl implements Package_adapted {
	/**
	 * The cached value of the '{@link #getOwnedElements() <em>Owned Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<Package_adapted_ownedElementsItem> ownedElements;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected EList<Package_adapted_modelItem> model;

	/**
	 * The cached value of the '{@link #getOwnedPackages() <em>Owned Packages</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<Package_adapted_ownedPackagesItem> ownedPackages;

	/**
	 * The cached value of the '{@link #getPackage() <em>Package</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<Package_adapted_packageItem> package_;

	/**
	 * The cached value of the '{@link #getUsagesInPackageAccess() <em>Usages In Package Access</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsagesInPackageAccess()
	 * @generated
	 * @ordered
	 */
	protected EList<Package_adapted_usagesInPackageAccessItem> usagesInPackageAccess;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Package_adaptedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getPackage_adapted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Package_adapted_ownedElementsItem> getOwnedElements() {
		if (ownedElements == null) {
			ownedElements = new EObjectResolvingEList<Package_adapted_ownedElementsItem>(Package_adapted_ownedElementsItem.class, this, Java_adaptedPackage.PACKAGE_ADAPTED__OWNED_ELEMENTS);
		}
		return ownedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Package_adapted_modelItem> getModel() {
		if (model == null) {
			model = new EObjectResolvingEList<Package_adapted_modelItem>(Package_adapted_modelItem.class, this, Java_adaptedPackage.PACKAGE_ADAPTED__MODEL);
		}
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Package_adapted_ownedPackagesItem> getOwnedPackages() {
		if (ownedPackages == null) {
			ownedPackages = new EObjectResolvingEList<Package_adapted_ownedPackagesItem>(Package_adapted_ownedPackagesItem.class, this, Java_adaptedPackage.PACKAGE_ADAPTED__OWNED_PACKAGES);
		}
		return ownedPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Package_adapted_packageItem> getPackage() {
		if (package_ == null) {
			package_ = new EObjectResolvingEList<Package_adapted_packageItem>(Package_adapted_packageItem.class, this, Java_adaptedPackage.PACKAGE_ADAPTED__PACKAGE);
		}
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Package_adapted_usagesInPackageAccessItem> getUsagesInPackageAccess() {
		if (usagesInPackageAccess == null) {
			usagesInPackageAccess = new EObjectResolvingEList<Package_adapted_usagesInPackageAccessItem>(Package_adapted_usagesInPackageAccessItem.class, this, Java_adaptedPackage.PACKAGE_ADAPTED__USAGES_IN_PACKAGE_ACCESS);
		}
		return usagesInPackageAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.PACKAGE_ADAPTED__OWNED_ELEMENTS:
				return getOwnedElements();
			case Java_adaptedPackage.PACKAGE_ADAPTED__MODEL:
				return getModel();
			case Java_adaptedPackage.PACKAGE_ADAPTED__OWNED_PACKAGES:
				return getOwnedPackages();
			case Java_adaptedPackage.PACKAGE_ADAPTED__PACKAGE:
				return getPackage();
			case Java_adaptedPackage.PACKAGE_ADAPTED__USAGES_IN_PACKAGE_ACCESS:
				return getUsagesInPackageAccess();
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
			case Java_adaptedPackage.PACKAGE_ADAPTED__OWNED_ELEMENTS:
				getOwnedElements().clear();
				getOwnedElements().addAll((Collection<? extends Package_adapted_ownedElementsItem>)newValue);
				return;
			case Java_adaptedPackage.PACKAGE_ADAPTED__MODEL:
				getModel().clear();
				getModel().addAll((Collection<? extends Package_adapted_modelItem>)newValue);
				return;
			case Java_adaptedPackage.PACKAGE_ADAPTED__OWNED_PACKAGES:
				getOwnedPackages().clear();
				getOwnedPackages().addAll((Collection<? extends Package_adapted_ownedPackagesItem>)newValue);
				return;
			case Java_adaptedPackage.PACKAGE_ADAPTED__PACKAGE:
				getPackage().clear();
				getPackage().addAll((Collection<? extends Package_adapted_packageItem>)newValue);
				return;
			case Java_adaptedPackage.PACKAGE_ADAPTED__USAGES_IN_PACKAGE_ACCESS:
				getUsagesInPackageAccess().clear();
				getUsagesInPackageAccess().addAll((Collection<? extends Package_adapted_usagesInPackageAccessItem>)newValue);
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
			case Java_adaptedPackage.PACKAGE_ADAPTED__OWNED_ELEMENTS:
				getOwnedElements().clear();
				return;
			case Java_adaptedPackage.PACKAGE_ADAPTED__MODEL:
				getModel().clear();
				return;
			case Java_adaptedPackage.PACKAGE_ADAPTED__OWNED_PACKAGES:
				getOwnedPackages().clear();
				return;
			case Java_adaptedPackage.PACKAGE_ADAPTED__PACKAGE:
				getPackage().clear();
				return;
			case Java_adaptedPackage.PACKAGE_ADAPTED__USAGES_IN_PACKAGE_ACCESS:
				getUsagesInPackageAccess().clear();
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
			case Java_adaptedPackage.PACKAGE_ADAPTED__OWNED_ELEMENTS:
				return ownedElements != null && !ownedElements.isEmpty();
			case Java_adaptedPackage.PACKAGE_ADAPTED__MODEL:
				return model != null && !model.isEmpty();
			case Java_adaptedPackage.PACKAGE_ADAPTED__OWNED_PACKAGES:
				return ownedPackages != null && !ownedPackages.isEmpty();
			case Java_adaptedPackage.PACKAGE_ADAPTED__PACKAGE:
				return package_ != null && !package_.isEmpty();
			case Java_adaptedPackage.PACKAGE_ADAPTED__USAGES_IN_PACKAGE_ACCESS:
				return usagesInPackageAccess != null && !usagesInPackageAccess.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Package_adaptedImpl
