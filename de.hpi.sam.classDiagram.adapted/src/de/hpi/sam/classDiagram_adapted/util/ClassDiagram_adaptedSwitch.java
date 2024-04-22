/**
 */
package de.hpi.sam.classDiagram_adapted.util;

import de.hpi.sam.classDiagram_adapted.*;

import de.mdelab.migmm.history.AttributeWithHistory;
import de.mdelab.migmm.history.ContainmentEdgeWithHistory;
import de.mdelab.migmm.history.EdgeWithHistory;
import de.mdelab.migmm.history.ElementWithHistory;

import de.mdelab.migmm.history.NodeWithHistory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.hpi.sam.classDiagram_adapted.ClassDiagram_adaptedPackage
 * @generated
 */
public class ClassDiagram_adaptedSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ClassDiagram_adaptedPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDiagram_adaptedSwitch() {
		if (modelPackage == null) {
			modelPackage = ClassDiagram_adaptedPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ClassDiagram_adaptedPackage.UML_ASSOC_ADAPTED: {
				UMLAssoc_adapted umlAssoc_adapted = (UMLAssoc_adapted)theEObject;
				T result = caseUMLAssoc_adapted(umlAssoc_adapted);
				if (result == null) result = caseUMLDiagramItem_adapted(umlAssoc_adapted);
				if (result == null) result = caseUMLIncrement_adapted(umlAssoc_adapted);
				if (result == null) result = caseUMLElement_adapted(umlAssoc_adapted);
				if (result == null) result = caseNodeWithHistory(umlAssoc_adapted);
				if (result == null) result = caseElementWithHistory(umlAssoc_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagram_adaptedPackage.UML_CARDINALITY_ADAPTED: {
				UMLCardinality_adapted umlCardinality_adapted = (UMLCardinality_adapted)theEObject;
				T result = caseUMLCardinality_adapted(umlCardinality_adapted);
				if (result == null) result = caseUMLIncrement_adapted(umlCardinality_adapted);
				if (result == null) result = caseUMLElement_adapted(umlCardinality_adapted);
				if (result == null) result = caseNodeWithHistory(umlCardinality_adapted);
				if (result == null) result = caseElementWithHistory(umlCardinality_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagram_adaptedPackage.UML_CLASS_DIAGRAM_ADAPTED: {
				UMLClassDiagram_adapted umlClassDiagram_adapted = (UMLClassDiagram_adapted)theEObject;
				T result = caseUMLClassDiagram_adapted(umlClassDiagram_adapted);
				if (result == null) result = caseUMLElement_adapted(umlClassDiagram_adapted);
				if (result == null) result = caseNodeWithHistory(umlClassDiagram_adapted);
				if (result == null) result = caseElementWithHistory(umlClassDiagram_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagram_adaptedPackage.UML_CLASS_ADAPTED: {
				UMLClass_adapted umlClass_adapted = (UMLClass_adapted)theEObject;
				T result = caseUMLClass_adapted(umlClass_adapted);
				if (result == null) result = caseUMLDiagramItem_adapted(umlClass_adapted);
				if (result == null) result = caseUMLIncrement_adapted(umlClass_adapted);
				if (result == null) result = caseUMLElement_adapted(umlClass_adapted);
				if (result == null) result = caseNodeWithHistory(umlClass_adapted);
				if (result == null) result = caseElementWithHistory(umlClass_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagram_adaptedPackage.UML_DIAGRAM_ITEM_ADAPTED: {
				UMLDiagramItem_adapted umlDiagramItem_adapted = (UMLDiagramItem_adapted)theEObject;
				T result = caseUMLDiagramItem_adapted(umlDiagramItem_adapted);
				if (result == null) result = caseUMLIncrement_adapted(umlDiagramItem_adapted);
				if (result == null) result = caseUMLElement_adapted(umlDiagramItem_adapted);
				if (result == null) result = caseNodeWithHistory(umlDiagramItem_adapted);
				if (result == null) result = caseElementWithHistory(umlDiagramItem_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagram_adaptedPackage.UML_ELEMENT_ADAPTED: {
				UMLElement_adapted umlElement_adapted = (UMLElement_adapted)theEObject;
				T result = caseUMLElement_adapted(umlElement_adapted);
				if (result == null) result = caseNodeWithHistory(umlElement_adapted);
				if (result == null) result = caseElementWithHistory(umlElement_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagram_adaptedPackage.UML_INCREMENT_ADAPTED: {
				UMLIncrement_adapted umlIncrement_adapted = (UMLIncrement_adapted)theEObject;
				T result = caseUMLIncrement_adapted(umlIncrement_adapted);
				if (result == null) result = caseUMLElement_adapted(umlIncrement_adapted);
				if (result == null) result = caseNodeWithHistory(umlIncrement_adapted);
				if (result == null) result = caseElementWithHistory(umlIncrement_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagram_adaptedPackage.UML_ROLE_ADAPTED: {
				UMLRole_adapted umlRole_adapted = (UMLRole_adapted)theEObject;
				T result = caseUMLRole_adapted(umlRole_adapted);
				if (result == null) result = caseUMLIncrement_adapted(umlRole_adapted);
				if (result == null) result = caseUMLElement_adapted(umlRole_adapted);
				if (result == null) result = caseNodeWithHistory(umlRole_adapted);
				if (result == null) result = caseElementWithHistory(umlRole_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagram_adaptedPackage.UML_STEREOTYPE_ADAPTED: {
				UMLStereotype_adapted umlStereotype_adapted = (UMLStereotype_adapted)theEObject;
				T result = caseUMLStereotype_adapted(umlStereotype_adapted);
				if (result == null) result = caseUMLIncrement_adapted(umlStereotype_adapted);
				if (result == null) result = caseUMLElement_adapted(umlStereotype_adapted);
				if (result == null) result = caseNodeWithHistory(umlStereotype_adapted);
				if (result == null) result = caseElementWithHistory(umlStereotype_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagram_adaptedPackage.UML_ASSOC_ADAPTED_LEFT_ROLE_ITEM: {
				UMLAssoc_adapted_leftRoleItem umlAssoc_adapted_leftRoleItem = (UMLAssoc_adapted_leftRoleItem)theEObject;
				T result = caseUMLAssoc_adapted_leftRoleItem(umlAssoc_adapted_leftRoleItem);
				if (result == null) result = caseEdgeWithHistory(umlAssoc_adapted_leftRoleItem);
				if (result == null) result = caseElementWithHistory(umlAssoc_adapted_leftRoleItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagram_adaptedPackage.UML_ASSOC_ADAPTED_RIGHT_ROLE_ITEM: {
				UMLAssoc_adapted_rightRoleItem umlAssoc_adapted_rightRoleItem = (UMLAssoc_adapted_rightRoleItem)theEObject;
				T result = caseUMLAssoc_adapted_rightRoleItem(umlAssoc_adapted_rightRoleItem);
				if (result == null) result = caseEdgeWithHistory(umlAssoc_adapted_rightRoleItem);
				if (result == null) result = caseElementWithHistory(umlAssoc_adapted_rightRoleItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagram_adaptedPackage.UML_CARDINALITY_ADAPTED_CARD_STRING_VALUE: {
				UMLCardinality_adapted_cardStringValue umlCardinality_adapted_cardStringValue = (UMLCardinality_adapted_cardStringValue)theEObject;
				T result = caseUMLCardinality_adapted_cardStringValue(umlCardinality_adapted_cardStringValue);
				if (result == null) result = caseAttributeWithHistory(umlCardinality_adapted_cardStringValue);
				if (result == null) result = caseElementWithHistory(umlCardinality_adapted_cardStringValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagram_adaptedPackage.UML_CARDINALITY_ADAPTED_REV_CARD_ITEM: {
				UMLCardinality_adapted_revCardItem umlCardinality_adapted_revCardItem = (UMLCardinality_adapted_revCardItem)theEObject;
				T result = caseUMLCardinality_adapted_revCardItem(umlCardinality_adapted_revCardItem);
				if (result == null) result = caseEdgeWithHistory(umlCardinality_adapted_revCardItem);
				if (result == null) result = caseElementWithHistory(umlCardinality_adapted_revCardItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagram_adaptedPackage.UML_CLASS_DIAGRAM_ADAPTED_ELEMENTS_ITEM: {
				UMLClassDiagram_adapted_elementsItem umlClassDiagram_adapted_elementsItem = (UMLClassDiagram_adapted_elementsItem)theEObject;
				T result = caseUMLClassDiagram_adapted_elementsItem(umlClassDiagram_adapted_elementsItem);
				if (result == null) result = caseContainmentEdgeWithHistory(umlClassDiagram_adapted_elementsItem);
				if (result == null) result = caseEdgeWithHistory(umlClassDiagram_adapted_elementsItem);
				if (result == null) result = caseElementWithHistory(umlClassDiagram_adapted_elementsItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagram_adaptedPackage.UML_CLASS_ADAPTED_ROLES_ITEM: {
				UMLClass_adapted_rolesItem umlClass_adapted_rolesItem = (UMLClass_adapted_rolesItem)theEObject;
				T result = caseUMLClass_adapted_rolesItem(umlClass_adapted_rolesItem);
				if (result == null) result = caseEdgeWithHistory(umlClass_adapted_rolesItem);
				if (result == null) result = caseElementWithHistory(umlClass_adapted_rolesItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagram_adaptedPackage.UML_ELEMENT_ADAPTED_NAME_VALUE: {
				UMLElement_adapted_nameValue umlElement_adapted_nameValue = (UMLElement_adapted_nameValue)theEObject;
				T result = caseUMLElement_adapted_nameValue(umlElement_adapted_nameValue);
				if (result == null) result = caseAttributeWithHistory(umlElement_adapted_nameValue);
				if (result == null) result = caseElementWithHistory(umlElement_adapted_nameValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagram_adaptedPackage.UML_ELEMENT_ADAPTED_DIAGRAM_ITEM: {
				UMLElement_adapted_diagramItem umlElement_adapted_diagramItem = (UMLElement_adapted_diagramItem)theEObject;
				T result = caseUMLElement_adapted_diagramItem(umlElement_adapted_diagramItem);
				if (result == null) result = caseEdgeWithHistory(umlElement_adapted_diagramItem);
				if (result == null) result = caseElementWithHistory(umlElement_adapted_diagramItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagram_adaptedPackage.UML_INCREMENT_ADAPTED_STEREOTYPES_ITEM: {
				UMLIncrement_adapted_stereotypesItem umlIncrement_adapted_stereotypesItem = (UMLIncrement_adapted_stereotypesItem)theEObject;
				T result = caseUMLIncrement_adapted_stereotypesItem(umlIncrement_adapted_stereotypesItem);
				if (result == null) result = caseEdgeWithHistory(umlIncrement_adapted_stereotypesItem);
				if (result == null) result = caseElementWithHistory(umlIncrement_adapted_stereotypesItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagram_adaptedPackage.UML_ROLE_ADAPTED_ADORNMENT_VALUE: {
				UMLRole_adapted_adornmentValue umlRole_adapted_adornmentValue = (UMLRole_adapted_adornmentValue)theEObject;
				T result = caseUMLRole_adapted_adornmentValue(umlRole_adapted_adornmentValue);
				if (result == null) result = caseAttributeWithHistory(umlRole_adapted_adornmentValue);
				if (result == null) result = caseElementWithHistory(umlRole_adapted_adornmentValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagram_adaptedPackage.UML_ROLE_ADAPTED_CARD_ITEM: {
				UMLRole_adapted_cardItem umlRole_adapted_cardItem = (UMLRole_adapted_cardItem)theEObject;
				T result = caseUMLRole_adapted_cardItem(umlRole_adapted_cardItem);
				if (result == null) result = caseEdgeWithHistory(umlRole_adapted_cardItem);
				if (result == null) result = caseElementWithHistory(umlRole_adapted_cardItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagram_adaptedPackage.UML_ROLE_ADAPTED_REV_LEFT_ROLE_ITEM: {
				UMLRole_adapted_revLeftRoleItem umlRole_adapted_revLeftRoleItem = (UMLRole_adapted_revLeftRoleItem)theEObject;
				T result = caseUMLRole_adapted_revLeftRoleItem(umlRole_adapted_revLeftRoleItem);
				if (result == null) result = caseEdgeWithHistory(umlRole_adapted_revLeftRoleItem);
				if (result == null) result = caseElementWithHistory(umlRole_adapted_revLeftRoleItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagram_adaptedPackage.UML_ROLE_ADAPTED_REV_RIGHT_ROLE_ITEM: {
				UMLRole_adapted_revRightRoleItem umlRole_adapted_revRightRoleItem = (UMLRole_adapted_revRightRoleItem)theEObject;
				T result = caseUMLRole_adapted_revRightRoleItem(umlRole_adapted_revRightRoleItem);
				if (result == null) result = caseEdgeWithHistory(umlRole_adapted_revRightRoleItem);
				if (result == null) result = caseElementWithHistory(umlRole_adapted_revRightRoleItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagram_adaptedPackage.UML_ROLE_ADAPTED_TARGET_ITEM: {
				UMLRole_adapted_targetItem umlRole_adapted_targetItem = (UMLRole_adapted_targetItem)theEObject;
				T result = caseUMLRole_adapted_targetItem(umlRole_adapted_targetItem);
				if (result == null) result = caseEdgeWithHistory(umlRole_adapted_targetItem);
				if (result == null) result = caseElementWithHistory(umlRole_adapted_targetItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagram_adaptedPackage.UML_STEREOTYPE_ADAPTED_TEXT_VALUE: {
				UMLStereotype_adapted_textValue umlStereotype_adapted_textValue = (UMLStereotype_adapted_textValue)theEObject;
				T result = caseUMLStereotype_adapted_textValue(umlStereotype_adapted_textValue);
				if (result == null) result = caseAttributeWithHistory(umlStereotype_adapted_textValue);
				if (result == null) result = caseElementWithHistory(umlStereotype_adapted_textValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagram_adaptedPackage.UML_STEREOTYPE_ADAPTED_INCREMENT_ITEM: {
				UMLStereotype_adapted_incrementItem umlStereotype_adapted_incrementItem = (UMLStereotype_adapted_incrementItem)theEObject;
				T result = caseUMLStereotype_adapted_incrementItem(umlStereotype_adapted_incrementItem);
				if (result == null) result = caseEdgeWithHistory(umlStereotype_adapted_incrementItem);
				if (result == null) result = caseElementWithHistory(umlStereotype_adapted_incrementItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UML Assoc adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UML Assoc adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLAssoc_adapted(UMLAssoc_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UML Cardinality adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UML Cardinality adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLCardinality_adapted(UMLCardinality_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UML Class Diagram adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UML Class Diagram adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLClassDiagram_adapted(UMLClassDiagram_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UML Class adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UML Class adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLClass_adapted(UMLClass_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UML Diagram Item adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UML Diagram Item adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLDiagramItem_adapted(UMLDiagramItem_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UML Element adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UML Element adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLElement_adapted(UMLElement_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UML Increment adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UML Increment adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLIncrement_adapted(UMLIncrement_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UML Role adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UML Role adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLRole_adapted(UMLRole_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UML Stereotype adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UML Stereotype adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLStereotype_adapted(UMLStereotype_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UML Assoc adapted left Role Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UML Assoc adapted left Role Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLAssoc_adapted_leftRoleItem(UMLAssoc_adapted_leftRoleItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UML Assoc adapted right Role Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UML Assoc adapted right Role Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLAssoc_adapted_rightRoleItem(UMLAssoc_adapted_rightRoleItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UML Cardinality adapted card String Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UML Cardinality adapted card String Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLCardinality_adapted_cardStringValue(UMLCardinality_adapted_cardStringValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UML Cardinality adapted rev Card Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UML Cardinality adapted rev Card Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLCardinality_adapted_revCardItem(UMLCardinality_adapted_revCardItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UML Class Diagram adapted elements Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UML Class Diagram adapted elements Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLClassDiagram_adapted_elementsItem(UMLClassDiagram_adapted_elementsItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UML Class adapted roles Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UML Class adapted roles Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLClass_adapted_rolesItem(UMLClass_adapted_rolesItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UML Element adapted name Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UML Element adapted name Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLElement_adapted_nameValue(UMLElement_adapted_nameValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UML Element adapted diagram Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UML Element adapted diagram Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLElement_adapted_diagramItem(UMLElement_adapted_diagramItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UML Increment adapted stereotypes Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UML Increment adapted stereotypes Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLIncrement_adapted_stereotypesItem(UMLIncrement_adapted_stereotypesItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UML Role adapted adornment Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UML Role adapted adornment Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLRole_adapted_adornmentValue(UMLRole_adapted_adornmentValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UML Role adapted card Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UML Role adapted card Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLRole_adapted_cardItem(UMLRole_adapted_cardItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UML Role adapted rev Left Role Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UML Role adapted rev Left Role Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLRole_adapted_revLeftRoleItem(UMLRole_adapted_revLeftRoleItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UML Role adapted rev Right Role Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UML Role adapted rev Right Role Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLRole_adapted_revRightRoleItem(UMLRole_adapted_revRightRoleItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UML Role adapted target Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UML Role adapted target Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLRole_adapted_targetItem(UMLRole_adapted_targetItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UML Stereotype adapted text Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UML Stereotype adapted text Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLStereotype_adapted_textValue(UMLStereotype_adapted_textValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UML Stereotype adapted increment Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UML Stereotype adapted increment Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLStereotype_adapted_incrementItem(UMLStereotype_adapted_incrementItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element With History</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element With History</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementWithHistory(ElementWithHistory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node With History</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node With History</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeWithHistory(NodeWithHistory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edge With History</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edge With History</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEdgeWithHistory(EdgeWithHistory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute With History</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute With History</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeWithHistory(AttributeWithHistory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Containment Edge With History</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Containment Edge With History</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainmentEdgeWithHistory(ContainmentEdgeWithHistory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ClassDiagram_adaptedSwitch
