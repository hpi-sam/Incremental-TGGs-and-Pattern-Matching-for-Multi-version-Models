/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractVariablesContainer_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractVariablesContainer_adapted_fragmentsItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractVariablesContainer_adapted_typeItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.VariableDeclarationExpression_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.VariableDeclarationExpression_adapted_annotationsItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.VariableDeclarationExpression_adapted_modifierItem;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Declaration Expression adapted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.VariableDeclarationExpression_adaptedImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.VariableDeclarationExpression_adaptedImpl#getFragments <em>Fragments</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.VariableDeclarationExpression_adaptedImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.VariableDeclarationExpression_adaptedImpl#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableDeclarationExpression_adaptedImpl extends Expression_adaptedImpl implements VariableDeclarationExpression_adapted {
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
	 * The cached value of the '{@link #getModifier() <em>Modifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifier()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableDeclarationExpression_adapted_modifierItem> modifier;

	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableDeclarationExpression_adapted_annotationsItem> annotations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableDeclarationExpression_adaptedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getVariableDeclarationExpression_adapted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractVariablesContainer_adapted_typeItem> getType() {
		if (type == null) {
			type = new EObjectResolvingEList<AbstractVariablesContainer_adapted_typeItem>(AbstractVariablesContainer_adapted_typeItem.class, this, Java_adaptedPackage.VARIABLE_DECLARATION_EXPRESSION_ADAPTED__TYPE);
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
			fragments = new EObjectResolvingEList<AbstractVariablesContainer_adapted_fragmentsItem>(AbstractVariablesContainer_adapted_fragmentsItem.class, this, Java_adaptedPackage.VARIABLE_DECLARATION_EXPRESSION_ADAPTED__FRAGMENTS);
		}
		return fragments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VariableDeclarationExpression_adapted_modifierItem> getModifier() {
		if (modifier == null) {
			modifier = new EObjectResolvingEList<VariableDeclarationExpression_adapted_modifierItem>(VariableDeclarationExpression_adapted_modifierItem.class, this, Java_adaptedPackage.VARIABLE_DECLARATION_EXPRESSION_ADAPTED__MODIFIER);
		}
		return modifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VariableDeclarationExpression_adapted_annotationsItem> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectResolvingEList<VariableDeclarationExpression_adapted_annotationsItem>(VariableDeclarationExpression_adapted_annotationsItem.class, this, Java_adaptedPackage.VARIABLE_DECLARATION_EXPRESSION_ADAPTED__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.VARIABLE_DECLARATION_EXPRESSION_ADAPTED__TYPE:
				return getType();
			case Java_adaptedPackage.VARIABLE_DECLARATION_EXPRESSION_ADAPTED__FRAGMENTS:
				return getFragments();
			case Java_adaptedPackage.VARIABLE_DECLARATION_EXPRESSION_ADAPTED__MODIFIER:
				return getModifier();
			case Java_adaptedPackage.VARIABLE_DECLARATION_EXPRESSION_ADAPTED__ANNOTATIONS:
				return getAnnotations();
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
			case Java_adaptedPackage.VARIABLE_DECLARATION_EXPRESSION_ADAPTED__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends AbstractVariablesContainer_adapted_typeItem>)newValue);
				return;
			case Java_adaptedPackage.VARIABLE_DECLARATION_EXPRESSION_ADAPTED__FRAGMENTS:
				getFragments().clear();
				getFragments().addAll((Collection<? extends AbstractVariablesContainer_adapted_fragmentsItem>)newValue);
				return;
			case Java_adaptedPackage.VARIABLE_DECLARATION_EXPRESSION_ADAPTED__MODIFIER:
				getModifier().clear();
				getModifier().addAll((Collection<? extends VariableDeclarationExpression_adapted_modifierItem>)newValue);
				return;
			case Java_adaptedPackage.VARIABLE_DECLARATION_EXPRESSION_ADAPTED__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends VariableDeclarationExpression_adapted_annotationsItem>)newValue);
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
			case Java_adaptedPackage.VARIABLE_DECLARATION_EXPRESSION_ADAPTED__TYPE:
				getType().clear();
				return;
			case Java_adaptedPackage.VARIABLE_DECLARATION_EXPRESSION_ADAPTED__FRAGMENTS:
				getFragments().clear();
				return;
			case Java_adaptedPackage.VARIABLE_DECLARATION_EXPRESSION_ADAPTED__MODIFIER:
				getModifier().clear();
				return;
			case Java_adaptedPackage.VARIABLE_DECLARATION_EXPRESSION_ADAPTED__ANNOTATIONS:
				getAnnotations().clear();
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
			case Java_adaptedPackage.VARIABLE_DECLARATION_EXPRESSION_ADAPTED__TYPE:
				return type != null && !type.isEmpty();
			case Java_adaptedPackage.VARIABLE_DECLARATION_EXPRESSION_ADAPTED__FRAGMENTS:
				return fragments != null && !fragments.isEmpty();
			case Java_adaptedPackage.VARIABLE_DECLARATION_EXPRESSION_ADAPTED__MODIFIER:
				return modifier != null && !modifier.isEmpty();
			case Java_adaptedPackage.VARIABLE_DECLARATION_EXPRESSION_ADAPTED__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
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
				case Java_adaptedPackage.VARIABLE_DECLARATION_EXPRESSION_ADAPTED__TYPE: return Java_adaptedPackage.ABSTRACT_VARIABLES_CONTAINER_ADAPTED__TYPE;
				case Java_adaptedPackage.VARIABLE_DECLARATION_EXPRESSION_ADAPTED__FRAGMENTS: return Java_adaptedPackage.ABSTRACT_VARIABLES_CONTAINER_ADAPTED__FRAGMENTS;
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
				case Java_adaptedPackage.ABSTRACT_VARIABLES_CONTAINER_ADAPTED__TYPE: return Java_adaptedPackage.VARIABLE_DECLARATION_EXPRESSION_ADAPTED__TYPE;
				case Java_adaptedPackage.ABSTRACT_VARIABLES_CONTAINER_ADAPTED__FRAGMENTS: return Java_adaptedPackage.VARIABLE_DECLARATION_EXPRESSION_ADAPTED__FRAGMENTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //VariableDeclarationExpression_adaptedImpl
