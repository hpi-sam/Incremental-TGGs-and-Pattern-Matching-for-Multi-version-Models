/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import de.mdelab.migmm.history.EdgeWithHistory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class File adapted attached Source Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ClassFile_adapted_attachedSourceItem#getAttachedSource <em>Attached Source</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getClassFile_adapted_attachedSourceItem()
 * @model
 * @generated
 */
public interface ClassFile_adapted_attachedSourceItem extends EdgeWithHistory {
	/**
	 * Returns the value of the '<em><b>Attached Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attached Source</em>' reference.
	 * @see #setAttachedSource(CompilationUnit_adapted)
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getClassFile_adapted_attachedSourceItem_AttachedSource()
	 * @model required="true"
	 * @generated
	 */
	CompilationUnit_adapted getAttachedSource();

	/**
	 * Sets the value of the '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ClassFile_adapted_attachedSourceItem#getAttachedSource <em>Attached Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attached Source</em>' reference.
	 * @see #getAttachedSource()
	 * @generated
	 */
	void setAttachedSource(CompilationUnit_adapted value);

} // ClassFile_adapted_attachedSourceItem
