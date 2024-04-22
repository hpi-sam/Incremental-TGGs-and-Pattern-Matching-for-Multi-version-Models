/**
 */
package de.mdelab.migmm.history.timing;

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
 * @see de.mdelab.migmm.history.timing.TimingFactory
 * @model kind="package"
 * @generated
 */
public interface TimingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "timing";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.mdelab.de/migmm/history/test/timing/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "timing";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TimingPackage eINSTANCE = de.mdelab.migmm.history.timing.impl.TimingPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.mdelab.migmm.history.timing.impl.LTBaseIntervalImpl <em>LT Base Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.migmm.history.timing.impl.LTBaseIntervalImpl
	 * @see de.mdelab.migmm.history.timing.impl.TimingPackageImpl#getLTBaseInterval()
	 * @generated
	 */
	int LT_BASE_INTERVAL = 0;

	/**
	 * The feature id for the '<em><b>Cts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT_BASE_INTERVAL__CTS = HistoryPackage.INTERVAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT_BASE_INTERVAL__DTS = HistoryPackage.INTERVAL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>LT Base Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT_BASE_INTERVAL_FEATURE_COUNT = HistoryPackage.INTERVAL_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Intersect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT_BASE_INTERVAL___INTERSECT__INTERVAL = HistoryPackage.INTERVAL___INTERSECT__INTERVAL;

	/**
	 * The operation id for the '<em>Minus</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT_BASE_INTERVAL___MINUS__INTERVAL = HistoryPackage.INTERVAL___MINUS__INTERVAL;

	/**
	 * The operation id for the '<em>Union</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT_BASE_INTERVAL___UNION__INTERVAL = HistoryPackage.INTERVAL___UNION__INTERVAL;

	/**
	 * The operation id for the '<em>Complement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT_BASE_INTERVAL___COMPLEMENT = HistoryPackage.INTERVAL___COMPLEMENT;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT_BASE_INTERVAL___CONTAINS__TIMINGUNIT = HistoryPackage.INTERVAL___CONTAINS__TIMINGUNIT;

	/**
	 * The operation id for the '<em>Is Empty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT_BASE_INTERVAL___IS_EMPTY = HistoryPackage.INTERVAL___IS_EMPTY;

	/**
	 * The operation id for the '<em>Get Present Timing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT_BASE_INTERVAL___GET_PRESENT_TIMING = HistoryPackage.INTERVAL___GET_PRESENT_TIMING;

	/**
	 * The operation id for the '<em>Get Deleted Timing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT_BASE_INTERVAL___GET_DELETED_TIMING = HistoryPackage.INTERVAL___GET_DELETED_TIMING;

	/**
	 * The operation id for the '<em>Get Absent Timing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT_BASE_INTERVAL___GET_ABSENT_TIMING = HistoryPackage.INTERVAL___GET_ABSENT_TIMING;

	/**
	 * The number of operations of the '<em>LT Base Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT_BASE_INTERVAL_OPERATION_COUNT = HistoryPackage.INTERVAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.migmm.history.timing.impl.LTTimingUnitImpl <em>LT Timing Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.migmm.history.timing.impl.LTTimingUnitImpl
	 * @see de.mdelab.migmm.history.timing.impl.TimingPackageImpl#getLTTimingUnit()
	 * @generated
	 */
	int LT_TIMING_UNIT = 1;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT_TIMING_UNIT__TIME = HistoryPackage.TIMING_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>LT Timing Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT_TIMING_UNIT_FEATURE_COUNT = HistoryPackage.TIMING_UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>LT Timing Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT_TIMING_UNIT_OPERATION_COUNT = HistoryPackage.TIMING_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.migmm.history.timing.impl.LTCompositeIntervalImpl <em>LT Composite Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.migmm.history.timing.impl.LTCompositeIntervalImpl
	 * @see de.mdelab.migmm.history.timing.impl.TimingPackageImpl#getLTCompositeInterval()
	 * @generated
	 */
	int LT_COMPOSITE_INTERVAL = 2;

	/**
	 * The feature id for the '<em><b>Base Intervals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT_COMPOSITE_INTERVAL__BASE_INTERVALS = HistoryPackage.INTERVAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>LT Composite Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT_COMPOSITE_INTERVAL_FEATURE_COUNT = HistoryPackage.INTERVAL_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Intersect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT_COMPOSITE_INTERVAL___INTERSECT__INTERVAL = HistoryPackage.INTERVAL___INTERSECT__INTERVAL;

	/**
	 * The operation id for the '<em>Minus</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT_COMPOSITE_INTERVAL___MINUS__INTERVAL = HistoryPackage.INTERVAL___MINUS__INTERVAL;

	/**
	 * The operation id for the '<em>Union</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT_COMPOSITE_INTERVAL___UNION__INTERVAL = HistoryPackage.INTERVAL___UNION__INTERVAL;

	/**
	 * The operation id for the '<em>Complement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT_COMPOSITE_INTERVAL___COMPLEMENT = HistoryPackage.INTERVAL___COMPLEMENT;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT_COMPOSITE_INTERVAL___CONTAINS__TIMINGUNIT = HistoryPackage.INTERVAL___CONTAINS__TIMINGUNIT;

	/**
	 * The operation id for the '<em>Is Empty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT_COMPOSITE_INTERVAL___IS_EMPTY = HistoryPackage.INTERVAL___IS_EMPTY;

	/**
	 * The operation id for the '<em>Get Present Timing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT_COMPOSITE_INTERVAL___GET_PRESENT_TIMING = HistoryPackage.INTERVAL___GET_PRESENT_TIMING;

	/**
	 * The operation id for the '<em>Get Deleted Timing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT_COMPOSITE_INTERVAL___GET_DELETED_TIMING = HistoryPackage.INTERVAL___GET_DELETED_TIMING;

	/**
	 * The operation id for the '<em>Get Absent Timing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT_COMPOSITE_INTERVAL___GET_ABSENT_TIMING = HistoryPackage.INTERVAL___GET_ABSENT_TIMING;

	/**
	 * The number of operations of the '<em>LT Composite Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT_COMPOSITE_INTERVAL_OPERATION_COUNT = HistoryPackage.INTERVAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.migmm.history.timing.impl.DAGIntervalImpl <em>DAG Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.migmm.history.timing.impl.DAGIntervalImpl
	 * @see de.mdelab.migmm.history.timing.impl.TimingPackageImpl#getDAGInterval()
	 * @generated
	 */
	int DAG_INTERVAL = 3;

	/**
	 * The feature id for the '<em><b>Cts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAG_INTERVAL__CTS = HistoryPackage.INTERVAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAG_INTERVAL__DTS = HistoryPackage.INTERVAL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Recreating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAG_INTERVAL__RECREATING = HistoryPackage.INTERVAL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>DAG Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAG_INTERVAL_FEATURE_COUNT = HistoryPackage.INTERVAL_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Intersect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAG_INTERVAL___INTERSECT__INTERVAL = HistoryPackage.INTERVAL___INTERSECT__INTERVAL;

	/**
	 * The operation id for the '<em>Minus</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAG_INTERVAL___MINUS__INTERVAL = HistoryPackage.INTERVAL___MINUS__INTERVAL;

	/**
	 * The operation id for the '<em>Union</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAG_INTERVAL___UNION__INTERVAL = HistoryPackage.INTERVAL___UNION__INTERVAL;

	/**
	 * The operation id for the '<em>Complement</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAG_INTERVAL___COMPLEMENT = HistoryPackage.INTERVAL___COMPLEMENT;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAG_INTERVAL___CONTAINS__TIMINGUNIT = HistoryPackage.INTERVAL___CONTAINS__TIMINGUNIT;

	/**
	 * The operation id for the '<em>Is Empty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAG_INTERVAL___IS_EMPTY = HistoryPackage.INTERVAL___IS_EMPTY;

	/**
	 * The operation id for the '<em>Get Present Timing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAG_INTERVAL___GET_PRESENT_TIMING = HistoryPackage.INTERVAL___GET_PRESENT_TIMING;

	/**
	 * The operation id for the '<em>Get Deleted Timing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAG_INTERVAL___GET_DELETED_TIMING = HistoryPackage.INTERVAL___GET_DELETED_TIMING;

	/**
	 * The operation id for the '<em>Get Absent Timing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAG_INTERVAL___GET_ABSENT_TIMING = HistoryPackage.INTERVAL___GET_ABSENT_TIMING;

	/**
	 * The number of operations of the '<em>DAG Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAG_INTERVAL_OPERATION_COUNT = HistoryPackage.INTERVAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.mdelab.migmm.history.timing.impl.DAGVersionImpl <em>DAG Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.mdelab.migmm.history.timing.impl.DAGVersionImpl
	 * @see de.mdelab.migmm.history.timing.impl.TimingPackageImpl#getDAGVersion()
	 * @generated
	 */
	int DAG_VERSION = 4;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAG_VERSION__SUCCESSORS = HistoryPackage.TIMING_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Predecessors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAG_VERSION__PREDECESSORS = HistoryPackage.TIMING_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAG_VERSION__ID = HistoryPackage.TIMING_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Int ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAG_VERSION__INT_ID = HistoryPackage.TIMING_UNIT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>DAG Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAG_VERSION_FEATURE_COUNT = HistoryPackage.TIMING_UNIT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>DAG Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAG_VERSION_OPERATION_COUNT = HistoryPackage.TIMING_UNIT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.mdelab.migmm.history.timing.LTBaseInterval <em>LT Base Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LT Base Interval</em>'.
	 * @see de.mdelab.migmm.history.timing.LTBaseInterval
	 * @generated
	 */
	EClass getLTBaseInterval();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.migmm.history.timing.LTBaseInterval#getCts <em>Cts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cts</em>'.
	 * @see de.mdelab.migmm.history.timing.LTBaseInterval#getCts()
	 * @see #getLTBaseInterval()
	 * @generated
	 */
	EAttribute getLTBaseInterval_Cts();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.migmm.history.timing.LTBaseInterval#getDts <em>Dts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dts</em>'.
	 * @see de.mdelab.migmm.history.timing.LTBaseInterval#getDts()
	 * @see #getLTBaseInterval()
	 * @generated
	 */
	EAttribute getLTBaseInterval_Dts();

	/**
	 * Returns the meta object for class '{@link de.mdelab.migmm.history.timing.LTTimingUnit <em>LT Timing Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LT Timing Unit</em>'.
	 * @see de.mdelab.migmm.history.timing.LTTimingUnit
	 * @generated
	 */
	EClass getLTTimingUnit();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.migmm.history.timing.LTTimingUnit#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see de.mdelab.migmm.history.timing.LTTimingUnit#getTime()
	 * @see #getLTTimingUnit()
	 * @generated
	 */
	EAttribute getLTTimingUnit_Time();

	/**
	 * Returns the meta object for class '{@link de.mdelab.migmm.history.timing.LTCompositeInterval <em>LT Composite Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LT Composite Interval</em>'.
	 * @see de.mdelab.migmm.history.timing.LTCompositeInterval
	 * @generated
	 */
	EClass getLTCompositeInterval();

	/**
	 * Returns the meta object for the reference list '{@link de.mdelab.migmm.history.timing.LTCompositeInterval#getBaseIntervals <em>Base Intervals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Base Intervals</em>'.
	 * @see de.mdelab.migmm.history.timing.LTCompositeInterval#getBaseIntervals()
	 * @see #getLTCompositeInterval()
	 * @generated
	 */
	EReference getLTCompositeInterval_BaseIntervals();

	/**
	 * Returns the meta object for class '{@link de.mdelab.migmm.history.timing.DAGInterval <em>DAG Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DAG Interval</em>'.
	 * @see de.mdelab.migmm.history.timing.DAGInterval
	 * @generated
	 */
	EClass getDAGInterval();

	/**
	 * Returns the meta object for the reference list '{@link de.mdelab.migmm.history.timing.DAGInterval#getCts <em>Cts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cts</em>'.
	 * @see de.mdelab.migmm.history.timing.DAGInterval#getCts()
	 * @see #getDAGInterval()
	 * @generated
	 */
	EReference getDAGInterval_Cts();

	/**
	 * Returns the meta object for the reference list '{@link de.mdelab.migmm.history.timing.DAGInterval#getDts <em>Dts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dts</em>'.
	 * @see de.mdelab.migmm.history.timing.DAGInterval#getDts()
	 * @see #getDAGInterval()
	 * @generated
	 */
	EReference getDAGInterval_Dts();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.migmm.history.timing.DAGInterval#isRecreating <em>Recreating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recreating</em>'.
	 * @see de.mdelab.migmm.history.timing.DAGInterval#isRecreating()
	 * @see #getDAGInterval()
	 * @generated
	 */
	EAttribute getDAGInterval_Recreating();

	/**
	 * Returns the meta object for class '{@link de.mdelab.migmm.history.timing.DAGVersion <em>DAG Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DAG Version</em>'.
	 * @see de.mdelab.migmm.history.timing.DAGVersion
	 * @generated
	 */
	EClass getDAGVersion();

	/**
	 * Returns the meta object for the reference list '{@link de.mdelab.migmm.history.timing.DAGVersion#getSuccessors <em>Successors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Successors</em>'.
	 * @see de.mdelab.migmm.history.timing.DAGVersion#getSuccessors()
	 * @see #getDAGVersion()
	 * @generated
	 */
	EReference getDAGVersion_Successors();

	/**
	 * Returns the meta object for the reference list '{@link de.mdelab.migmm.history.timing.DAGVersion#getPredecessors <em>Predecessors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Predecessors</em>'.
	 * @see de.mdelab.migmm.history.timing.DAGVersion#getPredecessors()
	 * @see #getDAGVersion()
	 * @generated
	 */
	EReference getDAGVersion_Predecessors();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.migmm.history.timing.DAGVersion#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.mdelab.migmm.history.timing.DAGVersion#getId()
	 * @see #getDAGVersion()
	 * @generated
	 */
	EAttribute getDAGVersion_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.mdelab.migmm.history.timing.DAGVersion#getIntID <em>Int ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Int ID</em>'.
	 * @see de.mdelab.migmm.history.timing.DAGVersion#getIntID()
	 * @see #getDAGVersion()
	 * @generated
	 */
	EAttribute getDAGVersion_IntID();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TimingFactory getTimingFactory();

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
		 * The meta object literal for the '{@link de.mdelab.migmm.history.timing.impl.LTBaseIntervalImpl <em>LT Base Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.migmm.history.timing.impl.LTBaseIntervalImpl
		 * @see de.mdelab.migmm.history.timing.impl.TimingPackageImpl#getLTBaseInterval()
		 * @generated
		 */
		EClass LT_BASE_INTERVAL = eINSTANCE.getLTBaseInterval();

		/**
		 * The meta object literal for the '<em><b>Cts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LT_BASE_INTERVAL__CTS = eINSTANCE.getLTBaseInterval_Cts();

		/**
		 * The meta object literal for the '<em><b>Dts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LT_BASE_INTERVAL__DTS = eINSTANCE.getLTBaseInterval_Dts();

		/**
		 * The meta object literal for the '{@link de.mdelab.migmm.history.timing.impl.LTTimingUnitImpl <em>LT Timing Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.migmm.history.timing.impl.LTTimingUnitImpl
		 * @see de.mdelab.migmm.history.timing.impl.TimingPackageImpl#getLTTimingUnit()
		 * @generated
		 */
		EClass LT_TIMING_UNIT = eINSTANCE.getLTTimingUnit();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LT_TIMING_UNIT__TIME = eINSTANCE.getLTTimingUnit_Time();

		/**
		 * The meta object literal for the '{@link de.mdelab.migmm.history.timing.impl.LTCompositeIntervalImpl <em>LT Composite Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.migmm.history.timing.impl.LTCompositeIntervalImpl
		 * @see de.mdelab.migmm.history.timing.impl.TimingPackageImpl#getLTCompositeInterval()
		 * @generated
		 */
		EClass LT_COMPOSITE_INTERVAL = eINSTANCE.getLTCompositeInterval();

		/**
		 * The meta object literal for the '<em><b>Base Intervals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LT_COMPOSITE_INTERVAL__BASE_INTERVALS = eINSTANCE.getLTCompositeInterval_BaseIntervals();

		/**
		 * The meta object literal for the '{@link de.mdelab.migmm.history.timing.impl.DAGIntervalImpl <em>DAG Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.migmm.history.timing.impl.DAGIntervalImpl
		 * @see de.mdelab.migmm.history.timing.impl.TimingPackageImpl#getDAGInterval()
		 * @generated
		 */
		EClass DAG_INTERVAL = eINSTANCE.getDAGInterval();

		/**
		 * The meta object literal for the '<em><b>Cts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DAG_INTERVAL__CTS = eINSTANCE.getDAGInterval_Cts();

		/**
		 * The meta object literal for the '<em><b>Dts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DAG_INTERVAL__DTS = eINSTANCE.getDAGInterval_Dts();

		/**
		 * The meta object literal for the '<em><b>Recreating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAG_INTERVAL__RECREATING = eINSTANCE.getDAGInterval_Recreating();

		/**
		 * The meta object literal for the '{@link de.mdelab.migmm.history.timing.impl.DAGVersionImpl <em>DAG Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.mdelab.migmm.history.timing.impl.DAGVersionImpl
		 * @see de.mdelab.migmm.history.timing.impl.TimingPackageImpl#getDAGVersion()
		 * @generated
		 */
		EClass DAG_VERSION = eINSTANCE.getDAGVersion();

		/**
		 * The meta object literal for the '<em><b>Successors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DAG_VERSION__SUCCESSORS = eINSTANCE.getDAGVersion_Successors();

		/**
		 * The meta object literal for the '<em><b>Predecessors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DAG_VERSION__PREDECESSORS = eINSTANCE.getDAGVersion_Predecessors();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAG_VERSION__ID = eINSTANCE.getDAGVersion_Id();

		/**
		 * The meta object literal for the '<em><b>Int ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAG_VERSION__INT_ID = eINSTANCE.getDAGVersion_IntID();

	}

} //TimingPackage
