/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import de.mdelab.migmm.history.ContainmentEdgeWithHistory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AST Node adapted comments Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ASTNode_adapted_commentsItem#getComments <em>Comments</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getASTNode_adapted_commentsItem()
 * @model
 * @generated
 */
public interface ASTNode_adapted_commentsItem extends ContainmentEdgeWithHistory {
	/**
	 * Returns the value of the '<em><b>Comments</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' reference.
	 * @see #setComments(Comment_adapted)
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getASTNode_adapted_commentsItem_Comments()
	 * @model required="true"
	 * @generated
	 */
	Comment_adapted getComments();

	/**
	 * Sets the value of the '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ASTNode_adapted_commentsItem#getComments <em>Comments</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' reference.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(Comment_adapted value);

} // ASTNode_adapted_commentsItem
