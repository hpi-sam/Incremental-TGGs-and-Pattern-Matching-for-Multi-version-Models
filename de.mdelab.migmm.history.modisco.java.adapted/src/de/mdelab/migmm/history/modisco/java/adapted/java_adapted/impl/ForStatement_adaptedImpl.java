/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ForStatement_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ForStatement_adapted_bodyItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ForStatement_adapted_expressionItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ForStatement_adapted_initializersItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ForStatement_adapted_updatersItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Statement adapted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.ForStatement_adaptedImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.ForStatement_adaptedImpl#getUpdaters <em>Updaters</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.ForStatement_adaptedImpl#getInitializers <em>Initializers</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.ForStatement_adaptedImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForStatement_adaptedImpl extends Statement_adaptedImpl implements ForStatement_adapted {
	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected EList<ForStatement_adapted_expressionItem> expression;

	/**
	 * The cached value of the '{@link #getUpdaters() <em>Updaters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdaters()
	 * @generated
	 * @ordered
	 */
	protected EList<ForStatement_adapted_updatersItem> updaters;

	/**
	 * The cached value of the '{@link #getInitializers() <em>Initializers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitializers()
	 * @generated
	 * @ordered
	 */
	protected EList<ForStatement_adapted_initializersItem> initializers;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected EList<ForStatement_adapted_bodyItem> body;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForStatement_adaptedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getForStatement_adapted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ForStatement_adapted_expressionItem> getExpression() {
		if (expression == null) {
			expression = new EObjectResolvingEList<ForStatement_adapted_expressionItem>(ForStatement_adapted_expressionItem.class, this, Java_adaptedPackage.FOR_STATEMENT_ADAPTED__EXPRESSION);
		}
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ForStatement_adapted_updatersItem> getUpdaters() {
		if (updaters == null) {
			updaters = new EObjectResolvingEList<ForStatement_adapted_updatersItem>(ForStatement_adapted_updatersItem.class, this, Java_adaptedPackage.FOR_STATEMENT_ADAPTED__UPDATERS);
		}
		return updaters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ForStatement_adapted_initializersItem> getInitializers() {
		if (initializers == null) {
			initializers = new EObjectResolvingEList<ForStatement_adapted_initializersItem>(ForStatement_adapted_initializersItem.class, this, Java_adaptedPackage.FOR_STATEMENT_ADAPTED__INITIALIZERS);
		}
		return initializers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ForStatement_adapted_bodyItem> getBody() {
		if (body == null) {
			body = new EObjectResolvingEList<ForStatement_adapted_bodyItem>(ForStatement_adapted_bodyItem.class, this, Java_adaptedPackage.FOR_STATEMENT_ADAPTED__BODY);
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
			case Java_adaptedPackage.FOR_STATEMENT_ADAPTED__EXPRESSION:
				return getExpression();
			case Java_adaptedPackage.FOR_STATEMENT_ADAPTED__UPDATERS:
				return getUpdaters();
			case Java_adaptedPackage.FOR_STATEMENT_ADAPTED__INITIALIZERS:
				return getInitializers();
			case Java_adaptedPackage.FOR_STATEMENT_ADAPTED__BODY:
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
			case Java_adaptedPackage.FOR_STATEMENT_ADAPTED__EXPRESSION:
				getExpression().clear();
				getExpression().addAll((Collection<? extends ForStatement_adapted_expressionItem>)newValue);
				return;
			case Java_adaptedPackage.FOR_STATEMENT_ADAPTED__UPDATERS:
				getUpdaters().clear();
				getUpdaters().addAll((Collection<? extends ForStatement_adapted_updatersItem>)newValue);
				return;
			case Java_adaptedPackage.FOR_STATEMENT_ADAPTED__INITIALIZERS:
				getInitializers().clear();
				getInitializers().addAll((Collection<? extends ForStatement_adapted_initializersItem>)newValue);
				return;
			case Java_adaptedPackage.FOR_STATEMENT_ADAPTED__BODY:
				getBody().clear();
				getBody().addAll((Collection<? extends ForStatement_adapted_bodyItem>)newValue);
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
			case Java_adaptedPackage.FOR_STATEMENT_ADAPTED__EXPRESSION:
				getExpression().clear();
				return;
			case Java_adaptedPackage.FOR_STATEMENT_ADAPTED__UPDATERS:
				getUpdaters().clear();
				return;
			case Java_adaptedPackage.FOR_STATEMENT_ADAPTED__INITIALIZERS:
				getInitializers().clear();
				return;
			case Java_adaptedPackage.FOR_STATEMENT_ADAPTED__BODY:
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
			case Java_adaptedPackage.FOR_STATEMENT_ADAPTED__EXPRESSION:
				return expression != null && !expression.isEmpty();
			case Java_adaptedPackage.FOR_STATEMENT_ADAPTED__UPDATERS:
				return updaters != null && !updaters.isEmpty();
			case Java_adaptedPackage.FOR_STATEMENT_ADAPTED__INITIALIZERS:
				return initializers != null && !initializers.isEmpty();
			case Java_adaptedPackage.FOR_STATEMENT_ADAPTED__BODY:
				return body != null && !body.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ForStatement_adaptedImpl
