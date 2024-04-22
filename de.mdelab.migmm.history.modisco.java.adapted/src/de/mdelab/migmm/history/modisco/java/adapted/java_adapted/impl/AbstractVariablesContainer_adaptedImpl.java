/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractVariablesContainer_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractVariablesContainer_adapted_fragmentsItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractVariablesContainer_adapted_typeItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Variables Container adapted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.AbstractVariablesContainer_adaptedImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.AbstractVariablesContainer_adaptedImpl#getFragments <em>Fragments</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractVariablesContainer_adaptedImpl extends ASTNode_adaptedImpl implements AbstractVariablesContainer_adapted {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractVariablesContainer_adapted_typeItem> type;

	/**
	 * The cached value of the '{@link #getFragments() <em>Fragments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFragments()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractVariablesContainer_adapted_fragmentsItem> fragments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractVariablesContainer_adaptedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getAbstractVariablesContainer_adapted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractVariablesContainer_adapted_typeItem> getType() {
		if (type == null) {
			type = new EObjectResolvingEList<AbstractVariablesContainer_adapted_typeItem>(AbstractVariablesContainer_adapted_typeItem.class, this, Java_adaptedPackage.ABSTRACT_VARIABLES_CONTAINER_ADAPTED__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractVariablesContainer_adapted_fragmentsItem> getFragments() {
		if (fragments == null) {
			fragments = new EObjectResolvingEList<AbstractVariablesContainer_adapted_fragmentsItem>(AbstractVariablesContainer_adapted_fragmentsItem.class, this, Java_adaptedPackage.ABSTRACT_VARIABLES_CONTAINER_ADAPTED__FRAGMENTS);
		}
		return fragments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.ABSTRACT_VARIABLES_CONTAINER_ADAPTED__TYPE:
				return getType();
			case Java_adaptedPackage.ABSTRACT_VARIABLES_CONTAINER_ADAPTED__FRAGMENTS:
				return getFragments();
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
			case Java_adaptedPackage.ABSTRACT_VARIABLES_CONTAINER_ADAPTED__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends AbstractVariablesContainer_adapted_typeItem>)newValue);
				return;
			case Java_adaptedPackage.ABSTRACT_VARIABLES_CONTAINER_ADAPTED__FRAGMENTS:
				getFragments().clear();
				getFragments().addAll((Collection<? extends AbstractVariablesContainer_adapted_fragmentsItem>)newValue);
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
			case Java_adaptedPackage.ABSTRACT_VARIABLES_CONTAINER_ADAPTED__TYPE:
				getType().clear();
				return;
			case Java_adaptedPackage.ABSTRACT_VARIABLES_CONTAINER_ADAPTED__FRAGMENTS:
				getFragments().clear();
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
			case Java_adaptedPackage.ABSTRACT_VARIABLES_CONTAINER_ADAPTED__TYPE:
				return type != null && !type.isEmpty();
			case Java_adaptedPackage.ABSTRACT_VARIABLES_CONTAINER_ADAPTED__FRAGMENTS:
				return fragments != null && !fragments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AbstractVariablesContainer_adaptedImpl
