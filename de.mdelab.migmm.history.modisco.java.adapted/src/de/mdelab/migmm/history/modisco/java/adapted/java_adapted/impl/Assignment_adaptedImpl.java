/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Assignment_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Assignment_adapted_leftHandSideItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Assignment_adapted_operatorValue;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Assignment_adapted_rightHandSideItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignment adapted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.Assignment_adaptedImpl#getLeftHandSide <em>Left Hand Side</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.Assignment_adaptedImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.Assignment_adaptedImpl#getRightHandSide <em>Right Hand Side</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Assignment_adaptedImpl extends Expression_adaptedImpl implements Assignment_adapted {
	/**
	 * The cached value of the '{@link #getLeftHandSide() <em>Left Hand Side</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftHandSide()
	 * @generated
	 * @ordered
	 */
	protected EList<Assignment_adapted_leftHandSideItem> leftHandSide;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected EList<Assignment_adapted_operatorValue> operator;

	/**
	 * The cached value of the '{@link #getRightHandSide() <em>Right Hand Side</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightHandSide()
	 * @generated
	 * @ordered
	 */
	protected EList<Assignment_adapted_rightHandSideItem> rightHandSide;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Assignment_adaptedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getAssignment_adapted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Assignment_adapted_leftHandSideItem> getLeftHandSide() {
		if (leftHandSide == null) {
			leftHandSide = new EObjectResolvingEList<Assignment_adapted_leftHandSideItem>(Assignment_adapted_leftHandSideItem.class, this, Java_adaptedPackage.ASSIGNMENT_ADAPTED__LEFT_HAND_SIDE);
		}
		return leftHandSide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Assignment_adapted_operatorValue> getOperator() {
		if (operator == null) {
			operator = new EObjectResolvingEList<Assignment_adapted_operatorValue>(Assignment_adapted_operatorValue.class, this, Java_adaptedPackage.ASSIGNMENT_ADAPTED__OPERATOR);
		}
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Assignment_adapted_rightHandSideItem> getRightHandSide() {
		if (rightHandSide == null) {
			rightHandSide = new EObjectResolvingEList<Assignment_adapted_rightHandSideItem>(Assignment_adapted_rightHandSideItem.class, this, Java_adaptedPackage.ASSIGNMENT_ADAPTED__RIGHT_HAND_SIDE);
		}
		return rightHandSide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.ASSIGNMENT_ADAPTED__LEFT_HAND_SIDE:
				return getLeftHandSide();
			case Java_adaptedPackage.ASSIGNMENT_ADAPTED__OPERATOR:
				return getOperator();
			case Java_adaptedPackage.ASSIGNMENT_ADAPTED__RIGHT_HAND_SIDE:
				return getRightHandSide();
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
			case Java_adaptedPackage.ASSIGNMENT_ADAPTED__LEFT_HAND_SIDE:
				getLeftHandSide().clear();
				getLeftHandSide().addAll((Collection<? extends Assignment_adapted_leftHandSideItem>)newValue);
				return;
			case Java_adaptedPackage.ASSIGNMENT_ADAPTED__OPERATOR:
				getOperator().clear();
				getOperator().addAll((Collection<? extends Assignment_adapted_operatorValue>)newValue);
				return;
			case Java_adaptedPackage.ASSIGNMENT_ADAPTED__RIGHT_HAND_SIDE:
				getRightHandSide().clear();
				getRightHandSide().addAll((Collection<? extends Assignment_adapted_rightHandSideItem>)newValue);
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
			case Java_adaptedPackage.ASSIGNMENT_ADAPTED__LEFT_HAND_SIDE:
				getLeftHandSide().clear();
				return;
			case Java_adaptedPackage.ASSIGNMENT_ADAPTED__OPERATOR:
				getOperator().clear();
				return;
			case Java_adaptedPackage.ASSIGNMENT_ADAPTED__RIGHT_HAND_SIDE:
				getRightHandSide().clear();
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
			case Java_adaptedPackage.ASSIGNMENT_ADAPTED__LEFT_HAND_SIDE:
				return leftHandSide != null && !leftHandSide.isEmpty();
			case Java_adaptedPackage.ASSIGNMENT_ADAPTED__OPERATOR:
				return operator != null && !operator.isEmpty();
			case Java_adaptedPackage.ASSIGNMENT_ADAPTED__RIGHT_HAND_SIDE:
				return rightHandSide != null && !rightHandSide.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Assignment_adaptedImpl
