/**
 */
package de.mdelab.migmm.java2class_adapted.impl;

import de.mdelab.migmm.history.HistoryPackage;

import de.mdelab.migmm.java2class_adapted.CorrAssociation_adapted;
import de.mdelab.migmm.java2class_adapted.CorrAxiom_adapted;
import de.mdelab.migmm.java2class_adapted.CorrClass_adapted;
import de.mdelab.migmm.java2class_adapted.CorrPkg_adapted;
import de.mdelab.migmm.java2class_adapted.History2History;
import de.mdelab.migmm.java2class_adapted.Java2class_adaptedFactory;
import de.mdelab.migmm.java2class_adapted.Java2class_adaptedPackage;

import de.mdelab.migmm.java2class_adapted.generated.GeneratedPackage;

import de.mdelab.migmm.java2class_adapted.generated.impl.GeneratedPackageImpl;

import de.mdelab.mlcallactions.MlcallactionsPackage;

import de.mdelab.mlcore.MlcorePackage;

import de.mdelab.mlexpressions.MlexpressionsPackage;

import de.mdelab.mlsdm.MlsdmPackage;

import de.mdelab.mlstorypatterns.MlstorypatternsPackage;

import de.mdelab.mltgg.mote2.Mote2Package;

import de.mdelab.mltgg.mote2.sdm.SdmPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import tggh.TgghPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Java2class_adaptedPackageImpl extends EPackageImpl implements Java2class_adaptedPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass corrAxiom_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass corrPkg_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass corrClass_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass corrAssociation_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass history2HistoryEClass = null;

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
	 * @see de.mdelab.migmm.java2class_adapted.Java2class_adaptedPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Java2class_adaptedPackageImpl() {
		super(eNS_URI, Java2class_adaptedFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Java2class_adaptedPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Java2class_adaptedPackage init() {
		if (isInited)
			return (Java2class_adaptedPackage) EPackage.Registry.INSTANCE
					.getEPackage(Java2class_adaptedPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredJava2class_adaptedPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Java2class_adaptedPackageImpl theJava2class_adaptedPackage = registeredJava2class_adaptedPackage instanceof Java2class_adaptedPackageImpl
				? (Java2class_adaptedPackageImpl) registeredJava2class_adaptedPackage
				: new Java2class_adaptedPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		SdmPackage.eINSTANCE.eClass();
		Mote2Package.eINSTANCE.eClass();
		MlsdmPackage.eINSTANCE.eClass();
		MlcorePackage.eINSTANCE.eClass();
		MlexpressionsPackage.eINSTANCE.eClass();
		MlstorypatternsPackage.eINSTANCE.eClass();
		MlcallactionsPackage.eINSTANCE.eClass();
		TgghPackage.eINSTANCE.eClass();
		HistoryPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GeneratedPackage.eNS_URI);
		GeneratedPackageImpl theGeneratedPackage = (GeneratedPackageImpl) (registeredPackage instanceof GeneratedPackageImpl
				? registeredPackage
				: GeneratedPackage.eINSTANCE);

		// Create package meta-data objects
		theJava2class_adaptedPackage.createPackageContents();
		theGeneratedPackage.createPackageContents();

		// Initialize created meta-data
		theJava2class_adaptedPackage.initializePackageContents();
		theGeneratedPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJava2class_adaptedPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Java2class_adaptedPackage.eNS_URI, theJava2class_adaptedPackage);
		return theJava2class_adaptedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCorrAxiom_adapted() {
		return corrAxiom_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCorrPkg_adapted() {
		return corrPkg_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCorrClass_adapted() {
		return corrClass_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCorrAssociation_adapted() {
		return corrAssociation_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHistory2History() {
		return history2HistoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Java2class_adaptedFactory getJava2class_adaptedFactory() {
		return (Java2class_adaptedFactory) getEFactoryInstance();
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
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		corrAxiom_adaptedEClass = createEClass(CORR_AXIOM_ADAPTED);

		corrPkg_adaptedEClass = createEClass(CORR_PKG_ADAPTED);

		corrClass_adaptedEClass = createEClass(CORR_CLASS_ADAPTED);

		corrAssociation_adaptedEClass = createEClass(CORR_ASSOCIATION_ADAPTED);

		history2HistoryEClass = createEClass(HISTORY2_HISTORY);
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
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		GeneratedPackage theGeneratedPackage = (GeneratedPackage) EPackage.Registry.INSTANCE
				.getEPackage(GeneratedPackage.eNS_URI);
		TgghPackage theTgghPackage = (TgghPackage) EPackage.Registry.INSTANCE.getEPackage(TgghPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theGeneratedPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		corrAxiom_adaptedEClass.getESuperTypes().add(theTgghPackage.getTGGNodeWithHistory());
		corrPkg_adaptedEClass.getESuperTypes().add(theTgghPackage.getTGGNodeWithHistory());
		corrClass_adaptedEClass.getESuperTypes().add(theTgghPackage.getTGGNodeWithHistory());
		corrAssociation_adaptedEClass.getESuperTypes().add(theTgghPackage.getTGGNodeWithHistory());
		history2HistoryEClass.getESuperTypes().add(theTgghPackage.getTGGNodeWithHistory());

		// Initialize classes, features, and operations; add parameters
		initEClass(corrAxiom_adaptedEClass, CorrAxiom_adapted.class, "CorrAxiom_adapted", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(corrPkg_adaptedEClass, CorrPkg_adapted.class, "CorrPkg_adapted", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(corrClass_adaptedEClass, CorrClass_adapted.class, "CorrClass_adapted", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(corrAssociation_adaptedEClass, CorrAssociation_adapted.class, "CorrAssociation_adapted",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(history2HistoryEClass, History2History.class, "History2History", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //Java2class_adaptedPackageImpl
