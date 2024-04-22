/**
 */
package de.mdelab.migmm.history.timing;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.mdelab.migmm.history.timing.TimingPackage
 * @generated
 */
public interface TimingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TimingFactory eINSTANCE = de.mdelab.migmm.history.timing.impl.TimingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>LT Base Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LT Base Interval</em>'.
	 * @generated
	 */
	LTBaseInterval createLTBaseInterval();

	/**
	 * Returns a new object of class '<em>LT Timing Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LT Timing Unit</em>'.
	 * @generated
	 */
	LTTimingUnit createLTTimingUnit();

	/**
	 * Returns a new object of class '<em>LT Composite Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LT Composite Interval</em>'.
	 * @generated
	 */
	LTCompositeInterval createLTCompositeInterval();

	/**
	 * Returns a new object of class '<em>DAG Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DAG Interval</em>'.
	 * @generated
	 */
	DAGInterval createDAGInterval();

	/**
	 * Returns a new object of class '<em>DAG Version</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DAG Version</em>'.
	 * @generated
	 */
	DAGVersion createDAGVersion();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TimingPackage getTimingPackage();

} //TimingFactory
