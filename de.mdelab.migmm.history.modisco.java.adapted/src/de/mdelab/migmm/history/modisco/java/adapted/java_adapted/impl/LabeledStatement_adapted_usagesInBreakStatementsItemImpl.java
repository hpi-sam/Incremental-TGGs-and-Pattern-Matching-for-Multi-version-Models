/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.EdgeWithHistoryImpl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.BreakStatement_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.LabeledStatement_adapted_usagesInBreakStatementsItem;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Labeled Statement adapted usages In Break Statements Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.LabeledStatement_adapted_usagesInBreakStatementsItemImpl#getUsagesInBreakStatements <em>Usages In Break Statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LabeledStatement_adapted_usagesInBreakStatementsItemImpl extends EdgeWithHistoryImpl implements LabeledStatement_adapted_usagesInBreakStatementsItem {
	/**
	 * The cached value of the '{@link #getUsagesInBreakStatements() <em>Usages In Break Statements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsagesInBreakStatements()
	 * @generated
	 * @ordered
	 */
	protected BreakStatement_adapted usagesInBreakStatements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabeledStatement_adapted_usagesInBreakStatementsItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getLabeledStatement_adapted_usagesInBreakStatementsItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BreakStatement_adapted getUsagesInBreakStatements() {
		if (usagesInBreakStatements != null && usagesInBreakStatements.eIsProxy()) {
			InternalEObject oldUsagesInBreakStatements = (InternalEObject)usagesInBreakStatements;
			usagesInBreakStatements = (BreakStatement_adapted)eResolveProxy(oldUsagesInBreakStatements);
			if (usagesInBreakStatements != oldUsagesInBreakStatements) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Java_adaptedPackage.LABELED_STATEMENT_ADAPTED_USAGES_IN_BREAK_STATEMENTS_ITEM__USAGES_IN_BREAK_STATEMENTS, oldUsagesInBreakStatements, usagesInBreakStatements));
			}
		}
		return usagesInBreakStatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BreakStatement_adapted basicGetUsagesInBreakStatements() {
		return usagesInBreakStatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsagesInBreakStatements(BreakStatement_adapted newUsagesInBreakStatements) {
		BreakStatement_adapted oldUsagesInBreakStatements = usagesInBreakStatements;
		usagesInBreakStatements = newUsagesInBreakStatements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_adaptedPackage.LABELED_STATEMENT_ADAPTED_USAGES_IN_BREAK_STATEMENTS_ITEM__USAGES_IN_BREAK_STATEMENTS, oldUsagesInBreakStatements, usagesInBreakStatements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.LABELED_STATEMENT_ADAPTED_USAGES_IN_BREAK_STATEMENTS_ITEM__USAGES_IN_BREAK_STATEMENTS:
				if (resolve) return getUsagesInBreakStatements();
				return basicGetUsagesInBreakStatements();
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
			case Java_adaptedPackage.LABELED_STATEMENT_ADAPTED_USAGES_IN_BREAK_STATEMENTS_ITEM__USAGES_IN_BREAK_STATEMENTS:
				setUsagesInBreakStatements((BreakStatement_adapted)newValue);
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
			case Java_adaptedPackage.LABELED_STATEMENT_ADAPTED_USAGES_IN_BREAK_STATEMENTS_ITEM__USAGES_IN_BREAK_STATEMENTS:
				setUsagesInBreakStatements((BreakStatement_adapted)null);
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
			case Java_adaptedPackage.LABELED_STATEMENT_ADAPTED_USAGES_IN_BREAK_STATEMENTS_ITEM__USAGES_IN_BREAK_STATEMENTS:
				return usagesInBreakStatements != null;
		}
		return super.eIsSet(featureID);
	}

} //LabeledStatement_adapted_usagesInBreakStatementsItemImpl
