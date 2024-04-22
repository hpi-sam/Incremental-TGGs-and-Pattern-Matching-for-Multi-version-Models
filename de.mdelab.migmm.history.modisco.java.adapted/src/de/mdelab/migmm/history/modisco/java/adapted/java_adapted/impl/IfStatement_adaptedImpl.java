/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.IfStatement_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.IfStatement_adapted_elseStatementItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.IfStatement_adapted_expressionItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.IfStatement_adapted_thenStatementItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Statement adapted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.IfStatement_adaptedImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.IfStatement_adaptedImpl#getThenStatement <em>Then Statement</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.IfStatement_adaptedImpl#getElseStatement <em>Else Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfStatement_adaptedImpl extends Statement_adaptedImpl implements IfStatement_adapted {
	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected EList<IfStatement_adapted_expressionItem> expression;

	/**
	 * The cached value of the '{@link #getThenStatement() <em>Then Statement</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThenStatement()
	 * @generated
	 * @ordered
	 */
	protected EList<IfStatement_adapted_thenStatementItem> thenStatement;

	/**
	 * The cached value of the '{@link #getElseStatement() <em>Else Statement</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseStatement()
	 * @generated
	 * @ordered
	 */
	protected EList<IfStatement_adapted_elseStatementItem> elseStatement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfStatement_adaptedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getIfStatement_adapted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IfStatement_adapted_expressionItem> getExpression() {
		if (expression == null) {
			expression = new EObjectResolvingEList<IfStatement_adapted_expressionItem>(IfStatement_adapted_expressionItem.class, this, Java_adaptedPackage.IF_STATEMENT_ADAPTED__EXPRESSION);
		}
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IfStatement_adapted_thenStatementItem> getThenStatement() {
		if (thenStatement == null) {
			thenStatement = new EObjectResolvingEList<IfStatement_adapted_thenStatementItem>(IfStatement_adapted_thenStatementItem.class, this, Java_adaptedPackage.IF_STATEMENT_ADAPTED__THEN_STATEMENT);
		}
		return thenStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IfStatement_adapted_elseStatementItem> getElseStatement() {
		if (elseStatement == null) {
			elseStatement = new EObjectResolvingEList<IfStatement_adapted_elseStatementItem>(IfStatement_adapted_elseStatementItem.class, this, Java_adaptedPackage.IF_STATEMENT_ADAPTED__ELSE_STATEMENT);
		}
		return elseStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.IF_STATEMENT_ADAPTED__EXPRESSION:
				return getExpression();
			case Java_adaptedPackage.IF_STATEMENT_ADAPTED__THEN_STATEMENT:
				return getThenStatement();
			case Java_adaptedPackage.IF_STATEMENT_ADAPTED__ELSE_STATEMENT:
				return getElseStatement();
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
			case Java_adaptedPackage.IF_STATEMENT_ADAPTED__EXPRESSION:
				getExpression().clear();
				getExpression().addAll((Collection<? extends IfStatement_adapted_expressionItem>)newValue);
				return;
			case Java_adaptedPackage.IF_STATEMENT_ADAPTED__THEN_STATEMENT:
				getThenStatement().clear();
				getThenStatement().addAll((Collection<? extends IfStatement_adapted_thenStatementItem>)newValue);
				return;
			case Java_adaptedPackage.IF_STATEMENT_ADAPTED__ELSE_STATEMENT:
				getElseStatement().clear();
				getElseStatement().addAll((Collection<? extends IfStatement_adapted_elseStatementItem>)newValue);
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
			case Java_adaptedPackage.IF_STATEMENT_ADAPTED__EXPRESSION:
				getExpression().clear();
				return;
			case Java_adaptedPackage.IF_STATEMENT_ADAPTED__THEN_STATEMENT:
				getThenStatement().clear();
				return;
			case Java_adaptedPackage.IF_STATEMENT_ADAPTED__ELSE_STATEMENT:
				getElseStatement().clear();
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
			case Java_adaptedPackage.IF_STATEMENT_ADAPTED__EXPRESSION:
				return expression != null && !expression.isEmpty();
			case Java_adaptedPackage.IF_STATEMENT_ADAPTED__THEN_STATEMENT:
				return thenStatement != null && !thenStatement.isEmpty();
			case Java_adaptedPackage.IF_STATEMENT_ADAPTED__ELSE_STATEMENT:
				return elseStatement != null && !elseStatement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IfStatement_adaptedImpl
