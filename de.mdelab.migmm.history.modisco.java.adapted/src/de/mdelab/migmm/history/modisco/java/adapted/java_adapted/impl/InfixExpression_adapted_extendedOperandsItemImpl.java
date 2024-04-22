/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.ContainmentEdgeWithHistoryImpl;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Expression_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.InfixExpression_adapted_extendedOperandsItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Infix Expression adapted extended Operands Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.InfixExpression_adapted_extendedOperandsItemImpl#getExtendedOperands <em>Extended Operands</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InfixExpression_adapted_extendedOperandsItemImpl extends ContainmentEdgeWithHistoryImpl implements InfixExpression_adapted_extendedOperandsItem {
	/**
	 * The cached value of the '{@link #getExtendedOperands() <em>Extended Operands</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedOperands()
	 * @generated
	 * @ordered
	 */
	protected Expression_adapted extendedOperands;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfixExpression_adapted_extendedOperandsItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getInfixExpression_adapted_extendedOperandsItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression_adapted getExtendedOperands() {
		if (extendedOperands != null && extendedOperands.eIsProxy()) {
			InternalEObject oldExtendedOperands = (InternalEObject)extendedOperands;
			extendedOperands = (Expression_adapted)eResolveProxy(oldExtendedOperands);
			if (extendedOperands != oldExtendedOperands) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Java_adaptedPackage.INFIX_EXPRESSION_ADAPTED_EXTENDED_OPERANDS_ITEM__EXTENDED_OPERANDS, oldExtendedOperands, extendedOperands));
			}
		}
		return extendedOperands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_adapted basicGetExtendedOperands() {
		return extendedOperands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtendedOperands(Expression_adapted newExtendedOperands) {
		Expression_adapted oldExtendedOperands = extendedOperands;
		extendedOperands = newExtendedOperands;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_adaptedPackage.INFIX_EXPRESSION_ADAPTED_EXTENDED_OPERANDS_ITEM__EXTENDED_OPERANDS, oldExtendedOperands, extendedOperands));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.INFIX_EXPRESSION_ADAPTED_EXTENDED_OPERANDS_ITEM__EXTENDED_OPERANDS:
				if (resolve) return getExtendedOperands();
				return basicGetExtendedOperands();
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
			case Java_adaptedPackage.INFIX_EXPRESSION_ADAPTED_EXTENDED_OPERANDS_ITEM__EXTENDED_OPERANDS:
				setExtendedOperands((Expression_adapted)newValue);
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
			case Java_adaptedPackage.INFIX_EXPRESSION_ADAPTED_EXTENDED_OPERANDS_ITEM__EXTENDED_OPERANDS:
				setExtendedOperands((Expression_adapted)null);
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
			case Java_adaptedPackage.INFIX_EXPRESSION_ADAPTED_EXTENDED_OPERANDS_ITEM__EXTENDED_OPERANDS:
				return extendedOperands != null;
		}
		return super.eIsSet(featureID);
	}

} //InfixExpression_adapted_extendedOperandsItemImpl
