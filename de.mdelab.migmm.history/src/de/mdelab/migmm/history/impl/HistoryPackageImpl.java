/**
 */
package de.mdelab.migmm.history.impl;

import de.mdelab.migmm.history.AttributeWithHistory;
import de.mdelab.migmm.history.ContainmentEdgeWithHistory;
import de.mdelab.migmm.history.EdgeWithHistory;
import de.mdelab.migmm.history.ElementWithHistory;
import de.mdelab.migmm.history.GenericCompleteInterval;
import de.mdelab.migmm.history.History;
import de.mdelab.migmm.history.HistoryFactory;
import de.mdelab.migmm.history.HistoryPackage;
import de.mdelab.migmm.history.Interval;
import de.mdelab.migmm.history.NodeWithHistory;
import de.mdelab.migmm.history.TimingUnit;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HistoryPackageImpl extends EPackageImpl implements HistoryPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timingUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementWithHistoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericCompleteIntervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edgeWithHistoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containmentEdgeWithHistoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeWithHistoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeWithHistoryEClass = null;

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
	 * @see de.mdelab.migmm.history.HistoryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HistoryPackageImpl() {
		super(eNS_URI, HistoryFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link HistoryPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HistoryPackage init() {
		if (isInited) return (HistoryPackage)EPackage.Registry.INSTANCE.getEPackage(HistoryPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredHistoryPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		HistoryPackageImpl theHistoryPackage = registeredHistoryPackage instanceof HistoryPackageImpl ? (HistoryPackageImpl)registeredHistoryPackage : new HistoryPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theHistoryPackage.createPackageContents();

		// Initialize created meta-data
		theHistoryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHistoryPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HistoryPackage.eNS_URI, theHistoryPackage);
		return theHistoryPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHistory() {
		return historyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHistory_OwnedElements() {
		return (EReference)historyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHistory_OwnedIntervals() {
		return (EReference)historyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHistory_OwnedTimingUnits() {
		return (EReference)historyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInterval() {
		return intervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterval__Intersect__Interval() {
		return intervalEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterval__Minus__Interval() {
		return intervalEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterval__Union__Interval() {
		return intervalEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterval__Complement() {
		return intervalEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterval__Contains__TimingUnit() {
		return intervalEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterval__IsEmpty() {
		return intervalEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterval__GetPresentTiming() {
		return intervalEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterval__GetDeletedTiming() {
		return intervalEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInterval__GetAbsentTiming() {
		return intervalEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimingUnit() {
		return timingUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElementWithHistory() {
		return elementWithHistoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementWithHistory_ValidIn() {
		return (EReference)elementWithHistoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementWithHistory_Unhandled() {
		return (EReference)elementWithHistoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElementWithHistory_InProjection() {
		return (EAttribute)elementWithHistoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGenericCompleteInterval() {
		return genericCompleteIntervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEdgeWithHistory() {
		return edgeWithHistoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEdgeWithHistory_EdgeSource() {
		return (EReference)edgeWithHistoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEdgeWithHistory_EdgeTarget() {
		return (EReference)edgeWithHistoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEdgeWithHistory_IsContainment() {
		return (EAttribute)edgeWithHistoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainmentEdgeWithHistory() {
		return containmentEdgeWithHistoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttributeWithHistory() {
		return attributeWithHistoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttributeWithHistory_ContainingNode() {
		return (EReference)attributeWithHistoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttributeWithHistory_AttributeValue() {
		return (EAttribute)attributeWithHistoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNodeWithHistory() {
		return nodeWithHistoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNodeWithHistory_InEdges() {
		return (EReference)nodeWithHistoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNodeWithHistory_OutEdges() {
		return (EReference)nodeWithHistoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNodeWithHistory_NodeAttributes() {
		return (EReference)nodeWithHistoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoryFactory getHistoryFactory() {
		return (HistoryFactory)getEFactoryInstance();
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
		historyEClass = createEClass(HISTORY);
		createEReference(historyEClass, HISTORY__OWNED_ELEMENTS);
		createEReference(historyEClass, HISTORY__OWNED_INTERVALS);
		createEReference(historyEClass, HISTORY__OWNED_TIMING_UNITS);

		intervalEClass = createEClass(INTERVAL);
		createEOperation(intervalEClass, INTERVAL___INTERSECT__INTERVAL);
		createEOperation(intervalEClass, INTERVAL___MINUS__INTERVAL);
		createEOperation(intervalEClass, INTERVAL___UNION__INTERVAL);
		createEOperation(intervalEClass, INTERVAL___COMPLEMENT);
		createEOperation(intervalEClass, INTERVAL___CONTAINS__TIMINGUNIT);
		createEOperation(intervalEClass, INTERVAL___IS_EMPTY);
		createEOperation(intervalEClass, INTERVAL___GET_PRESENT_TIMING);
		createEOperation(intervalEClass, INTERVAL___GET_DELETED_TIMING);
		createEOperation(intervalEClass, INTERVAL___GET_ABSENT_TIMING);

		timingUnitEClass = createEClass(TIMING_UNIT);

		elementWithHistoryEClass = createEClass(ELEMENT_WITH_HISTORY);
		createEReference(elementWithHistoryEClass, ELEMENT_WITH_HISTORY__VALID_IN);
		createEReference(elementWithHistoryEClass, ELEMENT_WITH_HISTORY__UNHANDLED);
		createEAttribute(elementWithHistoryEClass, ELEMENT_WITH_HISTORY__IN_PROJECTION);

		genericCompleteIntervalEClass = createEClass(GENERIC_COMPLETE_INTERVAL);

		edgeWithHistoryEClass = createEClass(EDGE_WITH_HISTORY);
		createEReference(edgeWithHistoryEClass, EDGE_WITH_HISTORY__EDGE_SOURCE);
		createEReference(edgeWithHistoryEClass, EDGE_WITH_HISTORY__EDGE_TARGET);
		createEAttribute(edgeWithHistoryEClass, EDGE_WITH_HISTORY__IS_CONTAINMENT);

		containmentEdgeWithHistoryEClass = createEClass(CONTAINMENT_EDGE_WITH_HISTORY);

		attributeWithHistoryEClass = createEClass(ATTRIBUTE_WITH_HISTORY);
		createEReference(attributeWithHistoryEClass, ATTRIBUTE_WITH_HISTORY__CONTAINING_NODE);
		createEAttribute(attributeWithHistoryEClass, ATTRIBUTE_WITH_HISTORY__ATTRIBUTE_VALUE);

		nodeWithHistoryEClass = createEClass(NODE_WITH_HISTORY);
		createEReference(nodeWithHistoryEClass, NODE_WITH_HISTORY__IN_EDGES);
		createEReference(nodeWithHistoryEClass, NODE_WITH_HISTORY__OUT_EDGES);
		createEReference(nodeWithHistoryEClass, NODE_WITH_HISTORY__NODE_ATTRIBUTES);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		historyEClass.getESuperTypes().add(this.getElementWithHistory());
		genericCompleteIntervalEClass.getESuperTypes().add(this.getInterval());
		edgeWithHistoryEClass.getESuperTypes().add(this.getElementWithHistory());
		containmentEdgeWithHistoryEClass.getESuperTypes().add(this.getEdgeWithHistory());
		attributeWithHistoryEClass.getESuperTypes().add(this.getElementWithHistory());
		nodeWithHistoryEClass.getESuperTypes().add(this.getElementWithHistory());

		// Initialize classes, features, and operations; add parameters
		initEClass(historyEClass, History.class, "History", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHistory_OwnedElements(), this.getElementWithHistory(), null, "ownedElements", null, 0, -1, History.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHistory_OwnedIntervals(), this.getInterval(), null, "ownedIntervals", null, 0, -1, History.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHistory_OwnedTimingUnits(), this.getTimingUnit(), null, "ownedTimingUnits", null, 0, -1, History.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intervalEClass, Interval.class, "Interval", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getInterval__Intersect__Interval(), this.getInterval(), "intersect", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getInterval(), "i", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getInterval__Minus__Interval(), this.getInterval(), "minus", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getInterval(), "i", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getInterval__Union__Interval(), this.getInterval(), "union", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getInterval(), "i", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getInterval__Complement(), this.getInterval(), "complement", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getInterval__Contains__TimingUnit(), ecorePackage.getEBoolean(), "contains", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTimingUnit(), "t", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getInterval__IsEmpty(), ecorePackage.getEBoolean(), "isEmpty", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getInterval__GetPresentTiming(), null, "getPresentTiming", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEEList());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getInterval__GetDeletedTiming(), null, "getDeletedTiming", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getInterval__GetAbsentTiming(), null, "getAbsentTiming", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(timingUnitEClass, TimingUnit.class, "TimingUnit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(elementWithHistoryEClass, ElementWithHistory.class, "ElementWithHistory", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElementWithHistory_ValidIn(), this.getInterval(), null, "validIn", null, 1, 1, ElementWithHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementWithHistory_Unhandled(), this.getInterval(), null, "unhandled", null, 0, 1, ElementWithHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementWithHistory_InProjection(), ecorePackage.getEBoolean(), "inProjection", "true", 1, 1, ElementWithHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genericCompleteIntervalEClass, GenericCompleteInterval.class, "GenericCompleteInterval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(edgeWithHistoryEClass, EdgeWithHistory.class, "EdgeWithHistory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEdgeWithHistory_EdgeSource(), this.getNodeWithHistory(), this.getNodeWithHistory_OutEdges(), "edgeSource", null, 0, 1, EdgeWithHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdgeWithHistory_EdgeTarget(), this.getNodeWithHistory(), this.getNodeWithHistory_InEdges(), "edgeTarget", null, 0, 1, EdgeWithHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEdgeWithHistory_IsContainment(), ecorePackage.getEBoolean(), "isContainment", "false", 1, 1, EdgeWithHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containmentEdgeWithHistoryEClass, ContainmentEdgeWithHistory.class, "ContainmentEdgeWithHistory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeWithHistoryEClass, AttributeWithHistory.class, "AttributeWithHistory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeWithHistory_ContainingNode(), this.getNodeWithHistory(), this.getNodeWithHistory_NodeAttributes(), "containingNode", null, 0, 1, AttributeWithHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeWithHistory_AttributeValue(), ecorePackage.getEJavaObject(), "attributeValue", null, 0, 1, AttributeWithHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeWithHistoryEClass, NodeWithHistory.class, "NodeWithHistory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNodeWithHistory_InEdges(), this.getEdgeWithHistory(), this.getEdgeWithHistory_EdgeTarget(), "inEdges", null, 0, -1, NodeWithHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeWithHistory_OutEdges(), this.getEdgeWithHistory(), this.getEdgeWithHistory_EdgeSource(), "outEdges", null, 0, -1, NodeWithHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeWithHistory_NodeAttributes(), this.getAttributeWithHistory(), this.getAttributeWithHistory_ContainingNode(), "nodeAttributes", null, 0, -1, NodeWithHistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //HistoryPackageImpl
