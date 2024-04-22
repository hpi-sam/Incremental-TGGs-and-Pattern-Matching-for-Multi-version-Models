/**
 */
package de.hpi.sam.classDiagram_adapted;

import de.mdelab.migmm.history.EdgeWithHistory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UML Element adapted diagram Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.hpi.sam.classDiagram_adapted.UMLElement_adapted_diagramItem#getDiagram <em>Diagram</em>}</li>
 * </ul>
 *
 * @see de.hpi.sam.classDiagram_adapted.ClassDiagram_adaptedPackage#getUMLElement_adapted_diagramItem()
 * @model
 * @generated
 */
public interface UMLElement_adapted_diagramItem extends EdgeWithHistory {
	/**
	 * Returns the value of the '<em><b>Diagram</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram</em>' reference.
	 * @see #setDiagram(UMLClassDiagram_adapted)
	 * @see de.hpi.sam.classDiagram_adapted.ClassDiagram_adaptedPackage#getUMLElement_adapted_diagramItem_Diagram()
	 * @model required="true"
	 * @generated
	 */
	UMLClassDiagram_adapted getDiagram();

	/**
	 * Sets the value of the '{@link de.hpi.sam.classDiagram_adapted.UMLElement_adapted_diagramItem#getDiagram <em>Diagram</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram</em>' reference.
	 * @see #getDiagram()
	 * @generated
	 */
	void setDiagram(UMLClassDiagram_adapted value);

} // UMLElement_adapted_diagramItem
