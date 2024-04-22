/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.EdgeWithHistoryImpl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.CatchClause_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SingleVariableDeclaration_adapted_catchClauseItem;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Variable Declaration adapted catch Clause Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.SingleVariableDeclaration_adapted_catchClauseItemImpl#getCatchClause <em>Catch Clause</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SingleVariableDeclaration_adapted_catchClauseItemImpl extends EdgeWithHistoryImpl implements SingleVariableDeclaration_adapted_catchClauseItem {
	/**
	 * The cached value of the '{@link #getCatchClause() <em>Catch Clause</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatchClause()
	 * @generated
	 * @ordered
	 */
	protected CatchClause_adapted catchClause;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleVariableDeclaration_adapted_catchClauseItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getSingleVariableDeclaration_adapted_catchClauseItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CatchClause_adapted getCatchClause() {
		if (catchClause != null && catchClause.eIsProxy()) {
			InternalEObject oldCatchClause = (InternalEObject)catchClause;
			catchClause = (CatchClause_adapted)eResolveProxy(oldCatchClause);
			if (catchClause != oldCatchClause) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Java_adaptedPackage.SINGLE_VARIABLE_DECLARATION_ADAPTED_CATCH_CLAUSE_ITEM__CATCH_CLAUSE, oldCatchClause, catchClause));
			}
		}
		return catchClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatchClause_adapted basicGetCatchClause() {
		return catchClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCatchClause(CatchClause_adapted newCatchClause) {
		CatchClause_adapted oldCatchClause = catchClause;
		catchClause = newCatchClause;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_adaptedPackage.SINGLE_VARIABLE_DECLARATION_ADAPTED_CATCH_CLAUSE_ITEM__CATCH_CLAUSE, oldCatchClause, catchClause));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.SINGLE_VARIABLE_DECLARATION_ADAPTED_CATCH_CLAUSE_ITEM__CATCH_CLAUSE:
				if (resolve) return getCatchClause();
				return basicGetCatchClause();
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
			case Java_adaptedPackage.SINGLE_VARIABLE_DECLARATION_ADAPTED_CATCH_CLAUSE_ITEM__CATCH_CLAUSE:
				setCatchClause((CatchClause_adapted)newValue);
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
			case Java_adaptedPackage.SINGLE_VARIABLE_DECLARATION_ADAPTED_CATCH_CLAUSE_ITEM__CATCH_CLAUSE:
				setCatchClause((CatchClause_adapted)null);
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
			case Java_adaptedPackage.SINGLE_VARIABLE_DECLARATION_ADAPTED_CATCH_CLAUSE_ITEM__CATCH_CLAUSE:
				return catchClause != null;
		}
		return super.eIsSet(featureID);
	}

} //SingleVariableDeclaration_adapted_catchClauseItemImpl
