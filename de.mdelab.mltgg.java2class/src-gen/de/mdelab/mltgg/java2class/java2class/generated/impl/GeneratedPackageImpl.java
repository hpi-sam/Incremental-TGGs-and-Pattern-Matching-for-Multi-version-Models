/**
 */
package de.mdelab.mltgg.java2class.java2class.generated.impl;

import de.mdelab.mlcallactions.MlcallactionsPackage;

import de.mdelab.mlcore.MlcorePackage;

import de.mdelab.mlexpressions.MlexpressionsPackage;

import de.mdelab.mlsdm.MlsdmPackage;

import de.mdelab.mlstorypatterns.MlstorypatternsPackage;

import de.mdelab.mltgg.java2class.java2class.Java2classPackage;

import de.mdelab.mltgg.java2class.java2class.generated.GeneratedFactory;
import de.mdelab.mltgg.java2class.java2class.generated.GeneratedPackage;
import de.mdelab.mltgg.java2class.java2class.generated.java2classAxiom;
import de.mdelab.mltgg.java2class.java2class.generated.java2classAxiom_axiom;
import de.mdelab.mltgg.java2class.java2class.generated.java2classChildPkg;
import de.mdelab.mltgg.java2class.java2class.generated.java2classChildPkg_childPkg;
import de.mdelab.mltgg.java2class.java2class.generated.java2classClassDeclaration2Class;
import de.mdelab.mltgg.java2class.java2class.generated.java2classClassDeclaration2Class_java2classClassDeclaration2Class;
import de.mdelab.mltgg.java2class.java2class.generated.java2classField2Association;
import de.mdelab.mltgg.java2class.java2class.generated.java2classField2Association_java2classField2Association;
import de.mdelab.mltgg.java2class.java2class.generated.java2classOperationalTGG;
import de.mdelab.mltgg.java2class.java2class.generated.java2classPkg;
import de.mdelab.mltgg.java2class.java2class.generated.java2classPkg_pkg;

import de.mdelab.mltgg.java2class.java2class.impl.Java2classPackageImpl;

import de.mdelab.mltgg.mote2.Mote2Package;

import de.mdelab.mltgg.mote2.helpers.HelpersPackage;

import de.mdelab.mltgg.mote2.operationalTGG.OperationalTGGPackage;

import de.mdelab.mltgg.mote2.sdm.SdmPackage;

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
public class GeneratedPackageImpl extends EPackageImpl implements GeneratedPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass java2classOperationalTGGEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass java2classAxiomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass java2classPkgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass java2classClassDeclaration2ClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass java2classChildPkgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass java2classField2AssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass java2classAxiom_axiomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass java2classPkg_pkgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass java2classClassDeclaration2Class_java2classClassDeclaration2ClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass java2classField2Association_java2classField2AssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass java2classChildPkg_childPkgEClass = null;

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
	 * @see de.mdelab.mltgg.java2class.java2class.generated.GeneratedPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GeneratedPackageImpl() {
		super(eNS_URI, GeneratedFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GeneratedPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GeneratedPackage init() {
		if (isInited)
			return (GeneratedPackage) EPackage.Registry.INSTANCE.getEPackage(GeneratedPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGeneratedPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GeneratedPackageImpl theGeneratedPackage = registeredGeneratedPackage instanceof GeneratedPackageImpl
				? (GeneratedPackageImpl) registeredGeneratedPackage
				: new GeneratedPackageImpl();

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
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Java2classPackage.eNS_URI);
		Java2classPackageImpl theJava2classPackage = (Java2classPackageImpl) (registeredPackage instanceof Java2classPackageImpl
				? registeredPackage
				: Java2classPackage.eINSTANCE);

		// Create package meta-data objects
		theGeneratedPackage.createPackageContents();
		theJava2classPackage.createPackageContents();

		// Initialize created meta-data
		theGeneratedPackage.initializePackageContents();
		theJava2classPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGeneratedPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GeneratedPackage.eNS_URI, theGeneratedPackage);
		return theGeneratedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getjava2classOperationalTGG() {
		return java2classOperationalTGGEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getjava2classAxiom() {
		return java2classAxiomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getjava2classPkg() {
		return java2classPkgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getjava2classClassDeclaration2Class() {
		return java2classClassDeclaration2ClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getjava2classChildPkg() {
		return java2classChildPkgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getjava2classField2Association() {
		return java2classField2AssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getjava2classAxiom_axiom() {
		return java2classAxiom_axiomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classAxiom_axiom_AddElementActivity() {
		return (EReference) java2classAxiom_axiomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classAxiom_axiom_MoveElementActivity() {
		return (EReference) java2classAxiom_axiomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classAxiom_axiom_ChangeAttributeActivity() {
		return (EReference) java2classAxiom_axiomEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classAxiom_axiom_TransformForwardActivity() {
		return (EReference) java2classAxiom_axiomEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classAxiom_axiom_TransformMappingActivity() {
		return (EReference) java2classAxiom_axiomEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classAxiom_axiom_TransformBackwardActivity() {
		return (EReference) java2classAxiom_axiomEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classAxiom_axiom_SynchronizeForwardActivity() {
		return (EReference) java2classAxiom_axiomEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classAxiom_axiom_SynchronizeBackwardActivity() {
		return (EReference) java2classAxiom_axiomEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classAxiom_axiom__AddElement__EMap_EList_EList() {
		return java2classAxiom_axiomEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classAxiom_axiom__ChangeAttributeValues__TGGNode_EMap() {
		return java2classAxiom_axiomEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classAxiom_axiom__TransformForward__EList_EList_boolean() {
		return java2classAxiom_axiomEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classAxiom_axiom__TransformMapping__EList_EList_boolean() {
		return java2classAxiom_axiomEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classAxiom_axiom__TransformBackward__EList_EList_boolean() {
		return java2classAxiom_axiomEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classAxiom_axiom__SynchronizeForward__EList_EList_TGGNode_boolean() {
		return java2classAxiom_axiomEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classAxiom_axiom__SynchronizeBackward__EList_EList_TGGNode_boolean() {
		return java2classAxiom_axiomEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getjava2classPkg_pkg() {
		return java2classPkg_pkgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classPkg_pkg_AddElementActivity() {
		return (EReference) java2classPkg_pkgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classPkg_pkg_MoveElementActivity() {
		return (EReference) java2classPkg_pkgEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classPkg_pkg_ChangeAttributeActivity() {
		return (EReference) java2classPkg_pkgEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classPkg_pkg_TransformForwardActivity() {
		return (EReference) java2classPkg_pkgEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classPkg_pkg_TransformMappingActivity() {
		return (EReference) java2classPkg_pkgEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classPkg_pkg_TransformBackwardActivity() {
		return (EReference) java2classPkg_pkgEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classPkg_pkg_ConflictCheckForwardActivity() {
		return (EReference) java2classPkg_pkgEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classPkg_pkg_ConflictCheckMappingActivity() {
		return (EReference) java2classPkg_pkgEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classPkg_pkg_ConflictCheckBackwardActivity() {
		return (EReference) java2classPkg_pkgEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classPkg_pkg_SynchronizeForwardActivity() {
		return (EReference) java2classPkg_pkgEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classPkg_pkg_SynchronizeBackwardActivity() {
		return (EReference) java2classPkg_pkgEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classPkg_pkg_RepairForwardActivity() {
		return (EReference) java2classPkg_pkgEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classPkg_pkg_RepairBackwardActivity() {
		return (EReference) java2classPkg_pkgEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classPkg_pkg__AddElement__EMap() {
		return java2classPkg_pkgEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classPkg_pkg__ChangeAttributeValues__TGGNode_EMap() {
		return java2classPkg_pkgEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classPkg_pkg__MoveElement__TGGNode_TGGNode_TGGNode() {
		return java2classPkg_pkgEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classPkg_pkg__TransformForward__TGGNode_boolean_boolean() {
		return java2classPkg_pkgEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classPkg_pkg__TransformMapping__TGGNode_boolean_boolean() {
		return java2classPkg_pkgEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classPkg_pkg__TransformBackward__TGGNode_boolean_boolean() {
		return java2classPkg_pkgEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classPkg_pkg__ConflictCheckForward__TGGNode() {
		return java2classPkg_pkgEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classPkg_pkg__ConflictCheckMapping__TGGNode() {
		return java2classPkg_pkgEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classPkg_pkg__ConflictCheckBackward__TGGNode() {
		return java2classPkg_pkgEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classPkg_pkg__SynchronizeForward__TGGNode_boolean() {
		return java2classPkg_pkgEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classPkg_pkg__SynchronizeBackward__TGGNode_boolean() {
		return java2classPkg_pkgEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classPkg_pkg__RepairForward__TGGNode_boolean() {
		return java2classPkg_pkgEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classPkg_pkg__RepairBackward__TGGNode_boolean() {
		return java2classPkg_pkgEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getjava2classClassDeclaration2Class_java2classClassDeclaration2Class() {
		return java2classClassDeclaration2Class_java2classClassDeclaration2ClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classClassDeclaration2Class_java2classClassDeclaration2Class_AddElementActivity() {
		return (EReference) java2classClassDeclaration2Class_java2classClassDeclaration2ClassEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classClassDeclaration2Class_java2classClassDeclaration2Class_MoveElementActivity() {
		return (EReference) java2classClassDeclaration2Class_java2classClassDeclaration2ClassEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classClassDeclaration2Class_java2classClassDeclaration2Class_ChangeAttributeActivity() {
		return (EReference) java2classClassDeclaration2Class_java2classClassDeclaration2ClassEClass
				.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classClassDeclaration2Class_java2classClassDeclaration2Class_TransformForwardActivity() {
		return (EReference) java2classClassDeclaration2Class_java2classClassDeclaration2ClassEClass
				.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classClassDeclaration2Class_java2classClassDeclaration2Class_TransformMappingActivity() {
		return (EReference) java2classClassDeclaration2Class_java2classClassDeclaration2ClassEClass
				.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classClassDeclaration2Class_java2classClassDeclaration2Class_TransformBackwardActivity() {
		return (EReference) java2classClassDeclaration2Class_java2classClassDeclaration2ClassEClass
				.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classClassDeclaration2Class_java2classClassDeclaration2Class_ConflictCheckForwardActivity() {
		return (EReference) java2classClassDeclaration2Class_java2classClassDeclaration2ClassEClass
				.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classClassDeclaration2Class_java2classClassDeclaration2Class_ConflictCheckMappingActivity() {
		return (EReference) java2classClassDeclaration2Class_java2classClassDeclaration2ClassEClass
				.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classClassDeclaration2Class_java2classClassDeclaration2Class_ConflictCheckBackwardActivity() {
		return (EReference) java2classClassDeclaration2Class_java2classClassDeclaration2ClassEClass
				.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classClassDeclaration2Class_java2classClassDeclaration2Class_SynchronizeForwardActivity() {
		return (EReference) java2classClassDeclaration2Class_java2classClassDeclaration2ClassEClass
				.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classClassDeclaration2Class_java2classClassDeclaration2Class_SynchronizeBackwardActivity() {
		return (EReference) java2classClassDeclaration2Class_java2classClassDeclaration2ClassEClass
				.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classClassDeclaration2Class_java2classClassDeclaration2Class_RepairForwardActivity() {
		return (EReference) java2classClassDeclaration2Class_java2classClassDeclaration2ClassEClass
				.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classClassDeclaration2Class_java2classClassDeclaration2Class_RepairBackwardActivity() {
		return (EReference) java2classClassDeclaration2Class_java2classClassDeclaration2ClassEClass
				.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classClassDeclaration2Class_java2classClassDeclaration2Class__AddElement__EMap() {
		return java2classClassDeclaration2Class_java2classClassDeclaration2ClassEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classClassDeclaration2Class_java2classClassDeclaration2Class__ChangeAttributeValues__TGGNode_EMap() {
		return java2classClassDeclaration2Class_java2classClassDeclaration2ClassEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classClassDeclaration2Class_java2classClassDeclaration2Class__MoveElement__TGGNode_TGGNode_TGGNode() {
		return java2classClassDeclaration2Class_java2classClassDeclaration2ClassEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classClassDeclaration2Class_java2classClassDeclaration2Class__TransformForward__TGGNode_boolean_boolean() {
		return java2classClassDeclaration2Class_java2classClassDeclaration2ClassEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classClassDeclaration2Class_java2classClassDeclaration2Class__TransformMapping__TGGNode_boolean_boolean() {
		return java2classClassDeclaration2Class_java2classClassDeclaration2ClassEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classClassDeclaration2Class_java2classClassDeclaration2Class__TransformBackward__TGGNode_boolean_boolean() {
		return java2classClassDeclaration2Class_java2classClassDeclaration2ClassEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classClassDeclaration2Class_java2classClassDeclaration2Class__ConflictCheckForward__TGGNode() {
		return java2classClassDeclaration2Class_java2classClassDeclaration2ClassEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classClassDeclaration2Class_java2classClassDeclaration2Class__ConflictCheckMapping__TGGNode() {
		return java2classClassDeclaration2Class_java2classClassDeclaration2ClassEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classClassDeclaration2Class_java2classClassDeclaration2Class__ConflictCheckBackward__TGGNode() {
		return java2classClassDeclaration2Class_java2classClassDeclaration2ClassEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classClassDeclaration2Class_java2classClassDeclaration2Class__SynchronizeForward__TGGNode_boolean() {
		return java2classClassDeclaration2Class_java2classClassDeclaration2ClassEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classClassDeclaration2Class_java2classClassDeclaration2Class__SynchronizeBackward__TGGNode_boolean() {
		return java2classClassDeclaration2Class_java2classClassDeclaration2ClassEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classClassDeclaration2Class_java2classClassDeclaration2Class__RepairForward__TGGNode_boolean() {
		return java2classClassDeclaration2Class_java2classClassDeclaration2ClassEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classClassDeclaration2Class_java2classClassDeclaration2Class__RepairBackward__TGGNode_boolean() {
		return java2classClassDeclaration2Class_java2classClassDeclaration2ClassEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getjava2classField2Association_java2classField2Association() {
		return java2classField2Association_java2classField2AssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classField2Association_java2classField2Association_AddElementActivity() {
		return (EReference) java2classField2Association_java2classField2AssociationEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classField2Association_java2classField2Association_MoveElementActivity() {
		return (EReference) java2classField2Association_java2classField2AssociationEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classField2Association_java2classField2Association_ChangeAttributeActivity() {
		return (EReference) java2classField2Association_java2classField2AssociationEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classField2Association_java2classField2Association_TransformForwardActivity() {
		return (EReference) java2classField2Association_java2classField2AssociationEClass.getEStructuralFeatures()
				.get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classField2Association_java2classField2Association_TransformMappingActivity() {
		return (EReference) java2classField2Association_java2classField2AssociationEClass.getEStructuralFeatures()
				.get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classField2Association_java2classField2Association_TransformBackwardActivity() {
		return (EReference) java2classField2Association_java2classField2AssociationEClass.getEStructuralFeatures()
				.get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classField2Association_java2classField2Association_ConflictCheckForwardActivity() {
		return (EReference) java2classField2Association_java2classField2AssociationEClass.getEStructuralFeatures()
				.get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classField2Association_java2classField2Association_ConflictCheckMappingActivity() {
		return (EReference) java2classField2Association_java2classField2AssociationEClass.getEStructuralFeatures()
				.get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classField2Association_java2classField2Association_ConflictCheckBackwardActivity() {
		return (EReference) java2classField2Association_java2classField2AssociationEClass.getEStructuralFeatures()
				.get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classField2Association_java2classField2Association_SynchronizeForwardActivity() {
		return (EReference) java2classField2Association_java2classField2AssociationEClass.getEStructuralFeatures()
				.get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classField2Association_java2classField2Association_SynchronizeBackwardActivity() {
		return (EReference) java2classField2Association_java2classField2AssociationEClass.getEStructuralFeatures()
				.get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classField2Association_java2classField2Association_RepairForwardActivity() {
		return (EReference) java2classField2Association_java2classField2AssociationEClass.getEStructuralFeatures()
				.get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classField2Association_java2classField2Association_RepairBackwardActivity() {
		return (EReference) java2classField2Association_java2classField2AssociationEClass.getEStructuralFeatures()
				.get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classField2Association_java2classField2Association__AddElement__EMap() {
		return java2classField2Association_java2classField2AssociationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classField2Association_java2classField2Association__ChangeAttributeValues__TGGNode_EMap() {
		return java2classField2Association_java2classField2AssociationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classField2Association_java2classField2Association__MoveElement__TGGNode_TGGNode_TGGNode() {
		return java2classField2Association_java2classField2AssociationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classField2Association_java2classField2Association__TransformForward__TGGNode_boolean_boolean() {
		return java2classField2Association_java2classField2AssociationEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classField2Association_java2classField2Association__TransformMapping__TGGNode_boolean_boolean() {
		return java2classField2Association_java2classField2AssociationEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classField2Association_java2classField2Association__TransformBackward__TGGNode_boolean_boolean() {
		return java2classField2Association_java2classField2AssociationEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classField2Association_java2classField2Association__ConflictCheckForward__TGGNode() {
		return java2classField2Association_java2classField2AssociationEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classField2Association_java2classField2Association__ConflictCheckMapping__TGGNode() {
		return java2classField2Association_java2classField2AssociationEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classField2Association_java2classField2Association__ConflictCheckBackward__TGGNode() {
		return java2classField2Association_java2classField2AssociationEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classField2Association_java2classField2Association__SynchronizeForward__TGGNode_boolean() {
		return java2classField2Association_java2classField2AssociationEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classField2Association_java2classField2Association__SynchronizeBackward__TGGNode_boolean() {
		return java2classField2Association_java2classField2AssociationEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classField2Association_java2classField2Association__RepairForward__TGGNode_boolean() {
		return java2classField2Association_java2classField2AssociationEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classField2Association_java2classField2Association__RepairBackward__TGGNode_boolean() {
		return java2classField2Association_java2classField2AssociationEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getjava2classChildPkg_childPkg() {
		return java2classChildPkg_childPkgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classChildPkg_childPkg_AddElementActivity() {
		return (EReference) java2classChildPkg_childPkgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classChildPkg_childPkg_MoveElementActivity() {
		return (EReference) java2classChildPkg_childPkgEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classChildPkg_childPkg_ChangeAttributeActivity() {
		return (EReference) java2classChildPkg_childPkgEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classChildPkg_childPkg_TransformForwardActivity() {
		return (EReference) java2classChildPkg_childPkgEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classChildPkg_childPkg_TransformMappingActivity() {
		return (EReference) java2classChildPkg_childPkgEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classChildPkg_childPkg_TransformBackwardActivity() {
		return (EReference) java2classChildPkg_childPkgEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classChildPkg_childPkg_ConflictCheckForwardActivity() {
		return (EReference) java2classChildPkg_childPkgEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classChildPkg_childPkg_ConflictCheckMappingActivity() {
		return (EReference) java2classChildPkg_childPkgEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classChildPkg_childPkg_ConflictCheckBackwardActivity() {
		return (EReference) java2classChildPkg_childPkgEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classChildPkg_childPkg_SynchronizeForwardActivity() {
		return (EReference) java2classChildPkg_childPkgEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classChildPkg_childPkg_SynchronizeBackwardActivity() {
		return (EReference) java2classChildPkg_childPkgEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classChildPkg_childPkg_RepairForwardActivity() {
		return (EReference) java2classChildPkg_childPkgEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classChildPkg_childPkg_RepairBackwardActivity() {
		return (EReference) java2classChildPkg_childPkgEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classChildPkg_childPkg__AddElement__EMap() {
		return java2classChildPkg_childPkgEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classChildPkg_childPkg__ChangeAttributeValues__TGGNode_EMap() {
		return java2classChildPkg_childPkgEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classChildPkg_childPkg__MoveElement__TGGNode_TGGNode_TGGNode() {
		return java2classChildPkg_childPkgEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classChildPkg_childPkg__TransformForward__TGGNode_boolean_boolean() {
		return java2classChildPkg_childPkgEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classChildPkg_childPkg__TransformMapping__TGGNode_boolean_boolean() {
		return java2classChildPkg_childPkgEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classChildPkg_childPkg__TransformBackward__TGGNode_boolean_boolean() {
		return java2classChildPkg_childPkgEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classChildPkg_childPkg__ConflictCheckForward__TGGNode() {
		return java2classChildPkg_childPkgEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classChildPkg_childPkg__ConflictCheckMapping__TGGNode() {
		return java2classChildPkg_childPkgEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classChildPkg_childPkg__ConflictCheckBackward__TGGNode() {
		return java2classChildPkg_childPkgEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classChildPkg_childPkg__SynchronizeForward__TGGNode_boolean() {
		return java2classChildPkg_childPkgEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classChildPkg_childPkg__SynchronizeBackward__TGGNode_boolean() {
		return java2classChildPkg_childPkgEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classChildPkg_childPkg__RepairForward__TGGNode_boolean() {
		return java2classChildPkg_childPkgEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classChildPkg_childPkg__RepairBackward__TGGNode_boolean() {
		return java2classChildPkg_childPkgEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratedFactory getGeneratedFactory() {
		return (GeneratedFactory) getEFactoryInstance();
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
		java2classOperationalTGGEClass = createEClass(JAVA2CLASS_OPERATIONAL_TGG);

		java2classAxiomEClass = createEClass(JAVA2CLASS_AXIOM);

		java2classPkgEClass = createEClass(JAVA2CLASS_PKG);

		java2classClassDeclaration2ClassEClass = createEClass(JAVA2CLASS_CLASS_DECLARATION2_CLASS);

		java2classChildPkgEClass = createEClass(JAVA2CLASS_CHILD_PKG);

		java2classField2AssociationEClass = createEClass(JAVA2CLASS_FIELD2_ASSOCIATION);

		java2classAxiom_axiomEClass = createEClass(JAVA2CLASS_AXIOM_AXIOM);
		createEReference(java2classAxiom_axiomEClass, JAVA2CLASS_AXIOM_AXIOM__ADD_ELEMENT_ACTIVITY);
		createEReference(java2classAxiom_axiomEClass, JAVA2CLASS_AXIOM_AXIOM__MOVE_ELEMENT_ACTIVITY);
		createEReference(java2classAxiom_axiomEClass, JAVA2CLASS_AXIOM_AXIOM__CHANGE_ATTRIBUTE_ACTIVITY);
		createEReference(java2classAxiom_axiomEClass, JAVA2CLASS_AXIOM_AXIOM__TRANSFORM_FORWARD_ACTIVITY);
		createEReference(java2classAxiom_axiomEClass, JAVA2CLASS_AXIOM_AXIOM__TRANSFORM_MAPPING_ACTIVITY);
		createEReference(java2classAxiom_axiomEClass, JAVA2CLASS_AXIOM_AXIOM__TRANSFORM_BACKWARD_ACTIVITY);
		createEReference(java2classAxiom_axiomEClass, JAVA2CLASS_AXIOM_AXIOM__SYNCHRONIZE_FORWARD_ACTIVITY);
		createEReference(java2classAxiom_axiomEClass, JAVA2CLASS_AXIOM_AXIOM__SYNCHRONIZE_BACKWARD_ACTIVITY);
		createEOperation(java2classAxiom_axiomEClass, JAVA2CLASS_AXIOM_AXIOM___ADD_ELEMENT__EMAP_ELIST_ELIST);
		createEOperation(java2classAxiom_axiomEClass, JAVA2CLASS_AXIOM_AXIOM___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP);
		createEOperation(java2classAxiom_axiomEClass, JAVA2CLASS_AXIOM_AXIOM___TRANSFORM_FORWARD__ELIST_ELIST_BOOLEAN);
		createEOperation(java2classAxiom_axiomEClass, JAVA2CLASS_AXIOM_AXIOM___TRANSFORM_MAPPING__ELIST_ELIST_BOOLEAN);
		createEOperation(java2classAxiom_axiomEClass, JAVA2CLASS_AXIOM_AXIOM___TRANSFORM_BACKWARD__ELIST_ELIST_BOOLEAN);
		createEOperation(java2classAxiom_axiomEClass,
				JAVA2CLASS_AXIOM_AXIOM___SYNCHRONIZE_FORWARD__ELIST_ELIST_TGGNODE_BOOLEAN);
		createEOperation(java2classAxiom_axiomEClass,
				JAVA2CLASS_AXIOM_AXIOM___SYNCHRONIZE_BACKWARD__ELIST_ELIST_TGGNODE_BOOLEAN);

		java2classPkg_pkgEClass = createEClass(JAVA2CLASS_PKG_PKG);
		createEReference(java2classPkg_pkgEClass, JAVA2CLASS_PKG_PKG__ADD_ELEMENT_ACTIVITY);
		createEReference(java2classPkg_pkgEClass, JAVA2CLASS_PKG_PKG__MOVE_ELEMENT_ACTIVITY);
		createEReference(java2classPkg_pkgEClass, JAVA2CLASS_PKG_PKG__CHANGE_ATTRIBUTE_ACTIVITY);
		createEReference(java2classPkg_pkgEClass, JAVA2CLASS_PKG_PKG__TRANSFORM_FORWARD_ACTIVITY);
		createEReference(java2classPkg_pkgEClass, JAVA2CLASS_PKG_PKG__TRANSFORM_MAPPING_ACTIVITY);
		createEReference(java2classPkg_pkgEClass, JAVA2CLASS_PKG_PKG__TRANSFORM_BACKWARD_ACTIVITY);
		createEReference(java2classPkg_pkgEClass, JAVA2CLASS_PKG_PKG__CONFLICT_CHECK_FORWARD_ACTIVITY);
		createEReference(java2classPkg_pkgEClass, JAVA2CLASS_PKG_PKG__CONFLICT_CHECK_MAPPING_ACTIVITY);
		createEReference(java2classPkg_pkgEClass, JAVA2CLASS_PKG_PKG__CONFLICT_CHECK_BACKWARD_ACTIVITY);
		createEReference(java2classPkg_pkgEClass, JAVA2CLASS_PKG_PKG__SYNCHRONIZE_FORWARD_ACTIVITY);
		createEReference(java2classPkg_pkgEClass, JAVA2CLASS_PKG_PKG__SYNCHRONIZE_BACKWARD_ACTIVITY);
		createEReference(java2classPkg_pkgEClass, JAVA2CLASS_PKG_PKG__REPAIR_FORWARD_ACTIVITY);
		createEReference(java2classPkg_pkgEClass, JAVA2CLASS_PKG_PKG__REPAIR_BACKWARD_ACTIVITY);
		createEOperation(java2classPkg_pkgEClass, JAVA2CLASS_PKG_PKG___ADD_ELEMENT__EMAP);
		createEOperation(java2classPkg_pkgEClass, JAVA2CLASS_PKG_PKG___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP);
		createEOperation(java2classPkg_pkgEClass, JAVA2CLASS_PKG_PKG___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE);
		createEOperation(java2classPkg_pkgEClass, JAVA2CLASS_PKG_PKG___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN);
		createEOperation(java2classPkg_pkgEClass, JAVA2CLASS_PKG_PKG___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN);
		createEOperation(java2classPkg_pkgEClass, JAVA2CLASS_PKG_PKG___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN);
		createEOperation(java2classPkg_pkgEClass, JAVA2CLASS_PKG_PKG___CONFLICT_CHECK_FORWARD__TGGNODE);
		createEOperation(java2classPkg_pkgEClass, JAVA2CLASS_PKG_PKG___CONFLICT_CHECK_MAPPING__TGGNODE);
		createEOperation(java2classPkg_pkgEClass, JAVA2CLASS_PKG_PKG___CONFLICT_CHECK_BACKWARD__TGGNODE);
		createEOperation(java2classPkg_pkgEClass, JAVA2CLASS_PKG_PKG___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN);
		createEOperation(java2classPkg_pkgEClass, JAVA2CLASS_PKG_PKG___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN);
		createEOperation(java2classPkg_pkgEClass, JAVA2CLASS_PKG_PKG___REPAIR_FORWARD__TGGNODE_BOOLEAN);
		createEOperation(java2classPkg_pkgEClass, JAVA2CLASS_PKG_PKG___REPAIR_BACKWARD__TGGNODE_BOOLEAN);

		java2classClassDeclaration2Class_java2classClassDeclaration2ClassEClass = createEClass(
				JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS);
		createEReference(java2classClassDeclaration2Class_java2classClassDeclaration2ClassEClass,
				JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS__ADD_ELEMENT_ACTIVITY);
		createEReference(java2classClassDeclaration2Class_java2classClassDeclaration2ClassEClass,
				JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS__MOVE_ELEMENT_ACTIVITY);
		createEReference(java2classClassDeclaration2Class_java2classClassDeclaration2ClassEClass,
				JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS__CHANGE_ATTRIBUTE_ACTIVITY);
		createEReference(java2classClassDeclaration2Class_java2classClassDeclaration2ClassEClass,
				JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS__TRANSFORM_FORWARD_ACTIVITY);
		createEReference(java2classClassDeclaration2Class_java2classClassDeclaration2ClassEClass,
				JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS__TRANSFORM_MAPPING_ACTIVITY);
		createEReference(java2classClassDeclaration2Class_java2classClassDeclaration2ClassEClass,
				JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS__TRANSFORM_BACKWARD_ACTIVITY);
		createEReference(java2classClassDeclaration2Class_java2classClassDeclaration2ClassEClass,
				JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS__CONFLICT_CHECK_FORWARD_ACTIVITY);
		createEReference(java2classClassDeclaration2Class_java2classClassDeclaration2ClassEClass,
				JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS__CONFLICT_CHECK_MAPPING_ACTIVITY);
		createEReference(java2classClassDeclaration2Class_java2classClassDeclaration2ClassEClass,
				JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS__CONFLICT_CHECK_BACKWARD_ACTIVITY);
		createEReference(java2classClassDeclaration2Class_java2classClassDeclaration2ClassEClass,
				JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS__SYNCHRONIZE_FORWARD_ACTIVITY);
		createEReference(java2classClassDeclaration2Class_java2classClassDeclaration2ClassEClass,
				JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS__SYNCHRONIZE_BACKWARD_ACTIVITY);
		createEReference(java2classClassDeclaration2Class_java2classClassDeclaration2ClassEClass,
				JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS__REPAIR_FORWARD_ACTIVITY);
		createEReference(java2classClassDeclaration2Class_java2classClassDeclaration2ClassEClass,
				JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS__REPAIR_BACKWARD_ACTIVITY);
		createEOperation(java2classClassDeclaration2Class_java2classClassDeclaration2ClassEClass,
				JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS___ADD_ELEMENT__EMAP);
		createEOperation(java2classClassDeclaration2Class_java2classClassDeclaration2ClassEClass,
				JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP);
		createEOperation(java2classClassDeclaration2Class_java2classClassDeclaration2ClassEClass,
				JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE);
		createEOperation(java2classClassDeclaration2Class_java2classClassDeclaration2ClassEClass,
				JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN);
		createEOperation(java2classClassDeclaration2Class_java2classClassDeclaration2ClassEClass,
				JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN);
		createEOperation(java2classClassDeclaration2Class_java2classClassDeclaration2ClassEClass,
				JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN);
		createEOperation(java2classClassDeclaration2Class_java2classClassDeclaration2ClassEClass,
				JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS___CONFLICT_CHECK_FORWARD__TGGNODE);
		createEOperation(java2classClassDeclaration2Class_java2classClassDeclaration2ClassEClass,
				JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS___CONFLICT_CHECK_MAPPING__TGGNODE);
		createEOperation(java2classClassDeclaration2Class_java2classClassDeclaration2ClassEClass,
				JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS___CONFLICT_CHECK_BACKWARD__TGGNODE);
		createEOperation(java2classClassDeclaration2Class_java2classClassDeclaration2ClassEClass,
				JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN);
		createEOperation(java2classClassDeclaration2Class_java2classClassDeclaration2ClassEClass,
				JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN);
		createEOperation(java2classClassDeclaration2Class_java2classClassDeclaration2ClassEClass,
				JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS___REPAIR_FORWARD__TGGNODE_BOOLEAN);
		createEOperation(java2classClassDeclaration2Class_java2classClassDeclaration2ClassEClass,
				JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS___REPAIR_BACKWARD__TGGNODE_BOOLEAN);

		java2classField2Association_java2classField2AssociationEClass = createEClass(
				JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION);
		createEReference(java2classField2Association_java2classField2AssociationEClass,
				JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION__ADD_ELEMENT_ACTIVITY);
		createEReference(java2classField2Association_java2classField2AssociationEClass,
				JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION__MOVE_ELEMENT_ACTIVITY);
		createEReference(java2classField2Association_java2classField2AssociationEClass,
				JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION__CHANGE_ATTRIBUTE_ACTIVITY);
		createEReference(java2classField2Association_java2classField2AssociationEClass,
				JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION__TRANSFORM_FORWARD_ACTIVITY);
		createEReference(java2classField2Association_java2classField2AssociationEClass,
				JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION__TRANSFORM_MAPPING_ACTIVITY);
		createEReference(java2classField2Association_java2classField2AssociationEClass,
				JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION__TRANSFORM_BACKWARD_ACTIVITY);
		createEReference(java2classField2Association_java2classField2AssociationEClass,
				JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION__CONFLICT_CHECK_FORWARD_ACTIVITY);
		createEReference(java2classField2Association_java2classField2AssociationEClass,
				JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION__CONFLICT_CHECK_MAPPING_ACTIVITY);
		createEReference(java2classField2Association_java2classField2AssociationEClass,
				JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION__CONFLICT_CHECK_BACKWARD_ACTIVITY);
		createEReference(java2classField2Association_java2classField2AssociationEClass,
				JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION__SYNCHRONIZE_FORWARD_ACTIVITY);
		createEReference(java2classField2Association_java2classField2AssociationEClass,
				JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION__SYNCHRONIZE_BACKWARD_ACTIVITY);
		createEReference(java2classField2Association_java2classField2AssociationEClass,
				JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION__REPAIR_FORWARD_ACTIVITY);
		createEReference(java2classField2Association_java2classField2AssociationEClass,
				JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION__REPAIR_BACKWARD_ACTIVITY);
		createEOperation(java2classField2Association_java2classField2AssociationEClass,
				JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION___ADD_ELEMENT__EMAP);
		createEOperation(java2classField2Association_java2classField2AssociationEClass,
				JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP);
		createEOperation(java2classField2Association_java2classField2AssociationEClass,
				JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE);
		createEOperation(java2classField2Association_java2classField2AssociationEClass,
				JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN);
		createEOperation(java2classField2Association_java2classField2AssociationEClass,
				JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN);
		createEOperation(java2classField2Association_java2classField2AssociationEClass,
				JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN);
		createEOperation(java2classField2Association_java2classField2AssociationEClass,
				JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION___CONFLICT_CHECK_FORWARD__TGGNODE);
		createEOperation(java2classField2Association_java2classField2AssociationEClass,
				JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION___CONFLICT_CHECK_MAPPING__TGGNODE);
		createEOperation(java2classField2Association_java2classField2AssociationEClass,
				JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION___CONFLICT_CHECK_BACKWARD__TGGNODE);
		createEOperation(java2classField2Association_java2classField2AssociationEClass,
				JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN);
		createEOperation(java2classField2Association_java2classField2AssociationEClass,
				JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN);
		createEOperation(java2classField2Association_java2classField2AssociationEClass,
				JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION___REPAIR_FORWARD__TGGNODE_BOOLEAN);
		createEOperation(java2classField2Association_java2classField2AssociationEClass,
				JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION___REPAIR_BACKWARD__TGGNODE_BOOLEAN);

		java2classChildPkg_childPkgEClass = createEClass(JAVA2CLASS_CHILD_PKG_CHILD_PKG);
		createEReference(java2classChildPkg_childPkgEClass, JAVA2CLASS_CHILD_PKG_CHILD_PKG__ADD_ELEMENT_ACTIVITY);
		createEReference(java2classChildPkg_childPkgEClass, JAVA2CLASS_CHILD_PKG_CHILD_PKG__MOVE_ELEMENT_ACTIVITY);
		createEReference(java2classChildPkg_childPkgEClass, JAVA2CLASS_CHILD_PKG_CHILD_PKG__CHANGE_ATTRIBUTE_ACTIVITY);
		createEReference(java2classChildPkg_childPkgEClass, JAVA2CLASS_CHILD_PKG_CHILD_PKG__TRANSFORM_FORWARD_ACTIVITY);
		createEReference(java2classChildPkg_childPkgEClass, JAVA2CLASS_CHILD_PKG_CHILD_PKG__TRANSFORM_MAPPING_ACTIVITY);
		createEReference(java2classChildPkg_childPkgEClass,
				JAVA2CLASS_CHILD_PKG_CHILD_PKG__TRANSFORM_BACKWARD_ACTIVITY);
		createEReference(java2classChildPkg_childPkgEClass,
				JAVA2CLASS_CHILD_PKG_CHILD_PKG__CONFLICT_CHECK_FORWARD_ACTIVITY);
		createEReference(java2classChildPkg_childPkgEClass,
				JAVA2CLASS_CHILD_PKG_CHILD_PKG__CONFLICT_CHECK_MAPPING_ACTIVITY);
		createEReference(java2classChildPkg_childPkgEClass,
				JAVA2CLASS_CHILD_PKG_CHILD_PKG__CONFLICT_CHECK_BACKWARD_ACTIVITY);
		createEReference(java2classChildPkg_childPkgEClass,
				JAVA2CLASS_CHILD_PKG_CHILD_PKG__SYNCHRONIZE_FORWARD_ACTIVITY);
		createEReference(java2classChildPkg_childPkgEClass,
				JAVA2CLASS_CHILD_PKG_CHILD_PKG__SYNCHRONIZE_BACKWARD_ACTIVITY);
		createEReference(java2classChildPkg_childPkgEClass, JAVA2CLASS_CHILD_PKG_CHILD_PKG__REPAIR_FORWARD_ACTIVITY);
		createEReference(java2classChildPkg_childPkgEClass, JAVA2CLASS_CHILD_PKG_CHILD_PKG__REPAIR_BACKWARD_ACTIVITY);
		createEOperation(java2classChildPkg_childPkgEClass, JAVA2CLASS_CHILD_PKG_CHILD_PKG___ADD_ELEMENT__EMAP);
		createEOperation(java2classChildPkg_childPkgEClass,
				JAVA2CLASS_CHILD_PKG_CHILD_PKG___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP);
		createEOperation(java2classChildPkg_childPkgEClass,
				JAVA2CLASS_CHILD_PKG_CHILD_PKG___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE);
		createEOperation(java2classChildPkg_childPkgEClass,
				JAVA2CLASS_CHILD_PKG_CHILD_PKG___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN);
		createEOperation(java2classChildPkg_childPkgEClass,
				JAVA2CLASS_CHILD_PKG_CHILD_PKG___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN);
		createEOperation(java2classChildPkg_childPkgEClass,
				JAVA2CLASS_CHILD_PKG_CHILD_PKG___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN);
		createEOperation(java2classChildPkg_childPkgEClass,
				JAVA2CLASS_CHILD_PKG_CHILD_PKG___CONFLICT_CHECK_FORWARD__TGGNODE);
		createEOperation(java2classChildPkg_childPkgEClass,
				JAVA2CLASS_CHILD_PKG_CHILD_PKG___CONFLICT_CHECK_MAPPING__TGGNODE);
		createEOperation(java2classChildPkg_childPkgEClass,
				JAVA2CLASS_CHILD_PKG_CHILD_PKG___CONFLICT_CHECK_BACKWARD__TGGNODE);
		createEOperation(java2classChildPkg_childPkgEClass,
				JAVA2CLASS_CHILD_PKG_CHILD_PKG___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN);
		createEOperation(java2classChildPkg_childPkgEClass,
				JAVA2CLASS_CHILD_PKG_CHILD_PKG___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN);
		createEOperation(java2classChildPkg_childPkgEClass,
				JAVA2CLASS_CHILD_PKG_CHILD_PKG___REPAIR_FORWARD__TGGNODE_BOOLEAN);
		createEOperation(java2classChildPkg_childPkgEClass,
				JAVA2CLASS_CHILD_PKG_CHILD_PKG___REPAIR_BACKWARD__TGGNODE_BOOLEAN);
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
		SdmPackage theSdmPackage = (SdmPackage) EPackage.Registry.INSTANCE.getEPackage(SdmPackage.eNS_URI);
		OperationalTGGPackage theOperationalTGGPackage = (OperationalTGGPackage) EPackage.Registry.INSTANCE
				.getEPackage(OperationalTGGPackage.eNS_URI);
		MlsdmPackage theMlsdmPackage = (MlsdmPackage) EPackage.Registry.INSTANCE.getEPackage(MlsdmPackage.eNS_URI);
		Mote2Package theMote2Package = (Mote2Package) EPackage.Registry.INSTANCE.getEPackage(Mote2Package.eNS_URI);
		HelpersPackage theHelpersPackage = (HelpersPackage) EPackage.Registry.INSTANCE
				.getEPackage(HelpersPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		java2classOperationalTGGEClass.getESuperTypes().add(theSdmPackage.getSdmOperationalTGG());
		java2classAxiomEClass.getESuperTypes().add(theOperationalTGGPackage.getOperationalAxiomGroup());
		java2classPkgEClass.getESuperTypes().add(theOperationalTGGPackage.getOperationalRuleGroup());
		java2classClassDeclaration2ClassEClass.getESuperTypes().add(theOperationalTGGPackage.getOperationalRuleGroup());
		java2classChildPkgEClass.getESuperTypes().add(theOperationalTGGPackage.getOperationalRuleGroup());
		java2classField2AssociationEClass.getESuperTypes().add(theOperationalTGGPackage.getOperationalRuleGroup());
		java2classAxiom_axiomEClass.getESuperTypes().add(theOperationalTGGPackage.getOperationalAxiom());
		java2classPkg_pkgEClass.getESuperTypes().add(theOperationalTGGPackage.getOperationalRule());
		java2classClassDeclaration2Class_java2classClassDeclaration2ClassEClass.getESuperTypes()
				.add(theOperationalTGGPackage.getOperationalRule());
		java2classField2Association_java2classField2AssociationEClass.getESuperTypes()
				.add(theOperationalTGGPackage.getOperationalRule());
		java2classChildPkg_childPkgEClass.getESuperTypes().add(theOperationalTGGPackage.getOperationalRule());

		// Initialize classes, features, and operations; add parameters
		initEClass(java2classOperationalTGGEClass, java2classOperationalTGG.class, "java2classOperationalTGG",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(java2classAxiomEClass, java2classAxiom.class, "java2classAxiom", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(java2classPkgEClass, java2classPkg.class, "java2classPkg", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(java2classClassDeclaration2ClassEClass, java2classClassDeclaration2Class.class,
				"java2classClassDeclaration2Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(java2classChildPkgEClass, java2classChildPkg.class, "java2classChildPkg", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(java2classField2AssociationEClass, java2classField2Association.class, "java2classField2Association",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(java2classAxiom_axiomEClass, java2classAxiom_axiom.class, "java2classAxiom_axiom", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getjava2classAxiom_axiom_AddElementActivity(), theMlsdmPackage.getActivity(), null,
				"addElementActivity", null, 1, 1, java2classAxiom_axiom.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classAxiom_axiom_MoveElementActivity(), theMlsdmPackage.getActivity(), null,
				"moveElementActivity", null, 1, 1, java2classAxiom_axiom.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classAxiom_axiom_ChangeAttributeActivity(), theMlsdmPackage.getActivity(), null,
				"changeAttributeActivity", null, 1, 1, java2classAxiom_axiom.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classAxiom_axiom_TransformForwardActivity(), theMlsdmPackage.getActivity(), null,
				"transformForwardActivity", null, 1, 1, java2classAxiom_axiom.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classAxiom_axiom_TransformMappingActivity(), theMlsdmPackage.getActivity(), null,
				"transformMappingActivity", null, 1, 1, java2classAxiom_axiom.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classAxiom_axiom_TransformBackwardActivity(), theMlsdmPackage.getActivity(), null,
				"transformBackwardActivity", null, 1, 1, java2classAxiom_axiom.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classAxiom_axiom_SynchronizeForwardActivity(), theMlsdmPackage.getActivity(), null,
				"synchronizeForwardActivity", null, 1, 1, java2classAxiom_axiom.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classAxiom_axiom_SynchronizeBackwardActivity(), theMlsdmPackage.getActivity(), null,
				"synchronizeBackwardActivity", null, 1, 1, java2classAxiom_axiom.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getjava2classAxiom_axiom__AddElement__EMap_EList_EList(),
				theMote2Package.getTGGNode(), "addElement", 1, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(theHelpersPackage.getMapEntry());
		EGenericType g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "parameters", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "leftInputElements", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "rightInputElements", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getjava2classAxiom_axiom__ChangeAttributeValues__TGGNode_EMap(), ecorePackage.getEBoolean(),
				"changeAttributeValues", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "correspondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theHelpersPackage.getMapEntry());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "ruleParameters", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getjava2classAxiom_axiom__TransformForward__EList_EList_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformForward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "leftInputElements", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "rightInputElements", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getjava2classAxiom_axiom__TransformMapping__EList_EList_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformMapping", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "leftInputElements", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "rightInputElements", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getjava2classAxiom_axiom__TransformBackward__EList_EList_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformBackward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "leftInputElements", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "rightInputElements", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getjava2classAxiom_axiom__SynchronizeForward__EList_EList_TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "synchronizeForward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "leftInputElements", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "rightInputElements", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getjava2classAxiom_axiom__SynchronizeBackward__EList_EList_TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "synchronizeBackward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "leftInputElements", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "rightInputElements", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		initEClass(java2classPkg_pkgEClass, java2classPkg_pkg.class, "java2classPkg_pkg", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getjava2classPkg_pkg_AddElementActivity(), theMlsdmPackage.getActivity(), null,
				"addElementActivity", null, 1, 1, java2classPkg_pkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classPkg_pkg_MoveElementActivity(), theMlsdmPackage.getActivity(), null,
				"moveElementActivity", null, 1, 1, java2classPkg_pkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classPkg_pkg_ChangeAttributeActivity(), theMlsdmPackage.getActivity(), null,
				"changeAttributeActivity", null, 1, 1, java2classPkg_pkg.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classPkg_pkg_TransformForwardActivity(), theMlsdmPackage.getActivity(), null,
				"transformForwardActivity", null, 1, 1, java2classPkg_pkg.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classPkg_pkg_TransformMappingActivity(), theMlsdmPackage.getActivity(), null,
				"transformMappingActivity", null, 1, 1, java2classPkg_pkg.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classPkg_pkg_TransformBackwardActivity(), theMlsdmPackage.getActivity(), null,
				"transformBackwardActivity", null, 1, 1, java2classPkg_pkg.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classPkg_pkg_ConflictCheckForwardActivity(), theMlsdmPackage.getActivity(), null,
				"conflictCheckForwardActivity", null, 1, 1, java2classPkg_pkg.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classPkg_pkg_ConflictCheckMappingActivity(), theMlsdmPackage.getActivity(), null,
				"conflictCheckMappingActivity", null, 1, 1, java2classPkg_pkg.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classPkg_pkg_ConflictCheckBackwardActivity(), theMlsdmPackage.getActivity(), null,
				"conflictCheckBackwardActivity", null, 1, 1, java2classPkg_pkg.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classPkg_pkg_SynchronizeForwardActivity(), theMlsdmPackage.getActivity(), null,
				"synchronizeForwardActivity", null, 1, 1, java2classPkg_pkg.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classPkg_pkg_SynchronizeBackwardActivity(), theMlsdmPackage.getActivity(), null,
				"synchronizeBackwardActivity", null, 1, 1, java2classPkg_pkg.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classPkg_pkg_RepairForwardActivity(), theMlsdmPackage.getActivity(), null,
				"repairForwardActivity", null, 1, 1, java2classPkg_pkg.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classPkg_pkg_RepairBackwardActivity(), theMlsdmPackage.getActivity(), null,
				"repairBackwardActivity", null, 1, 1, java2classPkg_pkg.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getjava2classPkg_pkg__AddElement__EMap(), theMote2Package.getTGGNode(), "addElement", 1, 1,
				IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theHelpersPackage.getMapEntry());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "parameters", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getjava2classPkg_pkg__ChangeAttributeValues__TGGNode_EMap(), ecorePackage.getEBoolean(),
				"changeAttributeValues", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "correspondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theHelpersPackage.getMapEntry());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "ruleParameters", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getjava2classPkg_pkg__MoveElement__TGGNode_TGGNode_TGGNode(), ecorePackage.getEBoolean(),
				"moveElement", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "correspondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "oldPreviousCorrespondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "newPreviousCorrespondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getjava2classPkg_pkg__TransformForward__TGGNode_boolean_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformForward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "considerAllLhsCorrNodes", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getjava2classPkg_pkg__TransformMapping__TGGNode_boolean_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformMapping", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "considerAllLhsCorrNodes", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getjava2classPkg_pkg__TransformBackward__TGGNode_boolean_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformBackward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "considerAllLhsCorrNodes", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getjava2classPkg_pkg__ConflictCheckForward__TGGNode(), ecorePackage.getEObject(),
				"conflictCheckForward", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getjava2classPkg_pkg__ConflictCheckMapping__TGGNode(), ecorePackage.getEObject(),
				"conflictCheckMapping", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getjava2classPkg_pkg__ConflictCheckBackward__TGGNode(), ecorePackage.getEObject(),
				"conflictCheckBackward", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getjava2classPkg_pkg__SynchronizeForward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "synchronizeForward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getjava2classPkg_pkg__SynchronizeBackward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "synchronizeBackward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getjava2classPkg_pkg__RepairForward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "repairForward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getjava2classPkg_pkg__RepairBackward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "repairBackward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		initEClass(java2classClassDeclaration2Class_java2classClassDeclaration2ClassEClass,
				java2classClassDeclaration2Class_java2classClassDeclaration2Class.class,
				"java2classClassDeclaration2Class_java2classClassDeclaration2Class", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getjava2classClassDeclaration2Class_java2classClassDeclaration2Class_AddElementActivity(),
				theMlsdmPackage.getActivity(), null, "addElementActivity", null, 1, 1,
				java2classClassDeclaration2Class_java2classClassDeclaration2Class.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classClassDeclaration2Class_java2classClassDeclaration2Class_MoveElementActivity(),
				theMlsdmPackage.getActivity(), null, "moveElementActivity", null, 1, 1,
				java2classClassDeclaration2Class_java2classClassDeclaration2Class.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classClassDeclaration2Class_java2classClassDeclaration2Class_ChangeAttributeActivity(),
				theMlsdmPackage.getActivity(), null, "changeAttributeActivity", null, 1, 1,
				java2classClassDeclaration2Class_java2classClassDeclaration2Class.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classClassDeclaration2Class_java2classClassDeclaration2Class_TransformForwardActivity(),
				theMlsdmPackage.getActivity(), null, "transformForwardActivity", null, 1, 1,
				java2classClassDeclaration2Class_java2classClassDeclaration2Class.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classClassDeclaration2Class_java2classClassDeclaration2Class_TransformMappingActivity(),
				theMlsdmPackage.getActivity(), null, "transformMappingActivity", null, 1, 1,
				java2classClassDeclaration2Class_java2classClassDeclaration2Class.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classClassDeclaration2Class_java2classClassDeclaration2Class_TransformBackwardActivity(),
				theMlsdmPackage.getActivity(), null, "transformBackwardActivity", null, 1, 1,
				java2classClassDeclaration2Class_java2classClassDeclaration2Class.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
				getjava2classClassDeclaration2Class_java2classClassDeclaration2Class_ConflictCheckForwardActivity(),
				theMlsdmPackage.getActivity(), null, "conflictCheckForwardActivity", null, 1, 1,
				java2classClassDeclaration2Class_java2classClassDeclaration2Class.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
				getjava2classClassDeclaration2Class_java2classClassDeclaration2Class_ConflictCheckMappingActivity(),
				theMlsdmPackage.getActivity(), null, "conflictCheckMappingActivity", null, 1, 1,
				java2classClassDeclaration2Class_java2classClassDeclaration2Class.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
				getjava2classClassDeclaration2Class_java2classClassDeclaration2Class_ConflictCheckBackwardActivity(),
				theMlsdmPackage.getActivity(), null, "conflictCheckBackwardActivity", null, 1, 1,
				java2classClassDeclaration2Class_java2classClassDeclaration2Class.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
				getjava2classClassDeclaration2Class_java2classClassDeclaration2Class_SynchronizeForwardActivity(),
				theMlsdmPackage.getActivity(), null, "synchronizeForwardActivity", null, 1, 1,
				java2classClassDeclaration2Class_java2classClassDeclaration2Class.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(
				getjava2classClassDeclaration2Class_java2classClassDeclaration2Class_SynchronizeBackwardActivity(),
				theMlsdmPackage.getActivity(), null, "synchronizeBackwardActivity", null, 1, 1,
				java2classClassDeclaration2Class_java2classClassDeclaration2Class.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classClassDeclaration2Class_java2classClassDeclaration2Class_RepairForwardActivity(),
				theMlsdmPackage.getActivity(), null, "repairForwardActivity", null, 1, 1,
				java2classClassDeclaration2Class_java2classClassDeclaration2Class.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classClassDeclaration2Class_java2classClassDeclaration2Class_RepairBackwardActivity(),
				theMlsdmPackage.getActivity(), null, "repairBackwardActivity", null, 1, 1,
				java2classClassDeclaration2Class_java2classClassDeclaration2Class.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getjava2classClassDeclaration2Class_java2classClassDeclaration2Class__AddElement__EMap(),
				theMote2Package.getTGGNode(), "addElement", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theHelpersPackage.getMapEntry());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "parameters", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(
				getjava2classClassDeclaration2Class_java2classClassDeclaration2Class__ChangeAttributeValues__TGGNode_EMap(),
				ecorePackage.getEBoolean(), "changeAttributeValues", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "correspondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theHelpersPackage.getMapEntry());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "ruleParameters", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(
				getjava2classClassDeclaration2Class_java2classClassDeclaration2Class__MoveElement__TGGNode_TGGNode_TGGNode(),
				ecorePackage.getEBoolean(), "moveElement", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "correspondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "oldPreviousCorrespondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "newPreviousCorrespondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(
				getjava2classClassDeclaration2Class_java2classClassDeclaration2Class__TransformForward__TGGNode_boolean_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformForward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "considerAllLhsCorrNodes", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(
				getjava2classClassDeclaration2Class_java2classClassDeclaration2Class__TransformMapping__TGGNode_boolean_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformMapping", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "considerAllLhsCorrNodes", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(
				getjava2classClassDeclaration2Class_java2classClassDeclaration2Class__TransformBackward__TGGNode_boolean_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformBackward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "considerAllLhsCorrNodes", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(
				getjava2classClassDeclaration2Class_java2classClassDeclaration2Class__ConflictCheckForward__TGGNode(),
				ecorePackage.getEObject(), "conflictCheckForward", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(
				getjava2classClassDeclaration2Class_java2classClassDeclaration2Class__ConflictCheckMapping__TGGNode(),
				ecorePackage.getEObject(), "conflictCheckMapping", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(
				getjava2classClassDeclaration2Class_java2classClassDeclaration2Class__ConflictCheckBackward__TGGNode(),
				ecorePackage.getEObject(), "conflictCheckBackward", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(
				getjava2classClassDeclaration2Class_java2classClassDeclaration2Class__SynchronizeForward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "synchronizeForward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(
				getjava2classClassDeclaration2Class_java2classClassDeclaration2Class__SynchronizeBackward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "synchronizeBackward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(
				getjava2classClassDeclaration2Class_java2classClassDeclaration2Class__RepairForward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "repairForward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(
				getjava2classClassDeclaration2Class_java2classClassDeclaration2Class__RepairBackward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "repairBackward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		initEClass(java2classField2Association_java2classField2AssociationEClass,
				java2classField2Association_java2classField2Association.class,
				"java2classField2Association_java2classField2Association", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getjava2classField2Association_java2classField2Association_AddElementActivity(),
				theMlsdmPackage.getActivity(), null, "addElementActivity", null, 1, 1,
				java2classField2Association_java2classField2Association.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classField2Association_java2classField2Association_MoveElementActivity(),
				theMlsdmPackage.getActivity(), null, "moveElementActivity", null, 1, 1,
				java2classField2Association_java2classField2Association.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classField2Association_java2classField2Association_ChangeAttributeActivity(),
				theMlsdmPackage.getActivity(), null, "changeAttributeActivity", null, 1, 1,
				java2classField2Association_java2classField2Association.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classField2Association_java2classField2Association_TransformForwardActivity(),
				theMlsdmPackage.getActivity(), null, "transformForwardActivity", null, 1, 1,
				java2classField2Association_java2classField2Association.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classField2Association_java2classField2Association_TransformMappingActivity(),
				theMlsdmPackage.getActivity(), null, "transformMappingActivity", null, 1, 1,
				java2classField2Association_java2classField2Association.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classField2Association_java2classField2Association_TransformBackwardActivity(),
				theMlsdmPackage.getActivity(), null, "transformBackwardActivity", null, 1, 1,
				java2classField2Association_java2classField2Association.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classField2Association_java2classField2Association_ConflictCheckForwardActivity(),
				theMlsdmPackage.getActivity(), null, "conflictCheckForwardActivity", null, 1, 1,
				java2classField2Association_java2classField2Association.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classField2Association_java2classField2Association_ConflictCheckMappingActivity(),
				theMlsdmPackage.getActivity(), null, "conflictCheckMappingActivity", null, 1, 1,
				java2classField2Association_java2classField2Association.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classField2Association_java2classField2Association_ConflictCheckBackwardActivity(),
				theMlsdmPackage.getActivity(), null, "conflictCheckBackwardActivity", null, 1, 1,
				java2classField2Association_java2classField2Association.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classField2Association_java2classField2Association_SynchronizeForwardActivity(),
				theMlsdmPackage.getActivity(), null, "synchronizeForwardActivity", null, 1, 1,
				java2classField2Association_java2classField2Association.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classField2Association_java2classField2Association_SynchronizeBackwardActivity(),
				theMlsdmPackage.getActivity(), null, "synchronizeBackwardActivity", null, 1, 1,
				java2classField2Association_java2classField2Association.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classField2Association_java2classField2Association_RepairForwardActivity(),
				theMlsdmPackage.getActivity(), null, "repairForwardActivity", null, 1, 1,
				java2classField2Association_java2classField2Association.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classField2Association_java2classField2Association_RepairBackwardActivity(),
				theMlsdmPackage.getActivity(), null, "repairBackwardActivity", null, 1, 1,
				java2classField2Association_java2classField2Association.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getjava2classField2Association_java2classField2Association__AddElement__EMap(),
				theMote2Package.getTGGNode(), "addElement", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theHelpersPackage.getMapEntry());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "parameters", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(
				getjava2classField2Association_java2classField2Association__ChangeAttributeValues__TGGNode_EMap(),
				ecorePackage.getEBoolean(), "changeAttributeValues", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "correspondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theHelpersPackage.getMapEntry());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "ruleParameters", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(
				getjava2classField2Association_java2classField2Association__MoveElement__TGGNode_TGGNode_TGGNode(),
				ecorePackage.getEBoolean(), "moveElement", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "correspondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "oldPreviousCorrespondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "newPreviousCorrespondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(
				getjava2classField2Association_java2classField2Association__TransformForward__TGGNode_boolean_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformForward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "considerAllLhsCorrNodes", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(
				getjava2classField2Association_java2classField2Association__TransformMapping__TGGNode_boolean_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformMapping", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "considerAllLhsCorrNodes", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(
				getjava2classField2Association_java2classField2Association__TransformBackward__TGGNode_boolean_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformBackward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "considerAllLhsCorrNodes", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getjava2classField2Association_java2classField2Association__ConflictCheckForward__TGGNode(),
				ecorePackage.getEObject(), "conflictCheckForward", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getjava2classField2Association_java2classField2Association__ConflictCheckMapping__TGGNode(),
				ecorePackage.getEObject(), "conflictCheckMapping", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(
				getjava2classField2Association_java2classField2Association__ConflictCheckBackward__TGGNode(),
				ecorePackage.getEObject(), "conflictCheckBackward", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(
				getjava2classField2Association_java2classField2Association__SynchronizeForward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "synchronizeForward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(
				getjava2classField2Association_java2classField2Association__SynchronizeBackward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "synchronizeBackward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(
				getjava2classField2Association_java2classField2Association__RepairForward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "repairForward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(
				getjava2classField2Association_java2classField2Association__RepairBackward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "repairBackward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		initEClass(java2classChildPkg_childPkgEClass, java2classChildPkg_childPkg.class, "java2classChildPkg_childPkg",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getjava2classChildPkg_childPkg_AddElementActivity(), theMlsdmPackage.getActivity(), null,
				"addElementActivity", null, 1, 1, java2classChildPkg_childPkg.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classChildPkg_childPkg_MoveElementActivity(), theMlsdmPackage.getActivity(), null,
				"moveElementActivity", null, 1, 1, java2classChildPkg_childPkg.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classChildPkg_childPkg_ChangeAttributeActivity(), theMlsdmPackage.getActivity(), null,
				"changeAttributeActivity", null, 1, 1, java2classChildPkg_childPkg.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classChildPkg_childPkg_TransformForwardActivity(), theMlsdmPackage.getActivity(), null,
				"transformForwardActivity", null, 1, 1, java2classChildPkg_childPkg.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classChildPkg_childPkg_TransformMappingActivity(), theMlsdmPackage.getActivity(), null,
				"transformMappingActivity", null, 1, 1, java2classChildPkg_childPkg.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classChildPkg_childPkg_TransformBackwardActivity(), theMlsdmPackage.getActivity(), null,
				"transformBackwardActivity", null, 1, 1, java2classChildPkg_childPkg.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classChildPkg_childPkg_ConflictCheckForwardActivity(), theMlsdmPackage.getActivity(),
				null, "conflictCheckForwardActivity", null, 1, 1, java2classChildPkg_childPkg.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getjava2classChildPkg_childPkg_ConflictCheckMappingActivity(), theMlsdmPackage.getActivity(),
				null, "conflictCheckMappingActivity", null, 1, 1, java2classChildPkg_childPkg.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getjava2classChildPkg_childPkg_ConflictCheckBackwardActivity(), theMlsdmPackage.getActivity(),
				null, "conflictCheckBackwardActivity", null, 1, 1, java2classChildPkg_childPkg.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getjava2classChildPkg_childPkg_SynchronizeForwardActivity(), theMlsdmPackage.getActivity(), null,
				"synchronizeForwardActivity", null, 1, 1, java2classChildPkg_childPkg.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getjava2classChildPkg_childPkg_SynchronizeBackwardActivity(), theMlsdmPackage.getActivity(),
				null, "synchronizeBackwardActivity", null, 1, 1, java2classChildPkg_childPkg.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getjava2classChildPkg_childPkg_RepairForwardActivity(), theMlsdmPackage.getActivity(), null,
				"repairForwardActivity", null, 1, 1, java2classChildPkg_childPkg.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classChildPkg_childPkg_RepairBackwardActivity(), theMlsdmPackage.getActivity(), null,
				"repairBackwardActivity", null, 1, 1, java2classChildPkg_childPkg.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getjava2classChildPkg_childPkg__AddElement__EMap(), theMote2Package.getTGGNode(),
				"addElement", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theHelpersPackage.getMapEntry());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "parameters", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getjava2classChildPkg_childPkg__ChangeAttributeValues__TGGNode_EMap(),
				ecorePackage.getEBoolean(), "changeAttributeValues", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "correspondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theHelpersPackage.getMapEntry());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "ruleParameters", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getjava2classChildPkg_childPkg__MoveElement__TGGNode_TGGNode_TGGNode(),
				ecorePackage.getEBoolean(), "moveElement", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "correspondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "oldPreviousCorrespondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "newPreviousCorrespondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getjava2classChildPkg_childPkg__TransformForward__TGGNode_boolean_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformForward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "considerAllLhsCorrNodes", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getjava2classChildPkg_childPkg__TransformMapping__TGGNode_boolean_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformMapping", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "considerAllLhsCorrNodes", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getjava2classChildPkg_childPkg__TransformBackward__TGGNode_boolean_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformBackward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "considerAllLhsCorrNodes", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getjava2classChildPkg_childPkg__ConflictCheckForward__TGGNode(), ecorePackage.getEObject(),
				"conflictCheckForward", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getjava2classChildPkg_childPkg__ConflictCheckMapping__TGGNode(), ecorePackage.getEObject(),
				"conflictCheckMapping", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getjava2classChildPkg_childPkg__ConflictCheckBackward__TGGNode(), ecorePackage.getEObject(),
				"conflictCheckBackward", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getjava2classChildPkg_childPkg__SynchronizeForward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "synchronizeForward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getjava2classChildPkg_childPkg__SynchronizeBackward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "synchronizeBackward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getjava2classChildPkg_childPkg__RepairForward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "repairForward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getjava2classChildPkg_childPkg__RepairBackward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "repairBackward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());
	}

} //GeneratedPackageImpl
