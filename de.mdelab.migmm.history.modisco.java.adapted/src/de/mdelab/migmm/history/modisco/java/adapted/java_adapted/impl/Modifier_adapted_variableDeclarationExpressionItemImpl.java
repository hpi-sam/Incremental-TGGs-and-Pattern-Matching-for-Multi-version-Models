/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.EdgeWithHistoryImpl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted_variableDeclarationExpressionItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.VariableDeclarationExpression_adapted;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modifier adapted variable Declaration Expression Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.Modifier_adapted_variableDeclarationExpressionItemImpl#getVariableDeclarationExpression <em>Variable Declaration Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Modifier_adapted_variableDeclarationExpressionItemImpl extends EdgeWithHistoryImpl implements Modifier_adapted_variableDeclarationExpressionItem {
	/**
	 * The cached value of the '{@link #getVariableDeclarationExpression() <em>Variable Declaration Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableDeclarationExpression()
	 * @generated
	 * @ordered
	 */
	protected VariableDeclarationExpression_adapted variableDeclarationExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Modifier_adapted_variableDeclarationExpressionItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getModifier_adapted_variableDeclarationExpressionItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableDeclarationExpression_adapted getVariableDeclarationExpression() {
		if (variableDeclarationExpression != null && variableDeclarationExpression.eIsProxy()) {
			InternalEObject oldVariableDeclarationExpression = (InternalEObject)variableDeclarationExpression;
			variableDeclarationExpression = (VariableDeclarationExpression_adapted)eResolveProxy(oldVariableDeclarationExpression);
			if (variableDeclarationExpression != oldVariableDeclarationExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Java_adaptedPackage.MODIFIER_ADAPTED_VARIABLE_DECLARATION_EXPRESSION_ITEM__VARIABLE_DECLARATION_EXPRESSION, oldVariableDeclarationExpression, variableDeclarationExpression));
			}
		}
		return variableDeclarationExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclarationExpression_adapted basicGetVariableDeclarationExpression() {
		return variableDeclarationExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVariableDeclarationExpression(VariableDeclarationExpression_adapted newVariableDeclarationExpression) {
		VariableDeclarationExpression_adapted oldVariableDeclarationExpression = variableDeclarationExpression;
		variableDeclarationExpression = newVariableDeclarationExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_adaptedPackage.MODIFIER_ADAPTED_VARIABLE_DECLARATION_EXPRESSION_ITEM__VARIABLE_DECLARATION_EXPRESSION, oldVariableDeclarationExpression, variableDeclarationExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.MODIFIER_ADAPTED_VARIABLE_DECLARATION_EXPRESSION_ITEM__VARIABLE_DECLARATION_EXPRESSION:
				if (resolve) return getVariableDeclarationExpression();
				return basicGetVariableDeclarationExpression();
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
			case Java_adaptedPackage.MODIFIER_ADAPTED_VARIABLE_DECLARATION_EXPRESSION_ITEM__VARIABLE_DECLARATION_EXPRESSION:
				setVariableDeclarationExpression((VariableDeclarationExpression_adapted)newValue);
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
			case Java_adaptedPackage.MODIFIER_ADAPTED_VARIABLE_DECLARATION_EXPRESSION_ITEM__VARIABLE_DECLARATION_EXPRESSION:
				setVariableDeclarationExpression((VariableDeclarationExpression_adapted)null);
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
			case Java_adaptedPackage.MODIFIER_ADAPTED_VARIABLE_DECLARATION_EXPRESSION_ITEM__VARIABLE_DECLARATION_EXPRESSION:
				return variableDeclarationExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //Modifier_adapted_variableDeclarationExpressionItemImpl
