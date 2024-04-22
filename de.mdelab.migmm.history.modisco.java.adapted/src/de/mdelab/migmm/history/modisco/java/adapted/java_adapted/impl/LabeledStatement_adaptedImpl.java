/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.LabeledStatement_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.LabeledStatement_adapted_bodyItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.LabeledStatement_adapted_usagesInBreakStatementsItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.LabeledStatement_adapted_usagesInContinueStatementsItem;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Labeled Statement adapted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.LabeledStatement_adaptedImpl#getBody <em>Body</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.LabeledStatement_adaptedImpl#getUsagesInBreakStatements <em>Usages In Break Statements</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.LabeledStatement_adaptedImpl#getUsagesInContinueStatements <em>Usages In Continue Statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LabeledStatement_adaptedImpl extends NamedElement_adaptedImpl implements LabeledStatement_adapted {
	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected EList<LabeledStatement_adapted_bodyItem> body;

	/**
	 * The cached value of the '{@link #getUsagesInBreakStatements() <em>Usages In Break Statements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsagesInBreakStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<LabeledStatement_adapted_usagesInBreakStatementsItem> usagesInBreakStatements;

	/**
	 * The cached value of the '{@link #getUsagesInContinueStatements() <em>Usages In Continue Statements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsagesInContinueStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<LabeledStatement_adapted_usagesInContinueStatementsItem> usagesInContinueStatements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabeledStatement_adaptedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getLabeledStatement_adapted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LabeledStatement_adapted_bodyItem> getBody() {
		if (body == null) {
			body = new EObjectResolvingEList<LabeledStatement_adapted_bodyItem>(LabeledStatement_adapted_bodyItem.class, this, Java_adaptedPackage.LABELED_STATEMENT_ADAPTED__BODY);
		}
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LabeledStatement_adapted_usagesInBreakStatementsItem> getUsagesInBreakStatements() {
		if (usagesInBreakStatements == null) {
			usagesInBreakStatements = new EObjectResolvingEList<LabeledStatement_adapted_usagesInBreakStatementsItem>(LabeledStatement_adapted_usagesInBreakStatementsItem.class, this, Java_adaptedPackage.LABELED_STATEMENT_ADAPTED__USAGES_IN_BREAK_STATEMENTS);
		}
		return usagesInBreakStatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LabeledStatement_adapted_usagesInContinueStatementsItem> getUsagesInContinueStatements() {
		if (usagesInContinueStatements == null) {
			usagesInContinueStatements = new EObjectResolvingEList<LabeledStatement_adapted_usagesInContinueStatementsItem>(LabeledStatement_adapted_usagesInContinueStatementsItem.class, this, Java_adaptedPackage.LABELED_STATEMENT_ADAPTED__USAGES_IN_CONTINUE_STATEMENTS);
		}
		return usagesInContinueStatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.LABELED_STATEMENT_ADAPTED__BODY:
				return getBody();
			case Java_adaptedPackage.LABELED_STATEMENT_ADAPTED__USAGES_IN_BREAK_STATEMENTS:
				return getUsagesInBreakStatements();
			case Java_adaptedPackage.LABELED_STATEMENT_ADAPTED__USAGES_IN_CONTINUE_STATEMENTS:
				return getUsagesInContinueStatements();
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
			case Java_adaptedPackage.LABELED_STATEMENT_ADAPTED__BODY:
				getBody().clear();
				getBody().addAll((Collection<? extends LabeledStatement_adapted_bodyItem>)newValue);
				return;
			case Java_adaptedPackage.LABELED_STATEMENT_ADAPTED__USAGES_IN_BREAK_STATEMENTS:
				getUsagesInBreakStatements().clear();
				getUsagesInBreakStatements().addAll((Collection<? extends LabeledStatement_adapted_usagesInBreakStatementsItem>)newValue);
				return;
			case Java_adaptedPackage.LABELED_STATEMENT_ADAPTED__USAGES_IN_CONTINUE_STATEMENTS:
				getUsagesInContinueStatements().clear();
				getUsagesInContinueStatements().addAll((Collection<? extends LabeledStatement_adapted_usagesInContinueStatementsItem>)newValue);
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
			case Java_adaptedPackage.LABELED_STATEMENT_ADAPTED__BODY:
				getBody().clear();
				return;
			case Java_adaptedPackage.LABELED_STATEMENT_ADAPTED__USAGES_IN_BREAK_STATEMENTS:
				getUsagesInBreakStatements().clear();
				return;
			case Java_adaptedPackage.LABELED_STATEMENT_ADAPTED__USAGES_IN_CONTINUE_STATEMENTS:
				getUsagesInContinueStatements().clear();
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
			case Java_adaptedPackage.LABELED_STATEMENT_ADAPTED__BODY:
				return body != null && !body.isEmpty();
			case Java_adaptedPackage.LABELED_STATEMENT_ADAPTED__USAGES_IN_BREAK_STATEMENTS:
				return usagesInBreakStatements != null && !usagesInBreakStatements.isEmpty();
			case Java_adaptedPackage.LABELED_STATEMENT_ADAPTED__USAGES_IN_CONTINUE_STATEMENTS:
				return usagesInContinueStatements != null && !usagesInContinueStatements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LabeledStatement_adaptedImpl
