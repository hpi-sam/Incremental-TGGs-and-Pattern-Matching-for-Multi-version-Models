/**
 */
package de.mdelab.migmm.history.impl;

import de.mdelab.migmm.history.AttributeWithHistory;
import de.mdelab.migmm.history.EdgeWithHistory;
import de.mdelab.migmm.history.HistoryPackage;
import de.mdelab.migmm.history.NodeWithHistory;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node With History</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.impl.NodeWithHistoryImpl#getInEdges <em>In Edges</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.impl.NodeWithHistoryImpl#getOutEdges <em>Out Edges</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.impl.NodeWithHistoryImpl#getNodeAttributes <em>Node Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeWithHistoryImpl extends ElementWithHistoryImpl implements NodeWithHistory {
	/**
	 * The cached value of the '{@link #getInEdges() <em>In Edges</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<EdgeWithHistory> inEdges;

	/**
	 * The cached value of the '{@link #getOutEdges() <em>Out Edges</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<EdgeWithHistory> outEdges;

	/**
	 * The cached value of the '{@link #getNodeAttributes() <em>Node Attributes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeWithHistory> nodeAttributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeWithHistoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HistoryPackage.Literals.NODE_WITH_HISTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EdgeWithHistory> getInEdges() {
		if (inEdges == null) {
			inEdges = new EObjectWithInverseResolvingEList<EdgeWithHistory>(EdgeWithHistory.class, this, HistoryPackage.NODE_WITH_HISTORY__IN_EDGES, HistoryPackage.EDGE_WITH_HISTORY__EDGE_TARGET);
		}
		return inEdges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EdgeWithHistory> getOutEdges() {
		if (outEdges == null) {
			outEdges = new EObjectWithInverseResolvingEList<EdgeWithHistory>(EdgeWithHistory.class, this, HistoryPackage.NODE_WITH_HISTORY__OUT_EDGES, HistoryPackage.EDGE_WITH_HISTORY__EDGE_SOURCE);
		}
		return outEdges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AttributeWithHistory> getNodeAttributes() {
		if (nodeAttributes == null) {
			nodeAttributes = new EObjectWithInverseResolvingEList<AttributeWithHistory>(AttributeWithHistory.class, this, HistoryPackage.NODE_WITH_HISTORY__NODE_ATTRIBUTES, HistoryPackage.ATTRIBUTE_WITH_HISTORY__CONTAINING_NODE);
		}
		return nodeAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HistoryPackage.NODE_WITH_HISTORY__IN_EDGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInEdges()).basicAdd(otherEnd, msgs);
			case HistoryPackage.NODE_WITH_HISTORY__OUT_EDGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutEdges()).basicAdd(otherEnd, msgs);
			case HistoryPackage.NODE_WITH_HISTORY__NODE_ATTRIBUTES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNodeAttributes()).basicAdd(otherEnd, msgs);
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
			case HistoryPackage.NODE_WITH_HISTORY__IN_EDGES:
				return ((InternalEList<?>)getInEdges()).basicRemove(otherEnd, msgs);
			case HistoryPackage.NODE_WITH_HISTORY__OUT_EDGES:
				return ((InternalEList<?>)getOutEdges()).basicRemove(otherEnd, msgs);
			case HistoryPackage.NODE_WITH_HISTORY__NODE_ATTRIBUTES:
				return ((InternalEList<?>)getNodeAttributes()).basicRemove(otherEnd, msgs);
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
			case HistoryPackage.NODE_WITH_HISTORY__IN_EDGES:
				return getInEdges();
			case HistoryPackage.NODE_WITH_HISTORY__OUT_EDGES:
				return getOutEdges();
			case HistoryPackage.NODE_WITH_HISTORY__NODE_ATTRIBUTES:
				return getNodeAttributes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HistoryPackage.NODE_WITH_HISTORY__IN_EDGES:
				getInEdges().clear();
				getInEdges().addAll((Collection<? extends EdgeWithHistory>)newValue);
				return;
			case HistoryPackage.NODE_WITH_HISTORY__OUT_EDGES:
				getOutEdges().clear();
				getOutEdges().addAll((Collection<? extends EdgeWithHistory>)newValue);
				return;
			case HistoryPackage.NODE_WITH_HISTORY__NODE_ATTRIBUTES:
				getNodeAttributes().clear();
				getNodeAttributes().addAll((Collection<? extends AttributeWithHistory>)newValue);
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
			case HistoryPackage.NODE_WITH_HISTORY__IN_EDGES:
				getInEdges().clear();
				return;
			case HistoryPackage.NODE_WITH_HISTORY__OUT_EDGES:
				getOutEdges().clear();
				return;
			case HistoryPackage.NODE_WITH_HISTORY__NODE_ATTRIBUTES:
				getNodeAttributes().clear();
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
			case HistoryPackage.NODE_WITH_HISTORY__IN_EDGES:
				return inEdges != null && !inEdges.isEmpty();
			case HistoryPackage.NODE_WITH_HISTORY__OUT_EDGES:
				return outEdges != null && !outEdges.isEmpty();
			case HistoryPackage.NODE_WITH_HISTORY__NODE_ATTRIBUTES:
				return nodeAttributes != null && !nodeAttributes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NodeWithHistoryImpl
