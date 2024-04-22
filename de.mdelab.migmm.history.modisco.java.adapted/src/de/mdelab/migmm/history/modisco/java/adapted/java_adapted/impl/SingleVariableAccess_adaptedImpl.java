/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SingleVariableAccess_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SingleVariableAccess_adapted_qualifierItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SingleVariableAccess_adapted_variableItem;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Variable Access adapted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.SingleVariableAccess_adaptedImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.SingleVariableAccess_adaptedImpl#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SingleVariableAccess_adaptedImpl extends Expression_adaptedImpl implements SingleVariableAccess_adapted {
	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<SingleVariableAccess_adapted_variableItem> variable;

	/**
	 * The cached value of the '{@link #getQualifier() <em>Qualifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifier()
	 * @generated
	 * @ordered
	 */
	protected EList<SingleVariableAccess_adapted_qualifierItem> qualifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleVariableAccess_adaptedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getSingleVariableAccess_adapted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SingleVariableAccess_adapted_variableItem> getVariable() {
		if (variable == null) {
			variable = new EObjectResolvingEList<SingleVariableAccess_adapted_variableItem>(SingleVariableAccess_adapted_variableItem.class, this, Java_adaptedPackage.SINGLE_VARIABLE_ACCESS_ADAPTED__VARIABLE);
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SingleVariableAccess_adapted_qualifierItem> getQualifier() {
		if (qualifier == null) {
			qualifier = new EObjectResolvingEList<SingleVariableAccess_adapted_qualifierItem>(SingleVariableAccess_adapted_qualifierItem.class, this, Java_adaptedPackage.SINGLE_VARIABLE_ACCESS_ADAPTED__QUALIFIER);
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
			case Java_adaptedPackage.SINGLE_VARIABLE_ACCESS_ADAPTED__VARIABLE:
				return getVariable();
			case Java_adaptedPackage.SINGLE_VARIABLE_ACCESS_ADAPTED__QUALIFIER:
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
			case Java_adaptedPackage.SINGLE_VARIABLE_ACCESS_ADAPTED__VARIABLE:
				getVariable().clear();
				getVariable().addAll((Collection<? extends SingleVariableAccess_adapted_variableItem>)newValue);
				return;
			case Java_adaptedPackage.SINGLE_VARIABLE_ACCESS_ADAPTED__QUALIFIER:
				getQualifier().clear();
				getQualifier().addAll((Collection<? extends SingleVariableAccess_adapted_qualifierItem>)newValue);
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
			case Java_adaptedPackage.SINGLE_VARIABLE_ACCESS_ADAPTED__VARIABLE:
				getVariable().clear();
				return;
			case Java_adaptedPackage.SINGLE_VARIABLE_ACCESS_ADAPTED__QUALIFIER:
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
			case Java_adaptedPackage.SINGLE_VARIABLE_ACCESS_ADAPTED__VARIABLE:
				return variable != null && !variable.isEmpty();
			case Java_adaptedPackage.SINGLE_VARIABLE_ACCESS_ADAPTED__QUALIFIER:
				return qualifier != null && !qualifier.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SingleVariableAccess_adaptedImpl
