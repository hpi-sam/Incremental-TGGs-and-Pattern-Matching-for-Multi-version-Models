/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.ContainmentEdgeWithHistoryImpl;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.IfStatement_adapted_thenStatementItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Statement_adapted;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Statement adapted then Statement Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.IfStatement_adapted_thenStatementItemImpl#getThenStatement <em>Then Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfStatement_adapted_thenStatementItemImpl extends ContainmentEdgeWithHistoryImpl implements IfStatement_adapted_thenStatementItem {
	/**
	 * The cached value of the '{@link #getThenStatement() <em>Then Statement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThenStatement()
	 * @generated
	 * @ordered
	 */
	protected Statement_adapted thenStatement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfStatement_adapted_thenStatementItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getIfStatement_adapted_thenStatementItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Statement_adapted getThenStatement() {
		if (thenStatement != null && thenStatement.eIsProxy()) {
			InternalEObject oldThenStatement = (InternalEObject)thenStatement;
			thenStatement = (Statement_adapted)eResolveProxy(oldThenStatement);
			if (thenStatement != oldThenStatement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Java_adaptedPackage.IF_STATEMENT_ADAPTED_THEN_STATEMENT_ITEM__THEN_STATEMENT, oldThenStatement, thenStatement));
			}
		}
		return thenStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement_adapted basicGetThenStatement() {
		return thenStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThenStatement(Statement_adapted newThenStatement) {
		Statement_adapted oldThenStatement = thenStatement;
		thenStatement = newThenStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_adaptedPackage.IF_STATEMENT_ADAPTED_THEN_STATEMENT_ITEM__THEN_STATEMENT, oldThenStatement, thenStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.IF_STATEMENT_ADAPTED_THEN_STATEMENT_ITEM__THEN_STATEMENT:
				if (resolve) return getThenStatement();
				return basicGetThenStatement();
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
			case Java_adaptedPackage.IF_STATEMENT_ADAPTED_THEN_STATEMENT_ITEM__THEN_STATEMENT:
				setThenStatement((Statement_adapted)newValue);
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
			case Java_adaptedPackage.IF_STATEMENT_ADAPTED_THEN_STATEMENT_ITEM__THEN_STATEMENT:
				setThenStatement((Statement_adapted)null);
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
			case Java_adaptedPackage.IF_STATEMENT_ADAPTED_THEN_STATEMENT_ITEM__THEN_STATEMENT:
				return thenStatement != null;
		}
		return super.eIsSet(featureID);
	}

} //IfStatement_adapted_thenStatementItemImpl
