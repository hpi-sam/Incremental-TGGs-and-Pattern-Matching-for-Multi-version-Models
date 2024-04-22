/**
 */
package de.hpi.sam.classDiagram_adapted;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UML Cardinality adapted</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.hpi.sam.classDiagram_adapted.UMLCardinality_adapted#getCardString <em>Card String</em>}</li>
 *   <li>{@link de.hpi.sam.classDiagram_adapted.UMLCardinality_adapted#getRevCard <em>Rev Card</em>}</li>
 * </ul>
 *
 * @see de.hpi.sam.classDiagram_adapted.ClassDiagram_adaptedPackage#getUMLCardinality_adapted()
 * @model
 * @generated
 */
public interface UMLCardinality_adapted extends UMLIncrement_adapted {
	/**
	 * Returns the value of the '<em><b>Card String</b></em>' reference list.
	 * The list contents are of type {@link de.hpi.sam.classDiagram_adapted.UMLCardinality_adapted_cardStringValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card String</em>' reference list.
	 * @see de.hpi.sam.classDiagram_adapted.ClassDiagram_adaptedPackage#getUMLCardinality_adapted_CardString()
	 * @model
	 * @generated
	 */
	EList<UMLCardinality_adapted_cardStringValue> getCardString();

	/**
	 * Returns the value of the '<em><b>Rev Card</b></em>' reference list.
	 * The list contents are of type {@link de.hpi.sam.classDiagram_adapted.UMLCardinality_adapted_revCardItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rev Card</em>' reference list.
	 * @see de.hpi.sam.classDiagram_adapted.ClassDiagram_adaptedPackage#getUMLCardinality_adapted_RevCard()
	 * @model ordered="false"
	 * @generated
	 */
	EList<UMLCardinality_adapted_revCardItem> getRevCard();

} // UMLCardinality_adapted
