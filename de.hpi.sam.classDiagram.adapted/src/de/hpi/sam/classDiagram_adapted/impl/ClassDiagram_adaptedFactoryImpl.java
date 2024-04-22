/**
 */
package de.hpi.sam.classDiagram_adapted.impl;

import de.hpi.sam.classDiagram_adapted.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassDiagram_adaptedFactoryImpl extends EFactoryImpl implements ClassDiagram_adaptedFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ClassDiagram_adaptedFactory init() {
		try {
			ClassDiagram_adaptedFactory theClassDiagram_adaptedFactory = (ClassDiagram_adaptedFactory)EPackage.Registry.INSTANCE.getEFactory(ClassDiagram_adaptedPackage.eNS_URI);
			if (theClassDiagram_adaptedFactory != null) {
				return theClassDiagram_adaptedFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ClassDiagram_adaptedFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDiagram_adaptedFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ClassDiagram_adaptedPackage.UML_ASSOC_ADAPTED: return createUMLAssoc_adapted();
			case ClassDiagram_adaptedPackage.UML_CARDINALITY_ADAPTED: return createUMLCardinality_adapted();
			case ClassDiagram_adaptedPackage.UML_CLASS_DIAGRAM_ADAPTED: return createUMLClassDiagram_adapted();
			case ClassDiagram_adaptedPackage.UML_CLASS_ADAPTED: return createUMLClass_adapted();
			case ClassDiagram_adaptedPackage.UML_ROLE_ADAPTED: return createUMLRole_adapted();
			case ClassDiagram_adaptedPackage.UML_STEREOTYPE_ADAPTED: return createUMLStereotype_adapted();
			case ClassDiagram_adaptedPackage.UML_ASSOC_ADAPTED_LEFT_ROLE_ITEM: return createUMLAssoc_adapted_leftRoleItem();
			case ClassDiagram_adaptedPackage.UML_ASSOC_ADAPTED_RIGHT_ROLE_ITEM: return createUMLAssoc_adapted_rightRoleItem();
			case ClassDiagram_adaptedPackage.UML_CARDINALITY_ADAPTED_CARD_STRING_VALUE: return createUMLCardinality_adapted_cardStringValue();
			case ClassDiagram_adaptedPackage.UML_CARDINALITY_ADAPTED_REV_CARD_ITEM: return createUMLCardinality_adapted_revCardItem();
			case ClassDiagram_adaptedPackage.UML_CLASS_DIAGRAM_ADAPTED_ELEMENTS_ITEM: return createUMLClassDiagram_adapted_elementsItem();
			case ClassDiagram_adaptedPackage.UML_CLASS_ADAPTED_ROLES_ITEM: return createUMLClass_adapted_rolesItem();
			case ClassDiagram_adaptedPackage.UML_ELEMENT_ADAPTED_NAME_VALUE: return createUMLElement_adapted_nameValue();
			case ClassDiagram_adaptedPackage.UML_ELEMENT_ADAPTED_DIAGRAM_ITEM: return createUMLElement_adapted_diagramItem();
			case ClassDiagram_adaptedPackage.UML_INCREMENT_ADAPTED_STEREOTYPES_ITEM: return createUMLIncrement_adapted_stereotypesItem();
			case ClassDiagram_adaptedPackage.UML_ROLE_ADAPTED_ADORNMENT_VALUE: return createUMLRole_adapted_adornmentValue();
			case ClassDiagram_adaptedPackage.UML_ROLE_ADAPTED_CARD_ITEM: return createUMLRole_adapted_cardItem();
			case ClassDiagram_adaptedPackage.UML_ROLE_ADAPTED_REV_LEFT_ROLE_ITEM: return createUMLRole_adapted_revLeftRoleItem();
			case ClassDiagram_adaptedPackage.UML_ROLE_ADAPTED_REV_RIGHT_ROLE_ITEM: return createUMLRole_adapted_revRightRoleItem();
			case ClassDiagram_adaptedPackage.UML_ROLE_ADAPTED_TARGET_ITEM: return createUMLRole_adapted_targetItem();
			case ClassDiagram_adaptedPackage.UML_STEREOTYPE_ADAPTED_TEXT_VALUE: return createUMLStereotype_adapted_textValue();
			case ClassDiagram_adaptedPackage.UML_STEREOTYPE_ADAPTED_INCREMENT_ITEM: return createUMLStereotype_adapted_incrementItem();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UMLAssoc_adapted createUMLAssoc_adapted() {
		UMLAssoc_adaptedImpl umlAssoc_adapted = new UMLAssoc_adaptedImpl();
		return umlAssoc_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UMLCardinality_adapted createUMLCardinality_adapted() {
		UMLCardinality_adaptedImpl umlCardinality_adapted = new UMLCardinality_adaptedImpl();
		return umlCardinality_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UMLClassDiagram_adapted createUMLClassDiagram_adapted() {
		UMLClassDiagram_adaptedImpl umlClassDiagram_adapted = new UMLClassDiagram_adaptedImpl();
		return umlClassDiagram_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UMLClass_adapted createUMLClass_adapted() {
		UMLClass_adaptedImpl umlClass_adapted = new UMLClass_adaptedImpl();
		return umlClass_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UMLRole_adapted createUMLRole_adapted() {
		UMLRole_adaptedImpl umlRole_adapted = new UMLRole_adaptedImpl();
		return umlRole_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UMLStereotype_adapted createUMLStereotype_adapted() {
		UMLStereotype_adaptedImpl umlStereotype_adapted = new UMLStereotype_adaptedImpl();
		return umlStereotype_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UMLAssoc_adapted_leftRoleItem createUMLAssoc_adapted_leftRoleItem() {
		UMLAssoc_adapted_leftRoleItemImpl umlAssoc_adapted_leftRoleItem = new UMLAssoc_adapted_leftRoleItemImpl();
		return umlAssoc_adapted_leftRoleItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UMLAssoc_adapted_rightRoleItem createUMLAssoc_adapted_rightRoleItem() {
		UMLAssoc_adapted_rightRoleItemImpl umlAssoc_adapted_rightRoleItem = new UMLAssoc_adapted_rightRoleItemImpl();
		return umlAssoc_adapted_rightRoleItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UMLCardinality_adapted_cardStringValue createUMLCardinality_adapted_cardStringValue() {
		UMLCardinality_adapted_cardStringValueImpl umlCardinality_adapted_cardStringValue = new UMLCardinality_adapted_cardStringValueImpl();
		return umlCardinality_adapted_cardStringValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UMLCardinality_adapted_revCardItem createUMLCardinality_adapted_revCardItem() {
		UMLCardinality_adapted_revCardItemImpl umlCardinality_adapted_revCardItem = new UMLCardinality_adapted_revCardItemImpl();
		return umlCardinality_adapted_revCardItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UMLClassDiagram_adapted_elementsItem createUMLClassDiagram_adapted_elementsItem() {
		UMLClassDiagram_adapted_elementsItemImpl umlClassDiagram_adapted_elementsItem = new UMLClassDiagram_adapted_elementsItemImpl();
		return umlClassDiagram_adapted_elementsItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UMLClass_adapted_rolesItem createUMLClass_adapted_rolesItem() {
		UMLClass_adapted_rolesItemImpl umlClass_adapted_rolesItem = new UMLClass_adapted_rolesItemImpl();
		return umlClass_adapted_rolesItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UMLElement_adapted_nameValue createUMLElement_adapted_nameValue() {
		UMLElement_adapted_nameValueImpl umlElement_adapted_nameValue = new UMLElement_adapted_nameValueImpl();
		return umlElement_adapted_nameValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UMLElement_adapted_diagramItem createUMLElement_adapted_diagramItem() {
		UMLElement_adapted_diagramItemImpl umlElement_adapted_diagramItem = new UMLElement_adapted_diagramItemImpl();
		return umlElement_adapted_diagramItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UMLIncrement_adapted_stereotypesItem createUMLIncrement_adapted_stereotypesItem() {
		UMLIncrement_adapted_stereotypesItemImpl umlIncrement_adapted_stereotypesItem = new UMLIncrement_adapted_stereotypesItemImpl();
		return umlIncrement_adapted_stereotypesItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UMLRole_adapted_adornmentValue createUMLRole_adapted_adornmentValue() {
		UMLRole_adapted_adornmentValueImpl umlRole_adapted_adornmentValue = new UMLRole_adapted_adornmentValueImpl();
		return umlRole_adapted_adornmentValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UMLRole_adapted_cardItem createUMLRole_adapted_cardItem() {
		UMLRole_adapted_cardItemImpl umlRole_adapted_cardItem = new UMLRole_adapted_cardItemImpl();
		return umlRole_adapted_cardItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UMLRole_adapted_revLeftRoleItem createUMLRole_adapted_revLeftRoleItem() {
		UMLRole_adapted_revLeftRoleItemImpl umlRole_adapted_revLeftRoleItem = new UMLRole_adapted_revLeftRoleItemImpl();
		return umlRole_adapted_revLeftRoleItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UMLRole_adapted_revRightRoleItem createUMLRole_adapted_revRightRoleItem() {
		UMLRole_adapted_revRightRoleItemImpl umlRole_adapted_revRightRoleItem = new UMLRole_adapted_revRightRoleItemImpl();
		return umlRole_adapted_revRightRoleItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UMLRole_adapted_targetItem createUMLRole_adapted_targetItem() {
		UMLRole_adapted_targetItemImpl umlRole_adapted_targetItem = new UMLRole_adapted_targetItemImpl();
		return umlRole_adapted_targetItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UMLStereotype_adapted_textValue createUMLStereotype_adapted_textValue() {
		UMLStereotype_adapted_textValueImpl umlStereotype_adapted_textValue = new UMLStereotype_adapted_textValueImpl();
		return umlStereotype_adapted_textValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UMLStereotype_adapted_incrementItem createUMLStereotype_adapted_incrementItem() {
		UMLStereotype_adapted_incrementItemImpl umlStereotype_adapted_incrementItem = new UMLStereotype_adapted_incrementItemImpl();
		return umlStereotype_adapted_incrementItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassDiagram_adaptedPackage getClassDiagram_adaptedPackage() {
		return (ClassDiagram_adaptedPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ClassDiagram_adaptedPackage getPackage() {
		return ClassDiagram_adaptedPackage.eINSTANCE;
	}

} //ClassDiagram_adaptedFactoryImpl
