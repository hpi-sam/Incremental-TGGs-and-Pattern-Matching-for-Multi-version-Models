/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SynchronizedStatement_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SynchronizedStatement_adapted_bodyItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SynchronizedStatement_adapted_expressionItem;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Synchronized Statement adapted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.SynchronizedStatement_adaptedImpl#getBody <em>Body</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.SynchronizedStatement_adaptedImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SynchronizedStatement_adaptedImpl extends Statement_adaptedImpl implements SynchronizedStatement_adapted {
	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected EList<SynchronizedStatement_adapted_bodyItem> body;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected EList<SynchronizedStatement_adapted_expressionItem> expression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SynchronizedStatement_adaptedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getSynchronizedStatement_adapted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SynchronizedStatement_adapted_bodyItem> getBody() {
		if (body == null) {
			body = new EObjectResolvingEList<SynchronizedStatement_adapted_bodyItem>(SynchronizedStatement_adapted_bodyItem.class, this, Java_adaptedPackage.SYNCHRONIZED_STATEMENT_ADAPTED__BODY);
		}
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SynchronizedStatement_adapted_expressionItem> getExpression() {
		if (expression == null) {
			expression = new EObjectResolvingEList<SynchronizedStatement_adapted_expressionItem>(SynchronizedStatement_adapted_expressionItem.class, this, Java_adaptedPackage.SYNCHRONIZED_STATEMENT_ADAPTED__EXPRESSION);
		}
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.SYNCHRONIZED_STATEMENT_ADAPTED__BODY:
				return getBody();
			case Java_adaptedPackage.SYNCHRONIZED_STATEMENT_ADAPTED__EXPRESSION:
				return getExpression();
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
			case Java_adaptedPackage.SYNCHRONIZED_STATEMENT_ADAPTED__BODY:
				getBody().clear();
				getBody().addAll((Collection<? extends SynchronizedStatement_adapted_bodyItem>)newValue);
				return;
			case Java_adaptedPackage.SYNCHRONIZED_STATEMENT_ADAPTED__EXPRESSION:
				getExpression().clear();
				getExpression().addAll((Collection<? extends SynchronizedStatement_adapted_expressionItem>)newValue);
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
			case Java_adaptedPackage.SYNCHRONIZED_STATEMENT_ADAPTED__BODY:
				getBody().clear();
				return;
			case Java_adaptedPackage.SYNCHRONIZED_STATEMENT_ADAPTED__EXPRESSION:
				getExpression().clear();
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
			case Java_adaptedPackage.SYNCHRONIZED_STATEMENT_ADAPTED__BODY:
				return body != null && !body.isEmpty();
			case Java_adaptedPackage.SYNCHRONIZED_STATEMENT_ADAPTED__EXPRESSION:
				return expression != null && !expression.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SynchronizedStatement_adaptedImpl
