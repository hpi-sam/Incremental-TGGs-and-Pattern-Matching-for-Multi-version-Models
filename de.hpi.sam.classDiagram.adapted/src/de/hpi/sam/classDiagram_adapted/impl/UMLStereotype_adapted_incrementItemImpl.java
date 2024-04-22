/**
 */
package de.hpi.sam.classDiagram_adapted.impl;

import de.hpi.sam.classDiagram_adapted.ClassDiagram_adaptedPackage;
import de.hpi.sam.classDiagram_adapted.UMLIncrement_adapted;
import de.hpi.sam.classDiagram_adapted.UMLStereotype_adapted_incrementItem;

import de.mdelab.migmm.history.impl.EdgeWithHistoryImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UML Stereotype adapted increment Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.hpi.sam.classDiagram_adapted.impl.UMLStereotype_adapted_incrementItemImpl#getIncrement <em>Increment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UMLStereotype_adapted_incrementItemImpl extends EdgeWithHistoryImpl implements UMLStereotype_adapted_incrementItem {
	/**
	 * The cached value of the '{@link #getIncrement() <em>Increment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrement()
	 * @generated
	 * @ordered
	 */
	protected UMLIncrement_adapted increment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UMLStereotype_adapted_incrementItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassDiagram_adaptedPackage.Literals.UML_STEREOTYPE_ADAPTED_INCREMENT_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UMLIncrement_adapted getIncrement() {
		if (increment != null && increment.eIsProxy()) {
			InternalEObject oldIncrement = (InternalEObject)increment;
			increment = (UMLIncrement_adapted)eResolveProxy(oldIncrement);
			if (increment != oldIncrement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassDiagram_adaptedPackage.UML_STEREOTYPE_ADAPTED_INCREMENT_ITEM__INCREMENT, oldIncrement, increment));
			}
		}
		return increment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLIncrement_adapted basicGetIncrement() {
		return increment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncrement(UMLIncrement_adapted newIncrement) {
		UMLIncrement_adapted oldIncrement = increment;
		increment = newIncrement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagram_adaptedPackage.UML_STEREOTYPE_ADAPTED_INCREMENT_ITEM__INCREMENT, oldIncrement, increment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassDiagram_adaptedPackage.UML_STEREOTYPE_ADAPTED_INCREMENT_ITEM__INCREMENT:
				if (resolve) return getIncrement();
				return basicGetIncrement();
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
			case ClassDiagram_adaptedPackage.UML_STEREOTYPE_ADAPTED_INCREMENT_ITEM__INCREMENT:
				setIncrement((UMLIncrement_adapted)newValue);
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
			case ClassDiagram_adaptedPackage.UML_STEREOTYPE_ADAPTED_INCREMENT_ITEM__INCREMENT:
				setIncrement((UMLIncrement_adapted)null);
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
			case ClassDiagram_adaptedPackage.UML_STEREOTYPE_ADAPTED_INCREMENT_ITEM__INCREMENT:
				return increment != null;
		}
		return super.eIsSet(featureID);
	}

} //UMLStereotype_adapted_incrementItemImpl
