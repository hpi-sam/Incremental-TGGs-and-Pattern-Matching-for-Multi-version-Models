/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.ContainmentEdgeWithHistoryImpl;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Expression_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.InfixExpression_adapted_leftOperandItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Infix Expression adapted left Operand Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.InfixExpression_adapted_leftOperandItemImpl#getLeftOperand <em>Left Operand</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InfixExpression_adapted_leftOperandItemImpl extends ContainmentEdgeWithHistoryImpl implements InfixExpression_adapted_leftOperandItem {
	/**
	 * The cached value of the '{@link #getLeftOperand() <em>Left Operand</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftOperand()
	 * @generated
	 * @ordered
	 */
	protected Expression_adapted leftOperand;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfixExpression_adapted_leftOperandItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getInfixExpression_adapted_leftOperandItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression_adapted getLeftOperand() {
		if (leftOperand != null && leftOperand.eIsProxy()) {
			InternalEObject oldLeftOperand = (InternalEObject)leftOperand;
			leftOperand = (Expression_adapted)eResolveProxy(oldLeftOperand);
			if (leftOperand != oldLeftOperand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Java_adaptedPackage.INFIX_EXPRESSION_ADAPTED_LEFT_OPERAND_ITEM__LEFT_OPERAND, oldLeftOperand, leftOperand));
			}
		}
		return leftOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_adapted basicGetLeftOperand() {
		return leftOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLeftOperand(Expression_adapted newLeftOperand) {
		Expression_adapted oldLeftOperand = leftOperand;
		leftOperand = newLeftOperand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_adaptedPackage.INFIX_EXPRESSION_ADAPTED_LEFT_OPERAND_ITEM__LEFT_OPERAND, oldLeftOperand, leftOperand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.INFIX_EXPRESSION_ADAPTED_LEFT_OPERAND_ITEM__LEFT_OPERAND:
				if (resolve) return getLeftOperand();
				return basicGetLeftOperand();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_adaptedPackage.INFIX_EXPRESSION_ADAPTED_LEFT_OPERAND_ITEM__LEFT_OPERAND:
				setLeftOperand((Expression_adapted)newValue);
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
			case Java_adaptedPackage.INFIX_EXPRESSION_ADAPTED_LEFT_OPERAND_ITEM__LEFT_OPERAND:
				setLeftOperand((Expression_adapted)null);
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
			case Java_adaptedPackage.INFIX_EXPRESSION_ADAPTED_LEFT_OPERAND_ITEM__LEFT_OPERAND:
				return leftOperand != null;
		}
		return super.eIsSet(featureID);
	}

} //InfixExpression_adapted_leftOperandItemImpl
