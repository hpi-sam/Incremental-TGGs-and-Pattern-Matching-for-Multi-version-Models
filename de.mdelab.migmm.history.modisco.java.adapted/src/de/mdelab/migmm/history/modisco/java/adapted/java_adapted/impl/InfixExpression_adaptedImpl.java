/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.InfixExpression_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.InfixExpression_adapted_extendedOperandsItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.InfixExpression_adapted_leftOperandItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.InfixExpression_adapted_operatorValue;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.InfixExpression_adapted_rightOperandItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Infix Expression adapted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.InfixExpression_adaptedImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.InfixExpression_adaptedImpl#getRightOperand <em>Right Operand</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.InfixExpression_adaptedImpl#getLeftOperand <em>Left Operand</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.InfixExpression_adaptedImpl#getExtendedOperands <em>Extended Operands</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InfixExpression_adaptedImpl extends Expression_adaptedImpl implements InfixExpression_adapted {
	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected EList<InfixExpression_adapted_operatorValue> operator;

	/**
	 * The cached value of the '{@link #getRightOperand() <em>Right Operand</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightOperand()
	 * @generated
	 * @ordered
	 */
	protected EList<InfixExpression_adapted_rightOperandItem> rightOperand;

	/**
	 * The cached value of the '{@link #getLeftOperand() <em>Left Operand</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftOperand()
	 * @generated
	 * @ordered
	 */
	protected EList<InfixExpression_adapted_leftOperandItem> leftOperand;

	/**
	 * The cached value of the '{@link #getExtendedOperands() <em>Extended Operands</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedOperands()
	 * @generated
	 * @ordered
	 */
	protected EList<InfixExpression_adapted_extendedOperandsItem> extendedOperands;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfixExpression_adaptedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getInfixExpression_adapted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InfixExpression_adapted_operatorValue> getOperator() {
		if (operator == null) {
			operator = new EObjectResolvingEList<InfixExpression_adapted_operatorValue>(InfixExpression_adapted_operatorValue.class, this, Java_adaptedPackage.INFIX_EXPRESSION_ADAPTED__OPERATOR);
		}
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InfixExpression_adapted_rightOperandItem> getRightOperand() {
		if (rightOperand == null) {
			rightOperand = new EObjectResolvingEList<InfixExpression_adapted_rightOperandItem>(InfixExpression_adapted_rightOperandItem.class, this, Java_adaptedPackage.INFIX_EXPRESSION_ADAPTED__RIGHT_OPERAND);
		}
		return rightOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InfixExpression_adapted_leftOperandItem> getLeftOperand() {
		if (leftOperand == null) {
			leftOperand = new EObjectResolvingEList<InfixExpression_adapted_leftOperandItem>(InfixExpression_adapted_leftOperandItem.class, this, Java_adaptedPackage.INFIX_EXPRESSION_ADAPTED__LEFT_OPERAND);
		}
		return leftOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InfixExpression_adapted_extendedOperandsItem> getExtendedOperands() {
		if (extendedOperands == null) {
			extendedOperands = new EObjectResolvingEList<InfixExpression_adapted_extendedOperandsItem>(InfixExpression_adapted_extendedOperandsItem.class, this, Java_adaptedPackage.INFIX_EXPRESSION_ADAPTED__EXTENDED_OPERANDS);
		}
		return extendedOperands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.INFIX_EXPRESSION_ADAPTED__OPERATOR:
				return getOperator();
			case Java_adaptedPackage.INFIX_EXPRESSION_ADAPTED__RIGHT_OPERAND:
				return getRightOperand();
			case Java_adaptedPackage.INFIX_EXPRESSION_ADAPTED__LEFT_OPERAND:
				return getLeftOperand();
			case Java_adaptedPackage.INFIX_EXPRESSION_ADAPTED__EXTENDED_OPERANDS:
				return getExtendedOperands();
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
			case Java_adaptedPackage.INFIX_EXPRESSION_ADAPTED__OPERATOR:
				getOperator().clear();
				getOperator().addAll((Collection<? extends InfixExpression_adapted_operatorValue>)newValue);
				return;
			case Java_adaptedPackage.INFIX_EXPRESSION_ADAPTED__RIGHT_OPERAND:
				getRightOperand().clear();
				getRightOperand().addAll((Collection<? extends InfixExpression_adapted_rightOperandItem>)newValue);
				return;
			case Java_adaptedPackage.INFIX_EXPRESSION_ADAPTED__LEFT_OPERAND:
				getLeftOperand().clear();
				getLeftOperand().addAll((Collection<? extends InfixExpression_adapted_leftOperandItem>)newValue);
				return;
			case Java_adaptedPackage.INFIX_EXPRESSION_ADAPTED__EXTENDED_OPERANDS:
				getExtendedOperands().clear();
				getExtendedOperands().addAll((Collection<? extends InfixExpression_adapted_extendedOperandsItem>)newValue);
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
			case Java_adaptedPackage.INFIX_EXPRESSION_ADAPTED__OPERATOR:
				getOperator().clear();
				return;
			case Java_adaptedPackage.INFIX_EXPRESSION_ADAPTED__RIGHT_OPERAND:
				getRightOperand().clear();
				return;
			case Java_adaptedPackage.INFIX_EXPRESSION_ADAPTED__LEFT_OPERAND:
				getLeftOperand().clear();
				return;
			case Java_adaptedPackage.INFIX_EXPRESSION_ADAPTED__EXTENDED_OPERANDS:
				getExtendedOperands().clear();
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
			case Java_adaptedPackage.INFIX_EXPRESSION_ADAPTED__OPERATOR:
				return operator != null && !operator.isEmpty();
			case Java_adaptedPackage.INFIX_EXPRESSION_ADAPTED__RIGHT_OPERAND:
				return rightOperand != null && !rightOperand.isEmpty();
			case Java_adaptedPackage.INFIX_EXPRESSION_ADAPTED__LEFT_OPERAND:
				return leftOperand != null && !leftOperand.isEmpty();
			case Java_adaptedPackage.INFIX_EXPRESSION_ADAPTED__EXTENDED_OPERANDS:
				return extendedOperands != null && !extendedOperands.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InfixExpression_adaptedImpl
