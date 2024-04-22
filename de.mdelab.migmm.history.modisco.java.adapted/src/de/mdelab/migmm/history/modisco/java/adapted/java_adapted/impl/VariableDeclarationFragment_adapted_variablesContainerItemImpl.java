/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.EdgeWithHistoryImpl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractVariablesContainer_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.VariableDeclarationFragment_adapted_variablesContainerItem;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Declaration Fragment adapted variables Container Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.VariableDeclarationFragment_adapted_variablesContainerItemImpl#getVariablesContainer <em>Variables Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableDeclarationFragment_adapted_variablesContainerItemImpl extends EdgeWithHistoryImpl implements VariableDeclarationFragment_adapted_variablesContainerItem {
	/**
	 * The cached value of the '{@link #getVariablesContainer() <em>Variables Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariablesContainer()
	 * @generated
	 * @ordered
	 */
	protected AbstractVariablesContainer_adapted variablesContainer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableDeclarationFragment_adapted_variablesContainerItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getVariableDeclarationFragment_adapted_variablesContainerItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractVariablesContainer_adapted getVariablesContainer() {
		if (variablesContainer != null && variablesContainer.eIsProxy()) {
			InternalEObject oldVariablesContainer = (InternalEObject)variablesContainer;
			variablesContainer = (AbstractVariablesContainer_adapted)eResolveProxy(oldVariablesContainer);
			if (variablesContainer != oldVariablesContainer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Java_adaptedPackage.VARIABLE_DECLARATION_FRAGMENT_ADAPTED_VARIABLES_CONTAINER_ITEM__VARIABLES_CONTAINER, oldVariablesContainer, variablesContainer));
			}
		}
		return variablesContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractVariablesContainer_adapted basicGetVariablesContainer() {
		return variablesContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVariablesContainer(AbstractVariablesContainer_adapted newVariablesContainer) {
		AbstractVariablesContainer_adapted oldVariablesContainer = variablesContainer;
		variablesContainer = newVariablesContainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_adaptedPackage.VARIABLE_DECLARATION_FRAGMENT_ADAPTED_VARIABLES_CONTAINER_ITEM__VARIABLES_CONTAINER, oldVariablesContainer, variablesContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.VARIABLE_DECLARATION_FRAGMENT_ADAPTED_VARIABLES_CONTAINER_ITEM__VARIABLES_CONTAINER:
				if (resolve) return getVariablesContainer();
				return basicGetVariablesContainer();
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
			case Java_adaptedPackage.VARIABLE_DECLARATION_FRAGMENT_ADAPTED_VARIABLES_CONTAINER_ITEM__VARIABLES_CONTAINER:
				setVariablesContainer((AbstractVariablesContainer_adapted)newValue);
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
			case Java_adaptedPackage.VARIABLE_DECLARATION_FRAGMENT_ADAPTED_VARIABLES_CONTAINER_ITEM__VARIABLES_CONTAINER:
				setVariablesContainer((AbstractVariablesContainer_adapted)null);
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
			case Java_adaptedPackage.VARIABLE_DECLARATION_FRAGMENT_ADAPTED_VARIABLES_CONTAINER_ITEM__VARIABLES_CONTAINER:
				return variablesContainer != null;
		}
		return super.eIsSet(featureID);
	}

} //VariableDeclarationFragment_adapted_variablesContainerItemImpl
