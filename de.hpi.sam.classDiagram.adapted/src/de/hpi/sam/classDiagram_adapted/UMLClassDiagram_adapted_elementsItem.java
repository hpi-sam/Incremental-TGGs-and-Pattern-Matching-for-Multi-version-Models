/**
 */
package de.hpi.sam.classDiagram_adapted;

import de.mdelab.migmm.history.ContainmentEdgeWithHistory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UML Class Diagram adapted elements Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.hpi.sam.classDiagram_adapted.UMLClassDiagram_adapted_elementsItem#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see de.hpi.sam.classDiagram_adapted.ClassDiagram_adaptedPackage#getUMLClassDiagram_adapted_elementsItem()
 * @model
 * @generated
 */
public interface UMLClassDiagram_adapted_elementsItem extends ContainmentEdgeWithHistory {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' reference.
	 * @see #setElements(UMLElement_adapted)
	 * @see de.hpi.sam.classDiagram_adapted.ClassDiagram_adaptedPackage#getUMLClassDiagram_adapted_elementsItem_Elements()
	 * @model required="true"
	 * @generated
	 */
	UMLElement_adapted getElements();

	/**
	 * Sets the value of the '{@link de.hpi.sam.classDiagram_adapted.UMLClassDiagram_adapted_elementsItem#getElements <em>Elements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elements</em>' reference.
	 * @see #getElements()
	 * @generated
	 */
	void setElements(UMLElement_adapted value);

} // UMLClassDiagram_adapted_elementsItem
