/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Archive_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Archive_adapted_classFilesItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Archive_adapted_manifestItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Archive_adapted_originalFilePathValue;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Archive adapted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.Archive_adaptedImpl#getOriginalFilePath <em>Original File Path</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.Archive_adaptedImpl#getClassFiles <em>Class Files</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.Archive_adaptedImpl#getManifest <em>Manifest</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Archive_adaptedImpl extends NamedElement_adaptedImpl implements Archive_adapted {
	/**
	 * The cached value of the '{@link #getOriginalFilePath() <em>Original File Path</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalFilePath()
	 * @generated
	 * @ordered
	 */
	protected EList<Archive_adapted_originalFilePathValue> originalFilePath;

	/**
	 * The cached value of the '{@link #getClassFiles() <em>Class Files</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassFiles()
	 * @generated
	 * @ordered
	 */
	protected EList<Archive_adapted_classFilesItem> classFiles;

	/**
	 * The cached value of the '{@link #getManifest() <em>Manifest</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManifest()
	 * @generated
	 * @ordered
	 */
	protected EList<Archive_adapted_manifestItem> manifest;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Archive_adaptedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getArchive_adapted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Archive_adapted_originalFilePathValue> getOriginalFilePath() {
		if (originalFilePath == null) {
			originalFilePath = new EObjectResolvingEList<Archive_adapted_originalFilePathValue>(Archive_adapted_originalFilePathValue.class, this, Java_adaptedPackage.ARCHIVE_ADAPTED__ORIGINAL_FILE_PATH);
		}
		return originalFilePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Archive_adapted_classFilesItem> getClassFiles() {
		if (classFiles == null) {
			classFiles = new EObjectResolvingEList<Archive_adapted_classFilesItem>(Archive_adapted_classFilesItem.class, this, Java_adaptedPackage.ARCHIVE_ADAPTED__CLASS_FILES);
		}
		return classFiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Archive_adapted_manifestItem> getManifest() {
		if (manifest == null) {
			manifest = new EObjectResolvingEList<Archive_adapted_manifestItem>(Archive_adapted_manifestItem.class, this, Java_adaptedPackage.ARCHIVE_ADAPTED__MANIFEST);
		}
		return manifest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.ARCHIVE_ADAPTED__ORIGINAL_FILE_PATH:
				return getOriginalFilePath();
			case Java_adaptedPackage.ARCHIVE_ADAPTED__CLASS_FILES:
				return getClassFiles();
			case Java_adaptedPackage.ARCHIVE_ADAPTED__MANIFEST:
				return getManifest();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_adaptedPackage.ARCHIVE_ADAPTED__ORIGINAL_FILE_PATH:
				getOriginalFilePath().clear();
				getOriginalFilePath().addAll((Collection<? extends Archive_adapted_originalFilePathValue>)newValue);
				return;
			case Java_adaptedPackage.ARCHIVE_ADAPTED__CLASS_FILES:
				getClassFiles().clear();
				getClassFiles().addAll((Collection<? extends Archive_adapted_classFilesItem>)newValue);
				return;
			case Java_adaptedPackage.ARCHIVE_ADAPTED__MANIFEST:
				getManifest().clear();
				getManifest().addAll((Collection<? extends Archive_adapted_manifestItem>)newValue);
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
			case Java_adaptedPackage.ARCHIVE_ADAPTED__ORIGINAL_FILE_PATH:
				getOriginalFilePath().clear();
				return;
			case Java_adaptedPackage.ARCHIVE_ADAPTED__CLASS_FILES:
				getClassFiles().clear();
				return;
			case Java_adaptedPackage.ARCHIVE_ADAPTED__MANIFEST:
				getManifest().clear();
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
			case Java_adaptedPackage.ARCHIVE_ADAPTED__ORIGINAL_FILE_PATH:
				return originalFilePath != null && !originalFilePath.isEmpty();
			case Java_adaptedPackage.ARCHIVE_ADAPTED__CLASS_FILES:
				return classFiles != null && !classFiles.isEmpty();
			case Java_adaptedPackage.ARCHIVE_ADAPTED__MANIFEST:
				return manifest != null && !manifest.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Archive_adaptedImpl
