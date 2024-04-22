/**
 */
package tggh;

import de.mdelab.mltgg.mote2.Mote2Package;

import org.eclipse.emf.ecore.EClass;
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
 * @see tggh.TgghFactory
 * @model kind="package"
 * @generated
 */
public interface TgghPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tggh";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.mdelab.de/migmm/tggh/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tggh";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TgghPackage eINSTANCE = tggh.impl.TgghPackageImpl.init();

	/**
	 * The meta object id for the '{@link tggh.impl.TGGNodeWithHistoryImpl <em>TGG Node With History</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tggh.impl.TGGNodeWithHistoryImpl
	 * @see tggh.impl.TgghPackageImpl#getTGGNodeWithHistory()
	 * @generated
	 */
	int TGG_NODE_WITH_HISTORY = 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGG_NODE_WITH_HISTORY__ANNOTATIONS = Mote2Package.TGG_NODE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGG_NODE_WITH_HISTORY__NEXT = Mote2Package.TGG_NODE__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGG_NODE_WITH_HISTORY__PREVIOUS = Mote2Package.TGG_NODE__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Left Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGG_NODE_WITH_HISTORY__LEFT_NODES = Mote2Package.TGG_NODE__LEFT_NODES;

	/**
	 * The feature id for the '<em><b>Right Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGG_NODE_WITH_HISTORY__RIGHT_NODES = Mote2Package.TGG_NODE__RIGHT_NODES;

	/**
	 * The feature id for the '<em><b>Created By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGG_NODE_WITH_HISTORY__CREATED_BY = Mote2Package.TGG_NODE__CREATED_BY;

	/**
	 * The feature id for the '<em><b>Valid In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGG_NODE_WITH_HISTORY__VALID_IN = Mote2Package.TGG_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unhandled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGG_NODE_WITH_HISTORY__UNHANDLED = Mote2Package.TGG_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>In Projection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGG_NODE_WITH_HISTORY__IN_PROJECTION = Mote2Package.TGG_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TGG Node With History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGG_NODE_WITH_HISTORY_FEATURE_COUNT = Mote2Package.TGG_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TGG Node With History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGG_NODE_WITH_HISTORY_OPERATION_COUNT = Mote2Package.TGG_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tggh.impl.History2HistoryImpl <em>History2 History</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tggh.impl.History2HistoryImpl
	 * @see tggh.impl.TgghPackageImpl#getHistory2History()
	 * @generated
	 */
	int HISTORY2_HISTORY = 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY2_HISTORY__ANNOTATIONS = TGG_NODE_WITH_HISTORY__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY2_HISTORY__NEXT = TGG_NODE_WITH_HISTORY__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY2_HISTORY__PREVIOUS = TGG_NODE_WITH_HISTORY__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Left Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY2_HISTORY__LEFT_NODES = TGG_NODE_WITH_HISTORY__LEFT_NODES;

	/**
	 * The feature id for the '<em><b>Right Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY2_HISTORY__RIGHT_NODES = TGG_NODE_WITH_HISTORY__RIGHT_NODES;

	/**
	 * The feature id for the '<em><b>Created By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY2_HISTORY__CREATED_BY = TGG_NODE_WITH_HISTORY__CREATED_BY;

	/**
	 * The feature id for the '<em><b>Valid In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY2_HISTORY__VALID_IN = TGG_NODE_WITH_HISTORY__VALID_IN;

	/**
	 * The feature id for the '<em><b>Unhandled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY2_HISTORY__UNHANDLED = TGG_NODE_WITH_HISTORY__UNHANDLED;

	/**
	 * The feature id for the '<em><b>In Projection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY2_HISTORY__IN_PROJECTION = TGG_NODE_WITH_HISTORY__IN_PROJECTION;

	/**
	 * The number of structural features of the '<em>History2 History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY2_HISTORY_FEATURE_COUNT = TGG_NODE_WITH_HISTORY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>History2 History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY2_HISTORY_OPERATION_COUNT = TGG_NODE_WITH_HISTORY_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link tggh.History2History <em>History2 History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>History2 History</em>'.
	 * @see tggh.History2History
	 * @generated
	 */
	EClass getHistory2History();

	/**
	 * Returns the meta object for class '{@link tggh.TGGNodeWithHistory <em>TGG Node With History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TGG Node With History</em>'.
	 * @see tggh.TGGNodeWithHistory
	 * @generated
	 */
	EClass getTGGNodeWithHistory();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TgghFactory getTgghFactory();

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
		 * The meta object literal for the '{@link tggh.impl.History2HistoryImpl <em>History2 History</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tggh.impl.History2HistoryImpl
		 * @see tggh.impl.TgghPackageImpl#getHistory2History()
		 * @generated
		 */
		EClass HISTORY2_HISTORY = eINSTANCE.getHistory2History();
		/**
		 * The meta object literal for the '{@link tggh.impl.TGGNodeWithHistoryImpl <em>TGG Node With History</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tggh.impl.TGGNodeWithHistoryImpl
		 * @see tggh.impl.TgghPackageImpl#getTGGNodeWithHistory()
		 * @generated
		 */
		EClass TGG_NODE_WITH_HISTORY = eINSTANCE.getTGGNodeWithHistory();

	}

} //TgghPackage
