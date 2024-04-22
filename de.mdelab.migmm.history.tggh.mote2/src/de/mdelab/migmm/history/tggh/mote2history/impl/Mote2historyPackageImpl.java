/**
 */
package de.mdelab.migmm.history.tggh.mote2history.impl;

import de.mdelab.migmm.history.tggh.mote2history.Mote2historyFactory;
import de.mdelab.migmm.history.tggh.mote2history.Mote2historyPackage;
import de.mdelab.migmm.history.tggh.mote2history.TGGHEngine;

import de.mdelab.mlcore.MlcorePackage;

import de.mdelab.mltgg.mote2.Mote2Package;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Mote2historyPackageImpl extends EPackageImpl implements Mote2historyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tgghEngineEClass = null;

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
	 * @see de.mdelab.migmm.history.tggh.mote2history.Mote2historyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Mote2historyPackageImpl() {
		super(eNS_URI, Mote2historyFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Mote2historyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Mote2historyPackage init() {
		if (isInited) return (Mote2historyPackage)EPackage.Registry.INSTANCE.getEPackage(Mote2historyPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMote2historyPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Mote2historyPackageImpl theMote2historyPackage = registeredMote2historyPackage instanceof Mote2historyPackageImpl ? (Mote2historyPackageImpl)registeredMote2historyPackage : new Mote2historyPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		MlcorePackage.eINSTANCE.eClass();
		Mote2Package.eINSTANCE.eClass();

		// Create package meta-data objects
		theMote2historyPackage.createPackageContents();

		// Initialize created meta-data
		theMote2historyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMote2historyPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Mote2historyPackage.eNS_URI, theMote2historyPackage);
		return theMote2historyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTGGHEngine() {
		return tgghEngineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTGGHEngine__RegisterCoveringCorrNode__EObject_TGGNode() {
		return tgghEngineEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Mote2historyFactory getMote2historyFactory() {
		return (Mote2historyFactory)getEFactoryInstance();
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
		tgghEngineEClass = createEClass(TGGH_ENGINE);
		createEOperation(tgghEngineEClass, TGGH_ENGINE___REGISTER_COVERING_CORR_NODE__EOBJECT_TGGNODE);
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
		Mote2Package theMote2Package = (Mote2Package)EPackage.Registry.INSTANCE.getEPackage(Mote2Package.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tgghEngineEClass.getESuperTypes().add(theMote2Package.getTGGEngine());

		// Initialize classes, features, and operations; add parameters
		initEClass(tgghEngineEClass, TGGHEngine.class, "TGGHEngine", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getTGGHEngine__RegisterCoveringCorrNode__EObject_TGGNode(), null, "registerCoveringCorrNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "element", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "corrNode", 1, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Mote2historyPackageImpl
