/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.ContainmentEdgeWithHistoryImpl;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.EnumConstantDeclaration_adapted_argumentsItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Expression_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum Constant Declaration adapted arguments Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.EnumConstantDeclaration_adapted_argumentsItemImpl#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumConstantDeclaration_adapted_argumentsItemImpl extends ContainmentEdgeWithHistoryImpl implements EnumConstantDeclaration_adapted_argumentsItem {
	/**
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected Expression_adapted arguments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumConstantDeclaration_adapted_argumentsItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getEnumConstantDeclaration_adapted_argumentsItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression_adapted getArguments() {
		if (arguments != null && arguments.eIsProxy()) {
			InternalEObject oldArguments = (InternalEObject)arguments;
			arguments = (Expression_adapted)eResolveProxy(oldArguments);
			if (arguments != oldArguments) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Java_adaptedPackage.ENUM_CONSTANT_DECLARATION_ADAPTED_ARGUMENTS_ITEM__ARGUMENTS, oldArguments, arguments));
			}
		}
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_adapted basicGetArguments() {
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArguments(Expression_adapted newArguments) {
		Expression_adapted oldArguments = arguments;
		arguments = newArguments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_adaptedPackage.ENUM_CONSTANT_DECLARATION_ADAPTED_ARGUMENTS_ITEM__ARGUMENTS, oldArguments, arguments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.ENUM_CONSTANT_DECLARATION_ADAPTED_ARGUMENTS_ITEM__ARGUMENTS:
				if (resolve) return getArguments();
				return basicGetArguments();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_adaptedPackage.ENUM_CONSTANT_DECLARATION_ADAPTED_ARGUMENTS_ITEM__ARGUMENTS:
				setArguments((Expression_adapted)newValue);
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
			case Java_adaptedPackage.ENUM_CONSTANT_DECLARATION_ADAPTED_ARGUMENTS_ITEM__ARGUMENTS:
				setArguments((Expression_adapted)null);
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
			case Java_adaptedPackage.ENUM_CONSTANT_DECLARATION_ADAPTED_ARGUMENTS_ITEM__ARGUMENTS:
				return arguments != null;
		}
		return super.eIsSet(featureID);
	}

} //EnumConstantDeclaration_adapted_argumentsItemImpl
