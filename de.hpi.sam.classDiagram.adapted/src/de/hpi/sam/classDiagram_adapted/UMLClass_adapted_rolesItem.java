/**
 */
package de.hpi.sam.classDiagram_adapted;

import de.mdelab.migmm.history.EdgeWithHistory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UML Class adapted roles Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.hpi.sam.classDiagram_adapted.UMLClass_adapted_rolesItem#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @see de.hpi.sam.classDiagram_adapted.ClassDiagram_adaptedPackage#getUMLClass_adapted_rolesItem()
 * @model
 * @generated
 */
public interface UMLClass_adapted_rolesItem extends EdgeWithHistory {
	/**
	 * Returns the value of the '<em><b>Roles</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' reference.
	 * @see #setRoles(UMLRole_adapted)
	 * @see de.hpi.sam.classDiagram_adapted.ClassDiagram_adaptedPackage#getUMLClass_adapted_rolesItem_Roles()
	 * @model required="true"
	 * @generated
	 */
	UMLRole_adapted getRoles();

	/**
	 * Sets the value of the '{@link de.hpi.sam.classDiagram_adapted.UMLClass_adapted_rolesItem#getRoles <em>Roles</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roles</em>' reference.
	 * @see #getRoles()
	 * @generated
	 */
	void setRoles(UMLRole_adapted value);

} // UMLClass_adapted_rolesItem
