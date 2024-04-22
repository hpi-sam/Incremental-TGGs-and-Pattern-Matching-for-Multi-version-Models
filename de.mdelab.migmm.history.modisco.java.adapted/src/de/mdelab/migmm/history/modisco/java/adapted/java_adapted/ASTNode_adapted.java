/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import de.mdelab.migmm.history.NodeWithHistory;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AST Node adapted</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ASTNode_adapted#getComments <em>Comments</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ASTNode_adapted#getOriginalCompilationUnit <em>Original Compilation Unit</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ASTNode_adapted#getOriginalClassFile <em>Original Class File</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getASTNode_adapted()
 * @model abstract="true"
 * @generated
 */
public interface ASTNode_adapted extends NodeWithHistory {
	/**
	 * Returns the value of the '<em><b>Comments</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ASTNode_adapted_commentsItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getASTNode_adapted_Comments()
	 * @model
	 * @generated
	 */
	EList<ASTNode_adapted_commentsItem> getComments();

	/**
	 * Returns the value of the '<em><b>Original Compilation Unit</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ASTNode_adapted_originalCompilationUnitItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Compilation Unit</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getASTNode_adapted_OriginalCompilationUnit()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ASTNode_adapted_originalCompilationUnitItem> getOriginalCompilationUnit();

	/**
	 * Returns the value of the '<em><b>Original Class File</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ASTNode_adapted_originalClassFileItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Class File</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getASTNode_adapted_OriginalClassFile()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ASTNode_adapted_originalClassFileItem> getOriginalClassFile();

} // ASTNode_adapted
