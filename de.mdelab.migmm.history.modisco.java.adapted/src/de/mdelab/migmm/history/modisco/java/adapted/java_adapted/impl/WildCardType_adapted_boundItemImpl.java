/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.ContainmentEdgeWithHistoryImpl;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TypeAccess_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.WildCardType_adapted_boundItem;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wild Card Type adapted bound Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.WildCardType_adapted_boundItemImpl#getBound <em>Bound</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WildCardType_adapted_boundItemImpl extends ContainmentEdgeWithHistoryImpl implements WildCardType_adapted_boundItem {
	/**
	 * The cached value of the '{@link #getBound() <em>Bound</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBound()
	 * @generated
	 * @ordered
	 */
	protected TypeAccess_adapted bound;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WildCardType_adapted_boundItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getWildCardType_adapted_boundItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeAccess_adapted getBound() {
		if (bound != null && bound.eIsProxy()) {
			InternalEObject oldBound = (InternalEObject)bound;
			bound = (TypeAccess_adapted)eResolveProxy(oldBound);
			if (bound != oldBound) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Java_adaptedPackage.WILD_CARD_TYPE_ADAPTED_BOUND_ITEM__BOUND, oldBound, bound));
			}
		}
		return bound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAccess_adapted basicGetBound() {
		return bound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBound(TypeAccess_adapted newBound) {
		TypeAccess_adapted oldBound = bound;
		bound = newBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_adaptedPackage.WILD_CARD_TYPE_ADAPTED_BOUND_ITEM__BOUND, oldBound, bound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.WILD_CARD_TYPE_ADAPTED_BOUND_ITEM__BOUND:
				if (resolve) return getBound();
				return basicGetBound();
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
			case Java_adaptedPackage.WILD_CARD_TYPE_ADAPTED_BOUND_ITEM__BOUND:
				setBound((TypeAccess_adapted)newValue);
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
			case Java_adaptedPackage.WILD_CARD_TYPE_ADAPTED_BOUND_ITEM__BOUND:
				setBound((TypeAccess_adapted)null);
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
			case Java_adaptedPackage.WILD_CARD_TYPE_ADAPTED_BOUND_ITEM__BOUND:
				return bound != null;
		}
		return super.eIsSet(featureID);
	}

} //WildCardType_adapted_boundItemImpl
