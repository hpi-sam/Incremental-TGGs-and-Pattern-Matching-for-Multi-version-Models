/**
 */
package de.mdelab.mltgg.java2class.java2class.impl;

import de.mdelab.mlcallactions.MlcallactionsPackage;

import de.mdelab.mlcore.MlcorePackage;

import de.mdelab.mlexpressions.MlexpressionsPackage;

import de.mdelab.mlsdm.MlsdmPackage;

import de.mdelab.mlstorypatterns.MlstorypatternsPackage;

import de.mdelab.mltgg.java2class.java2class.CorrAssociation;
import de.mdelab.mltgg.java2class.java2class.CorrAxiom;
import de.mdelab.mltgg.java2class.java2class.CorrClass;
import de.mdelab.mltgg.java2class.java2class.CorrPkg;
import de.mdelab.mltgg.java2class.java2class.Java2classFactory;
import de.mdelab.mltgg.java2class.java2class.Java2classPackage;

import de.mdelab.mltgg.java2class.java2class.generated.GeneratedPackage;

import de.mdelab.mltgg.java2class.java2class.generated.impl.GeneratedPackageImpl;

import de.mdelab.mltgg.mote2.Mote2Package;

import de.mdelab.mltgg.mote2.sdm.SdmPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Java2classPackageImpl extends EPackageImpl implements Java2classPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass corrAxiomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass corrPkgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass corrClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass corrAssociationEClass = null;

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
	 * @see de.mdelab.mltgg.java2class.java2class.Java2classPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Java2classPackageImpl() {
		super(eNS_URI, Java2classFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Java2classPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Java2classPackage init() {
		if (isInited)
			return (Java2classPackage) EPackage.Registry.INSTANCE.getEPackage(Java2classPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredJava2classPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Java2classPackageImpl theJava2classPackage = registeredJava2classPackage instanceof Java2classPackageImpl
				? (Java2classPackageImpl) registeredJava2classPackage
				: new Java2classPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		Mote2Package.eINSTANCE.eClass();
		MlcorePackage.eINSTANCE.eClass();
		SdmPackage.eINSTANCE.eClass();
		MlsdmPackage.eINSTANCE.eClass();
		MlexpressionsPackage.eINSTANCE.eClass();
		MlstorypatternsPackage.eINSTANCE.eClass();
		MlcallactionsPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GeneratedPackage.eNS_URI);
		GeneratedPackageImpl theGeneratedPackage = (GeneratedPackageImpl) (registeredPackage instanceof GeneratedPackageImpl
				? registeredPackage
				: GeneratedPackage.eINSTANCE);

		// Create package meta-data objects
		theJava2classPackage.createPackageContents();
		theGeneratedPackage.createPackageContents();

		// Initialize created meta-data
		theJava2classPackage.initializePackageContents();
		theGeneratedPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJava2classPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Java2classPackage.eNS_URI, theJava2classPackage);
		return theJava2classPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCorrAxiom() {
		return corrAxiomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCorrPkg() {
		return corrPkgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCorrClass() {
		return corrClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCorrAssociation() {
		return corrAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Java2classFactory getJava2classFactory() {
		return (Java2classFactory) getEFactoryInstance();
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
		corrAxiomEClass = createEClass(CORR_AXIOM);

		corrPkgEClass = createEClass(CORR_PKG);

		corrClassEClass = createEClass(CORR_CLASS);

		corrAssociationEClass = createEClass(CORR_ASSOCIATION);
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
		Mote2Package theMote2Package = (Mote2Package) EPackage.Registry.INSTANCE.getEPackage(Mote2Package.eNS_URI);

		// Add subpackages
		getESubpackages().add(theGeneratedPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		corrAxiomEClass.getESuperTypes().add(theMote2Package.getTGGNode());
		corrPkgEClass.getESuperTypes().add(theMote2Package.getTGGNode());
		corrClassEClass.getESuperTypes().add(theMote2Package.getTGGNode());
		corrAssociationEClass.getESuperTypes().add(theMote2Package.getTGGNode());

		// Initialize classes, features, and operations; add parameters
		initEClass(corrAxiomEClass, CorrAxiom.class, "CorrAxiom", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(corrPkgEClass, CorrPkg.class, "CorrPkg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(corrClassEClass, CorrClass.class, "CorrClass", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(corrAssociationEClass, CorrAssociation.class, "CorrAssociation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //Java2classPackageImpl
