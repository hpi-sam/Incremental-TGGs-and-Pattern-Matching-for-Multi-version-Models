/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.ContainmentEdgeWithHistoryImpl;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractVariablesContainer_adapted_fragmentsItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.VariableDeclarationFragment_adapted;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Variables Container adapted fragments Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.AbstractVariablesContainer_adapted_fragmentsItemImpl#getFragments <em>Fragments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractVariablesContainer_adapted_fragmentsItemImpl extends ContainmentEdgeWithHistoryImpl implements AbstractVariablesContainer_adapted_fragmentsItem {
	/**
	 * The cached value of the '{@link #getFragments() <em>Fragments</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFragments()
	 * @generated
	 * @ordered
	 */
	protected VariableDeclarationFragment_adapted fragments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractVariablesContainer_adapted_fragmentsItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getAbstractVariablesContainer_adapted_fragmentsItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableDeclarationFragment_adapted getFragments() {
		if (fragments != null && fragments.eIsProxy()) {
			InternalEObject oldFragments = (InternalEObject)fragments;
			fragments = (VariableDeclarationFragment_adapted)eResolveProxy(oldFragments);
			if (fragments != oldFragments) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Java_adaptedPackage.ABSTRACT_VARIABLES_CONTAINER_ADAPTED_FRAGMENTS_ITEM__FRAGMENTS, oldFragments, fragments));
			}
		}
		return fragments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclarationFragment_adapted basicGetFragments() {
		return fragments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFragments(VariableDeclarationFragment_adapted newFragments) {
		VariableDeclarationFragment_adapted oldFragments = fragments;
		fragments = newFragments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_adaptedPackage.ABSTRACT_VARIABLES_CONTAINER_ADAPTED_FRAGMENTS_ITEM__FRAGMENTS, oldFragments, fragments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.ABSTRACT_VARIABLES_CONTAINER_ADAPTED_FRAGMENTS_ITEM__FRAGMENTS:
				if (resolve) return getFragments();
				return basicGetFragments();
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
			case Java_adaptedPackage.ABSTRACT_VARIABLES_CONTAINER_ADAPTED_FRAGMENTS_ITEM__FRAGMENTS:
				setFragments((VariableDeclarationFragment_adapted)newValue);
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
			case Java_adaptedPackage.ABSTRACT_VARIABLES_CONTAINER_ADAPTED_FRAGMENTS_ITEM__FRAGMENTS:
				setFragments((VariableDeclarationFragment_adapted)null);
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
			case Java_adaptedPackage.ABSTRACT_VARIABLES_CONTAINER_ADAPTED_FRAGMENTS_ITEM__FRAGMENTS:
				return fragments != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractVariablesContainer_adapted_fragmentsItemImpl
