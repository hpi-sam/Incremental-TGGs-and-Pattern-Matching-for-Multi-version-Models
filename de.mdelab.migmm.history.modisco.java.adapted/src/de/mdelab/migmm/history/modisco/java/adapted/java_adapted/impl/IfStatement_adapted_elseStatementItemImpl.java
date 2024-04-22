/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.ContainmentEdgeWithHistoryImpl;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.IfStatement_adapted_elseStatementItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Statement_adapted;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Statement adapted else Statement Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.IfStatement_adapted_elseStatementItemImpl#getElseStatement <em>Else Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfStatement_adapted_elseStatementItemImpl extends ContainmentEdgeWithHistoryImpl implements IfStatement_adapted_elseStatementItem {
	/**
	 * The cached value of the '{@link #getElseStatement() <em>Else Statement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseStatement()
	 * @generated
	 * @ordered
	 */
	protected Statement_adapted elseStatement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfStatement_adapted_elseStatementItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getIfStatement_adapted_elseStatementItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Statement_adapted getElseStatement() {
		if (elseStatement != null && elseStatement.eIsProxy()) {
			InternalEObject oldElseStatement = (InternalEObject)elseStatement;
			elseStatement = (Statement_adapted)eResolveProxy(oldElseStatement);
			if (elseStatement != oldElseStatement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Java_adaptedPackage.IF_STATEMENT_ADAPTED_ELSE_STATEMENT_ITEM__ELSE_STATEMENT, oldElseStatement, elseStatement));
			}
		}
		return elseStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement_adapted basicGetElseStatement() {
		return elseStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElseStatement(Statement_adapted newElseStatement) {
		Statement_adapted oldElseStatement = elseStatement;
		elseStatement = newElseStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_adaptedPackage.IF_STATEMENT_ADAPTED_ELSE_STATEMENT_ITEM__ELSE_STATEMENT, oldElseStatement, elseStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.IF_STATEMENT_ADAPTED_ELSE_STATEMENT_ITEM__ELSE_STATEMENT:
				if (resolve) return getElseStatement();
				return basicGetElseStatement();
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
			case Java_adaptedPackage.IF_STATEMENT_ADAPTED_ELSE_STATEMENT_ITEM__ELSE_STATEMENT:
				setElseStatement((Statement_adapted)newValue);
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
			case Java_adaptedPackage.IF_STATEMENT_ADAPTED_ELSE_STATEMENT_ITEM__ELSE_STATEMENT:
				setElseStatement((Statement_adapted)null);
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
			case Java_adaptedPackage.IF_STATEMENT_ADAPTED_ELSE_STATEMENT_ITEM__ELSE_STATEMENT:
				return elseStatement != null;
		}
		return super.eIsSet(featureID);
	}

} //IfStatement_adapted_elseStatementItemImpl
