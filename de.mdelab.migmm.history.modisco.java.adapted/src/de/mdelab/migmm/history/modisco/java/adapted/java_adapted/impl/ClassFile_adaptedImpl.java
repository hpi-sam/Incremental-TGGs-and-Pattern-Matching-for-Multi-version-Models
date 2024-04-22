/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ClassFile_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ClassFile_adapted_attachedSourceItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ClassFile_adapted_originalFilePathValue;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ClassFile_adapted_packageItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ClassFile_adapted_typeItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class File adapted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.ClassFile_adaptedImpl#getOriginalFilePath <em>Original File Path</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.ClassFile_adaptedImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.ClassFile_adaptedImpl#getAttachedSource <em>Attached Source</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.ClassFile_adaptedImpl#getPackage <em>Package</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassFile_adaptedImpl extends NamedElement_adaptedImpl implements ClassFile_adapted {
	/**
	 * The cached value of the '{@link #getOriginalFilePath() <em>Original File Path</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalFilePath()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassFile_adapted_originalFilePathValue> originalFilePath;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassFile_adapted_typeItem> type;

	/**
	 * The cached value of the '{@link #getAttachedSource() <em>Attached Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachedSource()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassFile_adapted_attachedSourceItem> attachedSource;

	/**
	 * The cached value of the '{@link #getPackage() <em>Package</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassFile_adapted_packageItem> package_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassFile_adaptedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getClassFile_adapted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClassFile_adapted_originalFilePathValue> getOriginalFilePath() {
		if (originalFilePath == null) {
			originalFilePath = new EObjectResolvingEList<ClassFile_adapted_originalFilePathValue>(ClassFile_adapted_originalFilePathValue.class, this, Java_adaptedPackage.CLASS_FILE_ADAPTED__ORIGINAL_FILE_PATH);
		}
		return originalFilePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClassFile_adapted_typeItem> getType() {
		if (type == null) {
			type = new EObjectResolvingEList<ClassFile_adapted_typeItem>(ClassFile_adapted_typeItem.class, this, Java_adaptedPackage.CLASS_FILE_ADAPTED__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClassFile_adapted_attachedSourceItem> getAttachedSource() {
		if (attachedSource == null) {
			attachedSource = new EObjectResolvingEList<ClassFile_adapted_attachedSourceItem>(ClassFile_adapted_attachedSourceItem.class, this, Java_adaptedPackage.CLASS_FILE_ADAPTED__ATTACHED_SOURCE);
		}
		return attachedSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ClassFile_adapted_packageItem> getPackage() {
		if (package_ == null) {
			package_ = new EObjectResolvingEList<ClassFile_adapted_packageItem>(ClassFile_adapted_packageItem.class, this, Java_adaptedPackage.CLASS_FILE_ADAPTED__PACKAGE);
		}
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.CLASS_FILE_ADAPTED__ORIGINAL_FILE_PATH:
				return getOriginalFilePath();
			case Java_adaptedPackage.CLASS_FILE_ADAPTED__TYPE:
				return getType();
			case Java_adaptedPackage.CLASS_FILE_ADAPTED__ATTACHED_SOURCE:
				return getAttachedSource();
			case Java_adaptedPackage.CLASS_FILE_ADAPTED__PACKAGE:
				return getPackage();
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
			case Java_adaptedPackage.CLASS_FILE_ADAPTED__ORIGINAL_FILE_PATH:
				getOriginalFilePath().clear();
				getOriginalFilePath().addAll((Collection<? extends ClassFile_adapted_originalFilePathValue>)newValue);
				return;
			case Java_adaptedPackage.CLASS_FILE_ADAPTED__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends ClassFile_adapted_typeItem>)newValue);
				return;
			case Java_adaptedPackage.CLASS_FILE_ADAPTED__ATTACHED_SOURCE:
				getAttachedSource().clear();
				getAttachedSource().addAll((Collection<? extends ClassFile_adapted_attachedSourceItem>)newValue);
				return;
			case Java_adaptedPackage.CLASS_FILE_ADAPTED__PACKAGE:
				getPackage().clear();
				getPackage().addAll((Collection<? extends ClassFile_adapted_packageItem>)newValue);
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
			case Java_adaptedPackage.CLASS_FILE_ADAPTED__ORIGINAL_FILE_PATH:
				getOriginalFilePath().clear();
				return;
			case Java_adaptedPackage.CLASS_FILE_ADAPTED__TYPE:
				getType().clear();
				return;
			case Java_adaptedPackage.CLASS_FILE_ADAPTED__ATTACHED_SOURCE:
				getAttachedSource().clear();
				return;
			case Java_adaptedPackage.CLASS_FILE_ADAPTED__PACKAGE:
				getPackage().clear();
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
			case Java_adaptedPackage.CLASS_FILE_ADAPTED__ORIGINAL_FILE_PATH:
				return originalFilePath != null && !originalFilePath.isEmpty();
			case Java_adaptedPackage.CLASS_FILE_ADAPTED__TYPE:
				return type != null && !type.isEmpty();
			case Java_adaptedPackage.CLASS_FILE_ADAPTED__ATTACHED_SOURCE:
				return attachedSource != null && !attachedSource.isEmpty();
			case Java_adaptedPackage.CLASS_FILE_ADAPTED__PACKAGE:
				return package_ != null && !package_.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClassFile_adaptedImpl
