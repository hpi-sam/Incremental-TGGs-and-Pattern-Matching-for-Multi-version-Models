/**
 */
package de.mdelab.migmm.java2class_adapted.generated;

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
 * @see de.mdelab.migmm.java2class_adapted.generated.GeneratedFactory
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
	String eNS_URI = "http://www.mdelab.de/mltgg/java2class/adapted/1.0/generated";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "java2class_adapted.generated";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GeneratedPackage eINSTANCE = de.mdelab.migmm.java2class_adapted.generated.impl.GeneratedPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.mdelab.migmm.java2class_adapted.generated.impl.java2class_adaptedOperationalTGGImpl <em>java2class adapted Operational TGG</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.migmm.java2class_adapted.generated.impl.java2class_adaptedOperationalTGGImpl
	 * @see de.mdelab.migmm.java2class_adapted.generated.impl.GeneratedPackageImpl#getjava2class_adaptedOperationalTGG()
	 * @generated
	 */
	int JAVA2CLASS_ADAPTED_OPERATIONAL_TGG = 0;

	/**
	 * The feature id for the '<em><b>Operational Axiom Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_ADAPTED_OPERATIONAL_TGG__OPERATIONAL_AXIOM_GROUP = SdmPackage.SDM_OPERATIONAL_TGG__OPERATIONAL_AXIOM_GROUP;

	/**
	 * The feature id for the '<em><b>Operational Rule Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_ADAPTED_OPERATIONAL_TGG__OPERATIONAL_RULE_GROUPS = SdmPackage.SDM_OPERATIONAL_TGG__OPERATIONAL_RULE_GROUPS;

	/**
	 * The feature id for the '<em><b>Tgg Engine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_ADAPTED_OPERATIONAL_TGG__TGG_ENGINE = SdmPackage.SDM_OPERATIONAL_TGG__TGG_ENGINE;

	/**
	 * The feature id for the '<em><b>Tgg ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_ADAPTED_OPERATIONAL_TGG__TGG_ID = SdmPackage.SDM_OPERATIONAL_TGG__TGG_ID;

	/**
	 * The feature id for the '<em><b>Unidirectional References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_ADAPTED_OPERATIONAL_TGG__UNIDIRECTIONAL_REFERENCES = SdmPackage.SDM_OPERATIONAL_TGG__UNIDIRECTIONAL_REFERENCES;

	/**
	 * The feature id for the '<em><b>Interpreter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_ADAPTED_OPERATIONAL_TGG__INTERPRETER = SdmPackage.SDM_OPERATIONAL_TGG__INTERPRETER;

	/**
	 * The number of structural features of the '<em>java2class adapted Operational TGG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_ADAPTED_OPERATIONAL_TGG_FEATURE_COUNT = SdmPackage.SDM_OPERATIONAL_TGG_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Transformation Started</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_ADAPTED_OPERATIONAL_TGG___TRANSFORMATION_STARTED = SdmPackage.SDM_OPERATIONAL_TGG___TRANSFORMATION_STARTED;

	/**
	 * The operation id for the '<em>Transformation Finished</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_ADAPTED_OPERATIONAL_TGG___TRANSFORMATION_FINISHED = SdmPackage.SDM_OPERATIONAL_TGG___TRANSFORMATION_FINISHED;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_ADAPTED_OPERATIONAL_TGG___INIT = SdmPackage.SDM_OPERATIONAL_TGG___INIT;

	/**
	 * The operation id for the '<em>Get Operational Mapping Group</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_ADAPTED_OPERATIONAL_TGG___GET_OPERATIONAL_MAPPING_GROUP__STRING = SdmPackage.SDM_OPERATIONAL_TGG___GET_OPERATIONAL_MAPPING_GROUP__STRING;

	/**
	 * The operation id for the '<em>Execute Activity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_ADAPTED_OPERATIONAL_TGG___EXECUTE_ACTIVITY__ACTIVITY_EMAP = SdmPackage.SDM_OPERATIONAL_TGG___EXECUTE_ACTIVITY__ACTIVITY_EMAP;

	/**
	 * The number of operations of the '<em>java2class adapted Operational TGG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_ADAPTED_OPERATIONAL_TGG_OPERATION_COUNT = SdmPackage.SDM_OPERATIONAL_TGG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.migmm.java2class_adapted.generated.impl.History2History2Impl <em>History2 History2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.migmm.java2class_adapted.generated.impl.History2History2Impl
	 * @see de.mdelab.migmm.java2class_adapted.generated.impl.GeneratedPackageImpl#getHistory2History2()
	 * @generated
	 */
	int HISTORY2_HISTORY2 = 1;

	/**
	 * The feature id for the '<em><b>Rule Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY2_HISTORY2__RULE_GROUP_ID = OperationalTGGPackage.OPERATIONAL_AXIOM_GROUP__RULE_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Axioms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY2_HISTORY2__AXIOMS = OperationalTGGPackage.OPERATIONAL_AXIOM_GROUP__AXIOMS;

	/**
	 * The feature id for the '<em><b>Operational TGG</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY2_HISTORY2__OPERATIONAL_TGG = OperationalTGGPackage.OPERATIONAL_AXIOM_GROUP__OPERATIONAL_TGG;

	/**
	 * The number of structural features of the '<em>History2 History2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY2_HISTORY2_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_AXIOM_GROUP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Operational Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY2_HISTORY2___GET_OPERATIONAL_MAPPING__STRING = OperationalTGGPackage.OPERATIONAL_AXIOM_GROUP___GET_OPERATIONAL_MAPPING__STRING;

	/**
	 * The number of operations of the '<em>History2 History2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY2_HISTORY2_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_AXIOM_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.migmm.java2class_adapted.generated.impl.java2classAxiom_adaptedImpl <em>java2class Axiom adapted</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.migmm.java2class_adapted.generated.impl.java2classAxiom_adaptedImpl
	 * @see de.mdelab.migmm.java2class_adapted.generated.impl.GeneratedPackageImpl#getjava2classAxiom_adapted()
	 * @generated
	 */
	int JAVA2CLASS_AXIOM_ADAPTED = 2;

	/**
	 * The feature id for the '<em><b>Rule Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_AXIOM_ADAPTED__RULE_GROUP_ID = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULE_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_AXIOM_ADAPTED__RULES = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULES;

	/**
	 * The feature id for the '<em><b>Operational TGG</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_AXIOM_ADAPTED__OPERATIONAL_TGG = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__OPERATIONAL_TGG;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_AXIOM_ADAPTED__ENABLED = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__ENABLED;

	/**
	 * The number of structural features of the '<em>java2class Axiom adapted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_AXIOM_ADAPTED_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Operational Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_AXIOM_ADAPTED___GET_OPERATIONAL_MAPPING__STRING = OperationalTGGPackage.OPERATIONAL_RULE_GROUP___GET_OPERATIONAL_MAPPING__STRING;

	/**
	 * The number of operations of the '<em>java2class Axiom adapted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_AXIOM_ADAPTED_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.migmm.java2class_adapted.generated.impl.java2classPkg_adaptedImpl <em>java2class Pkg adapted</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.migmm.java2class_adapted.generated.impl.java2classPkg_adaptedImpl
	 * @see de.mdelab.migmm.java2class_adapted.generated.impl.GeneratedPackageImpl#getjava2classPkg_adapted()
	 * @generated
	 */
	int JAVA2CLASS_PKG_ADAPTED = 3;

	/**
	 * The feature id for the '<em><b>Rule Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_ADAPTED__RULE_GROUP_ID = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULE_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_ADAPTED__RULES = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULES;

	/**
	 * The feature id for the '<em><b>Operational TGG</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_ADAPTED__OPERATIONAL_TGG = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__OPERATIONAL_TGG;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_ADAPTED__ENABLED = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__ENABLED;

	/**
	 * The number of structural features of the '<em>java2class Pkg adapted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_ADAPTED_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Operational Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_ADAPTED___GET_OPERATIONAL_MAPPING__STRING = OperationalTGGPackage.OPERATIONAL_RULE_GROUP___GET_OPERATIONAL_MAPPING__STRING;

	/**
	 * The number of operations of the '<em>java2class Pkg adapted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_ADAPTED_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.migmm.java2class_adapted.generated.impl.java2classChildPkg_adaptedImpl <em>java2class Child Pkg adapted</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.migmm.java2class_adapted.generated.impl.java2classChildPkg_adaptedImpl
	 * @see de.mdelab.migmm.java2class_adapted.generated.impl.GeneratedPackageImpl#getjava2classChildPkg_adapted()
	 * @generated
	 */
	int JAVA2CLASS_CHILD_PKG_ADAPTED = 4;

	/**
	 * The feature id for the '<em><b>Rule Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_ADAPTED__RULE_GROUP_ID = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULE_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_ADAPTED__RULES = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULES;

	/**
	 * The feature id for the '<em><b>Operational TGG</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_ADAPTED__OPERATIONAL_TGG = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__OPERATIONAL_TGG;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_ADAPTED__ENABLED = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__ENABLED;

	/**
	 * The number of structural features of the '<em>java2class Child Pkg adapted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_ADAPTED_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Operational Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_ADAPTED___GET_OPERATIONAL_MAPPING__STRING = OperationalTGGPackage.OPERATIONAL_RULE_GROUP___GET_OPERATIONAL_MAPPING__STRING;

	/**
	 * The number of operations of the '<em>java2class Child Pkg adapted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_ADAPTED_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.migmm.java2class_adapted.generated.impl.java2classClassDeclaration2Class_adaptedImpl <em>java2class Class Declaration2 Class adapted</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.migmm.java2class_adapted.generated.impl.java2classClassDeclaration2Class_adaptedImpl
	 * @see de.mdelab.migmm.java2class_adapted.generated.impl.GeneratedPackageImpl#getjava2classClassDeclaration2Class_adapted()
	 * @generated
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED = 5;

	/**
	 * The feature id for the '<em><b>Rule Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED__RULE_GROUP_ID = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULE_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED__RULES = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULES;

	/**
	 * The feature id for the '<em><b>Operational TGG</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED__OPERATIONAL_TGG = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__OPERATIONAL_TGG;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED__ENABLED = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__ENABLED;

	/**
	 * The number of structural features of the '<em>java2class Class Declaration2 Class adapted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_FEATURE_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Get Operational Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED___GET_OPERATIONAL_MAPPING__STRING = OperationalTGGPackage.OPERATIONAL_RULE_GROUP___GET_OPERATIONAL_MAPPING__STRING;

	/**
	 * The number of operations of the '<em>java2class Class Declaration2 Class adapted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link de.mdelab.migmm.java2class_adapted.generated.impl.java2classField2Association_adaptedImpl <em>java2class Field2 Association adapted</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.migmm.java2class_adapted.generated.impl.java2classField2Association_adaptedImpl
	 * @see de.mdelab.migmm.java2class_adapted.generated.impl.GeneratedPackageImpl#getjava2classField2Association_adapted()
	 * @generated
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED = 6;

	/**
	 * The feature id for the '<em><b>Rule Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__RULE_GROUP_ID = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULE_GROUP_ID;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__RULES = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__RULES;

	/**
	 * The feature id for the '<em><b>Operational TGG</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__OPERATIONAL_TGG = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__OPERATIONAL_TGG;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__ENABLED = OperationalTGGPackage.OPERATIONAL_RULE_GROUP__ENABLED;

	/**
	 * The number of structural features of the '<em>java2class Field2 Association adapted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_FEATURE_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Get Operational Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED___GET_OPERATIONAL_MAPPING__STRING = OperationalTGGPackage.OPERATIONAL_RULE_GROUP___GET_OPERATIONAL_MAPPING__STRING;

	/**
	 * The number of operations of the '<em>java2class Field2 Association adapted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_GROUP_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link de.mdelab.migmm.java2class_adapted.generated.impl.History2History2_History2HistoryImpl <em>History2 History2 History2 History</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.migmm.java2class_adapted.generated.impl.History2History2_History2HistoryImpl
	 * @see de.mdelab.migmm.java2class_adapted.generated.impl.GeneratedPackageImpl#getHistory2History2_History2History()
	 * @generated
	 */
	int HISTORY2_HISTORY2_HISTORY2_HISTORY = 7;

	/**
	 * The feature id for the '<em><b>Created TGG Nodes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY2_HISTORY2_HISTORY2_HISTORY__CREATED_TGG_NODES = OperationalTGGPackage.OPERATIONAL_AXIOM__CREATED_TGG_NODES;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY2_HISTORY2_HISTORY2_HISTORY__RULE_ID = OperationalTGGPackage.OPERATIONAL_AXIOM__RULE_ID;

	/**
	 * The feature id for the '<em><b>Operational Axiom Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY2_HISTORY2_HISTORY2_HISTORY__OPERATIONAL_AXIOM_GROUP = OperationalTGGPackage.OPERATIONAL_AXIOM__OPERATIONAL_AXIOM_GROUP;

	/**
	 * The feature id for the '<em><b>Add Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY2_HISTORY2_HISTORY2_HISTORY__ADD_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>Move Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY2_HISTORY2_HISTORY2_HISTORY__MOVE_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>Change Attribute Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY2_HISTORY2_HISTORY2_HISTORY__CHANGE_ATTRIBUTE_ACTIVITY = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>Transform Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY2_HISTORY2_HISTORY2_HISTORY__TRANSFORM_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>Transform Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY2_HISTORY2_HISTORY2_HISTORY__TRANSFORM_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>Transform Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY2_HISTORY2_HISTORY2_HISTORY__TRANSFORM_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>Synchronize Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY2_HISTORY2_HISTORY2_HISTORY__SYNCHRONIZE_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>Synchronize Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY2_HISTORY2_HISTORY2_HISTORY__SYNCHRONIZE_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT
			+ 7;

	/**
	 * The number of structural features of the '<em>History2 History2 History2 History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY2_HISTORY2_HISTORY2_HISTORY_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_AXIOM_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Delete Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY2_HISTORY2_HISTORY2_HISTORY___DELETE_ELEMENT__TGGNODE = OperationalTGGPackage.OPERATIONAL_AXIOM___DELETE_ELEMENT__TGGNODE;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY2_HISTORY2_HISTORY2_HISTORY___ADD_ELEMENT__EMAP_ELIST_ELIST = OperationalTGGPackage.OPERATIONAL_AXIOM_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Change Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY2_HISTORY2_HISTORY2_HISTORY___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = OperationalTGGPackage.OPERATIONAL_AXIOM_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Transform Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY2_HISTORY2_HISTORY2_HISTORY___TRANSFORM_FORWARD__ELIST_ELIST_BOOLEAN = OperationalTGGPackage.OPERATIONAL_AXIOM_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Transform Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY2_HISTORY2_HISTORY2_HISTORY___TRANSFORM_MAPPING__ELIST_ELIST_BOOLEAN = OperationalTGGPackage.OPERATIONAL_AXIOM_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Transform Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY2_HISTORY2_HISTORY2_HISTORY___TRANSFORM_BACKWARD__ELIST_ELIST_BOOLEAN = OperationalTGGPackage.OPERATIONAL_AXIOM_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Synchronize Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY2_HISTORY2_HISTORY2_HISTORY___SYNCHRONIZE_FORWARD__ELIST_ELIST_TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_AXIOM_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Synchronize Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY2_HISTORY2_HISTORY2_HISTORY___SYNCHRONIZE_BACKWARD__ELIST_ELIST_TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_AXIOM_OPERATION_COUNT
			+ 6;

	/**
	 * The number of operations of the '<em>History2 History2 History2 History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY2_HISTORY2_HISTORY2_HISTORY_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_AXIOM_OPERATION_COUNT
			+ 7;

	/**
	 * The meta object id for the '{@link de.mdelab.migmm.java2class_adapted.generated.impl.java2classPkg_adapted_pkg_adaptedImpl <em>java2class Pkg adapted pkg adapted</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.migmm.java2class_adapted.generated.impl.java2classPkg_adapted_pkg_adaptedImpl
	 * @see de.mdelab.migmm.java2class_adapted.generated.impl.GeneratedPackageImpl#getjava2classPkg_adapted_pkg_adapted()
	 * @generated
	 */
	int JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED = 8;

	/**
	 * The feature id for the '<em><b>Created TGG Nodes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED__CREATED_TGG_NODES = OperationalTGGPackage.OPERATIONAL_RULE__CREATED_TGG_NODES;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED__RULE_ID = OperationalTGGPackage.OPERATIONAL_RULE__RULE_ID;

	/**
	 * The feature id for the '<em><b>Operational Rule Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED__OPERATIONAL_RULE_GROUP = OperationalTGGPackage.OPERATIONAL_RULE__OPERATIONAL_RULE_GROUP;

	/**
	 * The feature id for the '<em><b>Preferred Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED__PREFERRED_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__PREFERRED_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>All Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED__ALL_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__ALL_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED__ENABLED = OperationalTGGPackage.OPERATIONAL_RULE__ENABLED;

	/**
	 * The feature id for the '<em><b>Add Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED__ADD_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>Move Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED__MOVE_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>Change Attribute Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED__CHANGE_ATTRIBUTE_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>Transform Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED__TRANSFORM_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>Transform Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED__TRANSFORM_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>Transform Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED__TRANSFORM_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>Conflict Check Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED__CONFLICT_CHECK_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>Conflict Check Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED__CONFLICT_CHECK_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>Conflict Check Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED__CONFLICT_CHECK_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 8;

	/**
	 * The feature id for the '<em><b>Synchronize Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED__SYNCHRONIZE_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 9;

	/**
	 * The feature id for the '<em><b>Synchronize Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED__SYNCHRONIZE_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 10;

	/**
	 * The feature id for the '<em><b>Repair Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED__REPAIR_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 11;

	/**
	 * The feature id for the '<em><b>Repair Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED__REPAIR_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 12;

	/**
	 * The number of structural features of the '<em>java2class Pkg adapted pkg adapted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Delete Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED___DELETE_ELEMENT__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE___DELETE_ELEMENT__TGGNODE;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED___ADD_ELEMENT__EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Change Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Move Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Transform Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Transform Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Transform Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Conflict Check Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED___CONFLICT_CHECK_FORWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Conflict Check Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED___CONFLICT_CHECK_MAPPING__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Conflict Check Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED___CONFLICT_CHECK_BACKWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Synchronize Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 9;

	/**
	 * The operation id for the '<em>Synchronize Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Repair Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED___REPAIR_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Repair Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED___REPAIR_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The number of operations of the '<em>java2class Pkg adapted pkg adapted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The meta object id for the '{@link de.mdelab.migmm.java2class_adapted.generated.impl.java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adaptedImpl <em>java2class Class Declaration2 Class adapted java2class Class Declaration2 Class adapted</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.migmm.java2class_adapted.generated.impl.java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adaptedImpl
	 * @see de.mdelab.migmm.java2class_adapted.generated.impl.GeneratedPackageImpl#getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted()
	 * @generated
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED = 9;

	/**
	 * The feature id for the '<em><b>Created TGG Nodes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED__CREATED_TGG_NODES = OperationalTGGPackage.OPERATIONAL_RULE__CREATED_TGG_NODES;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED__RULE_ID = OperationalTGGPackage.OPERATIONAL_RULE__RULE_ID;

	/**
	 * The feature id for the '<em><b>Operational Rule Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED__OPERATIONAL_RULE_GROUP = OperationalTGGPackage.OPERATIONAL_RULE__OPERATIONAL_RULE_GROUP;

	/**
	 * The feature id for the '<em><b>Preferred Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED__PREFERRED_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__PREFERRED_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>All Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED__ALL_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__ALL_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED__ENABLED = OperationalTGGPackage.OPERATIONAL_RULE__ENABLED;

	/**
	 * The feature id for the '<em><b>Add Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED__ADD_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>Move Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED__MOVE_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>Change Attribute Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED__CHANGE_ATTRIBUTE_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>Transform Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED__TRANSFORM_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>Transform Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED__TRANSFORM_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>Transform Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED__TRANSFORM_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>Conflict Check Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED__CONFLICT_CHECK_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>Conflict Check Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED__CONFLICT_CHECK_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>Conflict Check Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED__CONFLICT_CHECK_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 8;

	/**
	 * The feature id for the '<em><b>Synchronize Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED__SYNCHRONIZE_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 9;

	/**
	 * The feature id for the '<em><b>Synchronize Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED__SYNCHRONIZE_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 10;

	/**
	 * The feature id for the '<em><b>Repair Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED__REPAIR_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 11;

	/**
	 * The feature id for the '<em><b>Repair Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED__REPAIR_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 12;

	/**
	 * The number of structural features of the '<em>java2class Class Declaration2 Class adapted java2class Class Declaration2 Class adapted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Delete Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED___DELETE_ELEMENT__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE___DELETE_ELEMENT__TGGNODE;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED___ADD_ELEMENT__EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Change Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Move Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Transform Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Transform Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Transform Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Conflict Check Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED___CONFLICT_CHECK_FORWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Conflict Check Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED___CONFLICT_CHECK_MAPPING__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Conflict Check Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED___CONFLICT_CHECK_BACKWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Synchronize Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 9;

	/**
	 * The operation id for the '<em>Synchronize Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Repair Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED___REPAIR_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Repair Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED___REPAIR_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The number of operations of the '<em>java2class Class Declaration2 Class adapted java2class Class Declaration2 Class adapted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The meta object id for the '{@link de.mdelab.migmm.java2class_adapted.generated.impl.java2classField2Association_adapted_java2classField2Association_adaptedImpl <em>java2class Field2 Association adapted java2class Field2 Association adapted</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.migmm.java2class_adapted.generated.impl.java2classField2Association_adapted_java2classField2Association_adaptedImpl
	 * @see de.mdelab.migmm.java2class_adapted.generated.impl.GeneratedPackageImpl#getjava2classField2Association_adapted_java2classField2Association_adapted()
	 * @generated
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED = 10;

	/**
	 * The feature id for the '<em><b>Created TGG Nodes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__CREATED_TGG_NODES = OperationalTGGPackage.OPERATIONAL_RULE__CREATED_TGG_NODES;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__RULE_ID = OperationalTGGPackage.OPERATIONAL_RULE__RULE_ID;

	/**
	 * The feature id for the '<em><b>Operational Rule Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__OPERATIONAL_RULE_GROUP = OperationalTGGPackage.OPERATIONAL_RULE__OPERATIONAL_RULE_GROUP;

	/**
	 * The feature id for the '<em><b>Preferred Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__PREFERRED_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__PREFERRED_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>All Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__ALL_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__ALL_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__ENABLED = OperationalTGGPackage.OPERATIONAL_RULE__ENABLED;

	/**
	 * The feature id for the '<em><b>Add Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__ADD_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>Move Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__MOVE_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>Change Attribute Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__CHANGE_ATTRIBUTE_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>Transform Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__TRANSFORM_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>Transform Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__TRANSFORM_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>Transform Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__TRANSFORM_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>Conflict Check Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__CONFLICT_CHECK_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>Conflict Check Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__CONFLICT_CHECK_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>Conflict Check Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__CONFLICT_CHECK_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 8;

	/**
	 * The feature id for the '<em><b>Synchronize Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__SYNCHRONIZE_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 9;

	/**
	 * The feature id for the '<em><b>Synchronize Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__SYNCHRONIZE_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 10;

	/**
	 * The feature id for the '<em><b>Repair Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__REPAIR_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 11;

	/**
	 * The feature id for the '<em><b>Repair Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__REPAIR_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 12;

	/**
	 * The number of structural features of the '<em>java2class Field2 Association adapted java2class Field2 Association adapted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Delete Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED___DELETE_ELEMENT__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE___DELETE_ELEMENT__TGGNODE;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED___ADD_ELEMENT__EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Change Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Move Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Transform Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Transform Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Transform Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Conflict Check Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED___CONFLICT_CHECK_FORWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Conflict Check Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED___CONFLICT_CHECK_MAPPING__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Conflict Check Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED___CONFLICT_CHECK_BACKWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Synchronize Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 9;

	/**
	 * The operation id for the '<em>Synchronize Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Repair Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED___REPAIR_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Repair Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED___REPAIR_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The number of operations of the '<em>java2class Field2 Association adapted java2class Field2 Association adapted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The meta object id for the '{@link de.mdelab.migmm.java2class_adapted.generated.impl.java2classChildPkg_adapted_childPkg_adaptedImpl <em>java2class Child Pkg adapted child Pkg adapted</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.migmm.java2class_adapted.generated.impl.java2classChildPkg_adapted_childPkg_adaptedImpl
	 * @see de.mdelab.migmm.java2class_adapted.generated.impl.GeneratedPackageImpl#getjava2classChildPkg_adapted_childPkg_adapted()
	 * @generated
	 */
	int JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED = 11;

	/**
	 * The feature id for the '<em><b>Created TGG Nodes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED__CREATED_TGG_NODES = OperationalTGGPackage.OPERATIONAL_RULE__CREATED_TGG_NODES;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED__RULE_ID = OperationalTGGPackage.OPERATIONAL_RULE__RULE_ID;

	/**
	 * The feature id for the '<em><b>Operational Rule Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED__OPERATIONAL_RULE_GROUP = OperationalTGGPackage.OPERATIONAL_RULE__OPERATIONAL_RULE_GROUP;

	/**
	 * The feature id for the '<em><b>Preferred Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED__PREFERRED_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__PREFERRED_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>All Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED__ALL_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__ALL_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED__ENABLED = OperationalTGGPackage.OPERATIONAL_RULE__ENABLED;

	/**
	 * The feature id for the '<em><b>Add Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED__ADD_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>Move Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED__MOVE_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>Change Attribute Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED__CHANGE_ATTRIBUTE_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>Transform Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED__TRANSFORM_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>Transform Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED__TRANSFORM_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>Transform Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED__TRANSFORM_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>Conflict Check Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED__CONFLICT_CHECK_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>Conflict Check Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED__CONFLICT_CHECK_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>Conflict Check Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED__CONFLICT_CHECK_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 8;

	/**
	 * The feature id for the '<em><b>Synchronize Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED__SYNCHRONIZE_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 9;

	/**
	 * The feature id for the '<em><b>Synchronize Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED__SYNCHRONIZE_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 10;

	/**
	 * The feature id for the '<em><b>Repair Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED__REPAIR_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 11;

	/**
	 * The feature id for the '<em><b>Repair Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED__REPAIR_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 12;

	/**
	 * The number of structural features of the '<em>java2class Child Pkg adapted child Pkg adapted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Delete Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED___DELETE_ELEMENT__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE___DELETE_ELEMENT__TGGNODE;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED___ADD_ELEMENT__EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Change Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Move Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Transform Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Transform Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Transform Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Conflict Check Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED___CONFLICT_CHECK_FORWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Conflict Check Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED___CONFLICT_CHECK_MAPPING__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Conflict Check Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED___CONFLICT_CHECK_BACKWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Synchronize Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 9;

	/**
	 * The operation id for the '<em>Synchronize Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Repair Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED___REPAIR_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Repair Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED___REPAIR_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The number of operations of the '<em>java2class Child Pkg adapted child Pkg adapted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The meta object id for the '{@link de.mdelab.migmm.java2class_adapted.generated.impl.java2classAxiom_adapted_axiom_adaptedImpl <em>java2class Axiom adapted axiom adapted</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.migmm.java2class_adapted.generated.impl.java2classAxiom_adapted_axiom_adaptedImpl
	 * @see de.mdelab.migmm.java2class_adapted.generated.impl.GeneratedPackageImpl#getjava2classAxiom_adapted_axiom_adapted()
	 * @generated
	 */
	int JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED = 12;

	/**
	 * The feature id for the '<em><b>Created TGG Nodes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED__CREATED_TGG_NODES = OperationalTGGPackage.OPERATIONAL_RULE__CREATED_TGG_NODES;

	/**
	 * The feature id for the '<em><b>Rule ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED__RULE_ID = OperationalTGGPackage.OPERATIONAL_RULE__RULE_ID;

	/**
	 * The feature id for the '<em><b>Operational Rule Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED__OPERATIONAL_RULE_GROUP = OperationalTGGPackage.OPERATIONAL_RULE__OPERATIONAL_RULE_GROUP;

	/**
	 * The feature id for the '<em><b>Preferred Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED__PREFERRED_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__PREFERRED_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>All Input Corr Node Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED__ALL_INPUT_CORR_NODE_TYPES = OperationalTGGPackage.OPERATIONAL_RULE__ALL_INPUT_CORR_NODE_TYPES;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED__ENABLED = OperationalTGGPackage.OPERATIONAL_RULE__ENABLED;

	/**
	 * The feature id for the '<em><b>Add Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED__ADD_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>Move Element Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED__MOVE_ELEMENT_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>Change Attribute Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED__CHANGE_ATTRIBUTE_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>Transform Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED__TRANSFORM_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>Transform Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED__TRANSFORM_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>Transform Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED__TRANSFORM_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>Conflict Check Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED__CONFLICT_CHECK_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 6;

	/**
	 * The feature id for the '<em><b>Conflict Check Mapping Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED__CONFLICT_CHECK_MAPPING_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 7;

	/**
	 * The feature id for the '<em><b>Conflict Check Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED__CONFLICT_CHECK_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 8;

	/**
	 * The feature id for the '<em><b>Synchronize Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED__SYNCHRONIZE_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 9;

	/**
	 * The feature id for the '<em><b>Synchronize Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED__SYNCHRONIZE_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 10;

	/**
	 * The feature id for the '<em><b>Repair Forward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED__REPAIR_FORWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 11;

	/**
	 * The feature id for the '<em><b>Repair Backward Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED__REPAIR_BACKWARD_ACTIVITY = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 12;

	/**
	 * The number of structural features of the '<em>java2class Axiom adapted axiom adapted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED_FEATURE_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_FEATURE_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Delete Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED___DELETE_ELEMENT__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE___DELETE_ELEMENT__TGGNODE;

	/**
	 * The operation id for the '<em>Add Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED___ADD_ELEMENT__EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Change Attribute Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Move Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Transform Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Transform Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Transform Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Conflict Check Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED___CONFLICT_CHECK_FORWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Conflict Check Mapping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED___CONFLICT_CHECK_MAPPING__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Conflict Check Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED___CONFLICT_CHECK_BACKWARD__TGGNODE = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Synchronize Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 9;

	/**
	 * The operation id for the '<em>Synchronize Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Repair Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED___REPAIR_FORWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Repair Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED___REPAIR_BACKWARD__TGGNODE_BOOLEAN = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The number of operations of the '<em>java2class Axiom adapted axiom adapted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED_OPERATION_COUNT = OperationalTGGPackage.OPERATIONAL_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * Returns the meta object for class '{@link de.mdelab.migmm.java2class_adapted.generated.java2class_adaptedOperationalTGG <em>java2class adapted Operational TGG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>java2class adapted Operational TGG</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2class_adaptedOperationalTGG
	 * @generated
	 */
	EClass getjava2class_adaptedOperationalTGG();

	/**
	 * Returns the meta object for class '{@link de.mdelab.migmm.java2class_adapted.generated.History2History2 <em>History2 History2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>History2 History2</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.History2History2
	 * @generated
	 */
	EClass getHistory2History2();

	/**
	 * Returns the meta object for class '{@link de.mdelab.migmm.java2class_adapted.generated.java2classAxiom_adapted <em>java2class Axiom adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>java2class Axiom adapted</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classAxiom_adapted
	 * @generated
	 */
	EClass getjava2classAxiom_adapted();

	/**
	 * Returns the meta object for class '{@link de.mdelab.migmm.java2class_adapted.generated.java2classPkg_adapted <em>java2class Pkg adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>java2class Pkg adapted</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classPkg_adapted
	 * @generated
	 */
	EClass getjava2classPkg_adapted();

	/**
	 * Returns the meta object for class '{@link de.mdelab.migmm.java2class_adapted.generated.java2classChildPkg_adapted <em>java2class Child Pkg adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>java2class Child Pkg adapted</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classChildPkg_adapted
	 * @generated
	 */
	EClass getjava2classChildPkg_adapted();

	/**
	 * Returns the meta object for class '{@link de.mdelab.migmm.java2class_adapted.generated.java2classClassDeclaration2Class_adapted <em>java2class Class Declaration2 Class adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>java2class Class Declaration2 Class adapted</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classClassDeclaration2Class_adapted
	 * @generated
	 */
	EClass getjava2classClassDeclaration2Class_adapted();

	/**
	 * Returns the meta object for class '{@link de.mdelab.migmm.java2class_adapted.generated.java2classField2Association_adapted <em>java2class Field2 Association adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>java2class Field2 Association adapted</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classField2Association_adapted
	 * @generated
	 */
	EClass getjava2classField2Association_adapted();

	/**
	 * Returns the meta object for class '{@link de.mdelab.migmm.java2class_adapted.generated.History2History2_History2History <em>History2 History2 History2 History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>History2 History2 History2 History</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.History2History2_History2History
	 * @generated
	 */
	EClass getHistory2History2_History2History();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.History2History2_History2History#getAddElementActivity <em>Add Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Add Element Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.History2History2_History2History#getAddElementActivity()
	 * @see #getHistory2History2_History2History()
	 * @generated
	 */
	EReference getHistory2History2_History2History_AddElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.History2History2_History2History#getMoveElementActivity <em>Move Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Move Element Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.History2History2_History2History#getMoveElementActivity()
	 * @see #getHistory2History2_History2History()
	 * @generated
	 */
	EReference getHistory2History2_History2History_MoveElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.History2History2_History2History#getChangeAttributeActivity <em>Change Attribute Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Attribute Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.History2History2_History2History#getChangeAttributeActivity()
	 * @see #getHistory2History2_History2History()
	 * @generated
	 */
	EReference getHistory2History2_History2History_ChangeAttributeActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.History2History2_History2History#getTransformForwardActivity <em>Transform Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Forward Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.History2History2_History2History#getTransformForwardActivity()
	 * @see #getHistory2History2_History2History()
	 * @generated
	 */
	EReference getHistory2History2_History2History_TransformForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.History2History2_History2History#getTransformMappingActivity <em>Transform Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Mapping Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.History2History2_History2History#getTransformMappingActivity()
	 * @see #getHistory2History2_History2History()
	 * @generated
	 */
	EReference getHistory2History2_History2History_TransformMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.History2History2_History2History#getTransformBackwardActivity <em>Transform Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Backward Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.History2History2_History2History#getTransformBackwardActivity()
	 * @see #getHistory2History2_History2History()
	 * @generated
	 */
	EReference getHistory2History2_History2History_TransformBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.History2History2_History2History#getSynchronizeForwardActivity <em>Synchronize Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Forward Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.History2History2_History2History#getSynchronizeForwardActivity()
	 * @see #getHistory2History2_History2History()
	 * @generated
	 */
	EReference getHistory2History2_History2History_SynchronizeForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.History2History2_History2History#getSynchronizeBackwardActivity <em>Synchronize Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Backward Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.History2History2_History2History#getSynchronizeBackwardActivity()
	 * @see #getHistory2History2_History2History()
	 * @generated
	 */
	EReference getHistory2History2_History2History_SynchronizeBackwardActivity();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.History2History2_History2History#addElement(org.eclipse.emf.common.util.EMap, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Add Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.History2History2_History2History#addElement(org.eclipse.emf.common.util.EMap, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getHistory2History2_History2History__AddElement__EMap_EList_EList();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.History2History2_History2History#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap) <em>Change Attribute Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Attribute Values</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.History2History2_History2History#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getHistory2History2_History2History__ChangeAttributeValues__TGGNode_EMap();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.History2History2_History2History#transformForward(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, boolean) <em>Transform Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Forward</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.History2History2_History2History#transformForward(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, boolean)
	 * @generated
	 */
	EOperation getHistory2History2_History2History__TransformForward__EList_EList_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.History2History2_History2History#transformMapping(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, boolean) <em>Transform Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Mapping</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.History2History2_History2History#transformMapping(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, boolean)
	 * @generated
	 */
	EOperation getHistory2History2_History2History__TransformMapping__EList_EList_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.History2History2_History2History#transformBackward(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, boolean) <em>Transform Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Backward</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.History2History2_History2History#transformBackward(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, boolean)
	 * @generated
	 */
	EOperation getHistory2History2_History2History__TransformBackward__EList_EList_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.History2History2_History2History#synchronizeForward(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Forward</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.History2History2_History2History#synchronizeForward(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getHistory2History2_History2History__SynchronizeForward__EList_EList_TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.History2History2_History2History#synchronizeBackward(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Backward</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.History2History2_History2History#synchronizeBackward(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getHistory2History2_History2History__SynchronizeBackward__EList_EList_TGGNode_boolean();

	/**
	 * Returns the meta object for class '{@link de.mdelab.migmm.java2class_adapted.generated.java2classPkg_adapted_pkg_adapted <em>java2class Pkg adapted pkg adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>java2class Pkg adapted pkg adapted</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classPkg_adapted_pkg_adapted
	 * @generated
	 */
	EClass getjava2classPkg_adapted_pkg_adapted();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.java2classPkg_adapted_pkg_adapted#getAddElementActivity <em>Add Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Add Element Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classPkg_adapted_pkg_adapted#getAddElementActivity()
	 * @see #getjava2classPkg_adapted_pkg_adapted()
	 * @generated
	 */
	EReference getjava2classPkg_adapted_pkg_adapted_AddElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.java2classPkg_adapted_pkg_adapted#getMoveElementActivity <em>Move Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Move Element Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classPkg_adapted_pkg_adapted#getMoveElementActivity()
	 * @see #getjava2classPkg_adapted_pkg_adapted()
	 * @generated
	 */
	EReference getjava2classPkg_adapted_pkg_adapted_MoveElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.java2classPkg_adapted_pkg_adapted#getChangeAttributeActivity <em>Change Attribute Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Attribute Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classPkg_adapted_pkg_adapted#getChangeAttributeActivity()
	 * @see #getjava2classPkg_adapted_pkg_adapted()
	 * @generated
	 */
	EReference getjava2classPkg_adapted_pkg_adapted_ChangeAttributeActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.java2classPkg_adapted_pkg_adapted#getTransformForwardActivity <em>Transform Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Forward Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classPkg_adapted_pkg_adapted#getTransformForwardActivity()
	 * @see #getjava2classPkg_adapted_pkg_adapted()
	 * @generated
	 */
	EReference getjava2classPkg_adapted_pkg_adapted_TransformForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.java2classPkg_adapted_pkg_adapted#getTransformMappingActivity <em>Transform Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Mapping Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classPkg_adapted_pkg_adapted#getTransformMappingActivity()
	 * @see #getjava2classPkg_adapted_pkg_adapted()
	 * @generated
	 */
	EReference getjava2classPkg_adapted_pkg_adapted_TransformMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.java2classPkg_adapted_pkg_adapted#getTransformBackwardActivity <em>Transform Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Backward Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classPkg_adapted_pkg_adapted#getTransformBackwardActivity()
	 * @see #getjava2classPkg_adapted_pkg_adapted()
	 * @generated
	 */
	EReference getjava2classPkg_adapted_pkg_adapted_TransformBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.java2classPkg_adapted_pkg_adapted#getConflictCheckForwardActivity <em>Conflict Check Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Forward Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classPkg_adapted_pkg_adapted#getConflictCheckForwardActivity()
	 * @see #getjava2classPkg_adapted_pkg_adapted()
	 * @generated
	 */
	EReference getjava2classPkg_adapted_pkg_adapted_ConflictCheckForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.java2classPkg_adapted_pkg_adapted#getConflictCheckMappingActivity <em>Conflict Check Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Mapping Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classPkg_adapted_pkg_adapted#getConflictCheckMappingActivity()
	 * @see #getjava2classPkg_adapted_pkg_adapted()
	 * @generated
	 */
	EReference getjava2classPkg_adapted_pkg_adapted_ConflictCheckMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.java2classPkg_adapted_pkg_adapted#getConflictCheckBackwardActivity <em>Conflict Check Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Backward Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classPkg_adapted_pkg_adapted#getConflictCheckBackwardActivity()
	 * @see #getjava2classPkg_adapted_pkg_adapted()
	 * @generated
	 */
	EReference getjava2classPkg_adapted_pkg_adapted_ConflictCheckBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.java2classPkg_adapted_pkg_adapted#getSynchronizeForwardActivity <em>Synchronize Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Forward Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classPkg_adapted_pkg_adapted#getSynchronizeForwardActivity()
	 * @see #getjava2classPkg_adapted_pkg_adapted()
	 * @generated
	 */
	EReference getjava2classPkg_adapted_pkg_adapted_SynchronizeForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.java2classPkg_adapted_pkg_adapted#getSynchronizeBackwardActivity <em>Synchronize Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Backward Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classPkg_adapted_pkg_adapted#getSynchronizeBackwardActivity()
	 * @see #getjava2classPkg_adapted_pkg_adapted()
	 * @generated
	 */
	EReference getjava2classPkg_adapted_pkg_adapted_SynchronizeBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.java2classPkg_adapted_pkg_adapted#getRepairForwardActivity <em>Repair Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Forward Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classPkg_adapted_pkg_adapted#getRepairForwardActivity()
	 * @see #getjava2classPkg_adapted_pkg_adapted()
	 * @generated
	 */
	EReference getjava2classPkg_adapted_pkg_adapted_RepairForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.java2classPkg_adapted_pkg_adapted#getRepairBackwardActivity <em>Repair Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Backward Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classPkg_adapted_pkg_adapted#getRepairBackwardActivity()
	 * @see #getjava2classPkg_adapted_pkg_adapted()
	 * @generated
	 */
	EReference getjava2classPkg_adapted_pkg_adapted_RepairBackwardActivity();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.java2classPkg_adapted_pkg_adapted#addElement(org.eclipse.emf.common.util.EMap) <em>Add Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classPkg_adapted_pkg_adapted#addElement(org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getjava2classPkg_adapted_pkg_adapted__AddElement__EMap();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.java2classPkg_adapted_pkg_adapted#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap) <em>Change Attribute Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Attribute Values</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classPkg_adapted_pkg_adapted#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getjava2classPkg_adapted_pkg_adapted__ChangeAttributeValues__TGGNode_EMap();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.java2classPkg_adapted_pkg_adapted#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode) <em>Move Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move Element</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classPkg_adapted_pkg_adapted#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getjava2classPkg_adapted_pkg_adapted__MoveElement__TGGNode_TGGNode_TGGNode();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.java2classPkg_adapted_pkg_adapted#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Forward</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classPkg_adapted_pkg_adapted#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getjava2classPkg_adapted_pkg_adapted__TransformForward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.java2classPkg_adapted_pkg_adapted#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Mapping</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classPkg_adapted_pkg_adapted#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getjava2classPkg_adapted_pkg_adapted__TransformMapping__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.java2classPkg_adapted_pkg_adapted#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Backward</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classPkg_adapted_pkg_adapted#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getjava2classPkg_adapted_pkg_adapted__TransformBackward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.java2classPkg_adapted_pkg_adapted#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Forward</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classPkg_adapted_pkg_adapted#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getjava2classPkg_adapted_pkg_adapted__ConflictCheckForward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.java2classPkg_adapted_pkg_adapted#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Mapping</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classPkg_adapted_pkg_adapted#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getjava2classPkg_adapted_pkg_adapted__ConflictCheckMapping__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.java2classPkg_adapted_pkg_adapted#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Backward</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classPkg_adapted_pkg_adapted#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getjava2classPkg_adapted_pkg_adapted__ConflictCheckBackward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.java2classPkg_adapted_pkg_adapted#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Forward</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classPkg_adapted_pkg_adapted#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getjava2classPkg_adapted_pkg_adapted__SynchronizeForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.java2classPkg_adapted_pkg_adapted#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Backward</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classPkg_adapted_pkg_adapted#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getjava2classPkg_adapted_pkg_adapted__SynchronizeBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.java2classPkg_adapted_pkg_adapted#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Forward</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classPkg_adapted_pkg_adapted#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getjava2classPkg_adapted_pkg_adapted__RepairForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.java2classPkg_adapted_pkg_adapted#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Backward</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classPkg_adapted_pkg_adapted#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getjava2classPkg_adapted_pkg_adapted__RepairBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for class '{@link de.mdelab.migmm.java2class_adapted.generated.java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted <em>java2class Class Declaration2 Class adapted java2class Class Declaration2 Class adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>java2class Class Declaration2 Class adapted java2class Class Declaration2 Class adapted</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted
	 * @generated
	 */
	EClass getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted#getAddElementActivity <em>Add Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Add Element Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted#getAddElementActivity()
	 * @see #getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted()
	 * @generated
	 */
	EReference getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted_AddElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted#getMoveElementActivity <em>Move Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Move Element Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted#getMoveElementActivity()
	 * @see #getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted()
	 * @generated
	 */
	EReference getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted_MoveElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted#getChangeAttributeActivity <em>Change Attribute Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Attribute Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted#getChangeAttributeActivity()
	 * @see #getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted()
	 * @generated
	 */
	EReference getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted_ChangeAttributeActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted#getTransformForwardActivity <em>Transform Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Forward Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted#getTransformForwardActivity()
	 * @see #getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted()
	 * @generated
	 */
	EReference getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted_TransformForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted#getTransformMappingActivity <em>Transform Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Mapping Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted#getTransformMappingActivity()
	 * @see #getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted()
	 * @generated
	 */
	EReference getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted_TransformMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted#getTransformBackwardActivity <em>Transform Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Backward Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted#getTransformBackwardActivity()
	 * @see #getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted()
	 * @generated
	 */
	EReference getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted_TransformBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted#getConflictCheckForwardActivity <em>Conflict Check Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Forward Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted#getConflictCheckForwardActivity()
	 * @see #getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted()
	 * @generated
	 */
	EReference getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted_ConflictCheckForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted#getConflictCheckMappingActivity <em>Conflict Check Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Mapping Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted#getConflictCheckMappingActivity()
	 * @see #getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted()
	 * @generated
	 */
	EReference getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted_ConflictCheckMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted#getConflictCheckBackwardActivity <em>Conflict Check Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Backward Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted#getConflictCheckBackwardActivity()
	 * @see #getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted()
	 * @generated
	 */
	EReference getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted_ConflictCheckBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted#getSynchronizeForwardActivity <em>Synchronize Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Forward Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted#getSynchronizeForwardActivity()
	 * @see #getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted()
	 * @generated
	 */
	EReference getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted_SynchronizeForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted#getSynchronizeBackwardActivity <em>Synchronize Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Backward Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted#getSynchronizeBackwardActivity()
	 * @see #getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted()
	 * @generated
	 */
	EReference getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted_SynchronizeBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted#getRepairForwardActivity <em>Repair Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Forward Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted#getRepairForwardActivity()
	 * @see #getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted()
	 * @generated
	 */
	EReference getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted_RepairForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted#getRepairBackwardActivity <em>Repair Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Backward Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted#getRepairBackwardActivity()
	 * @see #getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted()
	 * @generated
	 */
	EReference getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted_RepairBackwardActivity();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted#addElement(org.eclipse.emf.common.util.EMap) <em>Add Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted#addElement(org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted__AddElement__EMap();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap) <em>Change Attribute Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Attribute Values</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted__ChangeAttributeValues__TGGNode_EMap();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode) <em>Move Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move Element</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted__MoveElement__TGGNode_TGGNode_TGGNode();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Forward</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted__TransformForward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Mapping</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted__TransformMapping__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Backward</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted__TransformBackward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Forward</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted__ConflictCheckForward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Mapping</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted__ConflictCheckMapping__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Backward</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted__ConflictCheckBackward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Forward</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted__SynchronizeForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Backward</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted__SynchronizeBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Forward</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted__RepairForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Backward</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted__RepairBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for class '{@link de.mdelab.migmm.java2class_adapted.generated.java2classField2Association_adapted_java2classField2Association_adapted <em>java2class Field2 Association adapted java2class Field2 Association adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>java2class Field2 Association adapted java2class Field2 Association adapted</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classField2Association_adapted_java2classField2Association_adapted
	 * @generated
	 */
	EClass getjava2classField2Association_adapted_java2classField2Association_adapted();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.java2classField2Association_adapted_java2classField2Association_adapted#getAddElementActivity <em>Add Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Add Element Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classField2Association_adapted_java2classField2Association_adapted#getAddElementActivity()
	 * @see #getjava2classField2Association_adapted_java2classField2Association_adapted()
	 * @generated
	 */
	EReference getjava2classField2Association_adapted_java2classField2Association_adapted_AddElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.java2classField2Association_adapted_java2classField2Association_adapted#getMoveElementActivity <em>Move Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Move Element Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classField2Association_adapted_java2classField2Association_adapted#getMoveElementActivity()
	 * @see #getjava2classField2Association_adapted_java2classField2Association_adapted()
	 * @generated
	 */
	EReference getjava2classField2Association_adapted_java2classField2Association_adapted_MoveElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.java2classField2Association_adapted_java2classField2Association_adapted#getChangeAttributeActivity <em>Change Attribute Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Attribute Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classField2Association_adapted_java2classField2Association_adapted#getChangeAttributeActivity()
	 * @see #getjava2classField2Association_adapted_java2classField2Association_adapted()
	 * @generated
	 */
	EReference getjava2classField2Association_adapted_java2classField2Association_adapted_ChangeAttributeActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.java2classField2Association_adapted_java2classField2Association_adapted#getTransformForwardActivity <em>Transform Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Forward Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classField2Association_adapted_java2classField2Association_adapted#getTransformForwardActivity()
	 * @see #getjava2classField2Association_adapted_java2classField2Association_adapted()
	 * @generated
	 */
	EReference getjava2classField2Association_adapted_java2classField2Association_adapted_TransformForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.java2classField2Association_adapted_java2classField2Association_adapted#getTransformMappingActivity <em>Transform Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Mapping Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classField2Association_adapted_java2classField2Association_adapted#getTransformMappingActivity()
	 * @see #getjava2classField2Association_adapted_java2classField2Association_adapted()
	 * @generated
	 */
	EReference getjava2classField2Association_adapted_java2classField2Association_adapted_TransformMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.java2classField2Association_adapted_java2classField2Association_adapted#getTransformBackwardActivity <em>Transform Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Backward Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classField2Association_adapted_java2classField2Association_adapted#getTransformBackwardActivity()
	 * @see #getjava2classField2Association_adapted_java2classField2Association_adapted()
	 * @generated
	 */
	EReference getjava2classField2Association_adapted_java2classField2Association_adapted_TransformBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.java2classField2Association_adapted_java2classField2Association_adapted#getConflictCheckForwardActivity <em>Conflict Check Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Forward Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classField2Association_adapted_java2classField2Association_adapted#getConflictCheckForwardActivity()
	 * @see #getjava2classField2Association_adapted_java2classField2Association_adapted()
	 * @generated
	 */
	EReference getjava2classField2Association_adapted_java2classField2Association_adapted_ConflictCheckForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.java2classField2Association_adapted_java2classField2Association_adapted#getConflictCheckMappingActivity <em>Conflict Check Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Mapping Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classField2Association_adapted_java2classField2Association_adapted#getConflictCheckMappingActivity()
	 * @see #getjava2classField2Association_adapted_java2classField2Association_adapted()
	 * @generated
	 */
	EReference getjava2classField2Association_adapted_java2classField2Association_adapted_ConflictCheckMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.java2classField2Association_adapted_java2classField2Association_adapted#getConflictCheckBackwardActivity <em>Conflict Check Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Backward Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classField2Association_adapted_java2classField2Association_adapted#getConflictCheckBackwardActivity()
	 * @see #getjava2classField2Association_adapted_java2classField2Association_adapted()
	 * @generated
	 */
	EReference getjava2classField2Association_adapted_java2classField2Association_adapted_ConflictCheckBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.java2classField2Association_adapted_java2classField2Association_adapted#getSynchronizeForwardActivity <em>Synchronize Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Forward Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classField2Association_adapted_java2classField2Association_adapted#getSynchronizeForwardActivity()
	 * @see #getjava2classField2Association_adapted_java2classField2Association_adapted()
	 * @generated
	 */
	EReference getjava2classField2Association_adapted_java2classField2Association_adapted_SynchronizeForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.java2classField2Association_adapted_java2classField2Association_adapted#getSynchronizeBackwardActivity <em>Synchronize Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Backward Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classField2Association_adapted_java2classField2Association_adapted#getSynchronizeBackwardActivity()
	 * @see #getjava2classField2Association_adapted_java2classField2Association_adapted()
	 * @generated
	 */
	EReference getjava2classField2Association_adapted_java2classField2Association_adapted_SynchronizeBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.java2classField2Association_adapted_java2classField2Association_adapted#getRepairForwardActivity <em>Repair Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Forward Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classField2Association_adapted_java2classField2Association_adapted#getRepairForwardActivity()
	 * @see #getjava2classField2Association_adapted_java2classField2Association_adapted()
	 * @generated
	 */
	EReference getjava2classField2Association_adapted_java2classField2Association_adapted_RepairForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.java2classField2Association_adapted_java2classField2Association_adapted#getRepairBackwardActivity <em>Repair Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Backward Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classField2Association_adapted_java2classField2Association_adapted#getRepairBackwardActivity()
	 * @see #getjava2classField2Association_adapted_java2classField2Association_adapted()
	 * @generated
	 */
	EReference getjava2classField2Association_adapted_java2classField2Association_adapted_RepairBackwardActivity();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.java2classField2Association_adapted_java2classField2Association_adapted#addElement(org.eclipse.emf.common.util.EMap) <em>Add Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classField2Association_adapted_java2classField2Association_adapted#addElement(org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getjava2classField2Association_adapted_java2classField2Association_adapted__AddElement__EMap();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.java2classField2Association_adapted_java2classField2Association_adapted#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap) <em>Change Attribute Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Attribute Values</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classField2Association_adapted_java2classField2Association_adapted#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getjava2classField2Association_adapted_java2classField2Association_adapted__ChangeAttributeValues__TGGNode_EMap();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.java2classField2Association_adapted_java2classField2Association_adapted#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode) <em>Move Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move Element</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classField2Association_adapted_java2classField2Association_adapted#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getjava2classField2Association_adapted_java2classField2Association_adapted__MoveElement__TGGNode_TGGNode_TGGNode();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.java2classField2Association_adapted_java2classField2Association_adapted#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Forward</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classField2Association_adapted_java2classField2Association_adapted#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getjava2classField2Association_adapted_java2classField2Association_adapted__TransformForward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.java2classField2Association_adapted_java2classField2Association_adapted#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Mapping</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classField2Association_adapted_java2classField2Association_adapted#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getjava2classField2Association_adapted_java2classField2Association_adapted__TransformMapping__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.java2classField2Association_adapted_java2classField2Association_adapted#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Backward</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classField2Association_adapted_java2classField2Association_adapted#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getjava2classField2Association_adapted_java2classField2Association_adapted__TransformBackward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.java2classField2Association_adapted_java2classField2Association_adapted#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Forward</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classField2Association_adapted_java2classField2Association_adapted#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getjava2classField2Association_adapted_java2classField2Association_adapted__ConflictCheckForward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.java2classField2Association_adapted_java2classField2Association_adapted#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Mapping</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classField2Association_adapted_java2classField2Association_adapted#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getjava2classField2Association_adapted_java2classField2Association_adapted__ConflictCheckMapping__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.java2classField2Association_adapted_java2classField2Association_adapted#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Backward</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classField2Association_adapted_java2classField2Association_adapted#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getjava2classField2Association_adapted_java2classField2Association_adapted__ConflictCheckBackward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.java2classField2Association_adapted_java2classField2Association_adapted#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Forward</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classField2Association_adapted_java2classField2Association_adapted#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getjava2classField2Association_adapted_java2classField2Association_adapted__SynchronizeForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.java2classField2Association_adapted_java2classField2Association_adapted#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Backward</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classField2Association_adapted_java2classField2Association_adapted#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getjava2classField2Association_adapted_java2classField2Association_adapted__SynchronizeBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.java2classField2Association_adapted_java2classField2Association_adapted#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Forward</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classField2Association_adapted_java2classField2Association_adapted#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getjava2classField2Association_adapted_java2classField2Association_adapted__RepairForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.java2classField2Association_adapted_java2classField2Association_adapted#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Backward</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classField2Association_adapted_java2classField2Association_adapted#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getjava2classField2Association_adapted_java2classField2Association_adapted__RepairBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for class '{@link de.mdelab.migmm.java2class_adapted.generated.java2classChildPkg_adapted_childPkg_adapted <em>java2class Child Pkg adapted child Pkg adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>java2class Child Pkg adapted child Pkg adapted</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classChildPkg_adapted_childPkg_adapted
	 * @generated
	 */
	EClass getjava2classChildPkg_adapted_childPkg_adapted();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.java2classChildPkg_adapted_childPkg_adapted#getAddElementActivity <em>Add Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Add Element Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classChildPkg_adapted_childPkg_adapted#getAddElementActivity()
	 * @see #getjava2classChildPkg_adapted_childPkg_adapted()
	 * @generated
	 */
	EReference getjava2classChildPkg_adapted_childPkg_adapted_AddElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.java2classChildPkg_adapted_childPkg_adapted#getMoveElementActivity <em>Move Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Move Element Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classChildPkg_adapted_childPkg_adapted#getMoveElementActivity()
	 * @see #getjava2classChildPkg_adapted_childPkg_adapted()
	 * @generated
	 */
	EReference getjava2classChildPkg_adapted_childPkg_adapted_MoveElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.java2classChildPkg_adapted_childPkg_adapted#getChangeAttributeActivity <em>Change Attribute Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Attribute Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classChildPkg_adapted_childPkg_adapted#getChangeAttributeActivity()
	 * @see #getjava2classChildPkg_adapted_childPkg_adapted()
	 * @generated
	 */
	EReference getjava2classChildPkg_adapted_childPkg_adapted_ChangeAttributeActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.java2classChildPkg_adapted_childPkg_adapted#getTransformForwardActivity <em>Transform Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Forward Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classChildPkg_adapted_childPkg_adapted#getTransformForwardActivity()
	 * @see #getjava2classChildPkg_adapted_childPkg_adapted()
	 * @generated
	 */
	EReference getjava2classChildPkg_adapted_childPkg_adapted_TransformForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.java2classChildPkg_adapted_childPkg_adapted#getTransformMappingActivity <em>Transform Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Mapping Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classChildPkg_adapted_childPkg_adapted#getTransformMappingActivity()
	 * @see #getjava2classChildPkg_adapted_childPkg_adapted()
	 * @generated
	 */
	EReference getjava2classChildPkg_adapted_childPkg_adapted_TransformMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.java2classChildPkg_adapted_childPkg_adapted#getTransformBackwardActivity <em>Transform Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Backward Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classChildPkg_adapted_childPkg_adapted#getTransformBackwardActivity()
	 * @see #getjava2classChildPkg_adapted_childPkg_adapted()
	 * @generated
	 */
	EReference getjava2classChildPkg_adapted_childPkg_adapted_TransformBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.java2classChildPkg_adapted_childPkg_adapted#getConflictCheckForwardActivity <em>Conflict Check Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Forward Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classChildPkg_adapted_childPkg_adapted#getConflictCheckForwardActivity()
	 * @see #getjava2classChildPkg_adapted_childPkg_adapted()
	 * @generated
	 */
	EReference getjava2classChildPkg_adapted_childPkg_adapted_ConflictCheckForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.java2classChildPkg_adapted_childPkg_adapted#getConflictCheckMappingActivity <em>Conflict Check Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Mapping Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classChildPkg_adapted_childPkg_adapted#getConflictCheckMappingActivity()
	 * @see #getjava2classChildPkg_adapted_childPkg_adapted()
	 * @generated
	 */
	EReference getjava2classChildPkg_adapted_childPkg_adapted_ConflictCheckMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.java2classChildPkg_adapted_childPkg_adapted#getConflictCheckBackwardActivity <em>Conflict Check Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Backward Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classChildPkg_adapted_childPkg_adapted#getConflictCheckBackwardActivity()
	 * @see #getjava2classChildPkg_adapted_childPkg_adapted()
	 * @generated
	 */
	EReference getjava2classChildPkg_adapted_childPkg_adapted_ConflictCheckBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.java2classChildPkg_adapted_childPkg_adapted#getSynchronizeForwardActivity <em>Synchronize Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Forward Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classChildPkg_adapted_childPkg_adapted#getSynchronizeForwardActivity()
	 * @see #getjava2classChildPkg_adapted_childPkg_adapted()
	 * @generated
	 */
	EReference getjava2classChildPkg_adapted_childPkg_adapted_SynchronizeForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.java2classChildPkg_adapted_childPkg_adapted#getSynchronizeBackwardActivity <em>Synchronize Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Backward Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classChildPkg_adapted_childPkg_adapted#getSynchronizeBackwardActivity()
	 * @see #getjava2classChildPkg_adapted_childPkg_adapted()
	 * @generated
	 */
	EReference getjava2classChildPkg_adapted_childPkg_adapted_SynchronizeBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.java2classChildPkg_adapted_childPkg_adapted#getRepairForwardActivity <em>Repair Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Forward Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classChildPkg_adapted_childPkg_adapted#getRepairForwardActivity()
	 * @see #getjava2classChildPkg_adapted_childPkg_adapted()
	 * @generated
	 */
	EReference getjava2classChildPkg_adapted_childPkg_adapted_RepairForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.java2classChildPkg_adapted_childPkg_adapted#getRepairBackwardActivity <em>Repair Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Backward Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classChildPkg_adapted_childPkg_adapted#getRepairBackwardActivity()
	 * @see #getjava2classChildPkg_adapted_childPkg_adapted()
	 * @generated
	 */
	EReference getjava2classChildPkg_adapted_childPkg_adapted_RepairBackwardActivity();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.java2classChildPkg_adapted_childPkg_adapted#addElement(org.eclipse.emf.common.util.EMap) <em>Add Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classChildPkg_adapted_childPkg_adapted#addElement(org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getjava2classChildPkg_adapted_childPkg_adapted__AddElement__EMap();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.java2classChildPkg_adapted_childPkg_adapted#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap) <em>Change Attribute Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Attribute Values</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classChildPkg_adapted_childPkg_adapted#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getjava2classChildPkg_adapted_childPkg_adapted__ChangeAttributeValues__TGGNode_EMap();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.java2classChildPkg_adapted_childPkg_adapted#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode) <em>Move Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move Element</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classChildPkg_adapted_childPkg_adapted#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getjava2classChildPkg_adapted_childPkg_adapted__MoveElement__TGGNode_TGGNode_TGGNode();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.java2classChildPkg_adapted_childPkg_adapted#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Forward</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classChildPkg_adapted_childPkg_adapted#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getjava2classChildPkg_adapted_childPkg_adapted__TransformForward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.java2classChildPkg_adapted_childPkg_adapted#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Mapping</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classChildPkg_adapted_childPkg_adapted#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getjava2classChildPkg_adapted_childPkg_adapted__TransformMapping__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.java2classChildPkg_adapted_childPkg_adapted#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Backward</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classChildPkg_adapted_childPkg_adapted#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getjava2classChildPkg_adapted_childPkg_adapted__TransformBackward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.java2classChildPkg_adapted_childPkg_adapted#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Forward</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classChildPkg_adapted_childPkg_adapted#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getjava2classChildPkg_adapted_childPkg_adapted__ConflictCheckForward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.java2classChildPkg_adapted_childPkg_adapted#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Mapping</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classChildPkg_adapted_childPkg_adapted#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getjava2classChildPkg_adapted_childPkg_adapted__ConflictCheckMapping__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.java2classChildPkg_adapted_childPkg_adapted#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Backward</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classChildPkg_adapted_childPkg_adapted#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getjava2classChildPkg_adapted_childPkg_adapted__ConflictCheckBackward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.java2classChildPkg_adapted_childPkg_adapted#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Forward</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classChildPkg_adapted_childPkg_adapted#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getjava2classChildPkg_adapted_childPkg_adapted__SynchronizeForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.java2classChildPkg_adapted_childPkg_adapted#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Backward</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classChildPkg_adapted_childPkg_adapted#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getjava2classChildPkg_adapted_childPkg_adapted__SynchronizeBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.java2classChildPkg_adapted_childPkg_adapted#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Forward</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classChildPkg_adapted_childPkg_adapted#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getjava2classChildPkg_adapted_childPkg_adapted__RepairForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.java2classChildPkg_adapted_childPkg_adapted#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Backward</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classChildPkg_adapted_childPkg_adapted#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getjava2classChildPkg_adapted_childPkg_adapted__RepairBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for class '{@link de.mdelab.migmm.java2class_adapted.generated.java2classAxiom_adapted_axiom_adapted <em>java2class Axiom adapted axiom adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>java2class Axiom adapted axiom adapted</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classAxiom_adapted_axiom_adapted
	 * @generated
	 */
	EClass getjava2classAxiom_adapted_axiom_adapted();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.java2classAxiom_adapted_axiom_adapted#getAddElementActivity <em>Add Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Add Element Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classAxiom_adapted_axiom_adapted#getAddElementActivity()
	 * @see #getjava2classAxiom_adapted_axiom_adapted()
	 * @generated
	 */
	EReference getjava2classAxiom_adapted_axiom_adapted_AddElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.java2classAxiom_adapted_axiom_adapted#getMoveElementActivity <em>Move Element Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Move Element Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classAxiom_adapted_axiom_adapted#getMoveElementActivity()
	 * @see #getjava2classAxiom_adapted_axiom_adapted()
	 * @generated
	 */
	EReference getjava2classAxiom_adapted_axiom_adapted_MoveElementActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.java2classAxiom_adapted_axiom_adapted#getChangeAttributeActivity <em>Change Attribute Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Attribute Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classAxiom_adapted_axiom_adapted#getChangeAttributeActivity()
	 * @see #getjava2classAxiom_adapted_axiom_adapted()
	 * @generated
	 */
	EReference getjava2classAxiom_adapted_axiom_adapted_ChangeAttributeActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.java2classAxiom_adapted_axiom_adapted#getTransformForwardActivity <em>Transform Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Forward Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classAxiom_adapted_axiom_adapted#getTransformForwardActivity()
	 * @see #getjava2classAxiom_adapted_axiom_adapted()
	 * @generated
	 */
	EReference getjava2classAxiom_adapted_axiom_adapted_TransformForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.java2classAxiom_adapted_axiom_adapted#getTransformMappingActivity <em>Transform Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Mapping Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classAxiom_adapted_axiom_adapted#getTransformMappingActivity()
	 * @see #getjava2classAxiom_adapted_axiom_adapted()
	 * @generated
	 */
	EReference getjava2classAxiom_adapted_axiom_adapted_TransformMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.java2classAxiom_adapted_axiom_adapted#getTransformBackwardActivity <em>Transform Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transform Backward Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classAxiom_adapted_axiom_adapted#getTransformBackwardActivity()
	 * @see #getjava2classAxiom_adapted_axiom_adapted()
	 * @generated
	 */
	EReference getjava2classAxiom_adapted_axiom_adapted_TransformBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.java2classAxiom_adapted_axiom_adapted#getConflictCheckForwardActivity <em>Conflict Check Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Forward Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classAxiom_adapted_axiom_adapted#getConflictCheckForwardActivity()
	 * @see #getjava2classAxiom_adapted_axiom_adapted()
	 * @generated
	 */
	EReference getjava2classAxiom_adapted_axiom_adapted_ConflictCheckForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.java2classAxiom_adapted_axiom_adapted#getConflictCheckMappingActivity <em>Conflict Check Mapping Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Mapping Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classAxiom_adapted_axiom_adapted#getConflictCheckMappingActivity()
	 * @see #getjava2classAxiom_adapted_axiom_adapted()
	 * @generated
	 */
	EReference getjava2classAxiom_adapted_axiom_adapted_ConflictCheckMappingActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.java2classAxiom_adapted_axiom_adapted#getConflictCheckBackwardActivity <em>Conflict Check Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Conflict Check Backward Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classAxiom_adapted_axiom_adapted#getConflictCheckBackwardActivity()
	 * @see #getjava2classAxiom_adapted_axiom_adapted()
	 * @generated
	 */
	EReference getjava2classAxiom_adapted_axiom_adapted_ConflictCheckBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.java2classAxiom_adapted_axiom_adapted#getSynchronizeForwardActivity <em>Synchronize Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Forward Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classAxiom_adapted_axiom_adapted#getSynchronizeForwardActivity()
	 * @see #getjava2classAxiom_adapted_axiom_adapted()
	 * @generated
	 */
	EReference getjava2classAxiom_adapted_axiom_adapted_SynchronizeForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.java2classAxiom_adapted_axiom_adapted#getSynchronizeBackwardActivity <em>Synchronize Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Synchronize Backward Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classAxiom_adapted_axiom_adapted#getSynchronizeBackwardActivity()
	 * @see #getjava2classAxiom_adapted_axiom_adapted()
	 * @generated
	 */
	EReference getjava2classAxiom_adapted_axiom_adapted_SynchronizeBackwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.java2classAxiom_adapted_axiom_adapted#getRepairForwardActivity <em>Repair Forward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Forward Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classAxiom_adapted_axiom_adapted#getRepairForwardActivity()
	 * @see #getjava2classAxiom_adapted_axiom_adapted()
	 * @generated
	 */
	EReference getjava2classAxiom_adapted_axiom_adapted_RepairForwardActivity();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.java2class_adapted.generated.java2classAxiom_adapted_axiom_adapted#getRepairBackwardActivity <em>Repair Backward Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repair Backward Activity</em>'.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classAxiom_adapted_axiom_adapted#getRepairBackwardActivity()
	 * @see #getjava2classAxiom_adapted_axiom_adapted()
	 * @generated
	 */
	EReference getjava2classAxiom_adapted_axiom_adapted_RepairBackwardActivity();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.java2classAxiom_adapted_axiom_adapted#addElement(org.eclipse.emf.common.util.EMap) <em>Add Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Element</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classAxiom_adapted_axiom_adapted#addElement(org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getjava2classAxiom_adapted_axiom_adapted__AddElement__EMap();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.java2classAxiom_adapted_axiom_adapted#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap) <em>Change Attribute Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Attribute Values</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classAxiom_adapted_axiom_adapted#changeAttributeValues(de.mdelab.mltgg.mote2.TGGNode, org.eclipse.emf.common.util.EMap)
	 * @generated
	 */
	EOperation getjava2classAxiom_adapted_axiom_adapted__ChangeAttributeValues__TGGNode_EMap();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.java2classAxiom_adapted_axiom_adapted#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode) <em>Move Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move Element</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classAxiom_adapted_axiom_adapted#moveElement(de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode, de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getjava2classAxiom_adapted_axiom_adapted__MoveElement__TGGNode_TGGNode_TGGNode();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.java2classAxiom_adapted_axiom_adapted#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Forward</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classAxiom_adapted_axiom_adapted#transformForward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getjava2classAxiom_adapted_axiom_adapted__TransformForward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.java2classAxiom_adapted_axiom_adapted#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Mapping</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classAxiom_adapted_axiom_adapted#transformMapping(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getjava2classAxiom_adapted_axiom_adapted__TransformMapping__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.java2classAxiom_adapted_axiom_adapted#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean) <em>Transform Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transform Backward</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classAxiom_adapted_axiom_adapted#transformBackward(de.mdelab.mltgg.mote2.TGGNode, boolean, boolean)
	 * @generated
	 */
	EOperation getjava2classAxiom_adapted_axiom_adapted__TransformBackward__TGGNode_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.java2classAxiom_adapted_axiom_adapted#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Forward</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classAxiom_adapted_axiom_adapted#conflictCheckForward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getjava2classAxiom_adapted_axiom_adapted__ConflictCheckForward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.java2classAxiom_adapted_axiom_adapted#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Mapping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Mapping</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classAxiom_adapted_axiom_adapted#conflictCheckMapping(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getjava2classAxiom_adapted_axiom_adapted__ConflictCheckMapping__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.java2classAxiom_adapted_axiom_adapted#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode) <em>Conflict Check Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conflict Check Backward</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classAxiom_adapted_axiom_adapted#conflictCheckBackward(de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getjava2classAxiom_adapted_axiom_adapted__ConflictCheckBackward__TGGNode();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.java2classAxiom_adapted_axiom_adapted#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Forward</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classAxiom_adapted_axiom_adapted#synchronizeForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getjava2classAxiom_adapted_axiom_adapted__SynchronizeForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.java2classAxiom_adapted_axiom_adapted#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Synchronize Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synchronize Backward</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classAxiom_adapted_axiom_adapted#synchronizeBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getjava2classAxiom_adapted_axiom_adapted__SynchronizeBackward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.java2classAxiom_adapted_axiom_adapted#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Forward</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classAxiom_adapted_axiom_adapted#repairForward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getjava2classAxiom_adapted_axiom_adapted__RepairForward__TGGNode_boolean();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.java2class_adapted.generated.java2classAxiom_adapted_axiom_adapted#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean) <em>Repair Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Repair Backward</em>' operation.
	 * @see de.mdelab.migmm.java2class_adapted.generated.java2classAxiom_adapted_axiom_adapted#repairBackward(de.mdelab.mltgg.mote2.TGGNode, boolean)
	 * @generated
	 */
	EOperation getjava2classAxiom_adapted_axiom_adapted__RepairBackward__TGGNode_boolean();

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
		 * The meta object literal for the '{@link de.mdelab.migmm.java2class_adapted.generated.impl.java2class_adaptedOperationalTGGImpl <em>java2class adapted Operational TGG</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.migmm.java2class_adapted.generated.impl.java2class_adaptedOperationalTGGImpl
		 * @see de.mdelab.migmm.java2class_adapted.generated.impl.GeneratedPackageImpl#getjava2class_adaptedOperationalTGG()
		 * @generated
		 */
		EClass JAVA2CLASS_ADAPTED_OPERATIONAL_TGG = eINSTANCE.getjava2class_adaptedOperationalTGG();

		/**
		 * The meta object literal for the '{@link de.mdelab.migmm.java2class_adapted.generated.impl.History2History2Impl <em>History2 History2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.migmm.java2class_adapted.generated.impl.History2History2Impl
		 * @see de.mdelab.migmm.java2class_adapted.generated.impl.GeneratedPackageImpl#getHistory2History2()
		 * @generated
		 */
		EClass HISTORY2_HISTORY2 = eINSTANCE.getHistory2History2();

		/**
		 * The meta object literal for the '{@link de.mdelab.migmm.java2class_adapted.generated.impl.java2classAxiom_adaptedImpl <em>java2class Axiom adapted</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.migmm.java2class_adapted.generated.impl.java2classAxiom_adaptedImpl
		 * @see de.mdelab.migmm.java2class_adapted.generated.impl.GeneratedPackageImpl#getjava2classAxiom_adapted()
		 * @generated
		 */
		EClass JAVA2CLASS_AXIOM_ADAPTED = eINSTANCE.getjava2classAxiom_adapted();

		/**
		 * The meta object literal for the '{@link de.mdelab.migmm.java2class_adapted.generated.impl.java2classPkg_adaptedImpl <em>java2class Pkg adapted</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.migmm.java2class_adapted.generated.impl.java2classPkg_adaptedImpl
		 * @see de.mdelab.migmm.java2class_adapted.generated.impl.GeneratedPackageImpl#getjava2classPkg_adapted()
		 * @generated
		 */
		EClass JAVA2CLASS_PKG_ADAPTED = eINSTANCE.getjava2classPkg_adapted();

		/**
		 * The meta object literal for the '{@link de.mdelab.migmm.java2class_adapted.generated.impl.java2classChildPkg_adaptedImpl <em>java2class Child Pkg adapted</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.migmm.java2class_adapted.generated.impl.java2classChildPkg_adaptedImpl
		 * @see de.mdelab.migmm.java2class_adapted.generated.impl.GeneratedPackageImpl#getjava2classChildPkg_adapted()
		 * @generated
		 */
		EClass JAVA2CLASS_CHILD_PKG_ADAPTED = eINSTANCE.getjava2classChildPkg_adapted();

		/**
		 * The meta object literal for the '{@link de.mdelab.migmm.java2class_adapted.generated.impl.java2classClassDeclaration2Class_adaptedImpl <em>java2class Class Declaration2 Class adapted</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.migmm.java2class_adapted.generated.impl.java2classClassDeclaration2Class_adaptedImpl
		 * @see de.mdelab.migmm.java2class_adapted.generated.impl.GeneratedPackageImpl#getjava2classClassDeclaration2Class_adapted()
		 * @generated
		 */
		EClass JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED = eINSTANCE.getjava2classClassDeclaration2Class_adapted();

		/**
		 * The meta object literal for the '{@link de.mdelab.migmm.java2class_adapted.generated.impl.java2classField2Association_adaptedImpl <em>java2class Field2 Association adapted</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.migmm.java2class_adapted.generated.impl.java2classField2Association_adaptedImpl
		 * @see de.mdelab.migmm.java2class_adapted.generated.impl.GeneratedPackageImpl#getjava2classField2Association_adapted()
		 * @generated
		 */
		EClass JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED = eINSTANCE.getjava2classField2Association_adapted();

		/**
		 * The meta object literal for the '{@link de.mdelab.migmm.java2class_adapted.generated.impl.History2History2_History2HistoryImpl <em>History2 History2 History2 History</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.migmm.java2class_adapted.generated.impl.History2History2_History2HistoryImpl
		 * @see de.mdelab.migmm.java2class_adapted.generated.impl.GeneratedPackageImpl#getHistory2History2_History2History()
		 * @generated
		 */
		EClass HISTORY2_HISTORY2_HISTORY2_HISTORY = eINSTANCE.getHistory2History2_History2History();

		/**
		 * The meta object literal for the '<em><b>Add Element Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HISTORY2_HISTORY2_HISTORY2_HISTORY__ADD_ELEMENT_ACTIVITY = eINSTANCE
				.getHistory2History2_History2History_AddElementActivity();

		/**
		 * The meta object literal for the '<em><b>Move Element Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HISTORY2_HISTORY2_HISTORY2_HISTORY__MOVE_ELEMENT_ACTIVITY = eINSTANCE
				.getHistory2History2_History2History_MoveElementActivity();

		/**
		 * The meta object literal for the '<em><b>Change Attribute Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HISTORY2_HISTORY2_HISTORY2_HISTORY__CHANGE_ATTRIBUTE_ACTIVITY = eINSTANCE
				.getHistory2History2_History2History_ChangeAttributeActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HISTORY2_HISTORY2_HISTORY2_HISTORY__TRANSFORM_FORWARD_ACTIVITY = eINSTANCE
				.getHistory2History2_History2History_TransformForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Mapping Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HISTORY2_HISTORY2_HISTORY2_HISTORY__TRANSFORM_MAPPING_ACTIVITY = eINSTANCE
				.getHistory2History2_History2History_TransformMappingActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HISTORY2_HISTORY2_HISTORY2_HISTORY__TRANSFORM_BACKWARD_ACTIVITY = eINSTANCE
				.getHistory2History2_History2History_TransformBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Synchronize Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HISTORY2_HISTORY2_HISTORY2_HISTORY__SYNCHRONIZE_FORWARD_ACTIVITY = eINSTANCE
				.getHistory2History2_History2History_SynchronizeForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Synchronize Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HISTORY2_HISTORY2_HISTORY2_HISTORY__SYNCHRONIZE_BACKWARD_ACTIVITY = eINSTANCE
				.getHistory2History2_History2History_SynchronizeBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Add Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HISTORY2_HISTORY2_HISTORY2_HISTORY___ADD_ELEMENT__EMAP_ELIST_ELIST = eINSTANCE
				.getHistory2History2_History2History__AddElement__EMap_EList_EList();

		/**
		 * The meta object literal for the '<em><b>Change Attribute Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HISTORY2_HISTORY2_HISTORY2_HISTORY___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = eINSTANCE
				.getHistory2History2_History2History__ChangeAttributeValues__TGGNode_EMap();

		/**
		 * The meta object literal for the '<em><b>Transform Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HISTORY2_HISTORY2_HISTORY2_HISTORY___TRANSFORM_FORWARD__ELIST_ELIST_BOOLEAN = eINSTANCE
				.getHistory2History2_History2History__TransformForward__EList_EList_boolean();

		/**
		 * The meta object literal for the '<em><b>Transform Mapping</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HISTORY2_HISTORY2_HISTORY2_HISTORY___TRANSFORM_MAPPING__ELIST_ELIST_BOOLEAN = eINSTANCE
				.getHistory2History2_History2History__TransformMapping__EList_EList_boolean();

		/**
		 * The meta object literal for the '<em><b>Transform Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HISTORY2_HISTORY2_HISTORY2_HISTORY___TRANSFORM_BACKWARD__ELIST_ELIST_BOOLEAN = eINSTANCE
				.getHistory2History2_History2History__TransformBackward__EList_EList_boolean();

		/**
		 * The meta object literal for the '<em><b>Synchronize Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HISTORY2_HISTORY2_HISTORY2_HISTORY___SYNCHRONIZE_FORWARD__ELIST_ELIST_TGGNODE_BOOLEAN = eINSTANCE
				.getHistory2History2_History2History__SynchronizeForward__EList_EList_TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Synchronize Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HISTORY2_HISTORY2_HISTORY2_HISTORY___SYNCHRONIZE_BACKWARD__ELIST_ELIST_TGGNODE_BOOLEAN = eINSTANCE
				.getHistory2History2_History2History__SynchronizeBackward__EList_EList_TGGNode_boolean();

		/**
		 * The meta object literal for the '{@link de.mdelab.migmm.java2class_adapted.generated.impl.java2classPkg_adapted_pkg_adaptedImpl <em>java2class Pkg adapted pkg adapted</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.migmm.java2class_adapted.generated.impl.java2classPkg_adapted_pkg_adaptedImpl
		 * @see de.mdelab.migmm.java2class_adapted.generated.impl.GeneratedPackageImpl#getjava2classPkg_adapted_pkg_adapted()
		 * @generated
		 */
		EClass JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED = eINSTANCE.getjava2classPkg_adapted_pkg_adapted();

		/**
		 * The meta object literal for the '<em><b>Add Element Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED__ADD_ELEMENT_ACTIVITY = eINSTANCE
				.getjava2classPkg_adapted_pkg_adapted_AddElementActivity();

		/**
		 * The meta object literal for the '<em><b>Move Element Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED__MOVE_ELEMENT_ACTIVITY = eINSTANCE
				.getjava2classPkg_adapted_pkg_adapted_MoveElementActivity();

		/**
		 * The meta object literal for the '<em><b>Change Attribute Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED__CHANGE_ATTRIBUTE_ACTIVITY = eINSTANCE
				.getjava2classPkg_adapted_pkg_adapted_ChangeAttributeActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED__TRANSFORM_FORWARD_ACTIVITY = eINSTANCE
				.getjava2classPkg_adapted_pkg_adapted_TransformForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Mapping Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED__TRANSFORM_MAPPING_ACTIVITY = eINSTANCE
				.getjava2classPkg_adapted_pkg_adapted_TransformMappingActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED__TRANSFORM_BACKWARD_ACTIVITY = eINSTANCE
				.getjava2classPkg_adapted_pkg_adapted_TransformBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED__CONFLICT_CHECK_FORWARD_ACTIVITY = eINSTANCE
				.getjava2classPkg_adapted_pkg_adapted_ConflictCheckForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Mapping Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED__CONFLICT_CHECK_MAPPING_ACTIVITY = eINSTANCE
				.getjava2classPkg_adapted_pkg_adapted_ConflictCheckMappingActivity();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED__CONFLICT_CHECK_BACKWARD_ACTIVITY = eINSTANCE
				.getjava2classPkg_adapted_pkg_adapted_ConflictCheckBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Synchronize Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED__SYNCHRONIZE_FORWARD_ACTIVITY = eINSTANCE
				.getjava2classPkg_adapted_pkg_adapted_SynchronizeForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Synchronize Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED__SYNCHRONIZE_BACKWARD_ACTIVITY = eINSTANCE
				.getjava2classPkg_adapted_pkg_adapted_SynchronizeBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Repair Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED__REPAIR_FORWARD_ACTIVITY = eINSTANCE
				.getjava2classPkg_adapted_pkg_adapted_RepairForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Repair Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED__REPAIR_BACKWARD_ACTIVITY = eINSTANCE
				.getjava2classPkg_adapted_pkg_adapted_RepairBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Add Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED___ADD_ELEMENT__EMAP = eINSTANCE
				.getjava2classPkg_adapted_pkg_adapted__AddElement__EMap();

		/**
		 * The meta object literal for the '<em><b>Change Attribute Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = eINSTANCE
				.getjava2classPkg_adapted_pkg_adapted__ChangeAttributeValues__TGGNode_EMap();

		/**
		 * The meta object literal for the '<em><b>Move Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = eINSTANCE
				.getjava2classPkg_adapted_pkg_adapted__MoveElement__TGGNode_TGGNode_TGGNode();

		/**
		 * The meta object literal for the '<em><b>Transform Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = eINSTANCE
				.getjava2classPkg_adapted_pkg_adapted__TransformForward__TGGNode_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Transform Mapping</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = eINSTANCE
				.getjava2classPkg_adapted_pkg_adapted__TransformMapping__TGGNode_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Transform Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = eINSTANCE
				.getjava2classPkg_adapted_pkg_adapted__TransformBackward__TGGNode_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED___CONFLICT_CHECK_FORWARD__TGGNODE = eINSTANCE
				.getjava2classPkg_adapted_pkg_adapted__ConflictCheckForward__TGGNode();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Mapping</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED___CONFLICT_CHECK_MAPPING__TGGNODE = eINSTANCE
				.getjava2classPkg_adapted_pkg_adapted__ConflictCheckMapping__TGGNode();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED___CONFLICT_CHECK_BACKWARD__TGGNODE = eINSTANCE
				.getjava2classPkg_adapted_pkg_adapted__ConflictCheckBackward__TGGNode();

		/**
		 * The meta object literal for the '<em><b>Synchronize Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getjava2classPkg_adapted_pkg_adapted__SynchronizeForward__TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Synchronize Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getjava2classPkg_adapted_pkg_adapted__SynchronizeBackward__TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Repair Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED___REPAIR_FORWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getjava2classPkg_adapted_pkg_adapted__RepairForward__TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Repair Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED___REPAIR_BACKWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getjava2classPkg_adapted_pkg_adapted__RepairBackward__TGGNode_boolean();

		/**
		 * The meta object literal for the '{@link de.mdelab.migmm.java2class_adapted.generated.impl.java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adaptedImpl <em>java2class Class Declaration2 Class adapted java2class Class Declaration2 Class adapted</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.migmm.java2class_adapted.generated.impl.java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adaptedImpl
		 * @see de.mdelab.migmm.java2class_adapted.generated.impl.GeneratedPackageImpl#getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted()
		 * @generated
		 */
		EClass JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED = eINSTANCE
				.getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted();

		/**
		 * The meta object literal for the '<em><b>Add Element Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED__ADD_ELEMENT_ACTIVITY = eINSTANCE
				.getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted_AddElementActivity();

		/**
		 * The meta object literal for the '<em><b>Move Element Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED__MOVE_ELEMENT_ACTIVITY = eINSTANCE
				.getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted_MoveElementActivity();

		/**
		 * The meta object literal for the '<em><b>Change Attribute Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED__CHANGE_ATTRIBUTE_ACTIVITY = eINSTANCE
				.getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted_ChangeAttributeActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED__TRANSFORM_FORWARD_ACTIVITY = eINSTANCE
				.getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted_TransformForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Mapping Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED__TRANSFORM_MAPPING_ACTIVITY = eINSTANCE
				.getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted_TransformMappingActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED__TRANSFORM_BACKWARD_ACTIVITY = eINSTANCE
				.getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted_TransformBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED__CONFLICT_CHECK_FORWARD_ACTIVITY = eINSTANCE
				.getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted_ConflictCheckForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Mapping Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED__CONFLICT_CHECK_MAPPING_ACTIVITY = eINSTANCE
				.getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted_ConflictCheckMappingActivity();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED__CONFLICT_CHECK_BACKWARD_ACTIVITY = eINSTANCE
				.getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted_ConflictCheckBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Synchronize Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED__SYNCHRONIZE_FORWARD_ACTIVITY = eINSTANCE
				.getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted_SynchronizeForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Synchronize Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED__SYNCHRONIZE_BACKWARD_ACTIVITY = eINSTANCE
				.getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted_SynchronizeBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Repair Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED__REPAIR_FORWARD_ACTIVITY = eINSTANCE
				.getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted_RepairForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Repair Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED__REPAIR_BACKWARD_ACTIVITY = eINSTANCE
				.getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted_RepairBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Add Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED___ADD_ELEMENT__EMAP = eINSTANCE
				.getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted__AddElement__EMap();

		/**
		 * The meta object literal for the '<em><b>Change Attribute Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = eINSTANCE
				.getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted__ChangeAttributeValues__TGGNode_EMap();

		/**
		 * The meta object literal for the '<em><b>Move Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = eINSTANCE
				.getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted__MoveElement__TGGNode_TGGNode_TGGNode();

		/**
		 * The meta object literal for the '<em><b>Transform Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = eINSTANCE
				.getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted__TransformForward__TGGNode_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Transform Mapping</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = eINSTANCE
				.getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted__TransformMapping__TGGNode_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Transform Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = eINSTANCE
				.getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted__TransformBackward__TGGNode_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED___CONFLICT_CHECK_FORWARD__TGGNODE = eINSTANCE
				.getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted__ConflictCheckForward__TGGNode();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Mapping</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED___CONFLICT_CHECK_MAPPING__TGGNODE = eINSTANCE
				.getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted__ConflictCheckMapping__TGGNode();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED___CONFLICT_CHECK_BACKWARD__TGGNODE = eINSTANCE
				.getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted__ConflictCheckBackward__TGGNode();

		/**
		 * The meta object literal for the '<em><b>Synchronize Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted__SynchronizeForward__TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Synchronize Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted__SynchronizeBackward__TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Repair Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED___REPAIR_FORWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted__RepairForward__TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Repair Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED___REPAIR_BACKWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted__RepairBackward__TGGNode_boolean();

		/**
		 * The meta object literal for the '{@link de.mdelab.migmm.java2class_adapted.generated.impl.java2classField2Association_adapted_java2classField2Association_adaptedImpl <em>java2class Field2 Association adapted java2class Field2 Association adapted</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.migmm.java2class_adapted.generated.impl.java2classField2Association_adapted_java2classField2Association_adaptedImpl
		 * @see de.mdelab.migmm.java2class_adapted.generated.impl.GeneratedPackageImpl#getjava2classField2Association_adapted_java2classField2Association_adapted()
		 * @generated
		 */
		EClass JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED = eINSTANCE
				.getjava2classField2Association_adapted_java2classField2Association_adapted();

		/**
		 * The meta object literal for the '<em><b>Add Element Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__ADD_ELEMENT_ACTIVITY = eINSTANCE
				.getjava2classField2Association_adapted_java2classField2Association_adapted_AddElementActivity();

		/**
		 * The meta object literal for the '<em><b>Move Element Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__MOVE_ELEMENT_ACTIVITY = eINSTANCE
				.getjava2classField2Association_adapted_java2classField2Association_adapted_MoveElementActivity();

		/**
		 * The meta object literal for the '<em><b>Change Attribute Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__CHANGE_ATTRIBUTE_ACTIVITY = eINSTANCE
				.getjava2classField2Association_adapted_java2classField2Association_adapted_ChangeAttributeActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__TRANSFORM_FORWARD_ACTIVITY = eINSTANCE
				.getjava2classField2Association_adapted_java2classField2Association_adapted_TransformForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Mapping Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__TRANSFORM_MAPPING_ACTIVITY = eINSTANCE
				.getjava2classField2Association_adapted_java2classField2Association_adapted_TransformMappingActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__TRANSFORM_BACKWARD_ACTIVITY = eINSTANCE
				.getjava2classField2Association_adapted_java2classField2Association_adapted_TransformBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__CONFLICT_CHECK_FORWARD_ACTIVITY = eINSTANCE
				.getjava2classField2Association_adapted_java2classField2Association_adapted_ConflictCheckForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Mapping Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__CONFLICT_CHECK_MAPPING_ACTIVITY = eINSTANCE
				.getjava2classField2Association_adapted_java2classField2Association_adapted_ConflictCheckMappingActivity();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__CONFLICT_CHECK_BACKWARD_ACTIVITY = eINSTANCE
				.getjava2classField2Association_adapted_java2classField2Association_adapted_ConflictCheckBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Synchronize Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__SYNCHRONIZE_FORWARD_ACTIVITY = eINSTANCE
				.getjava2classField2Association_adapted_java2classField2Association_adapted_SynchronizeForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Synchronize Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__SYNCHRONIZE_BACKWARD_ACTIVITY = eINSTANCE
				.getjava2classField2Association_adapted_java2classField2Association_adapted_SynchronizeBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Repair Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__REPAIR_FORWARD_ACTIVITY = eINSTANCE
				.getjava2classField2Association_adapted_java2classField2Association_adapted_RepairForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Repair Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__REPAIR_BACKWARD_ACTIVITY = eINSTANCE
				.getjava2classField2Association_adapted_java2classField2Association_adapted_RepairBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Add Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED___ADD_ELEMENT__EMAP = eINSTANCE
				.getjava2classField2Association_adapted_java2classField2Association_adapted__AddElement__EMap();

		/**
		 * The meta object literal for the '<em><b>Change Attribute Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = eINSTANCE
				.getjava2classField2Association_adapted_java2classField2Association_adapted__ChangeAttributeValues__TGGNode_EMap();

		/**
		 * The meta object literal for the '<em><b>Move Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = eINSTANCE
				.getjava2classField2Association_adapted_java2classField2Association_adapted__MoveElement__TGGNode_TGGNode_TGGNode();

		/**
		 * The meta object literal for the '<em><b>Transform Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = eINSTANCE
				.getjava2classField2Association_adapted_java2classField2Association_adapted__TransformForward__TGGNode_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Transform Mapping</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = eINSTANCE
				.getjava2classField2Association_adapted_java2classField2Association_adapted__TransformMapping__TGGNode_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Transform Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = eINSTANCE
				.getjava2classField2Association_adapted_java2classField2Association_adapted__TransformBackward__TGGNode_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED___CONFLICT_CHECK_FORWARD__TGGNODE = eINSTANCE
				.getjava2classField2Association_adapted_java2classField2Association_adapted__ConflictCheckForward__TGGNode();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Mapping</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED___CONFLICT_CHECK_MAPPING__TGGNODE = eINSTANCE
				.getjava2classField2Association_adapted_java2classField2Association_adapted__ConflictCheckMapping__TGGNode();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED___CONFLICT_CHECK_BACKWARD__TGGNODE = eINSTANCE
				.getjava2classField2Association_adapted_java2classField2Association_adapted__ConflictCheckBackward__TGGNode();

		/**
		 * The meta object literal for the '<em><b>Synchronize Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getjava2classField2Association_adapted_java2classField2Association_adapted__SynchronizeForward__TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Synchronize Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getjava2classField2Association_adapted_java2classField2Association_adapted__SynchronizeBackward__TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Repair Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED___REPAIR_FORWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getjava2classField2Association_adapted_java2classField2Association_adapted__RepairForward__TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Repair Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED___REPAIR_BACKWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getjava2classField2Association_adapted_java2classField2Association_adapted__RepairBackward__TGGNode_boolean();

		/**
		 * The meta object literal for the '{@link de.mdelab.migmm.java2class_adapted.generated.impl.java2classChildPkg_adapted_childPkg_adaptedImpl <em>java2class Child Pkg adapted child Pkg adapted</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.migmm.java2class_adapted.generated.impl.java2classChildPkg_adapted_childPkg_adaptedImpl
		 * @see de.mdelab.migmm.java2class_adapted.generated.impl.GeneratedPackageImpl#getjava2classChildPkg_adapted_childPkg_adapted()
		 * @generated
		 */
		EClass JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED = eINSTANCE
				.getjava2classChildPkg_adapted_childPkg_adapted();

		/**
		 * The meta object literal for the '<em><b>Add Element Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED__ADD_ELEMENT_ACTIVITY = eINSTANCE
				.getjava2classChildPkg_adapted_childPkg_adapted_AddElementActivity();

		/**
		 * The meta object literal for the '<em><b>Move Element Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED__MOVE_ELEMENT_ACTIVITY = eINSTANCE
				.getjava2classChildPkg_adapted_childPkg_adapted_MoveElementActivity();

		/**
		 * The meta object literal for the '<em><b>Change Attribute Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED__CHANGE_ATTRIBUTE_ACTIVITY = eINSTANCE
				.getjava2classChildPkg_adapted_childPkg_adapted_ChangeAttributeActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED__TRANSFORM_FORWARD_ACTIVITY = eINSTANCE
				.getjava2classChildPkg_adapted_childPkg_adapted_TransformForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Mapping Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED__TRANSFORM_MAPPING_ACTIVITY = eINSTANCE
				.getjava2classChildPkg_adapted_childPkg_adapted_TransformMappingActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED__TRANSFORM_BACKWARD_ACTIVITY = eINSTANCE
				.getjava2classChildPkg_adapted_childPkg_adapted_TransformBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED__CONFLICT_CHECK_FORWARD_ACTIVITY = eINSTANCE
				.getjava2classChildPkg_adapted_childPkg_adapted_ConflictCheckForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Mapping Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED__CONFLICT_CHECK_MAPPING_ACTIVITY = eINSTANCE
				.getjava2classChildPkg_adapted_childPkg_adapted_ConflictCheckMappingActivity();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED__CONFLICT_CHECK_BACKWARD_ACTIVITY = eINSTANCE
				.getjava2classChildPkg_adapted_childPkg_adapted_ConflictCheckBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Synchronize Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED__SYNCHRONIZE_FORWARD_ACTIVITY = eINSTANCE
				.getjava2classChildPkg_adapted_childPkg_adapted_SynchronizeForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Synchronize Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED__SYNCHRONIZE_BACKWARD_ACTIVITY = eINSTANCE
				.getjava2classChildPkg_adapted_childPkg_adapted_SynchronizeBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Repair Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED__REPAIR_FORWARD_ACTIVITY = eINSTANCE
				.getjava2classChildPkg_adapted_childPkg_adapted_RepairForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Repair Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED__REPAIR_BACKWARD_ACTIVITY = eINSTANCE
				.getjava2classChildPkg_adapted_childPkg_adapted_RepairBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Add Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED___ADD_ELEMENT__EMAP = eINSTANCE
				.getjava2classChildPkg_adapted_childPkg_adapted__AddElement__EMap();

		/**
		 * The meta object literal for the '<em><b>Change Attribute Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = eINSTANCE
				.getjava2classChildPkg_adapted_childPkg_adapted__ChangeAttributeValues__TGGNode_EMap();

		/**
		 * The meta object literal for the '<em><b>Move Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = eINSTANCE
				.getjava2classChildPkg_adapted_childPkg_adapted__MoveElement__TGGNode_TGGNode_TGGNode();

		/**
		 * The meta object literal for the '<em><b>Transform Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = eINSTANCE
				.getjava2classChildPkg_adapted_childPkg_adapted__TransformForward__TGGNode_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Transform Mapping</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = eINSTANCE
				.getjava2classChildPkg_adapted_childPkg_adapted__TransformMapping__TGGNode_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Transform Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = eINSTANCE
				.getjava2classChildPkg_adapted_childPkg_adapted__TransformBackward__TGGNode_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED___CONFLICT_CHECK_FORWARD__TGGNODE = eINSTANCE
				.getjava2classChildPkg_adapted_childPkg_adapted__ConflictCheckForward__TGGNode();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Mapping</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED___CONFLICT_CHECK_MAPPING__TGGNODE = eINSTANCE
				.getjava2classChildPkg_adapted_childPkg_adapted__ConflictCheckMapping__TGGNode();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED___CONFLICT_CHECK_BACKWARD__TGGNODE = eINSTANCE
				.getjava2classChildPkg_adapted_childPkg_adapted__ConflictCheckBackward__TGGNode();

		/**
		 * The meta object literal for the '<em><b>Synchronize Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getjava2classChildPkg_adapted_childPkg_adapted__SynchronizeForward__TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Synchronize Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getjava2classChildPkg_adapted_childPkg_adapted__SynchronizeBackward__TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Repair Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED___REPAIR_FORWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getjava2classChildPkg_adapted_childPkg_adapted__RepairForward__TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Repair Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED___REPAIR_BACKWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getjava2classChildPkg_adapted_childPkg_adapted__RepairBackward__TGGNode_boolean();

		/**
		 * The meta object literal for the '{@link de.mdelab.migmm.java2class_adapted.generated.impl.java2classAxiom_adapted_axiom_adaptedImpl <em>java2class Axiom adapted axiom adapted</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.migmm.java2class_adapted.generated.impl.java2classAxiom_adapted_axiom_adaptedImpl
		 * @see de.mdelab.migmm.java2class_adapted.generated.impl.GeneratedPackageImpl#getjava2classAxiom_adapted_axiom_adapted()
		 * @generated
		 */
		EClass JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED = eINSTANCE.getjava2classAxiom_adapted_axiom_adapted();

		/**
		 * The meta object literal for the '<em><b>Add Element Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED__ADD_ELEMENT_ACTIVITY = eINSTANCE
				.getjava2classAxiom_adapted_axiom_adapted_AddElementActivity();

		/**
		 * The meta object literal for the '<em><b>Move Element Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED__MOVE_ELEMENT_ACTIVITY = eINSTANCE
				.getjava2classAxiom_adapted_axiom_adapted_MoveElementActivity();

		/**
		 * The meta object literal for the '<em><b>Change Attribute Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED__CHANGE_ATTRIBUTE_ACTIVITY = eINSTANCE
				.getjava2classAxiom_adapted_axiom_adapted_ChangeAttributeActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED__TRANSFORM_FORWARD_ACTIVITY = eINSTANCE
				.getjava2classAxiom_adapted_axiom_adapted_TransformForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Mapping Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED__TRANSFORM_MAPPING_ACTIVITY = eINSTANCE
				.getjava2classAxiom_adapted_axiom_adapted_TransformMappingActivity();

		/**
		 * The meta object literal for the '<em><b>Transform Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED__TRANSFORM_BACKWARD_ACTIVITY = eINSTANCE
				.getjava2classAxiom_adapted_axiom_adapted_TransformBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED__CONFLICT_CHECK_FORWARD_ACTIVITY = eINSTANCE
				.getjava2classAxiom_adapted_axiom_adapted_ConflictCheckForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Mapping Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED__CONFLICT_CHECK_MAPPING_ACTIVITY = eINSTANCE
				.getjava2classAxiom_adapted_axiom_adapted_ConflictCheckMappingActivity();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED__CONFLICT_CHECK_BACKWARD_ACTIVITY = eINSTANCE
				.getjava2classAxiom_adapted_axiom_adapted_ConflictCheckBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Synchronize Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED__SYNCHRONIZE_FORWARD_ACTIVITY = eINSTANCE
				.getjava2classAxiom_adapted_axiom_adapted_SynchronizeForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Synchronize Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED__SYNCHRONIZE_BACKWARD_ACTIVITY = eINSTANCE
				.getjava2classAxiom_adapted_axiom_adapted_SynchronizeBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Repair Forward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED__REPAIR_FORWARD_ACTIVITY = eINSTANCE
				.getjava2classAxiom_adapted_axiom_adapted_RepairForwardActivity();

		/**
		 * The meta object literal for the '<em><b>Repair Backward Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED__REPAIR_BACKWARD_ACTIVITY = eINSTANCE
				.getjava2classAxiom_adapted_axiom_adapted_RepairBackwardActivity();

		/**
		 * The meta object literal for the '<em><b>Add Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED___ADD_ELEMENT__EMAP = eINSTANCE
				.getjava2classAxiom_adapted_axiom_adapted__AddElement__EMap();

		/**
		 * The meta object literal for the '<em><b>Change Attribute Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP = eINSTANCE
				.getjava2classAxiom_adapted_axiom_adapted__ChangeAttributeValues__TGGNode_EMap();

		/**
		 * The meta object literal for the '<em><b>Move Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE = eINSTANCE
				.getjava2classAxiom_adapted_axiom_adapted__MoveElement__TGGNode_TGGNode_TGGNode();

		/**
		 * The meta object literal for the '<em><b>Transform Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN = eINSTANCE
				.getjava2classAxiom_adapted_axiom_adapted__TransformForward__TGGNode_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Transform Mapping</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN = eINSTANCE
				.getjava2classAxiom_adapted_axiom_adapted__TransformMapping__TGGNode_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Transform Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN = eINSTANCE
				.getjava2classAxiom_adapted_axiom_adapted__TransformBackward__TGGNode_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED___CONFLICT_CHECK_FORWARD__TGGNODE = eINSTANCE
				.getjava2classAxiom_adapted_axiom_adapted__ConflictCheckForward__TGGNode();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Mapping</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED___CONFLICT_CHECK_MAPPING__TGGNODE = eINSTANCE
				.getjava2classAxiom_adapted_axiom_adapted__ConflictCheckMapping__TGGNode();

		/**
		 * The meta object literal for the '<em><b>Conflict Check Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED___CONFLICT_CHECK_BACKWARD__TGGNODE = eINSTANCE
				.getjava2classAxiom_adapted_axiom_adapted__ConflictCheckBackward__TGGNode();

		/**
		 * The meta object literal for the '<em><b>Synchronize Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getjava2classAxiom_adapted_axiom_adapted__SynchronizeForward__TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Synchronize Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getjava2classAxiom_adapted_axiom_adapted__SynchronizeBackward__TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Repair Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED___REPAIR_FORWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getjava2classAxiom_adapted_axiom_adapted__RepairForward__TGGNode_boolean();

		/**
		 * The meta object literal for the '<em><b>Repair Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED___REPAIR_BACKWARD__TGGNODE_BOOLEAN = eINSTANCE
				.getjava2classAxiom_adapted_axiom_adapted__RepairBackward__TGGNode_boolean();

	}

} //GeneratedPackage
