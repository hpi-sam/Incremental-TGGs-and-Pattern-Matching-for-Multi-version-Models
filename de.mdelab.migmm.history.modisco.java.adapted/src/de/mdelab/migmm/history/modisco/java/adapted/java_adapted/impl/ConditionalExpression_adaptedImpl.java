/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ConditionalExpression_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ConditionalExpression_adapted_elseExpressionItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ConditionalExpression_adapted_expressionItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ConditionalExpression_adapted_thenExpressionItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Expression adapted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.ConditionalExpression_adaptedImpl#getElseExpression <em>Else Expression</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.ConditionalExpression_adaptedImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.ConditionalExpression_adaptedImpl#getThenExpression <em>Then Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionalExpression_adaptedImpl extends Expression_adaptedImpl implements ConditionalExpression_adapted {
	/**
	 * The cached value of the '{@link #getElseExpression() <em>Else Expression</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseExpression()
	 * @generated
	 * @ordered
	 */
	protected EList<ConditionalExpression_adapted_elseExpressionItem> elseExpression;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected EList<ConditionalExpression_adapted_expressionItem> expression;

	/**
	 * The cached value of the '{@link #getThenExpression() <em>Then Expression</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThenExpression()
	 * @generated
	 * @ordered
	 */
	protected EList<ConditionalExpression_adapted_thenExpressionItem> thenExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalExpression_adaptedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getConditionalExpression_adapted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConditionalExpression_adapted_elseExpressionItem> getElseExpression() {
		if (elseExpression == null) {
			elseExpression = new EObjectResolvingEList<ConditionalExpression_adapted_elseExpressionItem>(ConditionalExpression_adapted_elseExpressionItem.class, this, Java_adaptedPackage.CONDITIONAL_EXPRESSION_ADAPTED__ELSE_EXPRESSION);
		}
		return elseExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConditionalExpression_adapted_expressionItem> getExpression() {
		if (expression == null) {
			expression = new EObjectResolvingEList<ConditionalExpression_adapted_expressionItem>(ConditionalExpression_adapted_expressionItem.class, this, Java_adaptedPackage.CONDITIONAL_EXPRESSION_ADAPTED__EXPRESSION);
		}
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConditionalExpression_adapted_thenExpressionItem> getThenExpression() {
		if (thenExpression == null) {
			thenExpression = new EObjectResolvingEList<ConditionalExpression_adapted_thenExpressionItem>(ConditionalExpression_adapted_thenExpressionItem.class, this, Java_adaptedPackage.CONDITIONAL_EXPRESSION_ADAPTED__THEN_EXPRESSION);
		}
		return thenExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.CONDITIONAL_EXPRESSION_ADAPTED__ELSE_EXPRESSION:
				return getElseExpression();
			case Java_adaptedPackage.CONDITIONAL_EXPRESSION_ADAPTED__EXPRESSION:
				return getExpression();
			case Java_adaptedPackage.CONDITIONAL_EXPRESSION_ADAPTED__THEN_EXPRESSION:
				return getThenExpression();
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
			case Java_adaptedPackage.CONDITIONAL_EXPRESSION_ADAPTED__ELSE_EXPRESSION:
				getElseExpression().clear();
				getElseExpression().addAll((Collection<? extends ConditionalExpression_adapted_elseExpressionItem>)newValue);
				return;
			case Java_adaptedPackage.CONDITIONAL_EXPRESSION_ADAPTED__EXPRESSION:
				getExpression().clear();
				getExpression().addAll((Collection<? extends ConditionalExpression_adapted_expressionItem>)newValue);
				return;
			case Java_adaptedPackage.CONDITIONAL_EXPRESSION_ADAPTED__THEN_EXPRESSION:
				getThenExpression().clear();
				getThenExpression().addAll((Collection<? extends ConditionalExpression_adapted_thenExpressionItem>)newValue);
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
			case Java_adaptedPackage.CONDITIONAL_EXPRESSION_ADAPTED__ELSE_EXPRESSION:
				getElseExpression().clear();
				return;
			case Java_adaptedPackage.CONDITIONAL_EXPRESSION_ADAPTED__EXPRESSION:
				getExpression().clear();
				return;
			case Java_adaptedPackage.CONDITIONAL_EXPRESSION_ADAPTED__THEN_EXPRESSION:
				getThenExpression().clear();
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
			case Java_adaptedPackage.CONDITIONAL_EXPRESSION_ADAPTED__ELSE_EXPRESSION:
				return elseExpression != null && !elseExpression.isEmpty();
			case Java_adaptedPackage.CONDITIONAL_EXPRESSION_ADAPTED__EXPRESSION:
				return expression != null && !expression.isEmpty();
			case Java_adaptedPackage.CONDITIONAL_EXPRESSION_ADAPTED__THEN_EXPRESSION:
				return thenExpression != null && !thenExpression.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConditionalExpression_adaptedImpl
