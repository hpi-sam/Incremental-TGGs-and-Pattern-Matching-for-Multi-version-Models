/**
 */
package de.mdelab.migmm.history;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see de.mdelab.migmm.history.HistoryFactory
 * @model kind="package"
 * @generated
 */
public interface HistoryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "history";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.mdelab.de/migmm/history/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "history";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HistoryPackage eINSTANCE = de.mdelab.migmm.history.impl.HistoryPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.mdelab.migmm.history.impl.HistoryImpl <em>History</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.migmm.history.impl.HistoryImpl
	 * @see de.mdelab.migmm.history.impl.HistoryPackageImpl#getHistory()
	 * @generated
	 */
	int HISTORY = 0;

	/**
	 * The meta object id for the '{@link de.mdelab.migmm.history.Interval <em>Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.migmm.history.Interval
	 * @see de.mdelab.migmm.history.impl.HistoryPackageImpl#getInterval()
	 * @generated
	 */
	int INTERVAL = 1;

	/**
	 * The meta object id for the '{@link de.mdelab.migmm.history.impl.TimingUnitImpl <em>Timing Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.migmm.history.impl.TimingUnitImpl
	 * @see de.mdelab.migmm.history.impl.HistoryPackageImpl#getTimingUnit()
	 * @generated
	 */
	int TIMING_UNIT = 2;

	/**
	 * The meta object id for the '{@link de.mdelab.migmm.history.impl.ElementWithHistoryImpl <em>Element With History</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.migmm.history.impl.ElementWithHistoryImpl
	 * @see de.mdelab.migmm.history.impl.HistoryPackageImpl#getElementWithHistory()
	 * @generated
	 */
	int ELEMENT_WITH_HISTORY = 3;

	/**
	 * The feature id for the '<em><b>Valid In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_WITH_HISTORY__VALID_IN = 0;

	/**
	 * The feature id for the '<em><b>Unhandled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_WITH_HISTORY__UNHANDLED = 1;

	/**
	 * The feature id for the '<em><b>In Projection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_WITH_HISTORY__IN_PROJECTION = 2;

	/**
	 * The number of structural features of the '<em>Element With History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_WITH_HISTORY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Element With History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_WITH_HISTORY_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Valid In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY__VALID_IN = ELEMENT_WITH_HISTORY__VALID_IN;

	/**
	 * The feature id for the '<em><b>Unhandled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY__UNHANDLED = ELEMENT_WITH_HISTORY__UNHANDLED;

	/**
	 * The feature id for the '<em><b>In Projection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY__IN_PROJECTION = ELEMENT_WITH_HISTORY__IN_PROJECTION;

	/**
	 * The feature id for the '<em><b>Owned Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY__OWNED_ELEMENTS = ELEMENT_WITH_HISTORY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Intervals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY__OWNED_INTERVALS = ELEMENT_WITH_HISTORY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Timing Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY__OWNED_TIMING_UNITS = ELEMENT_WITH_HISTORY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_FEATURE_COUNT = ELEMENT_WITH_HISTORY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OPERATION_COUNT = ELEMENT_WITH_HISTORY_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Intersect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL___INTERSECT__INTERVAL = 0;

	/**
	 * The operation id for the '<em>Minus</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL___MINUS__INTERVAL = 1;

	/**
	 * The operation id for the '<em>Union</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL___UNION__INTERVAL = 2;

	/**
	 * The operation id for the '<em>Complement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL___COMPLEMENT = 3;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL___CONTAINS__TIMINGUNIT = 4;

	/**
	 * The operation id for the '<em>Is Empty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL___IS_EMPTY = 5;

	/**
	 * The operation id for the '<em>Get Present Timing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL___GET_PRESENT_TIMING = 6;

	/**
	 * The operation id for the '<em>Get Deleted Timing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL___GET_DELETED_TIMING = 7;

	/**
	 * The operation id for the '<em>Get Absent Timing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL___GET_ABSENT_TIMING = 8;

	/**
	 * The number of operations of the '<em>Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_OPERATION_COUNT = 9;

	/**
	 * The number of structural features of the '<em>Timing Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_UNIT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Timing Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_UNIT_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link de.mdelab.migmm.history.impl.GenericCompleteIntervalImpl <em>Generic Complete Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.migmm.history.impl.GenericCompleteIntervalImpl
	 * @see de.mdelab.migmm.history.impl.HistoryPackageImpl#getGenericCompleteInterval()
	 * @generated
	 */
	int GENERIC_COMPLETE_INTERVAL = 4;

	/**
	 * The number of structural features of the '<em>Generic Complete Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_COMPLETE_INTERVAL_FEATURE_COUNT = INTERVAL_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Intersect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_COMPLETE_INTERVAL___INTERSECT__INTERVAL = INTERVAL___INTERSECT__INTERVAL;

	/**
	 * The operation id for the '<em>Minus</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_COMPLETE_INTERVAL___MINUS__INTERVAL = INTERVAL___MINUS__INTERVAL;

	/**
	 * The operation id for the '<em>Union</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_COMPLETE_INTERVAL___UNION__INTERVAL = INTERVAL___UNION__INTERVAL;

	/**
	 * The operation id for the '<em>Complement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_COMPLETE_INTERVAL___COMPLEMENT = INTERVAL___COMPLEMENT;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_COMPLETE_INTERVAL___CONTAINS__TIMINGUNIT = INTERVAL___CONTAINS__TIMINGUNIT;

	/**
	 * The operation id for the '<em>Is Empty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_COMPLETE_INTERVAL___IS_EMPTY = INTERVAL___IS_EMPTY;

	/**
	 * The operation id for the '<em>Get Present Timing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_COMPLETE_INTERVAL___GET_PRESENT_TIMING = INTERVAL___GET_PRESENT_TIMING;

	/**
	 * The operation id for the '<em>Get Deleted Timing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_COMPLETE_INTERVAL___GET_DELETED_TIMING = INTERVAL___GET_DELETED_TIMING;

	/**
	 * The operation id for the '<em>Get Absent Timing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_COMPLETE_INTERVAL___GET_ABSENT_TIMING = INTERVAL___GET_ABSENT_TIMING;

	/**
	 * The number of operations of the '<em>Generic Complete Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_COMPLETE_INTERVAL_OPERATION_COUNT = INTERVAL_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link de.mdelab.migmm.history.impl.EdgeWithHistoryImpl <em>Edge With History</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.migmm.history.impl.EdgeWithHistoryImpl
	 * @see de.mdelab.migmm.history.impl.HistoryPackageImpl#getEdgeWithHistory()
	 * @generated
	 */
	int EDGE_WITH_HISTORY = 5;

	/**
	 * The feature id for the '<em><b>Valid In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_WITH_HISTORY__VALID_IN = ELEMENT_WITH_HISTORY__VALID_IN;

	/**
	 * The feature id for the '<em><b>Unhandled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_WITH_HISTORY__UNHANDLED = ELEMENT_WITH_HISTORY__UNHANDLED;

	/**
	 * The feature id for the '<em><b>In Projection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_WITH_HISTORY__IN_PROJECTION = ELEMENT_WITH_HISTORY__IN_PROJECTION;

	/**
	 * The feature id for the '<em><b>Edge Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_WITH_HISTORY__EDGE_SOURCE = ELEMENT_WITH_HISTORY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Edge Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_WITH_HISTORY__EDGE_TARGET = ELEMENT_WITH_HISTORY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_WITH_HISTORY__IS_CONTAINMENT = ELEMENT_WITH_HISTORY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Edge With History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_WITH_HISTORY_FEATURE_COUNT = ELEMENT_WITH_HISTORY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Edge With History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_WITH_HISTORY_OPERATION_COUNT = ELEMENT_WITH_HISTORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.migmm.history.impl.ContainmentEdgeWithHistoryImpl <em>Containment Edge With History</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.migmm.history.impl.ContainmentEdgeWithHistoryImpl
	 * @see de.mdelab.migmm.history.impl.HistoryPackageImpl#getContainmentEdgeWithHistory()
	 * @generated
	 */
	int CONTAINMENT_EDGE_WITH_HISTORY = 6;

	/**
	 * The feature id for the '<em><b>Valid In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_EDGE_WITH_HISTORY__VALID_IN = EDGE_WITH_HISTORY__VALID_IN;

	/**
	 * The feature id for the '<em><b>Unhandled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_EDGE_WITH_HISTORY__UNHANDLED = EDGE_WITH_HISTORY__UNHANDLED;

	/**
	 * The feature id for the '<em><b>In Projection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_EDGE_WITH_HISTORY__IN_PROJECTION = EDGE_WITH_HISTORY__IN_PROJECTION;

	/**
	 * The feature id for the '<em><b>Edge Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_EDGE_WITH_HISTORY__EDGE_SOURCE = EDGE_WITH_HISTORY__EDGE_SOURCE;

	/**
	 * The feature id for the '<em><b>Edge Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_EDGE_WITH_HISTORY__EDGE_TARGET = EDGE_WITH_HISTORY__EDGE_TARGET;

	/**
	 * The feature id for the '<em><b>Is Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_EDGE_WITH_HISTORY__IS_CONTAINMENT = EDGE_WITH_HISTORY__IS_CONTAINMENT;

	/**
	 * The number of structural features of the '<em>Containment Edge With History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_EDGE_WITH_HISTORY_FEATURE_COUNT = EDGE_WITH_HISTORY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Containment Edge With History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_EDGE_WITH_HISTORY_OPERATION_COUNT = EDGE_WITH_HISTORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.migmm.history.impl.AttributeWithHistoryImpl <em>Attribute With History</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.migmm.history.impl.AttributeWithHistoryImpl
	 * @see de.mdelab.migmm.history.impl.HistoryPackageImpl#getAttributeWithHistory()
	 * @generated
	 */
	int ATTRIBUTE_WITH_HISTORY = 7;

	/**
	 * The feature id for the '<em><b>Valid In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_WITH_HISTORY__VALID_IN = ELEMENT_WITH_HISTORY__VALID_IN;

	/**
	 * The feature id for the '<em><b>Unhandled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_WITH_HISTORY__UNHANDLED = ELEMENT_WITH_HISTORY__UNHANDLED;

	/**
	 * The feature id for the '<em><b>In Projection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_WITH_HISTORY__IN_PROJECTION = ELEMENT_WITH_HISTORY__IN_PROJECTION;

	/**
	 * The feature id for the '<em><b>Containing Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_WITH_HISTORY__CONTAINING_NODE = ELEMENT_WITH_HISTORY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_WITH_HISTORY__ATTRIBUTE_VALUE = ELEMENT_WITH_HISTORY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute With History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_WITH_HISTORY_FEATURE_COUNT = ELEMENT_WITH_HISTORY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Attribute With History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_WITH_HISTORY_OPERATION_COUNT = ELEMENT_WITH_HISTORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.migmm.history.impl.NodeWithHistoryImpl <em>Node With History</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.migmm.history.impl.NodeWithHistoryImpl
	 * @see de.mdelab.migmm.history.impl.HistoryPackageImpl#getNodeWithHistory()
	 * @generated
	 */
	int NODE_WITH_HISTORY = 8;

	/**
	 * The feature id for the '<em><b>Valid In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_WITH_HISTORY__VALID_IN = ELEMENT_WITH_HISTORY__VALID_IN;

	/**
	 * The feature id for the '<em><b>Unhandled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_WITH_HISTORY__UNHANDLED = ELEMENT_WITH_HISTORY__UNHANDLED;

	/**
	 * The feature id for the '<em><b>In Projection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_WITH_HISTORY__IN_PROJECTION = ELEMENT_WITH_HISTORY__IN_PROJECTION;

	/**
	 * The feature id for the '<em><b>In Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_WITH_HISTORY__IN_EDGES = ELEMENT_WITH_HISTORY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Out Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_WITH_HISTORY__OUT_EDGES = ELEMENT_WITH_HISTORY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Node Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_WITH_HISTORY__NODE_ATTRIBUTES = ELEMENT_WITH_HISTORY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Node With History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_WITH_HISTORY_FEATURE_COUNT = ELEMENT_WITH_HISTORY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Node With History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_WITH_HISTORY_OPERATION_COUNT = ELEMENT_WITH_HISTORY_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link de.mdelab.migmm.history.History <em>History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>History</em>'.
	 * @see de.mdelab.migmm.history.History
	 * @generated
	 */
	EClass getHistory();

	/**
	 * Returns the meta object for the containment reference list '{@link de.mdelab.migmm.history.History#getOwnedElements <em>Owned Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Elements</em>'.
	 * @see de.mdelab.migmm.history.History#getOwnedElements()
	 * @see #getHistory()
	 * @generated
	 */
	EReference getHistory_OwnedElements();

	/**
	 * Returns the meta object for the containment reference list '{@link de.mdelab.migmm.history.History#getOwnedIntervals <em>Owned Intervals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Intervals</em>'.
	 * @see de.mdelab.migmm.history.History#getOwnedIntervals()
	 * @see #getHistory()
	 * @generated
	 */
	EReference getHistory_OwnedIntervals();

	/**
	 * Returns the meta object for the containment reference list '{@link de.mdelab.migmm.history.History#getOwnedTimingUnits <em>Owned Timing Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Timing Units</em>'.
	 * @see de.mdelab.migmm.history.History#getOwnedTimingUnits()
	 * @see #getHistory()
	 * @generated
	 */
	EReference getHistory_OwnedTimingUnits();

	/**
	 * Returns the meta object for class '{@link de.mdelab.migmm.history.Interval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interval</em>'.
	 * @see de.mdelab.migmm.history.Interval
	 * @generated
	 */
	EClass getInterval();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.history.Interval#intersect(de.mdelab.migmm.history.Interval) <em>Intersect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Intersect</em>' operation.
	 * @see de.mdelab.migmm.history.Interval#intersect(de.mdelab.migmm.history.Interval)
	 * @generated
	 */
	EOperation getInterval__Intersect__Interval();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.history.Interval#minus(de.mdelab.migmm.history.Interval) <em>Minus</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Minus</em>' operation.
	 * @see de.mdelab.migmm.history.Interval#minus(de.mdelab.migmm.history.Interval)
	 * @generated
	 */
	EOperation getInterval__Minus__Interval();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.history.Interval#union(de.mdelab.migmm.history.Interval) <em>Union</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Union</em>' operation.
	 * @see de.mdelab.migmm.history.Interval#union(de.mdelab.migmm.history.Interval)
	 * @generated
	 */
	EOperation getInterval__Union__Interval();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.history.Interval#complement() <em>Complement</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Complement</em>' operation.
	 * @see de.mdelab.migmm.history.Interval#complement()
	 * @generated
	 */
	EOperation getInterval__Complement();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.history.Interval#contains(de.mdelab.migmm.history.TimingUnit) <em>Contains</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Contains</em>' operation.
	 * @see de.mdelab.migmm.history.Interval#contains(de.mdelab.migmm.history.TimingUnit)
	 * @generated
	 */
	EOperation getInterval__Contains__TimingUnit();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.history.Interval#isEmpty() <em>Is Empty</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Empty</em>' operation.
	 * @see de.mdelab.migmm.history.Interval#isEmpty()
	 * @generated
	 */
	EOperation getInterval__IsEmpty();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.history.Interval#getPresentTiming() <em>Get Present Timing</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Present Timing</em>' operation.
	 * @see de.mdelab.migmm.history.Interval#getPresentTiming()
	 * @generated
	 */
	EOperation getInterval__GetPresentTiming();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.history.Interval#getDeletedTiming() <em>Get Deleted Timing</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Deleted Timing</em>' operation.
	 * @see de.mdelab.migmm.history.Interval#getDeletedTiming()
	 * @generated
	 */
	EOperation getInterval__GetDeletedTiming();

	/**
	 * Returns the meta object for the '{@link de.mdelab.migmm.history.Interval#getAbsentTiming() <em>Get Absent Timing</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Absent Timing</em>' operation.
	 * @see de.mdelab.migmm.history.Interval#getAbsentTiming()
	 * @generated
	 */
	EOperation getInterval__GetAbsentTiming();

	/**
	 * Returns the meta object for class '{@link de.mdelab.migmm.history.TimingUnit <em>Timing Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timing Unit</em>'.
	 * @see de.mdelab.migmm.history.TimingUnit
	 * @generated
	 */
	EClass getTimingUnit();

	/**
	 * Returns the meta object for class '{@link de.mdelab.migmm.history.ElementWithHistory <em>Element With History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element With History</em>'.
	 * @see de.mdelab.migmm.history.ElementWithHistory
	 * @generated
	 */
	EClass getElementWithHistory();

	/**
	 * Returns the meta object for the containment reference '{@link de.mdelab.migmm.history.ElementWithHistory#getValidIn <em>Valid In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Valid In</em>'.
	 * @see de.mdelab.migmm.history.ElementWithHistory#getValidIn()
	 * @see #getElementWithHistory()
	 * @generated
	 */
	EReference getElementWithHistory_ValidIn();

	/**
	 * Returns the meta object for the containment reference '{@link de.mdelab.migmm.history.ElementWithHistory#getUnhandled <em>Unhandled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unhandled</em>'.
	 * @see de.mdelab.migmm.history.ElementWithHistory#getUnhandled()
	 * @see #getElementWithHistory()
	 * @generated
	 */
	EReference getElementWithHistory_Unhandled();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.migmm.history.ElementWithHistory#isInProjection <em>In Projection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In Projection</em>'.
	 * @see de.mdelab.migmm.history.ElementWithHistory#isInProjection()
	 * @see #getElementWithHistory()
	 * @generated
	 */
	EAttribute getElementWithHistory_InProjection();

	/**
	 * Returns the meta object for class '{@link de.mdelab.migmm.history.GenericCompleteInterval <em>Generic Complete Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Complete Interval</em>'.
	 * @see de.mdelab.migmm.history.GenericCompleteInterval
	 * @generated
	 */
	EClass getGenericCompleteInterval();

	/**
	 * Returns the meta object for class '{@link de.mdelab.migmm.history.EdgeWithHistory <em>Edge With History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge With History</em>'.
	 * @see de.mdelab.migmm.history.EdgeWithHistory
	 * @generated
	 */
	EClass getEdgeWithHistory();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.history.EdgeWithHistory#getEdgeSource <em>Edge Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Edge Source</em>'.
	 * @see de.mdelab.migmm.history.EdgeWithHistory#getEdgeSource()
	 * @see #getEdgeWithHistory()
	 * @generated
	 */
	EReference getEdgeWithHistory_EdgeSource();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.history.EdgeWithHistory#getEdgeTarget <em>Edge Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Edge Target</em>'.
	 * @see de.mdelab.migmm.history.EdgeWithHistory#getEdgeTarget()
	 * @see #getEdgeWithHistory()
	 * @generated
	 */
	EReference getEdgeWithHistory_EdgeTarget();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.migmm.history.EdgeWithHistory#isIsContainment <em>Is Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Containment</em>'.
	 * @see de.mdelab.migmm.history.EdgeWithHistory#isIsContainment()
	 * @see #getEdgeWithHistory()
	 * @generated
	 */
	EAttribute getEdgeWithHistory_IsContainment();

	/**
	 * Returns the meta object for class '{@link de.mdelab.migmm.history.ContainmentEdgeWithHistory <em>Containment Edge With History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Containment Edge With History</em>'.
	 * @see de.mdelab.migmm.history.ContainmentEdgeWithHistory
	 * @generated
	 */
	EClass getContainmentEdgeWithHistory();

	/**
	 * Returns the meta object for class '{@link de.mdelab.migmm.history.AttributeWithHistory <em>Attribute With History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute With History</em>'.
	 * @see de.mdelab.migmm.history.AttributeWithHistory
	 * @generated
	 */
	EClass getAttributeWithHistory();

	/**
	 * Returns the meta object for the reference '{@link de.mdelab.migmm.history.AttributeWithHistory#getContainingNode <em>Containing Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Containing Node</em>'.
	 * @see de.mdelab.migmm.history.AttributeWithHistory#getContainingNode()
	 * @see #getAttributeWithHistory()
	 * @generated
	 */
	EReference getAttributeWithHistory_ContainingNode();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.migmm.history.AttributeWithHistory#getAttributeValue <em>Attribute Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute Value</em>'.
	 * @see de.mdelab.migmm.history.AttributeWithHistory#getAttributeValue()
	 * @see #getAttributeWithHistory()
	 * @generated
	 */
	EAttribute getAttributeWithHistory_AttributeValue();

	/**
	 * Returns the meta object for class '{@link de.mdelab.migmm.history.NodeWithHistory <em>Node With History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node With History</em>'.
	 * @see de.mdelab.migmm.history.NodeWithHistory
	 * @generated
	 */
	EClass getNodeWithHistory();

	/**
	 * Returns the meta object for the reference list '{@link de.mdelab.migmm.history.NodeWithHistory#getInEdges <em>In Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In Edges</em>'.
	 * @see de.mdelab.migmm.history.NodeWithHistory#getInEdges()
	 * @see #getNodeWithHistory()
	 * @generated
	 */
	EReference getNodeWithHistory_InEdges();

	/**
	 * Returns the meta object for the reference list '{@link de.mdelab.migmm.history.NodeWithHistory#getOutEdges <em>Out Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Out Edges</em>'.
	 * @see de.mdelab.migmm.history.NodeWithHistory#getOutEdges()
	 * @see #getNodeWithHistory()
	 * @generated
	 */
	EReference getNodeWithHistory_OutEdges();

	/**
	 * Returns the meta object for the reference list '{@link de.mdelab.migmm.history.NodeWithHistory#getNodeAttributes <em>Node Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Node Attributes</em>'.
	 * @see de.mdelab.migmm.history.NodeWithHistory#getNodeAttributes()
	 * @see #getNodeWithHistory()
	 * @generated
	 */
	EReference getNodeWithHistory_NodeAttributes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HistoryFactory getHistoryFactory();

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
		 * The meta object literal for the '{@link de.mdelab.migmm.history.impl.HistoryImpl <em>History</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.migmm.history.impl.HistoryImpl
		 * @see de.mdelab.migmm.history.impl.HistoryPackageImpl#getHistory()
		 * @generated
		 */
		EClass HISTORY = eINSTANCE.getHistory();

		/**
		 * The meta object literal for the '<em><b>Owned Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HISTORY__OWNED_ELEMENTS = eINSTANCE.getHistory_OwnedElements();

		/**
		 * The meta object literal for the '<em><b>Owned Intervals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HISTORY__OWNED_INTERVALS = eINSTANCE.getHistory_OwnedIntervals();

		/**
		 * The meta object literal for the '<em><b>Owned Timing Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HISTORY__OWNED_TIMING_UNITS = eINSTANCE.getHistory_OwnedTimingUnits();

		/**
		 * The meta object literal for the '{@link de.mdelab.migmm.history.Interval <em>Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.migmm.history.Interval
		 * @see de.mdelab.migmm.history.impl.HistoryPackageImpl#getInterval()
		 * @generated
		 */
		EClass INTERVAL = eINSTANCE.getInterval();

		/**
		 * The meta object literal for the '<em><b>Intersect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERVAL___INTERSECT__INTERVAL = eINSTANCE.getInterval__Intersect__Interval();

		/**
		 * The meta object literal for the '<em><b>Minus</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERVAL___MINUS__INTERVAL = eINSTANCE.getInterval__Minus__Interval();

		/**
		 * The meta object literal for the '<em><b>Union</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERVAL___UNION__INTERVAL = eINSTANCE.getInterval__Union__Interval();

		/**
		 * The meta object literal for the '<em><b>Complement</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERVAL___COMPLEMENT = eINSTANCE.getInterval__Complement();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERVAL___CONTAINS__TIMINGUNIT = eINSTANCE.getInterval__Contains__TimingUnit();

		/**
		 * The meta object literal for the '<em><b>Is Empty</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERVAL___IS_EMPTY = eINSTANCE.getInterval__IsEmpty();

		/**
		 * The meta object literal for the '<em><b>Get Present Timing</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERVAL___GET_PRESENT_TIMING = eINSTANCE.getInterval__GetPresentTiming();

		/**
		 * The meta object literal for the '<em><b>Get Deleted Timing</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERVAL___GET_DELETED_TIMING = eINSTANCE.getInterval__GetDeletedTiming();

		/**
		 * The meta object literal for the '<em><b>Get Absent Timing</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERVAL___GET_ABSENT_TIMING = eINSTANCE.getInterval__GetAbsentTiming();

		/**
		 * The meta object literal for the '{@link de.mdelab.migmm.history.impl.TimingUnitImpl <em>Timing Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.migmm.history.impl.TimingUnitImpl
		 * @see de.mdelab.migmm.history.impl.HistoryPackageImpl#getTimingUnit()
		 * @generated
		 */
		EClass TIMING_UNIT = eINSTANCE.getTimingUnit();

		/**
		 * The meta object literal for the '{@link de.mdelab.migmm.history.impl.ElementWithHistoryImpl <em>Element With History</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.migmm.history.impl.ElementWithHistoryImpl
		 * @see de.mdelab.migmm.history.impl.HistoryPackageImpl#getElementWithHistory()
		 * @generated
		 */
		EClass ELEMENT_WITH_HISTORY = eINSTANCE.getElementWithHistory();

		/**
		 * The meta object literal for the '<em><b>Valid In</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_WITH_HISTORY__VALID_IN = eINSTANCE.getElementWithHistory_ValidIn();

		/**
		 * The meta object literal for the '<em><b>Unhandled</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_WITH_HISTORY__UNHANDLED = eINSTANCE.getElementWithHistory_Unhandled();

		/**
		 * The meta object literal for the '<em><b>In Projection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_WITH_HISTORY__IN_PROJECTION = eINSTANCE.getElementWithHistory_InProjection();

		/**
		 * The meta object literal for the '{@link de.mdelab.migmm.history.impl.GenericCompleteIntervalImpl <em>Generic Complete Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.migmm.history.impl.GenericCompleteIntervalImpl
		 * @see de.mdelab.migmm.history.impl.HistoryPackageImpl#getGenericCompleteInterval()
		 * @generated
		 */
		EClass GENERIC_COMPLETE_INTERVAL = eINSTANCE.getGenericCompleteInterval();

		/**
		 * The meta object literal for the '{@link de.mdelab.migmm.history.impl.EdgeWithHistoryImpl <em>Edge With History</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.migmm.history.impl.EdgeWithHistoryImpl
		 * @see de.mdelab.migmm.history.impl.HistoryPackageImpl#getEdgeWithHistory()
		 * @generated
		 */
		EClass EDGE_WITH_HISTORY = eINSTANCE.getEdgeWithHistory();

		/**
		 * The meta object literal for the '<em><b>Edge Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE_WITH_HISTORY__EDGE_SOURCE = eINSTANCE.getEdgeWithHistory_EdgeSource();

		/**
		 * The meta object literal for the '<em><b>Edge Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE_WITH_HISTORY__EDGE_TARGET = eINSTANCE.getEdgeWithHistory_EdgeTarget();

		/**
		 * The meta object literal for the '<em><b>Is Containment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE_WITH_HISTORY__IS_CONTAINMENT = eINSTANCE.getEdgeWithHistory_IsContainment();

		/**
		 * The meta object literal for the '{@link de.mdelab.migmm.history.impl.ContainmentEdgeWithHistoryImpl <em>Containment Edge With History</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.migmm.history.impl.ContainmentEdgeWithHistoryImpl
		 * @see de.mdelab.migmm.history.impl.HistoryPackageImpl#getContainmentEdgeWithHistory()
		 * @generated
		 */
		EClass CONTAINMENT_EDGE_WITH_HISTORY = eINSTANCE.getContainmentEdgeWithHistory();

		/**
		 * The meta object literal for the '{@link de.mdelab.migmm.history.impl.AttributeWithHistoryImpl <em>Attribute With History</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.migmm.history.impl.AttributeWithHistoryImpl
		 * @see de.mdelab.migmm.history.impl.HistoryPackageImpl#getAttributeWithHistory()
		 * @generated
		 */
		EClass ATTRIBUTE_WITH_HISTORY = eINSTANCE.getAttributeWithHistory();

		/**
		 * The meta object literal for the '<em><b>Containing Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_WITH_HISTORY__CONTAINING_NODE = eINSTANCE.getAttributeWithHistory_ContainingNode();

		/**
		 * The meta object literal for the '<em><b>Attribute Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_WITH_HISTORY__ATTRIBUTE_VALUE = eINSTANCE.getAttributeWithHistory_AttributeValue();

		/**
		 * The meta object literal for the '{@link de.mdelab.migmm.history.impl.NodeWithHistoryImpl <em>Node With History</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.migmm.history.impl.NodeWithHistoryImpl
		 * @see de.mdelab.migmm.history.impl.HistoryPackageImpl#getNodeWithHistory()
		 * @generated
		 */
		EClass NODE_WITH_HISTORY = eINSTANCE.getNodeWithHistory();

		/**
		 * The meta object literal for the '<em><b>In Edges</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_WITH_HISTORY__IN_EDGES = eINSTANCE.getNodeWithHistory_InEdges();

		/**
		 * The meta object literal for the '<em><b>Out Edges</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_WITH_HISTORY__OUT_EDGES = eINSTANCE.getNodeWithHistory_OutEdges();

		/**
		 * The meta object literal for the '<em><b>Node Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_WITH_HISTORY__NODE_ATTRIBUTES = eINSTANCE.getNodeWithHistory_NodeAttributes();

	}

} //HistoryPackage
