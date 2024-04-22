/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.EdgeWithHistoryImpl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ASTNode_adapted_originalCompilationUnitItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.CompilationUnit_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AST Node adapted original Compilation Unit Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.ASTNode_adapted_originalCompilationUnitItemImpl#getOriginalCompilationUnit <em>Original Compilation Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ASTNode_adapted_originalCompilationUnitItemImpl extends EdgeWithHistoryImpl implements ASTNode_adapted_originalCompilationUnitItem {
	/**
	 * The cached value of the '{@link #getOriginalCompilationUnit() <em>Original Compilation Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalCompilationUnit()
	 * @generated
	 * @ordered
	 */
	protected CompilationUnit_adapted originalCompilationUnit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ASTNode_adapted_originalCompilationUnitItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getASTNode_adapted_originalCompilationUnitItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompilationUnit_adapted getOriginalCompilationUnit() {
		if (originalCompilationUnit != null && originalCompilationUnit.eIsProxy()) {
			InternalEObject oldOriginalCompilationUnit = (InternalEObject)originalCompilationUnit;
			originalCompilationUnit = (CompilationUnit_adapted)eResolveProxy(oldOriginalCompilationUnit);
			if (originalCompilationUnit != oldOriginalCompilationUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Java_adaptedPackage.AST_NODE_ADAPTED_ORIGINAL_COMPILATION_UNIT_ITEM__ORIGINAL_COMPILATION_UNIT, oldOriginalCompilationUnit, originalCompilationUnit));
			}
		}
		return originalCompilationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompilationUnit_adapted basicGetOriginalCompilationUnit() {
		return originalCompilationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginalCompilationUnit(CompilationUnit_adapted newOriginalCompilationUnit) {
		CompilationUnit_adapted oldOriginalCompilationUnit = originalCompilationUnit;
		originalCompilationUnit = newOriginalCompilationUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_adaptedPackage.AST_NODE_ADAPTED_ORIGINAL_COMPILATION_UNIT_ITEM__ORIGINAL_COMPILATION_UNIT, oldOriginalCompilationUnit, originalCompilationUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.AST_NODE_ADAPTED_ORIGINAL_COMPILATION_UNIT_ITEM__ORIGINAL_COMPILATION_UNIT:
				if (resolve) return getOriginalCompilationUnit();
				return basicGetOriginalCompilationUnit();
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
			case Java_adaptedPackage.AST_NODE_ADAPTED_ORIGINAL_COMPILATION_UNIT_ITEM__ORIGINAL_COMPILATION_UNIT:
				setOriginalCompilationUnit((CompilationUnit_adapted)newValue);
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
			case Java_adaptedPackage.AST_NODE_ADAPTED_ORIGINAL_COMPILATION_UNIT_ITEM__ORIGINAL_COMPILATION_UNIT:
				setOriginalCompilationUnit((CompilationUnit_adapted)null);
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
			case Java_adaptedPackage.AST_NODE_ADAPTED_ORIGINAL_COMPILATION_UNIT_ITEM__ORIGINAL_COMPILATION_UNIT:
				return originalCompilationUnit != null;
		}
		return super.eIsSet(featureID);
	}

} //ASTNode_adapted_originalCompilationUnitItemImpl
