/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted_bodyDeclarationItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted_inheritanceValue;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted_nativeValue;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted_singleVariableDeclarationItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted_staticValue;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted_strictfpValue;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted_synchronizedValue;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted_transientValue;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted_variableDeclarationExpressionItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted_variableDeclarationStatementItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted_visibilityValue;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted_volatileValue;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modifier adapted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.Modifier_adaptedImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.Modifier_adaptedImpl#getInheritance <em>Inheritance</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.Modifier_adaptedImpl#getStatic <em>Static</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.Modifier_adaptedImpl#getTransient <em>Transient</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.Modifier_adaptedImpl#getVolatile <em>Volatile</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.Modifier_adaptedImpl#getNative <em>Native</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.Modifier_adaptedImpl#getStrictfp <em>Strictfp</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.Modifier_adaptedImpl#getSynchronized <em>Synchronized</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.Modifier_adaptedImpl#getBodyDeclaration <em>Body Declaration</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.Modifier_adaptedImpl#getSingleVariableDeclaration <em>Single Variable Declaration</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.Modifier_adaptedImpl#getVariableDeclarationStatement <em>Variable Declaration Statement</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.Modifier_adaptedImpl#getVariableDeclarationExpression <em>Variable Declaration Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Modifier_adaptedImpl extends ASTNode_adaptedImpl implements Modifier_adapted {
	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected EList<Modifier_adapted_visibilityValue> visibility;

	/**
	 * The cached value of the '{@link #getInheritance() <em>Inheritance</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritance()
	 * @generated
	 * @ordered
	 */
	protected EList<Modifier_adapted_inheritanceValue> inheritance;

	/**
	 * The cached value of the '{@link #getStatic() <em>Static</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatic()
	 * @generated
	 * @ordered
	 */
	protected EList<Modifier_adapted_staticValue> static_;

	/**
	 * The cached value of the '{@link #getTransient() <em>Transient</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransient()
	 * @generated
	 * @ordered
	 */
	protected EList<Modifier_adapted_transientValue> transient_;

	/**
	 * The cached value of the '{@link #getVolatile() <em>Volatile</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolatile()
	 * @generated
	 * @ordered
	 */
	protected EList<Modifier_adapted_volatileValue> volatile_;

	/**
	 * The cached value of the '{@link #getNative() <em>Native</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNative()
	 * @generated
	 * @ordered
	 */
	protected EList<Modifier_adapted_nativeValue> native_;

	/**
	 * The cached value of the '{@link #getStrictfp() <em>Strictfp</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrictfp()
	 * @generated
	 * @ordered
	 */
	protected EList<Modifier_adapted_strictfpValue> strictfp_;

	/**
	 * The cached value of the '{@link #getSynchronized() <em>Synchronized</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynchronized()
	 * @generated
	 * @ordered
	 */
	protected EList<Modifier_adapted_synchronizedValue> synchronized_;

	/**
	 * The cached value of the '{@link #getBodyDeclaration() <em>Body Declaration</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyDeclaration()
	 * @generated
	 * @ordered
	 */
	protected EList<Modifier_adapted_bodyDeclarationItem> bodyDeclaration;

	/**
	 * The cached value of the '{@link #getSingleVariableDeclaration() <em>Single Variable Declaration</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingleVariableDeclaration()
	 * @generated
	 * @ordered
	 */
	protected EList<Modifier_adapted_singleVariableDeclarationItem> singleVariableDeclaration;

	/**
	 * The cached value of the '{@link #getVariableDeclarationStatement() <em>Variable Declaration Statement</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableDeclarationStatement()
	 * @generated
	 * @ordered
	 */
	protected EList<Modifier_adapted_variableDeclarationStatementItem> variableDeclarationStatement;

	/**
	 * The cached value of the '{@link #getVariableDeclarationExpression() <em>Variable Declaration Expression</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableDeclarationExpression()
	 * @generated
	 * @ordered
	 */
	protected EList<Modifier_adapted_variableDeclarationExpressionItem> variableDeclarationExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Modifier_adaptedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getModifier_adapted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Modifier_adapted_visibilityValue> getVisibility() {
		if (visibility == null) {
			visibility = new EObjectResolvingEList<Modifier_adapted_visibilityValue>(Modifier_adapted_visibilityValue.class, this, Java_adaptedPackage.MODIFIER_ADAPTED__VISIBILITY);
		}
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Modifier_adapted_inheritanceValue> getInheritance() {
		if (inheritance == null) {
			inheritance = new EObjectResolvingEList<Modifier_adapted_inheritanceValue>(Modifier_adapted_inheritanceValue.class, this, Java_adaptedPackage.MODIFIER_ADAPTED__INHERITANCE);
		}
		return inheritance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Modifier_adapted_staticValue> getStatic() {
		if (static_ == null) {
			static_ = new EObjectResolvingEList<Modifier_adapted_staticValue>(Modifier_adapted_staticValue.class, this, Java_adaptedPackage.MODIFIER_ADAPTED__STATIC);
		}
		return static_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Modifier_adapted_transientValue> getTransient() {
		if (transient_ == null) {
			transient_ = new EObjectResolvingEList<Modifier_adapted_transientValue>(Modifier_adapted_transientValue.class, this, Java_adaptedPackage.MODIFIER_ADAPTED__TRANSIENT);
		}
		return transient_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Modifier_adapted_volatileValue> getVolatile() {
		if (volatile_ == null) {
			volatile_ = new EObjectResolvingEList<Modifier_adapted_volatileValue>(Modifier_adapted_volatileValue.class, this, Java_adaptedPackage.MODIFIER_ADAPTED__VOLATILE);
		}
		return volatile_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Modifier_adapted_nativeValue> getNative() {
		if (native_ == null) {
			native_ = new EObjectResolvingEList<Modifier_adapted_nativeValue>(Modifier_adapted_nativeValue.class, this, Java_adaptedPackage.MODIFIER_ADAPTED__NATIVE);
		}
		return native_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Modifier_adapted_strictfpValue> getStrictfp() {
		if (strictfp_ == null) {
			strictfp_ = new EObjectResolvingEList<Modifier_adapted_strictfpValue>(Modifier_adapted_strictfpValue.class, this, Java_adaptedPackage.MODIFIER_ADAPTED__STRICTFP);
		}
		return strictfp_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Modifier_adapted_synchronizedValue> getSynchronized() {
		if (synchronized_ == null) {
			synchronized_ = new EObjectResolvingEList<Modifier_adapted_synchronizedValue>(Modifier_adapted_synchronizedValue.class, this, Java_adaptedPackage.MODIFIER_ADAPTED__SYNCHRONIZED);
		}
		return synchronized_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Modifier_adapted_bodyDeclarationItem> getBodyDeclaration() {
		if (bodyDeclaration == null) {
			bodyDeclaration = new EObjectResolvingEList<Modifier_adapted_bodyDeclarationItem>(Modifier_adapted_bodyDeclarationItem.class, this, Java_adaptedPackage.MODIFIER_ADAPTED__BODY_DECLARATION);
		}
		return bodyDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Modifier_adapted_singleVariableDeclarationItem> getSingleVariableDeclaration() {
		if (singleVariableDeclaration == null) {
			singleVariableDeclaration = new EObjectResolvingEList<Modifier_adapted_singleVariableDeclarationItem>(Modifier_adapted_singleVariableDeclarationItem.class, this, Java_adaptedPackage.MODIFIER_ADAPTED__SINGLE_VARIABLE_DECLARATION);
		}
		return singleVariableDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Modifier_adapted_variableDeclarationStatementItem> getVariableDeclarationStatement() {
		if (variableDeclarationStatement == null) {
			variableDeclarationStatement = new EObjectResolvingEList<Modifier_adapted_variableDeclarationStatementItem>(Modifier_adapted_variableDeclarationStatementItem.class, this, Java_adaptedPackage.MODIFIER_ADAPTED__VARIABLE_DECLARATION_STATEMENT);
		}
		return variableDeclarationStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Modifier_adapted_variableDeclarationExpressionItem> getVariableDeclarationExpression() {
		if (variableDeclarationExpression == null) {
			variableDeclarationExpression = new EObjectResolvingEList<Modifier_adapted_variableDeclarationExpressionItem>(Modifier_adapted_variableDeclarationExpressionItem.class, this, Java_adaptedPackage.MODIFIER_ADAPTED__VARIABLE_DECLARATION_EXPRESSION);
		}
		return variableDeclarationExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.MODIFIER_ADAPTED__VISIBILITY:
				return getVisibility();
			case Java_adaptedPackage.MODIFIER_ADAPTED__INHERITANCE:
				return getInheritance();
			case Java_adaptedPackage.MODIFIER_ADAPTED__STATIC:
				return getStatic();
			case Java_adaptedPackage.MODIFIER_ADAPTED__TRANSIENT:
				return getTransient();
			case Java_adaptedPackage.MODIFIER_ADAPTED__VOLATILE:
				return getVolatile();
			case Java_adaptedPackage.MODIFIER_ADAPTED__NATIVE:
				return getNative();
			case Java_adaptedPackage.MODIFIER_ADAPTED__STRICTFP:
				return getStrictfp();
			case Java_adaptedPackage.MODIFIER_ADAPTED__SYNCHRONIZED:
				return getSynchronized();
			case Java_adaptedPackage.MODIFIER_ADAPTED__BODY_DECLARATION:
				return getBodyDeclaration();
			case Java_adaptedPackage.MODIFIER_ADAPTED__SINGLE_VARIABLE_DECLARATION:
				return getSingleVariableDeclaration();
			case Java_adaptedPackage.MODIFIER_ADAPTED__VARIABLE_DECLARATION_STATEMENT:
				return getVariableDeclarationStatement();
			case Java_adaptedPackage.MODIFIER_ADAPTED__VARIABLE_DECLARATION_EXPRESSION:
				return getVariableDeclarationExpression();
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
			case Java_adaptedPackage.MODIFIER_ADAPTED__VISIBILITY:
				getVisibility().clear();
				getVisibility().addAll((Collection<? extends Modifier_adapted_visibilityValue>)newValue);
				return;
			case Java_adaptedPackage.MODIFIER_ADAPTED__INHERITANCE:
				getInheritance().clear();
				getInheritance().addAll((Collection<? extends Modifier_adapted_inheritanceValue>)newValue);
				return;
			case Java_adaptedPackage.MODIFIER_ADAPTED__STATIC:
				getStatic().clear();
				getStatic().addAll((Collection<? extends Modifier_adapted_staticValue>)newValue);
				return;
			case Java_adaptedPackage.MODIFIER_ADAPTED__TRANSIENT:
				getTransient().clear();
				getTransient().addAll((Collection<? extends Modifier_adapted_transientValue>)newValue);
				return;
			case Java_adaptedPackage.MODIFIER_ADAPTED__VOLATILE:
				getVolatile().clear();
				getVolatile().addAll((Collection<? extends Modifier_adapted_volatileValue>)newValue);
				return;
			case Java_adaptedPackage.MODIFIER_ADAPTED__NATIVE:
				getNative().clear();
				getNative().addAll((Collection<? extends Modifier_adapted_nativeValue>)newValue);
				return;
			case Java_adaptedPackage.MODIFIER_ADAPTED__STRICTFP:
				getStrictfp().clear();
				getStrictfp().addAll((Collection<? extends Modifier_adapted_strictfpValue>)newValue);
				return;
			case Java_adaptedPackage.MODIFIER_ADAPTED__SYNCHRONIZED:
				getSynchronized().clear();
				getSynchronized().addAll((Collection<? extends Modifier_adapted_synchronizedValue>)newValue);
				return;
			case Java_adaptedPackage.MODIFIER_ADAPTED__BODY_DECLARATION:
				getBodyDeclaration().clear();
				getBodyDeclaration().addAll((Collection<? extends Modifier_adapted_bodyDeclarationItem>)newValue);
				return;
			case Java_adaptedPackage.MODIFIER_ADAPTED__SINGLE_VARIABLE_DECLARATION:
				getSingleVariableDeclaration().clear();
				getSingleVariableDeclaration().addAll((Collection<? extends Modifier_adapted_singleVariableDeclarationItem>)newValue);
				return;
			case Java_adaptedPackage.MODIFIER_ADAPTED__VARIABLE_DECLARATION_STATEMENT:
				getVariableDeclarationStatement().clear();
				getVariableDeclarationStatement().addAll((Collection<? extends Modifier_adapted_variableDeclarationStatementItem>)newValue);
				return;
			case Java_adaptedPackage.MODIFIER_ADAPTED__VARIABLE_DECLARATION_EXPRESSION:
				getVariableDeclarationExpression().clear();
				getVariableDeclarationExpression().addAll((Collection<? extends Modifier_adapted_variableDeclarationExpressionItem>)newValue);
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
			case Java_adaptedPackage.MODIFIER_ADAPTED__VISIBILITY:
				getVisibility().clear();
				return;
			case Java_adaptedPackage.MODIFIER_ADAPTED__INHERITANCE:
				getInheritance().clear();
				return;
			case Java_adaptedPackage.MODIFIER_ADAPTED__STATIC:
				getStatic().clear();
				return;
			case Java_adaptedPackage.MODIFIER_ADAPTED__TRANSIENT:
				getTransient().clear();
				return;
			case Java_adaptedPackage.MODIFIER_ADAPTED__VOLATILE:
				getVolatile().clear();
				return;
			case Java_adaptedPackage.MODIFIER_ADAPTED__NATIVE:
				getNative().clear();
				return;
			case Java_adaptedPackage.MODIFIER_ADAPTED__STRICTFP:
				getStrictfp().clear();
				return;
			case Java_adaptedPackage.MODIFIER_ADAPTED__SYNCHRONIZED:
				getSynchronized().clear();
				return;
			case Java_adaptedPackage.MODIFIER_ADAPTED__BODY_DECLARATION:
				getBodyDeclaration().clear();
				return;
			case Java_adaptedPackage.MODIFIER_ADAPTED__SINGLE_VARIABLE_DECLARATION:
				getSingleVariableDeclaration().clear();
				return;
			case Java_adaptedPackage.MODIFIER_ADAPTED__VARIABLE_DECLARATION_STATEMENT:
				getVariableDeclarationStatement().clear();
				return;
			case Java_adaptedPackage.MODIFIER_ADAPTED__VARIABLE_DECLARATION_EXPRESSION:
				getVariableDeclarationExpression().clear();
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
			case Java_adaptedPackage.MODIFIER_ADAPTED__VISIBILITY:
				return visibility != null && !visibility.isEmpty();
			case Java_adaptedPackage.MODIFIER_ADAPTED__INHERITANCE:
				return inheritance != null && !inheritance.isEmpty();
			case Java_adaptedPackage.MODIFIER_ADAPTED__STATIC:
				return static_ != null && !static_.isEmpty();
			case Java_adaptedPackage.MODIFIER_ADAPTED__TRANSIENT:
				return transient_ != null && !transient_.isEmpty();
			case Java_adaptedPackage.MODIFIER_ADAPTED__VOLATILE:
				return volatile_ != null && !volatile_.isEmpty();
			case Java_adaptedPackage.MODIFIER_ADAPTED__NATIVE:
				return native_ != null && !native_.isEmpty();
			case Java_adaptedPackage.MODIFIER_ADAPTED__STRICTFP:
				return strictfp_ != null && !strictfp_.isEmpty();
			case Java_adaptedPackage.MODIFIER_ADAPTED__SYNCHRONIZED:
				return synchronized_ != null && !synchronized_.isEmpty();
			case Java_adaptedPackage.MODIFIER_ADAPTED__BODY_DECLARATION:
				return bodyDeclaration != null && !bodyDeclaration.isEmpty();
			case Java_adaptedPackage.MODIFIER_ADAPTED__SINGLE_VARIABLE_DECLARATION:
				return singleVariableDeclaration != null && !singleVariableDeclaration.isEmpty();
			case Java_adaptedPackage.MODIFIER_ADAPTED__VARIABLE_DECLARATION_STATEMENT:
				return variableDeclarationStatement != null && !variableDeclarationStatement.isEmpty();
			case Java_adaptedPackage.MODIFIER_ADAPTED__VARIABLE_DECLARATION_EXPRESSION:
				return variableDeclarationExpression != null && !variableDeclarationExpression.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Modifier_adaptedImpl
