/**
 */
package de.hpi.sam.classDiagram_adapted.impl;

import de.hpi.sam.classDiagram_adapted.ClassDiagram_adaptedPackage;
import de.hpi.sam.classDiagram_adapted.UMLClassDiagram_adapted;
import de.hpi.sam.classDiagram_adapted.UMLElement_adapted_diagramItem;

import de.mdelab.migmm.history.impl.EdgeWithHistoryImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UML Element adapted diagram Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.hpi.sam.classDiagram_adapted.impl.UMLElement_adapted_diagramItemImpl#getDiagram <em>Diagram</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UMLElement_adapted_diagramItemImpl extends EdgeWithHistoryImpl implements UMLElement_adapted_diagramItem {
	/**
	 * The cached value of the '{@link #getDiagram() <em>Diagram</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagram()
	 * @generated
	 * @ordered
	 */
	protected UMLClassDiagram_adapted diagram;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UMLElement_adapted_diagramItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassDiagram_adaptedPackage.Literals.UML_ELEMENT_ADAPTED_DIAGRAM_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UMLClassDiagram_adapted getDiagram() {
		if (diagram != null && diagram.eIsProxy()) {
			InternalEObject oldDiagram = (InternalEObject)diagram;
			diagram = (UMLClassDiagram_adapted)eResolveProxy(oldDiagram);
			if (diagram != oldDiagram) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassDiagram_adaptedPackage.UML_ELEMENT_ADAPTED_DIAGRAM_ITEM__DIAGRAM, oldDiagram, diagram));
			}
		}
		return diagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLClassDiagram_adapted basicGetDiagram() {
		return diagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiagram(UMLClassDiagram_adapted newDiagram) {
		UMLClassDiagram_adapted oldDiagram = diagram;
		diagram = newDiagram;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagram_adaptedPackage.UML_ELEMENT_ADAPTED_DIAGRAM_ITEM__DIAGRAM, oldDiagram, diagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassDiagram_adaptedPackage.UML_ELEMENT_ADAPTED_DIAGRAM_ITEM__DIAGRAM:
				if (resolve) return getDiagram();
				return basicGetDiagram();
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
			case ClassDiagram_adaptedPackage.UML_ELEMENT_ADAPTED_DIAGRAM_ITEM__DIAGRAM:
				setDiagram((UMLClassDiagram_adapted)newValue);
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
			case ClassDiagram_adaptedPackage.UML_ELEMENT_ADAPTED_DIAGRAM_ITEM__DIAGRAM:
				setDiagram((UMLClassDiagram_adapted)null);
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
			case ClassDiagram_adaptedPackage.UML_ELEMENT_ADAPTED_DIAGRAM_ITEM__DIAGRAM:
				return diagram != null;
		}
		return super.eIsSet(featureID);
	}

} //UMLElement_adapted_diagramItemImpl
