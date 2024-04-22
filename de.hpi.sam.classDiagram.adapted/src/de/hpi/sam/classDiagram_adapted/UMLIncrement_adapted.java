/**
 */
package de.hpi.sam.classDiagram_adapted;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UML Increment adapted</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.hpi.sam.classDiagram_adapted.UMLIncrement_adapted#getStereotypes <em>Stereotypes</em>}</li>
 * </ul>
 *
 * @see de.hpi.sam.classDiagram_adapted.ClassDiagram_adaptedPackage#getUMLIncrement_adapted()
 * @model abstract="true"
 * @generated
 */
public interface UMLIncrement_adapted extends UMLElement_adapted {
	/**
	 * Returns the value of the '<em><b>Stereotypes</b></em>' reference list.
	 * The list contents are of type {@link de.hpi.sam.classDiagram_adapted.UMLIncrement_adapted_stereotypesItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stereotypes</em>' reference list.
	 * @see de.hpi.sam.classDiagram_adapted.ClassDiagram_adaptedPackage#getUMLIncrement_adapted_Stereotypes()
	 * @model ordered="false"
	 * @generated
	 */
	EList<UMLIncrement_adapted_stereotypesItem> getStereotypes();

} // UMLIncrement_adapted
