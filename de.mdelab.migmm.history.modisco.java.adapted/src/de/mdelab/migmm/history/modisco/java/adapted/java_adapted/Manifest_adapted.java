/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import de.mdelab.migmm.history.NodeWithHistory;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manifest adapted</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Manifest_adapted#getMainAttributes <em>Main Attributes</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Manifest_adapted#getEntryAttributes <em>Entry Attributes</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getManifest_adapted()
 * @model
 * @generated
 */
public interface Manifest_adapted extends NodeWithHistory {
	/**
	 * Returns the value of the '<em><b>Main Attributes</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Manifest_adapted_mainAttributesItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Attributes</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getManifest_adapted_MainAttributes()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Manifest_adapted_mainAttributesItem> getMainAttributes();

	/**
	 * Returns the value of the '<em><b>Entry Attributes</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Manifest_adapted_entryAttributesItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Attributes</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getManifest_adapted_EntryAttributes()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Manifest_adapted_entryAttributesItem> getEntryAttributes();

} // Manifest_adapted
