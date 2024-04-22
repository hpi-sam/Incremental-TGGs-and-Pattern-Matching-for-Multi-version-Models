/**
 */
package de.hpi.sam.classDiagram_adapted;

import de.mdelab.migmm.history.EdgeWithHistory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UML Stereotype adapted increment Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.hpi.sam.classDiagram_adapted.UMLStereotype_adapted_incrementItem#getIncrement <em>Increment</em>}</li>
 * </ul>
 *
 * @see de.hpi.sam.classDiagram_adapted.ClassDiagram_adaptedPackage#getUMLStereotype_adapted_incrementItem()
 * @model
 * @generated
 */
public interface UMLStereotype_adapted_incrementItem extends EdgeWithHistory {
	/**
	 * Returns the value of the '<em><b>Increment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Increment</em>' reference.
	 * @see #setIncrement(UMLIncrement_adapted)
	 * @see de.hpi.sam.classDiagram_adapted.ClassDiagram_adaptedPackage#getUMLStereotype_adapted_incrementItem_Increment()
	 * @model required="true"
	 * @generated
	 */
	UMLIncrement_adapted getIncrement();

	/**
	 * Sets the value of the '{@link de.hpi.sam.classDiagram_adapted.UMLStereotype_adapted_incrementItem#getIncrement <em>Increment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Increment</em>' reference.
	 * @see #getIncrement()
	 * @generated
	 */
	void setIncrement(UMLIncrement_adapted value);

} // UMLStereotype_adapted_incrementItem
