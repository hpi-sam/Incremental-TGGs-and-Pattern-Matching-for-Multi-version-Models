/**
 */
package de.hpi.sam.classDiagram_adapted;

import de.mdelab.migmm.history.NodeWithHistory;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UML Element adapted</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.hpi.sam.classDiagram_adapted.UMLElement_adapted#getName <em>Name</em>}</li>
 *   <li>{@link de.hpi.sam.classDiagram_adapted.UMLElement_adapted#getDiagram <em>Diagram</em>}</li>
 * </ul>
 *
 * @see de.hpi.sam.classDiagram_adapted.ClassDiagram_adaptedPackage#getUMLElement_adapted()
 * @model abstract="true"
 * @generated
 */
public interface UMLElement_adapted extends NodeWithHistory {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' reference list.
	 * The list contents are of type {@link de.hpi.sam.classDiagram_adapted.UMLElement_adapted_nameValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' reference list.
	 * @see de.hpi.sam.classDiagram_adapted.ClassDiagram_adaptedPackage#getUMLElement_adapted_Name()
	 * @model
	 * @generated
	 */
	EList<UMLElement_adapted_nameValue> getName();

	/**
	 * Returns the value of the '<em><b>Diagram</b></em>' reference list.
	 * The list contents are of type {@link de.hpi.sam.classDiagram_adapted.UMLElement_adapted_diagramItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram</em>' reference list.
	 * @see de.hpi.sam.classDiagram_adapted.ClassDiagram_adaptedPackage#getUMLElement_adapted_Diagram()
	 * @model ordered="false"
	 * @generated
	 */
	EList<UMLElement_adapted_diagramItem> getDiagram();

} // UMLElement_adapted
