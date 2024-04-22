/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.UnresolvedItemAccess_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.UnresolvedItemAccess_adapted_elementItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.UnresolvedItemAccess_adapted_qualifierItem;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unresolved Item Access adapted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.UnresolvedItemAccess_adaptedImpl#getElement <em>Element</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.UnresolvedItemAccess_adaptedImpl#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnresolvedItemAccess_adaptedImpl extends Expression_adaptedImpl implements UnresolvedItemAccess_adapted {
	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected EList<UnresolvedItemAccess_adapted_elementItem> element;

	/**
	 * The cached value of the '{@link #getQualifier() <em>Qualifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifier()
	 * @generated
	 * @ordered
	 */
	protected EList<UnresolvedItemAccess_adapted_qualifierItem> qualifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnresolvedItemAccess_adaptedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getUnresolvedItemAccess_adapted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UnresolvedItemAccess_adapted_elementItem> getElement() {
		if (element == null) {
			element = new EObjectResolvingEList<UnresolvedItemAccess_adapted_elementItem>(UnresolvedItemAccess_adapted_elementItem.class, this, Java_adaptedPackage.UNRESOLVED_ITEM_ACCESS_ADAPTED__ELEMENT);
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UnresolvedItemAccess_adapted_qualifierItem> getQualifier() {
		if (qualifier == null) {
			qualifier = new EObjectResolvingEList<UnresolvedItemAccess_adapted_qualifierItem>(UnresolvedItemAccess_adapted_qualifierItem.class, this, Java_adaptedPackage.UNRESOLVED_ITEM_ACCESS_ADAPTED__QUALIFIER);
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
			case Java_adaptedPackage.UNRESOLVED_ITEM_ACCESS_ADAPTED__ELEMENT:
				return getElement();
			case Java_adaptedPackage.UNRESOLVED_ITEM_ACCESS_ADAPTED__QUALIFIER:
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
			case Java_adaptedPackage.UNRESOLVED_ITEM_ACCESS_ADAPTED__ELEMENT:
				getElement().clear();
				getElement().addAll((Collection<? extends UnresolvedItemAccess_adapted_elementItem>)newValue);
				return;
			case Java_adaptedPackage.UNRESOLVED_ITEM_ACCESS_ADAPTED__QUALIFIER:
				getQualifier().clear();
				getQualifier().addAll((Collection<? extends UnresolvedItemAccess_adapted_qualifierItem>)newValue);
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
			case Java_adaptedPackage.UNRESOLVED_ITEM_ACCESS_ADAPTED__ELEMENT:
				getElement().clear();
				return;
			case Java_adaptedPackage.UNRESOLVED_ITEM_ACCESS_ADAPTED__QUALIFIER:
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
			case Java_adaptedPackage.UNRESOLVED_ITEM_ACCESS_ADAPTED__ELEMENT:
				return element != null && !element.isEmpty();
			case Java_adaptedPackage.UNRESOLVED_ITEM_ACCESS_ADAPTED__QUALIFIER:
				return qualifier != null && !qualifier.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UnresolvedItemAccess_adaptedImpl
