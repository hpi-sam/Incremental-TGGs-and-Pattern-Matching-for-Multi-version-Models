/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import de.mdelab.migmm.history.EdgeWithHistory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AST Node adapted original Class File Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ASTNode_adapted_originalClassFileItem#getOriginalClassFile <em>Original Class File</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getASTNode_adapted_originalClassFileItem()
 * @model
 * @generated
 */
public interface ASTNode_adapted_originalClassFileItem extends EdgeWithHistory {
	/**
	 * Returns the value of the '<em><b>Original Class File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Class File</em>' reference.
	 * @see #setOriginalClassFile(ClassFile_adapted)
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getASTNode_adapted_originalClassFileItem_OriginalClassFile()
	 * @model required="true"
	 * @generated
	 */
	ClassFile_adapted getOriginalClassFile();

	/**
	 * Sets the value of the '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ASTNode_adapted_originalClassFileItem#getOriginalClassFile <em>Original Class File</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Class File</em>' reference.
	 * @see #getOriginalClassFile()
	 * @generated
	 */
	void setOriginalClassFile(ClassFile_adapted value);

} // ASTNode_adapted_originalClassFileItem
