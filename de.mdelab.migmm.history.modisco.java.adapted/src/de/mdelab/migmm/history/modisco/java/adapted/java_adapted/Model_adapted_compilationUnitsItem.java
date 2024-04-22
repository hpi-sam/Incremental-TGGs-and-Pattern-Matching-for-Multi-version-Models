/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import de.mdelab.migmm.history.ContainmentEdgeWithHistory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model adapted compilation Units Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Model_adapted_compilationUnitsItem#getCompilationUnits <em>Compilation Units</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getModel_adapted_compilationUnitsItem()
 * @model
 * @generated
 */
public interface Model_adapted_compilationUnitsItem extends ContainmentEdgeWithHistory {
	/**
	 * Returns the value of the '<em><b>Compilation Units</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compilation Units</em>' reference.
	 * @see #setCompilationUnits(CompilationUnit_adapted)
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getModel_adapted_compilationUnitsItem_CompilationUnits()
	 * @model required="true"
	 * @generated
	 */
	CompilationUnit_adapted getCompilationUnits();

	/**
	 * Sets the value of the '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Model_adapted_compilationUnitsItem#getCompilationUnits <em>Compilation Units</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compilation Units</em>' reference.
	 * @see #getCompilationUnits()
	 * @generated
	 */
	void setCompilationUnits(CompilationUnit_adapted value);

} // Model_adapted_compilationUnitsItem
