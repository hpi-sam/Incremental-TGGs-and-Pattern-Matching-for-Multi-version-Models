/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.PackageAccess_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.PackageAccess_adapted_packageItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.PackageAccess_adapted_qualifierItem;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Access adapted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.PackageAccess_adaptedImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.PackageAccess_adaptedImpl#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageAccess_adaptedImpl extends NamespaceAccess_adaptedImpl implements PackageAccess_adapted {
	/**
	 * The cached value of the '{@link #getPackage() <em>Package</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageAccess_adapted_packageItem> package_;

	/**
	 * The cached value of the '{@link #getQualifier() <em>Qualifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifier()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageAccess_adapted_qualifierItem> qualifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageAccess_adaptedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getPackageAccess_adapted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PackageAccess_adapted_packageItem> getPackage() {
		if (package_ == null) {
			package_ = new EObjectResolvingEList<PackageAccess_adapted_packageItem>(PackageAccess_adapted_packageItem.class, this, Java_adaptedPackage.PACKAGE_ACCESS_ADAPTED__PACKAGE);
		}
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PackageAccess_adapted_qualifierItem> getQualifier() {
		if (qualifier == null) {
			qualifier = new EObjectResolvingEList<PackageAccess_adapted_qualifierItem>(PackageAccess_adapted_qualifierItem.class, this, Java_adaptedPackage.PACKAGE_ACCESS_ADAPTED__QUALIFIER);
		}
		return qualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.PACKAGE_ACCESS_ADAPTED__PACKAGE:
				return getPackage();
			case Java_adaptedPackage.PACKAGE_ACCESS_ADAPTED__QUALIFIER:
				return getQualifier();
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
			case Java_adaptedPackage.PACKAGE_ACCESS_ADAPTED__PACKAGE:
				getPackage().clear();
				getPackage().addAll((Collection<? extends PackageAccess_adapted_packageItem>)newValue);
				return;
			case Java_adaptedPackage.PACKAGE_ACCESS_ADAPTED__QUALIFIER:
				getQualifier().clear();
				getQualifier().addAll((Collection<? extends PackageAccess_adapted_qualifierItem>)newValue);
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
			case Java_adaptedPackage.PACKAGE_ACCESS_ADAPTED__PACKAGE:
				getPackage().clear();
				return;
			case Java_adaptedPackage.PACKAGE_ACCESS_ADAPTED__QUALIFIER:
				getQualifier().clear();
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
			case Java_adaptedPackage.PACKAGE_ACCESS_ADAPTED__PACKAGE:
				return package_ != null && !package_.isEmpty();
			case Java_adaptedPackage.PACKAGE_ACCESS_ADAPTED__QUALIFIER:
				return qualifier != null && !qualifier.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PackageAccess_adaptedImpl
