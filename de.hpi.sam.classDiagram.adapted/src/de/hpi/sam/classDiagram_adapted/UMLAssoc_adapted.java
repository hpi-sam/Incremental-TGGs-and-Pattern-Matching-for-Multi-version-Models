/**
 */
package de.hpi.sam.classDiagram_adapted;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UML Assoc adapted</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.hpi.sam.classDiagram_adapted.UMLAssoc_adapted#getLeftRole <em>Left Role</em>}</li>
 *   <li>{@link de.hpi.sam.classDiagram_adapted.UMLAssoc_adapted#getRightRole <em>Right Role</em>}</li>
 * </ul>
 *
 * @see de.hpi.sam.classDiagram_adapted.ClassDiagram_adaptedPackage#getUMLAssoc_adapted()
 * @model
 * @generated
 */
public interface UMLAssoc_adapted extends UMLDiagramItem_adapted {
	/**
	 * Returns the value of the '<em><b>Left Role</b></em>' reference list.
	 * The list contents are of type {@link de.hpi.sam.classDiagram_adapted.UMLAssoc_adapted_leftRoleItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Role</em>' reference list.
	 * @see de.hpi.sam.classDiagram_adapted.ClassDiagram_adaptedPackage#getUMLAssoc_adapted_LeftRole()
	 * @model ordered="false"
	 * @generated
	 */
	EList<UMLAssoc_adapted_leftRoleItem> getLeftRole();

	/**
	 * Returns the value of the '<em><b>Right Role</b></em>' reference list.
	 * The list contents are of type {@link de.hpi.sam.classDiagram_adapted.UMLAssoc_adapted_rightRoleItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Role</em>' reference list.
	 * @see de.hpi.sam.classDiagram_adapted.ClassDiagram_adaptedPackage#getUMLAssoc_adapted_RightRole()
	 * @model ordered="false"
	 * @generated
	 */
	EList<UMLAssoc_adapted_rightRoleItem> getRightRole();

} // UMLAssoc_adapted
