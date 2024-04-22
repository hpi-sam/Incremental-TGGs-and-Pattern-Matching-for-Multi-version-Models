/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.VariableDeclarationFragment_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.VariableDeclarationFragment_adapted_variablesContainerItem;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Declaration Fragment adapted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.VariableDeclarationFragment_adaptedImpl#getVariablesContainer <em>Variables Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableDeclarationFragment_adaptedImpl extends VariableDeclaration_adaptedImpl implements VariableDeclarationFragment_adapted {
	/**
	 * The cached value of the '{@link #getVariablesContainer() <em>Variables Container</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariablesContainer()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableDeclarationFragment_adapted_variablesContainerItem> variablesContainer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableDeclarationFragment_adaptedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getVariableDeclarationFragment_adapted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VariableDeclarationFragment_adapted_variablesContainerItem> getVariablesContainer() {
		if (variablesContainer == null) {
			variablesContainer = new EObjectResolvingEList<VariableDeclarationFragment_adapted_variablesContainerItem>(VariableDeclarationFragment_adapted_variablesContainerItem.class, this, Java_adaptedPackage.VARIABLE_DECLARATION_FRAGMENT_ADAPTED__VARIABLES_CONTAINER);
		}
		return variablesContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.VARIABLE_DECLARATION_FRAGMENT_ADAPTED__VARIABLES_CONTAINER:
				return getVariablesContainer();
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
			case Java_adaptedPackage.VARIABLE_DECLARATION_FRAGMENT_ADAPTED__VARIABLES_CONTAINER:
				getVariablesContainer().clear();
				getVariablesContainer().addAll((Collection<? extends VariableDeclarationFragment_adapted_variablesContainerItem>)newValue);
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
			case Java_adaptedPackage.VARIABLE_DECLARATION_FRAGMENT_ADAPTED__VARIABLES_CONTAINER:
				getVariablesContainer().clear();
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
			case Java_adaptedPackage.VARIABLE_DECLARATION_FRAGMENT_ADAPTED__VARIABLES_CONTAINER:
				return variablesContainer != null && !variablesContainer.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VariableDeclarationFragment_adaptedImpl
