/**
 */
package de.mdelab.migmm.history.impl;

import de.mdelab.migmm.history.ElementWithHistory;
import de.mdelab.migmm.history.History;
import de.mdelab.migmm.history.HistoryFactory;
import de.mdelab.migmm.history.HistoryPackage;
import de.mdelab.migmm.history.Interval;
import de.mdelab.migmm.history.TimingUnit;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>History</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.impl.HistoryImpl#getOwnedElements <em>Owned Elements</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.impl.HistoryImpl#getOwnedIntervals <em>Owned Intervals</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.impl.HistoryImpl#getOwnedTimingUnits <em>Owned Timing Units</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HistoryImpl extends ElementWithHistoryImpl implements History {
	/**
	 * The cached value of the '{@link #getOwnedElements() <em>Owned Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementWithHistory> ownedElements;

	/**
	 * The cached value of the '{@link #getOwnedIntervals() <em>Owned Intervals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedIntervals()
	 * @generated
	 * @ordered
	 */
	protected EList<Interval> ownedIntervals;

	/**
	 * The cached value of the '{@link #getOwnedTimingUnits() <em>Owned Timing Units</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTimingUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<TimingUnit> ownedTimingUnits;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	protected HistoryImpl() {
		super();
		
		Interval completeInterval = HistoryFactory.eINSTANCE.createGenericCompleteInterval();
		getOwnedIntervals().add(completeInterval);
		setValidIn(completeInterval);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HistoryPackage.Literals.HISTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ElementWithHistory> getOwnedElements() {
		if (ownedElements == null) {
			ownedElements = new EObjectContainmentEList<ElementWithHistory>(ElementWithHistory.class, this, HistoryPackage.HISTORY__OWNED_ELEMENTS);
		}
		return ownedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Interval> getOwnedIntervals() {
		if (ownedIntervals == null) {
			ownedIntervals = new EObjectContainmentEList<Interval>(Interval.class, this, HistoryPackage.HISTORY__OWNED_INTERVALS);
		}
		return ownedIntervals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TimingUnit> getOwnedTimingUnits() {
		if (ownedTimingUnits == null) {
			ownedTimingUnits = new EObjectContainmentEList<TimingUnit>(TimingUnit.class, this, HistoryPackage.HISTORY__OWNED_TIMING_UNITS);
		}
		return ownedTimingUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HistoryPackage.HISTORY__OWNED_ELEMENTS:
				return ((InternalEList<?>)getOwnedElements()).basicRemove(otherEnd, msgs);
			case HistoryPackage.HISTORY__OWNED_INTERVALS:
				return ((InternalEList<?>)getOwnedIntervals()).basicRemove(otherEnd, msgs);
			case HistoryPackage.HISTORY__OWNED_TIMING_UNITS:
				return ((InternalEList<?>)getOwnedTimingUnits()).basicRemove(otherEnd, msgs);
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
			case HistoryPackage.HISTORY__OWNED_ELEMENTS:
				return getOwnedElements();
			case HistoryPackage.HISTORY__OWNED_INTERVALS:
				return getOwnedIntervals();
			case HistoryPackage.HISTORY__OWNED_TIMING_UNITS:
				return getOwnedTimingUnits();
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
			case HistoryPackage.HISTORY__OWNED_ELEMENTS:
				getOwnedElements().clear();
				getOwnedElements().addAll((Collection<? extends ElementWithHistory>)newValue);
				return;
			case HistoryPackage.HISTORY__OWNED_INTERVALS:
				getOwnedIntervals().clear();
				getOwnedIntervals().addAll((Collection<? extends Interval>)newValue);
				return;
			case HistoryPackage.HISTORY__OWNED_TIMING_UNITS:
				getOwnedTimingUnits().clear();
				getOwnedTimingUnits().addAll((Collection<? extends TimingUnit>)newValue);
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
			case HistoryPackage.HISTORY__OWNED_ELEMENTS:
				getOwnedElements().clear();
				return;
			case HistoryPackage.HISTORY__OWNED_INTERVALS:
				getOwnedIntervals().clear();
				return;
			case HistoryPackage.HISTORY__OWNED_TIMING_UNITS:
				getOwnedTimingUnits().clear();
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
			case HistoryPackage.HISTORY__OWNED_ELEMENTS:
				return ownedElements != null && !ownedElements.isEmpty();
			case HistoryPackage.HISTORY__OWNED_INTERVALS:
				return ownedIntervals != null && !ownedIntervals.isEmpty();
			case HistoryPackage.HISTORY__OWNED_TIMING_UNITS:
				return ownedTimingUnits != null && !ownedTimingUnits.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HistoryImpl
