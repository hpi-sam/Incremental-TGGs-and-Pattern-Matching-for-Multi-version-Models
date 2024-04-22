/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.ContainmentEdgeWithHistoryImpl;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Assignment_adapted_leftHandSideItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Expression_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignment adapted left Hand Side Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.Assignment_adapted_leftHandSideItemImpl#getLeftHandSide <em>Left Hand Side</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Assignment_adapted_leftHandSideItemImpl extends ContainmentEdgeWithHistoryImpl implements Assignment_adapted_leftHandSideItem {
	/**
	 * The cached value of the '{@link #getLeftHandSide() <em>Left Hand Side</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftHandSide()
	 * @generated
	 * @ordered
	 */
	protected Expression_adapted leftHandSide;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Assignment_adapted_leftHandSideItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getAssignment_adapted_leftHandSideItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression_adapted getLeftHandSide() {
		if (leftHandSide != null && leftHandSide.eIsProxy()) {
			InternalEObject oldLeftHandSide = (InternalEObject)leftHandSide;
			leftHandSide = (Expression_adapted)eResolveProxy(oldLeftHandSide);
			if (leftHandSide != oldLeftHandSide) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Java_adaptedPackage.ASSIGNMENT_ADAPTED_LEFT_HAND_SIDE_ITEM__LEFT_HAND_SIDE, oldLeftHandSide, leftHandSide));
			}
		}
		return leftHandSide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_adapted basicGetLeftHandSide() {
		return leftHandSide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLeftHandSide(Expression_adapted newLeftHandSide) {
		Expression_adapted oldLeftHandSide = leftHandSide;
		leftHandSide = newLeftHandSide;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_adaptedPackage.ASSIGNMENT_ADAPTED_LEFT_HAND_SIDE_ITEM__LEFT_HAND_SIDE, oldLeftHandSide, leftHandSide));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.ASSIGNMENT_ADAPTED_LEFT_HAND_SIDE_ITEM__LEFT_HAND_SIDE:
				if (resolve) return getLeftHandSide();
				return basicGetLeftHandSide();
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
			case Java_adaptedPackage.ASSIGNMENT_ADAPTED_LEFT_HAND_SIDE_ITEM__LEFT_HAND_SIDE:
				setLeftHandSide((Expression_adapted)newValue);
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
			case Java_adaptedPackage.ASSIGNMENT_ADAPTED_LEFT_HAND_SIDE_ITEM__LEFT_HAND_SIDE:
				setLeftHandSide((Expression_adapted)null);
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
			case Java_adaptedPackage.ASSIGNMENT_ADAPTED_LEFT_HAND_SIDE_ITEM__LEFT_HAND_SIDE:
				return leftHandSide != null;
		}
		return super.eIsSet(featureID);
	}

} //Assignment_adapted_leftHandSideItemImpl
