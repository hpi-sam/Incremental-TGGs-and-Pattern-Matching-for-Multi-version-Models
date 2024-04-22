/**
 */
package de.mdelab.mltgg.java2class.java2class.generated;

import de.mdelab.mltgg.mote2.operationalTGG.OperationalTGGPackage;

import de.mdelab.mltgg.mote2.sdm.SdmPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see de.mdelab.mltgg.java2class.java2class.generated.GeneratedFactory
 * @model kind="package"
 * @generated
 */
public interface GeneratedPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "generated";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.mdelab.de/mltgg/java2class/1.0/generated";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "java2class.generated";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GeneratedPackage eINSTANCE = de.mdelab.mltgg.java2class.java2class.generated.impl.GeneratedPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.mdelab.mltgg.java2class.java2class.generated.impl.java2classOperationalTGGImpl <em>java2class Operational TGG</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.mltgg.java2class.java2class.generated.impl.java2classOperationalTGGImpl
	 * @see de.mdelab.mltgg.java2class.java2class.generated.impl.GeneratedPackageImpl#getjava2classOperationalTGG()
	 * @generated
	 */
	int JAVA2CLASS_OPERATIONAL_TGG = 0;

	/**
	 * The feature id for the '<em><b>Operational Axiom Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_OPERATIONAL_TGG__OPERATIONAL_AXIOM_GROUP = SdmPackage.SDM_OPERATIONAL_TGG__OPERATIONAL_AXIOM_GROUP;

	/**
	 * The feature id for the '<em><b>Operational Rule Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_OPERATIONAL_TGG__OPERATIONAL_RULE_GROUPS = SdmPackage.SDM_OPERATIONAL_TGG__OPERATIONAL_RULE_GROUPS;

	/**
	 * The feature id for the '<em><b>Tgg Engine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_OPERATIONAL_TGG__TGG_ENGINE = SdmPackage.SDM_OPERATIONAL_TGG__TGG_ENGINE;

	/**
	 * The feature id for the '<em><b>Tgg ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_OPERATIONAL_TGG__TGG_ID = SdmPackage.SDM_OPERATIONAL_TGG__TGG_ID;

	/**
	 * The feature id for the '<em><b>Unidirectional References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_OPERATIONAL_TGG__UNIDIRECTIONAL_REFERENCES = SdmPackage.SDM_OPERATIONAL_TGG__UNIDIRECTIONAL_REFERENCES;

	/**
	 * The feature id for the '<em><b>Interpreter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_OPERATIONAL_TGG__INTERPRETER = SdmPackage.SDM_OPERATIONAL_TGG__INTERPRETER;

	/**
	 * The number of structural features of the '<em>java2class Operational TGG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_OPERATIONAL_TGG_FEATURE_COUNT = SdmPackage.SDM_OPERATIONAL_TGG_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Transformation Started</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_OPERATIONAL_TGG___TRANSFORMATION_STARTED = SdmPackage.SDM_OPERATIONAL_TGG___TRANSFORMATION_STARTED;

	/**
	 * The operation id for the '<em>Transformation Finished</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_OPERATIONAL_TGG___TRANSFORMATION_FINISHED = SdmPackage.SDM_OPERATIONAL_TGG___TRANSFORMATION_FINISHED;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_OPERATIONAL_TGG___INIT = SdmPackage.SDM_OPERATIONAL_TGG___INIT;

	/**
	 * The operation id for the '<em>Get Operational Mapping Group</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_OPERATIONAL_TGG___GET_OPERATIONAL_MAPPING_GROUP__STRING = SdmPackage.SDM_OPERATIONAL_TGG___GET_OPERATIONAL_MAPPING_GROUP__STRING;

	/**
	 * The operation id for the '<em>Execute Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_OPERATIONAL_TGG___EXECUTE_ACTIVITY__ACTIVITY_EMAP = SdmPackage.SDM_OPERATIONAL_TGG___EXECUTE_ACTIVITY__ACTIVITY_EMAP;

	/**
	 * The number of operations of the '<em>java2class Operational TGG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_OPERATIONAL_TGG_OPERATION_COUNT = SdmPackage.SDM_OPERATIONAL_TGG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.mltgg.java2class.java2class.generated.impl.java2classAxiomImpl <em>java2class Axiom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.mltgg.java2class.java2class.generated.impl.java2classAxiomImpl
	 * @see de.mdelab.mltgg.java2class.java2class.generated.impl.GeneratedPackageImpl#getjava2classAxiom()
	 * @generated
	 */
	int JAVA2CLASS_AXIOM = 1;

	/**
	 * The feature id for the '<em><b>Rule Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_AXIOM__RULE_GROUP_ID = OperationalTGGPackage.OPERATIONAL_AXIOM_GROUP__RULE_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Axioms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_AXIOM__AXIOMS = OperationalTGGPackage.OPERATIONAL_AXIOM_GROUP__AXIOMS;

	/**
	 * The feature id for the '<em><b>Operational TGG</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_AXIOM__OPERATIONAL_TGG = OperationalTGGPackage.OPERATIONAL_AXIOM_GROUP__OPERATIONAL_TGG;

	/**
	 * The number of structural features of the '<em>java2class Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_AXIOM_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_AXIOM_GROUP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Operational Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_AXIOM___GET_OPERATIONAL_MAPPING__STRING = OperationalTGGPackage.OPERATIONAL_AXIOM_GROUP___GET_OPERATIONAL_MAPPING__STRING;

	/**
	 * The number of operations of the '<em>java2class Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_AXIOM_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_AXIOM_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.mltgg.java2class.java2class.generated.impl.java2classPkgImpl <em>java2class Pkg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.mltgg.java2class.java2class.generated.impl.java2classPkgImpl
	 * @see de.mdelab.mltgg.java2class.java2class.generated.impl.GeneratedPackageImpl#getjava2classPkg()
	 * @generated
	 */
	int JAVA2CLASS_PKG = 2;

	/**
	 * The feature id for the '<em><b>Rule Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG__RULE_GROUP_ID = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULE_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG__RULES = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULES;

	/**
	 * The feature id for the '<em><b>Operational TGG</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG__OPERATIONAL_TGG = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__OPERATIONAL_TGG;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG__ENABLED = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__ENABLED;

	/**
	 * The number of structural features of the '<em>java2class Pkg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Operational Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG___GET_OPERATIONAL_MAPPING__STRING = OperationalTGGPackage.OPERATIONAL_RULE_GROUP___GET_OPERATIONAL_MAPPING__STRING;

	/**
	 * The number of operations of the '<em>java2class Pkg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.mltgg.java2class.java2class.generated.impl.java2classClassDeclaration2ClassImpl <em>java2class Class Declaration2 Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.mltgg.java2class.java2class.generated.impl.java2classClassDeclaration2ClassImpl
	 * @see de.mdelab.mltgg.java2class.java2class.generated.impl.GeneratedPackageImpl#getjava2classClassDeclaration2Class()
	 * @generated
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS = 3;

	/**
	 * The feature id for the '<em><b>Rule Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS__RULE_GROUP_ID = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULE_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS__RULES = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULES;

	/**
	 * The feature id for the '<em><b>Operational TGG</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS__OPERATIONAL_TGG = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__OPERATIONAL_TGG;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS__ENABLED = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__ENABLED;

	/**
	 * The number of structural features of the '<em>java2class Class Declaration2 Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_FEATURE_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Get Operational Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS___GET_OPERATIONAL_MAPPING__STRING = OperationalTGGPackage.OPERATIONAL_RULE_GROUP___GET_OPERATIONAL_MAPPING__STRING;

	/**
	 * The number of operations of the '<em>java2class Class Declaration2 Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link de.mdelab.mltgg.java2class.java2class.generated.impl.java2classChildPkgImpl <em>java2class Child Pkg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.mltgg.java2class.java2class.generated.impl.java2classChildPkgImpl
	 * @see de.mdelab.mltgg.java2class.java2class.generated.impl.GeneratedPackageImpl#getjava2classChildPkg()
	 * @generated
	 */
	int JAVA2CLASS_CHILD_PKG = 4;

	/**
	 * The feature id for the '<em><b>Rule Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG__RULE_GROUP_ID = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULE_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG__RULES = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULES;

	/**
	 * The feature id for the '<em><b>Operational TGG</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG__OPERATIONAL_TGG = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__OPERATIONAL_TGG;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG__ENABLED = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__ENABLED;

	/**
	 * The number of structural features of the '<em>java2class Child Pkg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Operational Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG___GET_OPERATIONAL_MAPPING__STRING = OperationalTGGPackage.OPERATIONAL_RULE_GROUP___GET_OPERATIONAL_MAPPING__STRING;

	/**
	 * The number of operations of the '<em>java2class Child Pkg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.mltgg.java2class.java2class.generated.impl.java2classField2AssociationImpl <em>java2class Field2 Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.mltgg.java2class.java2class.generated.impl.java2classField2AssociationImpl
	 * @see de.mdelab.mltgg.java2class.java2class.generated.impl.GeneratedPackageImpl#getjava2classField2Association()
	 * @generated
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION = 5;

	/**
	 * The feature id for the '<em><b>Rule Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION__RULE_GROUP_ID = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULE_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION__RULES = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULES;

	/**
	 * The feature id for the '<em><b>Operational TGG</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION__OPERATIONAL_TGG = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__OPERATIONAL_TGG;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION__ENABLED = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__ENABLED;

	/**
	 * The number of structural features of the '<em>java2class Field2 Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Operational Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION___GET_OPERATIONAL_MAPPING__STRING = OperationalTGGPackage.OPERATIONAL_RULE_GROUP___GET_OPERATIONAL_MAPPING__STRING;

	/**
	 * The number of operations of the '<em>java2class Field2 Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link de.mdelab.mltgg.java2class.java2class.generated.impl.java2classAxiom_axiomImpl <em>java2class Axiom axiom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.mltgg.java2class.java2class.generated.impl.java2classAxiom_axiomImpl
	 * @see de.mdelab.mltgg.java2class.java2class.generated.impl.GeneratedPackageImpl#getjava2classAxiom_axiom()
	 * @generated
	 */
	int JAVA2CLASS_AXIOM_AXIOM = 6;

	/**
	 * The feature id for the '<em><b>Created TGG Nodes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_AXIOM_AXIOM__CREATED_TGG_NODES = OperationalTGGPackage.OPERATIONAL_AXIOM__CREATED_TGG_NODES;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_AXIOM_AXIOM__RULE_ID = OperationalTGGPackage.OPERATIONAL_AXIOM__RULE_ID;

	/**
	 * The feature id for the '<em><b>Operational Axiom Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_AXIOM_AXIOM__OPERATIONAL_AXIOM_GROUP = OperationalTGGPackage.OPERATIONAL_AXIOM__OPERATIONAL_AXIOM_GROUP;

	/**
	 * The feature id for the '<em><b>Add Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_AXIOM_AXIOM__ADD_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Move Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_AXIOM_AXIOM__MOVE_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Change Attribute Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_AXIOM_AXIOM__CHANGE_ATTRIBUTE_ACTIVITY = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transform Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_AXIOM_AXIOM__TRANSFORM_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Transform Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_AXIOM_AXIOM__TRANSFORM_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Transform Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_AXIOM_AXIOM__TRANSFORM_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Synchronize Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_AXIOM_AXIOM__SYNCHRONIZE_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>Synchronize Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_AXIOM_AXIOM__SYNCHRONIZE_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT
			+ 7;

	/**
	 * The number of structural features of the '<em>java2class Axiom axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_AXIOM_AXIOM_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Delete Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_AXIOM_AXIOM___DELETE_ELEMENT__TGGNODE = OperationalTGGPackage.OPERATIONAL_AXIOM___DELETE_ELEMENT__TGGNODE;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_AXIOM_AXIOM___ADD_ELEMENT__EMAP_ELIST_ELIST = OperationalTGGPackage.OPERATIONAL_AXIOM_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Change Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_AXIOM_AXIOM___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = OperationalTGGPackage.OPERATIONAL_AXIOM_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Transform Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_AXIOM_AXIOM___TRANSFORM_FORWARD__ELIST_ELIST_BOOLEAN = OperationalTGGPackage.OPERATIONAL_AXIOM_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Transform Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_AXIOM_AXIOM___TRANSFORM_MAPPING__ELIST_ELIST_BOOLEAN = OperationalTGGPackage.OPERATIONAL_AXIOM_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Transform Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_AXIOM_AXIOM___TRANSFORM_BACKWARD__ELIST_ELIST_BOOLEAN = OperationalTGGPackage.OPERATIONAL_AXIOM_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Synchronize Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_AXIOM_AXIOM___SYNCHRONIZE_FORWARD__ELIST_ELIST_TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_AXIOM_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Synchronize Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_AXIOM_AXIOM___SYNCHRONIZE_BACKWARD__ELIST_ELIST_TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_AXIOM_OPERATION_COUNT
			+ 6;

	/**
	 * The number of operations of the '<em>java2class Axiom axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_AXIOM_AXIOM_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_AXIOM_OPERATION_COUNT + 7;

	/**
	 * The meta object id for the '{@link de.mdelab.mltgg.java2class.java2class.generated.impl.java2classPkg_pkgImpl <em>java2class Pkg pkg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.mltgg.java2class.java2class.generated.impl.java2classPkg_pkgImpl
	 * @see de.mdelab.mltgg.java2class.java2class.generated.impl.GeneratedPackageImpl#getjava2classPkg_pkg()
	 * @generated
	 */
	int JAVA2CLASS_PKG_PKG = 7;

	/**
	 * The feature id for the '<em><b>Created TGG Nodes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_PKG__CREATED_TGG_NODES = OperationalTGGPackage.OPERATIONAL_RULE__CREATED_TGG_NODES;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_PKG__RULE_ID = OperationalTGGPackage.OPERATIONAL_RULE__RULE_ID;

	/**
	 * The feature id for the '<em><b>Operational Rule Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_PKG__OPERATIONAL_RULE_GROUP = OperationalTGGPackage.OPERATIONAL_RULE__OPERATIONAL_RULE_GROUP;

	/**
	 * The feature id for the '<em><b>Preferred Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_PKG__PREFERRED_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__PREFERRED_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>All Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_PKG__ALL_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__ALL_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_PKG__ENABLED = OperationalTGGPackage.OPERATIONAL_RULE__ENABLED;

	/**
	 * The feature id for the '<em><b>Add Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_PKG__ADD_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Move Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_PKG__MOVE_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Change Attribute Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_PKG__CHANGE_ATTRIBUTE_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transform Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_PKG__TRANSFORM_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Transform Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_PKG__TRANSFORM_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Transform Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_PKG__TRANSFORM_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Conflict Check Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_PKG__CONFLICT_CHECK_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Conflict Check Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_PKG__CONFLICT_CHECK_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Conflict Check Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_PKG__CONFLICT_CHECK_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Synchronize Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_PKG__SYNCHRONIZE_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Synchronize Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_PKG__SYNCHRONIZE_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Repair Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_PKG__REPAIR_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Repair Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_PKG__REPAIR_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>java2class Pkg pkg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_PKG_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Delete Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_PKG___DELETE_ELEMENT__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE___DELETE_ELEMENT__TGGNODE;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_PKG___ADD_ELEMENT__EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Change Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_PKG___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Move Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_PKG___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Transform Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_PKG___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Transform Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_PKG___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Transform Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_PKG___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Conflict Check Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_PKG___CONFLICT_CHECK_FORWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Conflict Check Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_PKG___CONFLICT_CHECK_MAPPING__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Conflict Check Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_PKG___CONFLICT_CHECK_BACKWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Synchronize Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_PKG___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 9;

	/**
	 * The operation id for the '<em>Synchronize Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_PKG___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Repair Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_PKG___REPAIR_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Repair Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_PKG___REPAIR_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The number of operations of the '<em>java2class Pkg pkg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_PKG_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 13;

	/**
	 * The meta object id for the '{@link de.mdelab.mltgg.java2class.java2class.generated.impl.java2classClassDeclaration2Class_java2classClassDeclaration2ClassImpl <em>java2class Class Declaration2 Class java2class Class Declaration2 Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.mltgg.java2class.java2class.generated.impl.java2classClassDeclaration2Class_java2classClassDeclaration2ClassImpl
	 * @see de.mdelab.mltgg.java2class.java2class.generated.impl.GeneratedPackageImpl#getjava2classClassDeclaration2Class_java2classClassDeclaration2Class()
	 * @generated
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS = 8;

	/**
	 * The feature id for the '<em><b>Created TGG Nodes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS__CREATED_TGG_NODES = OperationalTGGPackage.OPERATIONAL_RULE__CREATED_TGG_NODES;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS__RULE_ID = OperationalTGGPackage.OPERATIONAL_RULE__RULE_ID;

	/**
	 * The feature id for the '<em><b>Operational Rule Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS__OPERATIONAL_RULE_GROUP = OperationalTGGPackage.OPERATIONAL_RULE__OPERATIONAL_RULE_GROUP;

	/**
	 * The feature id for the '<em><b>Preferred Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS__PREFERRED_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__PREFERRED_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>All Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS__ALL_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__ALL_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS__ENABLED = OperationalTGGPackage.OPERATIONAL_RULE__ENABLED;

	/**
	 * The feature id for the '<em><b>Add Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS__ADD_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>Move Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS__MOVE_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>Change Attribute Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS__CHANGE_ATTRIBUTE_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>Transform Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS__TRANSFORM_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>Transform Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS__TRANSFORM_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>Transform Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS__TRANSFORM_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>Conflict Check Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS__CONFLICT_CHECK_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>Conflict Check Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS__CONFLICT_CHECK_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>Conflict Check Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS__CONFLICT_CHECK_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 8;

	/**
	 * The feature id for the '<em><b>Synchronize Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS__SYNCHRONIZE_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 9;

	/**
	 * The feature id for the '<em><b>Synchronize Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS__SYNCHRONIZE_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 10;

	/**
	 * The feature id for the '<em><b>Repair Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS__REPAIR_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 11;

	/**
	 * The feature id for the '<em><b>Repair Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS__REPAIR_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 12;

	/**
	 * The number of structural features of the '<em>java2class Class Declaration2 Class java2class Class Declaration2 Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Delete Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS___DELETE_ELEMENT__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE___DELETE_ELEMENT__TGGNODE;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS___ADD_ELEMENT__EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Change Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Move Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Transform Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Transform Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Transform Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Conflict Check Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS___CONFLICT_CHECK_FORWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Conflict Check Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS___CONFLICT_CHECK_MAPPING__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Conflict Check Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS___CONFLICT_CHECK_BACKWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Synchronize Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 9;

	/**
	 * The operation id for the '<em>Synchronize Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Repair Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS___REPAIR_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Repair Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS___REPAIR_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The number of operations of the '<em>java2class Class Declaration2 Class java2class Class Declaration2 Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The meta object id for the '{@link de.mdelab.mltgg.java2class.java2class.generated.impl.java2classField2Association_java2classField2AssociationImpl <em>java2class Field2 Association java2class Field2 Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.mltgg.java2class.java2class.generated.impl.java2classField2Association_java2classField2AssociationImpl
	 * @see de.mdelab.mltgg.java2class.java2class.generated.impl.GeneratedPackageImpl#getjava2classField2Association_java2classField2Association()
	 * @generated
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION = 9;

	/**
	 * The feature id for the '<em><b>Created TGG Nodes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION__CREATED_TGG_NODES = OperationalTGGPackage.OPERATIONAL_RULE__CREATED_TGG_NODES;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION__RULE_ID = OperationalTGGPackage.OPERATIONAL_RULE__RULE_ID;

	/**
	 * The feature id for the '<em><b>Operational Rule Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION__OPERATIONAL_RULE_GROUP = OperationalTGGPackage.OPERATIONAL_RULE__OPERATIONAL_RULE_GROUP;

	/**
	 * The feature id for the '<em><b>Preferred Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION__PREFERRED_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__PREFERRED_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>All Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION__ALL_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__ALL_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION__ENABLED = OperationalTGGPackage.OPERATIONAL_RULE__ENABLED;

	/**
	 * The feature id for the '<em><b>Add Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION__ADD_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>Move Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION__MOVE_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>Change Attribute Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION__CHANGE_ATTRIBUTE_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>Transform Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION__TRANSFORM_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>Transform Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION__TRANSFORM_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>Transform Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION__TRANSFORM_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>Conflict Check Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION__CONFLICT_CHECK_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>Conflict Check Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION__CONFLICT_CHECK_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>Conflict Check Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION__CONFLICT_CHECK_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 8;

	/**
	 * The feature id for the '<em><b>Synchronize Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION__SYNCHRONIZE_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 9;

	/**
	 * The feature id for the '<em><b>Synchronize Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION__SYNCHRONIZE_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 10;

	/**
	 * The feature id for the '<em><b>Repair Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION__REPAIR_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 11;

	/**
	 * The feature id for the '<em><b>Repair Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION__REPAIR_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 12;

	/**
	 * The number of structural features of the '<em>java2class Field2 Association java2class Field2 Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Delete Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION___DELETE_ELEMENT__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE___DELETE_ELEMENT__TGGNODE;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION___ADD_ELEMENT__EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Change Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Move Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Transform Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Transform Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Transform Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Conflict Check Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION___CONFLICT_CHECK_FORWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Conflict Check Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION___CONFLICT_CHECK_MAPPING__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Conflict Check Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION___CONFLICT_CHECK_BACKWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Synchronize Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 9;

	/**
	 * The operation id for the '<em>Synchronize Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Repair Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION___REPAIR_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Repair Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION___REPAIR_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The number of operations of the '<em>java2class Field2 Association java2class Field2 Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The meta object id for the '{@link de.mdelab.mltgg.java2class.java2class.generated.impl.java2classChildPkg_childPkgImpl <em>java2class Child Pkg child Pkg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.mltgg.java2class.java2class.generated.impl.java2classChildPkg_childPkgImpl
	 * @see de.mdelab.mltgg.java2class.java2class.generated.impl.GeneratedPackageImpl#getjava2classChildPkg_childPkg()
	 * @generated
	 */
	int JAVA2CLASS_CHILD_PKG_CHILD_PKG = 10;

	/**
	 * The feature id for the '<em><b>Created TGG Nodes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_CHILD_PKG__CREATED_TGG_NODES = OperationalTGGPackage.OPERATIONAL_RULE__CREATED_TGG_NODES;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_CHILD_PKG__RULE_ID = OperationalTGGPackage.OPERATIONAL_RULE__RULE_ID;

	/**
	 * The feature id for the '<em><b>Operational Rule Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_CHILD_PKG__OPERATIONAL_RULE_GROUP = OperationalTGGPackage.OPERATIONAL_RULE__OPERATIONAL_RULE_GROUP;

	/**
	 * The feature id for the '<em><b>Preferred Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_CHILD_PKG__PREFERRED_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__PREFERRED_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>All Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_CHILD_PKG__ALL_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__ALL_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_CHILD_PKG__ENABLED = OperationalTGGPackage.OPERATIONAL_RULE__ENABLED;

	/**
	 * The feature id for the '<em><b>Add Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_CHILD_PKG__ADD_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Move Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_CHILD_PKG__MOVE_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>Change Attribute Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_CHILD_PKG__CHANGE_ATTRIBUTE_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>Transform Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_CHILD_PKG__TRANSFORM_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>Transform Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_CHILD_PKG__TRANSFORM_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>Transform Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_CHILD_PKG__TRANSFORM_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>Conflict Check Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_CHILD_PKG__CONFLICT_CHECK_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>Conflict Check Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_CHILD_PKG__CONFLICT_CHECK_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>Conflict Check Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_CHILD_PKG__CONFLICT_CHECK_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 8;

	/**
	 * The feature id for the '<em><b>Synchronize Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_CHILD_PKG__SYNCHRONIZE_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 9;

	/**
	 * The feature id for the '<em><b>Synchronize Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_CHILD_PKG__SYNCHRONIZE_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 10;

	/**
	 * The feature id for the '<em><b>Repair Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_CHILD_PKG__REPAIR_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 11;

	/**
	 * The feature id for the '<em><b>Repair Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_CHILD_PKG__REPAIR_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 12;

	/**
	 * The number of structural features of the '<em>java2class Child Pkg child Pkg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_CHILD_PKG_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Delete Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_CHILD_PKG___DELETE_ELEMENT__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE___DELETE_ELEMENT__TGGNODE;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_CHILD_PKG___ADD_ELEMENT__EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Change Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_CHILD_PKG___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Move Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_CHILD_PKG___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Transform Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_CHILD_PKG___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Transform Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_CHILD_PKG___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Transform Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_CHILD_PKG___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Conflict Check Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_CHILD_PKG___CONFLICT_CHECK_FORWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Conflict Check Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_CHILD_PKG___CONFLICT_CHECK_MAPPING__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Conflict Check Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_CHILD_PKG___CONFLICT_CHECK_BACKWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Synchronize Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_CHILD_PKG___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 9;

	/**
	 * The operation id for the '<em>Synchronize Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_CHILD_PKG___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Repair Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_CHILD_PKG___REPAIR_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Repair Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_CHILD_PKG___REPAIR_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The number of operations of the '<em>java2class Child Pkg child Pkg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_CHILD_PKG_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT + 13;

	/**
	 * Returns the meta object for class '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classOperationalTGG <em>java2class Operational TGG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>java2class Operational TGG</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classOperationalTGG
	 * @generated
	 */
	EClass getjava2classOperationalTGG();

	/**
	 * Returns the meta object for class '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classAxiom <em>java2class Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>java2class Axiom</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classAxiom
	 * @generated
	 */
	EClass getjava2classAxiom();

	/**
	 * Returns the meta object for class '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classPkg <em>java2class Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>java2class Pkg</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classPkg
	 * @generated
	 */
	EClass getjava2classPkg();

	/**
	 * Returns the meta object for class '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classClassDeclaration2Class <em>java2class Class Declaration2 Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>java2class Class Declaration2 Class</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classClassDeclaration2Class
	 * @generated
	 */
	EClass getjava2classClassDeclaration2Class();

	/**
	 * Returns the meta object for class '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classChildPkg <em>java2class Child Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>java2class Child Pkg</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classChildPkg
	 * @generated
	 */
	EClass getjava2classChildPkg();

	/**
	 * Returns the meta object for class '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classField2Association <em>java2class Field2 Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>java2class Field2 Association</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classField2Association
	 * @generated
	 */
	EClass getjava2classField2Association();

	/**
	 * Returns the meta object for class '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classAxiom_axiom <em>java2class Axiom axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>java2class Axiom axiom</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classAxiom_axiom
	 * @generated
	 */
	EClass getjava2classAxiom_axiom();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classAxiom_axiom#getAddElementActivity <em>Add Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Add Element Activity</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classAxiom_axiom#getAddElementActivity()
	 * @see #getjava2classAxiom_axiom()
	 * @generated
	 */
	EReference getjava2classAxiom_axiom_AddElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classAxiom_axiom#getMoveElementActivity <em>Move Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Move Element Activity</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classAxiom_axiom#getMoveElementActivity()
	 * @see #getjava2classAxiom_axiom()
	 * @generated
	 */
	EReference getjava2classAxiom_axiom_MoveElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classAxiom_axiom#getChangeAttributeActivity <em>Change Attribute Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Attribute Activity</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classAxiom_axiom#getChangeAttributeActivity()
	 * @see #getjava2classAxiom_axiom()
	 * @generated
	 */
	EReference getjava2classAxiom_axiom_ChangeAttributeActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classAxiom_axiom#getTransformForwardActivity <em>Transform Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Forward Activity</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classAxiom_axiom#getTransformForwardActivity()
	 * @see #getjava2classAxiom_axiom()
	 * @generated
	 */
	EReference getjava2classAxiom_axiom_TransformForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classAxiom_axiom#getTransformMappingActivity <em>Transform Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Mapping Activity</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classAxiom_axiom#getTransformMappingActivity()
	 * @see #getjava2classAxiom_axiom()
	 * @generated
	 */
	EReference getjava2classAxiom_axiom_TransformMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classAxiom_axiom#getTransformBackwardActivity <em>Transform Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Backward Activity</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classAxiom_axiom#getTransformBackwardActivity()
	 * @see #getjava2classAxiom_axiom()
	 * @generated
	 */
	EReference getjava2classAxiom_axiom_TransformBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classAxiom_axiom#getSynchronizeForwardActivity <em>Synchronize Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Forward Activity</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classAxiom_axiom#getSynchronizeForwardActivity()
	 * @see #getjava2classAxiom_axiom()
	 * @generated
	 */
	EReference getjava2classAxiom_axiom_SynchronizeForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classAxiom_axiom#getSynchronizeBackwardActivity <em>Synchronize Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Backward Activity</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classAxiom_axiom#getSynchronizeBackwardActivity()
	 * @see #getjava2classAxiom_axiom()
	 * @generated
	 */
	EReference getjava2classAxiom_axiom_SynchronizeBackwardActivity();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classAxiom_axiom#addElement(org.eclipse.emf.common.util.EMap, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Add Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element</em>' operation.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classAxiom_axiom#addElement(org.eclipse.emf.common.util.EMap, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getjava2classAxiom_axiom__AddElement__EMap_EList_EList();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classAxiom_axiom#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap) <em>Change Attribute Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Attribute Values</em>' operation.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classAxiom_axiom#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getjava2classAxiom_axiom__ChangeAttributeValues__TGGNode_EMap();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classAxiom_axiom#transformForward(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, boolean) <em>Transform Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Forward</em>' operation.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classAxiom_axiom#transformForward(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, boolean)
	 * @generated
	 */
	EOperation getjava2classAxiom_axiom__TransformForward__EList_EList_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classAxiom_axiom#transformMapping(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, boolean) <em>Transform Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Mapping</em>' operation.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classAxiom_axiom#transformMapping(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, boolean)
	 * @generated
	 */
	EOperation getjava2classAxiom_axiom__TransformMapping__EList_EList_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classAxiom_axiom#transformBackward(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, boolean) <em>Transform Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Backward</em>' operation.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classAxiom_axiom#transformBackward(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, boolean)
	 * @generated
	 */
	EOperation getjava2classAxiom_axiom__TransformBackward__EList_EList_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classAxiom_axiom#synchronizeForward(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Forward</em>' operation.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classAxiom_axiom#synchronizeForward(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getjava2classAxiom_axiom__SynchronizeForward__EList_EList_TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classAxiom_axiom#synchronizeBackward(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Backward</em>' operation.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classAxiom_axiom#synchronizeBackward(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getjava2classAxiom_axiom__SynchronizeBackward__EList_EList_TGGNode_boolean();

	/**
	 * Returns the meta object for class '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classPkg_pkg <em>java2class Pkg pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>java2class Pkg pkg</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classPkg_pkg
	 * @generated
	 */
	EClass getjava2classPkg_pkg();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classPkg_pkg#getAddElementActivity <em>Add Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Add Element Activity</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classPkg_pkg#getAddElementActivity()
	 * @see #getjava2classPkg_pkg()
	 * @generated
	 */
	EReference getjava2classPkg_pkg_AddElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classPkg_pkg#getMoveElementActivity <em>Move Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Move Element Activity</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classPkg_pkg#getMoveElementActivity()
	 * @see #getjava2classPkg_pkg()
	 * @generated
	 */
	EReference getjava2classPkg_pkg_MoveElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classPkg_pkg#getChangeAttributeActivity <em>Change Attribute Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Attribute Activity</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classPkg_pkg#getChangeAttributeActivity()
	 * @see #getjava2classPkg_pkg()
	 * @generated
	 */
	EReference getjava2classPkg_pkg_ChangeAttributeActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classPkg_pkg#getTransformForwardActivity <em>Transform Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Forward Activity</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classPkg_pkg#getTransformForwardActivity()
	 * @see #getjava2classPkg_pkg()
	 * @generated
	 */
	EReference getjava2classPkg_pkg_TransformForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classPkg_pkg#getTransformMappingActivity <em>Transform Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Mapping Activity</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classPkg_pkg#getTransformMappingActivity()
	 * @see #getjava2classPkg_pkg()
	 * @generated
	 */
	EReference getjava2classPkg_pkg_TransformMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classPkg_pkg#getTransformBackwardActivity <em>Transform Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Backward Activity</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classPkg_pkg#getTransformBackwardActivity()
	 * @see #getjava2classPkg_pkg()
	 * @generated
	 */
	EReference getjava2classPkg_pkg_TransformBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classPkg_pkg#getConflictCheckForwardActivity <em>Conflict Check Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Forward Activity</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classPkg_pkg#getConflictCheckForwardActivity()
	 * @see #getjava2classPkg_pkg()
	 * @generated
	 */
	EReference getjava2classPkg_pkg_ConflictCheckForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classPkg_pkg#getConflictCheckMappingActivity <em>Conflict Check Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Mapping Activity</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classPkg_pkg#getConflictCheckMappingActivity()
	 * @see #getjava2classPkg_pkg()
	 * @generated
	 */
	EReference getjava2classPkg_pkg_ConflictCheckMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classPkg_pkg#getConflictCheckBackwardActivity <em>Conflict Check Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Backward Activity</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classPkg_pkg#getConflictCheckBackwardActivity()
	 * @see #getjava2classPkg_pkg()
	 * @generated
	 */
	EReference getjava2classPkg_pkg_ConflictCheckBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classPkg_pkg#getSynchronizeForwardActivity <em>Synchronize Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Forward Activity</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classPkg_pkg#getSynchronizeForwardActivity()
	 * @see #getjava2classPkg_pkg()
	 * @generated
	 */
	EReference getjava2classPkg_pkg_SynchronizeForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classPkg_pkg#getSynchronizeBackwardActivity <em>Synchronize Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Backward Activity</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classPkg_pkg#getSynchronizeBackwardActivity()
	 * @see #getjava2classPkg_pkg()
	 * @generated
	 */
	EReference getjava2classPkg_pkg_SynchronizeBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classPkg_pkg#getRepairForwardActivity <em>Repair Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Forward Activity</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classPkg_pkg#getRepairForwardActivity()
	 * @see #getjava2classPkg_pkg()
	 * @generated
	 */
	EReference getjava2classPkg_pkg_RepairForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classPkg_pkg#getRepairBackwardActivity <em>Repair Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Backward Activity</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classPkg_pkg#getRepairBackwardActivity()
	 * @see #getjava2classPkg_pkg()
	 * @generated
	 */
	EReference getjava2classPkg_pkg_RepairBackwardActivity();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classPkg_pkg#addElement(org.eclipse.emf.common.util.EMap) <em>Add Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element</em>' operation.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classPkg_pkg#addElement(org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getjava2classPkg_pkg__AddElement__EMap();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classPkg_pkg#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap) <em>Change Attribute Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Attribute Values</em>' operation.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classPkg_pkg#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getjava2classPkg_pkg__ChangeAttributeValues__TGGNode_EMap();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classPkg_pkg#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode) <em>Move Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move Element</em>' operation.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classPkg_pkg#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getjava2classPkg_pkg__MoveElement__TGGNode_TGGNode_TGGNode();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classPkg_pkg#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Forward</em>' operation.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classPkg_pkg#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getjava2classPkg_pkg__TransformForward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classPkg_pkg#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Mapping</em>' operation.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classPkg_pkg#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getjava2classPkg_pkg__TransformMapping__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classPkg_pkg#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Backward</em>' operation.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classPkg_pkg#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getjava2classPkg_pkg__TransformBackward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classPkg_pkg#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Forward</em>' operation.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classPkg_pkg#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getjava2classPkg_pkg__ConflictCheckForward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classPkg_pkg#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Mapping</em>' operation.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classPkg_pkg#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getjava2classPkg_pkg__ConflictCheckMapping__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classPkg_pkg#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Backward</em>' operation.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classPkg_pkg#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getjava2classPkg_pkg__ConflictCheckBackward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classPkg_pkg#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Forward</em>' operation.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classPkg_pkg#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getjava2classPkg_pkg__SynchronizeForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classPkg_pkg#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Backward</em>' operation.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classPkg_pkg#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getjava2classPkg_pkg__SynchronizeBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classPkg_pkg#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Forward</em>' operation.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classPkg_pkg#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getjava2classPkg_pkg__RepairForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classPkg_pkg#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Backward</em>' operation.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classPkg_pkg#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getjava2classPkg_pkg__RepairBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for class '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classClassDeclaration2Class_java2classClassDeclaration2Class <em>java2class Class Declaration2 Class java2class Class Declaration2 Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>java2class Class Declaration2 Class java2class Class Declaration2 Class</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classClassDeclaration2Class_java2classClassDeclaration2Class
	 * @generated
	 */
	EClass getjava2classClassDeclaration2Class_java2classClassDeclaration2Class();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classClassDeclaration2Class_java2classClassDeclaration2Class#getAddElementActivity <em>Add Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Add Element Activity</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classClassDeclaration2Class_java2classClassDeclaration2Class#getAddElementActivity()
	 * @see #getjava2classClassDeclaration2Class_java2classClassDeclaration2Class()
	 * @generated
	 */
	EReference getjava2classClassDeclaration2Class_java2classClassDeclaration2Class_AddElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classClassDeclaration2Class_java2classClassDeclaration2Class#getMoveElementActivity <em>Move Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Move Element Activity</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classClassDeclaration2Class_java2classClassDeclaration2Class#getMoveElementActivity()
	 * @see #getjava2classClassDeclaration2Class_java2classClassDeclaration2Class()
	 * @generated
	 */
	EReference getjava2classClassDeclaration2Class_java2classClassDeclaration2Class_MoveElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classClassDeclaration2Class_java2classClassDeclaration2Class#getChangeAttributeActivity <em>Change Attribute Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Attribute Activity</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classClassDeclaration2Class_java2classClassDeclaration2Class#getChangeAttributeActivity()
	 * @see #getjava2classClassDeclaration2Class_java2classClassDeclaration2Class()
	 * @generated
	 */
	EReference getjava2classClassDeclaration2Class_java2classClassDeclaration2Class_ChangeAttributeActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classClassDeclaration2Class_java2classClassDeclaration2Class#getTransformForwardActivity <em>Transform Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Forward Activity</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classClassDeclaration2Class_java2classClassDeclaration2Class#getTransformForwardActivity()
	 * @see #getjava2classClassDeclaration2Class_java2classClassDeclaration2Class()
	 * @generated
	 */
	EReference getjava2classClassDeclaration2Class_java2classClassDeclaration2Class_TransformForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classClassDeclaration2Class_java2classClassDeclaration2Class#getTransformMappingActivity <em>Transform Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Mapping Activity</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classClassDeclaration2Class_java2classClassDeclaration2Class#getTransformMappingActivity()
	 * @see #getjava2classClassDeclaration2Class_java2classClassDeclaration2Class()
	 * @generated
	 */
	EReference getjava2classClassDeclaration2Class_java2classClassDeclaration2Class_TransformMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classClassDeclaration2Class_java2classClassDeclaration2Class#getTransformBackwardActivity <em>Transform Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Backward Activity</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classClassDeclaration2Class_java2classClassDeclaration2Class#getTransformBackwardActivity()
	 * @see #getjava2classClassDeclaration2Class_java2classClassDeclaration2Class()
	 * @generated
	 */
	EReference getjava2classClassDeclaration2Class_java2classClassDeclaration2Class_TransformBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classClassDeclaration2Class_java2classClassDeclaration2Class#getConflictCheckForwardActivity <em>Conflict Check Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Forward Activity</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classClassDeclaration2Class_java2classClassDeclaration2Class#getConflictCheckForwardActivity()
	 * @see #getjava2classClassDeclaration2Class_java2classClassDeclaration2Class()
	 * @generated
	 */
	EReference getjava2classClassDeclaration2Class_java2classClassDeclaration2Class_ConflictCheckForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classClassDeclaration2Class_java2classClassDeclaration2Class#getConflictCheckMappingActivity <em>Conflict Check Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Mapping Activity</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classClassDeclaration2Class_java2classClassDeclaration2Class#getConflictCheckMappingActivity()
	 * @see #getjava2classClassDeclaration2Class_java2classClassDeclaration2Class()
	 * @generated
	 */
	EReference getjava2classClassDeclaration2Class_java2classClassDeclaration2Class_ConflictCheckMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classClassDeclaration2Class_java2classClassDeclaration2Class#getConflictCheckBackwardActivity <em>Conflict Check Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Backward Activity</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classClassDeclaration2Class_java2classClassDeclaration2Class#getConflictCheckBackwardActivity()
	 * @see #getjava2classClassDeclaration2Class_java2classClassDeclaration2Class()
	 * @generated
	 */
	EReference getjava2classClassDeclaration2Class_java2classClassDeclaration2Class_ConflictCheckBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classClassDeclaration2Class_java2classClassDeclaration2Class#getSynchronizeForwardActivity <em>Synchronize Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Forward Activity</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classClassDeclaration2Class_java2classClassDeclaration2Class#getSynchronizeForwardActivity()
	 * @see #getjava2classClassDeclaration2Class_java2classClassDeclaration2Class()
	 * @generated
	 */
	EReference getjava2classClassDeclaration2Class_java2classClassDeclaration2Class_SynchronizeForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classClassDeclaration2Class_java2classClassDeclaration2Class#getSynchronizeBackwardActivity <em>Synchronize Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Backward Activity</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classClassDeclaration2Class_java2classClassDeclaration2Class#getSynchronizeBackwardActivity()
	 * @see #getjava2classClassDeclaration2Class_java2classClassDeclaration2Class()
	 * @generated
	 */
	EReference getjava2classClassDeclaration2Class_java2classClassDeclaration2Class_SynchronizeBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classClassDeclaration2Class_java2classClassDeclaration2Class#getRepairForwardActivity <em>Repair Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Forward Activity</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classClassDeclaration2Class_java2classClassDeclaration2Class#getRepairForwardActivity()
	 * @see #getjava2classClassDeclaration2Class_java2classClassDeclaration2Class()
	 * @generated
	 */
	EReference getjava2classClassDeclaration2Class_java2classClassDeclaration2Class_RepairForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classClassDeclaration2Class_java2classClassDeclaration2Class#getRepairBackwardActivity <em>Repair Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Backward Activity</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classClassDeclaration2Class_java2classClassDeclaration2Class#getRepairBackwardActivity()
	 * @see #getjava2classClassDeclaration2Class_java2classClassDeclaration2Class()
	 * @generated
	 */
	EReference getjava2classClassDeclaration2Class_java2classClassDeclaration2Class_RepairBackwardActivity();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classClassDeclaration2Class_java2classClassDeclaration2Class#addElement(org.eclipse.emf.common.util.EMap) <em>Add Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element</em>' operation.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classClassDeclaration2Class_java2classClassDeclaration2Class#addElement(org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getjava2classClassDeclaration2Class_java2classClassDeclaration2Class__AddElement__EMap();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classClassDeclaration2Class_java2classClassDeclaration2Class#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap) <em>Change Attribute Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Attribute Values</em>' operation.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classClassDeclaration2Class_java2classClassDeclaration2Class#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getjava2classClassDeclaration2Class_java2classClassDeclaration2Class__ChangeAttributeValues__TGGNode_EMap();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classClassDeclaration2Class_java2classClassDeclaration2Class#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode) <em>Move Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move Element</em>' operation.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classClassDeclaration2Class_java2classClassDeclaration2Class#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getjava2classClassDeclaration2Class_java2classClassDeclaration2Class__MoveElement__TGGNode_TGGNode_TGGNode();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classClassDeclaration2Class_java2classClassDeclaration2Class#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Forward</em>' operation.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classClassDeclaration2Class_java2classClassDeclaration2Class#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getjava2classClassDeclaration2Class_java2classClassDeclaration2Class__TransformForward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classClassDeclaration2Class_java2classClassDeclaration2Class#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Mapping</em>' operation.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classClassDeclaration2Class_java2classClassDeclaration2Class#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getjava2classClassDeclaration2Class_java2classClassDeclaration2Class__TransformMapping__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classClassDeclaration2Class_java2classClassDeclaration2Class#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Backward</em>' operation.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classClassDeclaration2Class_java2classClassDeclaration2Class#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getjava2classClassDeclaration2Class_java2classClassDeclaration2Class__TransformBackward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classClassDeclaration2Class_java2classClassDeclaration2Class#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Forward</em>' operation.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classClassDeclaration2Class_java2classClassDeclaration2Class#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getjava2classClassDeclaration2Class_java2classClassDeclaration2Class__ConflictCheckForward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classClassDeclaration2Class_java2classClassDeclaration2Class#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Mapping</em>' operation.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classClassDeclaration2Class_java2classClassDeclaration2Class#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getjava2classClassDeclaration2Class_java2classClassDeclaration2Class__ConflictCheckMapping__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classClassDeclaration2Class_java2classClassDeclaration2Class#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Backward</em>' operation.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classClassDeclaration2Class_java2classClassDeclaration2Class#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getjava2classClassDeclaration2Class_java2classClassDeclaration2Class__ConflictCheckBackward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classClassDeclaration2Class_java2classClassDeclaration2Class#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Forward</em>' operation.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classClassDeclaration2Class_java2classClassDeclaration2Class#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getjava2classClassDeclaration2Class_java2classClassDeclaration2Class__SynchronizeForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classClassDeclaration2Class_java2classClassDeclaration2Class#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Backward</em>' operation.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classClassDeclaration2Class_java2classClassDeclaration2Class#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getjava2classClassDeclaration2Class_java2classClassDeclaration2Class__SynchronizeBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classClassDeclaration2Class_java2classClassDeclaration2Class#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Forward</em>' operation.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classClassDeclaration2Class_java2classClassDeclaration2Class#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getjava2classClassDeclaration2Class_java2classClassDeclaration2Class__RepairForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classClassDeclaration2Class_java2classClassDeclaration2Class#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Backward</em>' operation.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classClassDeclaration2Class_java2classClassDeclaration2Class#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getjava2classClassDeclaration2Class_java2classClassDeclaration2Class__RepairBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for class '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classField2Association_java2classField2Association <em>java2class Field2 Association java2class Field2 Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>java2class Field2 Association java2class Field2 Association</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classField2Association_java2classField2Association
	 * @generated
	 */
	EClass getjava2classField2Association_java2classField2Association();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classField2Association_java2classField2Association#getAddElementActivity <em>Add Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Add Element Activity</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classField2Association_java2classField2Association#getAddElementActivity()
	 * @see #getjava2classField2Association_java2classField2Association()
	 * @generated
	 */
	EReference getjava2classField2Association_java2classField2Association_AddElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classField2Association_java2classField2Association#getMoveElementActivity <em>Move Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Move Element Activity</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classField2Association_java2classField2Association#getMoveElementActivity()
	 * @see #getjava2classField2Association_java2classField2Association()
	 * @generated
	 */
	EReference getjava2classField2Association_java2classField2Association_MoveElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classField2Association_java2classField2Association#getChangeAttributeActivity <em>Change Attribute Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Attribute Activity</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classField2Association_java2classField2Association#getChangeAttributeActivity()
	 * @see #getjava2classField2Association_java2classField2Association()
	 * @generated
	 */
	EReference getjava2classField2Association_java2classField2Association_ChangeAttributeActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classField2Association_java2classField2Association#getTransformForwardActivity <em>Transform Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Forward Activity</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classField2Association_java2classField2Association#getTransformForwardActivity()
	 * @see #getjava2classField2Association_java2classField2Association()
	 * @generated
	 */
	EReference getjava2classField2Association_java2classField2Association_TransformForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classField2Association_java2classField2Association#getTransformMappingActivity <em>Transform Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Mapping Activity</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classField2Association_java2classField2Association#getTransformMappingActivity()
	 * @see #getjava2classField2Association_java2classField2Association()
	 * @generated
	 */
	EReference getjava2classField2Association_java2classField2Association_TransformMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classField2Association_java2classField2Association#getTransformBackwardActivity <em>Transform Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Backward Activity</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classField2Association_java2classField2Association#getTransformBackwardActivity()
	 * @see #getjava2classField2Association_java2classField2Association()
	 * @generated
	 */
	EReference getjava2classField2Association_java2classField2Association_TransformBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classField2Association_java2classField2Association#getConflictCheckForwardActivity <em>Conflict Check Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Forward Activity</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classField2Association_java2classField2Association#getConflictCheckForwardActivity()
	 * @see #getjava2classField2Association_java2classField2Association()
	 * @generated
	 */
	EReference getjava2classField2Association_java2classField2Association_ConflictCheckForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classField2Association_java2classField2Association#getConflictCheckMappingActivity <em>Conflict Check Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Mapping Activity</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classField2Association_java2classField2Association#getConflictCheckMappingActivity()
	 * @see #getjava2classField2Association_java2classField2Association()
	 * @generated
	 */
	EReference getjava2classField2Association_java2classField2Association_ConflictCheckMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classField2Association_java2classField2Association#getConflictCheckBackwardActivity <em>Conflict Check Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Backward Activity</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classField2Association_java2classField2Association#getConflictCheckBackwardActivity()
	 * @see #getjava2classField2Association_java2classField2Association()
	 * @generated
	 */
	EReference getjava2classField2Association_java2classField2Association_ConflictCheckBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classField2Association_java2classField2Association#getSynchronizeForwardActivity <em>Synchronize Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Forward Activity</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classField2Association_java2classField2Association#getSynchronizeForwardActivity()
	 * @see #getjava2classField2Association_java2classField2Association()
	 * @generated
	 */
	EReference getjava2classField2Association_java2classField2Association_SynchronizeForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classField2Association_java2classField2Association#getSynchronizeBackwardActivity <em>Synchronize Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Backward Activity</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classField2Association_java2classField2Association#getSynchronizeBackwardActivity()
	 * @see #getjava2classField2Association_java2classField2Association()
	 * @generated
	 */
	EReference getjava2classField2Association_java2classField2Association_SynchronizeBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classField2Association_java2classField2Association#getRepairForwardActivity <em>Repair Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Forward Activity</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classField2Association_java2classField2Association#getRepairForwardActivity()
	 * @see #getjava2classField2Association_java2classField2Association()
	 * @generated
	 */
	EReference getjava2classField2Association_java2classField2Association_RepairForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classField2Association_java2classField2Association#getRepairBackwardActivity <em>Repair Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Backward Activity</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classField2Association_java2classField2Association#getRepairBackwardActivity()
	 * @see #getjava2classField2Association_java2classField2Association()
	 * @generated
	 */
	EReference getjava2classField2Association_java2classField2Association_RepairBackwardActivity();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classField2Association_java2classField2Association#addElement(org.eclipse.emf.common.util.EMap) <em>Add Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element</em>' operation.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classField2Association_java2classField2Association#addElement(org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getjava2classField2Association_java2classField2Association__AddElement__EMap();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classField2Association_java2classField2Association#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap) <em>Change Attribute Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Attribute Values</em>' operation.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classField2Association_java2classField2Association#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getjava2classField2Association_java2classField2Association__ChangeAttributeValues__TGGNode_EMap();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classField2Association_java2classField2Association#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode) <em>Move Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move Element</em>' operation.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classField2Association_java2classField2Association#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getjava2classField2Association_java2classField2Association__MoveElement__TGGNode_TGGNode_TGGNode();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classField2Association_java2classField2Association#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Forward</em>' operation.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classField2Association_java2classField2Association#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getjava2classField2Association_java2classField2Association__TransformForward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classField2Association_java2classField2Association#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Mapping</em>' operation.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classField2Association_java2classField2Association#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getjava2classField2Association_java2classField2Association__TransformMapping__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classField2Association_java2classField2Association#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Backward</em>' operation.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classField2Association_java2classField2Association#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getjava2classField2Association_java2classField2Association__TransformBackward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classField2Association_java2classField2Association#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Forward</em>' operation.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classField2Association_java2classField2Association#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getjava2classField2Association_java2classField2Association__ConflictCheckForward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classField2Association_java2classField2Association#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Mapping</em>' operation.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classField2Association_java2classField2Association#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getjava2classField2Association_java2classField2Association__ConflictCheckMapping__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classField2Association_java2classField2Association#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Backward</em>' operation.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classField2Association_java2classField2Association#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getjava2classField2Association_java2classField2Association__ConflictCheckBackward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classField2Association_java2classField2Association#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Forward</em>' operation.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classField2Association_java2classField2Association#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getjava2classField2Association_java2classField2Association__SynchronizeForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classField2Association_java2classField2Association#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Backward</em>' operation.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classField2Association_java2classField2Association#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getjava2classField2Association_java2classField2Association__SynchronizeBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classField2Association_java2classField2Association#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Forward</em>' operation.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classField2Association_java2classField2Association#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getjava2classField2Association_java2classField2Association__RepairForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classField2Association_java2classField2Association#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Backward</em>' operation.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classField2Association_java2classField2Association#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getjava2classField2Association_java2classField2Association__RepairBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for class '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classChildPkg_childPkg <em>java2class Child Pkg child Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>java2class Child Pkg child Pkg</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classChildPkg_childPkg
	 * @generated
	 */
	EClass getjava2classChildPkg_childPkg();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classChildPkg_childPkg#getAddElementActivity <em>Add Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Add Element Activity</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classChildPkg_childPkg#getAddElementActivity()
	 * @see #getjava2classChildPkg_childPkg()
	 * @generated
	 */
	EReference getjava2classChildPkg_childPkg_AddElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classChildPkg_childPkg#getMoveElementActivity <em>Move Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Move Element Activity</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classChildPkg_childPkg#getMoveElementActivity()
	 * @see #getjava2classChildPkg_childPkg()
	 * @generated
	 */
	EReference getjava2classChildPkg_childPkg_MoveElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classChildPkg_childPkg#getChangeAttributeActivity <em>Change Attribute Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Attribute Activity</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classChildPkg_childPkg#getChangeAttributeActivity()
	 * @see #getjava2classChildPkg_childPkg()
	 * @generated
	 */
	EReference getjava2classChildPkg_childPkg_ChangeAttributeActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classChildPkg_childPkg#getTransformForwardActivity <em>Transform Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Forward Activity</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classChildPkg_childPkg#getTransformForwardActivity()
	 * @see #getjava2classChildPkg_childPkg()
	 * @generated
	 */
	EReference getjava2classChildPkg_childPkg_TransformForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classChildPkg_childPkg#getTransformMappingActivity <em>Transform Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Mapping Activity</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classChildPkg_childPkg#getTransformMappingActivity()
	 * @see #getjava2classChildPkg_childPkg()
	 * @generated
	 */
	EReference getjava2classChildPkg_childPkg_TransformMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classChildPkg_childPkg#getTransformBackwardActivity <em>Transform Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Backward Activity</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classChildPkg_childPkg#getTransformBackwardActivity()
	 * @see #getjava2classChildPkg_childPkg()
	 * @generated
	 */
	EReference getjava2classChildPkg_childPkg_TransformBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classChildPkg_childPkg#getConflictCheckForwardActivity <em>Conflict Check Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Forward Activity</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classChildPkg_childPkg#getConflictCheckForwardActivity()
	 * @see #getjava2classChildPkg_childPkg()
	 * @generated
	 */
	EReference getjava2classChildPkg_childPkg_ConflictCheckForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classChildPkg_childPkg#getConflictCheckMappingActivity <em>Conflict Check Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Mapping Activity</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classChildPkg_childPkg#getConflictCheckMappingActivity()
	 * @see #getjava2classChildPkg_childPkg()
	 * @generated
	 */
	EReference getjava2classChildPkg_childPkg_ConflictCheckMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classChildPkg_childPkg#getConflictCheckBackwardActivity <em>Conflict Check Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Backward Activity</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classChildPkg_childPkg#getConflictCheckBackwardActivity()
	 * @see #getjava2classChildPkg_childPkg()
	 * @generated
	 */
	EReference getjava2classChildPkg_childPkg_ConflictCheckBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classChildPkg_childPkg#getSynchronizeForwardActivity <em>Synchronize Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Forward Activity</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classChildPkg_childPkg#getSynchronizeForwardActivity()
	 * @see #getjava2classChildPkg_childPkg()
	 * @generated
	 */
	EReference getjava2classChildPkg_childPkg_SynchronizeForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classChildPkg_childPkg#getSynchronizeBackwardActivity <em>Synchronize Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Backward Activity</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classChildPkg_childPkg#getSynchronizeBackwardActivity()
	 * @see #getjava2classChildPkg_childPkg()
	 * @generated
	 */
	EReference getjava2classChildPkg_childPkg_SynchronizeBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classChildPkg_childPkg#getRepairForwardActivity <em>Repair Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Forward Activity</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classChildPkg_childPkg#getRepairForwardActivity()
	 * @see #getjava2classChildPkg_childPkg()
	 * @generated
	 */
	EReference getjava2classChildPkg_childPkg_RepairForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classChildPkg_childPkg#getRepairBackwardActivity <em>Repair Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Backward Activity</em>'.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classChildPkg_childPkg#getRepairBackwardActivity()
	 * @see #getjava2classChildPkg_childPkg()
	 * @generated
	 */
	EReference getjava2classChildPkg_childPkg_RepairBackwardActivity();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classChildPkg_childPkg#addElement(org.eclipse.emf.common.util.EMap) <em>Add Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element</em>' operation.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classChildPkg_childPkg#addElement(org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getjava2classChildPkg_childPkg__AddElement__EMap();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classChildPkg_childPkg#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap) <em>Change Attribute Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Attribute Values</em>' operation.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classChildPkg_childPkg#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getjava2classChildPkg_childPkg__ChangeAttributeValues__TGGNode_EMap();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classChildPkg_childPkg#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode) <em>Move Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move Element</em>' operation.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classChildPkg_childPkg#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getjava2classChildPkg_childPkg__MoveElement__TGGNode_TGGNode_TGGNode();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classChildPkg_childPkg#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Forward</em>' operation.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classChildPkg_childPkg#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getjava2classChildPkg_childPkg__TransformForward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classChildPkg_childPkg#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Mapping</em>' operation.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classChildPkg_childPkg#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getjava2classChildPkg_childPkg__TransformMapping__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classChildPkg_childPkg#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Backward</em>' operation.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classChildPkg_childPkg#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getjava2classChildPkg_childPkg__TransformBackward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classChildPkg_childPkg#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Forward</em>' operation.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classChildPkg_childPkg#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getjava2classChildPkg_childPkg__ConflictCheckForward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classChildPkg_childPkg#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Mapping</em>' operation.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classChildPkg_childPkg#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getjava2classChildPkg_childPkg__ConflictCheckMapping__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classChildPkg_childPkg#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Backward</em>' operation.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classChildPkg_childPkg#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getjava2classChildPkg_childPkg__ConflictCheckBackward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classChildPkg_childPkg#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Forward</em>' operation.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classChildPkg_childPkg#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getjava2classChildPkg_childPkg__SynchronizeForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classChildPkg_childPkg#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Backward</em>' operation.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classChildPkg_childPkg#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getjava2classChildPkg_childPkg__SynchronizeBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classChildPkg_childPkg#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Forward</em>' operation.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classChildPkg_childPkg#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getjava2classChildPkg_childPkg__RepairForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.mltgg.java2class.java2class.generated.java2classChildPkg_childPkg#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Backward</em>' operation.
	 * @see de.mdelab.mltgg.java2class.java2class.generated.java2classChildPkg_childPkg#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getjava2classChildPkg_childPkg__RepairBackward__TGGNode_boolean();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GeneratedFactory getGeneratedFactory();

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
		 * The meta object literal for the '{@link de.mdelab.mltgg.java2class.java2class.generated.impl.java2classOperationalTGGImpl <em>java2class Operational TGG</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.mltgg.java2class.java2class.generated.impl.java2classOperationalTGGImpl
		 * @see de.mdelab.mltgg.java2class.java2class.generated.impl.GeneratedPackageImpl#getjava2classOperationalTGG()
		 * @generated
		 */
		EClass JAVA2CLASS_OPERATIONAL_TGG = eINSTANCE.getjava2classOperationalTGG();

		/**
		 * The meta object literal for the '{@link de.mdelab.mltgg.java2class.java2class.generated.impl.java2classAxiomImpl <em>java2class Axiom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.mltgg.java2class.java2class.generated.impl.java2classAxiomImpl
		 * @see de.mdelab.mltgg.java2class.java2class.generated.impl.GeneratedPackageImpl#getjava2classAxiom()
		 * @generated
		 */
		EClass JAVA2CLASS_AXIOM = eINSTANCE.getjava2classAxiom();

		/**
		 * The meta object literal for the '{@link de.mdelab.mltgg.java2class.java2class.generated.impl.java2classPkgImpl <em>java2class Pkg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.mltgg.java2class.java2class.generated.impl.java2classPkgImpl
		 * @see de.mdelab.mltgg.java2class.java2class.generated.impl.GeneratedPackageImpl#getjava2classPkg()
		 * @generated
		 */
		EClass JAVA2CLASS_PKG = eINSTANCE.getjava2classPkg();

		/**
		 * The meta object literal for the '{@link de.mdelab.mltgg.java2class.java2class.generated.impl.java2classClassDeclaration2ClassImpl <em>java2class Class Declaration2 Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.mltgg.java2class.java2class.generated.impl.java2classClassDeclaration2ClassImpl
		 * @see de.mdelab.mltgg.java2class.java2class.generated.impl.GeneratedPackageImpl#getjava2classClassDeclaration2Class()
		 * @generated
		 */
		EClass JAVA2CLASS_CLASS_DECLARATION2_CLASS = eINSTANCE.getjava2classClassDeclaration2Class();

		/**
		 * The meta object literal for the '{@link de.mdelab.mltgg.java2class.java2class.generated.impl.java2classChildPkgImpl <em>java2class Child Pkg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.mltgg.java2class.java2class.generated.impl.java2classChildPkgImpl
		 * @see de.mdelab.mltgg.java2class.java2class.generated.impl.GeneratedPackageImpl#getjava2classChildPkg()
		 * @generated
		 */
		EClass JAVA2CLASS_CHILD_PKG = eINSTANCE.getjava2classChildPkg();

		/**
		 * The meta object literal for the '{@link de.mdelab.mltgg.java2class.java2class.generated.impl.java2classField2AssociationImpl <em>java2class Field2 Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.mltgg.java2class.java2class.generated.impl.java2classField2AssociationImpl
		 * @see de.mdelab.mltgg.java2class.java2class.generated.impl.GeneratedPackageImpl#getjava2classField2Association()
		 * @generated
		 */
		EClass JAVA2CLASS_FIELD2_ASSOCIATION = eINSTANCE.getjava2classField2Association();

		/**
		 * The meta object literal for the '{@link de.mdelab.mltgg.java2class.java2class.generated.impl.java2classAxiom_axiomImpl <em>java2class Axiom axiom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.mltgg.java2class.java2class.generated.impl.java2classAxiom_axiomImpl
		 * @see de.mdelab.mltgg.java2class.java2class.generated.impl.GeneratedPackageImpl#getjava2classAxiom_axiom()
		 * @generated
		 */
		EClass JAVA2CLASS_AXIOM_AXIOM = eINSTANCE.getjava2classAxiom_axiom();

		/**
		 * The meta object literal for the '<em><b>Add Element Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_AXIOM_AXIOM__ADD_ELEMENT_ACTIVITY = eINSTANCE
				.getjava2classAxiom_axiom_AddElementActivity();

		/**
		 * The meta object literal for the '<em><b>Move Element Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_AXIOM_AXIOM__MOVE_ELEMENT_ACTIVITY = eINSTANCE
				.getjava2classAxiom_axiom_MoveElementActivity();

		/**
		 * The meta object literal for the '<em><b>Change Attribute Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_AXIOM_AXIOM__CHANGE_ATTRIBUTE_ACTIVITY = eINSTANCE
				.getjava2classAxiom_axiom_ChangeAttributeActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_AXIOM_AXIOM__TRANSFORM_FORWARD_ACTIVITY = eINSTANCE
				.getjava2classAxiom_axiom_TransformForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Mapping Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_AXIOM_AXIOM__TRANSFORM_MAPPING_ACTIVITY = eINSTANCE
				.getjava2classAxiom_axiom_TransformMappingActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_AXIOM_AXIOM__TRANSFORM_BACKWARD_ACTIVITY = eINSTANCE
				.getjava2classAxiom_axiom_TransformBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Synchronize Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_AXIOM_AXIOM__SYNCHRONIZE_FORWARD_ACTIVITY = eINSTANCE
				.getjava2classAxiom_axiom_SynchronizeForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Synchronize Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_AXIOM_AXIOM__SYNCHRONIZE_BACKWARD_ACTIVITY = eINSTANCE
				.getjava2classAxiom_axiom_SynchronizeBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Add Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_AXIOM_AXIOM___ADD_ELEMENT__EMAP_ELIST_ELIST = eINSTANCE
				.getjava2classAxiom_axiom__AddElement__EMap_EList_EList();

		/**
		 * The meta object literal for the '<em><b>Change Attribute Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_AXIOM_AXIOM___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = eINSTANCE
				.getjava2classAxiom_axiom__ChangeAttributeValues__TGGNode_EMap();

		/**
		 * The meta object literal for the '<em><b>Transform Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_AXIOM_AXIOM___TRANSFORM_FORWARD__ELIST_ELIST_BOOLEAN = eINSTANCE
				.getjava2classAxiom_axiom__TransformForward__EList_EList_boolean();

		/**
		 * The meta object literal for the '<em><b>Transform Mapping</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_AXIOM_AXIOM___TRANSFORM_MAPPING__ELIST_ELIST_BOOLEAN = eINSTANCE
				.getjava2classAxiom_axiom__TransformMapping__EList_EList_boolean();

		/**
		 * The meta object literal for the '<em><b>Transform Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_AXIOM_AXIOM___TRANSFORM_BACKWARD__ELIST_ELIST_BOOLEAN = eINSTANCE
				.getjava2classAxiom_axiom__TransformBackward__EList_EList_boolean();

		/**
		 * The meta object literal for the '<em><b>Synchronize Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_AXIOM_AXIOM___SYNCHRONIZE_FORWARD__ELIST_ELIST_TGGNODE_BOOLEAN = eINSTANCE
				.getjava2classAxiom_axiom__SynchronizeForward__EList_EList_TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Synchronize Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_AXIOM_AXIOM___SYNCHRONIZE_BACKWARD__ELIST_ELIST_TGGNODE_BOOLEAN = eINSTANCE
				.getjava2classAxiom_axiom__SynchronizeBackward__EList_EList_TGGNode_boolean();

		/**
		 * The meta object literal for the '{@link de.mdelab.mltgg.java2class.java2class.generated.impl.java2classPkg_pkgImpl <em>java2class Pkg pkg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.mltgg.java2class.java2class.generated.impl.java2classPkg_pkgImpl
		 * @see de.mdelab.mltgg.java2class.java2class.generated.impl.GeneratedPackageImpl#getjava2classPkg_pkg()
		 * @generated
		 */
		EClass JAVA2CLASS_PKG_PKG = eINSTANCE.getjava2classPkg_pkg();

		/**
		 * The meta object literal for the '<em><b>Add Element Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_PKG_PKG__ADD_ELEMENT_ACTIVITY = eINSTANCE.getjava2classPkg_pkg_AddElementActivity();

		/**
		 * The meta object literal for the '<em><b>Move Element Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_PKG_PKG__MOVE_ELEMENT_ACTIVITY = eINSTANCE.getjava2classPkg_pkg_MoveElementActivity();

		/**
		 * The meta object literal for the '<em><b>Change Attribute Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_PKG_PKG__CHANGE_ATTRIBUTE_ACTIVITY = eINSTANCE
				.getjava2classPkg_pkg_ChangeAttributeActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_PKG_PKG__TRANSFORM_FORWARD_ACTIVITY = eINSTANCE
				.getjava2classPkg_pkg_TransformForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Mapping Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_PKG_PKG__TRANSFORM_MAPPING_ACTIVITY = eINSTANCE
				.getjava2classPkg_pkg_TransformMappingActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_PKG_PKG__TRANSFORM_BACKWARD_ACTIVITY = eINSTANCE
				.getjava2classPkg_pkg_TransformBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_PKG_PKG__CONFLICT_CHECK_FORWARD_ACTIVITY = eINSTANCE
				.getjava2classPkg_pkg_ConflictCheckForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Mapping Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_PKG_PKG__CONFLICT_CHECK_MAPPING_ACTIVITY = eINSTANCE
				.getjava2classPkg_pkg_ConflictCheckMappingActivity();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_PKG_PKG__CONFLICT_CHECK_BACKWARD_ACTIVITY = eINSTANCE
				.getjava2classPkg_pkg_ConflictCheckBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Synchronize Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_PKG_PKG__SYNCHRONIZE_FORWARD_ACTIVITY = eINSTANCE
				.getjava2classPkg_pkg_SynchronizeForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Synchronize Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_PKG_PKG__SYNCHRONIZE_BACKWARD_ACTIVITY = eINSTANCE
				.getjava2classPkg_pkg_SynchronizeBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Repair Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_PKG_PKG__REPAIR_FORWARD_ACTIVITY = eINSTANCE.getjava2classPkg_pkg_RepairForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Repair Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_PKG_PKG__REPAIR_BACKWARD_ACTIVITY = eINSTANCE
				.getjava2classPkg_pkg_RepairBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Add Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_PKG_PKG___ADD_ELEMENT__EMAP = eINSTANCE.getjava2classPkg_pkg__AddElement__EMap();

		/**
		 * The meta object literal for the '<em><b>Change Attribute Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_PKG_PKG___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = eINSTANCE
				.getjava2classPkg_pkg__ChangeAttributeValues__TGGNode_EMap();

		/**
		 * The meta object literal for the '<em><b>Move Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_PKG_PKG___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = eINSTANCE
				.getjava2classPkg_pkg__MoveElement__TGGNode_TGGNode_TGGNode();

		/**
		 * The meta object literal for the '<em><b>Transform Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_PKG_PKG___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = eINSTANCE
				.getjava2classPkg_pkg__TransformForward__TGGNode_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Transform Mapping</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_PKG_PKG___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = eINSTANCE
				.getjava2classPkg_pkg__TransformMapping__TGGNode_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Transform Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_PKG_PKG___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = eINSTANCE
				.getjava2classPkg_pkg__TransformBackward__TGGNode_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_PKG_PKG___CONFLICT_CHECK_FORWARD__TGGNODE = eINSTANCE
				.getjava2classPkg_pkg__ConflictCheckForward__TGGNode();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Mapping</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_PKG_PKG___CONFLICT_CHECK_MAPPING__TGGNODE = eINSTANCE
				.getjava2classPkg_pkg__ConflictCheckMapping__TGGNode();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_PKG_PKG___CONFLICT_CHECK_BACKWARD__TGGNODE = eINSTANCE
				.getjava2classPkg_pkg__ConflictCheckBackward__TGGNode();

		/**
		 * The meta object literal for the '<em><b>Synchronize Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_PKG_PKG___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getjava2classPkg_pkg__SynchronizeForward__TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Synchronize Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_PKG_PKG___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getjava2classPkg_pkg__SynchronizeBackward__TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Repair Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_PKG_PKG___REPAIR_FORWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getjava2classPkg_pkg__RepairForward__TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Repair Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_PKG_PKG___REPAIR_BACKWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getjava2classPkg_pkg__RepairBackward__TGGNode_boolean();

		/**
		 * The meta object literal for the '{@link de.mdelab.mltgg.java2class.java2class.generated.impl.java2classClassDeclaration2Class_java2classClassDeclaration2ClassImpl <em>java2class Class Declaration2 Class java2class Class Declaration2 Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.mltgg.java2class.java2class.generated.impl.java2classClassDeclaration2Class_java2classClassDeclaration2ClassImpl
		 * @see de.mdelab.mltgg.java2class.java2class.generated.impl.GeneratedPackageImpl#getjava2classClassDeclaration2Class_java2classClassDeclaration2Class()
		 * @generated
		 */
		EClass JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS = eINSTANCE
				.getjava2classClassDeclaration2Class_java2classClassDeclaration2Class();

		/**
		 * The meta object literal for the '<em><b>Add Element Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS__ADD_ELEMENT_ACTIVITY = eINSTANCE
				.getjava2classClassDeclaration2Class_java2classClassDeclaration2Class_AddElementActivity();

		/**
		 * The meta object literal for the '<em><b>Move Element Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS__MOVE_ELEMENT_ACTIVITY = eINSTANCE
				.getjava2classClassDeclaration2Class_java2classClassDeclaration2Class_MoveElementActivity();

		/**
		 * The meta object literal for the '<em><b>Change Attribute Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS__CHANGE_ATTRIBUTE_ACTIVITY = eINSTANCE
				.getjava2classClassDeclaration2Class_java2classClassDeclaration2Class_ChangeAttributeActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS__TRANSFORM_FORWARD_ACTIVITY = eINSTANCE
				.getjava2classClassDeclaration2Class_java2classClassDeclaration2Class_TransformForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Mapping Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS__TRANSFORM_MAPPING_ACTIVITY = eINSTANCE
				.getjava2classClassDeclaration2Class_java2classClassDeclaration2Class_TransformMappingActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS__TRANSFORM_BACKWARD_ACTIVITY = eINSTANCE
				.getjava2classClassDeclaration2Class_java2classClassDeclaration2Class_TransformBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS__CONFLICT_CHECK_FORWARD_ACTIVITY = eINSTANCE
				.getjava2classClassDeclaration2Class_java2classClassDeclaration2Class_ConflictCheckForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Mapping Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS__CONFLICT_CHECK_MAPPING_ACTIVITY = eINSTANCE
				.getjava2classClassDeclaration2Class_java2classClassDeclaration2Class_ConflictCheckMappingActivity();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS__CONFLICT_CHECK_BACKWARD_ACTIVITY = eINSTANCE
				.getjava2classClassDeclaration2Class_java2classClassDeclaration2Class_ConflictCheckBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Synchronize Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS__SYNCHRONIZE_FORWARD_ACTIVITY = eINSTANCE
				.getjava2classClassDeclaration2Class_java2classClassDeclaration2Class_SynchronizeForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Synchronize Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS__SYNCHRONIZE_BACKWARD_ACTIVITY = eINSTANCE
				.getjava2classClassDeclaration2Class_java2classClassDeclaration2Class_SynchronizeBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Repair Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS__REPAIR_FORWARD_ACTIVITY = eINSTANCE
				.getjava2classClassDeclaration2Class_java2classClassDeclaration2Class_RepairForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Repair Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS__REPAIR_BACKWARD_ACTIVITY = eINSTANCE
				.getjava2classClassDeclaration2Class_java2classClassDeclaration2Class_RepairBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Add Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS___ADD_ELEMENT__EMAP = eINSTANCE
				.getjava2classClassDeclaration2Class_java2classClassDeclaration2Class__AddElement__EMap();

		/**
		 * The meta object literal for the '<em><b>Change Attribute Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = eINSTANCE
				.getjava2classClassDeclaration2Class_java2classClassDeclaration2Class__ChangeAttributeValues__TGGNode_EMap();

		/**
		 * The meta object literal for the '<em><b>Move Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = eINSTANCE
				.getjava2classClassDeclaration2Class_java2classClassDeclaration2Class__MoveElement__TGGNode_TGGNode_TGGNode();

		/**
		 * The meta object literal for the '<em><b>Transform Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = eINSTANCE
				.getjava2classClassDeclaration2Class_java2classClassDeclaration2Class__TransformForward__TGGNode_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Transform Mapping</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = eINSTANCE
				.getjava2classClassDeclaration2Class_java2classClassDeclaration2Class__TransformMapping__TGGNode_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Transform Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = eINSTANCE
				.getjava2classClassDeclaration2Class_java2classClassDeclaration2Class__TransformBackward__TGGNode_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS___CONFLICT_CHECK_FORWARD__TGGNODE = eINSTANCE
				.getjava2classClassDeclaration2Class_java2classClassDeclaration2Class__ConflictCheckForward__TGGNode();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Mapping</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS___CONFLICT_CHECK_MAPPING__TGGNODE = eINSTANCE
				.getjava2classClassDeclaration2Class_java2classClassDeclaration2Class__ConflictCheckMapping__TGGNode();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS___CONFLICT_CHECK_BACKWARD__TGGNODE = eINSTANCE
				.getjava2classClassDeclaration2Class_java2classClassDeclaration2Class__ConflictCheckBackward__TGGNode();

		/**
		 * The meta object literal for the '<em><b>Synchronize Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getjava2classClassDeclaration2Class_java2classClassDeclaration2Class__SynchronizeForward__TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Synchronize Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getjava2classClassDeclaration2Class_java2classClassDeclaration2Class__SynchronizeBackward__TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Repair Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS___REPAIR_FORWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getjava2classClassDeclaration2Class_java2classClassDeclaration2Class__RepairForward__TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Repair Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS___REPAIR_BACKWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getjava2classClassDeclaration2Class_java2classClassDeclaration2Class__RepairBackward__TGGNode_boolean();

		/**
		 * The meta object literal for the '{@link de.mdelab.mltgg.java2class.java2class.generated.impl.java2classField2Association_java2classField2AssociationImpl <em>java2class Field2 Association java2class Field2 Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.mltgg.java2class.java2class.generated.impl.java2classField2Association_java2classField2AssociationImpl
		 * @see de.mdelab.mltgg.java2class.java2class.generated.impl.GeneratedPackageImpl#getjava2classField2Association_java2classField2Association()
		 * @generated
		 */
		EClass JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION = eINSTANCE
				.getjava2classField2Association_java2classField2Association();

		/**
		 * The meta object literal for the '<em><b>Add Element Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION__ADD_ELEMENT_ACTIVITY = eINSTANCE
				.getjava2classField2Association_java2classField2Association_AddElementActivity();

		/**
		 * The meta object literal for the '<em><b>Move Element Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION__MOVE_ELEMENT_ACTIVITY = eINSTANCE
				.getjava2classField2Association_java2classField2Association_MoveElementActivity();

		/**
		 * The meta object literal for the '<em><b>Change Attribute Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION__CHANGE_ATTRIBUTE_ACTIVITY = eINSTANCE
				.getjava2classField2Association_java2classField2Association_ChangeAttributeActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION__TRANSFORM_FORWARD_ACTIVITY = eINSTANCE
				.getjava2classField2Association_java2classField2Association_TransformForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Mapping Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION__TRANSFORM_MAPPING_ACTIVITY = eINSTANCE
				.getjava2classField2Association_java2classField2Association_TransformMappingActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION__TRANSFORM_BACKWARD_ACTIVITY = eINSTANCE
				.getjava2classField2Association_java2classField2Association_TransformBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION__CONFLICT_CHECK_FORWARD_ACTIVITY = eINSTANCE
				.getjava2classField2Association_java2classField2Association_ConflictCheckForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Mapping Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION__CONFLICT_CHECK_MAPPING_ACTIVITY = eINSTANCE
				.getjava2classField2Association_java2classField2Association_ConflictCheckMappingActivity();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION__CONFLICT_CHECK_BACKWARD_ACTIVITY = eINSTANCE
				.getjava2classField2Association_java2classField2Association_ConflictCheckBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Synchronize Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION__SYNCHRONIZE_FORWARD_ACTIVITY = eINSTANCE
				.getjava2classField2Association_java2classField2Association_SynchronizeForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Synchronize Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION__SYNCHRONIZE_BACKWARD_ACTIVITY = eINSTANCE
				.getjava2classField2Association_java2classField2Association_SynchronizeBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Repair Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION__REPAIR_FORWARD_ACTIVITY = eINSTANCE
				.getjava2classField2Association_java2classField2Association_RepairForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Repair Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION__REPAIR_BACKWARD_ACTIVITY = eINSTANCE
				.getjava2classField2Association_java2classField2Association_RepairBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Add Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION___ADD_ELEMENT__EMAP = eINSTANCE
				.getjava2classField2Association_java2classField2Association__AddElement__EMap();

		/**
		 * The meta object literal for the '<em><b>Change Attribute Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = eINSTANCE
				.getjava2classField2Association_java2classField2Association__ChangeAttributeValues__TGGNode_EMap();

		/**
		 * The meta object literal for the '<em><b>Move Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = eINSTANCE
				.getjava2classField2Association_java2classField2Association__MoveElement__TGGNode_TGGNode_TGGNode();

		/**
		 * The meta object literal for the '<em><b>Transform Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = eINSTANCE
				.getjava2classField2Association_java2classField2Association__TransformForward__TGGNode_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Transform Mapping</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = eINSTANCE
				.getjava2classField2Association_java2classField2Association__TransformMapping__TGGNode_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Transform Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = eINSTANCE
				.getjava2classField2Association_java2classField2Association__TransformBackward__TGGNode_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION___CONFLICT_CHECK_FORWARD__TGGNODE = eINSTANCE
				.getjava2classField2Association_java2classField2Association__ConflictCheckForward__TGGNode();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Mapping</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION___CONFLICT_CHECK_MAPPING__TGGNODE = eINSTANCE
				.getjava2classField2Association_java2classField2Association__ConflictCheckMapping__TGGNode();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION___CONFLICT_CHECK_BACKWARD__TGGNODE = eINSTANCE
				.getjava2classField2Association_java2classField2Association__ConflictCheckBackward__TGGNode();

		/**
		 * The meta object literal for the '<em><b>Synchronize Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getjava2classField2Association_java2classField2Association__SynchronizeForward__TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Synchronize Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getjava2classField2Association_java2classField2Association__SynchronizeBackward__TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Repair Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION___REPAIR_FORWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getjava2classField2Association_java2classField2Association__RepairForward__TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Repair Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION___REPAIR_BACKWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getjava2classField2Association_java2classField2Association__RepairBackward__TGGNode_boolean();

		/**
		 * The meta object literal for the '{@link de.mdelab.mltgg.java2class.java2class.generated.impl.java2classChildPkg_childPkgImpl <em>java2class Child Pkg child Pkg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.mltgg.java2class.java2class.generated.impl.java2classChildPkg_childPkgImpl
		 * @see de.mdelab.mltgg.java2class.java2class.generated.impl.GeneratedPackageImpl#getjava2classChildPkg_childPkg()
		 * @generated
		 */
		EClass JAVA2CLASS_CHILD_PKG_CHILD_PKG = eINSTANCE.getjava2classChildPkg_childPkg();

		/**
		 * The meta object literal for the '<em><b>Add Element Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_CHILD_PKG_CHILD_PKG__ADD_ELEMENT_ACTIVITY = eINSTANCE
				.getjava2classChildPkg_childPkg_AddElementActivity();

		/**
		 * The meta object literal for the '<em><b>Move Element Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_CHILD_PKG_CHILD_PKG__MOVE_ELEMENT_ACTIVITY = eINSTANCE
				.getjava2classChildPkg_childPkg_MoveElementActivity();

		/**
		 * The meta object literal for the '<em><b>Change Attribute Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_CHILD_PKG_CHILD_PKG__CHANGE_ATTRIBUTE_ACTIVITY = eINSTANCE
				.getjava2classChildPkg_childPkg_ChangeAttributeActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_CHILD_PKG_CHILD_PKG__TRANSFORM_FORWARD_ACTIVITY = eINSTANCE
				.getjava2classChildPkg_childPkg_TransformForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Mapping Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_CHILD_PKG_CHILD_PKG__TRANSFORM_MAPPING_ACTIVITY = eINSTANCE
				.getjava2classChildPkg_childPkg_TransformMappingActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_CHILD_PKG_CHILD_PKG__TRANSFORM_BACKWARD_ACTIVITY = eINSTANCE
				.getjava2classChildPkg_childPkg_TransformBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_CHILD_PKG_CHILD_PKG__CONFLICT_CHECK_FORWARD_ACTIVITY = eINSTANCE
				.getjava2classChildPkg_childPkg_ConflictCheckForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Mapping Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_CHILD_PKG_CHILD_PKG__CONFLICT_CHECK_MAPPING_ACTIVITY = eINSTANCE
				.getjava2classChildPkg_childPkg_ConflictCheckMappingActivity();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_CHILD_PKG_CHILD_PKG__CONFLICT_CHECK_BACKWARD_ACTIVITY = eINSTANCE
				.getjava2classChildPkg_childPkg_ConflictCheckBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Synchronize Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_CHILD_PKG_CHILD_PKG__SYNCHRONIZE_FORWARD_ACTIVITY = eINSTANCE
				.getjava2classChildPkg_childPkg_SynchronizeForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Synchronize Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_CHILD_PKG_CHILD_PKG__SYNCHRONIZE_BACKWARD_ACTIVITY = eINSTANCE
				.getjava2classChildPkg_childPkg_SynchronizeBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Repair Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_CHILD_PKG_CHILD_PKG__REPAIR_FORWARD_ACTIVITY = eINSTANCE
				.getjava2classChildPkg_childPkg_RepairForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Repair Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_CHILD_PKG_CHILD_PKG__REPAIR_BACKWARD_ACTIVITY = eINSTANCE
				.getjava2classChildPkg_childPkg_RepairBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Add Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_CHILD_PKG_CHILD_PKG___ADD_ELEMENT__EMAP = eINSTANCE
				.getjava2classChildPkg_childPkg__AddElement__EMap();

		/**
		 * The meta object literal for the '<em><b>Change Attribute Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_CHILD_PKG_CHILD_PKG___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = eINSTANCE
				.getjava2classChildPkg_childPkg__ChangeAttributeValues__TGGNode_EMap();

		/**
		 * The meta object literal for the '<em><b>Move Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_CHILD_PKG_CHILD_PKG___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = eINSTANCE
				.getjava2classChildPkg_childPkg__MoveElement__TGGNode_TGGNode_TGGNode();

		/**
		 * The meta object literal for the '<em><b>Transform Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_CHILD_PKG_CHILD_PKG___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = eINSTANCE
				.getjava2classChildPkg_childPkg__TransformForward__TGGNode_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Transform Mapping</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_CHILD_PKG_CHILD_PKG___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = eINSTANCE
				.getjava2classChildPkg_childPkg__TransformMapping__TGGNode_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Transform Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_CHILD_PKG_CHILD_PKG___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = eINSTANCE
				.getjava2classChildPkg_childPkg__TransformBackward__TGGNode_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_CHILD_PKG_CHILD_PKG___CONFLICT_CHECK_FORWARD__TGGNODE = eINSTANCE
				.getjava2classChildPkg_childPkg__ConflictCheckForward__TGGNode();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Mapping</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_CHILD_PKG_CHILD_PKG___CONFLICT_CHECK_MAPPING__TGGNODE = eINSTANCE
				.getjava2classChildPkg_childPkg__ConflictCheckMapping__TGGNode();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_CHILD_PKG_CHILD_PKG___CONFLICT_CHECK_BACKWARD__TGGNODE = eINSTANCE
				.getjava2classChildPkg_childPkg__ConflictCheckBackward__TGGNode();

		/**
		 * The meta object literal for the '<em><b>Synchronize Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_CHILD_PKG_CHILD_PKG___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getjava2classChildPkg_childPkg__SynchronizeForward__TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Synchronize Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_CHILD_PKG_CHILD_PKG___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getjava2classChildPkg_childPkg__SynchronizeBackward__TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Repair Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_CHILD_PKG_CHILD_PKG___REPAIR_FORWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getjava2classChildPkg_childPkg__RepairForward__TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Repair Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_CHILD_PKG_CHILD_PKG___REPAIR_BACKWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getjava2classChildPkg_childPkg__RepairBackward__TGGNode_boolean();

	}

} //GeneratedPackage
