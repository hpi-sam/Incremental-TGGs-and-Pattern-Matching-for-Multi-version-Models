/**
 */
package de.mdelab.migmm.history;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge With History</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.EdgeWithHistory#getEdgeSource <em>Edge Source</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.EdgeWithHistory#getEdgeTarget <em>Edge Target</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.EdgeWithHistory#isIsContainment <em>Is Containment</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.HistoryPackage#getEdgeWithHistory()
 * @model
 * @generated
 */
public interface EdgeWithHistory extends ElementWithHistory {

	/**
	 * Returns the value of the '<em><b>Edge Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.mdelab.migmm.history.NodeWithHistory#getOutEdges <em>Out Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge Source</em>' reference.
	 * @see #setEdgeSource(NodeWithHistory)
	 * @see de.mdelab.migmm.history.HistoryPackage#getEdgeWithHistory_EdgeSource()
	 * @see de.mdelab.migmm.history.NodeWithHistory#getOutEdges
	 * @model opposite="outEdges"
	 * @generated
	 */
	NodeWithHistory getEdgeSource();

	/**
	 * Sets the value of the '{@link de.mdelab.migmm.history.EdgeWithHistory#getEdgeSource <em>Edge Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edge Source</em>' reference.
	 * @see #getEdgeSource()
	 * @generated
	 */
	void setEdgeSource(NodeWithHistory value);

	/**
	 * Returns the value of the '<em><b>Edge Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.mdelab.migmm.history.NodeWithHistory#getInEdges <em>In Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge Target</em>' reference.
	 * @see #setEdgeTarget(NodeWithHistory)
	 * @see de.mdelab.migmm.history.HistoryPackage#getEdgeWithHistory_EdgeTarget()
	 * @see de.mdelab.migmm.history.NodeWithHistory#getInEdges
	 * @model opposite="inEdges"
	 * @generated
	 */
	NodeWithHistory getEdgeTarget();

	/**
	 * Sets the value of the '{@link de.mdelab.migmm.history.EdgeWithHistory#getEdgeTarget <em>Edge Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edge Target</em>' reference.
	 * @see #getEdgeTarget()
	 * @generated
	 */
	void setEdgeTarget(NodeWithHistory value);

	/**
	 * Returns the value of the '<em><b>Is Containment</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Containment</em>' attribute.
	 * @see #isSetIsContainment()
	 * @see #unsetIsContainment()
	 * @see #setIsContainment(boolean)
	 * @see de.mdelab.migmm.history.HistoryPackage#getEdgeWithHistory_IsContainment()
	 * @model default="false" unsettable="true" required="true"
	 * @generated
	 */
	boolean isIsContainment();

	/**
	 * Sets the value of the '{@link de.mdelab.migmm.history.EdgeWithHistory#isIsContainment <em>Is Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Containment</em>' attribute.
	 * @see #isSetIsContainment()
	 * @see #unsetIsContainment()
	 * @see #isIsContainment()
	 * @generated
	 */
	void setIsContainment(boolean value);

	/**
	 * Unsets the value of the '{@link de.mdelab.migmm.history.EdgeWithHistory#isIsContainment <em>Is Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsContainment()
	 * @see #isIsContainment()
	 * @see #setIsContainment(boolean)
	 * @generated
	 */
	void unsetIsContainment();

	/**
	 * Returns whether the value of the '{@link de.mdelab.migmm.history.EdgeWithHistory#isIsContainment <em>Is Containment</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Containment</em>' attribute is set.
	 * @see #unsetIsContainment()
	 * @see #isIsContainment()
	 * @see #setIsContainment(boolean)
	 * @generated
	 */
	boolean isSetIsContainment();
} // EdgeWithHistory
