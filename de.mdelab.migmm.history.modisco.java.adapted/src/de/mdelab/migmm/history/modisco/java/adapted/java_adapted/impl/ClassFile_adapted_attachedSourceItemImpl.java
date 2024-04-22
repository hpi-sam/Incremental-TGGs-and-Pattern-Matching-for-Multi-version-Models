/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.EdgeWithHistoryImpl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ClassFile_adapted_attachedSourceItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.CompilationUnit_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class File adapted attached Source Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.ClassFile_adapted_attachedSourceItemImpl#getAttachedSource <em>Attached Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassFile_adapted_attachedSourceItemImpl extends EdgeWithHistoryImpl implements ClassFile_adapted_attachedSourceItem {
	/**
	 * The cached value of the '{@link #getAttachedSource() <em>Attached Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachedSource()
	 * @generated
	 * @ordered
	 */
	protected CompilationUnit_adapted attachedSource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassFile_adapted_attachedSourceItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getClassFile_adapted_attachedSourceItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompilationUnit_adapted getAttachedSource() {
		if (attachedSource != null && attachedSource.eIsProxy()) {
			InternalEObject oldAttachedSource = (InternalEObject)attachedSource;
			attachedSource = (CompilationUnit_adapted)eResolveProxy(oldAttachedSource);
			if (attachedSource != oldAttachedSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Java_adaptedPackage.CLASS_FILE_ADAPTED_ATTACHED_SOURCE_ITEM__ATTACHED_SOURCE, oldAttachedSource, attachedSource));
			}
		}
		return attachedSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompilationUnit_adapted basicGetAttachedSource() {
		return attachedSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttachedSource(CompilationUnit_adapted newAttachedSource) {
		CompilationUnit_adapted oldAttachedSource = attachedSource;
		attachedSource = newAttachedSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_adaptedPackage.CLASS_FILE_ADAPTED_ATTACHED_SOURCE_ITEM__ATTACHED_SOURCE, oldAttachedSource, attachedSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.CLASS_FILE_ADAPTED_ATTACHED_SOURCE_ITEM__ATTACHED_SOURCE:
				if (resolve) return getAttachedSource();
				return basicGetAttachedSource();
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
			case Java_adaptedPackage.CLASS_FILE_ADAPTED_ATTACHED_SOURCE_ITEM__ATTACHED_SOURCE:
				setAttachedSource((CompilationUnit_adapted)newValue);
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
			case Java_adaptedPackage.CLASS_FILE_ADAPTED_ATTACHED_SOURCE_ITEM__ATTACHED_SOURCE:
				setAttachedSource((CompilationUnit_adapted)null);
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
			case Java_adaptedPackage.CLASS_FILE_ADAPTED_ATTACHED_SOURCE_ITEM__ATTACHED_SOURCE:
				return attachedSource != null;
		}
		return super.eIsSet(featureID);
	}

} //ClassFile_adapted_attachedSourceItemImpl
