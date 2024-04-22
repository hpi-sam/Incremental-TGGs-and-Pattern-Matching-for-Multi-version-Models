/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MethodRef_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MethodRef_adapted_methodItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MethodRef_adapted_parametersItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MethodRef_adapted_qualifierItem;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Ref adapted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.MethodRef_adaptedImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.MethodRef_adaptedImpl#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.MethodRef_adaptedImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodRef_adaptedImpl extends ASTNode_adaptedImpl implements MethodRef_adapted {
	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodRef_adapted_methodItem> method;

	/**
	 * The cached value of the '{@link #getQualifier() <em>Qualifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifier()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodRef_adapted_qualifierItem> qualifier;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodRef_adapted_parametersItem> parameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodRef_adaptedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getMethodRef_adapted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MethodRef_adapted_methodItem> getMethod() {
		if (method == null) {
			method = new EObjectResolvingEList<MethodRef_adapted_methodItem>(MethodRef_adapted_methodItem.class, this, Java_adaptedPackage.METHOD_REF_ADAPTED__METHOD);
		}
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MethodRef_adapted_qualifierItem> getQualifier() {
		if (qualifier == null) {
			qualifier = new EObjectResolvingEList<MethodRef_adapted_qualifierItem>(MethodRef_adapted_qualifierItem.class, this, Java_adaptedPackage.METHOD_REF_ADAPTED__QUALIFIER);
		}
		return qualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MethodRef_adapted_parametersItem> getParameters() {
		if (parameters == null) {
			parameters = new EObjectResolvingEList<MethodRef_adapted_parametersItem>(MethodRef_adapted_parametersItem.class, this, Java_adaptedPackage.METHOD_REF_ADAPTED__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.METHOD_REF_ADAPTED__METHOD:
				return getMethod();
			case Java_adaptedPackage.METHOD_REF_ADAPTED__QUALIFIER:
				return getQualifier();
			case Java_adaptedPackage.METHOD_REF_ADAPTED__PARAMETERS:
				return getParameters();
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
			case Java_adaptedPackage.METHOD_REF_ADAPTED__METHOD:
				getMethod().clear();
				getMethod().addAll((Collection<? extends MethodRef_adapted_methodItem>)newValue);
				return;
			case Java_adaptedPackage.METHOD_REF_ADAPTED__QUALIFIER:
				getQualifier().clear();
				getQualifier().addAll((Collection<? extends MethodRef_adapted_qualifierItem>)newValue);
				return;
			case Java_adaptedPackage.METHOD_REF_ADAPTED__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends MethodRef_adapted_parametersItem>)newValue);
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
			case Java_adaptedPackage.METHOD_REF_ADAPTED__METHOD:
				getMethod().clear();
				return;
			case Java_adaptedPackage.METHOD_REF_ADAPTED__QUALIFIER:
				getQualifier().clear();
				return;
			case Java_adaptedPackage.METHOD_REF_ADAPTED__PARAMETERS:
				getParameters().clear();
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
			case Java_adaptedPackage.METHOD_REF_ADAPTED__METHOD:
				return method != null && !method.isEmpty();
			case Java_adaptedPackage.METHOD_REF_ADAPTED__QUALIFIER:
				return qualifier != null && !qualifier.isEmpty();
			case Java_adaptedPackage.METHOD_REF_ADAPTED__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MethodRef_adaptedImpl
