/**
 */
package de.hpi.sam.classDiagram_adapted;

import de.mdelab.migmm.history.EdgeWithHistory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UML Increment adapted stereotypes Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.hpi.sam.classDiagram_adapted.UMLIncrement_adapted_stereotypesItem#getStereotypes <em>Stereotypes</em>}</li>
 * </ul>
 *
 * @see de.hpi.sam.classDiagram_adapted.ClassDiagram_adaptedPackage#getUMLIncrement_adapted_stereotypesItem()
 * @model
 * @generated
 */
public interface UMLIncrement_adapted_stereotypesItem extends EdgeWithHistory {
	/**
	 * Returns the value of the '<em><b>Stereotypes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stereotypes</em>' reference.
	 * @see #setStereotypes(UMLStereotype_adapted)
	 * @see de.hpi.sam.classDiagram_adapted.ClassDiagram_adaptedPackage#getUMLIncrement_adapted_stereotypesItem_Stereotypes()
	 * @model required="true"
	 * @generated
	 */
	UMLStereotype_adapted getStereotypes();

	/**
	 * Sets the value of the '{@link de.hpi.sam.classDiagram_adapted.UMLIncrement_adapted_stereotypesItem#getStereotypes <em>Stereotypes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stereotypes</em>' reference.
	 * @see #getStereotypes()
	 * @generated
	 */
	void setStereotypes(UMLStereotype_adapted value);

} // UMLIncrement_adapted_stereotypesItem
