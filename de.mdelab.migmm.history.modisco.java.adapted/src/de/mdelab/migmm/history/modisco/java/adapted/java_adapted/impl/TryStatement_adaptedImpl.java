/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TryStatement_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TryStatement_adapted_bodyItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TryStatement_adapted_catchClausesItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TryStatement_adapted_finallyItem;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Try Statement adapted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.TryStatement_adaptedImpl#getBody <em>Body</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.TryStatement_adaptedImpl#getFinally <em>Finally</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.TryStatement_adaptedImpl#getCatchClauses <em>Catch Clauses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TryStatement_adaptedImpl extends Statement_adaptedImpl implements TryStatement_adapted {
	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected EList<TryStatement_adapted_bodyItem> body;

	/**
	 * The cached value of the '{@link #getFinally() <em>Finally</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinally()
	 * @generated
	 * @ordered
	 */
	protected EList<TryStatement_adapted_finallyItem> finally_;

	/**
	 * The cached value of the '{@link #getCatchClauses() <em>Catch Clauses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatchClauses()
	 * @generated
	 * @ordered
	 */
	protected EList<TryStatement_adapted_catchClausesItem> catchClauses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TryStatement_adaptedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getTryStatement_adapted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TryStatement_adapted_bodyItem> getBody() {
		if (body == null) {
			body = new EObjectResolvingEList<TryStatement_adapted_bodyItem>(TryStatement_adapted_bodyItem.class, this, Java_adaptedPackage.TRY_STATEMENT_ADAPTED__BODY);
		}
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TryStatement_adapted_finallyItem> getFinally() {
		if (finally_ == null) {
			finally_ = new EObjectResolvingEList<TryStatement_adapted_finallyItem>(TryStatement_adapted_finallyItem.class, this, Java_adaptedPackage.TRY_STATEMENT_ADAPTED__FINALLY);
		}
		return finally_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TryStatement_adapted_catchClausesItem> getCatchClauses() {
		if (catchClauses == null) {
			catchClauses = new EObjectResolvingEList<TryStatement_adapted_catchClausesItem>(TryStatement_adapted_catchClausesItem.class, this, Java_adaptedPackage.TRY_STATEMENT_ADAPTED__CATCH_CLAUSES);
		}
		return catchClauses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.TRY_STATEMENT_ADAPTED__BODY:
				return getBody();
			case Java_adaptedPackage.TRY_STATEMENT_ADAPTED__FINALLY:
				return getFinally();
			case Java_adaptedPackage.TRY_STATEMENT_ADAPTED__CATCH_CLAUSES:
				return getCatchClauses();
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
			case Java_adaptedPackage.TRY_STATEMENT_ADAPTED__BODY:
				getBody().clear();
				getBody().addAll((Collection<? extends TryStatement_adapted_bodyItem>)newValue);
				return;
			case Java_adaptedPackage.TRY_STATEMENT_ADAPTED__FINALLY:
				getFinally().clear();
				getFinally().addAll((Collection<? extends TryStatement_adapted_finallyItem>)newValue);
				return;
			case Java_adaptedPackage.TRY_STATEMENT_ADAPTED__CATCH_CLAUSES:
				getCatchClauses().clear();
				getCatchClauses().addAll((Collection<? extends TryStatement_adapted_catchClausesItem>)newValue);
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
			case Java_adaptedPackage.TRY_STATEMENT_ADAPTED__BODY:
				getBody().clear();
				return;
			case Java_adaptedPackage.TRY_STATEMENT_ADAPTED__FINALLY:
				getFinally().clear();
				return;
			case Java_adaptedPackage.TRY_STATEMENT_ADAPTED__CATCH_CLAUSES:
				getCatchClauses().clear();
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
			case Java_adaptedPackage.TRY_STATEMENT_ADAPTED__BODY:
				return body != null && !body.isEmpty();
			case Java_adaptedPackage.TRY_STATEMENT_ADAPTED__FINALLY:
				return finally_ != null && !finally_.isEmpty();
			case Java_adaptedPackage.TRY_STATEMENT_ADAPTED__CATCH_CLAUSES:
				return catchClauses != null && !catchClauses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TryStatement_adaptedImpl
