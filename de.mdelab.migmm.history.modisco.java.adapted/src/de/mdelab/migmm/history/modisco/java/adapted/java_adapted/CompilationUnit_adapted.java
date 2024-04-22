/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compilation Unit adapted</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.CompilationUnit_adapted#getOriginalFilePath <em>Original File Path</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.CompilationUnit_adapted#getCommentList <em>Comment List</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.CompilationUnit_adapted#getImports <em>Imports</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.CompilationUnit_adapted#getPackage <em>Package</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.CompilationUnit_adapted#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getCompilationUnit_adapted()
 * @model
 * @generated
 */
public interface CompilationUnit_adapted extends NamedElement_adapted {
	/**
	 * Returns the value of the '<em><b>Original File Path</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.CompilationUnit_adapted_originalFilePathValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original File Path</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getCompilationUnit_adapted_OriginalFilePath()
	 * @model ordered="false"
	 * @generated
	 */
	EList<CompilationUnit_adapted_originalFilePathValue> getOriginalFilePath();

	/**
	 * Returns the value of the '<em><b>Comment List</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.CompilationUnit_adapted_commentListItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment List</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getCompilationUnit_adapted_CommentList()
	 * @model
	 * @generated
	 */
	EList<CompilationUnit_adapted_commentListItem> getCommentList();

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.CompilationUnit_adapted_importsItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getCompilationUnit_adapted_Imports()
	 * @model
	 * @generated
	 */
	EList<CompilationUnit_adapted_importsItem> getImports();

	/**
	 * Returns the value of the '<em><b>Package</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.CompilationUnit_adapted_packageItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getCompilationUnit_adapted_Package()
	 * @model ordered="false"
	 * @generated
	 */
	EList<CompilationUnit_adapted_packageItem> getPackage();

	/**
	 * Returns the value of the '<em><b>Types</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.CompilationUnit_adapted_typesItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getCompilationUnit_adapted_Types()
	 * @model
	 * @generated
	 */
	EList<CompilationUnit_adapted_typesItem> getTypes();

} // CompilationUnit_adapted
