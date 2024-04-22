/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SwitchStatement_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SwitchStatement_adapted_expressionItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SwitchStatement_adapted_statementsItem;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switch Statement adapted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.SwitchStatement_adaptedImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.SwitchStatement_adaptedImpl#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwitchStatement_adaptedImpl extends Statement_adaptedImpl implements SwitchStatement_adapted {
	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected EList<SwitchStatement_adapted_expressionItem> expression;

	/**
	 * The cached value of the '{@link #getStatements() <em>Statements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<SwitchStatement_adapted_statementsItem> statements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwitchStatement_adaptedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getSwitchStatement_adapted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SwitchStatement_adapted_expressionItem> getExpression() {
		if (expression == null) {
			expression = new EObjectResolvingEList<SwitchStatement_adapted_expressionItem>(SwitchStatement_adapted_expressionItem.class, this, Java_adaptedPackage.SWITCH_STATEMENT_ADAPTED__EXPRESSION);
		}
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SwitchStatement_adapted_statementsItem> getStatements() {
		if (statements == null) {
			statements = new EObjectResolvingEList<SwitchStatement_adapted_statementsItem>(SwitchStatement_adapted_statementsItem.class, this, Java_adaptedPackage.SWITCH_STATEMENT_ADAPTED__STATEMENTS);
		}
		return statements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.SWITCH_STATEMENT_ADAPTED__EXPRESSION:
				return getExpression();
			case Java_adaptedPackage.SWITCH_STATEMENT_ADAPTED__STATEMENTS:
				return getStatements();
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
			case Java_adaptedPackage.SWITCH_STATEMENT_ADAPTED__EXPRESSION:
				getExpression().clear();
				getExpression().addAll((Collection<? extends SwitchStatement_adapted_expressionItem>)newValue);
				return;
			case Java_adaptedPackage.SWITCH_STATEMENT_ADAPTED__STATEMENTS:
				getStatements().clear();
				getStatements().addAll((Collection<? extends SwitchStatement_adapted_statementsItem>)newValue);
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
			case Java_adaptedPackage.SWITCH_STATEMENT_ADAPTED__EXPRESSION:
				getExpression().clear();
				return;
			case Java_adaptedPackage.SWITCH_STATEMENT_ADAPTED__STATEMENTS:
				getStatements().clear();
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
			case Java_adaptedPackage.SWITCH_STATEMENT_ADAPTED__EXPRESSION:
				return expression != null && !expression.isEmpty();
			case Java_adaptedPackage.SWITCH_STATEMENT_ADAPTED__STATEMENTS:
				return statements != null && !statements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SwitchStatement_adaptedImpl
