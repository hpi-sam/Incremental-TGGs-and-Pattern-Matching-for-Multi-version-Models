/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import de.mdelab.migmm.history.NodeWithHistory;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manifest Entry adapted</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ManifestEntry_adapted#getName <em>Name</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ManifestEntry_adapted#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getManifestEntry_adapted()
 * @model
 * @generated
 */
public interface ManifestEntry_adapted extends NodeWithHistory {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ManifestEntry_adapted_nameValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getManifestEntry_adapted_Name()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ManifestEntry_adapted_nameValue> getName();

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ManifestEntry_adapted_attributesItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' reference list.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getManifestEntry_adapted_Attributes()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ManifestEntry_adapted_attributesItem> getAttributes();

} // ManifestEntry_adapted
