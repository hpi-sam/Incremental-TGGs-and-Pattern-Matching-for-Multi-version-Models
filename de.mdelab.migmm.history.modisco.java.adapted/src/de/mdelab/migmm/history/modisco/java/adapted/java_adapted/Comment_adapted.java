/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comment adapted</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Comment_adapted#getContent <em>Content</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Comment_adapted#getEnclosedByParent <em>Enclosed By Parent</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Comment_adapted#getPrefixOfParent <em>Prefix Of Parent</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getComment_adapted()
 * @model abstract="true"
 * @generated
 */
public interface Comment_adapted extends ASTNode_adapted {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Comment_adapted_contentValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getComment_adapted_Content()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Comment_adapted_contentValue> getContent();

	/**
	 * Returns the value of the '<em><b>Enclosed By Parent</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Comment_adapted_enclosedByParentValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enclosed By Parent</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getComment_adapted_EnclosedByParent()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Comment_adapted_enclosedByParentValue> getEnclosedByParent();

	/**
	 * Returns the value of the '<em><b>Prefix Of Parent</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Comment_adapted_prefixOfParentValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix Of Parent</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getComment_adapted_PrefixOfParent()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Comment_adapted_prefixOfParentValue> getPrefixOfParent();

} // Comment_adapted
