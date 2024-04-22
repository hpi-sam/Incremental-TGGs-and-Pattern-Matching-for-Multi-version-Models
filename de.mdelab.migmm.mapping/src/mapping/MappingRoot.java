/**
 */
package mapping;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mapping.MappingRoot#getMappings <em>Mappings</em>}</li>
 *   <li>{@link mapping.MappingRoot#getPkg <em>Pkg</em>}</li>
 *   <li>{@link mapping.MappingRoot#getAxiomClass <em>Axiom Class</em>}</li>
 * </ul>
 *
 * @see mapping.MappingPackage#getMappingRoot()
 * @model
 * @generated
 */
public interface MappingRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link mapping.Mapping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mappings</em>' containment reference list.
	 * @see mapping.MappingPackage#getMappingRoot_Mappings()
	 * @model containment="true"
	 * @generated
	 */
	EList<Mapping> getMappings();

	/**
	 * Returns the value of the '<em><b>Pkg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pkg</em>' reference.
	 * @see #setPkg(EPackage)
	 * @see mapping.MappingPackage#getMappingRoot_Pkg()
	 * @model
	 * @generated
	 */
	EPackage getPkg();

	/**
	 * Sets the value of the '{@link mapping.MappingRoot#getPkg <em>Pkg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pkg</em>' reference.
	 * @see #getPkg()
	 * @generated
	 */
	void setPkg(EPackage value);

	/**
	 * Returns the value of the '<em><b>Axiom Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axiom Class</em>' reference.
	 * @see #setAxiomClass(EClass)
	 * @see mapping.MappingPackage#getMappingRoot_AxiomClass()
	 * @model
	 * @generated
	 */
	EClass getAxiomClass();

	/**
	 * Sets the value of the '{@link mapping.MappingRoot#getAxiomClass <em>Axiom Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axiom Class</em>' reference.
	 * @see #getAxiomClass()
	 * @generated
	 */
	void setAxiomClass(EClass value);

} // MappingRoot
