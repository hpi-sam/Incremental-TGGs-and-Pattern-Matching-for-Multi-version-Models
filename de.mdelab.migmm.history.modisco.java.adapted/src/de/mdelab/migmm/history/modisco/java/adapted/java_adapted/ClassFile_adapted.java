/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class File adapted</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ClassFile_adapted#getOriginalFilePath <em>Original File Path</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ClassFile_adapted#getType <em>Type</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ClassFile_adapted#getAttachedSource <em>Attached Source</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ClassFile_adapted#getPackage <em>Package</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getClassFile_adapted()
 * @model
 * @generated
 */
public interface ClassFile_adapted extends NamedElement_adapted {
	/**
	 * Returns the value of the '<em><b>Original File Path</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ClassFile_adapted_originalFilePathValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original File Path</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getClassFile_adapted_OriginalFilePath()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ClassFile_adapted_originalFilePathValue> getOriginalFilePath();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ClassFile_adapted_typeItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getClassFile_adapted_Type()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ClassFile_adapted_typeItem> getType();

	/**
	 * Returns the value of the '<em><b>Attached Source</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ClassFile_adapted_attachedSourceItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attached Source</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getClassFile_adapted_AttachedSource()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ClassFile_adapted_attachedSourceItem> getAttachedSource();

	/**
	 * Returns the value of the '<em><b>Package</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ClassFile_adapted_packageItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getClassFile_adapted_Package()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ClassFile_adapted_packageItem> getPackage();

} // ClassFile_adapted
