/**
 */
package de.hpi.sam.classDiagram_adapted;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UML Role adapted</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.hpi.sam.classDiagram_adapted.UMLRole_adapted#getAdornment <em>Adornment</em>}</li>
 *   <li>{@link de.hpi.sam.classDiagram_adapted.UMLRole_adapted#getCard <em>Card</em>}</li>
 *   <li>{@link de.hpi.sam.classDiagram_adapted.UMLRole_adapted#getRevLeftRole <em>Rev Left Role</em>}</li>
 *   <li>{@link de.hpi.sam.classDiagram_adapted.UMLRole_adapted#getRevRightRole <em>Rev Right Role</em>}</li>
 *   <li>{@link de.hpi.sam.classDiagram_adapted.UMLRole_adapted#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see de.hpi.sam.classDiagram_adapted.ClassDiagram_adaptedPackage#getUMLRole_adapted()
 * @model
 * @generated
 */
public interface UMLRole_adapted extends UMLIncrement_adapted {
	/**
	 * Returns the value of the '<em><b>Adornment</b></em>' reference list.
	 * The list contents are of type {@link de.hpi.sam.classDiagram_adapted.UMLRole_adapted_adornmentValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adornment</em>' reference list.
	 * @see de.hpi.sam.classDiagram_adapted.ClassDiagram_adaptedPackage#getUMLRole_adapted_Adornment()
	 * @model
	 * @generated
	 */
	EList<UMLRole_adapted_adornmentValue> getAdornment();

	/**
	 * Returns the value of the '<em><b>Card</b></em>' reference list.
	 * The list contents are of type {@link de.hpi.sam.classDiagram_adapted.UMLRole_adapted_cardItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card</em>' reference list.
	 * @see de.hpi.sam.classDiagram_adapted.ClassDiagram_adaptedPackage#getUMLRole_adapted_Card()
	 * @model ordered="false"
	 * @generated
	 */
	EList<UMLRole_adapted_cardItem> getCard();

	/**
	 * Returns the value of the '<em><b>Rev Left Role</b></em>' reference list.
	 * The list contents are of type {@link de.hpi.sam.classDiagram_adapted.UMLRole_adapted_revLeftRoleItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rev Left Role</em>' reference list.
	 * @see de.hpi.sam.classDiagram_adapted.ClassDiagram_adaptedPackage#getUMLRole_adapted_RevLeftRole()
	 * @model ordered="false"
	 * @generated
	 */
	EList<UMLRole_adapted_revLeftRoleItem> getRevLeftRole();

	/**
	 * Returns the value of the '<em><b>Rev Right Role</b></em>' reference list.
	 * The list contents are of type {@link de.hpi.sam.classDiagram_adapted.UMLRole_adapted_revRightRoleItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rev Right Role</em>' reference list.
	 * @see de.hpi.sam.classDiagram_adapted.ClassDiagram_adaptedPackage#getUMLRole_adapted_RevRightRole()
	 * @model ordered="false"
	 * @generated
	 */
	EList<UMLRole_adapted_revRightRoleItem> getRevRightRole();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference list.
	 * The list contents are of type {@link de.hpi.sam.classDiagram_adapted.UMLRole_adapted_targetItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference list.
	 * @see de.hpi.sam.classDiagram_adapted.ClassDiagram_adaptedPackage#getUMLRole_adapted_Target()
	 * @model ordered="false"
	 * @generated
	 */
	EList<UMLRole_adapted_targetItem> getTarget();

} // UMLRole_adapted
