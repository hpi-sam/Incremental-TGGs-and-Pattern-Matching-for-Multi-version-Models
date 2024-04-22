/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.ContainmentEdgeWithHistoryImpl;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ClassFile_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Model_adapted_classFilesItem;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model adapted class Files Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.Model_adapted_classFilesItemImpl#getClassFiles <em>Class Files</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Model_adapted_classFilesItemImpl extends ContainmentEdgeWithHistoryImpl implements Model_adapted_classFilesItem {
	/**
	 * The cached value of the '{@link #getClassFiles() <em>Class Files</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassFiles()
	 * @generated
	 * @ordered
	 */
	protected ClassFile_adapted classFiles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Model_adapted_classFilesItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getModel_adapted_classFilesItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassFile_adapted getClassFiles() {
		if (classFiles != null && classFiles.eIsProxy()) {
			InternalEObject oldClassFiles = (InternalEObject)classFiles;
			classFiles = (ClassFile_adapted)eResolveProxy(oldClassFiles);
			if (classFiles != oldClassFiles) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Java_adaptedPackage.MODEL_ADAPTED_CLASS_FILES_ITEM__CLASS_FILES, oldClassFiles, classFiles));
			}
		}
		return classFiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassFile_adapted basicGetClassFiles() {
		return classFiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClassFiles(ClassFile_adapted newClassFiles) {
		ClassFile_adapted oldClassFiles = classFiles;
		classFiles = newClassFiles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_adaptedPackage.MODEL_ADAPTED_CLASS_FILES_ITEM__CLASS_FILES, oldClassFiles, classFiles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.MODEL_ADAPTED_CLASS_FILES_ITEM__CLASS_FILES:
				if (resolve) return getClassFiles();
				return basicGetClassFiles();
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
			case Java_adaptedPackage.MODEL_ADAPTED_CLASS_FILES_ITEM__CLASS_FILES:
				setClassFiles((ClassFile_adapted)newValue);
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
			case Java_adaptedPackage.MODEL_ADAPTED_CLASS_FILES_ITEM__CLASS_FILES:
				setClassFiles((ClassFile_adapted)null);
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
			case Java_adaptedPackage.MODEL_ADAPTED_CLASS_FILES_ITEM__CLASS_FILES:
				return classFiles != null;
		}
		return super.eIsSet(featureID);
	}

} //Model_adapted_classFilesItemImpl
