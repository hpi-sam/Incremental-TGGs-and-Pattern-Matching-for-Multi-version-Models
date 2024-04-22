/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Archive adapted</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Archive_adapted#getOriginalFilePath <em>Original File Path</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Archive_adapted#getClassFiles <em>Class Files</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Archive_adapted#getManifest <em>Manifest</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getArchive_adapted()
 * @model
 * @generated
 */
public interface Archive_adapted extends NamedElement_adapted {
	/**
	 * Returns the value of the '<em><b>Original File Path</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Archive_adapted_originalFilePathValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original File Path</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getArchive_adapted_OriginalFilePath()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Archive_adapted_originalFilePathValue> getOriginalFilePath();

	/**
	 * Returns the value of the '<em><b>Class Files</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Archive_adapted_classFilesItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Files</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getArchive_adapted_ClassFiles()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Archive_adapted_classFilesItem> getClassFiles();

	/**
	 * Returns the value of the '<em><b>Manifest</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Archive_adapted_manifestItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manifest</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getArchive_adapted_Manifest()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Archive_adapted_manifestItem> getManifest();

} // Archive_adapted
