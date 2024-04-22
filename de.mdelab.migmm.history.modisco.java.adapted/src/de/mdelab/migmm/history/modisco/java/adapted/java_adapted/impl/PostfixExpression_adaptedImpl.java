/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.PostfixExpression_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.PostfixExpression_adapted_operandItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.PostfixExpression_adapted_operatorValue;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Postfix Expression adapted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.PostfixExpression_adaptedImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.PostfixExpression_adaptedImpl#getOperand <em>Operand</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PostfixExpression_adaptedImpl extends Expression_adaptedImpl implements PostfixExpression_adapted {
	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected EList<PostfixExpression_adapted_operatorValue> operator;

	/**
	 * The cached value of the '{@link #getOperand() <em>Operand</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperand()
	 * @generated
	 * @ordered
	 */
	protected EList<PostfixExpression_adapted_operandItem> operand;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PostfixExpression_adaptedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getPostfixExpression_adapted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PostfixExpression_adapted_operatorValue> getOperator() {
		if (operator == null) {
			operator = new EObjectResolvingEList<PostfixExpression_adapted_operatorValue>(PostfixExpression_adapted_operatorValue.class, this, Java_adaptedPackage.POSTFIX_EXPRESSION_ADAPTED__OPERATOR);
		}
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PostfixExpression_adapted_operandItem> getOperand() {
		if (operand == null) {
			operand = new EObjectResolvingEList<PostfixExpression_adapted_operandItem>(PostfixExpression_adapted_operandItem.class, this, Java_adaptedPackage.POSTFIX_EXPRESSION_ADAPTED__OPERAND);
		}
		return operand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.POSTFIX_EXPRESSION_ADAPTED__OPERATOR:
				return getOperator();
			case Java_adaptedPackage.POSTFIX_EXPRESSION_ADAPTED__OPERAND:
				return getOperand();
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
			case Java_adaptedPackage.POSTFIX_EXPRESSION_ADAPTED__OPERATOR:
				getOperator().clear();
				getOperator().addAll((Collection<? extends PostfixExpression_adapted_operatorValue>)newValue);
				return;
			case Java_adaptedPackage.POSTFIX_EXPRESSION_ADAPTED__OPERAND:
				getOperand().clear();
				getOperand().addAll((Collection<? extends PostfixExpression_adapted_operandItem>)newValue);
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
			case Java_adaptedPackage.POSTFIX_EXPRESSION_ADAPTED__OPERATOR:
				getOperator().clear();
				return;
			case Java_adaptedPackage.POSTFIX_EXPRESSION_ADAPTED__OPERAND:
				getOperand().clear();
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
			case Java_adaptedPackage.POSTFIX_EXPRESSION_ADAPTED__OPERATOR:
				return operator != null && !operator.isEmpty();
			case Java_adaptedPackage.POSTFIX_EXPRESSION_ADAPTED__OPERAND:
				return operand != null && !operand.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PostfixExpression_adaptedImpl
