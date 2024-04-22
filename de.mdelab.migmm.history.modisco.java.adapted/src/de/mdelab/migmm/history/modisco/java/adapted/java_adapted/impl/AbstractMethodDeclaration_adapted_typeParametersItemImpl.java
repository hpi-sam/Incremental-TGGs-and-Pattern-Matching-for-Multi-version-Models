/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.ContainmentEdgeWithHistoryImpl;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractMethodDeclaration_adapted_typeParametersItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TypeParameter_adapted;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Method Declaration adapted type Parameters Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.AbstractMethodDeclaration_adapted_typeParametersItemImpl#getTypeParameters <em>Type Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractMethodDeclaration_adapted_typeParametersItemImpl extends ContainmentEdgeWithHistoryImpl implements AbstractMethodDeclaration_adapted_typeParametersItem {
	/**
	 * The cached value of the '{@link #getTypeParameters() <em>Type Parameters</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeParameters()
	 * @generated
	 * @ordered
	 */
	protected TypeParameter_adapted typeParameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractMethodDeclaration_adapted_typeParametersItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getAbstractMethodDeclaration_adapted_typeParametersItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeParameter_adapted getTypeParameters() {
		if (typeParameters != null && typeParameters.eIsProxy()) {
			InternalEObject oldTypeParameters = (InternalEObject)typeParameters;
			typeParameters = (TypeParameter_adapted)eResolveProxy(oldTypeParameters);
			if (typeParameters != oldTypeParameters) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Java_adaptedPackage.ABSTRACT_METHOD_DECLARATION_ADAPTED_TYPE_PARAMETERS_ITEM__TYPE_PARAMETERS, oldTypeParameters, typeParameters));
			}
		}
		return typeParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeParameter_adapted basicGetTypeParameters() {
		return typeParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypeParameters(TypeParameter_adapted newTypeParameters) {
		TypeParameter_adapted oldTypeParameters = typeParameters;
		typeParameters = newTypeParameters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_adaptedPackage.ABSTRACT_METHOD_DECLARATION_ADAPTED_TYPE_PARAMETERS_ITEM__TYPE_PARAMETERS, oldTypeParameters, typeParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.ABSTRACT_METHOD_DECLARATION_ADAPTED_TYPE_PARAMETERS_ITEM__TYPE_PARAMETERS:
				if (resolve) return getTypeParameters();
				return basicGetTypeParameters();
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
			case Java_adaptedPackage.ABSTRACT_METHOD_DECLARATION_ADAPTED_TYPE_PARAMETERS_ITEM__TYPE_PARAMETERS:
				setTypeParameters((TypeParameter_adapted)newValue);
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
			case Java_adaptedPackage.ABSTRACT_METHOD_DECLARATION_ADAPTED_TYPE_PARAMETERS_ITEM__TYPE_PARAMETERS:
				setTypeParameters((TypeParameter_adapted)null);
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
			case Java_adaptedPackage.ABSTRACT_METHOD_DECLARATION_ADAPTED_TYPE_PARAMETERS_ITEM__TYPE_PARAMETERS:
				return typeParameters != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractMethodDeclaration_adapted_typeParametersItemImpl
