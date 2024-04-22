/**
 */
package de.hpi.sam.classDiagram_adapted;

import de.mdelab.migmm.history.EdgeWithHistory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UML Cardinality adapted rev Card Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.hpi.sam.classDiagram_adapted.UMLCardinality_adapted_revCardItem#getRevCard <em>Rev Card</em>}</li>
 * </ul>
 *
 * @see de.hpi.sam.classDiagram_adapted.ClassDiagram_adaptedPackage#getUMLCardinality_adapted_revCardItem()
 * @model
 * @generated
 */
public interface UMLCardinality_adapted_revCardItem extends EdgeWithHistory {
	/**
	 * Returns the value of the '<em><b>Rev Card</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rev Card</em>' reference.
	 * @see #setRevCard(UMLRole_adapted)
	 * @see de.hpi.sam.classDiagram_adapted.ClassDiagram_adaptedPackage#getUMLCardinality_adapted_revCardItem_RevCard()
	 * @model required="true"
	 * @generated
	 */
	UMLRole_adapted getRevCard();

	/**
	 * Sets the value of the '{@link de.hpi.sam.classDiagram_adapted.UMLCardinality_adapted_revCardItem#getRevCard <em>Rev Card</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rev Card</em>' reference.
	 * @see #getRevCard()
	 * @generated
	 */
	void setRevCard(UMLRole_adapted value);

} // UMLCardinality_adapted_revCardItem
