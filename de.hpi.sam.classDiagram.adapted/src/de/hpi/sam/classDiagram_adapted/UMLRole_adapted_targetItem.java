/**
 */
package de.hpi.sam.classDiagram_adapted;

import de.mdelab.migmm.history.EdgeWithHistory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UML Role adapted target Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.hpi.sam.classDiagram_adapted.UMLRole_adapted_targetItem#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see de.hpi.sam.classDiagram_adapted.ClassDiagram_adaptedPackage#getUMLRole_adapted_targetItem()
 * @model
 * @generated
 */
public interface UMLRole_adapted_targetItem extends EdgeWithHistory {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(UMLClass_adapted)
	 * @see de.hpi.sam.classDiagram_adapted.ClassDiagram_adaptedPackage#getUMLRole_adapted_targetItem_Target()
	 * @model required="true"
	 * @generated
	 */
	UMLClass_adapted getTarget();

	/**
	 * Sets the value of the '{@link de.hpi.sam.classDiagram_adapted.UMLRole_adapted_targetItem#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(UMLClass_adapted value);

} // UMLRole_adapted_targetItem
