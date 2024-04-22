/**
 */
package de.mdelab.mltgg.java2class.java2class.generated.impl;

import de.mdelab.mltgg.java2class.java2class.generated.*;

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
		case GeneratedPackage.JAVA2CLASS_OPERATIONAL_TGG:
			return createjava2classOperationalTGG();
		case GeneratedPackage.JAVA2CLASS_AXIOM:
			return createjava2classAxiom();
		case GeneratedPackage.JAVA2CLASS_PKG:
			return createjava2classPkg();
		case GeneratedPackage.JAVA2CLASS_CLASS_DECLARATION2_CLASS:
			return createjava2classClassDeclaration2Class();
		case GeneratedPackage.JAVA2CLASS_CHILD_PKG:
			return createjava2classChildPkg();
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION:
			return createjava2classField2Association();
		case GeneratedPackage.JAVA2CLASS_AXIOM_AXIOM:
			return createjava2classAxiom_axiom();
		case GeneratedPackage.JAVA2CLASS_PKG_PKG:
			return createjava2classPkg_pkg();
		case GeneratedPackage.JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS:
			return createjava2classClassDeclaration2Class_java2classClassDeclaration2Class();
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION:
			return createjava2classField2Association_java2classField2Association();
		case GeneratedPackage.JAVA2CLASS_CHILD_PKG_CHILD_PKG:
			return createjava2classChildPkg_childPkg();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public java2classOperationalTGG createjava2classOperationalTGG() {
		java2classOperationalTGGImpl java2classOperationalTGG = new java2classOperationalTGGImpl();
		return java2classOperationalTGG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public java2classAxiom createjava2classAxiom() {
		java2classAxiomImpl java2classAxiom = new java2classAxiomImpl();
		return java2classAxiom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public java2classPkg createjava2classPkg() {
		java2classPkgImpl java2classPkg = new java2classPkgImpl();
		return java2classPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public java2classClassDeclaration2Class createjava2classClassDeclaration2Class() {
		java2classClassDeclaration2ClassImpl java2classClassDeclaration2Class = new java2classClassDeclaration2ClassImpl();
		return java2classClassDeclaration2Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public java2classChildPkg createjava2classChildPkg() {
		java2classChildPkgImpl java2classChildPkg = new java2classChildPkgImpl();
		return java2classChildPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public java2classField2Association createjava2classField2Association() {
		java2classField2AssociationImpl java2classField2Association = new java2classField2AssociationImpl();
		return java2classField2Association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public java2classAxiom_axiom createjava2classAxiom_axiom() {
		java2classAxiom_axiomImpl java2classAxiom_axiom = new java2classAxiom_axiomImpl();
		return java2classAxiom_axiom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public java2classPkg_pkg createjava2classPkg_pkg() {
		java2classPkg_pkgImpl java2classPkg_pkg = new java2classPkg_pkgImpl();
		return java2classPkg_pkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public java2classClassDeclaration2Class_java2classClassDeclaration2Class createjava2classClassDeclaration2Class_java2classClassDeclaration2Class() {
		java2classClassDeclaration2Class_java2classClassDeclaration2ClassImpl java2classClassDeclaration2Class_java2classClassDeclaration2Class = new java2classClassDeclaration2Class_java2classClassDeclaration2ClassImpl();
		return java2classClassDeclaration2Class_java2classClassDeclaration2Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public java2classField2Association_java2classField2Association createjava2classField2Association_java2classField2Association() {
		java2classField2Association_java2classField2AssociationImpl java2classField2Association_java2classField2Association = new java2classField2Association_java2classField2AssociationImpl();
		return java2classField2Association_java2classField2Association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public java2classChildPkg_childPkg createjava2classChildPkg_childPkg() {
		java2classChildPkg_childPkgImpl java2classChildPkg_childPkg = new java2classChildPkg_childPkgImpl();
		return java2classChildPkg_childPkg;
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
