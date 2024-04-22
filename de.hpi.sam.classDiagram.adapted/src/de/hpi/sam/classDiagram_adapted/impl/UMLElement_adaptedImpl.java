/**
 */
package de.hpi.sam.classDiagram_adapted.impl;

import de.hpi.sam.classDiagram_adapted.ClassDiagram_adaptedPackage;
import de.hpi.sam.classDiagram_adapted.UMLElement_adapted;
import de.hpi.sam.classDiagram_adapted.UMLElement_adapted_diagramItem;
import de.hpi.sam.classDiagram_adapted.UMLElement_adapted_nameValue;
import de.mdelab.migmm.history.impl.NodeWithHistoryImpl;
import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UML Element adapted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.hpi.sam.classDiagram_adapted.impl.UMLElement_adaptedImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.hpi.sam.classDiagram_adapted.impl.UMLElement_adaptedImpl#getDiagram <em>Diagram</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class UMLElement_adaptedImpl extends NodeWithHistoryImpl implements UMLElement_adapted {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected EList<UMLElement_adapted_nameValue> name;

	/**
	 * The cached value of the '{@link #getDiagram() <em>Diagram</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagram()
	 * @generated
	 * @ordered
	 */
	protected EList<UMLElement_adapted_diagramItem> diagram;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UMLElement_adaptedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassDiagram_adaptedPackage.Literals.UML_ELEMENT_ADAPTED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UMLElement_adapted_nameValue> getName() {
		if (name == null) {
			name = new EObjectResolvingEList<UMLElement_adapted_nameValue>(UMLElement_adapted_nameValue.class, this, ClassDiagram_adaptedPackage.UML_ELEMENT_ADAPTED__NAME);
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UMLElement_adapted_diagramItem> getDiagram() {
		if (diagram == null) {
			diagram = new EObjectResolvingEList<UMLElement_adapted_diagramItem>(UMLElement_adapted_diagramItem.class, this, ClassDiagram_adaptedPackage.UML_ELEMENT_ADAPTED__DIAGRAM);
		}
		return diagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassDiagram_adaptedPackage.UML_ELEMENT_ADAPTED__NAME:
				return getName();
			case ClassDiagram_adaptedPackage.UML_ELEMENT_ADAPTED__DIAGRAM:
				return getDiagram();
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
			case ClassDiagram_adaptedPackage.UML_ELEMENT_ADAPTED__NAME:
				getName().clear();
				getName().addAll((Collection<? extends UMLElement_adapted_nameValue>)newValue);
				return;
			case ClassDiagram_adaptedPackage.UML_ELEMENT_ADAPTED__DIAGRAM:
				getDiagram().clear();
				getDiagram().addAll((Collection<? extends UMLElement_adapted_diagramItem>)newValue);
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
			case ClassDiagram_adaptedPackage.UML_ELEMENT_ADAPTED__NAME:
				getName().clear();
				return;
			case ClassDiagram_adaptedPackage.UML_ELEMENT_ADAPTED__DIAGRAM:
				getDiagram().clear();
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
			case ClassDiagram_adaptedPackage.UML_ELEMENT_ADAPTED__NAME:
				return name != null && !name.isEmpty();
			case ClassDiagram_adaptedPackage.UML_ELEMENT_ADAPTED__DIAGRAM:
				return diagram != null && !diagram.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UMLElement_adaptedImpl
