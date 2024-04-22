/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.EdgeWithHistoryImpl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ImportDeclaration_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.NamedElement_adapted_usagesInImportsItem;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Element adapted usages In Imports Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.NamedElement_adapted_usagesInImportsItemImpl#getUsagesInImports <em>Usages In Imports</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NamedElement_adapted_usagesInImportsItemImpl extends EdgeWithHistoryImpl implements NamedElement_adapted_usagesInImportsItem {
	/**
	 * The cached value of the '{@link #getUsagesInImports() <em>Usages In Imports</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsagesInImports()
	 * @generated
	 * @ordered
	 */
	protected ImportDeclaration_adapted usagesInImports;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedElement_adapted_usagesInImportsItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getNamedElement_adapted_usagesInImportsItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImportDeclaration_adapted getUsagesInImports() {
		if (usagesInImports != null && usagesInImports.eIsProxy()) {
			InternalEObject oldUsagesInImports = (InternalEObject)usagesInImports;
			usagesInImports = (ImportDeclaration_adapted)eResolveProxy(oldUsagesInImports);
			if (usagesInImports != oldUsagesInImports) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Java_adaptedPackage.NAMED_ELEMENT_ADAPTED_USAGES_IN_IMPORTS_ITEM__USAGES_IN_IMPORTS, oldUsagesInImports, usagesInImports));
			}
		}
		return usagesInImports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportDeclaration_adapted basicGetUsagesInImports() {
		return usagesInImports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsagesInImports(ImportDeclaration_adapted newUsagesInImports) {
		ImportDeclaration_adapted oldUsagesInImports = usagesInImports;
		usagesInImports = newUsagesInImports;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_adaptedPackage.NAMED_ELEMENT_ADAPTED_USAGES_IN_IMPORTS_ITEM__USAGES_IN_IMPORTS, oldUsagesInImports, usagesInImports));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.NAMED_ELEMENT_ADAPTED_USAGES_IN_IMPORTS_ITEM__USAGES_IN_IMPORTS:
				if (resolve) return getUsagesInImports();
				return basicGetUsagesInImports();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_adaptedPackage.NAMED_ELEMENT_ADAPTED_USAGES_IN_IMPORTS_ITEM__USAGES_IN_IMPORTS:
				setUsagesInImports((ImportDeclaration_adapted)newValue);
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
			case Java_adaptedPackage.NAMED_ELEMENT_ADAPTED_USAGES_IN_IMPORTS_ITEM__USAGES_IN_IMPORTS:
				setUsagesInImports((ImportDeclaration_adapted)null);
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
			case Java_adaptedPackage.NAMED_ELEMENT_ADAPTED_USAGES_IN_IMPORTS_ITEM__USAGES_IN_IMPORTS:
				return usagesInImports != null;
		}
		return super.eIsSet(featureID);
	}

} //NamedElement_adapted_usagesInImportsItemImpl
