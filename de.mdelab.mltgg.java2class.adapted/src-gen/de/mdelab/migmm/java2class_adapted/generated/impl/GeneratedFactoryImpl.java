/**
 */
package de.mdelab.migmm.java2class_adapted.generated.impl;

import de.mdelab.migmm.java2class_adapted.generated.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GeneratedFactoryImpl extends EFactoryImpl implements GeneratedFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GeneratedFactory init() {
		try {
			GeneratedFactory theGeneratedFactory = (GeneratedFactory) EPackage.Registry.INSTANCE
					.getEFactory(GeneratedPackage.eNS_URI);
			if (theGeneratedFactory != null) {
				return theGeneratedFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GeneratedFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratedFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case GeneratedPackage.JAVA2CLASS_ADAPTED_OPERATIONAL_TGG:
			return createjava2class_adaptedOperationalTGG();
		case GeneratedPackage.HISTORY2_HISTORY2:
			return createHistory2History2();
		case GeneratedPackage.JAVA2CLASS_AXIOM_ADAPTED:
			return createjava2classAxiom_adapted();
		case GeneratedPackage.JAVA2CLASS_PKG_ADAPTED:
			return createjava2classPkg_adapted();
		case GeneratedPackage.JAVA2CLASS_CHILD_PKG_ADAPTED:
			return createjava2classChildPkg_adapted();
		case GeneratedPackage.JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED:
			return createjava2classClassDeclaration2Class_adapted();
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED:
			return createjava2classField2Association_adapted();
		case GeneratedPackage.HISTORY2_HISTORY2_HISTORY2_HISTORY:
			return createHistory2History2_History2History();
		case GeneratedPackage.JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED:
			return createjava2classPkg_adapted_pkg_adapted();
		case GeneratedPackage.JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED:
			return createjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted();
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED:
			return createjava2classField2Association_adapted_java2classField2Association_adapted();
		case GeneratedPackage.JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED:
			return createjava2classChildPkg_adapted_childPkg_adapted();
		case GeneratedPackage.JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED:
			return createjava2classAxiom_adapted_axiom_adapted();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public java2class_adaptedOperationalTGG createjava2class_adaptedOperationalTGG() {
		java2class_adaptedOperationalTGGImpl java2class_adaptedOperationalTGG = new java2class_adaptedOperationalTGGImpl();
		return java2class_adaptedOperationalTGG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public History2History2 createHistory2History2() {
		History2History2Impl history2History2 = new History2History2Impl();
		return history2History2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public java2classAxiom_adapted createjava2classAxiom_adapted() {
		java2classAxiom_adaptedImpl java2classAxiom_adapted = new java2classAxiom_adaptedImpl();
		return java2classAxiom_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public java2classPkg_adapted createjava2classPkg_adapted() {
		java2classPkg_adaptedImpl java2classPkg_adapted = new java2classPkg_adaptedImpl();
		return java2classPkg_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public java2classChildPkg_adapted createjava2classChildPkg_adapted() {
		java2classChildPkg_adaptedImpl java2classChildPkg_adapted = new java2classChildPkg_adaptedImpl();
		return java2classChildPkg_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public java2classClassDeclaration2Class_adapted createjava2classClassDeclaration2Class_adapted() {
		java2classClassDeclaration2Class_adaptedImpl java2classClassDeclaration2Class_adapted = new java2classClassDeclaration2Class_adaptedImpl();
		return java2classClassDeclaration2Class_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public java2classField2Association_adapted createjava2classField2Association_adapted() {
		java2classField2Association_adaptedImpl java2classField2Association_adapted = new java2classField2Association_adaptedImpl();
		return java2classField2Association_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public History2History2_History2History createHistory2History2_History2History() {
		History2History2_History2HistoryImpl history2History2_History2History = new History2History2_History2HistoryImpl();
		return history2History2_History2History;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public java2classPkg_adapted_pkg_adapted createjava2classPkg_adapted_pkg_adapted() {
		java2classPkg_adapted_pkg_adaptedImpl java2classPkg_adapted_pkg_adapted = new java2classPkg_adapted_pkg_adaptedImpl();
		return java2classPkg_adapted_pkg_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted createjava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted() {
		java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adaptedImpl java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted = new java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adaptedImpl();
		return java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public java2classField2Association_adapted_java2classField2Association_adapted createjava2classField2Association_adapted_java2classField2Association_adapted() {
		java2classField2Association_adapted_java2classField2Association_adaptedImpl java2classField2Association_adapted_java2classField2Association_adapted = new java2classField2Association_adapted_java2classField2Association_adaptedImpl();
		return java2classField2Association_adapted_java2classField2Association_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public java2classChildPkg_adapted_childPkg_adapted createjava2classChildPkg_adapted_childPkg_adapted() {
		java2classChildPkg_adapted_childPkg_adaptedImpl java2classChildPkg_adapted_childPkg_adapted = new java2classChildPkg_adapted_childPkg_adaptedImpl();
		return java2classChildPkg_adapted_childPkg_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public java2classAxiom_adapted_axiom_adapted createjava2classAxiom_adapted_axiom_adapted() {
		java2classAxiom_adapted_axiom_adaptedImpl java2classAxiom_adapted_axiom_adapted = new java2classAxiom_adapted_axiom_adaptedImpl();
		return java2classAxiom_adapted_axiom_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratedPackage getGeneratedPackage() {
		return (GeneratedPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GeneratedPackage getPackage() {
		return GeneratedPackage.eINSTANCE;
	}

} //GeneratedFactoryImpl
