/**
 */
package de.mdelab.migmm.history.timing.impl;

import de.mdelab.migmm.history.impl.TimingUnitImpl;

import de.mdelab.migmm.history.timing.DAGVersion;
import de.mdelab.migmm.history.timing.TimingPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DAG Version</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.timing.impl.DAGVersionImpl#getSuccessors <em>Successors</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.timing.impl.DAGVersionImpl#getPredecessors <em>Predecessors</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.timing.impl.DAGVersionImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.timing.impl.DAGVersionImpl#getIntID <em>Int ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DAGVersionImpl extends TimingUnitImpl implements DAGVersion {
	/**
	 * The cached value of the '{@link #getSuccessors() <em>Successors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessors()
	 * @generated
	 * @ordered
	 */
	protected EList<DAGVersion> successors;

	/**
	 * The cached value of the '{@link #getPredecessors() <em>Predecessors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredecessors()
	 * @generated
	 * @ordered
	 */
	protected EList<DAGVersion> predecessors;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getIntID() <em>Int ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntID()
	 * @generated
	 * @ordered
	 */
	protected static final int INT_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIntID() <em>Int ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntID()
	 * @generated
	 * @ordered
	 */
	protected int intID = INT_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DAGVersionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimingPackage.Literals.DAG_VERSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DAGVersion> getSuccessors() {
		if (successors == null) {
			successors = new EObjectWithInverseResolvingEList.ManyInverse<DAGVersion>(DAGVersion.class, this, TimingPackage.DAG_VERSION__SUCCESSORS, TimingPackage.DAG_VERSION__PREDECESSORS);
		}
		return successors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DAGVersion> getPredecessors() {
		if (predecessors == null) {
			predecessors = new EObjectWithInverseResolvingEList.ManyInverse<DAGVersion>(DAGVersion.class, this, TimingPackage.DAG_VERSION__PREDECESSORS, TimingPackage.DAG_VERSION__SUCCESSORS);
		}
		return predecessors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingPackage.DAG_VERSION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getIntID() {
		return intID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIntID(int newIntID) {
		int oldIntID = intID;
		intID = newIntID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingPackage.DAG_VERSION__INT_ID, oldIntID, intID));
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
			case TimingPackage.DAG_VERSION__SUCCESSORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSuccessors()).basicAdd(otherEnd, msgs);
			case TimingPackage.DAG_VERSION__PREDECESSORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPredecessors()).basicAdd(otherEnd, msgs);
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
			case TimingPackage.DAG_VERSION__SUCCESSORS:
				return ((InternalEList<?>)getSuccessors()).basicRemove(otherEnd, msgs);
			case TimingPackage.DAG_VERSION__PREDECESSORS:
				return ((InternalEList<?>)getPredecessors()).basicRemove(otherEnd, msgs);
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
			case TimingPackage.DAG_VERSION__SUCCESSORS:
				return getSuccessors();
			case TimingPackage.DAG_VERSION__PREDECESSORS:
				return getPredecessors();
			case TimingPackage.DAG_VERSION__ID:
				return getId();
			case TimingPackage.DAG_VERSION__INT_ID:
				return getIntID();
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
			case TimingPackage.DAG_VERSION__SUCCESSORS:
				getSuccessors().clear();
				getSuccessors().addAll((Collection<? extends DAGVersion>)newValue);
				return;
			case TimingPackage.DAG_VERSION__PREDECESSORS:
				getPredecessors().clear();
				getPredecessors().addAll((Collection<? extends DAGVersion>)newValue);
				return;
			case TimingPackage.DAG_VERSION__ID:
				setId((String)newValue);
				return;
			case TimingPackage.DAG_VERSION__INT_ID:
				setIntID((Integer)newValue);
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
			case TimingPackage.DAG_VERSION__SUCCESSORS:
				getSuccessors().clear();
				return;
			case TimingPackage.DAG_VERSION__PREDECESSORS:
				getPredecessors().clear();
				return;
			case TimingPackage.DAG_VERSION__ID:
				setId(ID_EDEFAULT);
				return;
			case TimingPackage.DAG_VERSION__INT_ID:
				setIntID(INT_ID_EDEFAULT);
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
			case TimingPackage.DAG_VERSION__SUCCESSORS:
				return successors != null && !successors.isEmpty();
			case TimingPackage.DAG_VERSION__PREDECESSORS:
				return predecessors != null && !predecessors.isEmpty();
			case TimingPackage.DAG_VERSION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case TimingPackage.DAG_VERSION__INT_ID:
				return intID != INT_ID_EDEFAULT;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", intID: ");
		result.append(intID);
		result.append(')');
		return result.toString();
	}

} //DAGVersionImpl
