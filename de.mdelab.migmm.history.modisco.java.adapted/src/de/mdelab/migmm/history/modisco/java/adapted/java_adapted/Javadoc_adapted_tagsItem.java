/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import de.mdelab.migmm.history.ContainmentEdgeWithHistory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Javadoc adapted tags Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Javadoc_adapted_tagsItem#getTags <em>Tags</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getJavadoc_adapted_tagsItem()
 * @model
 * @generated
 */
public interface Javadoc_adapted_tagsItem extends ContainmentEdgeWithHistory {
	/**
	 * Returns the value of the '<em><b>Tags</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' reference.
	 * @see #setTags(TagElement_adapted)
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getJavadoc_adapted_tagsItem_Tags()
	 * @model required="true"
	 * @generated
	 */
	TagElement_adapted getTags();

	/**
	 * Sets the value of the '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Javadoc_adapted_tagsItem#getTags <em>Tags</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tags</em>' reference.
	 * @see #getTags()
	 * @generated
	 */
	void setTags(TagElement_adapted value);

} // Javadoc_adapted_tagsItem
