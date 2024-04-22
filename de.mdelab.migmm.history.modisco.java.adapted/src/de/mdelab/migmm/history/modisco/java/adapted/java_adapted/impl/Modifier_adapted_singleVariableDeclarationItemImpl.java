/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.EdgeWithHistoryImpl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted_singleVariableDeclarationItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SingleVariableDeclaration_adapted;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modifier adapted single Variable Declaration Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.Modifier_adapted_singleVariableDeclarationItemImpl#getSingleVariableDeclaration <em>Single Variable Declaration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Modifier_adapted_singleVariableDeclarationItemImpl extends EdgeWithHistoryImpl implements Modifier_adapted_singleVariableDeclarationItem {
	/**
	 * The cached value of the '{@link #getSingleVariableDeclaration() <em>Single Variable Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingleVariableDeclaration()
	 * @generated
	 * @ordered
	 */
	protected SingleVariableDeclaration_adapted singleVariableDeclaration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Modifier_adapted_singleVariableDeclarationItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getModifier_adapted_singleVariableDeclarationItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SingleVariableDeclaration_adapted getSingleVariableDeclaration() {
		if (singleVariableDeclaration != null && singleVariableDeclaration.eIsProxy()) {
			InternalEObject oldSingleVariableDeclaration = (InternalEObject)singleVariableDeclaration;
			singleVariableDeclaration = (SingleVariableDeclaration_adapted)eResolveProxy(oldSingleVariableDeclaration);
			if (singleVariableDeclaration != oldSingleVariableDeclaration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Java_adaptedPackage.MODIFIER_ADAPTED_SINGLE_VARIABLE_DECLARATION_ITEM__SINGLE_VARIABLE_DECLARATION, oldSingleVariableDeclaration, singleVariableDeclaration));
			}
		}
		return singleVariableDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleVariableDeclaration_adapted basicGetSingleVariableDeclaration() {
		return singleVariableDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSingleVariableDeclaration(SingleVariableDeclaration_adapted newSingleVariableDeclaration) {
		SingleVariableDeclaration_adapted oldSingleVariableDeclaration = singleVariableDeclaration;
		singleVariableDeclaration = newSingleVariableDeclaration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_adaptedPackage.MODIFIER_ADAPTED_SINGLE_VARIABLE_DECLARATION_ITEM__SINGLE_VARIABLE_DECLARATION, oldSingleVariableDeclaration, singleVariableDeclaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.MODIFIER_ADAPTED_SINGLE_VARIABLE_DECLARATION_ITEM__SINGLE_VARIABLE_DECLARATION:
				if (resolve) return getSingleVariableDeclaration();
				return basicGetSingleVariableDeclaration();
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
			case Java_adaptedPackage.MODIFIER_ADAPTED_SINGLE_VARIABLE_DECLARATION_ITEM__SINGLE_VARIABLE_DECLARATION:
				setSingleVariableDeclaration((SingleVariableDeclaration_adapted)newValue);
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
			case Java_adaptedPackage.MODIFIER_ADAPTED_SINGLE_VARIABLE_DECLARATION_ITEM__SINGLE_VARIABLE_DECLARATION:
				setSingleVariableDeclaration((SingleVariableDeclaration_adapted)null);
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
			case Java_adaptedPackage.MODIFIER_ADAPTED_SINGLE_VARIABLE_DECLARATION_ITEM__SINGLE_VARIABLE_DECLARATION:
				return singleVariableDeclaration != null;
		}
		return super.eIsSet(featureID);
	}

} //Modifier_adapted_singleVariableDeclarationItemImpl
