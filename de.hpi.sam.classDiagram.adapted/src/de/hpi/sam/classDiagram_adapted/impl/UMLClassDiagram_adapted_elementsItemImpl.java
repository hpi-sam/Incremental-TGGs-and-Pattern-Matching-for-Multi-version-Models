/**
 */
package de.hpi.sam.classDiagram_adapted.impl;

import de.hpi.sam.classDiagram_adapted.ClassDiagram_adaptedPackage;
import de.hpi.sam.classDiagram_adapted.UMLClassDiagram_adapted_elementsItem;
import de.hpi.sam.classDiagram_adapted.UMLElement_adapted;

import de.mdelab.migmm.history.impl.ContainmentEdgeWithHistoryImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UML Class Diagram adapted elements Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.hpi.sam.classDiagram_adapted.impl.UMLClassDiagram_adapted_elementsItemImpl#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UMLClassDiagram_adapted_elementsItemImpl extends ContainmentEdgeWithHistoryImpl implements UMLClassDiagram_adapted_elementsItem {
	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected UMLElement_adapted elements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UMLClassDiagram_adapted_elementsItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassDiagram_adaptedPackage.Literals.UML_CLASS_DIAGRAM_ADAPTED_ELEMENTS_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UMLElement_adapted getElements() {
		if (elements != null && elements.eIsProxy()) {
			InternalEObject oldElements = (InternalEObject)elements;
			elements = (UMLElement_adapted)eResolveProxy(oldElements);
			if (elements != oldElements) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassDiagram_adaptedPackage.UML_CLASS_DIAGRAM_ADAPTED_ELEMENTS_ITEM__ELEMENTS, oldElements, elements));
			}
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLElement_adapted basicGetElements() {
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElements(UMLElement_adapted newElements) {
		UMLElement_adapted oldElements = elements;
		elements = newElements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagram_adaptedPackage.UML_CLASS_DIAGRAM_ADAPTED_ELEMENTS_ITEM__ELEMENTS, oldElements, elements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassDiagram_adaptedPackage.UML_CLASS_DIAGRAM_ADAPTED_ELEMENTS_ITEM__ELEMENTS:
				if (resolve) return getElements();
				return basicGetElements();
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
			case ClassDiagram_adaptedPackage.UML_CLASS_DIAGRAM_ADAPTED_ELEMENTS_ITEM__ELEMENTS:
				setElements((UMLElement_adapted)newValue);
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
			case ClassDiagram_adaptedPackage.UML_CLASS_DIAGRAM_ADAPTED_ELEMENTS_ITEM__ELEMENTS:
				setElements((UMLElement_adapted)null);
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
			case ClassDiagram_adaptedPackage.UML_CLASS_DIAGRAM_ADAPTED_ELEMENTS_ITEM__ELEMENTS:
				return elements != null;
		}
		return super.eIsSet(featureID);
	}

} //UMLClassDiagram_adapted_elementsItemImpl
