/**
 */
package de.hpi.sam.classDiagram_adapted;

import de.mdelab.migmm.history.EdgeWithHistory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UML Assoc adapted left Role Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.hpi.sam.classDiagram_adapted.UMLAssoc_adapted_leftRoleItem#getLeftRole <em>Left Role</em>}</li>
 * </ul>
 *
 * @see de.hpi.sam.classDiagram_adapted.ClassDiagram_adaptedPackage#getUMLAssoc_adapted_leftRoleItem()
 * @model
 * @generated
 */
public interface UMLAssoc_adapted_leftRoleItem extends EdgeWithHistory {
	/**
	 * Returns the value of the '<em><b>Left Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Role</em>' reference.
	 * @see #setLeftRole(UMLRole_adapted)
	 * @see de.hpi.sam.classDiagram_adapted.ClassDiagram_adaptedPackage#getUMLAssoc_adapted_leftRoleItem_LeftRole()
	 * @model required="true"
	 * @generated
	 */
	UMLRole_adapted getLeftRole();

	/**
	 * Sets the value of the '{@link de.hpi.sam.classDiagram_adapted.UMLAssoc_adapted_leftRoleItem#getLeftRole <em>Left Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Role</em>' reference.
	 * @see #getLeftRole()
	 * @generated
	 */
	void setLeftRole(UMLRole_adapted value);

} // UMLAssoc_adapted_leftRoleItem
