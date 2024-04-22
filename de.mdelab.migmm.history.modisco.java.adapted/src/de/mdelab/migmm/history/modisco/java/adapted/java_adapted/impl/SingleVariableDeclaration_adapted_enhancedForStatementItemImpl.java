/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.EdgeWithHistoryImpl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.EnhancedForStatement_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SingleVariableDeclaration_adapted_enhancedForStatementItem;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Variable Declaration adapted enhanced For Statement Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.SingleVariableDeclaration_adapted_enhancedForStatementItemImpl#getEnhancedForStatement <em>Enhanced For Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SingleVariableDeclaration_adapted_enhancedForStatementItemImpl extends EdgeWithHistoryImpl implements SingleVariableDeclaration_adapted_enhancedForStatementItem {
	/**
	 * The cached value of the '{@link #getEnhancedForStatement() <em>Enhanced For Statement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnhancedForStatement()
	 * @generated
	 * @ordered
	 */
	protected EnhancedForStatement_adapted enhancedForStatement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleVariableDeclaration_adapted_enhancedForStatementItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getSingleVariableDeclaration_adapted_enhancedForStatementItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnhancedForStatement_adapted getEnhancedForStatement() {
		if (enhancedForStatement != null && enhancedForStatement.eIsProxy()) {
			InternalEObject oldEnhancedForStatement = (InternalEObject)enhancedForStatement;
			enhancedForStatement = (EnhancedForStatement_adapted)eResolveProxy(oldEnhancedForStatement);
			if (enhancedForStatement != oldEnhancedForStatement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Java_adaptedPackage.SINGLE_VARIABLE_DECLARATION_ADAPTED_ENHANCED_FOR_STATEMENT_ITEM__ENHANCED_FOR_STATEMENT, oldEnhancedForStatement, enhancedForStatement));
			}
		}
		return enhancedForStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnhancedForStatement_adapted basicGetEnhancedForStatement() {
		return enhancedForStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnhancedForStatement(EnhancedForStatement_adapted newEnhancedForStatement) {
		EnhancedForStatement_adapted oldEnhancedForStatement = enhancedForStatement;
		enhancedForStatement = newEnhancedForStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_adaptedPackage.SINGLE_VARIABLE_DECLARATION_ADAPTED_ENHANCED_FOR_STATEMENT_ITEM__ENHANCED_FOR_STATEMENT, oldEnhancedForStatement, enhancedForStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.SINGLE_VARIABLE_DECLARATION_ADAPTED_ENHANCED_FOR_STATEMENT_ITEM__ENHANCED_FOR_STATEMENT:
				if (resolve) return getEnhancedForStatement();
				return basicGetEnhancedForStatement();
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
			case Java_adaptedPackage.SINGLE_VARIABLE_DECLARATION_ADAPTED_ENHANCED_FOR_STATEMENT_ITEM__ENHANCED_FOR_STATEMENT:
				setEnhancedForStatement((EnhancedForStatement_adapted)newValue);
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
			case Java_adaptedPackage.SINGLE_VARIABLE_DECLARATION_ADAPTED_ENHANCED_FOR_STATEMENT_ITEM__ENHANCED_FOR_STATEMENT:
				setEnhancedForStatement((EnhancedForStatement_adapted)null);
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
			case Java_adaptedPackage.SINGLE_VARIABLE_DECLARATION_ADAPTED_ENHANCED_FOR_STATEMENT_ITEM__ENHANCED_FOR_STATEMENT:
				return enhancedForStatement != null;
		}
		return super.eIsSet(featureID);
	}

} //SingleVariableDeclaration_adapted_enhancedForStatementItemImpl
