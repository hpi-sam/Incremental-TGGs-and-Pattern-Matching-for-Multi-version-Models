/**
 */
package de.mdelab.migmm.java2class_adapted;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.mdelab.migmm.java2class_adapted.Java2class_adaptedPackage
 * @generated
 */
public interface Java2class_adaptedFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Java2class_adaptedFactory eINSTANCE = de.mdelab.migmm.java2class_adapted.impl.Java2class_adaptedFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Corr Axiom adapted</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Corr Axiom adapted</em>'.
	 * @generated
	 */
	CorrAxiom_adapted createCorrAxiom_adapted();

	/**
	 * Returns a new object of class '<em>Corr Pkg adapted</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Corr Pkg adapted</em>'.
	 * @generated
	 */
	CorrPkg_adapted createCorrPkg_adapted();

	/**
	 * Returns a new object of class '<em>Corr Class adapted</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Corr Class adapted</em>'.
	 * @generated
	 */
	CorrClass_adapted createCorrClass_adapted();

	/**
	 * Returns a new object of class '<em>Corr Association adapted</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Corr Association adapted</em>'.
	 * @generated
	 */
	CorrAssociation_adapted createCorrAssociation_adapted();

	/**
	 * Returns a new object of class '<em>History2 History</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>History2 History</em>'.
	 * @generated
	 */
	History2History createHistory2History();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Java2class_adaptedPackage getJava2class_adaptedPackage();

} //Java2class_adaptedFactory
