/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.ContainmentEdgeWithHistoryImpl;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TypeAccess_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TypeParameter_adapted_boundsItem;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Parameter adapted bounds Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.TypeParameter_adapted_boundsItemImpl#getBounds <em>Bounds</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeParameter_adapted_boundsItemImpl extends ContainmentEdgeWithHistoryImpl implements TypeParameter_adapted_boundsItem {
	/**
	 * The cached value of the '{@link #getBounds() <em>Bounds</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBounds()
	 * @generated
	 * @ordered
	 */
	protected TypeAccess_adapted bounds;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeParameter_adapted_boundsItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getTypeParameter_adapted_boundsItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeAccess_adapted getBounds() {
		if (bounds != null && bounds.eIsProxy()) {
			InternalEObject oldBounds = (InternalEObject)bounds;
			bounds = (TypeAccess_adapted)eResolveProxy(oldBounds);
			if (bounds != oldBounds) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Java_adaptedPackage.TYPE_PARAMETER_ADAPTED_BOUNDS_ITEM__BOUNDS, oldBounds, bounds));
			}
		}
		return bounds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAccess_adapted basicGetBounds() {
		return bounds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBounds(TypeAccess_adapted newBounds) {
		TypeAccess_adapted oldBounds = bounds;
		bounds = newBounds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_adaptedPackage.TYPE_PARAMETER_ADAPTED_BOUNDS_ITEM__BOUNDS, oldBounds, bounds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.TYPE_PARAMETER_ADAPTED_BOUNDS_ITEM__BOUNDS:
				if (resolve) return getBounds();
				return basicGetBounds();
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
			case Java_adaptedPackage.TYPE_PARAMETER_ADAPTED_BOUNDS_ITEM__BOUNDS:
				setBounds((TypeAccess_adapted)newValue);
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
			case Java_adaptedPackage.TYPE_PARAMETER_ADAPTED_BOUNDS_ITEM__BOUNDS:
				setBounds((TypeAccess_adapted)null);
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
			case Java_adaptedPackage.TYPE_PARAMETER_ADAPTED_BOUNDS_ITEM__BOUNDS:
				return bounds != null;
		}
		return super.eIsSet(featureID);
	}

} //TypeParameter_adapted_boundsItemImpl
