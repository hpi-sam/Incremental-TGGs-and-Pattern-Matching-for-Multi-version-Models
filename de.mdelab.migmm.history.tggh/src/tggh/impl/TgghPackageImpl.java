/**
 */
package tggh.impl;

import de.mdelab.migmm.history.HistoryPackage;

import de.mdelab.mlcore.MlcorePackage;

import de.mdelab.mltgg.mote2.Mote2Package;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import tggh.History2History;
import tggh.TGGNodeWithHistory;
import tggh.TgghFactory;
import tggh.TgghPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TgghPackageImpl extends EPackageImpl implements TgghPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass history2HistoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tggNodeWithHistoryEClass = null;

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
	 * @see tggh.TgghPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TgghPackageImpl() {
		super(eNS_URI, TgghFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TgghPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TgghPackage init() {
		if (isInited) return (TgghPackage)EPackage.Registry.INSTANCE.getEPackage(TgghPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTgghPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TgghPackageImpl theTgghPackage = registeredTgghPackage instanceof TgghPackageImpl ? (TgghPackageImpl)registeredTgghPackage : new TgghPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		HistoryPackage.eINSTANCE.eClass();
		MlcorePackage.eINSTANCE.eClass();
		Mote2Package.eINSTANCE.eClass();

		// Create package meta-data objects
		theTgghPackage.createPackageContents();

		// Initialize created meta-data
		theTgghPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTgghPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TgghPackage.eNS_URI, theTgghPackage);
		return theTgghPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHistory2History() {
		return history2HistoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTGGNodeWithHistory() {
		return tggNodeWithHistoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TgghFactory getTgghFactory() {
		return (TgghFactory)getEFactoryInstance();
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
		history2HistoryEClass = createEClass(HISTORY2_HISTORY);

		tggNodeWithHistoryEClass = createEClass(TGG_NODE_WITH_HISTORY);
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
		HistoryPackage theHistoryPackage = (HistoryPackage)EPackage.Registry.INSTANCE.getEPackage(HistoryPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		history2HistoryEClass.getESuperTypes().add(this.getTGGNodeWithHistory());
		tggNodeWithHistoryEClass.getESuperTypes().add(theMote2Package.getTGGNode());
		tggNodeWithHistoryEClass.getESuperTypes().add(theHistoryPackage.getElementWithHistory());

		// Initialize classes, features, and operations; add parameters
		initEClass(history2HistoryEClass, History2History.class, "History2History", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tggNodeWithHistoryEClass, TGGNodeWithHistory.class, "TGGNodeWithHistory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //TgghPackageImpl
