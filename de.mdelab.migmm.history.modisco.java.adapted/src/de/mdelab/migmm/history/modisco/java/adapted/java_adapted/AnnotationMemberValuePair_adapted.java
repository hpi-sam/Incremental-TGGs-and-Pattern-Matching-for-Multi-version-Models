/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Member Value Pair adapted</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AnnotationMemberValuePair_adapted#getMember <em>Member</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AnnotationMemberValuePair_adapted#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getAnnotationMemberValuePair_adapted()
 * @model
 * @generated
 */
public interface AnnotationMemberValuePair_adapted extends NamedElement_adapted {
	/**
	 * Returns the value of the '<em><b>Member</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AnnotationMemberValuePair_adapted_memberItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getAnnotationMemberValuePair_adapted_Member()
	 * @model ordered="false"
	 * @generated
	 */
	EList<AnnotationMemberValuePair_adapted_memberItem> getMember();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AnnotationMemberValuePair_adapted_valueItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getAnnotationMemberValuePair_adapted_Value()
	 * @model ordered="false"
	 * @generated
	 */
	EList<AnnotationMemberValuePair_adapted_valueItem> getValue();

} // AnnotationMemberValuePair_adapted
