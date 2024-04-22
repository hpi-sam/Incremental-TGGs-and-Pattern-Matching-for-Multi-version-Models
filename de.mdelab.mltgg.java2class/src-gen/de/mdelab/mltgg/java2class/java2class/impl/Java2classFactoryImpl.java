/**
 */
package de.mdelab.mltgg.java2class.java2class.impl;

import de.mdelab.mltgg.java2class.java2class.*;

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
public class Java2classFactoryImpl extends EFactoryImpl implements Java2classFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Java2classFactory init() {
		try {
			Java2classFactory theJava2classFactory = (Java2classFactory) EPackage.Registry.INSTANCE
					.getEFactory(Java2classPackage.eNS_URI);
			if (theJava2classFactory != null) {
				return theJava2classFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Java2classFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Java2classFactoryImpl() {
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
		case Java2classPackage.CORR_AXIOM:
			return createCorrAxiom();
		case Java2classPackage.CORR_PKG:
			return createCorrPkg();
		case Java2classPackage.CORR_CLASS:
			return createCorrClass();
		case Java2classPackage.CORR_ASSOCIATION:
			return createCorrAssociation();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrAxiom createCorrAxiom() {
		CorrAxiomImpl corrAxiom = new CorrAxiomImpl();
		return corrAxiom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrPkg createCorrPkg() {
		CorrPkgImpl corrPkg = new CorrPkgImpl();
		return corrPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrClass createCorrClass() {
		CorrClassImpl corrClass = new CorrClassImpl();
		return corrClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrAssociation createCorrAssociation() {
		CorrAssociationImpl corrAssociation = new CorrAssociationImpl();
		return corrAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Java2classPackage getJava2classPackage() {
		return (Java2classPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Java2classPackage getPackage() {
		return Java2classPackage.eINSTANCE;
	}

} //Java2classFactoryImpl
