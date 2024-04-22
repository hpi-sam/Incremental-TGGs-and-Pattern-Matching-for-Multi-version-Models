/**
 */
package de.hpi.sam.classDiagram_adapted;

import de.mdelab.migmm.history.EdgeWithHistory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UML Assoc adapted right Role Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.hpi.sam.classDiagram_adapted.UMLAssoc_adapted_rightRoleItem#getRightRole <em>Right Role</em>}</li>
 * </ul>
 *
 * @see de.hpi.sam.classDiagram_adapted.ClassDiagram_adaptedPackage#getUMLAssoc_adapted_rightRoleItem()
 * @model
 * @generated
 */
public interface UMLAssoc_adapted_rightRoleItem extends EdgeWithHistory {
	/**
	 * Returns the value of the '<em><b>Right Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Role</em>' reference.
	 * @see #setRightRole(UMLRole_adapted)
	 * @see de.hpi.sam.classDiagram_adapted.ClassDiagram_adaptedPackage#getUMLAssoc_adapted_rightRoleItem_RightRole()
	 * @model required="true"
	 * @generated
	 */
	UMLRole_adapted getRightRole();

	/**
	 * Sets the value of the '{@link de.hpi.sam.classDiagram_adapted.UMLAssoc_adapted_rightRoleItem#getRightRole <em>Right Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Role</em>' reference.
	 * @see #getRightRole()
	 * @generated
	 */
	void setRightRole(UMLRole_adapted value);

} // UMLAssoc_adapted_rightRoleItem
