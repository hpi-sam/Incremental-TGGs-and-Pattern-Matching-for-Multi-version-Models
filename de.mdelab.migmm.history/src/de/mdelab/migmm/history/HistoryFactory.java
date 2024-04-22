/**
 */
package de.mdelab.migmm.history;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.mdelab.migmm.history.HistoryPackage
 * @generated
 */
public interface HistoryFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HistoryFactory eINSTANCE = de.mdelab.migmm.history.impl.HistoryFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>History</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>History</em>'.
	 * @generated
	 */
	History createHistory();

	/**
	 * Returns a new object of class '<em>Generic Complete Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generic Complete Interval</em>'.
	 * @generated
	 */
	GenericCompleteInterval createGenericCompleteInterval();

	/**
	 * Returns a new object of class '<em>Edge With History</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Edge With History</em>'.
	 * @generated
	 */
	EdgeWithHistory createEdgeWithHistory();

	/**
	 * Returns a new object of class '<em>Containment Edge With History</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Containment Edge With History</em>'.
	 * @generated
	 */
	ContainmentEdgeWithHistory createContainmentEdgeWithHistory();

	/**
	 * Returns a new object of class '<em>Attribute With History</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute With History</em>'.
	 * @generated
	 */
	AttributeWithHistory createAttributeWithHistory();

	/**
	 * Returns a new object of class '<em>Node With History</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node With History</em>'.
	 * @generated
	 */
	NodeWithHistory createNodeWithHistory();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HistoryPackage getHistoryPackage();

} //HistoryFactory
