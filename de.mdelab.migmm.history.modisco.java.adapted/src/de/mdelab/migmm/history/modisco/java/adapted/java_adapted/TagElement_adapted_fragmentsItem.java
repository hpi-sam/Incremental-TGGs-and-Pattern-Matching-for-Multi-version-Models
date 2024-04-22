/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import de.mdelab.migmm.history.ContainmentEdgeWithHistory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tag Element adapted fragments Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TagElement_adapted_fragmentsItem#getFragments <em>Fragments</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getTagElement_adapted_fragmentsItem()
 * @model
 * @generated
 */
public interface TagElement_adapted_fragmentsItem extends ContainmentEdgeWithHistory {
	/**
	 * Returns the value of the '<em><b>Fragments</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fragments</em>' reference.
	 * @see #setFragments(ASTNode_adapted)
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getTagElement_adapted_fragmentsItem_Fragments()
	 * @model required="true"
	 * @generated
	 */
	ASTNode_adapted getFragments();

	/**
	 * Sets the value of the '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TagElement_adapted_fragmentsItem#getFragments <em>Fragments</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fragments</em>' reference.
	 * @see #getFragments()
	 * @generated
	 */
	void setFragments(ASTNode_adapted value);

} // TagElement_adapted_fragmentsItem
