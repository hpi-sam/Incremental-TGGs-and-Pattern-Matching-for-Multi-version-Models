/**
 */
package de.mdelab.migmm.history.impl;

import de.mdelab.migmm.history.ElementWithHistory;
import de.mdelab.migmm.history.HistoryPackage;
import de.mdelab.migmm.history.Interval;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element With History</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.impl.ElementWithHistoryImpl#getValidIn <em>Valid In</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.impl.ElementWithHistoryImpl#getUnhandled <em>Unhandled</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.impl.ElementWithHistoryImpl#isInProjection <em>In Projection</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ElementWithHistoryImpl extends MinimalEObjectImpl.Container implements ElementWithHistory {
	/**
	 * The cached value of the '{@link #getValidIn() <em>Valid In</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidIn()
	 * @generated
	 * @ordered
	 */
	protected Interval validIn;

	/**
	 * The cached value of the '{@link #getUnhandled() <em>Unhandled</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnhandled()
	 * @generated
	 * @ordered
	 */
	protected Interval unhandled;

	/**
	 * The default value of the '{@link #isInProjection() <em>In Projection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInProjection()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IN_PROJECTION_EDEFAULT = true;
	/**
	 * The cached value of the '{@link #isInProjection() <em>In Projection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInProjection()
	 * @generated
	 * @ordered
	 */
	protected boolean inProjection = IN_PROJECTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementWithHistoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HistoryPackage.Literals.ELEMENT_WITH_HISTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Interval getValidIn() {
		return validIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidIn(Interval newValidIn, NotificationChain msgs) {
		Interval oldValidIn = validIn;
		validIn = newValidIn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HistoryPackage.ELEMENT_WITH_HISTORY__VALID_IN, oldValidIn, newValidIn);
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
	public void setValidIn(Interval newValidIn) {
		if (newValidIn != validIn) {
			NotificationChain msgs = null;
			if (validIn != null)
				msgs = ((InternalEObject)validIn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HistoryPackage.ELEMENT_WITH_HISTORY__VALID_IN, null, msgs);
			if (newValidIn != null)
				msgs = ((InternalEObject)newValidIn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HistoryPackage.ELEMENT_WITH_HISTORY__VALID_IN, null, msgs);
			msgs = basicSetValidIn(newValidIn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HistoryPackage.ELEMENT_WITH_HISTORY__VALID_IN, newValidIn, newValidIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Interval getUnhandled() {
		return unhandled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnhandled(Interval newUnhandled, NotificationChain msgs) {
		Interval oldUnhandled = unhandled;
		unhandled = newUnhandled;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HistoryPackage.ELEMENT_WITH_HISTORY__UNHANDLED, oldUnhandled, newUnhandled);
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
	public void setUnhandled(Interval newUnhandled) {
		if (newUnhandled != unhandled) {
			NotificationChain msgs = null;
			if (unhandled != null)
				msgs = ((InternalEObject)unhandled).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HistoryPackage.ELEMENT_WITH_HISTORY__UNHANDLED, null, msgs);
			if (newUnhandled != null)
				msgs = ((InternalEObject)newUnhandled).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HistoryPackage.ELEMENT_WITH_HISTORY__UNHANDLED, null, msgs);
			msgs = basicSetUnhandled(newUnhandled, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HistoryPackage.ELEMENT_WITH_HISTORY__UNHANDLED, newUnhandled, newUnhandled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isInProjection() {
		return inProjection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInProjection(boolean newInProjection) {
		boolean oldInProjection = inProjection;
		inProjection = newInProjection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HistoryPackage.ELEMENT_WITH_HISTORY__IN_PROJECTION, oldInProjection, inProjection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HistoryPackage.ELEMENT_WITH_HISTORY__VALID_IN:
				return basicSetValidIn(null, msgs);
			case HistoryPackage.ELEMENT_WITH_HISTORY__UNHANDLED:
				return basicSetUnhandled(null, msgs);
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
			case HistoryPackage.ELEMENT_WITH_HISTORY__VALID_IN:
				return getValidIn();
			case HistoryPackage.ELEMENT_WITH_HISTORY__UNHANDLED:
				return getUnhandled();
			case HistoryPackage.ELEMENT_WITH_HISTORY__IN_PROJECTION:
				return isInProjection();
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
			case HistoryPackage.ELEMENT_WITH_HISTORY__VALID_IN:
				setValidIn((Interval)newValue);
				return;
			case HistoryPackage.ELEMENT_WITH_HISTORY__UNHANDLED:
				setUnhandled((Interval)newValue);
				return;
			case HistoryPackage.ELEMENT_WITH_HISTORY__IN_PROJECTION:
				setInProjection((Boolean)newValue);
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
			case HistoryPackage.ELEMENT_WITH_HISTORY__VALID_IN:
				setValidIn((Interval)null);
				return;
			case HistoryPackage.ELEMENT_WITH_HISTORY__UNHANDLED:
				setUnhandled((Interval)null);
				return;
			case HistoryPackage.ELEMENT_WITH_HISTORY__IN_PROJECTION:
				setInProjection(IN_PROJECTION_EDEFAULT);
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
			case HistoryPackage.ELEMENT_WITH_HISTORY__VALID_IN:
				return validIn != null;
			case HistoryPackage.ELEMENT_WITH_HISTORY__UNHANDLED:
				return unhandled != null;
			case HistoryPackage.ELEMENT_WITH_HISTORY__IN_PROJECTION:
				return inProjection != IN_PROJECTION_EDEFAULT;
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
		result.append(" (inProjection: ");
		result.append(inProjection);
		result.append(')');
		return result.toString();
	}

} //ElementWithHistoryImpl
