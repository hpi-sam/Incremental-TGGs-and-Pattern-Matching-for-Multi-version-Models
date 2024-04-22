/**
 */
package de.hpi.sam.classDiagram_adapted;

import de.mdelab.migmm.history.HistoryPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.hpi.sam.classDiagram_adapted.ClassDiagram_adaptedFactory
 * @model kind="package"
 * @generated
 */
public interface ClassDiagram_adaptedPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "classDiagram_adapted";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///de/hpi/sam/classDiagram.ecore_adapted";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.hpi.sam.classDiagram_adapted";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ClassDiagram_adaptedPackage eINSTANCE = de.hpi.sam.classDiagram_adapted.impl.ClassDiagram_adaptedPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.hpi.sam.classDiagram_adapted.impl.UMLElement_adaptedImpl <em>UML Element adapted</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hpi.sam.classDiagram_adapted.impl.UMLElement_adaptedImpl
	 * @see de.hpi.sam.classDiagram_adapted.impl.ClassDiagram_adaptedPackageImpl#getUMLElement_adapted()
	 * @generated
	 */
	int UML_ELEMENT_ADAPTED = 5;

	/**
	 * The feature id for the '<em><b>Valid In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ELEMENT_ADAPTED__VALID_IN = HistoryPackage.NODE_WITH_HISTORY__VALID_IN;

	/**
	 * The feature id for the '<em><b>Unhandled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ELEMENT_ADAPTED__UNHANDLED = HistoryPackage.NODE_WITH_HISTORY__UNHANDLED;

	/**
	 * The feature id for the '<em><b>In Projection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ELEMENT_ADAPTED__IN_PROJECTION = HistoryPackage.NODE_WITH_HISTORY__IN_PROJECTION;

	/**
	 * The feature id for the '<em><b>In Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ELEMENT_ADAPTED__IN_EDGES = HistoryPackage.NODE_WITH_HISTORY__IN_EDGES;

	/**
	 * The feature id for the '<em><b>Out Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ELEMENT_ADAPTED__OUT_EDGES = HistoryPackage.NODE_WITH_HISTORY__OUT_EDGES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ELEMENT_ADAPTED__NAME = HistoryPackage.NODE_WITH_HISTORY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ELEMENT_ADAPTED__DIAGRAM = HistoryPackage.NODE_WITH_HISTORY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>UML Element adapted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ELEMENT_ADAPTED_FEATURE_COUNT = HistoryPackage.NODE_WITH_HISTORY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>UML Element adapted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ELEMENT_ADAPTED_OPERATION_COUNT = HistoryPackage.NODE_WITH_HISTORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hpi.sam.classDiagram_adapted.impl.UMLIncrement_adaptedImpl <em>UML Increment adapted</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hpi.sam.classDiagram_adapted.impl.UMLIncrement_adaptedImpl
	 * @see de.hpi.sam.classDiagram_adapted.impl.ClassDiagram_adaptedPackageImpl#getUMLIncrement_adapted()
	 * @generated
	 */
	int UML_INCREMENT_ADAPTED = 6;

	/**
	 * The feature id for the '<em><b>Valid In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INCREMENT_ADAPTED__VALID_IN = UML_ELEMENT_ADAPTED__VALID_IN;

	/**
	 * The feature id for the '<em><b>Unhandled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INCREMENT_ADAPTED__UNHANDLED = UML_ELEMENT_ADAPTED__UNHANDLED;

	/**
	 * The feature id for the '<em><b>In Projection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INCREMENT_ADAPTED__IN_PROJECTION = UML_ELEMENT_ADAPTED__IN_PROJECTION;

	/**
	 * The feature id for the '<em><b>In Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INCREMENT_ADAPTED__IN_EDGES = UML_ELEMENT_ADAPTED__IN_EDGES;

	/**
	 * The feature id for the '<em><b>Out Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INCREMENT_ADAPTED__OUT_EDGES = UML_ELEMENT_ADAPTED__OUT_EDGES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INCREMENT_ADAPTED__NAME = UML_ELEMENT_ADAPTED__NAME;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INCREMENT_ADAPTED__DIAGRAM = UML_ELEMENT_ADAPTED__DIAGRAM;

	/**
	 * The feature id for the '<em><b>Stereotypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INCREMENT_ADAPTED__STEREOTYPES = UML_ELEMENT_ADAPTED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>UML Increment adapted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INCREMENT_ADAPTED_FEATURE_COUNT = UML_ELEMENT_ADAPTED_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>UML Increment adapted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INCREMENT_ADAPTED_OPERATION_COUNT = UML_ELEMENT_ADAPTED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hpi.sam.classDiagram_adapted.impl.UMLDiagramItem_adaptedImpl <em>UML Diagram Item adapted</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hpi.sam.classDiagram_adapted.impl.UMLDiagramItem_adaptedImpl
	 * @see de.hpi.sam.classDiagram_adapted.impl.ClassDiagram_adaptedPackageImpl#getUMLDiagramItem_adapted()
	 * @generated
	 */
	int UML_DIAGRAM_ITEM_ADAPTED = 4;

	/**
	 * The feature id for the '<em><b>Valid In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM_ITEM_ADAPTED__VALID_IN = UML_INCREMENT_ADAPTED__VALID_IN;

	/**
	 * The feature id for the '<em><b>Unhandled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM_ITEM_ADAPTED__UNHANDLED = UML_INCREMENT_ADAPTED__UNHANDLED;

	/**
	 * The feature id for the '<em><b>In Projection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM_ITEM_ADAPTED__IN_PROJECTION = UML_INCREMENT_ADAPTED__IN_PROJECTION;

	/**
	 * The feature id for the '<em><b>In Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM_ITEM_ADAPTED__IN_EDGES = UML_INCREMENT_ADAPTED__IN_EDGES;

	/**
	 * The feature id for the '<em><b>Out Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM_ITEM_ADAPTED__OUT_EDGES = UML_INCREMENT_ADAPTED__OUT_EDGES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM_ITEM_ADAPTED__NAME = UML_INCREMENT_ADAPTED__NAME;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM_ITEM_ADAPTED__DIAGRAM = UML_INCREMENT_ADAPTED__DIAGRAM;

	/**
	 * The feature id for the '<em><b>Stereotypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM_ITEM_ADAPTED__STEREOTYPES = UML_INCREMENT_ADAPTED__STEREOTYPES;

	/**
	 * The number of structural features of the '<em>UML Diagram Item adapted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM_ITEM_ADAPTED_FEATURE_COUNT = UML_INCREMENT_ADAPTED_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>UML Diagram Item adapted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DIAGRAM_ITEM_ADAPTED_OPERATION_COUNT = UML_INCREMENT_ADAPTED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hpi.sam.classDiagram_adapted.impl.UMLAssoc_adaptedImpl <em>UML Assoc adapted</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hpi.sam.classDiagram_adapted.impl.UMLAssoc_adaptedImpl
	 * @see de.hpi.sam.classDiagram_adapted.impl.ClassDiagram_adaptedPackageImpl#getUMLAssoc_adapted()
	 * @generated
	 */
	int UML_ASSOC_ADAPTED = 0;

	/**
	 * The feature id for the '<em><b>Valid In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ASSOC_ADAPTED__VALID_IN = UML_DIAGRAM_ITEM_ADAPTED__VALID_IN;

	/**
	 * The feature id for the '<em><b>Unhandled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ASSOC_ADAPTED__UNHANDLED = UML_DIAGRAM_ITEM_ADAPTED__UNHANDLED;

	/**
	 * The feature id for the '<em><b>In Projection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ASSOC_ADAPTED__IN_PROJECTION = UML_DIAGRAM_ITEM_ADAPTED__IN_PROJECTION;

	/**
	 * The feature id for the '<em><b>In Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ASSOC_ADAPTED__IN_EDGES = UML_DIAGRAM_ITEM_ADAPTED__IN_EDGES;

	/**
	 * The feature id for the '<em><b>Out Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ASSOC_ADAPTED__OUT_EDGES = UML_DIAGRAM_ITEM_ADAPTED__OUT_EDGES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ASSOC_ADAPTED__NAME = UML_DIAGRAM_ITEM_ADAPTED__NAME;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ASSOC_ADAPTED__DIAGRAM = UML_DIAGRAM_ITEM_ADAPTED__DIAGRAM;

	/**
	 * The feature id for the '<em><b>Stereotypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ASSOC_ADAPTED__STEREOTYPES = UML_DIAGRAM_ITEM_ADAPTED__STEREOTYPES;

	/**
	 * The feature id for the '<em><b>Left Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ASSOC_ADAPTED__LEFT_ROLE = UML_DIAGRAM_ITEM_ADAPTED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ASSOC_ADAPTED__RIGHT_ROLE = UML_DIAGRAM_ITEM_ADAPTED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>UML Assoc adapted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ASSOC_ADAPTED_FEATURE_COUNT = UML_DIAGRAM_ITEM_ADAPTED_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>UML Assoc adapted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ASSOC_ADAPTED_OPERATION_COUNT = UML_DIAGRAM_ITEM_ADAPTED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hpi.sam.classDiagram_adapted.impl.UMLCardinality_adaptedImpl <em>UML Cardinality adapted</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hpi.sam.classDiagram_adapted.impl.UMLCardinality_adaptedImpl
	 * @see de.hpi.sam.classDiagram_adapted.impl.ClassDiagram_adaptedPackageImpl#getUMLCardinality_adapted()
	 * @generated
	 */
	int UML_CARDINALITY_ADAPTED = 1;

	/**
	 * The feature id for the '<em><b>Valid In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CARDINALITY_ADAPTED__VALID_IN = UML_INCREMENT_ADAPTED__VALID_IN;

	/**
	 * The feature id for the '<em><b>Unhandled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CARDINALITY_ADAPTED__UNHANDLED = UML_INCREMENT_ADAPTED__UNHANDLED;

	/**
	 * The feature id for the '<em><b>In Projection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CARDINALITY_ADAPTED__IN_PROJECTION = UML_INCREMENT_ADAPTED__IN_PROJECTION;

	/**
	 * The feature id for the '<em><b>In Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CARDINALITY_ADAPTED__IN_EDGES = UML_INCREMENT_ADAPTED__IN_EDGES;

	/**
	 * The feature id for the '<em><b>Out Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CARDINALITY_ADAPTED__OUT_EDGES = UML_INCREMENT_ADAPTED__OUT_EDGES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CARDINALITY_ADAPTED__NAME = UML_INCREMENT_ADAPTED__NAME;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CARDINALITY_ADAPTED__DIAGRAM = UML_INCREMENT_ADAPTED__DIAGRAM;

	/**
	 * The feature id for the '<em><b>Stereotypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CARDINALITY_ADAPTED__STEREOTYPES = UML_INCREMENT_ADAPTED__STEREOTYPES;

	/**
	 * The feature id for the '<em><b>Card String</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CARDINALITY_ADAPTED__CARD_STRING = UML_INCREMENT_ADAPTED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rev Card</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CARDINALITY_ADAPTED__REV_CARD = UML_INCREMENT_ADAPTED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>UML Cardinality adapted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CARDINALITY_ADAPTED_FEATURE_COUNT = UML_INCREMENT_ADAPTED_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>UML Cardinality adapted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CARDINALITY_ADAPTED_OPERATION_COUNT = UML_INCREMENT_ADAPTED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hpi.sam.classDiagram_adapted.impl.UMLClassDiagram_adaptedImpl <em>UML Class Diagram adapted</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hpi.sam.classDiagram_adapted.impl.UMLClassDiagram_adaptedImpl
	 * @see de.hpi.sam.classDiagram_adapted.impl.ClassDiagram_adaptedPackageImpl#getUMLClassDiagram_adapted()
	 * @generated
	 */
	int UML_CLASS_DIAGRAM_ADAPTED = 2;

	/**
	 * The feature id for the '<em><b>Valid In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASS_DIAGRAM_ADAPTED__VALID_IN = UML_ELEMENT_ADAPTED__VALID_IN;

	/**
	 * The feature id for the '<em><b>Unhandled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASS_DIAGRAM_ADAPTED__UNHANDLED = UML_ELEMENT_ADAPTED__UNHANDLED;

	/**
	 * The feature id for the '<em><b>In Projection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASS_DIAGRAM_ADAPTED__IN_PROJECTION = UML_ELEMENT_ADAPTED__IN_PROJECTION;

	/**
	 * The feature id for the '<em><b>In Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASS_DIAGRAM_ADAPTED__IN_EDGES = UML_ELEMENT_ADAPTED__IN_EDGES;

	/**
	 * The feature id for the '<em><b>Out Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASS_DIAGRAM_ADAPTED__OUT_EDGES = UML_ELEMENT_ADAPTED__OUT_EDGES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASS_DIAGRAM_ADAPTED__NAME = UML_ELEMENT_ADAPTED__NAME;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASS_DIAGRAM_ADAPTED__DIAGRAM = UML_ELEMENT_ADAPTED__DIAGRAM;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASS_DIAGRAM_ADAPTED__ELEMENTS = UML_ELEMENT_ADAPTED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>UML Class Diagram adapted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASS_DIAGRAM_ADAPTED_FEATURE_COUNT = UML_ELEMENT_ADAPTED_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>UML Class Diagram adapted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASS_DIAGRAM_ADAPTED_OPERATION_COUNT = UML_ELEMENT_ADAPTED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hpi.sam.classDiagram_adapted.impl.UMLClass_adaptedImpl <em>UML Class adapted</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hpi.sam.classDiagram_adapted.impl.UMLClass_adaptedImpl
	 * @see de.hpi.sam.classDiagram_adapted.impl.ClassDiagram_adaptedPackageImpl#getUMLClass_adapted()
	 * @generated
	 */
	int UML_CLASS_ADAPTED = 3;

	/**
	 * The feature id for the '<em><b>Valid In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASS_ADAPTED__VALID_IN = UML_DIAGRAM_ITEM_ADAPTED__VALID_IN;

	/**
	 * The feature id for the '<em><b>Unhandled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASS_ADAPTED__UNHANDLED = UML_DIAGRAM_ITEM_ADAPTED__UNHANDLED;

	/**
	 * The feature id for the '<em><b>In Projection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASS_ADAPTED__IN_PROJECTION = UML_DIAGRAM_ITEM_ADAPTED__IN_PROJECTION;

	/**
	 * The feature id for the '<em><b>In Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASS_ADAPTED__IN_EDGES = UML_DIAGRAM_ITEM_ADAPTED__IN_EDGES;

	/**
	 * The feature id for the '<em><b>Out Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASS_ADAPTED__OUT_EDGES = UML_DIAGRAM_ITEM_ADAPTED__OUT_EDGES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASS_ADAPTED__NAME = UML_DIAGRAM_ITEM_ADAPTED__NAME;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASS_ADAPTED__DIAGRAM = UML_DIAGRAM_ITEM_ADAPTED__DIAGRAM;

	/**
	 * The feature id for the '<em><b>Stereotypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASS_ADAPTED__STEREOTYPES = UML_DIAGRAM_ITEM_ADAPTED__STEREOTYPES;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASS_ADAPTED__ROLES = UML_DIAGRAM_ITEM_ADAPTED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>UML Class adapted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASS_ADAPTED_FEATURE_COUNT = UML_DIAGRAM_ITEM_ADAPTED_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>UML Class adapted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASS_ADAPTED_OPERATION_COUNT = UML_DIAGRAM_ITEM_ADAPTED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hpi.sam.classDiagram_adapted.impl.UMLRole_adaptedImpl <em>UML Role adapted</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hpi.sam.classDiagram_adapted.impl.UMLRole_adaptedImpl
	 * @see de.hpi.sam.classDiagram_adapted.impl.ClassDiagram_adaptedPackageImpl#getUMLRole_adapted()
	 * @generated
	 */
	int UML_ROLE_ADAPTED = 7;

	/**
	 * The feature id for the '<em><b>Valid In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ROLE_ADAPTED__VALID_IN = UML_INCREMENT_ADAPTED__VALID_IN;

	/**
	 * The feature id for the '<em><b>Unhandled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ROLE_ADAPTED__UNHANDLED = UML_INCREMENT_ADAPTED__UNHANDLED;

	/**
	 * The feature id for the '<em><b>In Projection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ROLE_ADAPTED__IN_PROJECTION = UML_INCREMENT_ADAPTED__IN_PROJECTION;

	/**
	 * The feature id for the '<em><b>In Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ROLE_ADAPTED__IN_EDGES = UML_INCREMENT_ADAPTED__IN_EDGES;

	/**
	 * The feature id for the '<em><b>Out Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ROLE_ADAPTED__OUT_EDGES = UML_INCREMENT_ADAPTED__OUT_EDGES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ROLE_ADAPTED__NAME = UML_INCREMENT_ADAPTED__NAME;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ROLE_ADAPTED__DIAGRAM = UML_INCREMENT_ADAPTED__DIAGRAM;

	/**
	 * The feature id for the '<em><b>Stereotypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ROLE_ADAPTED__STEREOTYPES = UML_INCREMENT_ADAPTED__STEREOTYPES;

	/**
	 * The feature id for the '<em><b>Adornment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ROLE_ADAPTED__ADORNMENT = UML_INCREMENT_ADAPTED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Card</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ROLE_ADAPTED__CARD = UML_INCREMENT_ADAPTED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rev Left Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ROLE_ADAPTED__REV_LEFT_ROLE = UML_INCREMENT_ADAPTED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rev Right Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ROLE_ADAPTED__REV_RIGHT_ROLE = UML_INCREMENT_ADAPTED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ROLE_ADAPTED__TARGET = UML_INCREMENT_ADAPTED_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>UML Role adapted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ROLE_ADAPTED_FEATURE_COUNT = UML_INCREMENT_ADAPTED_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>UML Role adapted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ROLE_ADAPTED_OPERATION_COUNT = UML_INCREMENT_ADAPTED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hpi.sam.classDiagram_adapted.impl.UMLStereotype_adaptedImpl <em>UML Stereotype adapted</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hpi.sam.classDiagram_adapted.impl.UMLStereotype_adaptedImpl
	 * @see de.hpi.sam.classDiagram_adapted.impl.ClassDiagram_adaptedPackageImpl#getUMLStereotype_adapted()
	 * @generated
	 */
	int UML_STEREOTYPE_ADAPTED = 8;

	/**
	 * The feature id for the '<em><b>Valid In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STEREOTYPE_ADAPTED__VALID_IN = UML_INCREMENT_ADAPTED__VALID_IN;

	/**
	 * The feature id for the '<em><b>Unhandled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STEREOTYPE_ADAPTED__UNHANDLED = UML_INCREMENT_ADAPTED__UNHANDLED;

	/**
	 * The feature id for the '<em><b>In Projection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STEREOTYPE_ADAPTED__IN_PROJECTION = UML_INCREMENT_ADAPTED__IN_PROJECTION;

	/**
	 * The feature id for the '<em><b>In Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STEREOTYPE_ADAPTED__IN_EDGES = UML_INCREMENT_ADAPTED__IN_EDGES;

	/**
	 * The feature id for the '<em><b>Out Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STEREOTYPE_ADAPTED__OUT_EDGES = UML_INCREMENT_ADAPTED__OUT_EDGES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STEREOTYPE_ADAPTED__NAME = UML_INCREMENT_ADAPTED__NAME;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STEREOTYPE_ADAPTED__DIAGRAM = UML_INCREMENT_ADAPTED__DIAGRAM;

	/**
	 * The feature id for the '<em><b>Stereotypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STEREOTYPE_ADAPTED__STEREOTYPES = UML_INCREMENT_ADAPTED__STEREOTYPES;

	/**
	 * The feature id for the '<em><b>Text</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STEREOTYPE_ADAPTED__TEXT = UML_INCREMENT_ADAPTED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Increment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STEREOTYPE_ADAPTED__INCREMENT = UML_INCREMENT_ADAPTED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>UML Stereotype adapted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STEREOTYPE_ADAPTED_FEATURE_COUNT = UML_INCREMENT_ADAPTED_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>UML Stereotype adapted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STEREOTYPE_ADAPTED_OPERATION_COUNT = UML_INCREMENT_ADAPTED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hpi.sam.classDiagram_adapted.impl.UMLAssoc_adapted_leftRoleItemImpl <em>UML Assoc adapted left Role Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hpi.sam.classDiagram_adapted.impl.UMLAssoc_adapted_leftRoleItemImpl
	 * @see de.hpi.sam.classDiagram_adapted.impl.ClassDiagram_adaptedPackageImpl#getUMLAssoc_adapted_leftRoleItem()
	 * @generated
	 */
	int UML_ASSOC_ADAPTED_LEFT_ROLE_ITEM = 9;

	/**
	 * The feature id for the '<em><b>Valid In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ASSOC_ADAPTED_LEFT_ROLE_ITEM__VALID_IN = HistoryPackage.EDGE_WITH_HISTORY__VALID_IN;

	/**
	 * The feature id for the '<em><b>Unhandled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ASSOC_ADAPTED_LEFT_ROLE_ITEM__UNHANDLED = HistoryPackage.EDGE_WITH_HISTORY__UNHANDLED;

	/**
	 * The feature id for the '<em><b>In Projection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ASSOC_ADAPTED_LEFT_ROLE_ITEM__IN_PROJECTION = HistoryPackage.EDGE_WITH_HISTORY__IN_PROJECTION;

	/**
	 * The feature id for the '<em><b>Edge Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ASSOC_ADAPTED_LEFT_ROLE_ITEM__EDGE_SOURCE = HistoryPackage.EDGE_WITH_HISTORY__EDGE_SOURCE;

	/**
	 * The feature id for the '<em><b>Edge Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ASSOC_ADAPTED_LEFT_ROLE_ITEM__EDGE_TARGET = HistoryPackage.EDGE_WITH_HISTORY__EDGE_TARGET;

	/**
	 * The feature id for the '<em><b>Is Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ASSOC_ADAPTED_LEFT_ROLE_ITEM__IS_CONTAINMENT = HistoryPackage.EDGE_WITH_HISTORY__IS_CONTAINMENT;

	/**
	 * The feature id for the '<em><b>Left Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ASSOC_ADAPTED_LEFT_ROLE_ITEM__LEFT_ROLE = HistoryPackage.EDGE_WITH_HISTORY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>UML Assoc adapted left Role Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ASSOC_ADAPTED_LEFT_ROLE_ITEM_FEATURE_COUNT = HistoryPackage.EDGE_WITH_HISTORY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>UML Assoc adapted left Role Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ASSOC_ADAPTED_LEFT_ROLE_ITEM_OPERATION_COUNT = HistoryPackage.EDGE_WITH_HISTORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hpi.sam.classDiagram_adapted.impl.UMLAssoc_adapted_rightRoleItemImpl <em>UML Assoc adapted right Role Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hpi.sam.classDiagram_adapted.impl.UMLAssoc_adapted_rightRoleItemImpl
	 * @see de.hpi.sam.classDiagram_adapted.impl.ClassDiagram_adaptedPackageImpl#getUMLAssoc_adapted_rightRoleItem()
	 * @generated
	 */
	int UML_ASSOC_ADAPTED_RIGHT_ROLE_ITEM = 10;

	/**
	 * The feature id for the '<em><b>Valid In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ASSOC_ADAPTED_RIGHT_ROLE_ITEM__VALID_IN = HistoryPackage.EDGE_WITH_HISTORY__VALID_IN;

	/**
	 * The feature id for the '<em><b>Unhandled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ASSOC_ADAPTED_RIGHT_ROLE_ITEM__UNHANDLED = HistoryPackage.EDGE_WITH_HISTORY__UNHANDLED;

	/**
	 * The feature id for the '<em><b>In Projection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ASSOC_ADAPTED_RIGHT_ROLE_ITEM__IN_PROJECTION = HistoryPackage.EDGE_WITH_HISTORY__IN_PROJECTION;

	/**
	 * The feature id for the '<em><b>Edge Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ASSOC_ADAPTED_RIGHT_ROLE_ITEM__EDGE_SOURCE = HistoryPackage.EDGE_WITH_HISTORY__EDGE_SOURCE;

	/**
	 * The feature id for the '<em><b>Edge Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ASSOC_ADAPTED_RIGHT_ROLE_ITEM__EDGE_TARGET = HistoryPackage.EDGE_WITH_HISTORY__EDGE_TARGET;

	/**
	 * The feature id for the '<em><b>Is Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ASSOC_ADAPTED_RIGHT_ROLE_ITEM__IS_CONTAINMENT = HistoryPackage.EDGE_WITH_HISTORY__IS_CONTAINMENT;

	/**
	 * The feature id for the '<em><b>Right Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ASSOC_ADAPTED_RIGHT_ROLE_ITEM__RIGHT_ROLE = HistoryPackage.EDGE_WITH_HISTORY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>UML Assoc adapted right Role Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ASSOC_ADAPTED_RIGHT_ROLE_ITEM_FEATURE_COUNT = HistoryPackage.EDGE_WITH_HISTORY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>UML Assoc adapted right Role Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ASSOC_ADAPTED_RIGHT_ROLE_ITEM_OPERATION_COUNT = HistoryPackage.EDGE_WITH_HISTORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hpi.sam.classDiagram_adapted.impl.UMLCardinality_adapted_cardStringValueImpl <em>UML Cardinality adapted card String Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hpi.sam.classDiagram_adapted.impl.UMLCardinality_adapted_cardStringValueImpl
	 * @see de.hpi.sam.classDiagram_adapted.impl.ClassDiagram_adaptedPackageImpl#getUMLCardinality_adapted_cardStringValue()
	 * @generated
	 */
	int UML_CARDINALITY_ADAPTED_CARD_STRING_VALUE = 11;

	/**
	 * The feature id for the '<em><b>Valid In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CARDINALITY_ADAPTED_CARD_STRING_VALUE__VALID_IN = HistoryPackage.ATTRIBUTE_WITH_HISTORY__VALID_IN;

	/**
	 * The feature id for the '<em><b>Unhandled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CARDINALITY_ADAPTED_CARD_STRING_VALUE__UNHANDLED = HistoryPackage.ATTRIBUTE_WITH_HISTORY__UNHANDLED;

	/**
	 * The feature id for the '<em><b>In Projection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CARDINALITY_ADAPTED_CARD_STRING_VALUE__IN_PROJECTION = HistoryPackage.ATTRIBUTE_WITH_HISTORY__IN_PROJECTION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CARDINALITY_ADAPTED_CARD_STRING_VALUE__VALUE = HistoryPackage.ATTRIBUTE_WITH_HISTORY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>UML Cardinality adapted card String Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CARDINALITY_ADAPTED_CARD_STRING_VALUE_FEATURE_COUNT = HistoryPackage.ATTRIBUTE_WITH_HISTORY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>UML Cardinality adapted card String Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CARDINALITY_ADAPTED_CARD_STRING_VALUE_OPERATION_COUNT = HistoryPackage.ATTRIBUTE_WITH_HISTORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hpi.sam.classDiagram_adapted.impl.UMLCardinality_adapted_revCardItemImpl <em>UML Cardinality adapted rev Card Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hpi.sam.classDiagram_adapted.impl.UMLCardinality_adapted_revCardItemImpl
	 * @see de.hpi.sam.classDiagram_adapted.impl.ClassDiagram_adaptedPackageImpl#getUMLCardinality_adapted_revCardItem()
	 * @generated
	 */
	int UML_CARDINALITY_ADAPTED_REV_CARD_ITEM = 12;

	/**
	 * The feature id for the '<em><b>Valid In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CARDINALITY_ADAPTED_REV_CARD_ITEM__VALID_IN = HistoryPackage.EDGE_WITH_HISTORY__VALID_IN;

	/**
	 * The feature id for the '<em><b>Unhandled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CARDINALITY_ADAPTED_REV_CARD_ITEM__UNHANDLED = HistoryPackage.EDGE_WITH_HISTORY__UNHANDLED;

	/**
	 * The feature id for the '<em><b>In Projection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CARDINALITY_ADAPTED_REV_CARD_ITEM__IN_PROJECTION = HistoryPackage.EDGE_WITH_HISTORY__IN_PROJECTION;

	/**
	 * The feature id for the '<em><b>Edge Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CARDINALITY_ADAPTED_REV_CARD_ITEM__EDGE_SOURCE = HistoryPackage.EDGE_WITH_HISTORY__EDGE_SOURCE;

	/**
	 * The feature id for the '<em><b>Edge Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CARDINALITY_ADAPTED_REV_CARD_ITEM__EDGE_TARGET = HistoryPackage.EDGE_WITH_HISTORY__EDGE_TARGET;

	/**
	 * The feature id for the '<em><b>Is Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CARDINALITY_ADAPTED_REV_CARD_ITEM__IS_CONTAINMENT = HistoryPackage.EDGE_WITH_HISTORY__IS_CONTAINMENT;

	/**
	 * The feature id for the '<em><b>Rev Card</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CARDINALITY_ADAPTED_REV_CARD_ITEM__REV_CARD = HistoryPackage.EDGE_WITH_HISTORY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>UML Cardinality adapted rev Card Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CARDINALITY_ADAPTED_REV_CARD_ITEM_FEATURE_COUNT = HistoryPackage.EDGE_WITH_HISTORY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>UML Cardinality adapted rev Card Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CARDINALITY_ADAPTED_REV_CARD_ITEM_OPERATION_COUNT = HistoryPackage.EDGE_WITH_HISTORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hpi.sam.classDiagram_adapted.impl.UMLClassDiagram_adapted_elementsItemImpl <em>UML Class Diagram adapted elements Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hpi.sam.classDiagram_adapted.impl.UMLClassDiagram_adapted_elementsItemImpl
	 * @see de.hpi.sam.classDiagram_adapted.impl.ClassDiagram_adaptedPackageImpl#getUMLClassDiagram_adapted_elementsItem()
	 * @generated
	 */
	int UML_CLASS_DIAGRAM_ADAPTED_ELEMENTS_ITEM = 13;

	/**
	 * The feature id for the '<em><b>Valid In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASS_DIAGRAM_ADAPTED_ELEMENTS_ITEM__VALID_IN = HistoryPackage.CONTAINMENT_EDGE_WITH_HISTORY__VALID_IN;

	/**
	 * The feature id for the '<em><b>Unhandled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASS_DIAGRAM_ADAPTED_ELEMENTS_ITEM__UNHANDLED = HistoryPackage.CONTAINMENT_EDGE_WITH_HISTORY__UNHANDLED;

	/**
	 * The feature id for the '<em><b>In Projection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASS_DIAGRAM_ADAPTED_ELEMENTS_ITEM__IN_PROJECTION = HistoryPackage.CONTAINMENT_EDGE_WITH_HISTORY__IN_PROJECTION;

	/**
	 * The feature id for the '<em><b>Edge Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASS_DIAGRAM_ADAPTED_ELEMENTS_ITEM__EDGE_SOURCE = HistoryPackage.CONTAINMENT_EDGE_WITH_HISTORY__EDGE_SOURCE;

	/**
	 * The feature id for the '<em><b>Edge Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASS_DIAGRAM_ADAPTED_ELEMENTS_ITEM__EDGE_TARGET = HistoryPackage.CONTAINMENT_EDGE_WITH_HISTORY__EDGE_TARGET;

	/**
	 * The feature id for the '<em><b>Is Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASS_DIAGRAM_ADAPTED_ELEMENTS_ITEM__IS_CONTAINMENT = HistoryPackage.CONTAINMENT_EDGE_WITH_HISTORY__IS_CONTAINMENT;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASS_DIAGRAM_ADAPTED_ELEMENTS_ITEM__ELEMENTS = HistoryPackage.CONTAINMENT_EDGE_WITH_HISTORY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>UML Class Diagram adapted elements Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASS_DIAGRAM_ADAPTED_ELEMENTS_ITEM_FEATURE_COUNT = HistoryPackage.CONTAINMENT_EDGE_WITH_HISTORY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>UML Class Diagram adapted elements Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASS_DIAGRAM_ADAPTED_ELEMENTS_ITEM_OPERATION_COUNT = HistoryPackage.CONTAINMENT_EDGE_WITH_HISTORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hpi.sam.classDiagram_adapted.impl.UMLClass_adapted_rolesItemImpl <em>UML Class adapted roles Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hpi.sam.classDiagram_adapted.impl.UMLClass_adapted_rolesItemImpl
	 * @see de.hpi.sam.classDiagram_adapted.impl.ClassDiagram_adaptedPackageImpl#getUMLClass_adapted_rolesItem()
	 * @generated
	 */
	int UML_CLASS_ADAPTED_ROLES_ITEM = 14;

	/**
	 * The feature id for the '<em><b>Valid In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASS_ADAPTED_ROLES_ITEM__VALID_IN = HistoryPackage.EDGE_WITH_HISTORY__VALID_IN;

	/**
	 * The feature id for the '<em><b>Unhandled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASS_ADAPTED_ROLES_ITEM__UNHANDLED = HistoryPackage.EDGE_WITH_HISTORY__UNHANDLED;

	/**
	 * The feature id for the '<em><b>In Projection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASS_ADAPTED_ROLES_ITEM__IN_PROJECTION = HistoryPackage.EDGE_WITH_HISTORY__IN_PROJECTION;

	/**
	 * The feature id for the '<em><b>Edge Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASS_ADAPTED_ROLES_ITEM__EDGE_SOURCE = HistoryPackage.EDGE_WITH_HISTORY__EDGE_SOURCE;

	/**
	 * The feature id for the '<em><b>Edge Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASS_ADAPTED_ROLES_ITEM__EDGE_TARGET = HistoryPackage.EDGE_WITH_HISTORY__EDGE_TARGET;

	/**
	 * The feature id for the '<em><b>Is Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASS_ADAPTED_ROLES_ITEM__IS_CONTAINMENT = HistoryPackage.EDGE_WITH_HISTORY__IS_CONTAINMENT;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASS_ADAPTED_ROLES_ITEM__ROLES = HistoryPackage.EDGE_WITH_HISTORY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>UML Class adapted roles Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASS_ADAPTED_ROLES_ITEM_FEATURE_COUNT = HistoryPackage.EDGE_WITH_HISTORY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>UML Class adapted roles Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASS_ADAPTED_ROLES_ITEM_OPERATION_COUNT = HistoryPackage.EDGE_WITH_HISTORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hpi.sam.classDiagram_adapted.impl.UMLElement_adapted_nameValueImpl <em>UML Element adapted name Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hpi.sam.classDiagram_adapted.impl.UMLElement_adapted_nameValueImpl
	 * @see de.hpi.sam.classDiagram_adapted.impl.ClassDiagram_adaptedPackageImpl#getUMLElement_adapted_nameValue()
	 * @generated
	 */
	int UML_ELEMENT_ADAPTED_NAME_VALUE = 15;

	/**
	 * The feature id for the '<em><b>Valid In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ELEMENT_ADAPTED_NAME_VALUE__VALID_IN = HistoryPackage.ATTRIBUTE_WITH_HISTORY__VALID_IN;

	/**
	 * The feature id for the '<em><b>Unhandled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ELEMENT_ADAPTED_NAME_VALUE__UNHANDLED = HistoryPackage.ATTRIBUTE_WITH_HISTORY__UNHANDLED;

	/**
	 * The feature id for the '<em><b>In Projection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ELEMENT_ADAPTED_NAME_VALUE__IN_PROJECTION = HistoryPackage.ATTRIBUTE_WITH_HISTORY__IN_PROJECTION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ELEMENT_ADAPTED_NAME_VALUE__VALUE = HistoryPackage.ATTRIBUTE_WITH_HISTORY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>UML Element adapted name Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ELEMENT_ADAPTED_NAME_VALUE_FEATURE_COUNT = HistoryPackage.ATTRIBUTE_WITH_HISTORY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>UML Element adapted name Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ELEMENT_ADAPTED_NAME_VALUE_OPERATION_COUNT = HistoryPackage.ATTRIBUTE_WITH_HISTORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hpi.sam.classDiagram_adapted.impl.UMLElement_adapted_diagramItemImpl <em>UML Element adapted diagram Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hpi.sam.classDiagram_adapted.impl.UMLElement_adapted_diagramItemImpl
	 * @see de.hpi.sam.classDiagram_adapted.impl.ClassDiagram_adaptedPackageImpl#getUMLElement_adapted_diagramItem()
	 * @generated
	 */
	int UML_ELEMENT_ADAPTED_DIAGRAM_ITEM = 16;

	/**
	 * The feature id for the '<em><b>Valid In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ELEMENT_ADAPTED_DIAGRAM_ITEM__VALID_IN = HistoryPackage.EDGE_WITH_HISTORY__VALID_IN;

	/**
	 * The feature id for the '<em><b>Unhandled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ELEMENT_ADAPTED_DIAGRAM_ITEM__UNHANDLED = HistoryPackage.EDGE_WITH_HISTORY__UNHANDLED;

	/**
	 * The feature id for the '<em><b>In Projection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ELEMENT_ADAPTED_DIAGRAM_ITEM__IN_PROJECTION = HistoryPackage.EDGE_WITH_HISTORY__IN_PROJECTION;

	/**
	 * The feature id for the '<em><b>Edge Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ELEMENT_ADAPTED_DIAGRAM_ITEM__EDGE_SOURCE = HistoryPackage.EDGE_WITH_HISTORY__EDGE_SOURCE;

	/**
	 * The feature id for the '<em><b>Edge Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ELEMENT_ADAPTED_DIAGRAM_ITEM__EDGE_TARGET = HistoryPackage.EDGE_WITH_HISTORY__EDGE_TARGET;

	/**
	 * The feature id for the '<em><b>Is Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ELEMENT_ADAPTED_DIAGRAM_ITEM__IS_CONTAINMENT = HistoryPackage.EDGE_WITH_HISTORY__IS_CONTAINMENT;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ELEMENT_ADAPTED_DIAGRAM_ITEM__DIAGRAM = HistoryPackage.EDGE_WITH_HISTORY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>UML Element adapted diagram Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ELEMENT_ADAPTED_DIAGRAM_ITEM_FEATURE_COUNT = HistoryPackage.EDGE_WITH_HISTORY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>UML Element adapted diagram Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ELEMENT_ADAPTED_DIAGRAM_ITEM_OPERATION_COUNT = HistoryPackage.EDGE_WITH_HISTORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hpi.sam.classDiagram_adapted.impl.UMLIncrement_adapted_stereotypesItemImpl <em>UML Increment adapted stereotypes Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hpi.sam.classDiagram_adapted.impl.UMLIncrement_adapted_stereotypesItemImpl
	 * @see de.hpi.sam.classDiagram_adapted.impl.ClassDiagram_adaptedPackageImpl#getUMLIncrement_adapted_stereotypesItem()
	 * @generated
	 */
	int UML_INCREMENT_ADAPTED_STEREOTYPES_ITEM = 17;

	/**
	 * The feature id for the '<em><b>Valid In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INCREMENT_ADAPTED_STEREOTYPES_ITEM__VALID_IN = HistoryPackage.EDGE_WITH_HISTORY__VALID_IN;

	/**
	 * The feature id for the '<em><b>Unhandled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INCREMENT_ADAPTED_STEREOTYPES_ITEM__UNHANDLED = HistoryPackage.EDGE_WITH_HISTORY__UNHANDLED;

	/**
	 * The feature id for the '<em><b>In Projection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INCREMENT_ADAPTED_STEREOTYPES_ITEM__IN_PROJECTION = HistoryPackage.EDGE_WITH_HISTORY__IN_PROJECTION;

	/**
	 * The feature id for the '<em><b>Edge Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INCREMENT_ADAPTED_STEREOTYPES_ITEM__EDGE_SOURCE = HistoryPackage.EDGE_WITH_HISTORY__EDGE_SOURCE;

	/**
	 * The feature id for the '<em><b>Edge Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INCREMENT_ADAPTED_STEREOTYPES_ITEM__EDGE_TARGET = HistoryPackage.EDGE_WITH_HISTORY__EDGE_TARGET;

	/**
	 * The feature id for the '<em><b>Is Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INCREMENT_ADAPTED_STEREOTYPES_ITEM__IS_CONTAINMENT = HistoryPackage.EDGE_WITH_HISTORY__IS_CONTAINMENT;

	/**
	 * The feature id for the '<em><b>Stereotypes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INCREMENT_ADAPTED_STEREOTYPES_ITEM__STEREOTYPES = HistoryPackage.EDGE_WITH_HISTORY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>UML Increment adapted stereotypes Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INCREMENT_ADAPTED_STEREOTYPES_ITEM_FEATURE_COUNT = HistoryPackage.EDGE_WITH_HISTORY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>UML Increment adapted stereotypes Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_INCREMENT_ADAPTED_STEREOTYPES_ITEM_OPERATION_COUNT = HistoryPackage.EDGE_WITH_HISTORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hpi.sam.classDiagram_adapted.impl.UMLRole_adapted_adornmentValueImpl <em>UML Role adapted adornment Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hpi.sam.classDiagram_adapted.impl.UMLRole_adapted_adornmentValueImpl
	 * @see de.hpi.sam.classDiagram_adapted.impl.ClassDiagram_adaptedPackageImpl#getUMLRole_adapted_adornmentValue()
	 * @generated
	 */
	int UML_ROLE_ADAPTED_ADORNMENT_VALUE = 18;

	/**
	 * The feature id for the '<em><b>Valid In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ROLE_ADAPTED_ADORNMENT_VALUE__VALID_IN = HistoryPackage.ATTRIBUTE_WITH_HISTORY__VALID_IN;

	/**
	 * The feature id for the '<em><b>Unhandled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ROLE_ADAPTED_ADORNMENT_VALUE__UNHANDLED = HistoryPackage.ATTRIBUTE_WITH_HISTORY__UNHANDLED;

	/**
	 * The feature id for the '<em><b>In Projection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ROLE_ADAPTED_ADORNMENT_VALUE__IN_PROJECTION = HistoryPackage.ATTRIBUTE_WITH_HISTORY__IN_PROJECTION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ROLE_ADAPTED_ADORNMENT_VALUE__VALUE = HistoryPackage.ATTRIBUTE_WITH_HISTORY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>UML Role adapted adornment Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ROLE_ADAPTED_ADORNMENT_VALUE_FEATURE_COUNT = HistoryPackage.ATTRIBUTE_WITH_HISTORY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>UML Role adapted adornment Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ROLE_ADAPTED_ADORNMENT_VALUE_OPERATION_COUNT = HistoryPackage.ATTRIBUTE_WITH_HISTORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hpi.sam.classDiagram_adapted.impl.UMLRole_adapted_cardItemImpl <em>UML Role adapted card Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hpi.sam.classDiagram_adapted.impl.UMLRole_adapted_cardItemImpl
	 * @see de.hpi.sam.classDiagram_adapted.impl.ClassDiagram_adaptedPackageImpl#getUMLRole_adapted_cardItem()
	 * @generated
	 */
	int UML_ROLE_ADAPTED_CARD_ITEM = 19;

	/**
	 * The feature id for the '<em><b>Valid In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ROLE_ADAPTED_CARD_ITEM__VALID_IN = HistoryPackage.EDGE_WITH_HISTORY__VALID_IN;

	/**
	 * The feature id for the '<em><b>Unhandled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ROLE_ADAPTED_CARD_ITEM__UNHANDLED = HistoryPackage.EDGE_WITH_HISTORY__UNHANDLED;

	/**
	 * The feature id for the '<em><b>In Projection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ROLE_ADAPTED_CARD_ITEM__IN_PROJECTION = HistoryPackage.EDGE_WITH_HISTORY__IN_PROJECTION;

	/**
	 * The feature id for the '<em><b>Edge Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ROLE_ADAPTED_CARD_ITEM__EDGE_SOURCE = HistoryPackage.EDGE_WITH_HISTORY__EDGE_SOURCE;

	/**
	 * The feature id for the '<em><b>Edge Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ROLE_ADAPTED_CARD_ITEM__EDGE_TARGET = HistoryPackage.EDGE_WITH_HISTORY__EDGE_TARGET;

	/**
	 * The feature id for the '<em><b>Is Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ROLE_ADAPTED_CARD_ITEM__IS_CONTAINMENT = HistoryPackage.EDGE_WITH_HISTORY__IS_CONTAINMENT;

	/**
	 * The feature id for the '<em><b>Card</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ROLE_ADAPTED_CARD_ITEM__CARD = HistoryPackage.EDGE_WITH_HISTORY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>UML Role adapted card Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ROLE_ADAPTED_CARD_ITEM_FEATURE_COUNT = HistoryPackage.EDGE_WITH_HISTORY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>UML Role adapted card Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ROLE_ADAPTED_CARD_ITEM_OPERATION_COUNT = HistoryPackage.EDGE_WITH_HISTORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hpi.sam.classDiagram_adapted.impl.UMLRole_adapted_revLeftRoleItemImpl <em>UML Role adapted rev Left Role Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hpi.sam.classDiagram_adapted.impl.UMLRole_adapted_revLeftRoleItemImpl
	 * @see de.hpi.sam.classDiagram_adapted.impl.ClassDiagram_adaptedPackageImpl#getUMLRole_adapted_revLeftRoleItem()
	 * @generated
	 */
	int UML_ROLE_ADAPTED_REV_LEFT_ROLE_ITEM = 20;

	/**
	 * The feature id for the '<em><b>Valid In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ROLE_ADAPTED_REV_LEFT_ROLE_ITEM__VALID_IN = HistoryPackage.EDGE_WITH_HISTORY__VALID_IN;

	/**
	 * The feature id for the '<em><b>Unhandled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ROLE_ADAPTED_REV_LEFT_ROLE_ITEM__UNHANDLED = HistoryPackage.EDGE_WITH_HISTORY__UNHANDLED;

	/**
	 * The feature id for the '<em><b>In Projection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ROLE_ADAPTED_REV_LEFT_ROLE_ITEM__IN_PROJECTION = HistoryPackage.EDGE_WITH_HISTORY__IN_PROJECTION;

	/**
	 * The feature id for the '<em><b>Edge Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ROLE_ADAPTED_REV_LEFT_ROLE_ITEM__EDGE_SOURCE = HistoryPackage.EDGE_WITH_HISTORY__EDGE_SOURCE;

	/**
	 * The feature id for the '<em><b>Edge Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ROLE_ADAPTED_REV_LEFT_ROLE_ITEM__EDGE_TARGET = HistoryPackage.EDGE_WITH_HISTORY__EDGE_TARGET;

	/**
	 * The feature id for the '<em><b>Is Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ROLE_ADAPTED_REV_LEFT_ROLE_ITEM__IS_CONTAINMENT = HistoryPackage.EDGE_WITH_HISTORY__IS_CONTAINMENT;

	/**
	 * The feature id for the '<em><b>Rev Left Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ROLE_ADAPTED_REV_LEFT_ROLE_ITEM__REV_LEFT_ROLE = HistoryPackage.EDGE_WITH_HISTORY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>UML Role adapted rev Left Role Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ROLE_ADAPTED_REV_LEFT_ROLE_ITEM_FEATURE_COUNT = HistoryPackage.EDGE_WITH_HISTORY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>UML Role adapted rev Left Role Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ROLE_ADAPTED_REV_LEFT_ROLE_ITEM_OPERATION_COUNT = HistoryPackage.EDGE_WITH_HISTORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hpi.sam.classDiagram_adapted.impl.UMLRole_adapted_revRightRoleItemImpl <em>UML Role adapted rev Right Role Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hpi.sam.classDiagram_adapted.impl.UMLRole_adapted_revRightRoleItemImpl
	 * @see de.hpi.sam.classDiagram_adapted.impl.ClassDiagram_adaptedPackageImpl#getUMLRole_adapted_revRightRoleItem()
	 * @generated
	 */
	int UML_ROLE_ADAPTED_REV_RIGHT_ROLE_ITEM = 21;

	/**
	 * The feature id for the '<em><b>Valid In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ROLE_ADAPTED_REV_RIGHT_ROLE_ITEM__VALID_IN = HistoryPackage.EDGE_WITH_HISTORY__VALID_IN;

	/**
	 * The feature id for the '<em><b>Unhandled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ROLE_ADAPTED_REV_RIGHT_ROLE_ITEM__UNHANDLED = HistoryPackage.EDGE_WITH_HISTORY__UNHANDLED;

	/**
	 * The feature id for the '<em><b>In Projection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ROLE_ADAPTED_REV_RIGHT_ROLE_ITEM__IN_PROJECTION = HistoryPackage.EDGE_WITH_HISTORY__IN_PROJECTION;

	/**
	 * The feature id for the '<em><b>Edge Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ROLE_ADAPTED_REV_RIGHT_ROLE_ITEM__EDGE_SOURCE = HistoryPackage.EDGE_WITH_HISTORY__EDGE_SOURCE;

	/**
	 * The feature id for the '<em><b>Edge Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ROLE_ADAPTED_REV_RIGHT_ROLE_ITEM__EDGE_TARGET = HistoryPackage.EDGE_WITH_HISTORY__EDGE_TARGET;

	/**
	 * The feature id for the '<em><b>Is Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ROLE_ADAPTED_REV_RIGHT_ROLE_ITEM__IS_CONTAINMENT = HistoryPackage.EDGE_WITH_HISTORY__IS_CONTAINMENT;

	/**
	 * The feature id for the '<em><b>Rev Right Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ROLE_ADAPTED_REV_RIGHT_ROLE_ITEM__REV_RIGHT_ROLE = HistoryPackage.EDGE_WITH_HISTORY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>UML Role adapted rev Right Role Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ROLE_ADAPTED_REV_RIGHT_ROLE_ITEM_FEATURE_COUNT = HistoryPackage.EDGE_WITH_HISTORY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>UML Role adapted rev Right Role Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ROLE_ADAPTED_REV_RIGHT_ROLE_ITEM_OPERATION_COUNT = HistoryPackage.EDGE_WITH_HISTORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hpi.sam.classDiagram_adapted.impl.UMLRole_adapted_targetItemImpl <em>UML Role adapted target Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hpi.sam.classDiagram_adapted.impl.UMLRole_adapted_targetItemImpl
	 * @see de.hpi.sam.classDiagram_adapted.impl.ClassDiagram_adaptedPackageImpl#getUMLRole_adapted_targetItem()
	 * @generated
	 */
	int UML_ROLE_ADAPTED_TARGET_ITEM = 22;

	/**
	 * The feature id for the '<em><b>Valid In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ROLE_ADAPTED_TARGET_ITEM__VALID_IN = HistoryPackage.EDGE_WITH_HISTORY__VALID_IN;

	/**
	 * The feature id for the '<em><b>Unhandled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ROLE_ADAPTED_TARGET_ITEM__UNHANDLED = HistoryPackage.EDGE_WITH_HISTORY__UNHANDLED;

	/**
	 * The feature id for the '<em><b>In Projection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ROLE_ADAPTED_TARGET_ITEM__IN_PROJECTION = HistoryPackage.EDGE_WITH_HISTORY__IN_PROJECTION;

	/**
	 * The feature id for the '<em><b>Edge Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ROLE_ADAPTED_TARGET_ITEM__EDGE_SOURCE = HistoryPackage.EDGE_WITH_HISTORY__EDGE_SOURCE;

	/**
	 * The feature id for the '<em><b>Edge Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ROLE_ADAPTED_TARGET_ITEM__EDGE_TARGET = HistoryPackage.EDGE_WITH_HISTORY__EDGE_TARGET;

	/**
	 * The feature id for the '<em><b>Is Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ROLE_ADAPTED_TARGET_ITEM__IS_CONTAINMENT = HistoryPackage.EDGE_WITH_HISTORY__IS_CONTAINMENT;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ROLE_ADAPTED_TARGET_ITEM__TARGET = HistoryPackage.EDGE_WITH_HISTORY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>UML Role adapted target Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ROLE_ADAPTED_TARGET_ITEM_FEATURE_COUNT = HistoryPackage.EDGE_WITH_HISTORY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>UML Role adapted target Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ROLE_ADAPTED_TARGET_ITEM_OPERATION_COUNT = HistoryPackage.EDGE_WITH_HISTORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hpi.sam.classDiagram_adapted.impl.UMLStereotype_adapted_textValueImpl <em>UML Stereotype adapted text Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hpi.sam.classDiagram_adapted.impl.UMLStereotype_adapted_textValueImpl
	 * @see de.hpi.sam.classDiagram_adapted.impl.ClassDiagram_adaptedPackageImpl#getUMLStereotype_adapted_textValue()
	 * @generated
	 */
	int UML_STEREOTYPE_ADAPTED_TEXT_VALUE = 23;

	/**
	 * The feature id for the '<em><b>Valid In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STEREOTYPE_ADAPTED_TEXT_VALUE__VALID_IN = HistoryPackage.ATTRIBUTE_WITH_HISTORY__VALID_IN;

	/**
	 * The feature id for the '<em><b>Unhandled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STEREOTYPE_ADAPTED_TEXT_VALUE__UNHANDLED = HistoryPackage.ATTRIBUTE_WITH_HISTORY__UNHANDLED;

	/**
	 * The feature id for the '<em><b>In Projection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STEREOTYPE_ADAPTED_TEXT_VALUE__IN_PROJECTION = HistoryPackage.ATTRIBUTE_WITH_HISTORY__IN_PROJECTION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STEREOTYPE_ADAPTED_TEXT_VALUE__VALUE = HistoryPackage.ATTRIBUTE_WITH_HISTORY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>UML Stereotype adapted text Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STEREOTYPE_ADAPTED_TEXT_VALUE_FEATURE_COUNT = HistoryPackage.ATTRIBUTE_WITH_HISTORY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>UML Stereotype adapted text Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STEREOTYPE_ADAPTED_TEXT_VALUE_OPERATION_COUNT = HistoryPackage.ATTRIBUTE_WITH_HISTORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.hpi.sam.classDiagram_adapted.impl.UMLStereotype_adapted_incrementItemImpl <em>UML Stereotype adapted increment Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hpi.sam.classDiagram_adapted.impl.UMLStereotype_adapted_incrementItemImpl
	 * @see de.hpi.sam.classDiagram_adapted.impl.ClassDiagram_adaptedPackageImpl#getUMLStereotype_adapted_incrementItem()
	 * @generated
	 */
	int UML_STEREOTYPE_ADAPTED_INCREMENT_ITEM = 24;

	/**
	 * The feature id for the '<em><b>Valid In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STEREOTYPE_ADAPTED_INCREMENT_ITEM__VALID_IN = HistoryPackage.EDGE_WITH_HISTORY__VALID_IN;

	/**
	 * The feature id for the '<em><b>Unhandled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STEREOTYPE_ADAPTED_INCREMENT_ITEM__UNHANDLED = HistoryPackage.EDGE_WITH_HISTORY__UNHANDLED;

	/**
	 * The feature id for the '<em><b>In Projection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STEREOTYPE_ADAPTED_INCREMENT_ITEM__IN_PROJECTION = HistoryPackage.EDGE_WITH_HISTORY__IN_PROJECTION;

	/**
	 * The feature id for the '<em><b>Edge Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STEREOTYPE_ADAPTED_INCREMENT_ITEM__EDGE_SOURCE = HistoryPackage.EDGE_WITH_HISTORY__EDGE_SOURCE;

	/**
	 * The feature id for the '<em><b>Edge Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STEREOTYPE_ADAPTED_INCREMENT_ITEM__EDGE_TARGET = HistoryPackage.EDGE_WITH_HISTORY__EDGE_TARGET;

	/**
	 * The feature id for the '<em><b>Is Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STEREOTYPE_ADAPTED_INCREMENT_ITEM__IS_CONTAINMENT = HistoryPackage.EDGE_WITH_HISTORY__IS_CONTAINMENT;

	/**
	 * The feature id for the '<em><b>Increment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STEREOTYPE_ADAPTED_INCREMENT_ITEM__INCREMENT = HistoryPackage.EDGE_WITH_HISTORY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>UML Stereotype adapted increment Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STEREOTYPE_ADAPTED_INCREMENT_ITEM_FEATURE_COUNT = HistoryPackage.EDGE_WITH_HISTORY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>UML Stereotype adapted increment Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_STEREOTYPE_ADAPTED_INCREMENT_ITEM_OPERATION_COUNT = HistoryPackage.EDGE_WITH_HISTORY_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.hpi.sam.classDiagram_adapted.UMLAssoc_adapted <em>UML Assoc adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML Assoc adapted</em>'.
	 * @see de.hpi.sam.classDiagram_adapted.UMLAssoc_adapted
	 * @generated
	 */
	EClass getUMLAssoc_adapted();

	/**
	 * Returns the meta object for the reference list '{@link de.hpi.sam.classDiagram_adapted.UMLAssoc_adapted#getLeftRole <em>Left Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Left Role</em>'.
	 * @see de.hpi.sam.classDiagram_adapted.UMLAssoc_adapted#getLeftRole()
	 * @see #getUMLAssoc_adapted()
	 * @generated
	 */
	EReference getUMLAssoc_adapted_LeftRole();

	/**
	 * Returns the meta object for the reference list '{@link de.hpi.sam.classDiagram_adapted.UMLAssoc_adapted#getRightRole <em>Right Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Right Role</em>'.
	 * @see de.hpi.sam.classDiagram_adapted.UMLAssoc_adapted#getRightRole()
	 * @see #getUMLAssoc_adapted()
	 * @generated
	 */
	EReference getUMLAssoc_adapted_RightRole();

	/**
	 * Returns the meta object for class '{@link de.hpi.sam.classDiagram_adapted.UMLCardinality_adapted <em>UML Cardinality adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML Cardinality adapted</em>'.
	 * @see de.hpi.sam.classDiagram_adapted.UMLCardinality_adapted
	 * @generated
	 */
	EClass getUMLCardinality_adapted();

	/**
	 * Returns the meta object for the reference list '{@link de.hpi.sam.classDiagram_adapted.UMLCardinality_adapted#getCardString <em>Card String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Card String</em>'.
	 * @see de.hpi.sam.classDiagram_adapted.UMLCardinality_adapted#getCardString()
	 * @see #getUMLCardinality_adapted()
	 * @generated
	 */
	EReference getUMLCardinality_adapted_CardString();

	/**
	 * Returns the meta object for the reference list '{@link de.hpi.sam.classDiagram_adapted.UMLCardinality_adapted#getRevCard <em>Rev Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rev Card</em>'.
	 * @see de.hpi.sam.classDiagram_adapted.UMLCardinality_adapted#getRevCard()
	 * @see #getUMLCardinality_adapted()
	 * @generated
	 */
	EReference getUMLCardinality_adapted_RevCard();

	/**
	 * Returns the meta object for class '{@link de.hpi.sam.classDiagram_adapted.UMLClassDiagram_adapted <em>UML Class Diagram adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML Class Diagram adapted</em>'.
	 * @see de.hpi.sam.classDiagram_adapted.UMLClassDiagram_adapted
	 * @generated
	 */
	EClass getUMLClassDiagram_adapted();

	/**
	 * Returns the meta object for the reference list '{@link de.hpi.sam.classDiagram_adapted.UMLClassDiagram_adapted#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elements</em>'.
	 * @see de.hpi.sam.classDiagram_adapted.UMLClassDiagram_adapted#getElements()
	 * @see #getUMLClassDiagram_adapted()
	 * @generated
	 */
	EReference getUMLClassDiagram_adapted_Elements();

	/**
	 * Returns the meta object for class '{@link de.hpi.sam.classDiagram_adapted.UMLClass_adapted <em>UML Class adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML Class adapted</em>'.
	 * @see de.hpi.sam.classDiagram_adapted.UMLClass_adapted
	 * @generated
	 */
	EClass getUMLClass_adapted();

	/**
	 * Returns the meta object for the reference list '{@link de.hpi.sam.classDiagram_adapted.UMLClass_adapted#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roles</em>'.
	 * @see de.hpi.sam.classDiagram_adapted.UMLClass_adapted#getRoles()
	 * @see #getUMLClass_adapted()
	 * @generated
	 */
	EReference getUMLClass_adapted_Roles();

	/**
	 * Returns the meta object for class '{@link de.hpi.sam.classDiagram_adapted.UMLDiagramItem_adapted <em>UML Diagram Item adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML Diagram Item adapted</em>'.
	 * @see de.hpi.sam.classDiagram_adapted.UMLDiagramItem_adapted
	 * @generated
	 */
	EClass getUMLDiagramItem_adapted();

	/**
	 * Returns the meta object for class '{@link de.hpi.sam.classDiagram_adapted.UMLElement_adapted <em>UML Element adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML Element adapted</em>'.
	 * @see de.hpi.sam.classDiagram_adapted.UMLElement_adapted
	 * @generated
	 */
	EClass getUMLElement_adapted();

	/**
	 * Returns the meta object for the reference list '{@link de.hpi.sam.classDiagram_adapted.UMLElement_adapted#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Name</em>'.
	 * @see de.hpi.sam.classDiagram_adapted.UMLElement_adapted#getName()
	 * @see #getUMLElement_adapted()
	 * @generated
	 */
	EReference getUMLElement_adapted_Name();

	/**
	 * Returns the meta object for the reference list '{@link de.hpi.sam.classDiagram_adapted.UMLElement_adapted#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Diagram</em>'.
	 * @see de.hpi.sam.classDiagram_adapted.UMLElement_adapted#getDiagram()
	 * @see #getUMLElement_adapted()
	 * @generated
	 */
	EReference getUMLElement_adapted_Diagram();

	/**
	 * Returns the meta object for class '{@link de.hpi.sam.classDiagram_adapted.UMLIncrement_adapted <em>UML Increment adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML Increment adapted</em>'.
	 * @see de.hpi.sam.classDiagram_adapted.UMLIncrement_adapted
	 * @generated
	 */
	EClass getUMLIncrement_adapted();

	/**
	 * Returns the meta object for the reference list '{@link de.hpi.sam.classDiagram_adapted.UMLIncrement_adapted#getStereotypes <em>Stereotypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stereotypes</em>'.
	 * @see de.hpi.sam.classDiagram_adapted.UMLIncrement_adapted#getStereotypes()
	 * @see #getUMLIncrement_adapted()
	 * @generated
	 */
	EReference getUMLIncrement_adapted_Stereotypes();

	/**
	 * Returns the meta object for class '{@link de.hpi.sam.classDiagram_adapted.UMLRole_adapted <em>UML Role adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML Role adapted</em>'.
	 * @see de.hpi.sam.classDiagram_adapted.UMLRole_adapted
	 * @generated
	 */
	EClass getUMLRole_adapted();

	/**
	 * Returns the meta object for the reference list '{@link de.hpi.sam.classDiagram_adapted.UMLRole_adapted#getAdornment <em>Adornment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Adornment</em>'.
	 * @see de.hpi.sam.classDiagram_adapted.UMLRole_adapted#getAdornment()
	 * @see #getUMLRole_adapted()
	 * @generated
	 */
	EReference getUMLRole_adapted_Adornment();

	/**
	 * Returns the meta object for the reference list '{@link de.hpi.sam.classDiagram_adapted.UMLRole_adapted#getCard <em>Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Card</em>'.
	 * @see de.hpi.sam.classDiagram_adapted.UMLRole_adapted#getCard()
	 * @see #getUMLRole_adapted()
	 * @generated
	 */
	EReference getUMLRole_adapted_Card();

	/**
	 * Returns the meta object for the reference list '{@link de.hpi.sam.classDiagram_adapted.UMLRole_adapted#getRevLeftRole <em>Rev Left Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rev Left Role</em>'.
	 * @see de.hpi.sam.classDiagram_adapted.UMLRole_adapted#getRevLeftRole()
	 * @see #getUMLRole_adapted()
	 * @generated
	 */
	EReference getUMLRole_adapted_RevLeftRole();

	/**
	 * Returns the meta object for the reference list '{@link de.hpi.sam.classDiagram_adapted.UMLRole_adapted#getRevRightRole <em>Rev Right Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rev Right Role</em>'.
	 * @see de.hpi.sam.classDiagram_adapted.UMLRole_adapted#getRevRightRole()
	 * @see #getUMLRole_adapted()
	 * @generated
	 */
	EReference getUMLRole_adapted_RevRightRole();

	/**
	 * Returns the meta object for the reference list '{@link de.hpi.sam.classDiagram_adapted.UMLRole_adapted#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see de.hpi.sam.classDiagram_adapted.UMLRole_adapted#getTarget()
	 * @see #getUMLRole_adapted()
	 * @generated
	 */
	EReference getUMLRole_adapted_Target();

	/**
	 * Returns the meta object for class '{@link de.hpi.sam.classDiagram_adapted.UMLStereotype_adapted <em>UML Stereotype adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML Stereotype adapted</em>'.
	 * @see de.hpi.sam.classDiagram_adapted.UMLStereotype_adapted
	 * @generated
	 */
	EClass getUMLStereotype_adapted();

	/**
	 * Returns the meta object for the reference list '{@link de.hpi.sam.classDiagram_adapted.UMLStereotype_adapted#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Text</em>'.
	 * @see de.hpi.sam.classDiagram_adapted.UMLStereotype_adapted#getText()
	 * @see #getUMLStereotype_adapted()
	 * @generated
	 */
	EReference getUMLStereotype_adapted_Text();

	/**
	 * Returns the meta object for the reference list '{@link de.hpi.sam.classDiagram_adapted.UMLStereotype_adapted#getIncrement <em>Increment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Increment</em>'.
	 * @see de.hpi.sam.classDiagram_adapted.UMLStereotype_adapted#getIncrement()
	 * @see #getUMLStereotype_adapted()
	 * @generated
	 */
	EReference getUMLStereotype_adapted_Increment();

	/**
	 * Returns the meta object for class '{@link de.hpi.sam.classDiagram_adapted.UMLAssoc_adapted_leftRoleItem <em>UML Assoc adapted left Role Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML Assoc adapted left Role Item</em>'.
	 * @see de.hpi.sam.classDiagram_adapted.UMLAssoc_adapted_leftRoleItem
	 * @generated
	 */
	EClass getUMLAssoc_adapted_leftRoleItem();

	/**
	 * Returns the meta object for the reference '{@link de.hpi.sam.classDiagram_adapted.UMLAssoc_adapted_leftRoleItem#getLeftRole <em>Left Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left Role</em>'.
	 * @see de.hpi.sam.classDiagram_adapted.UMLAssoc_adapted_leftRoleItem#getLeftRole()
	 * @see #getUMLAssoc_adapted_leftRoleItem()
	 * @generated
	 */
	EReference getUMLAssoc_adapted_leftRoleItem_LeftRole();

	/**
	 * Returns the meta object for class '{@link de.hpi.sam.classDiagram_adapted.UMLAssoc_adapted_rightRoleItem <em>UML Assoc adapted right Role Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML Assoc adapted right Role Item</em>'.
	 * @see de.hpi.sam.classDiagram_adapted.UMLAssoc_adapted_rightRoleItem
	 * @generated
	 */
	EClass getUMLAssoc_adapted_rightRoleItem();

	/**
	 * Returns the meta object for the reference '{@link de.hpi.sam.classDiagram_adapted.UMLAssoc_adapted_rightRoleItem#getRightRole <em>Right Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right Role</em>'.
	 * @see de.hpi.sam.classDiagram_adapted.UMLAssoc_adapted_rightRoleItem#getRightRole()
	 * @see #getUMLAssoc_adapted_rightRoleItem()
	 * @generated
	 */
	EReference getUMLAssoc_adapted_rightRoleItem_RightRole();

	/**
	 * Returns the meta object for class '{@link de.hpi.sam.classDiagram_adapted.UMLCardinality_adapted_cardStringValue <em>UML Cardinality adapted card String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML Cardinality adapted card String Value</em>'.
	 * @see de.hpi.sam.classDiagram_adapted.UMLCardinality_adapted_cardStringValue
	 * @generated
	 */
	EClass getUMLCardinality_adapted_cardStringValue();

	/**
	 * Returns the meta object for the attribute '{@link de.hpi.sam.classDiagram_adapted.UMLCardinality_adapted_cardStringValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.hpi.sam.classDiagram_adapted.UMLCardinality_adapted_cardStringValue#getValue()
	 * @see #getUMLCardinality_adapted_cardStringValue()
	 * @generated
	 */
	EAttribute getUMLCardinality_adapted_cardStringValue_Value();

	/**
	 * Returns the meta object for class '{@link de.hpi.sam.classDiagram_adapted.UMLCardinality_adapted_revCardItem <em>UML Cardinality adapted rev Card Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML Cardinality adapted rev Card Item</em>'.
	 * @see de.hpi.sam.classDiagram_adapted.UMLCardinality_adapted_revCardItem
	 * @generated
	 */
	EClass getUMLCardinality_adapted_revCardItem();

	/**
	 * Returns the meta object for the reference '{@link de.hpi.sam.classDiagram_adapted.UMLCardinality_adapted_revCardItem#getRevCard <em>Rev Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rev Card</em>'.
	 * @see de.hpi.sam.classDiagram_adapted.UMLCardinality_adapted_revCardItem#getRevCard()
	 * @see #getUMLCardinality_adapted_revCardItem()
	 * @generated
	 */
	EReference getUMLCardinality_adapted_revCardItem_RevCard();

	/**
	 * Returns the meta object for class '{@link de.hpi.sam.classDiagram_adapted.UMLClassDiagram_adapted_elementsItem <em>UML Class Diagram adapted elements Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML Class Diagram adapted elements Item</em>'.
	 * @see de.hpi.sam.classDiagram_adapted.UMLClassDiagram_adapted_elementsItem
	 * @generated
	 */
	EClass getUMLClassDiagram_adapted_elementsItem();

	/**
	 * Returns the meta object for the reference '{@link de.hpi.sam.classDiagram_adapted.UMLClassDiagram_adapted_elementsItem#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Elements</em>'.
	 * @see de.hpi.sam.classDiagram_adapted.UMLClassDiagram_adapted_elementsItem#getElements()
	 * @see #getUMLClassDiagram_adapted_elementsItem()
	 * @generated
	 */
	EReference getUMLClassDiagram_adapted_elementsItem_Elements();

	/**
	 * Returns the meta object for class '{@link de.hpi.sam.classDiagram_adapted.UMLClass_adapted_rolesItem <em>UML Class adapted roles Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML Class adapted roles Item</em>'.
	 * @see de.hpi.sam.classDiagram_adapted.UMLClass_adapted_rolesItem
	 * @generated
	 */
	EClass getUMLClass_adapted_rolesItem();

	/**
	 * Returns the meta object for the reference '{@link de.hpi.sam.classDiagram_adapted.UMLClass_adapted_rolesItem#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Roles</em>'.
	 * @see de.hpi.sam.classDiagram_adapted.UMLClass_adapted_rolesItem#getRoles()
	 * @see #getUMLClass_adapted_rolesItem()
	 * @generated
	 */
	EReference getUMLClass_adapted_rolesItem_Roles();

	/**
	 * Returns the meta object for class '{@link de.hpi.sam.classDiagram_adapted.UMLElement_adapted_nameValue <em>UML Element adapted name Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML Element adapted name Value</em>'.
	 * @see de.hpi.sam.classDiagram_adapted.UMLElement_adapted_nameValue
	 * @generated
	 */
	EClass getUMLElement_adapted_nameValue();

	/**
	 * Returns the meta object for the attribute '{@link de.hpi.sam.classDiagram_adapted.UMLElement_adapted_nameValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.hpi.sam.classDiagram_adapted.UMLElement_adapted_nameValue#getValue()
	 * @see #getUMLElement_adapted_nameValue()
	 * @generated
	 */
	EAttribute getUMLElement_adapted_nameValue_Value();

	/**
	 * Returns the meta object for class '{@link de.hpi.sam.classDiagram_adapted.UMLElement_adapted_diagramItem <em>UML Element adapted diagram Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML Element adapted diagram Item</em>'.
	 * @see de.hpi.sam.classDiagram_adapted.UMLElement_adapted_diagramItem
	 * @generated
	 */
	EClass getUMLElement_adapted_diagramItem();

	/**
	 * Returns the meta object for the reference '{@link de.hpi.sam.classDiagram_adapted.UMLElement_adapted_diagramItem#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Diagram</em>'.
	 * @see de.hpi.sam.classDiagram_adapted.UMLElement_adapted_diagramItem#getDiagram()
	 * @see #getUMLElement_adapted_diagramItem()
	 * @generated
	 */
	EReference getUMLElement_adapted_diagramItem_Diagram();

	/**
	 * Returns the meta object for class '{@link de.hpi.sam.classDiagram_adapted.UMLIncrement_adapted_stereotypesItem <em>UML Increment adapted stereotypes Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML Increment adapted stereotypes Item</em>'.
	 * @see de.hpi.sam.classDiagram_adapted.UMLIncrement_adapted_stereotypesItem
	 * @generated
	 */
	EClass getUMLIncrement_adapted_stereotypesItem();

	/**
	 * Returns the meta object for the reference '{@link de.hpi.sam.classDiagram_adapted.UMLIncrement_adapted_stereotypesItem#getStereotypes <em>Stereotypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Stereotypes</em>'.
	 * @see de.hpi.sam.classDiagram_adapted.UMLIncrement_adapted_stereotypesItem#getStereotypes()
	 * @see #getUMLIncrement_adapted_stereotypesItem()
	 * @generated
	 */
	EReference getUMLIncrement_adapted_stereotypesItem_Stereotypes();

	/**
	 * Returns the meta object for class '{@link de.hpi.sam.classDiagram_adapted.UMLRole_adapted_adornmentValue <em>UML Role adapted adornment Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML Role adapted adornment Value</em>'.
	 * @see de.hpi.sam.classDiagram_adapted.UMLRole_adapted_adornmentValue
	 * @generated
	 */
	EClass getUMLRole_adapted_adornmentValue();

	/**
	 * Returns the meta object for the attribute '{@link de.hpi.sam.classDiagram_adapted.UMLRole_adapted_adornmentValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.hpi.sam.classDiagram_adapted.UMLRole_adapted_adornmentValue#getValue()
	 * @see #getUMLRole_adapted_adornmentValue()
	 * @generated
	 */
	EAttribute getUMLRole_adapted_adornmentValue_Value();

	/**
	 * Returns the meta object for class '{@link de.hpi.sam.classDiagram_adapted.UMLRole_adapted_cardItem <em>UML Role adapted card Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML Role adapted card Item</em>'.
	 * @see de.hpi.sam.classDiagram_adapted.UMLRole_adapted_cardItem
	 * @generated
	 */
	EClass getUMLRole_adapted_cardItem();

	/**
	 * Returns the meta object for the reference '{@link de.hpi.sam.classDiagram_adapted.UMLRole_adapted_cardItem#getCard <em>Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Card</em>'.
	 * @see de.hpi.sam.classDiagram_adapted.UMLRole_adapted_cardItem#getCard()
	 * @see #getUMLRole_adapted_cardItem()
	 * @generated
	 */
	EReference getUMLRole_adapted_cardItem_Card();

	/**
	 * Returns the meta object for class '{@link de.hpi.sam.classDiagram_adapted.UMLRole_adapted_revLeftRoleItem <em>UML Role adapted rev Left Role Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML Role adapted rev Left Role Item</em>'.
	 * @see de.hpi.sam.classDiagram_adapted.UMLRole_adapted_revLeftRoleItem
	 * @generated
	 */
	EClass getUMLRole_adapted_revLeftRoleItem();

	/**
	 * Returns the meta object for the reference '{@link de.hpi.sam.classDiagram_adapted.UMLRole_adapted_revLeftRoleItem#getRevLeftRole <em>Rev Left Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rev Left Role</em>'.
	 * @see de.hpi.sam.classDiagram_adapted.UMLRole_adapted_revLeftRoleItem#getRevLeftRole()
	 * @see #getUMLRole_adapted_revLeftRoleItem()
	 * @generated
	 */
	EReference getUMLRole_adapted_revLeftRoleItem_RevLeftRole();

	/**
	 * Returns the meta object for class '{@link de.hpi.sam.classDiagram_adapted.UMLRole_adapted_revRightRoleItem <em>UML Role adapted rev Right Role Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML Role adapted rev Right Role Item</em>'.
	 * @see de.hpi.sam.classDiagram_adapted.UMLRole_adapted_revRightRoleItem
	 * @generated
	 */
	EClass getUMLRole_adapted_revRightRoleItem();

	/**
	 * Returns the meta object for the reference '{@link de.hpi.sam.classDiagram_adapted.UMLRole_adapted_revRightRoleItem#getRevRightRole <em>Rev Right Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rev Right Role</em>'.
	 * @see de.hpi.sam.classDiagram_adapted.UMLRole_adapted_revRightRoleItem#getRevRightRole()
	 * @see #getUMLRole_adapted_revRightRoleItem()
	 * @generated
	 */
	EReference getUMLRole_adapted_revRightRoleItem_RevRightRole();

	/**
	 * Returns the meta object for class '{@link de.hpi.sam.classDiagram_adapted.UMLRole_adapted_targetItem <em>UML Role adapted target Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML Role adapted target Item</em>'.
	 * @see de.hpi.sam.classDiagram_adapted.UMLRole_adapted_targetItem
	 * @generated
	 */
	EClass getUMLRole_adapted_targetItem();

	/**
	 * Returns the meta object for the reference '{@link de.hpi.sam.classDiagram_adapted.UMLRole_adapted_targetItem#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see de.hpi.sam.classDiagram_adapted.UMLRole_adapted_targetItem#getTarget()
	 * @see #getUMLRole_adapted_targetItem()
	 * @generated
	 */
	EReference getUMLRole_adapted_targetItem_Target();

	/**
	 * Returns the meta object for class '{@link de.hpi.sam.classDiagram_adapted.UMLStereotype_adapted_textValue <em>UML Stereotype adapted text Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML Stereotype adapted text Value</em>'.
	 * @see de.hpi.sam.classDiagram_adapted.UMLStereotype_adapted_textValue
	 * @generated
	 */
	EClass getUMLStereotype_adapted_textValue();

	/**
	 * Returns the meta object for the attribute '{@link de.hpi.sam.classDiagram_adapted.UMLStereotype_adapted_textValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.hpi.sam.classDiagram_adapted.UMLStereotype_adapted_textValue#getValue()
	 * @see #getUMLStereotype_adapted_textValue()
	 * @generated
	 */
	EAttribute getUMLStereotype_adapted_textValue_Value();

	/**
	 * Returns the meta object for class '{@link de.hpi.sam.classDiagram_adapted.UMLStereotype_adapted_incrementItem <em>UML Stereotype adapted increment Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML Stereotype adapted increment Item</em>'.
	 * @see de.hpi.sam.classDiagram_adapted.UMLStereotype_adapted_incrementItem
	 * @generated
	 */
	EClass getUMLStereotype_adapted_incrementItem();

	/**
	 * Returns the meta object for the reference '{@link de.hpi.sam.classDiagram_adapted.UMLStereotype_adapted_incrementItem#getIncrement <em>Increment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Increment</em>'.
	 * @see de.hpi.sam.classDiagram_adapted.UMLStereotype_adapted_incrementItem#getIncrement()
	 * @see #getUMLStereotype_adapted_incrementItem()
	 * @generated
	 */
	EReference getUMLStereotype_adapted_incrementItem_Increment();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ClassDiagram_adaptedFactory getClassDiagram_adaptedFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.hpi.sam.classDiagram_adapted.impl.UMLAssoc_adaptedImpl <em>UML Assoc adapted</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hpi.sam.classDiagram_adapted.impl.UMLAssoc_adaptedImpl
		 * @see de.hpi.sam.classDiagram_adapted.impl.ClassDiagram_adaptedPackageImpl#getUMLAssoc_adapted()
		 * @generated
		 */
		EClass UML_ASSOC_ADAPTED = eINSTANCE.getUMLAssoc_adapted();

		/**
		 * The meta object literal for the '<em><b>Left Role</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_ASSOC_ADAPTED__LEFT_ROLE = eINSTANCE.getUMLAssoc_adapted_LeftRole();

		/**
		 * The meta object literal for the '<em><b>Right Role</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_ASSOC_ADAPTED__RIGHT_ROLE = eINSTANCE.getUMLAssoc_adapted_RightRole();

		/**
		 * The meta object literal for the '{@link de.hpi.sam.classDiagram_adapted.impl.UMLCardinality_adaptedImpl <em>UML Cardinality adapted</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hpi.sam.classDiagram_adapted.impl.UMLCardinality_adaptedImpl
		 * @see de.hpi.sam.classDiagram_adapted.impl.ClassDiagram_adaptedPackageImpl#getUMLCardinality_adapted()
		 * @generated
		 */
		EClass UML_CARDINALITY_ADAPTED = eINSTANCE.getUMLCardinality_adapted();

		/**
		 * The meta object literal for the '<em><b>Card String</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_CARDINALITY_ADAPTED__CARD_STRING = eINSTANCE.getUMLCardinality_adapted_CardString();

		/**
		 * The meta object literal for the '<em><b>Rev Card</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_CARDINALITY_ADAPTED__REV_CARD = eINSTANCE.getUMLCardinality_adapted_RevCard();

		/**
		 * The meta object literal for the '{@link de.hpi.sam.classDiagram_adapted.impl.UMLClassDiagram_adaptedImpl <em>UML Class Diagram adapted</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hpi.sam.classDiagram_adapted.impl.UMLClassDiagram_adaptedImpl
		 * @see de.hpi.sam.classDiagram_adapted.impl.ClassDiagram_adaptedPackageImpl#getUMLClassDiagram_adapted()
		 * @generated
		 */
		EClass UML_CLASS_DIAGRAM_ADAPTED = eINSTANCE.getUMLClassDiagram_adapted();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_CLASS_DIAGRAM_ADAPTED__ELEMENTS = eINSTANCE.getUMLClassDiagram_adapted_Elements();

		/**
		 * The meta object literal for the '{@link de.hpi.sam.classDiagram_adapted.impl.UMLClass_adaptedImpl <em>UML Class adapted</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hpi.sam.classDiagram_adapted.impl.UMLClass_adaptedImpl
		 * @see de.hpi.sam.classDiagram_adapted.impl.ClassDiagram_adaptedPackageImpl#getUMLClass_adapted()
		 * @generated
		 */
		EClass UML_CLASS_ADAPTED = eINSTANCE.getUMLClass_adapted();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_CLASS_ADAPTED__ROLES = eINSTANCE.getUMLClass_adapted_Roles();

		/**
		 * The meta object literal for the '{@link de.hpi.sam.classDiagram_adapted.impl.UMLDiagramItem_adaptedImpl <em>UML Diagram Item adapted</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hpi.sam.classDiagram_adapted.impl.UMLDiagramItem_adaptedImpl
		 * @see de.hpi.sam.classDiagram_adapted.impl.ClassDiagram_adaptedPackageImpl#getUMLDiagramItem_adapted()
		 * @generated
		 */
		EClass UML_DIAGRAM_ITEM_ADAPTED = eINSTANCE.getUMLDiagramItem_adapted();

		/**
		 * The meta object literal for the '{@link de.hpi.sam.classDiagram_adapted.impl.UMLElement_adaptedImpl <em>UML Element adapted</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hpi.sam.classDiagram_adapted.impl.UMLElement_adaptedImpl
		 * @see de.hpi.sam.classDiagram_adapted.impl.ClassDiagram_adaptedPackageImpl#getUMLElement_adapted()
		 * @generated
		 */
		EClass UML_ELEMENT_ADAPTED = eINSTANCE.getUMLElement_adapted();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_ELEMENT_ADAPTED__NAME = eINSTANCE.getUMLElement_adapted_Name();

		/**
		 * The meta object literal for the '<em><b>Diagram</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_ELEMENT_ADAPTED__DIAGRAM = eINSTANCE.getUMLElement_adapted_Diagram();

		/**
		 * The meta object literal for the '{@link de.hpi.sam.classDiagram_adapted.impl.UMLIncrement_adaptedImpl <em>UML Increment adapted</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hpi.sam.classDiagram_adapted.impl.UMLIncrement_adaptedImpl
		 * @see de.hpi.sam.classDiagram_adapted.impl.ClassDiagram_adaptedPackageImpl#getUMLIncrement_adapted()
		 * @generated
		 */
		EClass UML_INCREMENT_ADAPTED = eINSTANCE.getUMLIncrement_adapted();

		/**
		 * The meta object literal for the '<em><b>Stereotypes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_INCREMENT_ADAPTED__STEREOTYPES = eINSTANCE.getUMLIncrement_adapted_Stereotypes();

		/**
		 * The meta object literal for the '{@link de.hpi.sam.classDiagram_adapted.impl.UMLRole_adaptedImpl <em>UML Role adapted</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hpi.sam.classDiagram_adapted.impl.UMLRole_adaptedImpl
		 * @see de.hpi.sam.classDiagram_adapted.impl.ClassDiagram_adaptedPackageImpl#getUMLRole_adapted()
		 * @generated
		 */
		EClass UML_ROLE_ADAPTED = eINSTANCE.getUMLRole_adapted();

		/**
		 * The meta object literal for the '<em><b>Adornment</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_ROLE_ADAPTED__ADORNMENT = eINSTANCE.getUMLRole_adapted_Adornment();

		/**
		 * The meta object literal for the '<em><b>Card</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_ROLE_ADAPTED__CARD = eINSTANCE.getUMLRole_adapted_Card();

		/**
		 * The meta object literal for the '<em><b>Rev Left Role</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_ROLE_ADAPTED__REV_LEFT_ROLE = eINSTANCE.getUMLRole_adapted_RevLeftRole();

		/**
		 * The meta object literal for the '<em><b>Rev Right Role</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_ROLE_ADAPTED__REV_RIGHT_ROLE = eINSTANCE.getUMLRole_adapted_RevRightRole();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_ROLE_ADAPTED__TARGET = eINSTANCE.getUMLRole_adapted_Target();

		/**
		 * The meta object literal for the '{@link de.hpi.sam.classDiagram_adapted.impl.UMLStereotype_adaptedImpl <em>UML Stereotype adapted</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hpi.sam.classDiagram_adapted.impl.UMLStereotype_adaptedImpl
		 * @see de.hpi.sam.classDiagram_adapted.impl.ClassDiagram_adaptedPackageImpl#getUMLStereotype_adapted()
		 * @generated
		 */
		EClass UML_STEREOTYPE_ADAPTED = eINSTANCE.getUMLStereotype_adapted();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_STEREOTYPE_ADAPTED__TEXT = eINSTANCE.getUMLStereotype_adapted_Text();

		/**
		 * The meta object literal for the '<em><b>Increment</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_STEREOTYPE_ADAPTED__INCREMENT = eINSTANCE.getUMLStereotype_adapted_Increment();

		/**
		 * The meta object literal for the '{@link de.hpi.sam.classDiagram_adapted.impl.UMLAssoc_adapted_leftRoleItemImpl <em>UML Assoc adapted left Role Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hpi.sam.classDiagram_adapted.impl.UMLAssoc_adapted_leftRoleItemImpl
		 * @see de.hpi.sam.classDiagram_adapted.impl.ClassDiagram_adaptedPackageImpl#getUMLAssoc_adapted_leftRoleItem()
		 * @generated
		 */
		EClass UML_ASSOC_ADAPTED_LEFT_ROLE_ITEM = eINSTANCE.getUMLAssoc_adapted_leftRoleItem();

		/**
		 * The meta object literal for the '<em><b>Left Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_ASSOC_ADAPTED_LEFT_ROLE_ITEM__LEFT_ROLE = eINSTANCE.getUMLAssoc_adapted_leftRoleItem_LeftRole();

		/**
		 * The meta object literal for the '{@link de.hpi.sam.classDiagram_adapted.impl.UMLAssoc_adapted_rightRoleItemImpl <em>UML Assoc adapted right Role Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hpi.sam.classDiagram_adapted.impl.UMLAssoc_adapted_rightRoleItemImpl
		 * @see de.hpi.sam.classDiagram_adapted.impl.ClassDiagram_adaptedPackageImpl#getUMLAssoc_adapted_rightRoleItem()
		 * @generated
		 */
		EClass UML_ASSOC_ADAPTED_RIGHT_ROLE_ITEM = eINSTANCE.getUMLAssoc_adapted_rightRoleItem();

		/**
		 * The meta object literal for the '<em><b>Right Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_ASSOC_ADAPTED_RIGHT_ROLE_ITEM__RIGHT_ROLE = eINSTANCE.getUMLAssoc_adapted_rightRoleItem_RightRole();

		/**
		 * The meta object literal for the '{@link de.hpi.sam.classDiagram_adapted.impl.UMLCardinality_adapted_cardStringValueImpl <em>UML Cardinality adapted card String Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hpi.sam.classDiagram_adapted.impl.UMLCardinality_adapted_cardStringValueImpl
		 * @see de.hpi.sam.classDiagram_adapted.impl.ClassDiagram_adaptedPackageImpl#getUMLCardinality_adapted_cardStringValue()
		 * @generated
		 */
		EClass UML_CARDINALITY_ADAPTED_CARD_STRING_VALUE = eINSTANCE.getUMLCardinality_adapted_cardStringValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_CARDINALITY_ADAPTED_CARD_STRING_VALUE__VALUE = eINSTANCE.getUMLCardinality_adapted_cardStringValue_Value();

		/**
		 * The meta object literal for the '{@link de.hpi.sam.classDiagram_adapted.impl.UMLCardinality_adapted_revCardItemImpl <em>UML Cardinality adapted rev Card Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hpi.sam.classDiagram_adapted.impl.UMLCardinality_adapted_revCardItemImpl
		 * @see de.hpi.sam.classDiagram_adapted.impl.ClassDiagram_adaptedPackageImpl#getUMLCardinality_adapted_revCardItem()
		 * @generated
		 */
		EClass UML_CARDINALITY_ADAPTED_REV_CARD_ITEM = eINSTANCE.getUMLCardinality_adapted_revCardItem();

		/**
		 * The meta object literal for the '<em><b>Rev Card</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_CARDINALITY_ADAPTED_REV_CARD_ITEM__REV_CARD = eINSTANCE.getUMLCardinality_adapted_revCardItem_RevCard();

		/**
		 * The meta object literal for the '{@link de.hpi.sam.classDiagram_adapted.impl.UMLClassDiagram_adapted_elementsItemImpl <em>UML Class Diagram adapted elements Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hpi.sam.classDiagram_adapted.impl.UMLClassDiagram_adapted_elementsItemImpl
		 * @see de.hpi.sam.classDiagram_adapted.impl.ClassDiagram_adaptedPackageImpl#getUMLClassDiagram_adapted_elementsItem()
		 * @generated
		 */
		EClass UML_CLASS_DIAGRAM_ADAPTED_ELEMENTS_ITEM = eINSTANCE.getUMLClassDiagram_adapted_elementsItem();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_CLASS_DIAGRAM_ADAPTED_ELEMENTS_ITEM__ELEMENTS = eINSTANCE.getUMLClassDiagram_adapted_elementsItem_Elements();

		/**
		 * The meta object literal for the '{@link de.hpi.sam.classDiagram_adapted.impl.UMLClass_adapted_rolesItemImpl <em>UML Class adapted roles Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hpi.sam.classDiagram_adapted.impl.UMLClass_adapted_rolesItemImpl
		 * @see de.hpi.sam.classDiagram_adapted.impl.ClassDiagram_adaptedPackageImpl#getUMLClass_adapted_rolesItem()
		 * @generated
		 */
		EClass UML_CLASS_ADAPTED_ROLES_ITEM = eINSTANCE.getUMLClass_adapted_rolesItem();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_CLASS_ADAPTED_ROLES_ITEM__ROLES = eINSTANCE.getUMLClass_adapted_rolesItem_Roles();

		/**
		 * The meta object literal for the '{@link de.hpi.sam.classDiagram_adapted.impl.UMLElement_adapted_nameValueImpl <em>UML Element adapted name Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hpi.sam.classDiagram_adapted.impl.UMLElement_adapted_nameValueImpl
		 * @see de.hpi.sam.classDiagram_adapted.impl.ClassDiagram_adaptedPackageImpl#getUMLElement_adapted_nameValue()
		 * @generated
		 */
		EClass UML_ELEMENT_ADAPTED_NAME_VALUE = eINSTANCE.getUMLElement_adapted_nameValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_ELEMENT_ADAPTED_NAME_VALUE__VALUE = eINSTANCE.getUMLElement_adapted_nameValue_Value();

		/**
		 * The meta object literal for the '{@link de.hpi.sam.classDiagram_adapted.impl.UMLElement_adapted_diagramItemImpl <em>UML Element adapted diagram Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hpi.sam.classDiagram_adapted.impl.UMLElement_adapted_diagramItemImpl
		 * @see de.hpi.sam.classDiagram_adapted.impl.ClassDiagram_adaptedPackageImpl#getUMLElement_adapted_diagramItem()
		 * @generated
		 */
		EClass UML_ELEMENT_ADAPTED_DIAGRAM_ITEM = eINSTANCE.getUMLElement_adapted_diagramItem();

		/**
		 * The meta object literal for the '<em><b>Diagram</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_ELEMENT_ADAPTED_DIAGRAM_ITEM__DIAGRAM = eINSTANCE.getUMLElement_adapted_diagramItem_Diagram();

		/**
		 * The meta object literal for the '{@link de.hpi.sam.classDiagram_adapted.impl.UMLIncrement_adapted_stereotypesItemImpl <em>UML Increment adapted stereotypes Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hpi.sam.classDiagram_adapted.impl.UMLIncrement_adapted_stereotypesItemImpl
		 * @see de.hpi.sam.classDiagram_adapted.impl.ClassDiagram_adaptedPackageImpl#getUMLIncrement_adapted_stereotypesItem()
		 * @generated
		 */
		EClass UML_INCREMENT_ADAPTED_STEREOTYPES_ITEM = eINSTANCE.getUMLIncrement_adapted_stereotypesItem();

		/**
		 * The meta object literal for the '<em><b>Stereotypes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_INCREMENT_ADAPTED_STEREOTYPES_ITEM__STEREOTYPES = eINSTANCE.getUMLIncrement_adapted_stereotypesItem_Stereotypes();

		/**
		 * The meta object literal for the '{@link de.hpi.sam.classDiagram_adapted.impl.UMLRole_adapted_adornmentValueImpl <em>UML Role adapted adornment Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hpi.sam.classDiagram_adapted.impl.UMLRole_adapted_adornmentValueImpl
		 * @see de.hpi.sam.classDiagram_adapted.impl.ClassDiagram_adaptedPackageImpl#getUMLRole_adapted_adornmentValue()
		 * @generated
		 */
		EClass UML_ROLE_ADAPTED_ADORNMENT_VALUE = eINSTANCE.getUMLRole_adapted_adornmentValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_ROLE_ADAPTED_ADORNMENT_VALUE__VALUE = eINSTANCE.getUMLRole_adapted_adornmentValue_Value();

		/**
		 * The meta object literal for the '{@link de.hpi.sam.classDiagram_adapted.impl.UMLRole_adapted_cardItemImpl <em>UML Role adapted card Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hpi.sam.classDiagram_adapted.impl.UMLRole_adapted_cardItemImpl
		 * @see de.hpi.sam.classDiagram_adapted.impl.ClassDiagram_adaptedPackageImpl#getUMLRole_adapted_cardItem()
		 * @generated
		 */
		EClass UML_ROLE_ADAPTED_CARD_ITEM = eINSTANCE.getUMLRole_adapted_cardItem();

		/**
		 * The meta object literal for the '<em><b>Card</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_ROLE_ADAPTED_CARD_ITEM__CARD = eINSTANCE.getUMLRole_adapted_cardItem_Card();

		/**
		 * The meta object literal for the '{@link de.hpi.sam.classDiagram_adapted.impl.UMLRole_adapted_revLeftRoleItemImpl <em>UML Role adapted rev Left Role Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hpi.sam.classDiagram_adapted.impl.UMLRole_adapted_revLeftRoleItemImpl
		 * @see de.hpi.sam.classDiagram_adapted.impl.ClassDiagram_adaptedPackageImpl#getUMLRole_adapted_revLeftRoleItem()
		 * @generated
		 */
		EClass UML_ROLE_ADAPTED_REV_LEFT_ROLE_ITEM = eINSTANCE.getUMLRole_adapted_revLeftRoleItem();

		/**
		 * The meta object literal for the '<em><b>Rev Left Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_ROLE_ADAPTED_REV_LEFT_ROLE_ITEM__REV_LEFT_ROLE = eINSTANCE.getUMLRole_adapted_revLeftRoleItem_RevLeftRole();

		/**
		 * The meta object literal for the '{@link de.hpi.sam.classDiagram_adapted.impl.UMLRole_adapted_revRightRoleItemImpl <em>UML Role adapted rev Right Role Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hpi.sam.classDiagram_adapted.impl.UMLRole_adapted_revRightRoleItemImpl
		 * @see de.hpi.sam.classDiagram_adapted.impl.ClassDiagram_adaptedPackageImpl#getUMLRole_adapted_revRightRoleItem()
		 * @generated
		 */
		EClass UML_ROLE_ADAPTED_REV_RIGHT_ROLE_ITEM = eINSTANCE.getUMLRole_adapted_revRightRoleItem();

		/**
		 * The meta object literal for the '<em><b>Rev Right Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_ROLE_ADAPTED_REV_RIGHT_ROLE_ITEM__REV_RIGHT_ROLE = eINSTANCE.getUMLRole_adapted_revRightRoleItem_RevRightRole();

		/**
		 * The meta object literal for the '{@link de.hpi.sam.classDiagram_adapted.impl.UMLRole_adapted_targetItemImpl <em>UML Role adapted target Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hpi.sam.classDiagram_adapted.impl.UMLRole_adapted_targetItemImpl
		 * @see de.hpi.sam.classDiagram_adapted.impl.ClassDiagram_adaptedPackageImpl#getUMLRole_adapted_targetItem()
		 * @generated
		 */
		EClass UML_ROLE_ADAPTED_TARGET_ITEM = eINSTANCE.getUMLRole_adapted_targetItem();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_ROLE_ADAPTED_TARGET_ITEM__TARGET = eINSTANCE.getUMLRole_adapted_targetItem_Target();

		/**
		 * The meta object literal for the '{@link de.hpi.sam.classDiagram_adapted.impl.UMLStereotype_adapted_textValueImpl <em>UML Stereotype adapted text Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hpi.sam.classDiagram_adapted.impl.UMLStereotype_adapted_textValueImpl
		 * @see de.hpi.sam.classDiagram_adapted.impl.ClassDiagram_adaptedPackageImpl#getUMLStereotype_adapted_textValue()
		 * @generated
		 */
		EClass UML_STEREOTYPE_ADAPTED_TEXT_VALUE = eINSTANCE.getUMLStereotype_adapted_textValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_STEREOTYPE_ADAPTED_TEXT_VALUE__VALUE = eINSTANCE.getUMLStereotype_adapted_textValue_Value();

		/**
		 * The meta object literal for the '{@link de.hpi.sam.classDiagram_adapted.impl.UMLStereotype_adapted_incrementItemImpl <em>UML Stereotype adapted increment Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hpi.sam.classDiagram_adapted.impl.UMLStereotype_adapted_incrementItemImpl
		 * @see de.hpi.sam.classDiagram_adapted.impl.ClassDiagram_adaptedPackageImpl#getUMLStereotype_adapted_incrementItem()
		 * @generated
		 */
		EClass UML_STEREOTYPE_ADAPTED_INCREMENT_ITEM = eINSTANCE.getUMLStereotype_adapted_incrementItem();

		/**
		 * The meta object literal for the '<em><b>Increment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_STEREOTYPE_ADAPTED_INCREMENT_ITEM__INCREMENT = eINSTANCE.getUMLStereotype_adapted_incrementItem_Increment();

	}

} //ClassDiagram_adaptedPackage
