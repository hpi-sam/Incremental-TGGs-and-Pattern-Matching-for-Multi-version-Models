/**
 */
package tggh;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see tggh.TgghPackage
 * @generated
 */
public interface TgghFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TgghFactory eINSTANCE = tggh.impl.TgghFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>History2 History</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>History2 History</em>'.
	 * @generated
	 */
	History2History createHistory2History();

	/**
	 * Returns a new object of class '<em>TGG Node With History</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TGG Node With History</em>'.
	 * @generated
	 */
	TGGNodeWithHistory createTGGNodeWithHistory();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TgghPackage getTgghPackage();

} //TgghFactory
