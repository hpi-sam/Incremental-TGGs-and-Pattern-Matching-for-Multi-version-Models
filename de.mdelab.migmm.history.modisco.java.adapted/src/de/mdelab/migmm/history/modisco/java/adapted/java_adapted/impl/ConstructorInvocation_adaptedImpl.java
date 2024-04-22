/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractMethodInvocation_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractMethodInvocation_adapted_argumentsItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractMethodInvocation_adapted_methodItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractMethodInvocation_adapted_typeArgumentsItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ConstructorInvocation_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constructor Invocation adapted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.ConstructorInvocation_adaptedImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.ConstructorInvocation_adaptedImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.ConstructorInvocation_adaptedImpl#getTypeArguments <em>Type Arguments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstructorInvocation_adaptedImpl extends Statement_adaptedImpl implements ConstructorInvocation_adapted {
	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractMethodInvocation_adapted_methodItem> method;

	/**
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractMethodInvocation_adapted_argumentsItem> arguments;

	/**
	 * The cached value of the '{@link #getTypeArguments() <em>Type Arguments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractMethodInvocation_adapted_typeArgumentsItem> typeArguments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstructorInvocation_adaptedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getConstructorInvocation_adapted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractMethodInvocation_adapted_methodItem> getMethod() {
		if (method == null) {
			method = new EObjectResolvingEList<AbstractMethodInvocation_adapted_methodItem>(AbstractMethodInvocation_adapted_methodItem.class, this, Java_adaptedPackage.CONSTRUCTOR_INVOCATION_ADAPTED__METHOD);
		}
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractMethodInvocation_adapted_argumentsItem> getArguments() {
		if (arguments == null) {
			arguments = new EObjectResolvingEList<AbstractMethodInvocation_adapted_argumentsItem>(AbstractMethodInvocation_adapted_argumentsItem.class, this, Java_adaptedPackage.CONSTRUCTOR_INVOCATION_ADAPTED__ARGUMENTS);
		}
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractMethodInvocation_adapted_typeArgumentsItem> getTypeArguments() {
		if (typeArguments == null) {
			typeArguments = new EObjectResolvingEList<AbstractMethodInvocation_adapted_typeArgumentsItem>(AbstractMethodInvocation_adapted_typeArgumentsItem.class, this, Java_adaptedPackage.CONSTRUCTOR_INVOCATION_ADAPTED__TYPE_ARGUMENTS);
		}
		return typeArguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.CONSTRUCTOR_INVOCATION_ADAPTED__METHOD:
				return getMethod();
			case Java_adaptedPackage.CONSTRUCTOR_INVOCATION_ADAPTED__ARGUMENTS:
				return getArguments();
			case Java_adaptedPackage.CONSTRUCTOR_INVOCATION_ADAPTED__TYPE_ARGUMENTS:
				return getTypeArguments();
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
			case Java_adaptedPackage.CONSTRUCTOR_INVOCATION_ADAPTED__METHOD:
				getMethod().clear();
				getMethod().addAll((Collection<? extends AbstractMethodInvocation_adapted_methodItem>)newValue);
				return;
			case Java_adaptedPackage.CONSTRUCTOR_INVOCATION_ADAPTED__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends AbstractMethodInvocation_adapted_argumentsItem>)newValue);
				return;
			case Java_adaptedPackage.CONSTRUCTOR_INVOCATION_ADAPTED__TYPE_ARGUMENTS:
				getTypeArguments().clear();
				getTypeArguments().addAll((Collection<? extends AbstractMethodInvocation_adapted_typeArgumentsItem>)newValue);
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
			case Java_adaptedPackage.CONSTRUCTOR_INVOCATION_ADAPTED__METHOD:
				getMethod().clear();
				return;
			case Java_adaptedPackage.CONSTRUCTOR_INVOCATION_ADAPTED__ARGUMENTS:
				getArguments().clear();
				return;
			case Java_adaptedPackage.CONSTRUCTOR_INVOCATION_ADAPTED__TYPE_ARGUMENTS:
				getTypeArguments().clear();
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
			case Java_adaptedPackage.CONSTRUCTOR_INVOCATION_ADAPTED__METHOD:
				return method != null && !method.isEmpty();
			case Java_adaptedPackage.CONSTRUCTOR_INVOCATION_ADAPTED__ARGUMENTS:
				return arguments != null && !arguments.isEmpty();
			case Java_adaptedPackage.CONSTRUCTOR_INVOCATION_ADAPTED__TYPE_ARGUMENTS:
				return typeArguments != null && !typeArguments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractMethodInvocation_adapted.class) {
			switch (derivedFeatureID) {
				case Java_adaptedPackage.CONSTRUCTOR_INVOCATION_ADAPTED__METHOD: return Java_adaptedPackage.ABSTRACT_METHOD_INVOCATION_ADAPTED__METHOD;
				case Java_adaptedPackage.CONSTRUCTOR_INVOCATION_ADAPTED__ARGUMENTS: return Java_adaptedPackage.ABSTRACT_METHOD_INVOCATION_ADAPTED__ARGUMENTS;
				case Java_adaptedPackage.CONSTRUCTOR_INVOCATION_ADAPTED__TYPE_ARGUMENTS: return Java_adaptedPackage.ABSTRACT_METHOD_INVOCATION_ADAPTED__TYPE_ARGUMENTS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractMethodInvocation_adapted.class) {
			switch (baseFeatureID) {
				case Java_adaptedPackage.ABSTRACT_METHOD_INVOCATION_ADAPTED__METHOD: return Java_adaptedPackage.CONSTRUCTOR_INVOCATION_ADAPTED__METHOD;
				case Java_adaptedPackage.ABSTRACT_METHOD_INVOCATION_ADAPTED__ARGUMENTS: return Java_adaptedPackage.CONSTRUCTOR_INVOCATION_ADAPTED__ARGUMENTS;
				case Java_adaptedPackage.ABSTRACT_METHOD_INVOCATION_ADAPTED__TYPE_ARGUMENTS: return Java_adaptedPackage.CONSTRUCTOR_INVOCATION_ADAPTED__TYPE_ARGUMENTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ConstructorInvocation_adaptedImpl
