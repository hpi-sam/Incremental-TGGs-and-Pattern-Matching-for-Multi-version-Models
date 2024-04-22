/**
 */
package de.mdelab.migmm.history.timing;

import de.mdelab.migmm.history.TimingUnit;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DAG Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.timing.DAGVersion#getSuccessors <em>Successors</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.timing.DAGVersion#getPredecessors <em>Predecessors</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.timing.DAGVersion#getId <em>Id</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.timing.DAGVersion#getIntID <em>Int ID</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.timing.TimingPackage#getDAGVersion()
 * @model
 * @generated
 */
public interface DAGVersion extends TimingUnit {
	/**
	 * Returns the value of the '<em><b>Successors</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.timing.DAGVersion}.
	 * It is bidirectional and its opposite is '{@link de.mdelab.migmm.history.timing.DAGVersion#getPredecessors <em>Predecessors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Successors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successors</em>' reference list.
	 * @see de.mdelab.migmm.history.timing.TimingPackage#getDAGVersion_Successors()
	 * @see de.mdelab.migmm.history.timing.DAGVersion#getPredecessors
	 * @model opposite="predecessors"
	 * @generated
	 */
	EList<DAGVersion> getSuccessors();

	/**
	 * Returns the value of the '<em><b>Predecessors</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.timing.DAGVersion}.
	 * It is bidirectional and its opposite is '{@link de.mdelab.migmm.history.timing.DAGVersion#getSuccessors <em>Successors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predecessors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predecessors</em>' reference list.
	 * @see de.mdelab.migmm.history.timing.TimingPackage#getDAGVersion_Predecessors()
	 * @see de.mdelab.migmm.history.timing.DAGVersion#getSuccessors
	 * @model opposite="successors"
	 * @generated
	 */
	EList<DAGVersion> getPredecessors();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.mdelab.migmm.history.timing.TimingPackage#getDAGVersion_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.mdelab.migmm.history.timing.DAGVersion#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Int ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int ID</em>' attribute.
	 * @see #setIntID(int)
	 * @see de.mdelab.migmm.history.timing.TimingPackage#getDAGVersion_IntID()
	 * @model
	 * @generated
	 */
	int getIntID();

	/**
	 * Sets the value of the '{@link de.mdelab.migmm.history.timing.DAGVersion#getIntID <em>Int ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Int ID</em>' attribute.
	 * @see #getIntID()
	 * @generated
	 */
	void setIntID(int value);

} // DAGVersion
