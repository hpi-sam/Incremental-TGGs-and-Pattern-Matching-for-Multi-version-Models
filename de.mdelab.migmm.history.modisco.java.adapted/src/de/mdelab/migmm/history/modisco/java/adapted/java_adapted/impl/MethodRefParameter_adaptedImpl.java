/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MethodRefParameter_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MethodRefParameter_adapted_nameValue;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MethodRefParameter_adapted_typeItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MethodRefParameter_adapted_varargsValue;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Ref Parameter adapted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.MethodRefParameter_adaptedImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.MethodRefParameter_adaptedImpl#getVarargs <em>Varargs</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.MethodRefParameter_adaptedImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodRefParameter_adaptedImpl extends ASTNode_adaptedImpl implements MethodRefParameter_adapted {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodRefParameter_adapted_nameValue> name;

	/**
	 * The cached value of the '{@link #getVarargs() <em>Varargs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarargs()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodRefParameter_adapted_varargsValue> varargs;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodRefParameter_adapted_typeItem> type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodRefParameter_adaptedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getMethodRefParameter_adapted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MethodRefParameter_adapted_nameValue> getName() {
		if (name == null) {
			name = new EObjectResolvingEList<MethodRefParameter_adapted_nameValue>(MethodRefParameter_adapted_nameValue.class, this, Java_adaptedPackage.METHOD_REF_PARAMETER_ADAPTED__NAME);
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MethodRefParameter_adapted_varargsValue> getVarargs() {
		if (varargs == null) {
			varargs = new EObjectResolvingEList<MethodRefParameter_adapted_varargsValue>(MethodRefParameter_adapted_varargsValue.class, this, Java_adaptedPackage.METHOD_REF_PARAMETER_ADAPTED__VARARGS);
		}
		return varargs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MethodRefParameter_adapted_typeItem> getType() {
		if (type == null) {
			type = new EObjectResolvingEList<MethodRefParameter_adapted_typeItem>(MethodRefParameter_adapted_typeItem.class, this, Java_adaptedPackage.METHOD_REF_PARAMETER_ADAPTED__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.METHOD_REF_PARAMETER_ADAPTED__NAME:
				return getName();
			case Java_adaptedPackage.METHOD_REF_PARAMETER_ADAPTED__VARARGS:
				return getVarargs();
			case Java_adaptedPackage.METHOD_REF_PARAMETER_ADAPTED__TYPE:
				return getType();
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
			case Java_adaptedPackage.METHOD_REF_PARAMETER_ADAPTED__NAME:
				getName().clear();
				getName().addAll((Collection<? extends MethodRefParameter_adapted_nameValue>)newValue);
				return;
			case Java_adaptedPackage.METHOD_REF_PARAMETER_ADAPTED__VARARGS:
				getVarargs().clear();
				getVarargs().addAll((Collection<? extends MethodRefParameter_adapted_varargsValue>)newValue);
				return;
			case Java_adaptedPackage.METHOD_REF_PARAMETER_ADAPTED__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends MethodRefParameter_adapted_typeItem>)newValue);
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
			case Java_adaptedPackage.METHOD_REF_PARAMETER_ADAPTED__NAME:
				getName().clear();
				return;
			case Java_adaptedPackage.METHOD_REF_PARAMETER_ADAPTED__VARARGS:
				getVarargs().clear();
				return;
			case Java_adaptedPackage.METHOD_REF_PARAMETER_ADAPTED__TYPE:
				getType().clear();
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
			case Java_adaptedPackage.METHOD_REF_PARAMETER_ADAPTED__NAME:
				return name != null && !name.isEmpty();
			case Java_adaptedPackage.METHOD_REF_PARAMETER_ADAPTED__VARARGS:
				return varargs != null && !varargs.isEmpty();
			case Java_adaptedPackage.METHOD_REF_PARAMETER_ADAPTED__TYPE:
				return type != null && !type.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MethodRefParameter_adaptedImpl
