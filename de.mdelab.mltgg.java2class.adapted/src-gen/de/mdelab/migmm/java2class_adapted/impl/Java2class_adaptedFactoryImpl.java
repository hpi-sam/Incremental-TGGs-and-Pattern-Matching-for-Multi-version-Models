/**
 */
package de.mdelab.migmm.java2class_adapted.impl;

import de.mdelab.migmm.java2class_adapted.*;

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
public class Java2class_adaptedFactoryImpl extends EFactoryImpl implements Java2class_adaptedFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Java2class_adaptedFactory init() {
		try {
			Java2class_adaptedFactory theJava2class_adaptedFactory = (Java2class_adaptedFactory) EPackage.Registry.INSTANCE
					.getEFactory(Java2class_adaptedPackage.eNS_URI);
			if (theJava2class_adaptedFactory != null) {
				return theJava2class_adaptedFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Java2class_adaptedFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Java2class_adaptedFactoryImpl() {
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
		case Java2class_adaptedPackage.CORR_AXIOM_ADAPTED:
			return createCorrAxiom_adapted();
		case Java2class_adaptedPackage.CORR_PKG_ADAPTED:
			return createCorrPkg_adapted();
		case Java2class_adaptedPackage.CORR_CLASS_ADAPTED:
			return createCorrClass_adapted();
		case Java2class_adaptedPackage.CORR_ASSOCIATION_ADAPTED:
			return createCorrAssociation_adapted();
		case Java2class_adaptedPackage.HISTORY2_HISTORY:
			return createHistory2History();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrAxiom_adapted createCorrAxiom_adapted() {
		CorrAxiom_adaptedImpl corrAxiom_adapted = new CorrAxiom_adaptedImpl();
		return corrAxiom_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrPkg_adapted createCorrPkg_adapted() {
		CorrPkg_adaptedImpl corrPkg_adapted = new CorrPkg_adaptedImpl();
		return corrPkg_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrClass_adapted createCorrClass_adapted() {
		CorrClass_adaptedImpl corrClass_adapted = new CorrClass_adaptedImpl();
		return corrClass_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrAssociation_adapted createCorrAssociation_adapted() {
		CorrAssociation_adaptedImpl corrAssociation_adapted = new CorrAssociation_adaptedImpl();
		return corrAssociation_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public History2History createHistory2History() {
		History2HistoryImpl history2History = new History2HistoryImpl();
		return history2History;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Java2class_adaptedPackage getJava2class_adaptedPackage() {
		return (Java2class_adaptedPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Java2class_adaptedPackage getPackage() {
		return Java2class_adaptedPackage.eINSTANCE;
	}

} //Java2class_adaptedFactoryImpl
