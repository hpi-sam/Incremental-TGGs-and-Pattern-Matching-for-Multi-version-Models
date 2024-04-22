/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.EdgeWithHistoryImpl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractTypeDeclaration_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.CompilationUnit_adapted_typesItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compilation Unit adapted types Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.CompilationUnit_adapted_typesItemImpl#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompilationUnit_adapted_typesItemImpl extends EdgeWithHistoryImpl implements CompilationUnit_adapted_typesItem {
	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected AbstractTypeDeclaration_adapted types;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompilationUnit_adapted_typesItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getCompilationUnit_adapted_typesItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractTypeDeclaration_adapted getTypes() {
		if (types != null && types.eIsProxy()) {
			InternalEObject oldTypes = (InternalEObject)types;
			types = (AbstractTypeDeclaration_adapted)eResolveProxy(oldTypes);
			if (types != oldTypes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Java_adaptedPackage.COMPILATION_UNIT_ADAPTED_TYPES_ITEM__TYPES, oldTypes, types));
			}
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTypeDeclaration_adapted basicGetTypes() {
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypes(AbstractTypeDeclaration_adapted newTypes) {
		AbstractTypeDeclaration_adapted oldTypes = types;
		types = newTypes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_adaptedPackage.COMPILATION_UNIT_ADAPTED_TYPES_ITEM__TYPES, oldTypes, types));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.COMPILATION_UNIT_ADAPTED_TYPES_ITEM__TYPES:
				if (resolve) return getTypes();
				return basicGetTypes();
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
			case Java_adaptedPackage.COMPILATION_UNIT_ADAPTED_TYPES_ITEM__TYPES:
				setTypes((AbstractTypeDeclaration_adapted)newValue);
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
			case Java_adaptedPackage.COMPILATION_UNIT_ADAPTED_TYPES_ITEM__TYPES:
				setTypes((AbstractTypeDeclaration_adapted)null);
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
			case Java_adaptedPackage.COMPILATION_UNIT_ADAPTED_TYPES_ITEM__TYPES:
				return types != null;
		}
		return super.eIsSet(featureID);
	}

} //CompilationUnit_adapted_typesItemImpl
