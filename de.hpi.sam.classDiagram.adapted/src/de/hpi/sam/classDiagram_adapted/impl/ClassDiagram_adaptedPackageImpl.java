/**
 */
package de.hpi.sam.classDiagram_adapted.impl;

import de.hpi.sam.classDiagram_adapted.ClassDiagram_adaptedFactory;
import de.hpi.sam.classDiagram_adapted.ClassDiagram_adaptedPackage;
import de.hpi.sam.classDiagram_adapted.UMLAssoc_adapted;
import de.hpi.sam.classDiagram_adapted.UMLAssoc_adapted_leftRoleItem;
import de.hpi.sam.classDiagram_adapted.UMLAssoc_adapted_rightRoleItem;
import de.hpi.sam.classDiagram_adapted.UMLCardinality_adapted;
import de.hpi.sam.classDiagram_adapted.UMLCardinality_adapted_cardStringValue;
import de.hpi.sam.classDiagram_adapted.UMLCardinality_adapted_revCardItem;
import de.hpi.sam.classDiagram_adapted.UMLClassDiagram_adapted;
import de.hpi.sam.classDiagram_adapted.UMLClassDiagram_adapted_elementsItem;
import de.hpi.sam.classDiagram_adapted.UMLClass_adapted;
import de.hpi.sam.classDiagram_adapted.UMLClass_adapted_rolesItem;
import de.hpi.sam.classDiagram_adapted.UMLDiagramItem_adapted;
import de.hpi.sam.classDiagram_adapted.UMLElement_adapted;
import de.hpi.sam.classDiagram_adapted.UMLElement_adapted_diagramItem;
import de.hpi.sam.classDiagram_adapted.UMLElement_adapted_nameValue;
import de.hpi.sam.classDiagram_adapted.UMLIncrement_adapted;
import de.hpi.sam.classDiagram_adapted.UMLIncrement_adapted_stereotypesItem;
import de.hpi.sam.classDiagram_adapted.UMLRole_adapted;
import de.hpi.sam.classDiagram_adapted.UMLRole_adapted_adornmentValue;
import de.hpi.sam.classDiagram_adapted.UMLRole_adapted_cardItem;
import de.hpi.sam.classDiagram_adapted.UMLRole_adapted_revLeftRoleItem;
import de.hpi.sam.classDiagram_adapted.UMLRole_adapted_revRightRoleItem;
import de.hpi.sam.classDiagram_adapted.UMLRole_adapted_targetItem;
import de.hpi.sam.classDiagram_adapted.UMLStereotype_adapted;
import de.hpi.sam.classDiagram_adapted.UMLStereotype_adapted_incrementItem;
import de.hpi.sam.classDiagram_adapted.UMLStereotype_adapted_textValue;

import de.mdelab.migmm.history.HistoryPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassDiagram_adaptedPackageImpl extends EPackageImpl implements ClassDiagram_adaptedPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlAssoc_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlCardinality_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlClassDiagram_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlClass_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlDiagramItem_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlElement_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlIncrement_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlRole_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlStereotype_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlAssoc_adapted_leftRoleItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlAssoc_adapted_rightRoleItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlCardinality_adapted_cardStringValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlCardinality_adapted_revCardItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlClassDiagram_adapted_elementsItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlClass_adapted_rolesItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlElement_adapted_nameValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlElement_adapted_diagramItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlIncrement_adapted_stereotypesItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlRole_adapted_adornmentValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlRole_adapted_cardItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlRole_adapted_revLeftRoleItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlRole_adapted_revRightRoleItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlRole_adapted_targetItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlStereotype_adapted_textValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlStereotype_adapted_incrementItemEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.hpi.sam.classDiagram_adapted.ClassDiagram_adaptedPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ClassDiagram_adaptedPackageImpl() {
		super(eNS_URI, ClassDiagram_adaptedFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ClassDiagram_adaptedPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ClassDiagram_adaptedPackage init() {
		if (isInited) return (ClassDiagram_adaptedPackage)EPackage.Registry.INSTANCE.getEPackage(ClassDiagram_adaptedPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredClassDiagram_adaptedPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ClassDiagram_adaptedPackageImpl theClassDiagram_adaptedPackage = registeredClassDiagram_adaptedPackage instanceof ClassDiagram_adaptedPackageImpl ? (ClassDiagram_adaptedPackageImpl)registeredClassDiagram_adaptedPackage : new ClassDiagram_adaptedPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		HistoryPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theClassDiagram_adaptedPackage.createPackageContents();

		// Initialize created meta-data
		theClassDiagram_adaptedPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theClassDiagram_adaptedPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ClassDiagram_adaptedPackage.eNS_URI, theClassDiagram_adaptedPackage);
		return theClassDiagram_adaptedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUMLAssoc_adapted() {
		return umlAssoc_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUMLAssoc_adapted_LeftRole() {
		return (EReference)umlAssoc_adaptedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUMLAssoc_adapted_RightRole() {
		return (EReference)umlAssoc_adaptedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUMLCardinality_adapted() {
		return umlCardinality_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUMLCardinality_adapted_CardString() {
		return (EReference)umlCardinality_adaptedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUMLCardinality_adapted_RevCard() {
		return (EReference)umlCardinality_adaptedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUMLClassDiagram_adapted() {
		return umlClassDiagram_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUMLClassDiagram_adapted_Elements() {
		return (EReference)umlClassDiagram_adaptedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUMLClass_adapted() {
		return umlClass_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUMLClass_adapted_Roles() {
		return (EReference)umlClass_adaptedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUMLDiagramItem_adapted() {
		return umlDiagramItem_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUMLElement_adapted() {
		return umlElement_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUMLElement_adapted_Name() {
		return (EReference)umlElement_adaptedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUMLElement_adapted_Diagram() {
		return (EReference)umlElement_adaptedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUMLIncrement_adapted() {
		return umlIncrement_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUMLIncrement_adapted_Stereotypes() {
		return (EReference)umlIncrement_adaptedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUMLRole_adapted() {
		return umlRole_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUMLRole_adapted_Adornment() {
		return (EReference)umlRole_adaptedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUMLRole_adapted_Card() {
		return (EReference)umlRole_adaptedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUMLRole_adapted_RevLeftRole() {
		return (EReference)umlRole_adaptedEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUMLRole_adapted_RevRightRole() {
		return (EReference)umlRole_adaptedEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUMLRole_adapted_Target() {
		return (EReference)umlRole_adaptedEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUMLStereotype_adapted() {
		return umlStereotype_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUMLStereotype_adapted_Text() {
		return (EReference)umlStereotype_adaptedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUMLStereotype_adapted_Increment() {
		return (EReference)umlStereotype_adaptedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUMLAssoc_adapted_leftRoleItem() {
		return umlAssoc_adapted_leftRoleItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUMLAssoc_adapted_leftRoleItem_LeftRole() {
		return (EReference)umlAssoc_adapted_leftRoleItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUMLAssoc_adapted_rightRoleItem() {
		return umlAssoc_adapted_rightRoleItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUMLAssoc_adapted_rightRoleItem_RightRole() {
		return (EReference)umlAssoc_adapted_rightRoleItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUMLCardinality_adapted_cardStringValue() {
		return umlCardinality_adapted_cardStringValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUMLCardinality_adapted_cardStringValue_Value() {
		return (EAttribute)umlCardinality_adapted_cardStringValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUMLCardinality_adapted_revCardItem() {
		return umlCardinality_adapted_revCardItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUMLCardinality_adapted_revCardItem_RevCard() {
		return (EReference)umlCardinality_adapted_revCardItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUMLClassDiagram_adapted_elementsItem() {
		return umlClassDiagram_adapted_elementsItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUMLClassDiagram_adapted_elementsItem_Elements() {
		return (EReference)umlClassDiagram_adapted_elementsItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUMLClass_adapted_rolesItem() {
		return umlClass_adapted_rolesItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUMLClass_adapted_rolesItem_Roles() {
		return (EReference)umlClass_adapted_rolesItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUMLElement_adapted_nameValue() {
		return umlElement_adapted_nameValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUMLElement_adapted_nameValue_Value() {
		return (EAttribute)umlElement_adapted_nameValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUMLElement_adapted_diagramItem() {
		return umlElement_adapted_diagramItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUMLElement_adapted_diagramItem_Diagram() {
		return (EReference)umlElement_adapted_diagramItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUMLIncrement_adapted_stereotypesItem() {
		return umlIncrement_adapted_stereotypesItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUMLIncrement_adapted_stereotypesItem_Stereotypes() {
		return (EReference)umlIncrement_adapted_stereotypesItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUMLRole_adapted_adornmentValue() {
		return umlRole_adapted_adornmentValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUMLRole_adapted_adornmentValue_Value() {
		return (EAttribute)umlRole_adapted_adornmentValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUMLRole_adapted_cardItem() {
		return umlRole_adapted_cardItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUMLRole_adapted_cardItem_Card() {
		return (EReference)umlRole_adapted_cardItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUMLRole_adapted_revLeftRoleItem() {
		return umlRole_adapted_revLeftRoleItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUMLRole_adapted_revLeftRoleItem_RevLeftRole() {
		return (EReference)umlRole_adapted_revLeftRoleItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUMLRole_adapted_revRightRoleItem() {
		return umlRole_adapted_revRightRoleItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUMLRole_adapted_revRightRoleItem_RevRightRole() {
		return (EReference)umlRole_adapted_revRightRoleItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUMLRole_adapted_targetItem() {
		return umlRole_adapted_targetItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUMLRole_adapted_targetItem_Target() {
		return (EReference)umlRole_adapted_targetItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUMLStereotype_adapted_textValue() {
		return umlStereotype_adapted_textValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUMLStereotype_adapted_textValue_Value() {
		return (EAttribute)umlStereotype_adapted_textValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUMLStereotype_adapted_incrementItem() {
		return umlStereotype_adapted_incrementItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUMLStereotype_adapted_incrementItem_Increment() {
		return (EReference)umlStereotype_adapted_incrementItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassDiagram_adaptedFactory getClassDiagram_adaptedFactory() {
		return (ClassDiagram_adaptedFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		umlAssoc_adaptedEClass = createEClass(UML_ASSOC_ADAPTED);
		createEReference(umlAssoc_adaptedEClass, UML_ASSOC_ADAPTED__LEFT_ROLE);
		createEReference(umlAssoc_adaptedEClass, UML_ASSOC_ADAPTED__RIGHT_ROLE);

		umlCardinality_adaptedEClass = createEClass(UML_CARDINALITY_ADAPTED);
		createEReference(umlCardinality_adaptedEClass, UML_CARDINALITY_ADAPTED__CARD_STRING);
		createEReference(umlCardinality_adaptedEClass, UML_CARDINALITY_ADAPTED__REV_CARD);

		umlClassDiagram_adaptedEClass = createEClass(UML_CLASS_DIAGRAM_ADAPTED);
		createEReference(umlClassDiagram_adaptedEClass, UML_CLASS_DIAGRAM_ADAPTED__ELEMENTS);

		umlClass_adaptedEClass = createEClass(UML_CLASS_ADAPTED);
		createEReference(umlClass_adaptedEClass, UML_CLASS_ADAPTED__ROLES);

		umlDiagramItem_adaptedEClass = createEClass(UML_DIAGRAM_ITEM_ADAPTED);

		umlElement_adaptedEClass = createEClass(UML_ELEMENT_ADAPTED);
		createEReference(umlElement_adaptedEClass, UML_ELEMENT_ADAPTED__NAME);
		createEReference(umlElement_adaptedEClass, UML_ELEMENT_ADAPTED__DIAGRAM);

		umlIncrement_adaptedEClass = createEClass(UML_INCREMENT_ADAPTED);
		createEReference(umlIncrement_adaptedEClass, UML_INCREMENT_ADAPTED__STEREOTYPES);

		umlRole_adaptedEClass = createEClass(UML_ROLE_ADAPTED);
		createEReference(umlRole_adaptedEClass, UML_ROLE_ADAPTED__ADORNMENT);
		createEReference(umlRole_adaptedEClass, UML_ROLE_ADAPTED__CARD);
		createEReference(umlRole_adaptedEClass, UML_ROLE_ADAPTED__REV_LEFT_ROLE);
		createEReference(umlRole_adaptedEClass, UML_ROLE_ADAPTED__REV_RIGHT_ROLE);
		createEReference(umlRole_adaptedEClass, UML_ROLE_ADAPTED__TARGET);

		umlStereotype_adaptedEClass = createEClass(UML_STEREOTYPE_ADAPTED);
		createEReference(umlStereotype_adaptedEClass, UML_STEREOTYPE_ADAPTED__TEXT);
		createEReference(umlStereotype_adaptedEClass, UML_STEREOTYPE_ADAPTED__INCREMENT);

		umlAssoc_adapted_leftRoleItemEClass = createEClass(UML_ASSOC_ADAPTED_LEFT_ROLE_ITEM);
		createEReference(umlAssoc_adapted_leftRoleItemEClass, UML_ASSOC_ADAPTED_LEFT_ROLE_ITEM__LEFT_ROLE);

		umlAssoc_adapted_rightRoleItemEClass = createEClass(UML_ASSOC_ADAPTED_RIGHT_ROLE_ITEM);
		createEReference(umlAssoc_adapted_rightRoleItemEClass, UML_ASSOC_ADAPTED_RIGHT_ROLE_ITEM__RIGHT_ROLE);

		umlCardinality_adapted_cardStringValueEClass = createEClass(UML_CARDINALITY_ADAPTED_CARD_STRING_VALUE);
		createEAttribute(umlCardinality_adapted_cardStringValueEClass, UML_CARDINALITY_ADAPTED_CARD_STRING_VALUE__VALUE);

		umlCardinality_adapted_revCardItemEClass = createEClass(UML_CARDINALITY_ADAPTED_REV_CARD_ITEM);
		createEReference(umlCardinality_adapted_revCardItemEClass, UML_CARDINALITY_ADAPTED_REV_CARD_ITEM__REV_CARD);

		umlClassDiagram_adapted_elementsItemEClass = createEClass(UML_CLASS_DIAGRAM_ADAPTED_ELEMENTS_ITEM);
		createEReference(umlClassDiagram_adapted_elementsItemEClass, UML_CLASS_DIAGRAM_ADAPTED_ELEMENTS_ITEM__ELEMENTS);

		umlClass_adapted_rolesItemEClass = createEClass(UML_CLASS_ADAPTED_ROLES_ITEM);
		createEReference(umlClass_adapted_rolesItemEClass, UML_CLASS_ADAPTED_ROLES_ITEM__ROLES);

		umlElement_adapted_nameValueEClass = createEClass(UML_ELEMENT_ADAPTED_NAME_VALUE);
		createEAttribute(umlElement_adapted_nameValueEClass, UML_ELEMENT_ADAPTED_NAME_VALUE__VALUE);

		umlElement_adapted_diagramItemEClass = createEClass(UML_ELEMENT_ADAPTED_DIAGRAM_ITEM);
		createEReference(umlElement_adapted_diagramItemEClass, UML_ELEMENT_ADAPTED_DIAGRAM_ITEM__DIAGRAM);

		umlIncrement_adapted_stereotypesItemEClass = createEClass(UML_INCREMENT_ADAPTED_STEREOTYPES_ITEM);
		createEReference(umlIncrement_adapted_stereotypesItemEClass, UML_INCREMENT_ADAPTED_STEREOTYPES_ITEM__STEREOTYPES);

		umlRole_adapted_adornmentValueEClass = createEClass(UML_ROLE_ADAPTED_ADORNMENT_VALUE);
		createEAttribute(umlRole_adapted_adornmentValueEClass, UML_ROLE_ADAPTED_ADORNMENT_VALUE__VALUE);

		umlRole_adapted_cardItemEClass = createEClass(UML_ROLE_ADAPTED_CARD_ITEM);
		createEReference(umlRole_adapted_cardItemEClass, UML_ROLE_ADAPTED_CARD_ITEM__CARD);

		umlRole_adapted_revLeftRoleItemEClass = createEClass(UML_ROLE_ADAPTED_REV_LEFT_ROLE_ITEM);
		createEReference(umlRole_adapted_revLeftRoleItemEClass, UML_ROLE_ADAPTED_REV_LEFT_ROLE_ITEM__REV_LEFT_ROLE);

		umlRole_adapted_revRightRoleItemEClass = createEClass(UML_ROLE_ADAPTED_REV_RIGHT_ROLE_ITEM);
		createEReference(umlRole_adapted_revRightRoleItemEClass, UML_ROLE_ADAPTED_REV_RIGHT_ROLE_ITEM__REV_RIGHT_ROLE);

		umlRole_adapted_targetItemEClass = createEClass(UML_ROLE_ADAPTED_TARGET_ITEM);
		createEReference(umlRole_adapted_targetItemEClass, UML_ROLE_ADAPTED_TARGET_ITEM__TARGET);

		umlStereotype_adapted_textValueEClass = createEClass(UML_STEREOTYPE_ADAPTED_TEXT_VALUE);
		createEAttribute(umlStereotype_adapted_textValueEClass, UML_STEREOTYPE_ADAPTED_TEXT_VALUE__VALUE);

		umlStereotype_adapted_incrementItemEClass = createEClass(UML_STEREOTYPE_ADAPTED_INCREMENT_ITEM);
		createEReference(umlStereotype_adapted_incrementItemEClass, UML_STEREOTYPE_ADAPTED_INCREMENT_ITEM__INCREMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		HistoryPackage theHistoryPackage = (HistoryPackage)EPackage.Registry.INSTANCE.getEPackage(HistoryPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		umlAssoc_adaptedEClass.getESuperTypes().add(this.getUMLDiagramItem_adapted());
		umlCardinality_adaptedEClass.getESuperTypes().add(this.getUMLIncrement_adapted());
		umlClassDiagram_adaptedEClass.getESuperTypes().add(this.getUMLElement_adapted());
		umlClass_adaptedEClass.getESuperTypes().add(this.getUMLDiagramItem_adapted());
		umlDiagramItem_adaptedEClass.getESuperTypes().add(this.getUMLIncrement_adapted());
		umlElement_adaptedEClass.getESuperTypes().add(theHistoryPackage.getNodeWithHistory());
		umlIncrement_adaptedEClass.getESuperTypes().add(this.getUMLElement_adapted());
		umlRole_adaptedEClass.getESuperTypes().add(this.getUMLIncrement_adapted());
		umlStereotype_adaptedEClass.getESuperTypes().add(this.getUMLIncrement_adapted());
		umlAssoc_adapted_leftRoleItemEClass.getESuperTypes().add(theHistoryPackage.getEdgeWithHistory());
		umlAssoc_adapted_rightRoleItemEClass.getESuperTypes().add(theHistoryPackage.getEdgeWithHistory());
		umlCardinality_adapted_cardStringValueEClass.getESuperTypes().add(theHistoryPackage.getAttributeWithHistory());
		umlCardinality_adapted_revCardItemEClass.getESuperTypes().add(theHistoryPackage.getEdgeWithHistory());
		umlClassDiagram_adapted_elementsItemEClass.getESuperTypes().add(theHistoryPackage.getContainmentEdgeWithHistory());
		umlClass_adapted_rolesItemEClass.getESuperTypes().add(theHistoryPackage.getEdgeWithHistory());
		umlElement_adapted_nameValueEClass.getESuperTypes().add(theHistoryPackage.getAttributeWithHistory());
		umlElement_adapted_diagramItemEClass.getESuperTypes().add(theHistoryPackage.getEdgeWithHistory());
		umlIncrement_adapted_stereotypesItemEClass.getESuperTypes().add(theHistoryPackage.getEdgeWithHistory());
		umlRole_adapted_adornmentValueEClass.getESuperTypes().add(theHistoryPackage.getAttributeWithHistory());
		umlRole_adapted_cardItemEClass.getESuperTypes().add(theHistoryPackage.getEdgeWithHistory());
		umlRole_adapted_revLeftRoleItemEClass.getESuperTypes().add(theHistoryPackage.getEdgeWithHistory());
		umlRole_adapted_revRightRoleItemEClass.getESuperTypes().add(theHistoryPackage.getEdgeWithHistory());
		umlRole_adapted_targetItemEClass.getESuperTypes().add(theHistoryPackage.getEdgeWithHistory());
		umlStereotype_adapted_textValueEClass.getESuperTypes().add(theHistoryPackage.getAttributeWithHistory());
		umlStereotype_adapted_incrementItemEClass.getESuperTypes().add(theHistoryPackage.getEdgeWithHistory());

		// Initialize classes, features, and operations; add parameters
		initEClass(umlAssoc_adaptedEClass, UMLAssoc_adapted.class, "UMLAssoc_adapted", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUMLAssoc_adapted_LeftRole(), this.getUMLAssoc_adapted_leftRoleItem(), null, "leftRole", null, 0, -1, UMLAssoc_adapted.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUMLAssoc_adapted_RightRole(), this.getUMLAssoc_adapted_rightRoleItem(), null, "rightRole", null, 0, -1, UMLAssoc_adapted.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(umlCardinality_adaptedEClass, UMLCardinality_adapted.class, "UMLCardinality_adapted", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUMLCardinality_adapted_CardString(), this.getUMLCardinality_adapted_cardStringValue(), null, "cardString", null, 0, -1, UMLCardinality_adapted.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLCardinality_adapted_RevCard(), this.getUMLCardinality_adapted_revCardItem(), null, "revCard", null, 0, -1, UMLCardinality_adapted.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(umlClassDiagram_adaptedEClass, UMLClassDiagram_adapted.class, "UMLClassDiagram_adapted", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUMLClassDiagram_adapted_Elements(), this.getUMLClassDiagram_adapted_elementsItem(), null, "elements", null, 0, -1, UMLClassDiagram_adapted.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(umlClass_adaptedEClass, UMLClass_adapted.class, "UMLClass_adapted", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUMLClass_adapted_Roles(), this.getUMLClass_adapted_rolesItem(), null, "roles", null, 0, -1, UMLClass_adapted.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(umlDiagramItem_adaptedEClass, UMLDiagramItem_adapted.class, "UMLDiagramItem_adapted", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(umlElement_adaptedEClass, UMLElement_adapted.class, "UMLElement_adapted", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUMLElement_adapted_Name(), this.getUMLElement_adapted_nameValue(), null, "name", null, 0, -1, UMLElement_adapted.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLElement_adapted_Diagram(), this.getUMLElement_adapted_diagramItem(), null, "diagram", null, 0, -1, UMLElement_adapted.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(umlIncrement_adaptedEClass, UMLIncrement_adapted.class, "UMLIncrement_adapted", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUMLIncrement_adapted_Stereotypes(), this.getUMLIncrement_adapted_stereotypesItem(), null, "stereotypes", null, 0, -1, UMLIncrement_adapted.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(umlRole_adaptedEClass, UMLRole_adapted.class, "UMLRole_adapted", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUMLRole_adapted_Adornment(), this.getUMLRole_adapted_adornmentValue(), null, "adornment", null, 0, -1, UMLRole_adapted.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLRole_adapted_Card(), this.getUMLRole_adapted_cardItem(), null, "card", null, 0, -1, UMLRole_adapted.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUMLRole_adapted_RevLeftRole(), this.getUMLRole_adapted_revLeftRoleItem(), null, "revLeftRole", null, 0, -1, UMLRole_adapted.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUMLRole_adapted_RevRightRole(), this.getUMLRole_adapted_revRightRoleItem(), null, "revRightRole", null, 0, -1, UMLRole_adapted.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUMLRole_adapted_Target(), this.getUMLRole_adapted_targetItem(), null, "target", null, 0, -1, UMLRole_adapted.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(umlStereotype_adaptedEClass, UMLStereotype_adapted.class, "UMLStereotype_adapted", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUMLStereotype_adapted_Text(), this.getUMLStereotype_adapted_textValue(), null, "text", null, 0, -1, UMLStereotype_adapted.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLStereotype_adapted_Increment(), this.getUMLStereotype_adapted_incrementItem(), null, "increment", null, 0, -1, UMLStereotype_adapted.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(umlAssoc_adapted_leftRoleItemEClass, UMLAssoc_adapted_leftRoleItem.class, "UMLAssoc_adapted_leftRoleItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUMLAssoc_adapted_leftRoleItem_LeftRole(), this.getUMLRole_adapted(), null, "leftRole", null, 1, 1, UMLAssoc_adapted_leftRoleItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(umlAssoc_adapted_rightRoleItemEClass, UMLAssoc_adapted_rightRoleItem.class, "UMLAssoc_adapted_rightRoleItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUMLAssoc_adapted_rightRoleItem_RightRole(), this.getUMLRole_adapted(), null, "rightRole", null, 1, 1, UMLAssoc_adapted_rightRoleItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(umlCardinality_adapted_cardStringValueEClass, UMLCardinality_adapted_cardStringValue.class, "UMLCardinality_adapted_cardStringValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUMLCardinality_adapted_cardStringValue_Value(), ecorePackage.getEString(), "value", null, 1, 1, UMLCardinality_adapted_cardStringValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(umlCardinality_adapted_revCardItemEClass, UMLCardinality_adapted_revCardItem.class, "UMLCardinality_adapted_revCardItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUMLCardinality_adapted_revCardItem_RevCard(), this.getUMLRole_adapted(), null, "revCard", null, 1, 1, UMLCardinality_adapted_revCardItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(umlClassDiagram_adapted_elementsItemEClass, UMLClassDiagram_adapted_elementsItem.class, "UMLClassDiagram_adapted_elementsItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUMLClassDiagram_adapted_elementsItem_Elements(), this.getUMLElement_adapted(), null, "elements", null, 1, 1, UMLClassDiagram_adapted_elementsItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(umlClass_adapted_rolesItemEClass, UMLClass_adapted_rolesItem.class, "UMLClass_adapted_rolesItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUMLClass_adapted_rolesItem_Roles(), this.getUMLRole_adapted(), null, "roles", null, 1, 1, UMLClass_adapted_rolesItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(umlElement_adapted_nameValueEClass, UMLElement_adapted_nameValue.class, "UMLElement_adapted_nameValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUMLElement_adapted_nameValue_Value(), ecorePackage.getEString(), "value", null, 1, 1, UMLElement_adapted_nameValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(umlElement_adapted_diagramItemEClass, UMLElement_adapted_diagramItem.class, "UMLElement_adapted_diagramItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUMLElement_adapted_diagramItem_Diagram(), this.getUMLClassDiagram_adapted(), null, "diagram", null, 1, 1, UMLElement_adapted_diagramItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(umlIncrement_adapted_stereotypesItemEClass, UMLIncrement_adapted_stereotypesItem.class, "UMLIncrement_adapted_stereotypesItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUMLIncrement_adapted_stereotypesItem_Stereotypes(), this.getUMLStereotype_adapted(), null, "stereotypes", null, 1, 1, UMLIncrement_adapted_stereotypesItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(umlRole_adapted_adornmentValueEClass, UMLRole_adapted_adornmentValue.class, "UMLRole_adapted_adornmentValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUMLRole_adapted_adornmentValue_Value(), ecorePackage.getEString(), "value", null, 1, 1, UMLRole_adapted_adornmentValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(umlRole_adapted_cardItemEClass, UMLRole_adapted_cardItem.class, "UMLRole_adapted_cardItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUMLRole_adapted_cardItem_Card(), this.getUMLCardinality_adapted(), null, "card", null, 1, 1, UMLRole_adapted_cardItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(umlRole_adapted_revLeftRoleItemEClass, UMLRole_adapted_revLeftRoleItem.class, "UMLRole_adapted_revLeftRoleItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUMLRole_adapted_revLeftRoleItem_RevLeftRole(), this.getUMLAssoc_adapted(), null, "revLeftRole", null, 1, 1, UMLRole_adapted_revLeftRoleItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(umlRole_adapted_revRightRoleItemEClass, UMLRole_adapted_revRightRoleItem.class, "UMLRole_adapted_revRightRoleItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUMLRole_adapted_revRightRoleItem_RevRightRole(), this.getUMLAssoc_adapted(), null, "revRightRole", null, 1, 1, UMLRole_adapted_revRightRoleItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(umlRole_adapted_targetItemEClass, UMLRole_adapted_targetItem.class, "UMLRole_adapted_targetItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUMLRole_adapted_targetItem_Target(), this.getUMLClass_adapted(), null, "target", null, 1, 1, UMLRole_adapted_targetItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(umlStereotype_adapted_textValueEClass, UMLStereotype_adapted_textValue.class, "UMLStereotype_adapted_textValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUMLStereotype_adapted_textValue_Value(), ecorePackage.getEString(), "value", null, 1, 1, UMLStereotype_adapted_textValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(umlStereotype_adapted_incrementItemEClass, UMLStereotype_adapted_incrementItem.class, "UMLStereotype_adapted_incrementItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUMLStereotype_adapted_incrementItem_Increment(), this.getUMLIncrement_adapted(), null, "increment", null, 1, 1, UMLStereotype_adapted_incrementItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ClassDiagram_adaptedPackageImpl
