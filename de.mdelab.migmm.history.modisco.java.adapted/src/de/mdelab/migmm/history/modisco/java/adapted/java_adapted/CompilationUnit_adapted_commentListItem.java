/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import de.mdelab.migmm.history.EdgeWithHistory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compilation Unit adapted comment List Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.CompilationUnit_adapted_commentListItem#getCommentList <em>Comment List</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getCompilationUnit_adapted_commentListItem()
 * @model
 * @generated
 */
public interface CompilationUnit_adapted_commentListItem extends EdgeWithHistory {
	/**
	 * Returns the value of the '<em><b>Comment List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment List</em>' reference.
	 * @see #setCommentList(Comment_adapted)
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getCompilationUnit_adapted_commentListItem_CommentList()
	 * @model required="true"
	 * @generated
	 */
	Comment_adapted getCommentList();

	/**
	 * Sets the value of the '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.CompilationUnit_adapted_commentListItem#getCommentList <em>Comment List</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment List</em>' reference.
	 * @see #getCommentList()
	 * @generated
	 */
	void setCommentList(Comment_adapted value);

} // CompilationUnit_adapted_commentListItem
