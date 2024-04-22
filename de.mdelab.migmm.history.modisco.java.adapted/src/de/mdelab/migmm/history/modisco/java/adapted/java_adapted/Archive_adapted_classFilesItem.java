/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import de.mdelab.migmm.history.ContainmentEdgeWithHistory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Archive adapted class Files Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Archive_adapted_classFilesItem#getClassFiles <em>Class Files</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getArchive_adapted_classFilesItem()
 * @model
 * @generated
 */
public interface Archive_adapted_classFilesItem extends ContainmentEdgeWithHistory {
	/**
	 * Returns the value of the '<em><b>Class Files</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Files</em>' reference.
	 * @see #setClassFiles(ClassFile_adapted)
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getArchive_adapted_classFilesItem_ClassFiles()
	 * @model required="true"
	 * @generated
	 */
	ClassFile_adapted getClassFiles();

	/**
	 * Sets the value of the '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Archive_adapted_classFilesItem#getClassFiles <em>Class Files</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Files</em>' reference.
	 * @see #getClassFiles()
	 * @generated
	 */
	void setClassFiles(ClassFile_adapted value);

} // Archive_adapted_classFilesItem
