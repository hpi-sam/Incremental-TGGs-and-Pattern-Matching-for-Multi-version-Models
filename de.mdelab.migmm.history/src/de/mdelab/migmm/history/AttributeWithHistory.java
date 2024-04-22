/**
 */
package de.mdelab.migmm.history;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute With History</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.AttributeWithHistory#getContainingNode <em>Containing Node</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.AttributeWithHistory#getAttributeValue <em>Attribute Value</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.HistoryPackage#getAttributeWithHistory()
 * @model
 * @generated
 */
public interface AttributeWithHistory extends ElementWithHistory {

	/**
	 * Returns the value of the '<em><b>Containing Node</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.mdelab.migmm.history.NodeWithHistory#getNodeAttributes <em>Node Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containing Node</em>' reference.
	 * @see #setContainingNode(NodeWithHistory)
	 * @see de.mdelab.migmm.history.HistoryPackage#getAttributeWithHistory_ContainingNode()
	 * @see de.mdelab.migmm.history.NodeWithHistory#getNodeAttributes
	 * @model opposite="nodeAttributes"
	 * @generated
	 */
	NodeWithHistory getContainingNode();

	/**
	 * Sets the value of the '{@link de.mdelab.migmm.history.AttributeWithHistory#getContainingNode <em>Containing Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containing Node</em>' reference.
	 * @see #getContainingNode()
	 * @generated
	 */
	void setContainingNode(NodeWithHistory value);

	/**
	 * Returns the value of the '<em><b>Attribute Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Value</em>' attribute.
	 * @see #setAttributeValue(Object)
	 * @see de.mdelab.migmm.history.HistoryPackage#getAttributeWithHistory_AttributeValue()
	 * @model
	 * @generated
	 */
	Object getAttributeValue();

	/**
	 * Sets the value of the '{@link de.mdelab.migmm.history.AttributeWithHistory#getAttributeValue <em>Attribute Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Value</em>' attribute.
	 * @see #getAttributeValue()
	 * @generated
	 */
	void setAttributeValue(Object value);
} // AttributeWithHistory
