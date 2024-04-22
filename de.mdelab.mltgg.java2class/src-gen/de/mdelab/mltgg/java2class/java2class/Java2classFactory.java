/**
 */
package de.mdelab.mltgg.java2class.java2class;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.mdelab.mltgg.java2class.java2class.Java2classPackage
 * @generated
 */
public interface Java2classFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Java2classFactory eINSTANCE = de.mdelab.mltgg.java2class.java2class.impl.Java2classFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Corr Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Corr Axiom</em>'.
	 * @generated
	 */
	CorrAxiom createCorrAxiom();

	/**
	 * Returns a new object of class '<em>Corr Pkg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Corr Pkg</em>'.
	 * @generated
	 */
	CorrPkg createCorrPkg();

	/**
	 * Returns a new object of class '<em>Corr Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Corr Class</em>'.
	 * @generated
	 */
	CorrClass createCorrClass();

	/**
	 * Returns a new object of class '<em>Corr Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Corr Association</em>'.
	 * @generated
	 */
	CorrAssociation createCorrAssociation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Java2classPackage getJava2classPackage();

} //Java2classFactory
