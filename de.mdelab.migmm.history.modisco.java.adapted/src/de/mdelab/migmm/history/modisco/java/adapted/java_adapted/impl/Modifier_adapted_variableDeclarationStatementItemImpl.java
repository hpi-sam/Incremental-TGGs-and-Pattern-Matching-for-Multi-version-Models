/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.EdgeWithHistoryImpl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted_variableDeclarationStatementItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.VariableDeclarationStatement_adapted;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modifier adapted variable Declaration Statement Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.Modifier_adapted_variableDeclarationStatementItemImpl#getVariableDeclarationStatement <em>Variable Declaration Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Modifier_adapted_variableDeclarationStatementItemImpl extends EdgeWithHistoryImpl implements Modifier_adapted_variableDeclarationStatementItem {
	/**
	 * The cached value of the '{@link #getVariableDeclarationStatement() <em>Variable Declaration Statement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableDeclarationStatement()
	 * @generated
	 * @ordered
	 */
	protected VariableDeclarationStatement_adapted variableDeclarationStatement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Modifier_adapted_variableDeclarationStatementItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getModifier_adapted_variableDeclarationStatementItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableDeclarationStatement_adapted getVariableDeclarationStatement() {
		if (variableDeclarationStatement != null && variableDeclarationStatement.eIsProxy()) {
			InternalEObject oldVariableDeclarationStatement = (InternalEObject)variableDeclarationStatement;
			variableDeclarationStatement = (VariableDeclarationStatement_adapted)eResolveProxy(oldVariableDeclarationStatement);
			if (variableDeclarationStatement != oldVariableDeclarationStatement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Java_adaptedPackage.MODIFIER_ADAPTED_VARIABLE_DECLARATION_STATEMENT_ITEM__VARIABLE_DECLARATION_STATEMENT, oldVariableDeclarationStatement, variableDeclarationStatement));
			}
		}
		return variableDeclarationStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclarationStatement_adapted basicGetVariableDeclarationStatement() {
		return variableDeclarationStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVariableDeclarationStatement(VariableDeclarationStatement_adapted newVariableDeclarationStatement) {
		VariableDeclarationStatement_adapted oldVariableDeclarationStatement = variableDeclarationStatement;
		variableDeclarationStatement = newVariableDeclarationStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_adaptedPackage.MODIFIER_ADAPTED_VARIABLE_DECLARATION_STATEMENT_ITEM__VARIABLE_DECLARATION_STATEMENT, oldVariableDeclarationStatement, variableDeclarationStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.MODIFIER_ADAPTED_VARIABLE_DECLARATION_STATEMENT_ITEM__VARIABLE_DECLARATION_STATEMENT:
				if (resolve) return getVariableDeclarationStatement();
				return basicGetVariableDeclarationStatement();
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
			case Java_adaptedPackage.MODIFIER_ADAPTED_VARIABLE_DECLARATION_STATEMENT_ITEM__VARIABLE_DECLARATION_STATEMENT:
				setVariableDeclarationStatement((VariableDeclarationStatement_adapted)newValue);
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
			case Java_adaptedPackage.MODIFIER_ADAPTED_VARIABLE_DECLARATION_STATEMENT_ITEM__VARIABLE_DECLARATION_STATEMENT:
				setVariableDeclarationStatement((VariableDeclarationStatement_adapted)null);
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
			case Java_adaptedPackage.MODIFIER_ADAPTED_VARIABLE_DECLARATION_STATEMENT_ITEM__VARIABLE_DECLARATION_STATEMENT:
				return variableDeclarationStatement != null;
		}
		return super.eIsSet(featureID);
	}

} //Modifier_adapted_variableDeclarationStatementItemImpl
