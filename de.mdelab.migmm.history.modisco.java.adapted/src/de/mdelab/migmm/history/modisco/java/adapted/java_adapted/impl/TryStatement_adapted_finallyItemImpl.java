/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.ContainmentEdgeWithHistoryImpl;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Block_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TryStatement_adapted_finallyItem;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Try Statement adapted finally Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.TryStatement_adapted_finallyItemImpl#getFinally <em>Finally</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TryStatement_adapted_finallyItemImpl extends ContainmentEdgeWithHistoryImpl implements TryStatement_adapted_finallyItem {
	/**
	 * The cached value of the '{@link #getFinally() <em>Finally</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinally()
	 * @generated
	 * @ordered
	 */
	protected Block_adapted finally_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TryStatement_adapted_finallyItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getTryStatement_adapted_finallyItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Block_adapted getFinally() {
		if (finally_ != null && finally_.eIsProxy()) {
			InternalEObject oldFinally = (InternalEObject)finally_;
			finally_ = (Block_adapted)eResolveProxy(oldFinally);
			if (finally_ != oldFinally) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Java_adaptedPackage.TRY_STATEMENT_ADAPTED_FINALLY_ITEM__FINALLY, oldFinally, finally_));
			}
		}
		return finally_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block_adapted basicGetFinally() {
		return finally_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFinally(Block_adapted newFinally) {
		Block_adapted oldFinally = finally_;
		finally_ = newFinally;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_adaptedPackage.TRY_STATEMENT_ADAPTED_FINALLY_ITEM__FINALLY, oldFinally, finally_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.TRY_STATEMENT_ADAPTED_FINALLY_ITEM__FINALLY:
				if (resolve) return getFinally();
				return basicGetFinally();
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
			case Java_adaptedPackage.TRY_STATEMENT_ADAPTED_FINALLY_ITEM__FINALLY:
				setFinally((Block_adapted)newValue);
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
			case Java_adaptedPackage.TRY_STATEMENT_ADAPTED_FINALLY_ITEM__FINALLY:
				setFinally((Block_adapted)null);
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
			case Java_adaptedPackage.TRY_STATEMENT_ADAPTED_FINALLY_ITEM__FINALLY:
				return finally_ != null;
		}
		return super.eIsSet(featureID);
	}

} //TryStatement_adapted_finallyItemImpl
