/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.CatchClause_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.CatchClause_adapted_bodyItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.CatchClause_adapted_exceptionItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Catch Clause adapted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.CatchClause_adaptedImpl#getException <em>Exception</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.CatchClause_adaptedImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CatchClause_adaptedImpl extends Statement_adaptedImpl implements CatchClause_adapted {
	/**
	 * The cached value of the '{@link #getException() <em>Exception</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getException()
	 * @generated
	 * @ordered
	 */
	protected EList<CatchClause_adapted_exceptionItem> exception;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected EList<CatchClause_adapted_bodyItem> body;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CatchClause_adaptedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getCatchClause_adapted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CatchClause_adapted_exceptionItem> getException() {
		if (exception == null) {
			exception = new EObjectResolvingEList<CatchClause_adapted_exceptionItem>(CatchClause_adapted_exceptionItem.class, this, Java_adaptedPackage.CATCH_CLAUSE_ADAPTED__EXCEPTION);
		}
		return exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CatchClause_adapted_bodyItem> getBody() {
		if (body == null) {
			body = new EObjectResolvingEList<CatchClause_adapted_bodyItem>(CatchClause_adapted_bodyItem.class, this, Java_adaptedPackage.CATCH_CLAUSE_ADAPTED__BODY);
		}
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.CATCH_CLAUSE_ADAPTED__EXCEPTION:
				return getException();
			case Java_adaptedPackage.CATCH_CLAUSE_ADAPTED__BODY:
				return getBody();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_adaptedPackage.CATCH_CLAUSE_ADAPTED__EXCEPTION:
				getException().clear();
				getException().addAll((Collection<? extends CatchClause_adapted_exceptionItem>)newValue);
				return;
			case Java_adaptedPackage.CATCH_CLAUSE_ADAPTED__BODY:
				getBody().clear();
				getBody().addAll((Collection<? extends CatchClause_adapted_bodyItem>)newValue);
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
			case Java_adaptedPackage.CATCH_CLAUSE_ADAPTED__EXCEPTION:
				getException().clear();
				return;
			case Java_adaptedPackage.CATCH_CLAUSE_ADAPTED__BODY:
				getBody().clear();
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
			case Java_adaptedPackage.CATCH_CLAUSE_ADAPTED__EXCEPTION:
				return exception != null && !exception.isEmpty();
			case Java_adaptedPackage.CATCH_CLAUSE_ADAPTED__BODY:
				return body != null && !body.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CatchClause_adaptedImpl
