/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import de.mdelab.migmm.history.NodeWithHistory;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model adapted</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Model_adapted#getName <em>Name</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Model_adapted#getOwnedElements <em>Owned Elements</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Model_adapted#getOrphanTypes <em>Orphan Types</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Model_adapted#getUnresolvedItems <em>Unresolved Items</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Model_adapted#getCompilationUnits <em>Compilation Units</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Model_adapted#getClassFiles <em>Class Files</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Model_adapted#getArchives <em>Archives</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getModel_adapted()
 * @model
 * @generated
 */
public interface Model_adapted extends NodeWithHistory {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Model_adapted_nameValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getModel_adapted_Name()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Model_adapted_nameValue> getName();

	/**
	 * Returns the value of the '<em><b>Owned Elements</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Model_adapted_ownedElementsItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Elements</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getModel_adapted_OwnedElements()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Model_adapted_ownedElementsItem> getOwnedElements();

	/**
	 * Returns the value of the '<em><b>Orphan Types</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Model_adapted_orphanTypesItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orphan Types</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getModel_adapted_OrphanTypes()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Model_adapted_orphanTypesItem> getOrphanTypes();

	/**
	 * Returns the value of the '<em><b>Unresolved Items</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Model_adapted_unresolvedItemsItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unresolved Items</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getModel_adapted_UnresolvedItems()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Model_adapted_unresolvedItemsItem> getUnresolvedItems();

	/**
	 * Returns the value of the '<em><b>Compilation Units</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Model_adapted_compilationUnitsItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compilation Units</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getModel_adapted_CompilationUnits()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Model_adapted_compilationUnitsItem> getCompilationUnits();

	/**
	 * Returns the value of the '<em><b>Class Files</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Model_adapted_classFilesItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Files</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getModel_adapted_ClassFiles()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Model_adapted_classFilesItem> getClassFiles();

	/**
	 * Returns the value of the '<em><b>Archives</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Model_adapted_archivesItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Archives</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getModel_adapted_Archives()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Model_adapted_archivesItem> getArchives();

} // Model_adapted
