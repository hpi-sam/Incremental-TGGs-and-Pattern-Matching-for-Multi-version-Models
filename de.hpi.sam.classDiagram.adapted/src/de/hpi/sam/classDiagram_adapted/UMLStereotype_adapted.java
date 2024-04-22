/**
 */
package de.hpi.sam.classDiagram_adapted;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UML Stereotype adapted</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.hpi.sam.classDiagram_adapted.UMLStereotype_adapted#getText <em>Text</em>}</li>
 *   <li>{@link de.hpi.sam.classDiagram_adapted.UMLStereotype_adapted#getIncrement <em>Increment</em>}</li>
 * </ul>
 *
 * @see de.hpi.sam.classDiagram_adapted.ClassDiagram_adaptedPackage#getUMLStereotype_adapted()
 * @model
 * @generated
 */
public interface UMLStereotype_adapted extends UMLIncrement_adapted {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' reference list.
	 * The list contents are of type {@link de.hpi.sam.classDiagram_adapted.UMLStereotype_adapted_textValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' reference list.
	 * @see de.hpi.sam.classDiagram_adapted.ClassDiagram_adaptedPackage#getUMLStereotype_adapted_Text()
	 * @model
	 * @generated
	 */
	EList<UMLStereotype_adapted_textValue> getText();

	/**
	 * Returns the value of the '<em><b>Increment</b></em>' reference list.
	 * The list contents are of type {@link de.hpi.sam.classDiagram_adapted.UMLStereotype_adapted_incrementItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Increment</em>' reference list.
	 * @see de.hpi.sam.classDiagram_adapted.ClassDiagram_adaptedPackage#getUMLStereotype_adapted_Increment()
	 * @model ordered="false"
	 * @generated
	 */
	EList<UMLStereotype_adapted_incrementItem> getIncrement();

} // UMLStereotype_adapted
