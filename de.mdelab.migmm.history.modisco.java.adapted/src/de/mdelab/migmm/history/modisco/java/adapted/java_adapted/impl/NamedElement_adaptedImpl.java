/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.NamedElement_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.NamedElement_adapted_nameValue;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.NamedElement_adapted_proxyValue;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.NamedElement_adapted_usagesInImportsItem;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Element adapted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.NamedElement_adaptedImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.NamedElement_adaptedImpl#getProxy <em>Proxy</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.NamedElement_adaptedImpl#getUsagesInImports <em>Usages In Imports</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class NamedElement_adaptedImpl extends ASTNode_adaptedImpl implements NamedElement_adapted {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedElement_adapted_nameValue> name;

	/**
	 * The cached value of the '{@link #getProxy() <em>Proxy</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxy()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedElement_adapted_proxyValue> proxy;

	/**
	 * The cached value of the '{@link #getUsagesInImports() <em>Usages In Imports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsagesInImports()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedElement_adapted_usagesInImportsItem> usagesInImports;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedElement_adaptedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getNamedElement_adapted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NamedElement_adapted_nameValue> getName() {
		if (name == null) {
			name = new EObjectResolvingEList<NamedElement_adapted_nameValue>(NamedElement_adapted_nameValue.class, this, Java_adaptedPackage.NAMED_ELEMENT_ADAPTED__NAME);
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NamedElement_adapted_proxyValue> getProxy() {
		if (proxy == null) {
			proxy = new EObjectResolvingEList<NamedElement_adapted_proxyValue>(NamedElement_adapted_proxyValue.class, this, Java_adaptedPackage.NAMED_ELEMENT_ADAPTED__PROXY);
		}
		return proxy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NamedElement_adapted_usagesInImportsItem> getUsagesInImports() {
		if (usagesInImports == null) {
			usagesInImports = new EObjectResolvingEList<NamedElement_adapted_usagesInImportsItem>(NamedElement_adapted_usagesInImportsItem.class, this, Java_adaptedPackage.NAMED_ELEMENT_ADAPTED__USAGES_IN_IMPORTS);
		}
		return usagesInImports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.NAMED_ELEMENT_ADAPTED__NAME:
				return getName();
			case Java_adaptedPackage.NAMED_ELEMENT_ADAPTED__PROXY:
				return getProxy();
			case Java_adaptedPackage.NAMED_ELEMENT_ADAPTED__USAGES_IN_IMPORTS:
				return getUsagesInImports();
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
			case Java_adaptedPackage.NAMED_ELEMENT_ADAPTED__NAME:
				getName().clear();
				getName().addAll((Collection<? extends NamedElement_adapted_nameValue>)newValue);
				return;
			case Java_adaptedPackage.NAMED_ELEMENT_ADAPTED__PROXY:
				getProxy().clear();
				getProxy().addAll((Collection<? extends NamedElement_adapted_proxyValue>)newValue);
				return;
			case Java_adaptedPackage.NAMED_ELEMENT_ADAPTED__USAGES_IN_IMPORTS:
				getUsagesInImports().clear();
				getUsagesInImports().addAll((Collection<? extends NamedElement_adapted_usagesInImportsItem>)newValue);
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
			case Java_adaptedPackage.NAMED_ELEMENT_ADAPTED__NAME:
				getName().clear();
				return;
			case Java_adaptedPackage.NAMED_ELEMENT_ADAPTED__PROXY:
				getProxy().clear();
				return;
			case Java_adaptedPackage.NAMED_ELEMENT_ADAPTED__USAGES_IN_IMPORTS:
				getUsagesInImports().clear();
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
			case Java_adaptedPackage.NAMED_ELEMENT_ADAPTED__NAME:
				return name != null && !name.isEmpty();
			case Java_adaptedPackage.NAMED_ELEMENT_ADAPTED__PROXY:
				return proxy != null && !proxy.isEmpty();
			case Java_adaptedPackage.NAMED_ELEMENT_ADAPTED__USAGES_IN_IMPORTS:
				return usagesInImports != null && !usagesInImports.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NamedElement_adaptedImpl
