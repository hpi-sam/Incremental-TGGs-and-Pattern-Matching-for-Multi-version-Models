/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.ContainmentEdgeWithHistoryImpl;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractMethodDeclaration_adapted_thrownExceptionsItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TypeAccess_adapted;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Method Declaration adapted thrown Exceptions Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.AbstractMethodDeclaration_adapted_thrownExceptionsItemImpl#getThrownExceptions <em>Thrown Exceptions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractMethodDeclaration_adapted_thrownExceptionsItemImpl extends ContainmentEdgeWithHistoryImpl implements AbstractMethodDeclaration_adapted_thrownExceptionsItem {
	/**
	 * The cached value of the '{@link #getThrownExceptions() <em>Thrown Exceptions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThrownExceptions()
	 * @generated
	 * @ordered
	 */
	protected TypeAccess_adapted thrownExceptions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractMethodDeclaration_adapted_thrownExceptionsItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getAbstractMethodDeclaration_adapted_thrownExceptionsItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeAccess_adapted getThrownExceptions() {
		if (thrownExceptions != null && thrownExceptions.eIsProxy()) {
			InternalEObject oldThrownExceptions = (InternalEObject)thrownExceptions;
			thrownExceptions = (TypeAccess_adapted)eResolveProxy(oldThrownExceptions);
			if (thrownExceptions != oldThrownExceptions) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Java_adaptedPackage.ABSTRACT_METHOD_DECLARATION_ADAPTED_THROWN_EXCEPTIONS_ITEM__THROWN_EXCEPTIONS, oldThrownExceptions, thrownExceptions));
			}
		}
		return thrownExceptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAccess_adapted basicGetThrownExceptions() {
		return thrownExceptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThrownExceptions(TypeAccess_adapted newThrownExceptions) {
		TypeAccess_adapted oldThrownExceptions = thrownExceptions;
		thrownExceptions = newThrownExceptions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_adaptedPackage.ABSTRACT_METHOD_DECLARATION_ADAPTED_THROWN_EXCEPTIONS_ITEM__THROWN_EXCEPTIONS, oldThrownExceptions, thrownExceptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.ABSTRACT_METHOD_DECLARATION_ADAPTED_THROWN_EXCEPTIONS_ITEM__THROWN_EXCEPTIONS:
				if (resolve) return getThrownExceptions();
				return basicGetThrownExceptions();
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
			case Java_adaptedPackage.ABSTRACT_METHOD_DECLARATION_ADAPTED_THROWN_EXCEPTIONS_ITEM__THROWN_EXCEPTIONS:
				setThrownExceptions((TypeAccess_adapted)newValue);
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
			case Java_adaptedPackage.ABSTRACT_METHOD_DECLARATION_ADAPTED_THROWN_EXCEPTIONS_ITEM__THROWN_EXCEPTIONS:
				setThrownExceptions((TypeAccess_adapted)null);
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
			case Java_adaptedPackage.ABSTRACT_METHOD_DECLARATION_ADAPTED_THROWN_EXCEPTIONS_ITEM__THROWN_EXCEPTIONS:
				return thrownExceptions != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractMethodDeclaration_adapted_thrownExceptionsItemImpl
