/**
 */
package de.hpi.sam.classDiagram_adapted;

import de.mdelab.migmm.history.EdgeWithHistory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UML Role adapted card Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.hpi.sam.classDiagram_adapted.UMLRole_adapted_cardItem#getCard <em>Card</em>}</li>
 * </ul>
 *
 * @see de.hpi.sam.classDiagram_adapted.ClassDiagram_adaptedPackage#getUMLRole_adapted_cardItem()
 * @model
 * @generated
 */
public interface UMLRole_adapted_cardItem extends EdgeWithHistory {
	/**
	 * Returns the value of the '<em><b>Card</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card</em>' reference.
	 * @see #setCard(UMLCardinality_adapted)
	 * @see de.hpi.sam.classDiagram_adapted.ClassDiagram_adaptedPackage#getUMLRole_adapted_cardItem_Card()
	 * @model required="true"
	 * @generated
	 */
	UMLCardinality_adapted getCard();

	/**
	 * Sets the value of the '{@link de.hpi.sam.classDiagram_adapted.UMLRole_adapted_cardItem#getCard <em>Card</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card</em>' reference.
	 * @see #getCard()
	 * @generated
	 */
	void setCard(UMLCardinality_adapted value);

} // UMLRole_adapted_cardItem
