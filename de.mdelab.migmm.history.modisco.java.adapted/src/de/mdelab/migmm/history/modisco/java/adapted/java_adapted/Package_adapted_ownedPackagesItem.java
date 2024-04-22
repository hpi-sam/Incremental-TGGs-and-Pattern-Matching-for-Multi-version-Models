/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted;

import de.mdelab.migmm.history.ContainmentEdgeWithHistory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package adapted owned Packages Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Package_adapted_ownedPackagesItem#getOwnedPackages <em>Owned Packages</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getPackage_adapted_ownedPackagesItem()
 * @model
 * @generated
 */
public interface Package_adapted_ownedPackagesItem extends ContainmentEdgeWithHistory {
	/**
	 * Returns the value of the '<em><b>Owned Packages</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Packages</em>' reference.
	 * @see #setOwnedPackages(Package_adapted)
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#getPackage_adapted_ownedPackagesItem_OwnedPackages()
	 * @model required="true"
	 * @generated
	 */
	Package_adapted getOwnedPackages();

	/**
	 * Sets the value of the '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Package_adapted_ownedPackagesItem#getOwnedPackages <em>Owned Packages</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Packages</em>' reference.
	 * @see #getOwnedPackages()
	 * @generated
	 */
	void setOwnedPackages(Package_adapted value);

} // Package_adapted_ownedPackagesItem
