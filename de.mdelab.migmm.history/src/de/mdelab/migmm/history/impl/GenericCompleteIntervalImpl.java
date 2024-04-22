/**
 */
package de.mdelab.migmm.history.impl;

import de.mdelab.migmm.history.GenericCompleteInterval;
import de.mdelab.migmm.history.HistoryPackage;
import de.mdelab.migmm.history.Interval;
import de.mdelab.migmm.history.TimingUnit;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Complete Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class GenericCompleteIntervalImpl extends MinimalEObjectImpl.Container implements GenericCompleteInterval {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenericCompleteIntervalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HistoryPackage.Literals.GENERIC_COMPLETE_INTERVAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public Interval intersect(Interval i) {
		return EcoreUtil.copy(i);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public Interval minus(Interval i) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public Interval union(Interval i) {
		return EcoreUtil.copy(this);
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
	 * @generated not
	 */
	public boolean contains(TimingUnit t) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean isEmpty() {
		return false;
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case HistoryPackage.GENERIC_COMPLETE_INTERVAL___INTERSECT__INTERVAL:
				return intersect((Interval)arguments.get(0));
			case HistoryPackage.GENERIC_COMPLETE_INTERVAL___MINUS__INTERVAL:
				return minus((Interval)arguments.get(0));
			case HistoryPackage.GENERIC_COMPLETE_INTERVAL___UNION__INTERVAL:
				return union((Interval)arguments.get(0));
			case HistoryPackage.GENERIC_COMPLETE_INTERVAL___COMPLEMENT:
				return complement();
			case HistoryPackage.GENERIC_COMPLETE_INTERVAL___CONTAINS__TIMINGUNIT:
				return contains((TimingUnit)arguments.get(0));
			case HistoryPackage.GENERIC_COMPLETE_INTERVAL___IS_EMPTY:
				return isEmpty();
			case HistoryPackage.GENERIC_COMPLETE_INTERVAL___GET_PRESENT_TIMING:
				return getPresentTiming();
			case HistoryPackage.GENERIC_COMPLETE_INTERVAL___GET_DELETED_TIMING:
				return getDeletedTiming();
			case HistoryPackage.GENERIC_COMPLETE_INTERVAL___GET_ABSENT_TIMING:
				return getAbsentTiming();
		}
		return super.eInvoke(operationID, arguments);
	}

} //GenericCompleteIntervalImpl
