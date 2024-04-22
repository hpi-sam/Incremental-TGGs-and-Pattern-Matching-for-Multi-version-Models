/**
 */
package de.mdelab.migmm.history.tggh.mote2history;

import de.mdelab.mltgg.mote2.Mote2Package;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

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
 * @see de.mdelab.migmm.history.tggh.mote2history.Mote2historyFactory
 * @model kind="package"
 * @generated
 */
public interface Mote2historyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mote2history";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.mdelab.de/migmm/mote2history/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mote2history";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Mote2historyPackage eINSTANCE = de.mdelab.migmm.history.tggh.mote2history.impl.Mote2historyPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.mdelab.migmm.history.tggh.mote2history.impl.TGGHEngineImpl <em>TGGH Engine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.migmm.history.tggh.mote2history.impl.TGGHEngineImpl
	 * @see de.mdelab.migmm.history.tggh.mote2history.impl.Mote2historyPackageImpl#getTGGHEngine()
	 * @generated
	 */
	int TGGH_ENGINE = 0;

	/**
	 * The feature id for the '<em><b>Covered Left Elements</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGGH_ENGINE__COVERED_LEFT_ELEMENTS = Mote2Package.TGG_ENGINE__COVERED_LEFT_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Covered Right Elements</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGGH_ENGINE__COVERED_RIGHT_ELEMENTS = Mote2Package.TGG_ENGINE__COVERED_RIGHT_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Tgg Nodes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGGH_ENGINE__TGG_NODES = Mote2Package.TGG_ENGINE__TGG_NODES;

	/**
	 * The feature id for the '<em><b>Operational TGG</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGGH_ENGINE__OPERATIONAL_TGG = Mote2Package.TGG_ENGINE__OPERATIONAL_TGG;

	/**
	 * The feature id for the '<em><b>Left Input Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGGH_ENGINE__LEFT_INPUT_ELEMENTS = Mote2Package.TGG_ENGINE__LEFT_INPUT_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Right Input Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGGH_ENGINE__RIGHT_INPUT_ELEMENTS = Mote2Package.TGG_ENGINE__RIGHT_INPUT_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Uncovered Left Elements</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGGH_ENGINE__UNCOVERED_LEFT_ELEMENTS = Mote2Package.TGG_ENGINE__UNCOVERED_LEFT_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Uncovered Right Elements</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGGH_ENGINE__UNCOVERED_RIGHT_ELEMENTS = Mote2Package.TGG_ENGINE__UNCOVERED_RIGHT_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Forward Transformation Queue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGGH_ENGINE__FORWARD_TRANSFORMATION_QUEUE = Mote2Package.TGG_ENGINE__FORWARD_TRANSFORMATION_QUEUE;

	/**
	 * The feature id for the '<em><b>Backward Transformation Queue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGGH_ENGINE__BACKWARD_TRANSFORMATION_QUEUE = Mote2Package.TGG_ENGINE__BACKWARD_TRANSFORMATION_QUEUE;

	/**
	 * The feature id for the '<em><b>Deleted Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGGH_ENGINE__DELETED_ELEMENTS = Mote2Package.TGG_ENGINE__DELETED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Deleted TGG Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGGH_ENGINE__DELETED_TGG_NODES = Mote2Package.TGG_ENGINE__DELETED_TGG_NODES;

	/**
	 * The feature id for the '<em><b>Tgg Nodes Serializable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGGH_ENGINE__TGG_NODES_SERIALIZABLE = Mote2Package.TGG_ENGINE__TGG_NODES_SERIALIZABLE;

	/**
	 * The number of structural features of the '<em>TGGH Engine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGGH_ENGINE_FEATURE_COUNT = Mote2Package.TGG_ENGINE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Init Models</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGGH_ENGINE___INIT_MODELS__ELIST_ELIST = Mote2Package.TGG_ENGINE___INIT_MODELS__ELIST_ELIST;

	/**
	 * The operation id for the '<em>Transform</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGGH_ENGINE___TRANSFORM__TRANSFORMATIONDIRECTIONENUM_BOOLEAN_BOOLEAN_BOOLEAN_BOOLEAN_IPROGRESSMONITOR = Mote2Package.TGG_ENGINE___TRANSFORM__TRANSFORMATIONDIRECTIONENUM_BOOLEAN_BOOLEAN_BOOLEAN_BOOLEAN_IPROGRESSMONITOR;

	/**
	 * The operation id for the '<em>Is Link Covered</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGGH_ENGINE___IS_LINK_COVERED__OBJECT_OBJECT_EREFERENCE = Mote2Package.TGG_ENGINE___IS_LINK_COVERED__OBJECT_OBJECT_EREFERENCE;

	/**
	 * The operation id for the '<em>Left Link Now Covered</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGGH_ENGINE___LEFT_LINK_NOW_COVERED__OBJECT_OBJECT_EREFERENCE_TGGNODE = Mote2Package.TGG_ENGINE___LEFT_LINK_NOW_COVERED__OBJECT_OBJECT_EREFERENCE_TGGNODE;

	/**
	 * The operation id for the '<em>Right Link Now Covered</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGGH_ENGINE___RIGHT_LINK_NOW_COVERED__OBJECT_OBJECT_EREFERENCE_TGGNODE = Mote2Package.TGG_ENGINE___RIGHT_LINK_NOW_COVERED__OBJECT_OBJECT_EREFERENCE_TGGNODE;

	/**
	 * The operation id for the '<em>Get Link Sources</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGGH_ENGINE___GET_LINK_SOURCES__EREFERENCE_EOBJECT = Mote2Package.TGG_ENGINE___GET_LINK_SOURCES__EREFERENCE_EOBJECT;

	/**
	 * The operation id for the '<em>Register Inverse Link</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGGH_ENGINE___REGISTER_INVERSE_LINK__EOBJECT_EOBJECT_EREFERENCE = Mote2Package.TGG_ENGINE___REGISTER_INVERSE_LINK__EOBJECT_EOBJECT_EREFERENCE;

	/**
	 * The operation id for the '<em>Unregister Inverse Link</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGGH_ENGINE___UNREGISTER_INVERSE_LINK__EOBJECT_EOBJECT_EREFERENCE = Mote2Package.TGG_ENGINE___UNREGISTER_INVERSE_LINK__EOBJECT_EOBJECT_EREFERENCE;

	/**
	 * The operation id for the '<em>Initialize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGGH_ENGINE___INITIALIZE = Mote2Package.TGG_ENGINE___INITIALIZE;

	/**
	 * The operation id for the '<em>Restore</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGGH_ENGINE___RESTORE = Mote2Package.TGG_ENGINE___RESTORE;

	/**
	 * The operation id for the '<em>Register Covering Corr Node</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGGH_ENGINE___REGISTER_COVERING_CORR_NODE__EOBJECT_TGGNODE = Mote2Package.TGG_ENGINE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>TGGH Engine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGGH_ENGINE_OPERATION_COUNT = Mote2Package.TGG_ENGINE_OPERATION_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link de.mdelab.migmm.history.tggh.mote2history.TGGHEngine <em>TGGH Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TGGH Engine</em>'.
	 * @see de.mdelab.migmm.history.tggh.mote2history.TGGHEngine
	 * @generated
	 */
	EClass getTGGHEngine();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.history.tggh.mote2history.TGGHEngine#registerCoveringCorrNode(org.eclipse.emf.ecore.EObject, de.mdelab.mltgg.mote2.TGGNode) <em>Register Covering Corr Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Covering Corr Node</em>' operation.
	 * @see de.mdelab.migmm.history.tggh.mote2history.TGGHEngine#registerCoveringCorrNode(org.eclipse.emf.ecore.EObject, de.mdelab.mltgg.mote2.TGGNode)
	 * @generated
	 */
	EOperation getTGGHEngine__RegisterCoveringCorrNode__EObject_TGGNode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Mote2historyFactory getMote2historyFactory();

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
		 * The meta object literal for the '{@link de.mdelab.migmm.history.tggh.mote2history.impl.TGGHEngineImpl <em>TGGH Engine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.migmm.history.tggh.mote2history.impl.TGGHEngineImpl
		 * @see de.mdelab.migmm.history.tggh.mote2history.impl.Mote2historyPackageImpl#getTGGHEngine()
		 * @generated
		 */
		EClass TGGH_ENGINE = eINSTANCE.getTGGHEngine();

		/**
		 * The meta object literal for the '<em><b>Register Covering Corr Node</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TGGH_ENGINE___REGISTER_COVERING_CORR_NODE__EOBJECT_TGGNODE = eINSTANCE.getTGGHEngine__RegisterCoveringCorrNode__EObject_TGGNode();

	}

} //Mote2historyPackage
