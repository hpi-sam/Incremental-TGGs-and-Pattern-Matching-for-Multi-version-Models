/**
 */
package de.hpi.sam.classDiagram_adapted.util;

import de.hpi.sam.classDiagram_adapted.*;

import de.mdelab.migmm.history.AttributeWithHistory;
import de.mdelab.migmm.history.ContainmentEdgeWithHistory;
import de.mdelab.migmm.history.EdgeWithHistory;
import de.mdelab.migmm.history.ElementWithHistory;

import de.mdelab.migmm.history.NodeWithHistory;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.hpi.sam.classDiagram_adapted.ClassDiagram_adaptedPackage
 * @generated
 */
public class ClassDiagram_adaptedAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ClassDiagram_adaptedPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDiagram_adaptedAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ClassDiagram_adaptedPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassDiagram_adaptedSwitch<Adapter> modelSwitch =
		new ClassDiagram_adaptedSwitch<Adapter>() {
			@Override
			public Adapter caseUMLAssoc_adapted(UMLAssoc_adapted object) {
				return createUMLAssoc_adaptedAdapter();
			}
			@Override
			public Adapter caseUMLCardinality_adapted(UMLCardinality_adapted object) {
				return createUMLCardinality_adaptedAdapter();
			}
			@Override
			public Adapter caseUMLClassDiagram_adapted(UMLClassDiagram_adapted object) {
				return createUMLClassDiagram_adaptedAdapter();
			}
			@Override
			public Adapter caseUMLClass_adapted(UMLClass_adapted object) {
				return createUMLClass_adaptedAdapter();
			}
			@Override
			public Adapter caseUMLDiagramItem_adapted(UMLDiagramItem_adapted object) {
				return createUMLDiagramItem_adaptedAdapter();
			}
			@Override
			public Adapter caseUMLElement_adapted(UMLElement_adapted object) {
				return createUMLElement_adaptedAdapter();
			}
			@Override
			public Adapter caseUMLIncrement_adapted(UMLIncrement_adapted object) {
				return createUMLIncrement_adaptedAdapter();
			}
			@Override
			public Adapter caseUMLRole_adapted(UMLRole_adapted object) {
				return createUMLRole_adaptedAdapter();
			}
			@Override
			public Adapter caseUMLStereotype_adapted(UMLStereotype_adapted object) {
				return createUMLStereotype_adaptedAdapter();
			}
			@Override
			public Adapter caseUMLAssoc_adapted_leftRoleItem(UMLAssoc_adapted_leftRoleItem object) {
				return createUMLAssoc_adapted_leftRoleItemAdapter();
			}
			@Override
			public Adapter caseUMLAssoc_adapted_rightRoleItem(UMLAssoc_adapted_rightRoleItem object) {
				return createUMLAssoc_adapted_rightRoleItemAdapter();
			}
			@Override
			public Adapter caseUMLCardinality_adapted_cardStringValue(UMLCardinality_adapted_cardStringValue object) {
				return createUMLCardinality_adapted_cardStringValueAdapter();
			}
			@Override
			public Adapter caseUMLCardinality_adapted_revCardItem(UMLCardinality_adapted_revCardItem object) {
				return createUMLCardinality_adapted_revCardItemAdapter();
			}
			@Override
			public Adapter caseUMLClassDiagram_adapted_elementsItem(UMLClassDiagram_adapted_elementsItem object) {
				return createUMLClassDiagram_adapted_elementsItemAdapter();
			}
			@Override
			public Adapter caseUMLClass_adapted_rolesItem(UMLClass_adapted_rolesItem object) {
				return createUMLClass_adapted_rolesItemAdapter();
			}
			@Override
			public Adapter caseUMLElement_adapted_nameValue(UMLElement_adapted_nameValue object) {
				return createUMLElement_adapted_nameValueAdapter();
			}
			@Override
			public Adapter caseUMLElement_adapted_diagramItem(UMLElement_adapted_diagramItem object) {
				return createUMLElement_adapted_diagramItemAdapter();
			}
			@Override
			public Adapter caseUMLIncrement_adapted_stereotypesItem(UMLIncrement_adapted_stereotypesItem object) {
				return createUMLIncrement_adapted_stereotypesItemAdapter();
			}
			@Override
			public Adapter caseUMLRole_adapted_adornmentValue(UMLRole_adapted_adornmentValue object) {
				return createUMLRole_adapted_adornmentValueAdapter();
			}
			@Override
			public Adapter caseUMLRole_adapted_cardItem(UMLRole_adapted_cardItem object) {
				return createUMLRole_adapted_cardItemAdapter();
			}
			@Override
			public Adapter caseUMLRole_adapted_revLeftRoleItem(UMLRole_adapted_revLeftRoleItem object) {
				return createUMLRole_adapted_revLeftRoleItemAdapter();
			}
			@Override
			public Adapter caseUMLRole_adapted_revRightRoleItem(UMLRole_adapted_revRightRoleItem object) {
				return createUMLRole_adapted_revRightRoleItemAdapter();
			}
			@Override
			public Adapter caseUMLRole_adapted_targetItem(UMLRole_adapted_targetItem object) {
				return createUMLRole_adapted_targetItemAdapter();
			}
			@Override
			public Adapter caseUMLStereotype_adapted_textValue(UMLStereotype_adapted_textValue object) {
				return createUMLStereotype_adapted_textValueAdapter();
			}
			@Override
			public Adapter caseUMLStereotype_adapted_incrementItem(UMLStereotype_adapted_incrementItem object) {
				return createUMLStereotype_adapted_incrementItemAdapter();
			}
			@Override
			public Adapter caseElementWithHistory(ElementWithHistory object) {
				return createElementWithHistoryAdapter();
			}
			@Override
			public Adapter caseNodeWithHistory(NodeWithHistory object) {
				return createNodeWithHistoryAdapter();
			}
			@Override
			public Adapter caseEdgeWithHistory(EdgeWithHistory object) {
				return createEdgeWithHistoryAdapter();
			}
			@Override
			public Adapter caseAttributeWithHistory(AttributeWithHistory object) {
				return createAttributeWithHistoryAdapter();
			}
			@Override
			public Adapter caseContainmentEdgeWithHistory(ContainmentEdgeWithHistory object) {
				return createContainmentEdgeWithHistoryAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.hpi.sam.classDiagram_adapted.UMLAssoc_adapted <em>UML Assoc adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hpi.sam.classDiagram_adapted.UMLAssoc_adapted
	 * @generated
	 */
	public Adapter createUMLAssoc_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hpi.sam.classDiagram_adapted.UMLCardinality_adapted <em>UML Cardinality adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hpi.sam.classDiagram_adapted.UMLCardinality_adapted
	 * @generated
	 */
	public Adapter createUMLCardinality_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hpi.sam.classDiagram_adapted.UMLClassDiagram_adapted <em>UML Class Diagram adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hpi.sam.classDiagram_adapted.UMLClassDiagram_adapted
	 * @generated
	 */
	public Adapter createUMLClassDiagram_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hpi.sam.classDiagram_adapted.UMLClass_adapted <em>UML Class adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hpi.sam.classDiagram_adapted.UMLClass_adapted
	 * @generated
	 */
	public Adapter createUMLClass_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hpi.sam.classDiagram_adapted.UMLDiagramItem_adapted <em>UML Diagram Item adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hpi.sam.classDiagram_adapted.UMLDiagramItem_adapted
	 * @generated
	 */
	public Adapter createUMLDiagramItem_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hpi.sam.classDiagram_adapted.UMLElement_adapted <em>UML Element adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hpi.sam.classDiagram_adapted.UMLElement_adapted
	 * @generated
	 */
	public Adapter createUMLElement_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hpi.sam.classDiagram_adapted.UMLIncrement_adapted <em>UML Increment adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hpi.sam.classDiagram_adapted.UMLIncrement_adapted
	 * @generated
	 */
	public Adapter createUMLIncrement_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hpi.sam.classDiagram_adapted.UMLRole_adapted <em>UML Role adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hpi.sam.classDiagram_adapted.UMLRole_adapted
	 * @generated
	 */
	public Adapter createUMLRole_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hpi.sam.classDiagram_adapted.UMLStereotype_adapted <em>UML Stereotype adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hpi.sam.classDiagram_adapted.UMLStereotype_adapted
	 * @generated
	 */
	public Adapter createUMLStereotype_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hpi.sam.classDiagram_adapted.UMLAssoc_adapted_leftRoleItem <em>UML Assoc adapted left Role Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hpi.sam.classDiagram_adapted.UMLAssoc_adapted_leftRoleItem
	 * @generated
	 */
	public Adapter createUMLAssoc_adapted_leftRoleItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hpi.sam.classDiagram_adapted.UMLAssoc_adapted_rightRoleItem <em>UML Assoc adapted right Role Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hpi.sam.classDiagram_adapted.UMLAssoc_adapted_rightRoleItem
	 * @generated
	 */
	public Adapter createUMLAssoc_adapted_rightRoleItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hpi.sam.classDiagram_adapted.UMLCardinality_adapted_cardStringValue <em>UML Cardinality adapted card String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hpi.sam.classDiagram_adapted.UMLCardinality_adapted_cardStringValue
	 * @generated
	 */
	public Adapter createUMLCardinality_adapted_cardStringValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hpi.sam.classDiagram_adapted.UMLCardinality_adapted_revCardItem <em>UML Cardinality adapted rev Card Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hpi.sam.classDiagram_adapted.UMLCardinality_adapted_revCardItem
	 * @generated
	 */
	public Adapter createUMLCardinality_adapted_revCardItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hpi.sam.classDiagram_adapted.UMLClassDiagram_adapted_elementsItem <em>UML Class Diagram adapted elements Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hpi.sam.classDiagram_adapted.UMLClassDiagram_adapted_elementsItem
	 * @generated
	 */
	public Adapter createUMLClassDiagram_adapted_elementsItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hpi.sam.classDiagram_adapted.UMLClass_adapted_rolesItem <em>UML Class adapted roles Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hpi.sam.classDiagram_adapted.UMLClass_adapted_rolesItem
	 * @generated
	 */
	public Adapter createUMLClass_adapted_rolesItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hpi.sam.classDiagram_adapted.UMLElement_adapted_nameValue <em>UML Element adapted name Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hpi.sam.classDiagram_adapted.UMLElement_adapted_nameValue
	 * @generated
	 */
	public Adapter createUMLElement_adapted_nameValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hpi.sam.classDiagram_adapted.UMLElement_adapted_diagramItem <em>UML Element adapted diagram Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hpi.sam.classDiagram_adapted.UMLElement_adapted_diagramItem
	 * @generated
	 */
	public Adapter createUMLElement_adapted_diagramItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hpi.sam.classDiagram_adapted.UMLIncrement_adapted_stereotypesItem <em>UML Increment adapted stereotypes Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hpi.sam.classDiagram_adapted.UMLIncrement_adapted_stereotypesItem
	 * @generated
	 */
	public Adapter createUMLIncrement_adapted_stereotypesItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hpi.sam.classDiagram_adapted.UMLRole_adapted_adornmentValue <em>UML Role adapted adornment Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hpi.sam.classDiagram_adapted.UMLRole_adapted_adornmentValue
	 * @generated
	 */
	public Adapter createUMLRole_adapted_adornmentValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hpi.sam.classDiagram_adapted.UMLRole_adapted_cardItem <em>UML Role adapted card Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hpi.sam.classDiagram_adapted.UMLRole_adapted_cardItem
	 * @generated
	 */
	public Adapter createUMLRole_adapted_cardItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hpi.sam.classDiagram_adapted.UMLRole_adapted_revLeftRoleItem <em>UML Role adapted rev Left Role Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hpi.sam.classDiagram_adapted.UMLRole_adapted_revLeftRoleItem
	 * @generated
	 */
	public Adapter createUMLRole_adapted_revLeftRoleItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hpi.sam.classDiagram_adapted.UMLRole_adapted_revRightRoleItem <em>UML Role adapted rev Right Role Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hpi.sam.classDiagram_adapted.UMLRole_adapted_revRightRoleItem
	 * @generated
	 */
	public Adapter createUMLRole_adapted_revRightRoleItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hpi.sam.classDiagram_adapted.UMLRole_adapted_targetItem <em>UML Role adapted target Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hpi.sam.classDiagram_adapted.UMLRole_adapted_targetItem
	 * @generated
	 */
	public Adapter createUMLRole_adapted_targetItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hpi.sam.classDiagram_adapted.UMLStereotype_adapted_textValue <em>UML Stereotype adapted text Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hpi.sam.classDiagram_adapted.UMLStereotype_adapted_textValue
	 * @generated
	 */
	public Adapter createUMLStereotype_adapted_textValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hpi.sam.classDiagram_adapted.UMLStereotype_adapted_incrementItem <em>UML Stereotype adapted increment Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hpi.sam.classDiagram_adapted.UMLStereotype_adapted_incrementItem
	 * @generated
	 */
	public Adapter createUMLStereotype_adapted_incrementItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.ElementWithHistory <em>Element With History</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.ElementWithHistory
	 * @generated
	 */
	public Adapter createElementWithHistoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.NodeWithHistory <em>Node With History</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.NodeWithHistory
	 * @generated
	 */
	public Adapter createNodeWithHistoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.EdgeWithHistory <em>Edge With History</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.EdgeWithHistory
	 * @generated
	 */
	public Adapter createEdgeWithHistoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.AttributeWithHistory <em>Attribute With History</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.AttributeWithHistory
	 * @generated
	 */
	public Adapter createAttributeWithHistoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.ContainmentEdgeWithHistory <em>Containment Edge With History</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.ContainmentEdgeWithHistory
	 * @generated
	 */
	public Adapter createContainmentEdgeWithHistoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ClassDiagram_adaptedAdapterFactory
