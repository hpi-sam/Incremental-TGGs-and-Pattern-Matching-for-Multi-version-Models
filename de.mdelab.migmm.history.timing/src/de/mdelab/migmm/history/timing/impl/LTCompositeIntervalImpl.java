/**
 */
package de.mdelab.migmm.history.timing.impl;

import de.mdelab.migmm.history.Interval;
import de.mdelab.migmm.history.TimingUnit;

import de.mdelab.migmm.history.timing.LTBaseInterval;
import de.mdelab.migmm.history.timing.LTCompositeInterval;
import de.mdelab.migmm.history.timing.TimingPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LT Composite Interval</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.timing.impl.LTCompositeIntervalImpl#getBaseIntervals <em>Base Intervals</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LTCompositeIntervalImpl extends MinimalEObjectImpl.Container implements LTCompositeInterval {
	/**
	 * The cached value of the '{@link #getBaseIntervals() <em>Base Intervals</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseIntervals()
	 * @generated
	 * @ordered
	 */
	protected EList<LTBaseInterval> baseIntervals;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LTCompositeIntervalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimingPackage.Literals.LT_COMPOSITE_INTERVAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LTBaseInterval> getBaseIntervals() {
		if (baseIntervals == null) {
			baseIntervals = new EObjectResolvingEList<LTBaseInterval>(LTBaseInterval.class, this, TimingPackage.LT_COMPOSITE_INTERVAL__BASE_INTERVALS);
		}
		return baseIntervals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Interval intersect(Interval i) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Interval minus(Interval i) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Interval union(Interval i) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Interval complement() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean contains(TimingUnit t) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEmpty() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<?> getPresentTiming() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<?> getDeletedTiming() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<?> getAbsentTiming() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TimingPackage.LT_COMPOSITE_INTERVAL__BASE_INTERVALS:
				return getBaseIntervals();
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
			case TimingPackage.LT_COMPOSITE_INTERVAL__BASE_INTERVALS:
				getBaseIntervals().clear();
				getBaseIntervals().addAll((Collection<? extends LTBaseInterval>)newValue);
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
			case TimingPackage.LT_COMPOSITE_INTERVAL__BASE_INTERVALS:
				getBaseIntervals().clear();
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
			case TimingPackage.LT_COMPOSITE_INTERVAL__BASE_INTERVALS:
				return baseIntervals != null && !baseIntervals.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case TimingPackage.LT_COMPOSITE_INTERVAL___INTERSECT__INTERVAL:
				return intersect((Interval)arguments.get(0));
			case TimingPackage.LT_COMPOSITE_INTERVAL___MINUS__INTERVAL:
				return minus((Interval)arguments.get(0));
			case TimingPackage.LT_COMPOSITE_INTERVAL___UNION__INTERVAL:
				return union((Interval)arguments.get(0));
			case TimingPackage.LT_COMPOSITE_INTERVAL___COMPLEMENT:
				return complement();
			case TimingPackage.LT_COMPOSITE_INTERVAL___CONTAINS__TIMINGUNIT:
				return contains((TimingUnit)arguments.get(0));
			case TimingPackage.LT_COMPOSITE_INTERVAL___IS_EMPTY:
				return isEmpty();
			case TimingPackage.LT_COMPOSITE_INTERVAL___GET_PRESENT_TIMING:
				return getPresentTiming();
			case TimingPackage.LT_COMPOSITE_INTERVAL___GET_DELETED_TIMING:
				return getDeletedTiming();
			case TimingPackage.LT_COMPOSITE_INTERVAL___GET_ABSENT_TIMING:
				return getAbsentTiming();
		}
		return super.eInvoke(operationID, arguments);
	}

} //LTCompositeIntervalImpl
