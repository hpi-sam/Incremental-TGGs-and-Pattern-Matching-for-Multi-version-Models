/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SingleVariableDeclaration_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SingleVariableDeclaration_adapted_annotationsItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SingleVariableDeclaration_adapted_catchClauseItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SingleVariableDeclaration_adapted_enhancedForStatementItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SingleVariableDeclaration_adapted_methodDeclarationItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SingleVariableDeclaration_adapted_modifierItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SingleVariableDeclaration_adapted_typeItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SingleVariableDeclaration_adapted_varargsValue;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Variable Declaration adapted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.SingleVariableDeclaration_adaptedImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.SingleVariableDeclaration_adaptedImpl#getVarargs <em>Varargs</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.SingleVariableDeclaration_adaptedImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.SingleVariableDeclaration_adaptedImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.SingleVariableDeclaration_adaptedImpl#getMethodDeclaration <em>Method Declaration</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.SingleVariableDeclaration_adaptedImpl#getCatchClause <em>Catch Clause</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.SingleVariableDeclaration_adaptedImpl#getEnhancedForStatement <em>Enhanced For Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SingleVariableDeclaration_adaptedImpl extends VariableDeclaration_adaptedImpl implements SingleVariableDeclaration_adapted {
	/**
	 * The cached value of the '{@link #getModifier() <em>Modifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifier()
	 * @generated
	 * @ordered
	 */
	protected EList<SingleVariableDeclaration_adapted_modifierItem> modifier;

	/**
	 * The cached value of the '{@link #getVarargs() <em>Varargs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarargs()
	 * @generated
	 * @ordered
	 */
	protected EList<SingleVariableDeclaration_adapted_varargsValue> varargs;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EList<SingleVariableDeclaration_adapted_typeItem> type;

	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<SingleVariableDeclaration_adapted_annotationsItem> annotations;

	/**
	 * The cached value of the '{@link #getMethodDeclaration() <em>Method Declaration</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodDeclaration()
	 * @generated
	 * @ordered
	 */
	protected EList<SingleVariableDeclaration_adapted_methodDeclarationItem> methodDeclaration;

	/**
	 * The cached value of the '{@link #getCatchClause() <em>Catch Clause</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatchClause()
	 * @generated
	 * @ordered
	 */
	protected EList<SingleVariableDeclaration_adapted_catchClauseItem> catchClause;

	/**
	 * The cached value of the '{@link #getEnhancedForStatement() <em>Enhanced For Statement</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnhancedForStatement()
	 * @generated
	 * @ordered
	 */
	protected EList<SingleVariableDeclaration_adapted_enhancedForStatementItem> enhancedForStatement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleVariableDeclaration_adaptedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getSingleVariableDeclaration_adapted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SingleVariableDeclaration_adapted_modifierItem> getModifier() {
		if (modifier == null) {
			modifier = new EObjectResolvingEList<SingleVariableDeclaration_adapted_modifierItem>(SingleVariableDeclaration_adapted_modifierItem.class, this, Java_adaptedPackage.SINGLE_VARIABLE_DECLARATION_ADAPTED__MODIFIER);
		}
		return modifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SingleVariableDeclaration_adapted_varargsValue> getVarargs() {
		if (varargs == null) {
			varargs = new EObjectResolvingEList<SingleVariableDeclaration_adapted_varargsValue>(SingleVariableDeclaration_adapted_varargsValue.class, this, Java_adaptedPackage.SINGLE_VARIABLE_DECLARATION_ADAPTED__VARARGS);
		}
		return varargs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SingleVariableDeclaration_adapted_typeItem> getType() {
		if (type == null) {
			type = new EObjectResolvingEList<SingleVariableDeclaration_adapted_typeItem>(SingleVariableDeclaration_adapted_typeItem.class, this, Java_adaptedPackage.SINGLE_VARIABLE_DECLARATION_ADAPTED__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SingleVariableDeclaration_adapted_annotationsItem> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectResolvingEList<SingleVariableDeclaration_adapted_annotationsItem>(SingleVariableDeclaration_adapted_annotationsItem.class, this, Java_adaptedPackage.SINGLE_VARIABLE_DECLARATION_ADAPTED__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SingleVariableDeclaration_adapted_methodDeclarationItem> getMethodDeclaration() {
		if (methodDeclaration == null) {
			methodDeclaration = new EObjectResolvingEList<SingleVariableDeclaration_adapted_methodDeclarationItem>(SingleVariableDeclaration_adapted_methodDeclarationItem.class, this, Java_adaptedPackage.SINGLE_VARIABLE_DECLARATION_ADAPTED__METHOD_DECLARATION);
		}
		return methodDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SingleVariableDeclaration_adapted_catchClauseItem> getCatchClause() {
		if (catchClause == null) {
			catchClause = new EObjectResolvingEList<SingleVariableDeclaration_adapted_catchClauseItem>(SingleVariableDeclaration_adapted_catchClauseItem.class, this, Java_adaptedPackage.SINGLE_VARIABLE_DECLARATION_ADAPTED__CATCH_CLAUSE);
		}
		return catchClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SingleVariableDeclaration_adapted_enhancedForStatementItem> getEnhancedForStatement() {
		if (enhancedForStatement == null) {
			enhancedForStatement = new EObjectResolvingEList<SingleVariableDeclaration_adapted_enhancedForStatementItem>(SingleVariableDeclaration_adapted_enhancedForStatementItem.class, this, Java_adaptedPackage.SINGLE_VARIABLE_DECLARATION_ADAPTED__ENHANCED_FOR_STATEMENT);
		}
		return enhancedForStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.SINGLE_VARIABLE_DECLARATION_ADAPTED__MODIFIER:
				return getModifier();
			case Java_adaptedPackage.SINGLE_VARIABLE_DECLARATION_ADAPTED__VARARGS:
				return getVarargs();
			case Java_adaptedPackage.SINGLE_VARIABLE_DECLARATION_ADAPTED__TYPE:
				return getType();
			case Java_adaptedPackage.SINGLE_VARIABLE_DECLARATION_ADAPTED__ANNOTATIONS:
				return getAnnotations();
			case Java_adaptedPackage.SINGLE_VARIABLE_DECLARATION_ADAPTED__METHOD_DECLARATION:
				return getMethodDeclaration();
			case Java_adaptedPackage.SINGLE_VARIABLE_DECLARATION_ADAPTED__CATCH_CLAUSE:
				return getCatchClause();
			case Java_adaptedPackage.SINGLE_VARIABLE_DECLARATION_ADAPTED__ENHANCED_FOR_STATEMENT:
				return getEnhancedForStatement();
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
			case Java_adaptedPackage.SINGLE_VARIABLE_DECLARATION_ADAPTED__MODIFIER:
				getModifier().clear();
				getModifier().addAll((Collection<? extends SingleVariableDeclaration_adapted_modifierItem>)newValue);
				return;
			case Java_adaptedPackage.SINGLE_VARIABLE_DECLARATION_ADAPTED__VARARGS:
				getVarargs().clear();
				getVarargs().addAll((Collection<? extends SingleVariableDeclaration_adapted_varargsValue>)newValue);
				return;
			case Java_adaptedPackage.SINGLE_VARIABLE_DECLARATION_ADAPTED__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends SingleVariableDeclaration_adapted_typeItem>)newValue);
				return;
			case Java_adaptedPackage.SINGLE_VARIABLE_DECLARATION_ADAPTED__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends SingleVariableDeclaration_adapted_annotationsItem>)newValue);
				return;
			case Java_adaptedPackage.SINGLE_VARIABLE_DECLARATION_ADAPTED__METHOD_DECLARATION:
				getMethodDeclaration().clear();
				getMethodDeclaration().addAll((Collection<? extends SingleVariableDeclaration_adapted_methodDeclarationItem>)newValue);
				return;
			case Java_adaptedPackage.SINGLE_VARIABLE_DECLARATION_ADAPTED__CATCH_CLAUSE:
				getCatchClause().clear();
				getCatchClause().addAll((Collection<? extends SingleVariableDeclaration_adapted_catchClauseItem>)newValue);
				return;
			case Java_adaptedPackage.SINGLE_VARIABLE_DECLARATION_ADAPTED__ENHANCED_FOR_STATEMENT:
				getEnhancedForStatement().clear();
				getEnhancedForStatement().addAll((Collection<? extends SingleVariableDeclaration_adapted_enhancedForStatementItem>)newValue);
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
			case Java_adaptedPackage.SINGLE_VARIABLE_DECLARATION_ADAPTED__MODIFIER:
				getModifier().clear();
				return;
			case Java_adaptedPackage.SINGLE_VARIABLE_DECLARATION_ADAPTED__VARARGS:
				getVarargs().clear();
				return;
			case Java_adaptedPackage.SINGLE_VARIABLE_DECLARATION_ADAPTED__TYPE:
				getType().clear();
				return;
			case Java_adaptedPackage.SINGLE_VARIABLE_DECLARATION_ADAPTED__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case Java_adaptedPackage.SINGLE_VARIABLE_DECLARATION_ADAPTED__METHOD_DECLARATION:
				getMethodDeclaration().clear();
				return;
			case Java_adaptedPackage.SINGLE_VARIABLE_DECLARATION_ADAPTED__CATCH_CLAUSE:
				getCatchClause().clear();
				return;
			case Java_adaptedPackage.SINGLE_VARIABLE_DECLARATION_ADAPTED__ENHANCED_FOR_STATEMENT:
				getEnhancedForStatement().clear();
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
			case Java_adaptedPackage.SINGLE_VARIABLE_DECLARATION_ADAPTED__MODIFIER:
				return modifier != null && !modifier.isEmpty();
			case Java_adaptedPackage.SINGLE_VARIABLE_DECLARATION_ADAPTED__VARARGS:
				return varargs != null && !varargs.isEmpty();
			case Java_adaptedPackage.SINGLE_VARIABLE_DECLARATION_ADAPTED__TYPE:
				return type != null && !type.isEmpty();
			case Java_adaptedPackage.SINGLE_VARIABLE_DECLARATION_ADAPTED__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case Java_adaptedPackage.SINGLE_VARIABLE_DECLARATION_ADAPTED__METHOD_DECLARATION:
				return methodDeclaration != null && !methodDeclaration.isEmpty();
			case Java_adaptedPackage.SINGLE_VARIABLE_DECLARATION_ADAPTED__CATCH_CLAUSE:
				return catchClause != null && !catchClause.isEmpty();
			case Java_adaptedPackage.SINGLE_VARIABLE_DECLARATION_ADAPTED__ENHANCED_FOR_STATEMENT:
				return enhancedForStatement != null && !enhancedForStatement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SingleVariableDeclaration_adaptedImpl
