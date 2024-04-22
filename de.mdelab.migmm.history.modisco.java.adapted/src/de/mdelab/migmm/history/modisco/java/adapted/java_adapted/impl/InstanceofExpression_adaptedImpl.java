/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.InstanceofExpression_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.InstanceofExpression_adapted_leftOperandItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.InstanceofExpression_adapted_rightOperandItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instanceof Expression adapted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.InstanceofExpression_adaptedImpl#getRightOperand <em>Right Operand</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.InstanceofExpression_adaptedImpl#getLeftOperand <em>Left Operand</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstanceofExpression_adaptedImpl extends Expression_adaptedImpl implements InstanceofExpression_adapted {
	/**
	 * The cached value of the '{@link #getRightOperand() <em>Right Operand</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightOperand()
	 * @generated
	 * @ordered
	 */
	protected EList<InstanceofExpression_adapted_rightOperandItem> rightOperand;

	/**
	 * The cached value of the '{@link #getLeftOperand() <em>Left Operand</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftOperand()
	 * @generated
	 * @ordered
	 */
	protected EList<InstanceofExpression_adapted_leftOperandItem> leftOperand;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceofExpression_adaptedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getInstanceofExpression_adapted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InstanceofExpression_adapted_rightOperandItem> getRightOperand() {
		if (rightOperand == null) {
			rightOperand = new EObjectResolvingEList<InstanceofExpression_adapted_rightOperandItem>(InstanceofExpression_adapted_rightOperandItem.class, this, Java_adaptedPackage.INSTANCEOF_EXPRESSION_ADAPTED__RIGHT_OPERAND);
		}
		return rightOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InstanceofExpression_adapted_leftOperandItem> getLeftOperand() {
		if (leftOperand == null) {
			leftOperand = new EObjectResolvingEList<InstanceofExpression_adapted_leftOperandItem>(InstanceofExpression_adapted_leftOperandItem.class, this, Java_adaptedPackage.INSTANCEOF_EXPRESSION_ADAPTED__LEFT_OPERAND);
		}
		return leftOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.INSTANCEOF_EXPRESSION_ADAPTED__RIGHT_OPERAND:
				return getRightOperand();
			case Java_adaptedPackage.INSTANCEOF_EXPRESSION_ADAPTED__LEFT_OPERAND:
				return getLeftOperand();
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
			case Java_adaptedPackage.INSTANCEOF_EXPRESSION_ADAPTED__RIGHT_OPERAND:
				getRightOperand().clear();
				getRightOperand().addAll((Collection<? extends InstanceofExpression_adapted_rightOperandItem>)newValue);
				return;
			case Java_adaptedPackage.INSTANCEOF_EXPRESSION_ADAPTED__LEFT_OPERAND:
				getLeftOperand().clear();
				getLeftOperand().addAll((Collection<? extends InstanceofExpression_adapted_leftOperandItem>)newValue);
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
			case Java_adaptedPackage.INSTANCEOF_EXPRESSION_ADAPTED__RIGHT_OPERAND:
				getRightOperand().clear();
				return;
			case Java_adaptedPackage.INSTANCEOF_EXPRESSION_ADAPTED__LEFT_OPERAND:
				getLeftOperand().clear();
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
			case Java_adaptedPackage.INSTANCEOF_EXPRESSION_ADAPTED__RIGHT_OPERAND:
				return rightOperand != null && !rightOperand.isEmpty();
			case Java_adaptedPackage.INSTANCEOF_EXPRESSION_ADAPTED__LEFT_OPERAND:
				return leftOperand != null && !leftOperand.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InstanceofExpression_adaptedImpl
