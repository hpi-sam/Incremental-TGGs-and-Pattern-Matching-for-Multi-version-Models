/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractVariablesContainer_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractVariablesContainer_adapted_fragmentsItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractVariablesContainer_adapted_typeItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.FieldDeclaration_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field Declaration adapted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.FieldDeclaration_adaptedImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.FieldDeclaration_adaptedImpl#getFragments <em>Fragments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FieldDeclaration_adaptedImpl extends BodyDeclaration_adaptedImpl implements FieldDeclaration_adapted {
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
	protected FieldDeclaration_adaptedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getFieldDeclaration_adapted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractVariablesContainer_adapted_typeItem> getType() {
		if (type == null) {
			type = new EObjectResolvingEList<AbstractVariablesContainer_adapted_typeItem>(AbstractVariablesContainer_adapted_typeItem.class, this, Java_adaptedPackage.FIELD_DECLARATION_ADAPTED__TYPE);
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
			fragments = new EObjectResolvingEList<AbstractVariablesContainer_adapted_fragmentsItem>(AbstractVariablesContainer_adapted_fragmentsItem.class, this, Java_adaptedPackage.FIELD_DECLARATION_ADAPTED__FRAGMENTS);
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
			case Java_adaptedPackage.FIELD_DECLARATION_ADAPTED__TYPE:
				return getType();
			case Java_adaptedPackage.FIELD_DECLARATION_ADAPTED__FRAGMENTS:
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
			case Java_adaptedPackage.FIELD_DECLARATION_ADAPTED__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends AbstractVariablesContainer_adapted_typeItem>)newValue);
				return;
			case Java_adaptedPackage.FIELD_DECLARATION_ADAPTED__FRAGMENTS:
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
			case Java_adaptedPackage.FIELD_DECLARATION_ADAPTED__TYPE:
				getType().clear();
				return;
			case Java_adaptedPackage.FIELD_DECLARATION_ADAPTED__FRAGMENTS:
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
			case Java_adaptedPackage.FIELD_DECLARATION_ADAPTED__TYPE:
				return type != null && !type.isEmpty();
			case Java_adaptedPackage.FIELD_DECLARATION_ADAPTED__FRAGMENTS:
				return fragments != null && !fragments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractVariablesContainer_adapted.class) {
			switch (derivedFeatureID) {
				case Java_adaptedPackage.FIELD_DECLARATION_ADAPTED__TYPE: return Java_adaptedPackage.ABSTRACT_VARIABLES_CONTAINER_ADAPTED__TYPE;
				case Java_adaptedPackage.FIELD_DECLARATION_ADAPTED__FRAGMENTS: return Java_adaptedPackage.ABSTRACT_VARIABLES_CONTAINER_ADAPTED__FRAGMENTS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractVariablesContainer_adapted.class) {
			switch (baseFeatureID) {
				case Java_adaptedPackage.ABSTRACT_VARIABLES_CONTAINER_ADAPTED__TYPE: return Java_adaptedPackage.FIELD_DECLARATION_ADAPTED__TYPE;
				case Java_adaptedPackage.ABSTRACT_VARIABLES_CONTAINER_ADAPTED__FRAGMENTS: return Java_adaptedPackage.FIELD_DECLARATION_ADAPTED__FRAGMENTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //FieldDeclaration_adaptedImpl
