/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Creation adapted</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ArrayCreation_adapted#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ArrayCreation_adapted#getInitializer <em>Initializer</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ArrayCreation_adapted#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getArrayCreation_adapted()
 * @model
 * @generated
 */
public interface ArrayCreation_adapted extends Expression_adapted {
	/**
	 * Returns the value of the '<em><b>Dimensions</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ArrayCreation_adapted_dimensionsItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimensions</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getArrayCreation_adapted_Dimensions()
	 * @model
	 * @generated
	 */
	EList<ArrayCreation_adapted_dimensionsItem> getDimensions();

	/**
	 * Returns the value of the '<em><b>Initializer</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ArrayCreation_adapted_initializerItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initializer</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getArrayCreation_adapted_Initializer()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ArrayCreation_adapted_initializerItem> getInitializer();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ArrayCreation_adapted_typeItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getArrayCreation_adapted_Type()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ArrayCreation_adapted_typeItem> getType();

} // ArrayCreation_adapted
