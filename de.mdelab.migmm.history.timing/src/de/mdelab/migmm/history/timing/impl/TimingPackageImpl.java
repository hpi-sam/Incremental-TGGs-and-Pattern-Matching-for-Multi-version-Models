/**
 */
package de.mdelab.migmm.history.timing.impl;

import de.mdelab.migmm.history.HistoryPackage;

import de.mdelab.migmm.history.timing.DAGInterval;
import de.mdelab.migmm.history.timing.DAGVersion;
import de.mdelab.migmm.history.timing.LTBaseInterval;
import de.mdelab.migmm.history.timing.LTCompositeInterval;
import de.mdelab.migmm.history.timing.LTTimingUnit;
import de.mdelab.migmm.history.timing.TimingFactory;
import de.mdelab.migmm.history.timing.TimingPackage;

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
public class TimingPackageImpl extends EPackageImpl implements TimingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ltBaseIntervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ltTimingUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ltCompositeIntervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dagIntervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dagVersionEClass = null;

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
	 * @see de.mdelab.migmm.history.timing.TimingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TimingPackageImpl() {
		super(eNS_URI, TimingFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TimingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TimingPackage init() {
		if (isInited) return (TimingPackage)EPackage.Registry.INSTANCE.getEPackage(TimingPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTimingPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TimingPackageImpl theTimingPackage = registeredTimingPackage instanceof TimingPackageImpl ? (TimingPackageImpl)registeredTimingPackage : new TimingPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		HistoryPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTimingPackage.createPackageContents();

		// Initialize created meta-data
		theTimingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTimingPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TimingPackage.eNS_URI, theTimingPackage);
		return theTimingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLTBaseInterval() {
		return ltBaseIntervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLTBaseInterval_Cts() {
		return (EAttribute)ltBaseIntervalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLTBaseInterval_Dts() {
		return (EAttribute)ltBaseIntervalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLTTimingUnit() {
		return ltTimingUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLTTimingUnit_Time() {
		return (EAttribute)ltTimingUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLTCompositeInterval() {
		return ltCompositeIntervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLTCompositeInterval_BaseIntervals() {
		return (EReference)ltCompositeIntervalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDAGInterval() {
		return dagIntervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDAGInterval_Cts() {
		return (EReference)dagIntervalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDAGInterval_Dts() {
		return (EReference)dagIntervalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDAGInterval_Recreating() {
		return (EAttribute)dagIntervalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDAGVersion() {
		return dagVersionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDAGVersion_Successors() {
		return (EReference)dagVersionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDAGVersion_Predecessors() {
		return (EReference)dagVersionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDAGVersion_Id() {
		return (EAttribute)dagVersionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDAGVersion_IntID() {
		return (EAttribute)dagVersionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimingFactory getTimingFactory() {
		return (TimingFactory)getEFactoryInstance();
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
		ltBaseIntervalEClass = createEClass(LT_BASE_INTERVAL);
		createEAttribute(ltBaseIntervalEClass, LT_BASE_INTERVAL__CTS);
		createEAttribute(ltBaseIntervalEClass, LT_BASE_INTERVAL__DTS);

		ltTimingUnitEClass = createEClass(LT_TIMING_UNIT);
		createEAttribute(ltTimingUnitEClass, LT_TIMING_UNIT__TIME);

		ltCompositeIntervalEClass = createEClass(LT_COMPOSITE_INTERVAL);
		createEReference(ltCompositeIntervalEClass, LT_COMPOSITE_INTERVAL__BASE_INTERVALS);

		dagIntervalEClass = createEClass(DAG_INTERVAL);
		createEReference(dagIntervalEClass, DAG_INTERVAL__CTS);
		createEReference(dagIntervalEClass, DAG_INTERVAL__DTS);
		createEAttribute(dagIntervalEClass, DAG_INTERVAL__RECREATING);

		dagVersionEClass = createEClass(DAG_VERSION);
		createEReference(dagVersionEClass, DAG_VERSION__SUCCESSORS);
		createEReference(dagVersionEClass, DAG_VERSION__PREDECESSORS);
		createEAttribute(dagVersionEClass, DAG_VERSION__ID);
		createEAttribute(dagVersionEClass, DAG_VERSION__INT_ID);
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
		ltBaseIntervalEClass.getESuperTypes().add(theHistoryPackage.getInterval());
		ltTimingUnitEClass.getESuperTypes().add(theHistoryPackage.getTimingUnit());
		ltCompositeIntervalEClass.getESuperTypes().add(theHistoryPackage.getInterval());
		dagIntervalEClass.getESuperTypes().add(theHistoryPackage.getInterval());
		dagVersionEClass.getESuperTypes().add(theHistoryPackage.getTimingUnit());

		// Initialize classes, features, and operations; add parameters
		initEClass(ltBaseIntervalEClass, LTBaseInterval.class, "LTBaseInterval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLTBaseInterval_Cts(), ecorePackage.getEInt(), "cts", null, 1, 1, LTBaseInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLTBaseInterval_Dts(), ecorePackage.getEInt(), "dts", "2147483647", 1, 1, LTBaseInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ltTimingUnitEClass, LTTimingUnit.class, "LTTimingUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLTTimingUnit_Time(), ecorePackage.getEInt(), "time", null, 1, 1, LTTimingUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ltCompositeIntervalEClass, LTCompositeInterval.class, "LTCompositeInterval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLTCompositeInterval_BaseIntervals(), this.getLTBaseInterval(), null, "baseIntervals", null, 0, -1, LTCompositeInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dagIntervalEClass, DAGInterval.class, "DAGInterval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDAGInterval_Cts(), this.getDAGVersion(), null, "cts", null, 0, -1, DAGInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDAGInterval_Dts(), this.getDAGVersion(), null, "dts", null, 0, -1, DAGInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDAGInterval_Recreating(), ecorePackage.getEBoolean(), "recreating", "true", 0, 1, DAGInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dagVersionEClass, DAGVersion.class, "DAGVersion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDAGVersion_Successors(), this.getDAGVersion(), this.getDAGVersion_Predecessors(), "successors", null, 0, -1, DAGVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDAGVersion_Predecessors(), this.getDAGVersion(), this.getDAGVersion_Successors(), "predecessors", null, 0, -1, DAGVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDAGVersion_Id(), ecorePackage.getEString(), "id", null, 0, 1, DAGVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDAGVersion_IntID(), ecorePackage.getEInt(), "intID", null, 0, 1, DAGVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //TimingPackageImpl
