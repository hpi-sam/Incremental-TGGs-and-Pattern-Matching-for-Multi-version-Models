/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.ContainmentEdgeWithHistoryImpl;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.CompilationUnit_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Model_adapted_compilationUnitsItem;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model adapted compilation Units Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.Model_adapted_compilationUnitsItemImpl#getCompilationUnits <em>Compilation Units</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Model_adapted_compilationUnitsItemImpl extends ContainmentEdgeWithHistoryImpl implements Model_adapted_compilationUnitsItem {
	/**
	 * The cached value of the '{@link #getCompilationUnits() <em>Compilation Units</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompilationUnits()
	 * @generated
	 * @ordered
	 */
	protected CompilationUnit_adapted compilationUnits;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Model_adapted_compilationUnitsItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getModel_adapted_compilationUnitsItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompilationUnit_adapted getCompilationUnits() {
		if (compilationUnits != null && compilationUnits.eIsProxy()) {
			InternalEObject oldCompilationUnits = (InternalEObject)compilationUnits;
			compilationUnits = (CompilationUnit_adapted)eResolveProxy(oldCompilationUnits);
			if (compilationUnits != oldCompilationUnits) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Java_adaptedPackage.MODEL_ADAPTED_COMPILATION_UNITS_ITEM__COMPILATION_UNITS, oldCompilationUnits, compilationUnits));
			}
		}
		return compilationUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompilationUnit_adapted basicGetCompilationUnits() {
		return compilationUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompilationUnits(CompilationUnit_adapted newCompilationUnits) {
		CompilationUnit_adapted oldCompilationUnits = compilationUnits;
		compilationUnits = newCompilationUnits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_adaptedPackage.MODEL_ADAPTED_COMPILATION_UNITS_ITEM__COMPILATION_UNITS, oldCompilationUnits, compilationUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.MODEL_ADAPTED_COMPILATION_UNITS_ITEM__COMPILATION_UNITS:
				if (resolve) return getCompilationUnits();
				return basicGetCompilationUnits();
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
			case Java_adaptedPackage.MODEL_ADAPTED_COMPILATION_UNITS_ITEM__COMPILATION_UNITS:
				setCompilationUnits((CompilationUnit_adapted)newValue);
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
			case Java_adaptedPackage.MODEL_ADAPTED_COMPILATION_UNITS_ITEM__COMPILATION_UNITS:
				setCompilationUnits((CompilationUnit_adapted)null);
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
			case Java_adaptedPackage.MODEL_ADAPTED_COMPILATION_UNITS_ITEM__COMPILATION_UNITS:
				return compilationUnits != null;
		}
		return super.eIsSet(featureID);
	}

} //Model_adapted_compilationUnitsItemImpl
