/**
 */
package de.hpi.sam.classDiagram_adapted;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UML Class Diagram adapted</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.hpi.sam.classDiagram_adapted.UMLClassDiagram_adapted#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see de.hpi.sam.classDiagram_adapted.ClassDiagram_adaptedPackage#getUMLClassDiagram_adapted()
 * @model
 * @generated
 */
public interface UMLClassDiagram_adapted extends UMLElement_adapted {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' reference list.
	 * The list contents are of type {@link de.hpi.sam.classDiagram_adapted.UMLClassDiagram_adapted_elementsItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' reference list.
	 * @see de.hpi.sam.classDiagram_adapted.ClassDiagram_adaptedPackage#getUMLClassDiagram_adapted_Elements()
	 * @model ordered="false"
	 * @generated
	 */
	EList<UMLClassDiagram_adapted_elementsItem> getElements();

} // UMLClassDiagram_adapted
