/**
 */
package de.mdelab.migmm.history;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node With History</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.NodeWithHistory#getInEdges <em>In Edges</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.NodeWithHistory#getOutEdges <em>Out Edges</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.NodeWithHistory#getNodeAttributes <em>Node Attributes</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.HistoryPackage#getNodeWithHistory()
 * @model
 * @generated
 */
public interface NodeWithHistory extends ElementWithHistory {
	/**
	 * Returns the value of the '<em><b>In Edges</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.EdgeWithHistory}.
	 * It is bidirectional and its opposite is '{@link de.mdelab.migmm.history.EdgeWithHistory#getEdgeTarget <em>Edge Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Edges</em>' reference list.
	 * @see de.mdelab.migmm.history.HistoryPackage#getNodeWithHistory_InEdges()
	 * @see de.mdelab.migmm.history.EdgeWithHistory#getEdgeTarget
	 * @model opposite="edgeTarget"
	 * @generated
	 */
	EList<EdgeWithHistory> getInEdges();

	/**
	 * Returns the value of the '<em><b>Out Edges</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.EdgeWithHistory}.
	 * It is bidirectional and its opposite is '{@link de.mdelab.migmm.history.EdgeWithHistory#getEdgeSource <em>Edge Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Edges</em>' reference list.
	 * @see de.mdelab.migmm.history.HistoryPackage#getNodeWithHistory_OutEdges()
	 * @see de.mdelab.migmm.history.EdgeWithHistory#getEdgeSource
	 * @model opposite="edgeSource"
	 * @generated
	 */
	EList<EdgeWithHistory> getOutEdges();

	/**
	 * Returns the value of the '<em><b>Node Attributes</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.AttributeWithHistory}.
	 * It is bidirectional and its opposite is '{@link de.mdelab.migmm.history.AttributeWithHistory#getContainingNode <em>Containing Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Attributes</em>' reference list.
	 * @see de.mdelab.migmm.history.HistoryPackage#getNodeWithHistory_NodeAttributes()
	 * @see de.mdelab.migmm.history.AttributeWithHistory#getContainingNode
	 * @model opposite="containingNode"
	 * @generated
	 */
	EList<AttributeWithHistory> getNodeAttributes();

} // NodeWithHistory
