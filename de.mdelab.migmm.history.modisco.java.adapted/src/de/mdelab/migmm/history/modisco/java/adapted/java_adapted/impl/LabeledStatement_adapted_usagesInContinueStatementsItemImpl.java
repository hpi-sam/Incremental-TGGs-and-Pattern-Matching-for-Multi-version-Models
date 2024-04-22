/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.EdgeWithHistoryImpl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ContinueStatement_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.LabeledStatement_adapted_usagesInContinueStatementsItem;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Labeled Statement adapted usages In Continue Statements Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.LabeledStatement_adapted_usagesInContinueStatementsItemImpl#getUsagesInContinueStatements <em>Usages In Continue Statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LabeledStatement_adapted_usagesInContinueStatementsItemImpl extends EdgeWithHistoryImpl implements LabeledStatement_adapted_usagesInContinueStatementsItem {
	/**
	 * The cached value of the '{@link #getUsagesInContinueStatements() <em>Usages In Continue Statements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsagesInContinueStatements()
	 * @generated
	 * @ordered
	 */
	protected ContinueStatement_adapted usagesInContinueStatements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabeledStatement_adapted_usagesInContinueStatementsItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getLabeledStatement_adapted_usagesInContinueStatementsItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContinueStatement_adapted getUsagesInContinueStatements() {
		if (usagesInContinueStatements != null && usagesInContinueStatements.eIsProxy()) {
			InternalEObject oldUsagesInContinueStatements = (InternalEObject)usagesInContinueStatements;
			usagesInContinueStatements = (ContinueStatement_adapted)eResolveProxy(oldUsagesInContinueStatements);
			if (usagesInContinueStatements != oldUsagesInContinueStatements) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Java_adaptedPackage.LABELED_STATEMENT_ADAPTED_USAGES_IN_CONTINUE_STATEMENTS_ITEM__USAGES_IN_CONTINUE_STATEMENTS, oldUsagesInContinueStatements, usagesInContinueStatements));
			}
		}
		return usagesInContinueStatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinueStatement_adapted basicGetUsagesInContinueStatements() {
		return usagesInContinueStatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsagesInContinueStatements(ContinueStatement_adapted newUsagesInContinueStatements) {
		ContinueStatement_adapted oldUsagesInContinueStatements = usagesInContinueStatements;
		usagesInContinueStatements = newUsagesInContinueStatements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_adaptedPackage.LABELED_STATEMENT_ADAPTED_USAGES_IN_CONTINUE_STATEMENTS_ITEM__USAGES_IN_CONTINUE_STATEMENTS, oldUsagesInContinueStatements, usagesInContinueStatements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.LABELED_STATEMENT_ADAPTED_USAGES_IN_CONTINUE_STATEMENTS_ITEM__USAGES_IN_CONTINUE_STATEMENTS:
				if (resolve) return getUsagesInContinueStatements();
				return basicGetUsagesInContinueStatements();
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
			case Java_adaptedPackage.LABELED_STATEMENT_ADAPTED_USAGES_IN_CONTINUE_STATEMENTS_ITEM__USAGES_IN_CONTINUE_STATEMENTS:
				setUsagesInContinueStatements((ContinueStatement_adapted)newValue);
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
			case Java_adaptedPackage.LABELED_STATEMENT_ADAPTED_USAGES_IN_CONTINUE_STATEMENTS_ITEM__USAGES_IN_CONTINUE_STATEMENTS:
				setUsagesInContinueStatements((ContinueStatement_adapted)null);
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
			case Java_adaptedPackage.LABELED_STATEMENT_ADAPTED_USAGES_IN_CONTINUE_STATEMENTS_ITEM__USAGES_IN_CONTINUE_STATEMENTS:
				return usagesInContinueStatements != null;
		}
		return super.eIsSet(featureID);
	}

} //LabeledStatement_adapted_usagesInContinueStatementsItemImpl
