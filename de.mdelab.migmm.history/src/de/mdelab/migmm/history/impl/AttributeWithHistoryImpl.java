/**
 */
package de.mdelab.migmm.history.impl;

import de.mdelab.migmm.history.AttributeWithHistory;
import de.mdelab.migmm.history.HistoryPackage;

import de.mdelab.migmm.history.NodeWithHistory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute With History</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.impl.AttributeWithHistoryImpl#getContainingNode <em>Containing Node</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.impl.AttributeWithHistoryImpl#getAttributeValue <em>Attribute Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeWithHistoryImpl extends ElementWithHistoryImpl implements AttributeWithHistory {
	/**
	 * The cached value of the '{@link #getContainingNode() <em>Containing Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainingNode()
	 * @generated
	 * @ordered
	 */
	protected NodeWithHistory containingNode;

	/**
	 * The default value of the '{@link #getAttributeValue() <em>Attribute Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeValue()
	 * @generated
	 * @ordered
	 */
	protected static final Object ATTRIBUTE_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttributeValue() <em>Attribute Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeValue()
	 * @generated
	 * @ordered
	 */
	protected Object attributeValue = ATTRIBUTE_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeWithHistoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HistoryPackage.Literals.ATTRIBUTE_WITH_HISTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodeWithHistory getContainingNode() {
		if (containingNode != null && containingNode.eIsProxy()) {
			InternalEObject oldContainingNode = (InternalEObject)containingNode;
			containingNode = (NodeWithHistory)eResolveProxy(oldContainingNode);
			if (containingNode != oldContainingNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HistoryPackage.ATTRIBUTE_WITH_HISTORY__CONTAINING_NODE, oldContainingNode, containingNode));
			}
		}
		return containingNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeWithHistory basicGetContainingNode() {
		return containingNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainingNode(NodeWithHistory newContainingNode, NotificationChain msgs) {
		NodeWithHistory oldContainingNode = containingNode;
		containingNode = newContainingNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HistoryPackage.ATTRIBUTE_WITH_HISTORY__CONTAINING_NODE, oldContainingNode, newContainingNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainingNode(NodeWithHistory newContainingNode) {
		if (newContainingNode != containingNode) {
			NotificationChain msgs = null;
			if (containingNode != null)
				msgs = ((InternalEObject)containingNode).eInverseRemove(this, HistoryPackage.NODE_WITH_HISTORY__NODE_ATTRIBUTES, NodeWithHistory.class, msgs);
			if (newContainingNode != null)
				msgs = ((InternalEObject)newContainingNode).eInverseAdd(this, HistoryPackage.NODE_WITH_HISTORY__NODE_ATTRIBUTES, NodeWithHistory.class, msgs);
			msgs = basicSetContainingNode(newContainingNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HistoryPackage.ATTRIBUTE_WITH_HISTORY__CONTAINING_NODE, newContainingNode, newContainingNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getAttributeValue() {
		return attributeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttributeValue(Object newAttributeValue) {
		Object oldAttributeValue = attributeValue;
		attributeValue = newAttributeValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HistoryPackage.ATTRIBUTE_WITH_HISTORY__ATTRIBUTE_VALUE, oldAttributeValue, attributeValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HistoryPackage.ATTRIBUTE_WITH_HISTORY__CONTAINING_NODE:
				if (containingNode != null)
					msgs = ((InternalEObject)containingNode).eInverseRemove(this, HistoryPackage.NODE_WITH_HISTORY__NODE_ATTRIBUTES, NodeWithHistory.class, msgs);
				return basicSetContainingNode((NodeWithHistory)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HistoryPackage.ATTRIBUTE_WITH_HISTORY__CONTAINING_NODE:
				return basicSetContainingNode(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HistoryPackage.ATTRIBUTE_WITH_HISTORY__CONTAINING_NODE:
				if (resolve) return getContainingNode();
				return basicGetContainingNode();
			case HistoryPackage.ATTRIBUTE_WITH_HISTORY__ATTRIBUTE_VALUE:
				return getAttributeValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HistoryPackage.ATTRIBUTE_WITH_HISTORY__CONTAINING_NODE:
				setContainingNode((NodeWithHistory)newValue);
				return;
			case HistoryPackage.ATTRIBUTE_WITH_HISTORY__ATTRIBUTE_VALUE:
				setAttributeValue(newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case HistoryPackage.ATTRIBUTE_WITH_HISTORY__CONTAINING_NODE:
				setContainingNode((NodeWithHistory)null);
				return;
			case HistoryPackage.ATTRIBUTE_WITH_HISTORY__ATTRIBUTE_VALUE:
				setAttributeValue(ATTRIBUTE_VALUE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case HistoryPackage.ATTRIBUTE_WITH_HISTORY__CONTAINING_NODE:
				return containingNode != null;
			case HistoryPackage.ATTRIBUTE_WITH_HISTORY__ATTRIBUTE_VALUE:
				return ATTRIBUTE_VALUE_EDEFAULT == null ? attributeValue != null : !ATTRIBUTE_VALUE_EDEFAULT.equals(attributeValue);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (attributeValue: ");
		result.append(attributeValue);
		result.append(')');
		return result.toString();
	}

} //AttributeWithHistoryImpl
