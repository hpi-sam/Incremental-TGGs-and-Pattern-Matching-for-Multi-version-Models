/**
 */
package de.hpi.sam.classDiagram_adapted.impl;

import de.hpi.sam.classDiagram_adapted.ClassDiagram_adaptedPackage;
import de.hpi.sam.classDiagram_adapted.UMLIncrement_adapted_stereotypesItem;
import de.hpi.sam.classDiagram_adapted.UMLStereotype_adapted;

import de.mdelab.migmm.history.impl.EdgeWithHistoryImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UML Increment adapted stereotypes Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.hpi.sam.classDiagram_adapted.impl.UMLIncrement_adapted_stereotypesItemImpl#getStereotypes <em>Stereotypes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UMLIncrement_adapted_stereotypesItemImpl extends EdgeWithHistoryImpl implements UMLIncrement_adapted_stereotypesItem {
	/**
	 * The cached value of the '{@link #getStereotypes() <em>Stereotypes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStereotypes()
	 * @generated
	 * @ordered
	 */
	protected UMLStereotype_adapted stereotypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UMLIncrement_adapted_stereotypesItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassDiagram_adaptedPackage.Literals.UML_INCREMENT_ADAPTED_STEREOTYPES_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UMLStereotype_adapted getStereotypes() {
		if (stereotypes != null && stereotypes.eIsProxy()) {
			InternalEObject oldStereotypes = (InternalEObject)stereotypes;
			stereotypes = (UMLStereotype_adapted)eResolveProxy(oldStereotypes);
			if (stereotypes != oldStereotypes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassDiagram_adaptedPackage.UML_INCREMENT_ADAPTED_STEREOTYPES_ITEM__STEREOTYPES, oldStereotypes, stereotypes));
			}
		}
		return stereotypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLStereotype_adapted basicGetStereotypes() {
		return stereotypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStereotypes(UMLStereotype_adapted newStereotypes) {
		UMLStereotype_adapted oldStereotypes = stereotypes;
		stereotypes = newStereotypes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagram_adaptedPackage.UML_INCREMENT_ADAPTED_STEREOTYPES_ITEM__STEREOTYPES, oldStereotypes, stereotypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassDiagram_adaptedPackage.UML_INCREMENT_ADAPTED_STEREOTYPES_ITEM__STEREOTYPES:
				if (resolve) return getStereotypes();
				return basicGetStereotypes();
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
			case ClassDiagram_adaptedPackage.UML_INCREMENT_ADAPTED_STEREOTYPES_ITEM__STEREOTYPES:
				setStereotypes((UMLStereotype_adapted)newValue);
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
			case ClassDiagram_adaptedPackage.UML_INCREMENT_ADAPTED_STEREOTYPES_ITEM__STEREOTYPES:
				setStereotypes((UMLStereotype_adapted)null);
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
			case ClassDiagram_adaptedPackage.UML_INCREMENT_ADAPTED_STEREOTYPES_ITEM__STEREOTYPES:
				return stereotypes != null;
		}
		return super.eIsSet(featureID);
	}

} //UMLIncrement_adapted_stereotypesItemImpl
