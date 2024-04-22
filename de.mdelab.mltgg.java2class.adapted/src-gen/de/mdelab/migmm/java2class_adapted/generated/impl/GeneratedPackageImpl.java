/**
 */
package de.mdelab.migmm.java2class_adapted.generated.impl;

import de.mdelab.migmm.history.HistoryPackage;

import de.mdelab.migmm.java2class_adapted.Java2class_adaptedPackage;

import de.mdelab.migmm.java2class_adapted.generated.GeneratedFactory;
import de.mdelab.migmm.java2class_adapted.generated.GeneratedPackage;
import de.mdelab.migmm.java2class_adapted.generated.History2History2;
import de.mdelab.migmm.java2class_adapted.generated.History2History2_History2History;
import de.mdelab.migmm.java2class_adapted.generated.java2classAxiom_adapted;
import de.mdelab.migmm.java2class_adapted.generated.java2classAxiom_adapted_axiom_adapted;
import de.mdelab.migmm.java2class_adapted.generated.java2classChildPkg_adapted;
import de.mdelab.migmm.java2class_adapted.generated.java2classChildPkg_adapted_childPkg_adapted;
import de.mdelab.migmm.java2class_adapted.generated.java2classClassDeclaration2Class_adapted;
import de.mdelab.migmm.java2class_adapted.generated.java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted;
import de.mdelab.migmm.java2class_adapted.generated.java2classField2Association_adapted;
import de.mdelab.migmm.java2class_adapted.generated.java2classField2Association_adapted_java2classField2Association_adapted;
import de.mdelab.migmm.java2class_adapted.generated.java2classPkg_adapted;
import de.mdelab.migmm.java2class_adapted.generated.java2classPkg_adapted_pkg_adapted;
import de.mdelab.migmm.java2class_adapted.generated.java2class_adaptedOperationalTGG;

import de.mdelab.migmm.java2class_adapted.impl.Java2class_adaptedPackageImpl;

import de.mdelab.mlcallactions.MlcallactionsPackage;

import de.mdelab.mlcore.MlcorePackage;

import de.mdelab.mlexpressions.MlexpressionsPackage;

import de.mdelab.mlsdm.MlsdmPackage;

import de.mdelab.mlstorypatterns.MlstorypatternsPackage;

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

import tggh.TgghPackage;

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
	private EClass java2class_adaptedOperationalTGGEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass history2History2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass java2classAxiom_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass java2classPkg_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass java2classChildPkg_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass java2classClassDeclaration2Class_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass java2classField2Association_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass history2History2_History2HistoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass java2classPkg_adapted_pkg_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass java2classField2Association_adapted_java2classField2Association_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass java2classChildPkg_adapted_childPkg_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass java2classAxiom_adapted_axiom_adaptedEClass = null;

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
	 * @see de.mdelab.migmm.java2class_adapted.generated.GeneratedPackage#eNS_URI
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
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Java2class_adaptedPackage.eNS_URI);
		Java2class_adaptedPackageImpl theJava2class_adaptedPackage = (Java2class_adaptedPackageImpl) (registeredPackage instanceof Java2class_adaptedPackageImpl
				? registeredPackage
				: Java2class_adaptedPackage.eINSTANCE);

		// Create package meta-data objects
		theGeneratedPackage.createPackageContents();
		theJava2class_adaptedPackage.createPackageContents();

		// Initialize created meta-data
		theGeneratedPackage.initializePackageContents();
		theJava2class_adaptedPackage.initializePackageContents();

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
	public EClass getjava2class_adaptedOperationalTGG() {
		return java2class_adaptedOperationalTGGEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHistory2History2() {
		return history2History2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getjava2classAxiom_adapted() {
		return java2classAxiom_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getjava2classPkg_adapted() {
		return java2classPkg_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getjava2classChildPkg_adapted() {
		return java2classChildPkg_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getjava2classClassDeclaration2Class_adapted() {
		return java2classClassDeclaration2Class_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getjava2classField2Association_adapted() {
		return java2classField2Association_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHistory2History2_History2History() {
		return history2History2_History2HistoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHistory2History2_History2History_AddElementActivity() {
		return (EReference) history2History2_History2HistoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHistory2History2_History2History_MoveElementActivity() {
		return (EReference) history2History2_History2HistoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHistory2History2_History2History_ChangeAttributeActivity() {
		return (EReference) history2History2_History2HistoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHistory2History2_History2History_TransformForwardActivity() {
		return (EReference) history2History2_History2HistoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHistory2History2_History2History_TransformMappingActivity() {
		return (EReference) history2History2_History2HistoryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHistory2History2_History2History_TransformBackwardActivity() {
		return (EReference) history2History2_History2HistoryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHistory2History2_History2History_SynchronizeForwardActivity() {
		return (EReference) history2History2_History2HistoryEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHistory2History2_History2History_SynchronizeBackwardActivity() {
		return (EReference) history2History2_History2HistoryEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHistory2History2_History2History__AddElement__EMap_EList_EList() {
		return history2History2_History2HistoryEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHistory2History2_History2History__ChangeAttributeValues__TGGNode_EMap() {
		return history2History2_History2HistoryEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHistory2History2_History2History__TransformForward__EList_EList_boolean() {
		return history2History2_History2HistoryEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHistory2History2_History2History__TransformMapping__EList_EList_boolean() {
		return history2History2_History2HistoryEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHistory2History2_History2History__TransformBackward__EList_EList_boolean() {
		return history2History2_History2HistoryEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHistory2History2_History2History__SynchronizeForward__EList_EList_TGGNode_boolean() {
		return history2History2_History2HistoryEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHistory2History2_History2History__SynchronizeBackward__EList_EList_TGGNode_boolean() {
		return history2History2_History2HistoryEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getjava2classPkg_adapted_pkg_adapted() {
		return java2classPkg_adapted_pkg_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classPkg_adapted_pkg_adapted_AddElementActivity() {
		return (EReference) java2classPkg_adapted_pkg_adaptedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classPkg_adapted_pkg_adapted_MoveElementActivity() {
		return (EReference) java2classPkg_adapted_pkg_adaptedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classPkg_adapted_pkg_adapted_ChangeAttributeActivity() {
		return (EReference) java2classPkg_adapted_pkg_adaptedEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classPkg_adapted_pkg_adapted_TransformForwardActivity() {
		return (EReference) java2classPkg_adapted_pkg_adaptedEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classPkg_adapted_pkg_adapted_TransformMappingActivity() {
		return (EReference) java2classPkg_adapted_pkg_adaptedEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classPkg_adapted_pkg_adapted_TransformBackwardActivity() {
		return (EReference) java2classPkg_adapted_pkg_adaptedEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classPkg_adapted_pkg_adapted_ConflictCheckForwardActivity() {
		return (EReference) java2classPkg_adapted_pkg_adaptedEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classPkg_adapted_pkg_adapted_ConflictCheckMappingActivity() {
		return (EReference) java2classPkg_adapted_pkg_adaptedEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classPkg_adapted_pkg_adapted_ConflictCheckBackwardActivity() {
		return (EReference) java2classPkg_adapted_pkg_adaptedEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classPkg_adapted_pkg_adapted_SynchronizeForwardActivity() {
		return (EReference) java2classPkg_adapted_pkg_adaptedEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classPkg_adapted_pkg_adapted_SynchronizeBackwardActivity() {
		return (EReference) java2classPkg_adapted_pkg_adaptedEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classPkg_adapted_pkg_adapted_RepairForwardActivity() {
		return (EReference) java2classPkg_adapted_pkg_adaptedEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classPkg_adapted_pkg_adapted_RepairBackwardActivity() {
		return (EReference) java2classPkg_adapted_pkg_adaptedEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classPkg_adapted_pkg_adapted__AddElement__EMap() {
		return java2classPkg_adapted_pkg_adaptedEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classPkg_adapted_pkg_adapted__ChangeAttributeValues__TGGNode_EMap() {
		return java2classPkg_adapted_pkg_adaptedEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classPkg_adapted_pkg_adapted__MoveElement__TGGNode_TGGNode_TGGNode() {
		return java2classPkg_adapted_pkg_adaptedEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classPkg_adapted_pkg_adapted__TransformForward__TGGNode_boolean_boolean() {
		return java2classPkg_adapted_pkg_adaptedEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classPkg_adapted_pkg_adapted__TransformMapping__TGGNode_boolean_boolean() {
		return java2classPkg_adapted_pkg_adaptedEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classPkg_adapted_pkg_adapted__TransformBackward__TGGNode_boolean_boolean() {
		return java2classPkg_adapted_pkg_adaptedEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classPkg_adapted_pkg_adapted__ConflictCheckForward__TGGNode() {
		return java2classPkg_adapted_pkg_adaptedEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classPkg_adapted_pkg_adapted__ConflictCheckMapping__TGGNode() {
		return java2classPkg_adapted_pkg_adaptedEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classPkg_adapted_pkg_adapted__ConflictCheckBackward__TGGNode() {
		return java2classPkg_adapted_pkg_adaptedEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classPkg_adapted_pkg_adapted__SynchronizeForward__TGGNode_boolean() {
		return java2classPkg_adapted_pkg_adaptedEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classPkg_adapted_pkg_adapted__SynchronizeBackward__TGGNode_boolean() {
		return java2classPkg_adapted_pkg_adaptedEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classPkg_adapted_pkg_adapted__RepairForward__TGGNode_boolean() {
		return java2classPkg_adapted_pkg_adaptedEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classPkg_adapted_pkg_adapted__RepairBackward__TGGNode_boolean() {
		return java2classPkg_adapted_pkg_adaptedEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted() {
		return java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted_AddElementActivity() {
		return (EReference) java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adaptedEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted_MoveElementActivity() {
		return (EReference) java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adaptedEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted_ChangeAttributeActivity() {
		return (EReference) java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adaptedEClass
				.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted_TransformForwardActivity() {
		return (EReference) java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adaptedEClass
				.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted_TransformMappingActivity() {
		return (EReference) java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adaptedEClass
				.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted_TransformBackwardActivity() {
		return (EReference) java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adaptedEClass
				.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted_ConflictCheckForwardActivity() {
		return (EReference) java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adaptedEClass
				.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted_ConflictCheckMappingActivity() {
		return (EReference) java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adaptedEClass
				.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted_ConflictCheckBackwardActivity() {
		return (EReference) java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adaptedEClass
				.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted_SynchronizeForwardActivity() {
		return (EReference) java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adaptedEClass
				.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted_SynchronizeBackwardActivity() {
		return (EReference) java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adaptedEClass
				.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted_RepairForwardActivity() {
		return (EReference) java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adaptedEClass
				.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted_RepairBackwardActivity() {
		return (EReference) java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adaptedEClass
				.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted__AddElement__EMap() {
		return java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adaptedEClass.getEOperations()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted__ChangeAttributeValues__TGGNode_EMap() {
		return java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adaptedEClass.getEOperations()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted__MoveElement__TGGNode_TGGNode_TGGNode() {
		return java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adaptedEClass.getEOperations()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted__TransformForward__TGGNode_boolean_boolean() {
		return java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adaptedEClass.getEOperations()
				.get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted__TransformMapping__TGGNode_boolean_boolean() {
		return java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adaptedEClass.getEOperations()
				.get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted__TransformBackward__TGGNode_boolean_boolean() {
		return java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adaptedEClass.getEOperations()
				.get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted__ConflictCheckForward__TGGNode() {
		return java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adaptedEClass.getEOperations()
				.get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted__ConflictCheckMapping__TGGNode() {
		return java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adaptedEClass.getEOperations()
				.get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted__ConflictCheckBackward__TGGNode() {
		return java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adaptedEClass.getEOperations()
				.get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted__SynchronizeForward__TGGNode_boolean() {
		return java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adaptedEClass.getEOperations()
				.get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted__SynchronizeBackward__TGGNode_boolean() {
		return java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adaptedEClass.getEOperations()
				.get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted__RepairForward__TGGNode_boolean() {
		return java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adaptedEClass.getEOperations()
				.get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted__RepairBackward__TGGNode_boolean() {
		return java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adaptedEClass.getEOperations()
				.get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getjava2classField2Association_adapted_java2classField2Association_adapted() {
		return java2classField2Association_adapted_java2classField2Association_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classField2Association_adapted_java2classField2Association_adapted_AddElementActivity() {
		return (EReference) java2classField2Association_adapted_java2classField2Association_adaptedEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classField2Association_adapted_java2classField2Association_adapted_MoveElementActivity() {
		return (EReference) java2classField2Association_adapted_java2classField2Association_adaptedEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classField2Association_adapted_java2classField2Association_adapted_ChangeAttributeActivity() {
		return (EReference) java2classField2Association_adapted_java2classField2Association_adaptedEClass
				.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classField2Association_adapted_java2classField2Association_adapted_TransformForwardActivity() {
		return (EReference) java2classField2Association_adapted_java2classField2Association_adaptedEClass
				.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classField2Association_adapted_java2classField2Association_adapted_TransformMappingActivity() {
		return (EReference) java2classField2Association_adapted_java2classField2Association_adaptedEClass
				.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classField2Association_adapted_java2classField2Association_adapted_TransformBackwardActivity() {
		return (EReference) java2classField2Association_adapted_java2classField2Association_adaptedEClass
				.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classField2Association_adapted_java2classField2Association_adapted_ConflictCheckForwardActivity() {
		return (EReference) java2classField2Association_adapted_java2classField2Association_adaptedEClass
				.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classField2Association_adapted_java2classField2Association_adapted_ConflictCheckMappingActivity() {
		return (EReference) java2classField2Association_adapted_java2classField2Association_adaptedEClass
				.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classField2Association_adapted_java2classField2Association_adapted_ConflictCheckBackwardActivity() {
		return (EReference) java2classField2Association_adapted_java2classField2Association_adaptedEClass
				.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classField2Association_adapted_java2classField2Association_adapted_SynchronizeForwardActivity() {
		return (EReference) java2classField2Association_adapted_java2classField2Association_adaptedEClass
				.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classField2Association_adapted_java2classField2Association_adapted_SynchronizeBackwardActivity() {
		return (EReference) java2classField2Association_adapted_java2classField2Association_adaptedEClass
				.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classField2Association_adapted_java2classField2Association_adapted_RepairForwardActivity() {
		return (EReference) java2classField2Association_adapted_java2classField2Association_adaptedEClass
				.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classField2Association_adapted_java2classField2Association_adapted_RepairBackwardActivity() {
		return (EReference) java2classField2Association_adapted_java2classField2Association_adaptedEClass
				.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classField2Association_adapted_java2classField2Association_adapted__AddElement__EMap() {
		return java2classField2Association_adapted_java2classField2Association_adaptedEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classField2Association_adapted_java2classField2Association_adapted__ChangeAttributeValues__TGGNode_EMap() {
		return java2classField2Association_adapted_java2classField2Association_adaptedEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classField2Association_adapted_java2classField2Association_adapted__MoveElement__TGGNode_TGGNode_TGGNode() {
		return java2classField2Association_adapted_java2classField2Association_adaptedEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classField2Association_adapted_java2classField2Association_adapted__TransformForward__TGGNode_boolean_boolean() {
		return java2classField2Association_adapted_java2classField2Association_adaptedEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classField2Association_adapted_java2classField2Association_adapted__TransformMapping__TGGNode_boolean_boolean() {
		return java2classField2Association_adapted_java2classField2Association_adaptedEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classField2Association_adapted_java2classField2Association_adapted__TransformBackward__TGGNode_boolean_boolean() {
		return java2classField2Association_adapted_java2classField2Association_adaptedEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classField2Association_adapted_java2classField2Association_adapted__ConflictCheckForward__TGGNode() {
		return java2classField2Association_adapted_java2classField2Association_adaptedEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classField2Association_adapted_java2classField2Association_adapted__ConflictCheckMapping__TGGNode() {
		return java2classField2Association_adapted_java2classField2Association_adaptedEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classField2Association_adapted_java2classField2Association_adapted__ConflictCheckBackward__TGGNode() {
		return java2classField2Association_adapted_java2classField2Association_adaptedEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classField2Association_adapted_java2classField2Association_adapted__SynchronizeForward__TGGNode_boolean() {
		return java2classField2Association_adapted_java2classField2Association_adaptedEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classField2Association_adapted_java2classField2Association_adapted__SynchronizeBackward__TGGNode_boolean() {
		return java2classField2Association_adapted_java2classField2Association_adaptedEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classField2Association_adapted_java2classField2Association_adapted__RepairForward__TGGNode_boolean() {
		return java2classField2Association_adapted_java2classField2Association_adaptedEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classField2Association_adapted_java2classField2Association_adapted__RepairBackward__TGGNode_boolean() {
		return java2classField2Association_adapted_java2classField2Association_adaptedEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getjava2classChildPkg_adapted_childPkg_adapted() {
		return java2classChildPkg_adapted_childPkg_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classChildPkg_adapted_childPkg_adapted_AddElementActivity() {
		return (EReference) java2classChildPkg_adapted_childPkg_adaptedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classChildPkg_adapted_childPkg_adapted_MoveElementActivity() {
		return (EReference) java2classChildPkg_adapted_childPkg_adaptedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classChildPkg_adapted_childPkg_adapted_ChangeAttributeActivity() {
		return (EReference) java2classChildPkg_adapted_childPkg_adaptedEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classChildPkg_adapted_childPkg_adapted_TransformForwardActivity() {
		return (EReference) java2classChildPkg_adapted_childPkg_adaptedEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classChildPkg_adapted_childPkg_adapted_TransformMappingActivity() {
		return (EReference) java2classChildPkg_adapted_childPkg_adaptedEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classChildPkg_adapted_childPkg_adapted_TransformBackwardActivity() {
		return (EReference) java2classChildPkg_adapted_childPkg_adaptedEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classChildPkg_adapted_childPkg_adapted_ConflictCheckForwardActivity() {
		return (EReference) java2classChildPkg_adapted_childPkg_adaptedEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classChildPkg_adapted_childPkg_adapted_ConflictCheckMappingActivity() {
		return (EReference) java2classChildPkg_adapted_childPkg_adaptedEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classChildPkg_adapted_childPkg_adapted_ConflictCheckBackwardActivity() {
		return (EReference) java2classChildPkg_adapted_childPkg_adaptedEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classChildPkg_adapted_childPkg_adapted_SynchronizeForwardActivity() {
		return (EReference) java2classChildPkg_adapted_childPkg_adaptedEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classChildPkg_adapted_childPkg_adapted_SynchronizeBackwardActivity() {
		return (EReference) java2classChildPkg_adapted_childPkg_adaptedEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classChildPkg_adapted_childPkg_adapted_RepairForwardActivity() {
		return (EReference) java2classChildPkg_adapted_childPkg_adaptedEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classChildPkg_adapted_childPkg_adapted_RepairBackwardActivity() {
		return (EReference) java2classChildPkg_adapted_childPkg_adaptedEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classChildPkg_adapted_childPkg_adapted__AddElement__EMap() {
		return java2classChildPkg_adapted_childPkg_adaptedEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classChildPkg_adapted_childPkg_adapted__ChangeAttributeValues__TGGNode_EMap() {
		return java2classChildPkg_adapted_childPkg_adaptedEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classChildPkg_adapted_childPkg_adapted__MoveElement__TGGNode_TGGNode_TGGNode() {
		return java2classChildPkg_adapted_childPkg_adaptedEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classChildPkg_adapted_childPkg_adapted__TransformForward__TGGNode_boolean_boolean() {
		return java2classChildPkg_adapted_childPkg_adaptedEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classChildPkg_adapted_childPkg_adapted__TransformMapping__TGGNode_boolean_boolean() {
		return java2classChildPkg_adapted_childPkg_adaptedEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classChildPkg_adapted_childPkg_adapted__TransformBackward__TGGNode_boolean_boolean() {
		return java2classChildPkg_adapted_childPkg_adaptedEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classChildPkg_adapted_childPkg_adapted__ConflictCheckForward__TGGNode() {
		return java2classChildPkg_adapted_childPkg_adaptedEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classChildPkg_adapted_childPkg_adapted__ConflictCheckMapping__TGGNode() {
		return java2classChildPkg_adapted_childPkg_adaptedEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classChildPkg_adapted_childPkg_adapted__ConflictCheckBackward__TGGNode() {
		return java2classChildPkg_adapted_childPkg_adaptedEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classChildPkg_adapted_childPkg_adapted__SynchronizeForward__TGGNode_boolean() {
		return java2classChildPkg_adapted_childPkg_adaptedEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classChildPkg_adapted_childPkg_adapted__SynchronizeBackward__TGGNode_boolean() {
		return java2classChildPkg_adapted_childPkg_adaptedEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classChildPkg_adapted_childPkg_adapted__RepairForward__TGGNode_boolean() {
		return java2classChildPkg_adapted_childPkg_adaptedEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classChildPkg_adapted_childPkg_adapted__RepairBackward__TGGNode_boolean() {
		return java2classChildPkg_adapted_childPkg_adaptedEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getjava2classAxiom_adapted_axiom_adapted() {
		return java2classAxiom_adapted_axiom_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classAxiom_adapted_axiom_adapted_AddElementActivity() {
		return (EReference) java2classAxiom_adapted_axiom_adaptedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classAxiom_adapted_axiom_adapted_MoveElementActivity() {
		return (EReference) java2classAxiom_adapted_axiom_adaptedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classAxiom_adapted_axiom_adapted_ChangeAttributeActivity() {
		return (EReference) java2classAxiom_adapted_axiom_adaptedEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classAxiom_adapted_axiom_adapted_TransformForwardActivity() {
		return (EReference) java2classAxiom_adapted_axiom_adaptedEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classAxiom_adapted_axiom_adapted_TransformMappingActivity() {
		return (EReference) java2classAxiom_adapted_axiom_adaptedEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classAxiom_adapted_axiom_adapted_TransformBackwardActivity() {
		return (EReference) java2classAxiom_adapted_axiom_adaptedEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classAxiom_adapted_axiom_adapted_ConflictCheckForwardActivity() {
		return (EReference) java2classAxiom_adapted_axiom_adaptedEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classAxiom_adapted_axiom_adapted_ConflictCheckMappingActivity() {
		return (EReference) java2classAxiom_adapted_axiom_adaptedEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classAxiom_adapted_axiom_adapted_ConflictCheckBackwardActivity() {
		return (EReference) java2classAxiom_adapted_axiom_adaptedEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classAxiom_adapted_axiom_adapted_SynchronizeForwardActivity() {
		return (EReference) java2classAxiom_adapted_axiom_adaptedEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classAxiom_adapted_axiom_adapted_SynchronizeBackwardActivity() {
		return (EReference) java2classAxiom_adapted_axiom_adaptedEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classAxiom_adapted_axiom_adapted_RepairForwardActivity() {
		return (EReference) java2classAxiom_adapted_axiom_adaptedEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getjava2classAxiom_adapted_axiom_adapted_RepairBackwardActivity() {
		return (EReference) java2classAxiom_adapted_axiom_adaptedEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classAxiom_adapted_axiom_adapted__AddElement__EMap() {
		return java2classAxiom_adapted_axiom_adaptedEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classAxiom_adapted_axiom_adapted__ChangeAttributeValues__TGGNode_EMap() {
		return java2classAxiom_adapted_axiom_adaptedEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classAxiom_adapted_axiom_adapted__MoveElement__TGGNode_TGGNode_TGGNode() {
		return java2classAxiom_adapted_axiom_adaptedEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classAxiom_adapted_axiom_adapted__TransformForward__TGGNode_boolean_boolean() {
		return java2classAxiom_adapted_axiom_adaptedEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classAxiom_adapted_axiom_adapted__TransformMapping__TGGNode_boolean_boolean() {
		return java2classAxiom_adapted_axiom_adaptedEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classAxiom_adapted_axiom_adapted__TransformBackward__TGGNode_boolean_boolean() {
		return java2classAxiom_adapted_axiom_adaptedEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classAxiom_adapted_axiom_adapted__ConflictCheckForward__TGGNode() {
		return java2classAxiom_adapted_axiom_adaptedEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classAxiom_adapted_axiom_adapted__ConflictCheckMapping__TGGNode() {
		return java2classAxiom_adapted_axiom_adaptedEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classAxiom_adapted_axiom_adapted__ConflictCheckBackward__TGGNode() {
		return java2classAxiom_adapted_axiom_adaptedEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classAxiom_adapted_axiom_adapted__SynchronizeForward__TGGNode_boolean() {
		return java2classAxiom_adapted_axiom_adaptedEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classAxiom_adapted_axiom_adapted__SynchronizeBackward__TGGNode_boolean() {
		return java2classAxiom_adapted_axiom_adaptedEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classAxiom_adapted_axiom_adapted__RepairForward__TGGNode_boolean() {
		return java2classAxiom_adapted_axiom_adaptedEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getjava2classAxiom_adapted_axiom_adapted__RepairBackward__TGGNode_boolean() {
		return java2classAxiom_adapted_axiom_adaptedEClass.getEOperations().get(12);
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
		java2class_adaptedOperationalTGGEClass = createEClass(JAVA2CLASS_ADAPTED_OPERATIONAL_TGG);

		history2History2EClass = createEClass(HISTORY2_HISTORY2);

		java2classAxiom_adaptedEClass = createEClass(JAVA2CLASS_AXIOM_ADAPTED);

		java2classPkg_adaptedEClass = createEClass(JAVA2CLASS_PKG_ADAPTED);

		java2classChildPkg_adaptedEClass = createEClass(JAVA2CLASS_CHILD_PKG_ADAPTED);

		java2classClassDeclaration2Class_adaptedEClass = createEClass(JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED);

		java2classField2Association_adaptedEClass = createEClass(JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED);

		history2History2_History2HistoryEClass = createEClass(HISTORY2_HISTORY2_HISTORY2_HISTORY);
		createEReference(history2History2_History2HistoryEClass,
				HISTORY2_HISTORY2_HISTORY2_HISTORY__ADD_ELEMENT_ACTIVITY);
		createEReference(history2History2_History2HistoryEClass,
				HISTORY2_HISTORY2_HISTORY2_HISTORY__MOVE_ELEMENT_ACTIVITY);
		createEReference(history2History2_History2HistoryEClass,
				HISTORY2_HISTORY2_HISTORY2_HISTORY__CHANGE_ATTRIBUTE_ACTIVITY);
		createEReference(history2History2_History2HistoryEClass,
				HISTORY2_HISTORY2_HISTORY2_HISTORY__TRANSFORM_FORWARD_ACTIVITY);
		createEReference(history2History2_History2HistoryEClass,
				HISTORY2_HISTORY2_HISTORY2_HISTORY__TRANSFORM_MAPPING_ACTIVITY);
		createEReference(history2History2_History2HistoryEClass,
				HISTORY2_HISTORY2_HISTORY2_HISTORY__TRANSFORM_BACKWARD_ACTIVITY);
		createEReference(history2History2_History2HistoryEClass,
				HISTORY2_HISTORY2_HISTORY2_HISTORY__SYNCHRONIZE_FORWARD_ACTIVITY);
		createEReference(history2History2_History2HistoryEClass,
				HISTORY2_HISTORY2_HISTORY2_HISTORY__SYNCHRONIZE_BACKWARD_ACTIVITY);
		createEOperation(history2History2_History2HistoryEClass,
				HISTORY2_HISTORY2_HISTORY2_HISTORY___ADD_ELEMENT__EMAP_ELIST_ELIST);
		createEOperation(history2History2_History2HistoryEClass,
				HISTORY2_HISTORY2_HISTORY2_HISTORY___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP);
		createEOperation(history2History2_History2HistoryEClass,
				HISTORY2_HISTORY2_HISTORY2_HISTORY___TRANSFORM_FORWARD__ELIST_ELIST_BOOLEAN);
		createEOperation(history2History2_History2HistoryEClass,
				HISTORY2_HISTORY2_HISTORY2_HISTORY___TRANSFORM_MAPPING__ELIST_ELIST_BOOLEAN);
		createEOperation(history2History2_History2HistoryEClass,
				HISTORY2_HISTORY2_HISTORY2_HISTORY___TRANSFORM_BACKWARD__ELIST_ELIST_BOOLEAN);
		createEOperation(history2History2_History2HistoryEClass,
				HISTORY2_HISTORY2_HISTORY2_HISTORY___SYNCHRONIZE_FORWARD__ELIST_ELIST_TGGNODE_BOOLEAN);
		createEOperation(history2History2_History2HistoryEClass,
				HISTORY2_HISTORY2_HISTORY2_HISTORY___SYNCHRONIZE_BACKWARD__ELIST_ELIST_TGGNODE_BOOLEAN);

		java2classPkg_adapted_pkg_adaptedEClass = createEClass(JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED);
		createEReference(java2classPkg_adapted_pkg_adaptedEClass,
				JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED__ADD_ELEMENT_ACTIVITY);
		createEReference(java2classPkg_adapted_pkg_adaptedEClass,
				JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED__MOVE_ELEMENT_ACTIVITY);
		createEReference(java2classPkg_adapted_pkg_adaptedEClass,
				JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED__CHANGE_ATTRIBUTE_ACTIVITY);
		createEReference(java2classPkg_adapted_pkg_adaptedEClass,
				JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED__TRANSFORM_FORWARD_ACTIVITY);
		createEReference(java2classPkg_adapted_pkg_adaptedEClass,
				JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED__TRANSFORM_MAPPING_ACTIVITY);
		createEReference(java2classPkg_adapted_pkg_adaptedEClass,
				JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED__TRANSFORM_BACKWARD_ACTIVITY);
		createEReference(java2classPkg_adapted_pkg_adaptedEClass,
				JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED__CONFLICT_CHECK_FORWARD_ACTIVITY);
		createEReference(java2classPkg_adapted_pkg_adaptedEClass,
				JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED__CONFLICT_CHECK_MAPPING_ACTIVITY);
		createEReference(java2classPkg_adapted_pkg_adaptedEClass,
				JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED__CONFLICT_CHECK_BACKWARD_ACTIVITY);
		createEReference(java2classPkg_adapted_pkg_adaptedEClass,
				JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED__SYNCHRONIZE_FORWARD_ACTIVITY);
		createEReference(java2classPkg_adapted_pkg_adaptedEClass,
				JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED__SYNCHRONIZE_BACKWARD_ACTIVITY);
		createEReference(java2classPkg_adapted_pkg_adaptedEClass,
				JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED__REPAIR_FORWARD_ACTIVITY);
		createEReference(java2classPkg_adapted_pkg_adaptedEClass,
				JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED__REPAIR_BACKWARD_ACTIVITY);
		createEOperation(java2classPkg_adapted_pkg_adaptedEClass,
				JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED___ADD_ELEMENT__EMAP);
		createEOperation(java2classPkg_adapted_pkg_adaptedEClass,
				JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP);
		createEOperation(java2classPkg_adapted_pkg_adaptedEClass,
				JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE);
		createEOperation(java2classPkg_adapted_pkg_adaptedEClass,
				JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN);
		createEOperation(java2classPkg_adapted_pkg_adaptedEClass,
				JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN);
		createEOperation(java2classPkg_adapted_pkg_adaptedEClass,
				JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN);
		createEOperation(java2classPkg_adapted_pkg_adaptedEClass,
				JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED___CONFLICT_CHECK_FORWARD__TGGNODE);
		createEOperation(java2classPkg_adapted_pkg_adaptedEClass,
				JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED___CONFLICT_CHECK_MAPPING__TGGNODE);
		createEOperation(java2classPkg_adapted_pkg_adaptedEClass,
				JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED___CONFLICT_CHECK_BACKWARD__TGGNODE);
		createEOperation(java2classPkg_adapted_pkg_adaptedEClass,
				JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN);
		createEOperation(java2classPkg_adapted_pkg_adaptedEClass,
				JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN);
		createEOperation(java2classPkg_adapted_pkg_adaptedEClass,
				JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED___REPAIR_FORWARD__TGGNODE_BOOLEAN);
		createEOperation(java2classPkg_adapted_pkg_adaptedEClass,
				JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED___REPAIR_BACKWARD__TGGNODE_BOOLEAN);

		java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adaptedEClass = createEClass(
				JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED);
		createEReference(java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adaptedEClass,
				JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED__ADD_ELEMENT_ACTIVITY);
		createEReference(java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adaptedEClass,
				JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED__MOVE_ELEMENT_ACTIVITY);
		createEReference(java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adaptedEClass,
				JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED__CHANGE_ATTRIBUTE_ACTIVITY);
		createEReference(java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adaptedEClass,
				JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED__TRANSFORM_FORWARD_ACTIVITY);
		createEReference(java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adaptedEClass,
				JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED__TRANSFORM_MAPPING_ACTIVITY);
		createEReference(java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adaptedEClass,
				JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED__TRANSFORM_BACKWARD_ACTIVITY);
		createEReference(java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adaptedEClass,
				JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED__CONFLICT_CHECK_FORWARD_ACTIVITY);
		createEReference(java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adaptedEClass,
				JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED__CONFLICT_CHECK_MAPPING_ACTIVITY);
		createEReference(java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adaptedEClass,
				JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED__CONFLICT_CHECK_BACKWARD_ACTIVITY);
		createEReference(java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adaptedEClass,
				JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED__SYNCHRONIZE_FORWARD_ACTIVITY);
		createEReference(java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adaptedEClass,
				JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED__SYNCHRONIZE_BACKWARD_ACTIVITY);
		createEReference(java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adaptedEClass,
				JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED__REPAIR_FORWARD_ACTIVITY);
		createEReference(java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adaptedEClass,
				JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED__REPAIR_BACKWARD_ACTIVITY);
		createEOperation(java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adaptedEClass,
				JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED___ADD_ELEMENT__EMAP);
		createEOperation(java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adaptedEClass,
				JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP);
		createEOperation(java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adaptedEClass,
				JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE);
		createEOperation(java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adaptedEClass,
				JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN);
		createEOperation(java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adaptedEClass,
				JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN);
		createEOperation(java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adaptedEClass,
				JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN);
		createEOperation(java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adaptedEClass,
				JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED___CONFLICT_CHECK_FORWARD__TGGNODE);
		createEOperation(java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adaptedEClass,
				JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED___CONFLICT_CHECK_MAPPING__TGGNODE);
		createEOperation(java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adaptedEClass,
				JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED___CONFLICT_CHECK_BACKWARD__TGGNODE);
		createEOperation(java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adaptedEClass,
				JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN);
		createEOperation(java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adaptedEClass,
				JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN);
		createEOperation(java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adaptedEClass,
				JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED___REPAIR_FORWARD__TGGNODE_BOOLEAN);
		createEOperation(java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adaptedEClass,
				JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED___REPAIR_BACKWARD__TGGNODE_BOOLEAN);

		java2classField2Association_adapted_java2classField2Association_adaptedEClass = createEClass(
				JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED);
		createEReference(java2classField2Association_adapted_java2classField2Association_adaptedEClass,
				JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__ADD_ELEMENT_ACTIVITY);
		createEReference(java2classField2Association_adapted_java2classField2Association_adaptedEClass,
				JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__MOVE_ELEMENT_ACTIVITY);
		createEReference(java2classField2Association_adapted_java2classField2Association_adaptedEClass,
				JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__CHANGE_ATTRIBUTE_ACTIVITY);
		createEReference(java2classField2Association_adapted_java2classField2Association_adaptedEClass,
				JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__TRANSFORM_FORWARD_ACTIVITY);
		createEReference(java2classField2Association_adapted_java2classField2Association_adaptedEClass,
				JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__TRANSFORM_MAPPING_ACTIVITY);
		createEReference(java2classField2Association_adapted_java2classField2Association_adaptedEClass,
				JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__TRANSFORM_BACKWARD_ACTIVITY);
		createEReference(java2classField2Association_adapted_java2classField2Association_adaptedEClass,
				JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__CONFLICT_CHECK_FORWARD_ACTIVITY);
		createEReference(java2classField2Association_adapted_java2classField2Association_adaptedEClass,
				JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__CONFLICT_CHECK_MAPPING_ACTIVITY);
		createEReference(java2classField2Association_adapted_java2classField2Association_adaptedEClass,
				JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__CONFLICT_CHECK_BACKWARD_ACTIVITY);
		createEReference(java2classField2Association_adapted_java2classField2Association_adaptedEClass,
				JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__SYNCHRONIZE_FORWARD_ACTIVITY);
		createEReference(java2classField2Association_adapted_java2classField2Association_adaptedEClass,
				JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__SYNCHRONIZE_BACKWARD_ACTIVITY);
		createEReference(java2classField2Association_adapted_java2classField2Association_adaptedEClass,
				JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__REPAIR_FORWARD_ACTIVITY);
		createEReference(java2classField2Association_adapted_java2classField2Association_adaptedEClass,
				JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__REPAIR_BACKWARD_ACTIVITY);
		createEOperation(java2classField2Association_adapted_java2classField2Association_adaptedEClass,
				JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED___ADD_ELEMENT__EMAP);
		createEOperation(java2classField2Association_adapted_java2classField2Association_adaptedEClass,
				JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP);
		createEOperation(java2classField2Association_adapted_java2classField2Association_adaptedEClass,
				JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE);
		createEOperation(java2classField2Association_adapted_java2classField2Association_adaptedEClass,
				JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN);
		createEOperation(java2classField2Association_adapted_java2classField2Association_adaptedEClass,
				JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN);
		createEOperation(java2classField2Association_adapted_java2classField2Association_adaptedEClass,
				JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN);
		createEOperation(java2classField2Association_adapted_java2classField2Association_adaptedEClass,
				JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED___CONFLICT_CHECK_FORWARD__TGGNODE);
		createEOperation(java2classField2Association_adapted_java2classField2Association_adaptedEClass,
				JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED___CONFLICT_CHECK_MAPPING__TGGNODE);
		createEOperation(java2classField2Association_adapted_java2classField2Association_adaptedEClass,
				JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED___CONFLICT_CHECK_BACKWARD__TGGNODE);
		createEOperation(java2classField2Association_adapted_java2classField2Association_adaptedEClass,
				JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN);
		createEOperation(java2classField2Association_adapted_java2classField2Association_adaptedEClass,
				JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN);
		createEOperation(java2classField2Association_adapted_java2classField2Association_adaptedEClass,
				JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED___REPAIR_FORWARD__TGGNODE_BOOLEAN);
		createEOperation(java2classField2Association_adapted_java2classField2Association_adaptedEClass,
				JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED___REPAIR_BACKWARD__TGGNODE_BOOLEAN);

		java2classChildPkg_adapted_childPkg_adaptedEClass = createEClass(
				JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED);
		createEReference(java2classChildPkg_adapted_childPkg_adaptedEClass,
				JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED__ADD_ELEMENT_ACTIVITY);
		createEReference(java2classChildPkg_adapted_childPkg_adaptedEClass,
				JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED__MOVE_ELEMENT_ACTIVITY);
		createEReference(java2classChildPkg_adapted_childPkg_adaptedEClass,
				JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED__CHANGE_ATTRIBUTE_ACTIVITY);
		createEReference(java2classChildPkg_adapted_childPkg_adaptedEClass,
				JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED__TRANSFORM_FORWARD_ACTIVITY);
		createEReference(java2classChildPkg_adapted_childPkg_adaptedEClass,
				JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED__TRANSFORM_MAPPING_ACTIVITY);
		createEReference(java2classChildPkg_adapted_childPkg_adaptedEClass,
				JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED__TRANSFORM_BACKWARD_ACTIVITY);
		createEReference(java2classChildPkg_adapted_childPkg_adaptedEClass,
				JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED__CONFLICT_CHECK_FORWARD_ACTIVITY);
		createEReference(java2classChildPkg_adapted_childPkg_adaptedEClass,
				JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED__CONFLICT_CHECK_MAPPING_ACTIVITY);
		createEReference(java2classChildPkg_adapted_childPkg_adaptedEClass,
				JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED__CONFLICT_CHECK_BACKWARD_ACTIVITY);
		createEReference(java2classChildPkg_adapted_childPkg_adaptedEClass,
				JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED__SYNCHRONIZE_FORWARD_ACTIVITY);
		createEReference(java2classChildPkg_adapted_childPkg_adaptedEClass,
				JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED__SYNCHRONIZE_BACKWARD_ACTIVITY);
		createEReference(java2classChildPkg_adapted_childPkg_adaptedEClass,
				JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED__REPAIR_FORWARD_ACTIVITY);
		createEReference(java2classChildPkg_adapted_childPkg_adaptedEClass,
				JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED__REPAIR_BACKWARD_ACTIVITY);
		createEOperation(java2classChildPkg_adapted_childPkg_adaptedEClass,
				JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED___ADD_ELEMENT__EMAP);
		createEOperation(java2classChildPkg_adapted_childPkg_adaptedEClass,
				JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP);
		createEOperation(java2classChildPkg_adapted_childPkg_adaptedEClass,
				JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE);
		createEOperation(java2classChildPkg_adapted_childPkg_adaptedEClass,
				JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN);
		createEOperation(java2classChildPkg_adapted_childPkg_adaptedEClass,
				JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN);
		createEOperation(java2classChildPkg_adapted_childPkg_adaptedEClass,
				JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN);
		createEOperation(java2classChildPkg_adapted_childPkg_adaptedEClass,
				JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED___CONFLICT_CHECK_FORWARD__TGGNODE);
		createEOperation(java2classChildPkg_adapted_childPkg_adaptedEClass,
				JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED___CONFLICT_CHECK_MAPPING__TGGNODE);
		createEOperation(java2classChildPkg_adapted_childPkg_adaptedEClass,
				JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED___CONFLICT_CHECK_BACKWARD__TGGNODE);
		createEOperation(java2classChildPkg_adapted_childPkg_adaptedEClass,
				JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN);
		createEOperation(java2classChildPkg_adapted_childPkg_adaptedEClass,
				JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN);
		createEOperation(java2classChildPkg_adapted_childPkg_adaptedEClass,
				JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED___REPAIR_FORWARD__TGGNODE_BOOLEAN);
		createEOperation(java2classChildPkg_adapted_childPkg_adaptedEClass,
				JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED___REPAIR_BACKWARD__TGGNODE_BOOLEAN);

		java2classAxiom_adapted_axiom_adaptedEClass = createEClass(JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED);
		createEReference(java2classAxiom_adapted_axiom_adaptedEClass,
				JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED__ADD_ELEMENT_ACTIVITY);
		createEReference(java2classAxiom_adapted_axiom_adaptedEClass,
				JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED__MOVE_ELEMENT_ACTIVITY);
		createEReference(java2classAxiom_adapted_axiom_adaptedEClass,
				JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED__CHANGE_ATTRIBUTE_ACTIVITY);
		createEReference(java2classAxiom_adapted_axiom_adaptedEClass,
				JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED__TRANSFORM_FORWARD_ACTIVITY);
		createEReference(java2classAxiom_adapted_axiom_adaptedEClass,
				JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED__TRANSFORM_MAPPING_ACTIVITY);
		createEReference(java2classAxiom_adapted_axiom_adaptedEClass,
				JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED__TRANSFORM_BACKWARD_ACTIVITY);
		createEReference(java2classAxiom_adapted_axiom_adaptedEClass,
				JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED__CONFLICT_CHECK_FORWARD_ACTIVITY);
		createEReference(java2classAxiom_adapted_axiom_adaptedEClass,
				JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED__CONFLICT_CHECK_MAPPING_ACTIVITY);
		createEReference(java2classAxiom_adapted_axiom_adaptedEClass,
				JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED__CONFLICT_CHECK_BACKWARD_ACTIVITY);
		createEReference(java2classAxiom_adapted_axiom_adaptedEClass,
				JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED__SYNCHRONIZE_FORWARD_ACTIVITY);
		createEReference(java2classAxiom_adapted_axiom_adaptedEClass,
				JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED__SYNCHRONIZE_BACKWARD_ACTIVITY);
		createEReference(java2classAxiom_adapted_axiom_adaptedEClass,
				JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED__REPAIR_FORWARD_ACTIVITY);
		createEReference(java2classAxiom_adapted_axiom_adaptedEClass,
				JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED__REPAIR_BACKWARD_ACTIVITY);
		createEOperation(java2classAxiom_adapted_axiom_adaptedEClass,
				JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED___ADD_ELEMENT__EMAP);
		createEOperation(java2classAxiom_adapted_axiom_adaptedEClass,
				JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP);
		createEOperation(java2classAxiom_adapted_axiom_adaptedEClass,
				JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE);
		createEOperation(java2classAxiom_adapted_axiom_adaptedEClass,
				JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN);
		createEOperation(java2classAxiom_adapted_axiom_adaptedEClass,
				JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN);
		createEOperation(java2classAxiom_adapted_axiom_adaptedEClass,
				JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN);
		createEOperation(java2classAxiom_adapted_axiom_adaptedEClass,
				JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED___CONFLICT_CHECK_FORWARD__TGGNODE);
		createEOperation(java2classAxiom_adapted_axiom_adaptedEClass,
				JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED___CONFLICT_CHECK_MAPPING__TGGNODE);
		createEOperation(java2classAxiom_adapted_axiom_adaptedEClass,
				JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED___CONFLICT_CHECK_BACKWARD__TGGNODE);
		createEOperation(java2classAxiom_adapted_axiom_adaptedEClass,
				JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN);
		createEOperation(java2classAxiom_adapted_axiom_adaptedEClass,
				JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN);
		createEOperation(java2classAxiom_adapted_axiom_adaptedEClass,
				JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED___REPAIR_FORWARD__TGGNODE_BOOLEAN);
		createEOperation(java2classAxiom_adapted_axiom_adaptedEClass,
				JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED___REPAIR_BACKWARD__TGGNODE_BOOLEAN);
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
		java2class_adaptedOperationalTGGEClass.getESuperTypes().add(theSdmPackage.getSdmOperationalTGG());
		history2History2EClass.getESuperTypes().add(theOperationalTGGPackage.getOperationalAxiomGroup());
		java2classAxiom_adaptedEClass.getESuperTypes().add(theOperationalTGGPackage.getOperationalRuleGroup());
		java2classPkg_adaptedEClass.getESuperTypes().add(theOperationalTGGPackage.getOperationalRuleGroup());
		java2classChildPkg_adaptedEClass.getESuperTypes().add(theOperationalTGGPackage.getOperationalRuleGroup());
		java2classClassDeclaration2Class_adaptedEClass.getESuperTypes()
				.add(theOperationalTGGPackage.getOperationalRuleGroup());
		java2classField2Association_adaptedEClass.getESuperTypes()
				.add(theOperationalTGGPackage.getOperationalRuleGroup());
		history2History2_History2HistoryEClass.getESuperTypes().add(theOperationalTGGPackage.getOperationalAxiom());
		java2classPkg_adapted_pkg_adaptedEClass.getESuperTypes().add(theOperationalTGGPackage.getOperationalRule());
		java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adaptedEClass.getESuperTypes()
				.add(theOperationalTGGPackage.getOperationalRule());
		java2classField2Association_adapted_java2classField2Association_adaptedEClass.getESuperTypes()
				.add(theOperationalTGGPackage.getOperationalRule());
		java2classChildPkg_adapted_childPkg_adaptedEClass.getESuperTypes()
				.add(theOperationalTGGPackage.getOperationalRule());
		java2classAxiom_adapted_axiom_adaptedEClass.getESuperTypes().add(theOperationalTGGPackage.getOperationalRule());

		// Initialize classes, features, and operations; add parameters
		initEClass(java2class_adaptedOperationalTGGEClass, java2class_adaptedOperationalTGG.class,
				"java2class_adaptedOperationalTGG", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(history2History2EClass, History2History2.class, "History2History2", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(java2classAxiom_adaptedEClass, java2classAxiom_adapted.class, "java2classAxiom_adapted",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(java2classPkg_adaptedEClass, java2classPkg_adapted.class, "java2classPkg_adapted", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(java2classChildPkg_adaptedEClass, java2classChildPkg_adapted.class, "java2classChildPkg_adapted",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(java2classClassDeclaration2Class_adaptedEClass, java2classClassDeclaration2Class_adapted.class,
				"java2classClassDeclaration2Class_adapted", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(java2classField2Association_adaptedEClass, java2classField2Association_adapted.class,
				"java2classField2Association_adapted", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(history2History2_History2HistoryEClass, History2History2_History2History.class,
				"History2History2_History2History", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHistory2History2_History2History_AddElementActivity(), theMlsdmPackage.getActivity(), null,
				"addElementActivity", null, 1, 1, History2History2_History2History.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHistory2History2_History2History_MoveElementActivity(), theMlsdmPackage.getActivity(), null,
				"moveElementActivity", null, 1, 1, History2History2_History2History.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHistory2History2_History2History_ChangeAttributeActivity(), theMlsdmPackage.getActivity(),
				null, "changeAttributeActivity", null, 1, 1, History2History2_History2History.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getHistory2History2_History2History_TransformForwardActivity(), theMlsdmPackage.getActivity(),
				null, "transformForwardActivity", null, 1, 1, History2History2_History2History.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getHistory2History2_History2History_TransformMappingActivity(), theMlsdmPackage.getActivity(),
				null, "transformMappingActivity", null, 1, 1, History2History2_History2History.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getHistory2History2_History2History_TransformBackwardActivity(), theMlsdmPackage.getActivity(),
				null, "transformBackwardActivity", null, 1, 1, History2History2_History2History.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getHistory2History2_History2History_SynchronizeForwardActivity(), theMlsdmPackage.getActivity(),
				null, "synchronizeForwardActivity", null, 1, 1, History2History2_History2History.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getHistory2History2_History2History_SynchronizeBackwardActivity(), theMlsdmPackage.getActivity(),
				null, "synchronizeBackwardActivity", null, 1, 1, History2History2_History2History.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		EOperation op = initEOperation(getHistory2History2_History2History__AddElement__EMap_EList_EList(),
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

		op = initEOperation(getHistory2History2_History2History__ChangeAttributeValues__TGGNode_EMap(),
				ecorePackage.getEBoolean(), "changeAttributeValues", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "correspondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theHelpersPackage.getMapEntry());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "ruleParameters", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getHistory2History2_History2History__TransformForward__EList_EList_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformForward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "leftInputElements", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "rightInputElements", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getHistory2History2_History2History__TransformMapping__EList_EList_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformMapping", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "leftInputElements", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "rightInputElements", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getHistory2History2_History2History__TransformBackward__EList_EList_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformBackward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "leftInputElements", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "rightInputElements", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getHistory2History2_History2History__SynchronizeForward__EList_EList_TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "synchronizeForward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "leftInputElements", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "rightInputElements", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getHistory2History2_History2History__SynchronizeBackward__EList_EList_TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "synchronizeBackward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "leftInputElements", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "rightInputElements", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		initEClass(java2classPkg_adapted_pkg_adaptedEClass, java2classPkg_adapted_pkg_adapted.class,
				"java2classPkg_adapted_pkg_adapted", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getjava2classPkg_adapted_pkg_adapted_AddElementActivity(), theMlsdmPackage.getActivity(), null,
				"addElementActivity", null, 1, 1, java2classPkg_adapted_pkg_adapted.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classPkg_adapted_pkg_adapted_MoveElementActivity(), theMlsdmPackage.getActivity(), null,
				"moveElementActivity", null, 1, 1, java2classPkg_adapted_pkg_adapted.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classPkg_adapted_pkg_adapted_ChangeAttributeActivity(), theMlsdmPackage.getActivity(),
				null, "changeAttributeActivity", null, 1, 1, java2classPkg_adapted_pkg_adapted.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getjava2classPkg_adapted_pkg_adapted_TransformForwardActivity(), theMlsdmPackage.getActivity(),
				null, "transformForwardActivity", null, 1, 1, java2classPkg_adapted_pkg_adapted.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getjava2classPkg_adapted_pkg_adapted_TransformMappingActivity(), theMlsdmPackage.getActivity(),
				null, "transformMappingActivity", null, 1, 1, java2classPkg_adapted_pkg_adapted.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getjava2classPkg_adapted_pkg_adapted_TransformBackwardActivity(), theMlsdmPackage.getActivity(),
				null, "transformBackwardActivity", null, 1, 1, java2classPkg_adapted_pkg_adapted.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getjava2classPkg_adapted_pkg_adapted_ConflictCheckForwardActivity(),
				theMlsdmPackage.getActivity(), null, "conflictCheckForwardActivity", null, 1, 1,
				java2classPkg_adapted_pkg_adapted.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classPkg_adapted_pkg_adapted_ConflictCheckMappingActivity(),
				theMlsdmPackage.getActivity(), null, "conflictCheckMappingActivity", null, 1, 1,
				java2classPkg_adapted_pkg_adapted.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classPkg_adapted_pkg_adapted_ConflictCheckBackwardActivity(),
				theMlsdmPackage.getActivity(), null, "conflictCheckBackwardActivity", null, 1, 1,
				java2classPkg_adapted_pkg_adapted.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classPkg_adapted_pkg_adapted_SynchronizeForwardActivity(), theMlsdmPackage.getActivity(),
				null, "synchronizeForwardActivity", null, 1, 1, java2classPkg_adapted_pkg_adapted.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getjava2classPkg_adapted_pkg_adapted_SynchronizeBackwardActivity(),
				theMlsdmPackage.getActivity(), null, "synchronizeBackwardActivity", null, 1, 1,
				java2classPkg_adapted_pkg_adapted.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classPkg_adapted_pkg_adapted_RepairForwardActivity(), theMlsdmPackage.getActivity(),
				null, "repairForwardActivity", null, 1, 1, java2classPkg_adapted_pkg_adapted.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getjava2classPkg_adapted_pkg_adapted_RepairBackwardActivity(), theMlsdmPackage.getActivity(),
				null, "repairBackwardActivity", null, 1, 1, java2classPkg_adapted_pkg_adapted.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		op = initEOperation(getjava2classPkg_adapted_pkg_adapted__AddElement__EMap(), theMote2Package.getTGGNode(),
				"addElement", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theHelpersPackage.getMapEntry());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "parameters", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getjava2classPkg_adapted_pkg_adapted__ChangeAttributeValues__TGGNode_EMap(),
				ecorePackage.getEBoolean(), "changeAttributeValues", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "correspondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theHelpersPackage.getMapEntry());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "ruleParameters", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getjava2classPkg_adapted_pkg_adapted__MoveElement__TGGNode_TGGNode_TGGNode(),
				ecorePackage.getEBoolean(), "moveElement", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "correspondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "oldPreviousCorrespondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "newPreviousCorrespondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getjava2classPkg_adapted_pkg_adapted__TransformForward__TGGNode_boolean_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformForward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "considerAllLhsCorrNodes", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getjava2classPkg_adapted_pkg_adapted__TransformMapping__TGGNode_boolean_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformMapping", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "considerAllLhsCorrNodes", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getjava2classPkg_adapted_pkg_adapted__TransformBackward__TGGNode_boolean_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformBackward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "considerAllLhsCorrNodes", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getjava2classPkg_adapted_pkg_adapted__ConflictCheckForward__TGGNode(),
				ecorePackage.getEObject(), "conflictCheckForward", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getjava2classPkg_adapted_pkg_adapted__ConflictCheckMapping__TGGNode(),
				ecorePackage.getEObject(), "conflictCheckMapping", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getjava2classPkg_adapted_pkg_adapted__ConflictCheckBackward__TGGNode(),
				ecorePackage.getEObject(), "conflictCheckBackward", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getjava2classPkg_adapted_pkg_adapted__SynchronizeForward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "synchronizeForward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getjava2classPkg_adapted_pkg_adapted__SynchronizeBackward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "synchronizeBackward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getjava2classPkg_adapted_pkg_adapted__RepairForward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "repairForward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getjava2classPkg_adapted_pkg_adapted__RepairBackward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "repairBackward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		initEClass(java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adaptedEClass,
				java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted.class,
				"java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
				getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted_AddElementActivity(),
				theMlsdmPackage.getActivity(), null, "addElementActivity", null, 1, 1,
				java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(
				getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted_MoveElementActivity(),
				theMlsdmPackage.getActivity(), null, "moveElementActivity", null, 1, 1,
				java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(
				getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted_ChangeAttributeActivity(),
				theMlsdmPackage.getActivity(), null, "changeAttributeActivity", null, 1, 1,
				java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(
				getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted_TransformForwardActivity(),
				theMlsdmPackage.getActivity(), null, "transformForwardActivity", null, 1, 1,
				java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(
				getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted_TransformMappingActivity(),
				theMlsdmPackage.getActivity(), null, "transformMappingActivity", null, 1, 1,
				java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(
				getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted_TransformBackwardActivity(),
				theMlsdmPackage.getActivity(), null, "transformBackwardActivity", null, 1, 1,
				java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(
				getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted_ConflictCheckForwardActivity(),
				theMlsdmPackage.getActivity(), null, "conflictCheckForwardActivity", null, 1, 1,
				java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(
				getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted_ConflictCheckMappingActivity(),
				theMlsdmPackage.getActivity(), null, "conflictCheckMappingActivity", null, 1, 1,
				java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(
				getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted_ConflictCheckBackwardActivity(),
				theMlsdmPackage.getActivity(), null, "conflictCheckBackwardActivity", null, 1, 1,
				java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(
				getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted_SynchronizeForwardActivity(),
				theMlsdmPackage.getActivity(), null, "synchronizeForwardActivity", null, 1, 1,
				java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(
				getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted_SynchronizeBackwardActivity(),
				theMlsdmPackage.getActivity(), null, "synchronizeBackwardActivity", null, 1, 1,
				java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(
				getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted_RepairForwardActivity(),
				theMlsdmPackage.getActivity(), null, "repairForwardActivity", null, 1, 1,
				java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(
				getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted_RepairBackwardActivity(),
				theMlsdmPackage.getActivity(), null, "repairBackwardActivity", null, 1, 1,
				java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		op = initEOperation(
				getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted__AddElement__EMap(),
				theMote2Package.getTGGNode(), "addElement", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theHelpersPackage.getMapEntry());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "parameters", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(
				getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted__ChangeAttributeValues__TGGNode_EMap(),
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
				getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted__MoveElement__TGGNode_TGGNode_TGGNode(),
				ecorePackage.getEBoolean(), "moveElement", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "correspondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "oldPreviousCorrespondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "newPreviousCorrespondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(
				getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted__TransformForward__TGGNode_boolean_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformForward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "considerAllLhsCorrNodes", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(
				getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted__TransformMapping__TGGNode_boolean_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformMapping", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "considerAllLhsCorrNodes", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(
				getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted__TransformBackward__TGGNode_boolean_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformBackward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "considerAllLhsCorrNodes", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(
				getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted__ConflictCheckForward__TGGNode(),
				ecorePackage.getEObject(), "conflictCheckForward", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(
				getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted__ConflictCheckMapping__TGGNode(),
				ecorePackage.getEObject(), "conflictCheckMapping", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(
				getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted__ConflictCheckBackward__TGGNode(),
				ecorePackage.getEObject(), "conflictCheckBackward", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(
				getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted__SynchronizeForward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "synchronizeForward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(
				getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted__SynchronizeBackward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "synchronizeBackward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(
				getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted__RepairForward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "repairForward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(
				getjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted__RepairBackward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "repairBackward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		initEClass(java2classField2Association_adapted_java2classField2Association_adaptedEClass,
				java2classField2Association_adapted_java2classField2Association_adapted.class,
				"java2classField2Association_adapted_java2classField2Association_adapted", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getjava2classField2Association_adapted_java2classField2Association_adapted_AddElementActivity(),
				theMlsdmPackage.getActivity(), null, "addElementActivity", null, 1, 1,
				java2classField2Association_adapted_java2classField2Association_adapted.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getjava2classField2Association_adapted_java2classField2Association_adapted_MoveElementActivity(),
				theMlsdmPackage.getActivity(), null, "moveElementActivity", null, 1, 1,
				java2classField2Association_adapted_java2classField2Association_adapted.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(
				getjava2classField2Association_adapted_java2classField2Association_adapted_ChangeAttributeActivity(),
				theMlsdmPackage.getActivity(), null, "changeAttributeActivity", null, 1, 1,
				java2classField2Association_adapted_java2classField2Association_adapted.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(
				getjava2classField2Association_adapted_java2classField2Association_adapted_TransformForwardActivity(),
				theMlsdmPackage.getActivity(), null, "transformForwardActivity", null, 1, 1,
				java2classField2Association_adapted_java2classField2Association_adapted.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(
				getjava2classField2Association_adapted_java2classField2Association_adapted_TransformMappingActivity(),
				theMlsdmPackage.getActivity(), null, "transformMappingActivity", null, 1, 1,
				java2classField2Association_adapted_java2classField2Association_adapted.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(
				getjava2classField2Association_adapted_java2classField2Association_adapted_TransformBackwardActivity(),
				theMlsdmPackage.getActivity(), null, "transformBackwardActivity", null, 1, 1,
				java2classField2Association_adapted_java2classField2Association_adapted.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(
				getjava2classField2Association_adapted_java2classField2Association_adapted_ConflictCheckForwardActivity(),
				theMlsdmPackage.getActivity(), null, "conflictCheckForwardActivity", null, 1, 1,
				java2classField2Association_adapted_java2classField2Association_adapted.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(
				getjava2classField2Association_adapted_java2classField2Association_adapted_ConflictCheckMappingActivity(),
				theMlsdmPackage.getActivity(), null, "conflictCheckMappingActivity", null, 1, 1,
				java2classField2Association_adapted_java2classField2Association_adapted.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(
				getjava2classField2Association_adapted_java2classField2Association_adapted_ConflictCheckBackwardActivity(),
				theMlsdmPackage.getActivity(), null, "conflictCheckBackwardActivity", null, 1, 1,
				java2classField2Association_adapted_java2classField2Association_adapted.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(
				getjava2classField2Association_adapted_java2classField2Association_adapted_SynchronizeForwardActivity(),
				theMlsdmPackage.getActivity(), null, "synchronizeForwardActivity", null, 1, 1,
				java2classField2Association_adapted_java2classField2Association_adapted.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(
				getjava2classField2Association_adapted_java2classField2Association_adapted_SynchronizeBackwardActivity(),
				theMlsdmPackage.getActivity(), null, "synchronizeBackwardActivity", null, 1, 1,
				java2classField2Association_adapted_java2classField2Association_adapted.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(
				getjava2classField2Association_adapted_java2classField2Association_adapted_RepairForwardActivity(),
				theMlsdmPackage.getActivity(), null, "repairForwardActivity", null, 1, 1,
				java2classField2Association_adapted_java2classField2Association_adapted.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(
				getjava2classField2Association_adapted_java2classField2Association_adapted_RepairBackwardActivity(),
				theMlsdmPackage.getActivity(), null, "repairBackwardActivity", null, 1, 1,
				java2classField2Association_adapted_java2classField2Association_adapted.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		op = initEOperation(
				getjava2classField2Association_adapted_java2classField2Association_adapted__AddElement__EMap(),
				theMote2Package.getTGGNode(), "addElement", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theHelpersPackage.getMapEntry());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "parameters", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(
				getjava2classField2Association_adapted_java2classField2Association_adapted__ChangeAttributeValues__TGGNode_EMap(),
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
				getjava2classField2Association_adapted_java2classField2Association_adapted__MoveElement__TGGNode_TGGNode_TGGNode(),
				ecorePackage.getEBoolean(), "moveElement", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "correspondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "oldPreviousCorrespondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "newPreviousCorrespondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(
				getjava2classField2Association_adapted_java2classField2Association_adapted__TransformForward__TGGNode_boolean_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformForward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "considerAllLhsCorrNodes", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(
				getjava2classField2Association_adapted_java2classField2Association_adapted__TransformMapping__TGGNode_boolean_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformMapping", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "considerAllLhsCorrNodes", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(
				getjava2classField2Association_adapted_java2classField2Association_adapted__TransformBackward__TGGNode_boolean_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformBackward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "considerAllLhsCorrNodes", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(
				getjava2classField2Association_adapted_java2classField2Association_adapted__ConflictCheckForward__TGGNode(),
				ecorePackage.getEObject(), "conflictCheckForward", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(
				getjava2classField2Association_adapted_java2classField2Association_adapted__ConflictCheckMapping__TGGNode(),
				ecorePackage.getEObject(), "conflictCheckMapping", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(
				getjava2classField2Association_adapted_java2classField2Association_adapted__ConflictCheckBackward__TGGNode(),
				ecorePackage.getEObject(), "conflictCheckBackward", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(
				getjava2classField2Association_adapted_java2classField2Association_adapted__SynchronizeForward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "synchronizeForward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(
				getjava2classField2Association_adapted_java2classField2Association_adapted__SynchronizeBackward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "synchronizeBackward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(
				getjava2classField2Association_adapted_java2classField2Association_adapted__RepairForward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "repairForward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(
				getjava2classField2Association_adapted_java2classField2Association_adapted__RepairBackward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "repairBackward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		initEClass(java2classChildPkg_adapted_childPkg_adaptedEClass, java2classChildPkg_adapted_childPkg_adapted.class,
				"java2classChildPkg_adapted_childPkg_adapted", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getjava2classChildPkg_adapted_childPkg_adapted_AddElementActivity(),
				theMlsdmPackage.getActivity(), null, "addElementActivity", null, 1, 1,
				java2classChildPkg_adapted_childPkg_adapted.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classChildPkg_adapted_childPkg_adapted_MoveElementActivity(),
				theMlsdmPackage.getActivity(), null, "moveElementActivity", null, 1, 1,
				java2classChildPkg_adapted_childPkg_adapted.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classChildPkg_adapted_childPkg_adapted_ChangeAttributeActivity(),
				theMlsdmPackage.getActivity(), null, "changeAttributeActivity", null, 1, 1,
				java2classChildPkg_adapted_childPkg_adapted.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classChildPkg_adapted_childPkg_adapted_TransformForwardActivity(),
				theMlsdmPackage.getActivity(), null, "transformForwardActivity", null, 1, 1,
				java2classChildPkg_adapted_childPkg_adapted.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classChildPkg_adapted_childPkg_adapted_TransformMappingActivity(),
				theMlsdmPackage.getActivity(), null, "transformMappingActivity", null, 1, 1,
				java2classChildPkg_adapted_childPkg_adapted.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classChildPkg_adapted_childPkg_adapted_TransformBackwardActivity(),
				theMlsdmPackage.getActivity(), null, "transformBackwardActivity", null, 1, 1,
				java2classChildPkg_adapted_childPkg_adapted.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classChildPkg_adapted_childPkg_adapted_ConflictCheckForwardActivity(),
				theMlsdmPackage.getActivity(), null, "conflictCheckForwardActivity", null, 1, 1,
				java2classChildPkg_adapted_childPkg_adapted.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classChildPkg_adapted_childPkg_adapted_ConflictCheckMappingActivity(),
				theMlsdmPackage.getActivity(), null, "conflictCheckMappingActivity", null, 1, 1,
				java2classChildPkg_adapted_childPkg_adapted.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classChildPkg_adapted_childPkg_adapted_ConflictCheckBackwardActivity(),
				theMlsdmPackage.getActivity(), null, "conflictCheckBackwardActivity", null, 1, 1,
				java2classChildPkg_adapted_childPkg_adapted.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classChildPkg_adapted_childPkg_adapted_SynchronizeForwardActivity(),
				theMlsdmPackage.getActivity(), null, "synchronizeForwardActivity", null, 1, 1,
				java2classChildPkg_adapted_childPkg_adapted.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classChildPkg_adapted_childPkg_adapted_SynchronizeBackwardActivity(),
				theMlsdmPackage.getActivity(), null, "synchronizeBackwardActivity", null, 1, 1,
				java2classChildPkg_adapted_childPkg_adapted.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classChildPkg_adapted_childPkg_adapted_RepairForwardActivity(),
				theMlsdmPackage.getActivity(), null, "repairForwardActivity", null, 1, 1,
				java2classChildPkg_adapted_childPkg_adapted.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classChildPkg_adapted_childPkg_adapted_RepairBackwardActivity(),
				theMlsdmPackage.getActivity(), null, "repairBackwardActivity", null, 1, 1,
				java2classChildPkg_adapted_childPkg_adapted.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getjava2classChildPkg_adapted_childPkg_adapted__AddElement__EMap(),
				theMote2Package.getTGGNode(), "addElement", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theHelpersPackage.getMapEntry());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "parameters", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getjava2classChildPkg_adapted_childPkg_adapted__ChangeAttributeValues__TGGNode_EMap(),
				ecorePackage.getEBoolean(), "changeAttributeValues", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "correspondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theHelpersPackage.getMapEntry());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "ruleParameters", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getjava2classChildPkg_adapted_childPkg_adapted__MoveElement__TGGNode_TGGNode_TGGNode(),
				ecorePackage.getEBoolean(), "moveElement", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "correspondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "oldPreviousCorrespondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "newPreviousCorrespondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getjava2classChildPkg_adapted_childPkg_adapted__TransformForward__TGGNode_boolean_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformForward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "considerAllLhsCorrNodes", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getjava2classChildPkg_adapted_childPkg_adapted__TransformMapping__TGGNode_boolean_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformMapping", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "considerAllLhsCorrNodes", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(
				getjava2classChildPkg_adapted_childPkg_adapted__TransformBackward__TGGNode_boolean_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformBackward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "considerAllLhsCorrNodes", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getjava2classChildPkg_adapted_childPkg_adapted__ConflictCheckForward__TGGNode(),
				ecorePackage.getEObject(), "conflictCheckForward", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getjava2classChildPkg_adapted_childPkg_adapted__ConflictCheckMapping__TGGNode(),
				ecorePackage.getEObject(), "conflictCheckMapping", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getjava2classChildPkg_adapted_childPkg_adapted__ConflictCheckBackward__TGGNode(),
				ecorePackage.getEObject(), "conflictCheckBackward", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getjava2classChildPkg_adapted_childPkg_adapted__SynchronizeForward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "synchronizeForward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getjava2classChildPkg_adapted_childPkg_adapted__SynchronizeBackward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "synchronizeBackward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getjava2classChildPkg_adapted_childPkg_adapted__RepairForward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "repairForward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getjava2classChildPkg_adapted_childPkg_adapted__RepairBackward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "repairBackward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		initEClass(java2classAxiom_adapted_axiom_adaptedEClass, java2classAxiom_adapted_axiom_adapted.class,
				"java2classAxiom_adapted_axiom_adapted", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getjava2classAxiom_adapted_axiom_adapted_AddElementActivity(), theMlsdmPackage.getActivity(),
				null, "addElementActivity", null, 1, 1, java2classAxiom_adapted_axiom_adapted.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getjava2classAxiom_adapted_axiom_adapted_MoveElementActivity(), theMlsdmPackage.getActivity(),
				null, "moveElementActivity", null, 1, 1, java2classAxiom_adapted_axiom_adapted.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getjava2classAxiom_adapted_axiom_adapted_ChangeAttributeActivity(),
				theMlsdmPackage.getActivity(), null, "changeAttributeActivity", null, 1, 1,
				java2classAxiom_adapted_axiom_adapted.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classAxiom_adapted_axiom_adapted_TransformForwardActivity(),
				theMlsdmPackage.getActivity(), null, "transformForwardActivity", null, 1, 1,
				java2classAxiom_adapted_axiom_adapted.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classAxiom_adapted_axiom_adapted_TransformMappingActivity(),
				theMlsdmPackage.getActivity(), null, "transformMappingActivity", null, 1, 1,
				java2classAxiom_adapted_axiom_adapted.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classAxiom_adapted_axiom_adapted_TransformBackwardActivity(),
				theMlsdmPackage.getActivity(), null, "transformBackwardActivity", null, 1, 1,
				java2classAxiom_adapted_axiom_adapted.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classAxiom_adapted_axiom_adapted_ConflictCheckForwardActivity(),
				theMlsdmPackage.getActivity(), null, "conflictCheckForwardActivity", null, 1, 1,
				java2classAxiom_adapted_axiom_adapted.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classAxiom_adapted_axiom_adapted_ConflictCheckMappingActivity(),
				theMlsdmPackage.getActivity(), null, "conflictCheckMappingActivity", null, 1, 1,
				java2classAxiom_adapted_axiom_adapted.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classAxiom_adapted_axiom_adapted_ConflictCheckBackwardActivity(),
				theMlsdmPackage.getActivity(), null, "conflictCheckBackwardActivity", null, 1, 1,
				java2classAxiom_adapted_axiom_adapted.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classAxiom_adapted_axiom_adapted_SynchronizeForwardActivity(),
				theMlsdmPackage.getActivity(), null, "synchronizeForwardActivity", null, 1, 1,
				java2classAxiom_adapted_axiom_adapted.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classAxiom_adapted_axiom_adapted_SynchronizeBackwardActivity(),
				theMlsdmPackage.getActivity(), null, "synchronizeBackwardActivity", null, 1, 1,
				java2classAxiom_adapted_axiom_adapted.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getjava2classAxiom_adapted_axiom_adapted_RepairForwardActivity(), theMlsdmPackage.getActivity(),
				null, "repairForwardActivity", null, 1, 1, java2classAxiom_adapted_axiom_adapted.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getjava2classAxiom_adapted_axiom_adapted_RepairBackwardActivity(), theMlsdmPackage.getActivity(),
				null, "repairBackwardActivity", null, 1, 1, java2classAxiom_adapted_axiom_adapted.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		op = initEOperation(getjava2classAxiom_adapted_axiom_adapted__AddElement__EMap(), theMote2Package.getTGGNode(),
				"addElement", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theHelpersPackage.getMapEntry());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "parameters", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getjava2classAxiom_adapted_axiom_adapted__ChangeAttributeValues__TGGNode_EMap(),
				ecorePackage.getEBoolean(), "changeAttributeValues", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "correspondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theHelpersPackage.getMapEntry());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "ruleParameters", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getjava2classAxiom_adapted_axiom_adapted__MoveElement__TGGNode_TGGNode_TGGNode(),
				ecorePackage.getEBoolean(), "moveElement", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "correspondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "oldPreviousCorrespondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "newPreviousCorrespondenceNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getjava2classAxiom_adapted_axiom_adapted__TransformForward__TGGNode_boolean_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformForward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "considerAllLhsCorrNodes", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getjava2classAxiom_adapted_axiom_adapted__TransformMapping__TGGNode_boolean_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformMapping", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "considerAllLhsCorrNodes", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getjava2classAxiom_adapted_axiom_adapted__TransformBackward__TGGNode_boolean_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "transformBackward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "considerAllLhsCorrNodes", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getjava2classAxiom_adapted_axiom_adapted__ConflictCheckForward__TGGNode(),
				ecorePackage.getEObject(), "conflictCheckForward", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getjava2classAxiom_adapted_axiom_adapted__ConflictCheckMapping__TGGNode(),
				ecorePackage.getEObject(), "conflictCheckMapping", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getjava2classAxiom_adapted_axiom_adapted__ConflictCheckBackward__TGGNode(),
				ecorePackage.getEObject(), "conflictCheckBackward", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getjava2classAxiom_adapted_axiom_adapted__SynchronizeForward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "synchronizeForward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getjava2classAxiom_adapted_axiom_adapted__SynchronizeBackward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "synchronizeBackward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getjava2classAxiom_adapted_axiom_adapted__RepairForward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "repairForward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());

		op = initEOperation(getjava2classAxiom_adapted_axiom_adapted__RepairBackward__TGGNode_boolean(),
				theOperationalTGGPackage.getErrorCodeEnum(), "repairBackward", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMote2Package.getTGGNode(), "inputTggNode", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "checkAttributeFormulae", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, theHelpersPackage.getTransformationException());
	}

} //GeneratedPackageImpl
