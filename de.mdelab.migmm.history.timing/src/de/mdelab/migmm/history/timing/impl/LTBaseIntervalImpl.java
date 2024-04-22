/**
 */
package de.mdelab.migmm.history.timing.impl;

import de.mdelab.migmm.history.Interval;
import de.mdelab.migmm.history.TimingUnit;

import de.mdelab.migmm.history.timing.LTBaseInterval;
import de.mdelab.migmm.history.timing.TimingPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LT Base Interval</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.timing.impl.LTBaseIntervalImpl#getCts <em>Cts</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.timing.impl.LTBaseIntervalImpl#getDts <em>Dts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LTBaseIntervalImpl extends MinimalEObjectImpl.Container implements LTBaseInterval {
	/**
	 * The default value of the '{@link #getCts() <em>Cts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCts()
	 * @generated
	 * @ordered
	 */
	protected static final int CTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCts() <em>Cts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCts()
	 * @generated
	 * @ordered
	 */
	protected int cts = CTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDts() <em>Dts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDts()
	 * @generated
	 * @ordered
	 */
	protected static final int DTS_EDEFAULT = 2147483647;

	/**
	 * The cached value of the '{@link #getDts() <em>Dts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDts()
	 * @generated
	 * @ordered
	 */
	protected int dts = DTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LTBaseIntervalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimingPackage.Literals.LT_BASE_INTERVAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCts() {
		return cts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCts(int newCts) {
		int oldCts = cts;
		cts = newCts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingPackage.LT_BASE_INTERVAL__CTS, oldCts, cts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDts() {
		return dts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDts(int newDts) {
		int oldDts = dts;
		dts = newDts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingPackage.LT_BASE_INTERVAL__DTS, oldDts, dts));
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
			case TimingPackage.LT_BASE_INTERVAL__CTS:
				return getCts();
			case TimingPackage.LT_BASE_INTERVAL__DTS:
				return getDts();
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
			case TimingPackage.LT_BASE_INTERVAL__CTS:
				setCts((Integer)newValue);
				return;
			case TimingPackage.LT_BASE_INTERVAL__DTS:
				setDts((Integer)newValue);
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
			case TimingPackage.LT_BASE_INTERVAL__CTS:
				setCts(CTS_EDEFAULT);
				return;
			case TimingPackage.LT_BASE_INTERVAL__DTS:
				setDts(DTS_EDEFAULT);
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
			case TimingPackage.LT_BASE_INTERVAL__CTS:
				return cts != CTS_EDEFAULT;
			case TimingPackage.LT_BASE_INTERVAL__DTS:
				return dts != DTS_EDEFAULT;
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
			case TimingPackage.LT_BASE_INTERVAL___INTERSECT__INTERVAL:
				return intersect((Interval)arguments.get(0));
			case TimingPackage.LT_BASE_INTERVAL___MINUS__INTERVAL:
				return minus((Interval)arguments.get(0));
			case TimingPackage.LT_BASE_INTERVAL___UNION__INTERVAL:
				return union((Interval)arguments.get(0));
			case TimingPackage.LT_BASE_INTERVAL___COMPLEMENT:
				return complement();
			case TimingPackage.LT_BASE_INTERVAL___CONTAINS__TIMINGUNIT:
				return contains((TimingUnit)arguments.get(0));
			case TimingPackage.LT_BASE_INTERVAL___IS_EMPTY:
				return isEmpty();
			case TimingPackage.LT_BASE_INTERVAL___GET_PRESENT_TIMING:
				return getPresentTiming();
			case TimingPackage.LT_BASE_INTERVAL___GET_DELETED_TIMING:
				return getDeletedTiming();
			case TimingPackage.LT_BASE_INTERVAL___GET_ABSENT_TIMING:
				return getAbsentTiming();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (cts: ");
		result.append(cts);
		result.append(", dts: ");
		result.append(dts);
		result.append(')');
		return result.toString();
	}

} //LTBaseIntervalImpl
