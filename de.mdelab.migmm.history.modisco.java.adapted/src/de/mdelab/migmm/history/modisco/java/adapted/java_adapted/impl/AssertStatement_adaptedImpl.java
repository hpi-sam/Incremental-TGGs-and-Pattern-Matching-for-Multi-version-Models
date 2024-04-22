/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AssertStatement_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AssertStatement_adapted_expressionItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AssertStatement_adapted_messageItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assert Statement adapted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.AssertStatement_adaptedImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.AssertStatement_adaptedImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssertStatement_adaptedImpl extends Statement_adaptedImpl implements AssertStatement_adapted {
	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected EList<AssertStatement_adapted_messageItem> message;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected EList<AssertStatement_adapted_expressionItem> expression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssertStatement_adaptedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getAssertStatement_adapted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AssertStatement_adapted_messageItem> getMessage() {
		if (message == null) {
			message = new EObjectResolvingEList<AssertStatement_adapted_messageItem>(AssertStatement_adapted_messageItem.class, this, Java_adaptedPackage.ASSERT_STATEMENT_ADAPTED__MESSAGE);
		}
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AssertStatement_adapted_expressionItem> getExpression() {
		if (expression == null) {
			expression = new EObjectResolvingEList<AssertStatement_adapted_expressionItem>(AssertStatement_adapted_expressionItem.class, this, Java_adaptedPackage.ASSERT_STATEMENT_ADAPTED__EXPRESSION);
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
			case Java_adaptedPackage.ASSERT_STATEMENT_ADAPTED__MESSAGE:
				return getMessage();
			case Java_adaptedPackage.ASSERT_STATEMENT_ADAPTED__EXPRESSION:
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
			case Java_adaptedPackage.ASSERT_STATEMENT_ADAPTED__MESSAGE:
				getMessage().clear();
				getMessage().addAll((Collection<? extends AssertStatement_adapted_messageItem>)newValue);
				return;
			case Java_adaptedPackage.ASSERT_STATEMENT_ADAPTED__EXPRESSION:
				getExpression().clear();
				getExpression().addAll((Collection<? extends AssertStatement_adapted_expressionItem>)newValue);
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
			case Java_adaptedPackage.ASSERT_STATEMENT_ADAPTED__MESSAGE:
				getMessage().clear();
				return;
			case Java_adaptedPackage.ASSERT_STATEMENT_ADAPTED__EXPRESSION:
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
			case Java_adaptedPackage.ASSERT_STATEMENT_ADAPTED__MESSAGE:
				return message != null && !message.isEmpty();
			case Java_adaptedPackage.ASSERT_STATEMENT_ADAPTED__EXPRESSION:
				return expression != null && !expression.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AssertStatement_adaptedImpl
