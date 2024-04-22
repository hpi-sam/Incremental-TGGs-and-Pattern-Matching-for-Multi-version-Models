/**
 */
package de.mdelab.migmm.history.impl;

import de.mdelab.migmm.history.EdgeWithHistory;
import de.mdelab.migmm.history.HistoryPackage;

import de.mdelab.migmm.history.NodeWithHistory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge With History</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.impl.EdgeWithHistoryImpl#getEdgeSource <em>Edge Source</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.impl.EdgeWithHistoryImpl#getEdgeTarget <em>Edge Target</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.impl.EdgeWithHistoryImpl#isIsContainment <em>Is Containment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EdgeWithHistoryImpl extends ElementWithHistoryImpl implements EdgeWithHistory {
	/**
	 * The cached value of the '{@link #getEdgeSource() <em>Edge Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdgeSource()
	 * @generated
	 * @ordered
	 */
	protected NodeWithHistory edgeSource;
	/**
	 * The cached value of the '{@link #getEdgeTarget() <em>Edge Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdgeTarget()
	 * @generated
	 * @ordered
	 */
	protected NodeWithHistory edgeTarget;

	/**
	 * The default value of the '{@link #isIsContainment() <em>Is Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsContainment()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CONTAINMENT_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isIsContainment() <em>Is Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsContainment()
	 * @generated
	 * @ordered
	 */
	protected boolean isContainment = IS_CONTAINMENT_EDEFAULT;
	/**
	 * This is true if the Is Containment attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isContainmentESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EdgeWithHistoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HistoryPackage.Literals.EDGE_WITH_HISTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodeWithHistory getEdgeSource() {
		if (edgeSource != null && edgeSource.eIsProxy()) {
			InternalEObject oldEdgeSource = (InternalEObject)edgeSource;
			edgeSource = (NodeWithHistory)eResolveProxy(oldEdgeSource);
			if (edgeSource != oldEdgeSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HistoryPackage.EDGE_WITH_HISTORY__EDGE_SOURCE, oldEdgeSource, edgeSource));
			}
		}
		return edgeSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeWithHistory basicGetEdgeSource() {
		return edgeSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEdgeSource(NodeWithHistory newEdgeSource, NotificationChain msgs) {
		NodeWithHistory oldEdgeSource = edgeSource;
		edgeSource = newEdgeSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HistoryPackage.EDGE_WITH_HISTORY__EDGE_SOURCE, oldEdgeSource, newEdgeSource);
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
	public void setEdgeSource(NodeWithHistory newEdgeSource) {
		if (newEdgeSource != edgeSource) {
			NotificationChain msgs = null;
			if (edgeSource != null)
				msgs = ((InternalEObject)edgeSource).eInverseRemove(this, HistoryPackage.NODE_WITH_HISTORY__OUT_EDGES, NodeWithHistory.class, msgs);
			if (newEdgeSource != null)
				msgs = ((InternalEObject)newEdgeSource).eInverseAdd(this, HistoryPackage.NODE_WITH_HISTORY__OUT_EDGES, NodeWithHistory.class, msgs);
			msgs = basicSetEdgeSource(newEdgeSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HistoryPackage.EDGE_WITH_HISTORY__EDGE_SOURCE, newEdgeSource, newEdgeSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodeWithHistory getEdgeTarget() {
		if (edgeTarget != null && edgeTarget.eIsProxy()) {
			InternalEObject oldEdgeTarget = (InternalEObject)edgeTarget;
			edgeTarget = (NodeWithHistory)eResolveProxy(oldEdgeTarget);
			if (edgeTarget != oldEdgeTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HistoryPackage.EDGE_WITH_HISTORY__EDGE_TARGET, oldEdgeTarget, edgeTarget));
			}
		}
		return edgeTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeWithHistory basicGetEdgeTarget() {
		return edgeTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEdgeTarget(NodeWithHistory newEdgeTarget, NotificationChain msgs) {
		NodeWithHistory oldEdgeTarget = edgeTarget;
		edgeTarget = newEdgeTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HistoryPackage.EDGE_WITH_HISTORY__EDGE_TARGET, oldEdgeTarget, newEdgeTarget);
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
	public void setEdgeTarget(NodeWithHistory newEdgeTarget) {
		if (newEdgeTarget != edgeTarget) {
			NotificationChain msgs = null;
			if (edgeTarget != null)
				msgs = ((InternalEObject)edgeTarget).eInverseRemove(this, HistoryPackage.NODE_WITH_HISTORY__IN_EDGES, NodeWithHistory.class, msgs);
			if (newEdgeTarget != null)
				msgs = ((InternalEObject)newEdgeTarget).eInverseAdd(this, HistoryPackage.NODE_WITH_HISTORY__IN_EDGES, NodeWithHistory.class, msgs);
			msgs = basicSetEdgeTarget(newEdgeTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HistoryPackage.EDGE_WITH_HISTORY__EDGE_TARGET, newEdgeTarget, newEdgeTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsContainment() {
		return isContainment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsContainment(boolean newIsContainment) {
		boolean oldIsContainment = isContainment;
		isContainment = newIsContainment;
		boolean oldIsContainmentESet = isContainmentESet;
		isContainmentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HistoryPackage.EDGE_WITH_HISTORY__IS_CONTAINMENT, oldIsContainment, isContainment, !oldIsContainmentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIsContainment() {
		boolean oldIsContainment = isContainment;
		boolean oldIsContainmentESet = isContainmentESet;
		isContainment = IS_CONTAINMENT_EDEFAULT;
		isContainmentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, HistoryPackage.EDGE_WITH_HISTORY__IS_CONTAINMENT, oldIsContainment, IS_CONTAINMENT_EDEFAULT, oldIsContainmentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIsContainment() {
		return isContainmentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HistoryPackage.EDGE_WITH_HISTORY__EDGE_SOURCE:
				if (edgeSource != null)
					msgs = ((InternalEObject)edgeSource).eInverseRemove(this, HistoryPackage.NODE_WITH_HISTORY__OUT_EDGES, NodeWithHistory.class, msgs);
				return basicSetEdgeSource((NodeWithHistory)otherEnd, msgs);
			case HistoryPackage.EDGE_WITH_HISTORY__EDGE_TARGET:
				if (edgeTarget != null)
					msgs = ((InternalEObject)edgeTarget).eInverseRemove(this, HistoryPackage.NODE_WITH_HISTORY__IN_EDGES, NodeWithHistory.class, msgs);
				return basicSetEdgeTarget((NodeWithHistory)otherEnd, msgs);
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
			case HistoryPackage.EDGE_WITH_HISTORY__EDGE_SOURCE:
				return basicSetEdgeSource(null, msgs);
			case HistoryPackage.EDGE_WITH_HISTORY__EDGE_TARGET:
				return basicSetEdgeTarget(null, msgs);
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
			case HistoryPackage.EDGE_WITH_HISTORY__EDGE_SOURCE:
				if (resolve) return getEdgeSource();
				return basicGetEdgeSource();
			case HistoryPackage.EDGE_WITH_HISTORY__EDGE_TARGET:
				if (resolve) return getEdgeTarget();
				return basicGetEdgeTarget();
			case HistoryPackage.EDGE_WITH_HISTORY__IS_CONTAINMENT:
				return isIsContainment();
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
			case HistoryPackage.EDGE_WITH_HISTORY__EDGE_SOURCE:
				setEdgeSource((NodeWithHistory)newValue);
				return;
			case HistoryPackage.EDGE_WITH_HISTORY__EDGE_TARGET:
				setEdgeTarget((NodeWithHistory)newValue);
				return;
			case HistoryPackage.EDGE_WITH_HISTORY__IS_CONTAINMENT:
				setIsContainment((Boolean)newValue);
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
			case HistoryPackage.EDGE_WITH_HISTORY__EDGE_SOURCE:
				setEdgeSource((NodeWithHistory)null);
				return;
			case HistoryPackage.EDGE_WITH_HISTORY__EDGE_TARGET:
				setEdgeTarget((NodeWithHistory)null);
				return;
			case HistoryPackage.EDGE_WITH_HISTORY__IS_CONTAINMENT:
				unsetIsContainment();
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
			case HistoryPackage.EDGE_WITH_HISTORY__EDGE_SOURCE:
				return edgeSource != null;
			case HistoryPackage.EDGE_WITH_HISTORY__EDGE_TARGET:
				return edgeTarget != null;
			case HistoryPackage.EDGE_WITH_HISTORY__IS_CONTAINMENT:
				return isSetIsContainment();
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
		result.append(" (isContainment: ");
		if (isContainmentESet) result.append(isContainment); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //EdgeWithHistoryImpl
