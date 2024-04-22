/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.ContainmentEdgeWithHistoryImpl;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Assignment_adapted_rightHandSideItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Expression_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignment adapted right Hand Side Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.Assignment_adapted_rightHandSideItemImpl#getRightHandSide <em>Right Hand Side</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Assignment_adapted_rightHandSideItemImpl extends ContainmentEdgeWithHistoryImpl implements Assignment_adapted_rightHandSideItem {
	/**
	 * The cached value of the '{@link #getRightHandSide() <em>Right Hand Side</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightHandSide()
	 * @generated
	 * @ordered
	 */
	protected Expression_adapted rightHandSide;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Assignment_adapted_rightHandSideItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getAssignment_adapted_rightHandSideItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression_adapted getRightHandSide() {
		if (rightHandSide != null && rightHandSide.eIsProxy()) {
			InternalEObject oldRightHandSide = (InternalEObject)rightHandSide;
			rightHandSide = (Expression_adapted)eResolveProxy(oldRightHandSide);
			if (rightHandSide != oldRightHandSide) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Java_adaptedPackage.ASSIGNMENT_ADAPTED_RIGHT_HAND_SIDE_ITEM__RIGHT_HAND_SIDE, oldRightHandSide, rightHandSide));
			}
		}
		return rightHandSide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_adapted basicGetRightHandSide() {
		return rightHandSide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRightHandSide(Expression_adapted newRightHandSide) {
		Expression_adapted oldRightHandSide = rightHandSide;
		rightHandSide = newRightHandSide;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_adaptedPackage.ASSIGNMENT_ADAPTED_RIGHT_HAND_SIDE_ITEM__RIGHT_HAND_SIDE, oldRightHandSide, rightHandSide));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.ASSIGNMENT_ADAPTED_RIGHT_HAND_SIDE_ITEM__RIGHT_HAND_SIDE:
				if (resolve) return getRightHandSide();
				return basicGetRightHandSide();
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
			case Java_adaptedPackage.ASSIGNMENT_ADAPTED_RIGHT_HAND_SIDE_ITEM__RIGHT_HAND_SIDE:
				setRightHandSide((Expression_adapted)newValue);
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
			case Java_adaptedPackage.ASSIGNMENT_ADAPTED_RIGHT_HAND_SIDE_ITEM__RIGHT_HAND_SIDE:
				setRightHandSide((Expression_adapted)null);
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
			case Java_adaptedPackage.ASSIGNMENT_ADAPTED_RIGHT_HAND_SIDE_ITEM__RIGHT_HAND_SIDE:
				return rightHandSide != null;
		}
		return super.eIsSet(featureID);
	}

} //Assignment_adapted_rightHandSideItemImpl
