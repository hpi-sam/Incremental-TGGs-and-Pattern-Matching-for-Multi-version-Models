/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.ContainmentEdgeWithHistoryImpl;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Statement_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SwitchStatement_adapted_statementsItem;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switch Statement adapted statements Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.SwitchStatement_adapted_statementsItemImpl#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwitchStatement_adapted_statementsItemImpl extends ContainmentEdgeWithHistoryImpl implements SwitchStatement_adapted_statementsItem {
	/**
	 * The cached value of the '{@link #getStatements() <em>Statements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatements()
	 * @generated
	 * @ordered
	 */
	protected Statement_adapted statements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwitchStatement_adapted_statementsItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getSwitchStatement_adapted_statementsItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Statement_adapted getStatements() {
		if (statements != null && statements.eIsProxy()) {
			InternalEObject oldStatements = (InternalEObject)statements;
			statements = (Statement_adapted)eResolveProxy(oldStatements);
			if (statements != oldStatements) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Java_adaptedPackage.SWITCH_STATEMENT_ADAPTED_STATEMENTS_ITEM__STATEMENTS, oldStatements, statements));
			}
		}
		return statements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement_adapted basicGetStatements() {
		return statements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatements(Statement_adapted newStatements) {
		Statement_adapted oldStatements = statements;
		statements = newStatements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_adaptedPackage.SWITCH_STATEMENT_ADAPTED_STATEMENTS_ITEM__STATEMENTS, oldStatements, statements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.SWITCH_STATEMENT_ADAPTED_STATEMENTS_ITEM__STATEMENTS:
				if (resolve) return getStatements();
				return basicGetStatements();
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
			case Java_adaptedPackage.SWITCH_STATEMENT_ADAPTED_STATEMENTS_ITEM__STATEMENTS:
				setStatements((Statement_adapted)newValue);
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
			case Java_adaptedPackage.SWITCH_STATEMENT_ADAPTED_STATEMENTS_ITEM__STATEMENTS:
				setStatements((Statement_adapted)null);
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
			case Java_adaptedPackage.SWITCH_STATEMENT_ADAPTED_STATEMENTS_ITEM__STATEMENTS:
				return statements != null;
		}
		return super.eIsSet(featureID);
	}

} //SwitchStatement_adapted_statementsItemImpl
