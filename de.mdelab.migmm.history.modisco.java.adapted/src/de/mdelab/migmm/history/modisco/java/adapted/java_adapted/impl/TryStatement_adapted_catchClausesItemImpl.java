/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.ContainmentEdgeWithHistoryImpl;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.CatchClause_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TryStatement_adapted_catchClausesItem;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Try Statement adapted catch Clauses Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.TryStatement_adapted_catchClausesItemImpl#getCatchClauses <em>Catch Clauses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TryStatement_adapted_catchClausesItemImpl extends ContainmentEdgeWithHistoryImpl implements TryStatement_adapted_catchClausesItem {
	/**
	 * The cached value of the '{@link #getCatchClauses() <em>Catch Clauses</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatchClauses()
	 * @generated
	 * @ordered
	 */
	protected CatchClause_adapted catchClauses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TryStatement_adapted_catchClausesItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getTryStatement_adapted_catchClausesItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CatchClause_adapted getCatchClauses() {
		if (catchClauses != null && catchClauses.eIsProxy()) {
			InternalEObject oldCatchClauses = (InternalEObject)catchClauses;
			catchClauses = (CatchClause_adapted)eResolveProxy(oldCatchClauses);
			if (catchClauses != oldCatchClauses) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Java_adaptedPackage.TRY_STATEMENT_ADAPTED_CATCH_CLAUSES_ITEM__CATCH_CLAUSES, oldCatchClauses, catchClauses));
			}
		}
		return catchClauses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatchClause_adapted basicGetCatchClauses() {
		return catchClauses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCatchClauses(CatchClause_adapted newCatchClauses) {
		CatchClause_adapted oldCatchClauses = catchClauses;
		catchClauses = newCatchClauses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_adaptedPackage.TRY_STATEMENT_ADAPTED_CATCH_CLAUSES_ITEM__CATCH_CLAUSES, oldCatchClauses, catchClauses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.TRY_STATEMENT_ADAPTED_CATCH_CLAUSES_ITEM__CATCH_CLAUSES:
				if (resolve) return getCatchClauses();
				return basicGetCatchClauses();
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
			case Java_adaptedPackage.TRY_STATEMENT_ADAPTED_CATCH_CLAUSES_ITEM__CATCH_CLAUSES:
				setCatchClauses((CatchClause_adapted)newValue);
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
			case Java_adaptedPackage.TRY_STATEMENT_ADAPTED_CATCH_CLAUSES_ITEM__CATCH_CLAUSES:
				setCatchClauses((CatchClause_adapted)null);
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
			case Java_adaptedPackage.TRY_STATEMENT_ADAPTED_CATCH_CLAUSES_ITEM__CATCH_CLAUSES:
				return catchClauses != null;
		}
		return super.eIsSet(featureID);
	}

} //TryStatement_adapted_catchClausesItemImpl
