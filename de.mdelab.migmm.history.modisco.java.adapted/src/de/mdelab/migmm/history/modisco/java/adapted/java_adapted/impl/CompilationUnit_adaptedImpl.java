/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.CompilationUnit_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.CompilationUnit_adapted_commentListItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.CompilationUnit_adapted_importsItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.CompilationUnit_adapted_originalFilePathValue;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.CompilationUnit_adapted_packageItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.CompilationUnit_adapted_typesItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compilation Unit adapted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.CompilationUnit_adaptedImpl#getOriginalFilePath <em>Original File Path</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.CompilationUnit_adaptedImpl#getCommentList <em>Comment List</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.CompilationUnit_adaptedImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.CompilationUnit_adaptedImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.CompilationUnit_adaptedImpl#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompilationUnit_adaptedImpl extends NamedElement_adaptedImpl implements CompilationUnit_adapted {
	/**
	 * The cached value of the '{@link #getOriginalFilePath() <em>Original File Path</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalFilePath()
	 * @generated
	 * @ordered
	 */
	protected EList<CompilationUnit_adapted_originalFilePathValue> originalFilePath;

	/**
	 * The cached value of the '{@link #getCommentList() <em>Comment List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentList()
	 * @generated
	 * @ordered
	 */
	protected EList<CompilationUnit_adapted_commentListItem> commentList;

	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<CompilationUnit_adapted_importsItem> imports;

	/**
	 * The cached value of the '{@link #getPackage() <em>Package</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<CompilationUnit_adapted_packageItem> package_;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<CompilationUnit_adapted_typesItem> types;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompilationUnit_adaptedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getCompilationUnit_adapted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CompilationUnit_adapted_originalFilePathValue> getOriginalFilePath() {
		if (originalFilePath == null) {
			originalFilePath = new EObjectResolvingEList<CompilationUnit_adapted_originalFilePathValue>(CompilationUnit_adapted_originalFilePathValue.class, this, Java_adaptedPackage.COMPILATION_UNIT_ADAPTED__ORIGINAL_FILE_PATH);
		}
		return originalFilePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CompilationUnit_adapted_commentListItem> getCommentList() {
		if (commentList == null) {
			commentList = new EObjectResolvingEList<CompilationUnit_adapted_commentListItem>(CompilationUnit_adapted_commentListItem.class, this, Java_adaptedPackage.COMPILATION_UNIT_ADAPTED__COMMENT_LIST);
		}
		return commentList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CompilationUnit_adapted_importsItem> getImports() {
		if (imports == null) {
			imports = new EObjectResolvingEList<CompilationUnit_adapted_importsItem>(CompilationUnit_adapted_importsItem.class, this, Java_adaptedPackage.COMPILATION_UNIT_ADAPTED__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CompilationUnit_adapted_packageItem> getPackage() {
		if (package_ == null) {
			package_ = new EObjectResolvingEList<CompilationUnit_adapted_packageItem>(CompilationUnit_adapted_packageItem.class, this, Java_adaptedPackage.COMPILATION_UNIT_ADAPTED__PACKAGE);
		}
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CompilationUnit_adapted_typesItem> getTypes() {
		if (types == null) {
			types = new EObjectResolvingEList<CompilationUnit_adapted_typesItem>(CompilationUnit_adapted_typesItem.class, this, Java_adaptedPackage.COMPILATION_UNIT_ADAPTED__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.COMPILATION_UNIT_ADAPTED__ORIGINAL_FILE_PATH:
				return getOriginalFilePath();
			case Java_adaptedPackage.COMPILATION_UNIT_ADAPTED__COMMENT_LIST:
				return getCommentList();
			case Java_adaptedPackage.COMPILATION_UNIT_ADAPTED__IMPORTS:
				return getImports();
			case Java_adaptedPackage.COMPILATION_UNIT_ADAPTED__PACKAGE:
				return getPackage();
			case Java_adaptedPackage.COMPILATION_UNIT_ADAPTED__TYPES:
				return getTypes();
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
			case Java_adaptedPackage.COMPILATION_UNIT_ADAPTED__ORIGINAL_FILE_PATH:
				getOriginalFilePath().clear();
				getOriginalFilePath().addAll((Collection<? extends CompilationUnit_adapted_originalFilePathValue>)newValue);
				return;
			case Java_adaptedPackage.COMPILATION_UNIT_ADAPTED__COMMENT_LIST:
				getCommentList().clear();
				getCommentList().addAll((Collection<? extends CompilationUnit_adapted_commentListItem>)newValue);
				return;
			case Java_adaptedPackage.COMPILATION_UNIT_ADAPTED__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends CompilationUnit_adapted_importsItem>)newValue);
				return;
			case Java_adaptedPackage.COMPILATION_UNIT_ADAPTED__PACKAGE:
				getPackage().clear();
				getPackage().addAll((Collection<? extends CompilationUnit_adapted_packageItem>)newValue);
				return;
			case Java_adaptedPackage.COMPILATION_UNIT_ADAPTED__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends CompilationUnit_adapted_typesItem>)newValue);
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
			case Java_adaptedPackage.COMPILATION_UNIT_ADAPTED__ORIGINAL_FILE_PATH:
				getOriginalFilePath().clear();
				return;
			case Java_adaptedPackage.COMPILATION_UNIT_ADAPTED__COMMENT_LIST:
				getCommentList().clear();
				return;
			case Java_adaptedPackage.COMPILATION_UNIT_ADAPTED__IMPORTS:
				getImports().clear();
				return;
			case Java_adaptedPackage.COMPILATION_UNIT_ADAPTED__PACKAGE:
				getPackage().clear();
				return;
			case Java_adaptedPackage.COMPILATION_UNIT_ADAPTED__TYPES:
				getTypes().clear();
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
			case Java_adaptedPackage.COMPILATION_UNIT_ADAPTED__ORIGINAL_FILE_PATH:
				return originalFilePath != null && !originalFilePath.isEmpty();
			case Java_adaptedPackage.COMPILATION_UNIT_ADAPTED__COMMENT_LIST:
				return commentList != null && !commentList.isEmpty();
			case Java_adaptedPackage.COMPILATION_UNIT_ADAPTED__IMPORTS:
				return imports != null && !imports.isEmpty();
			case Java_adaptedPackage.COMPILATION_UNIT_ADAPTED__PACKAGE:
				return package_ != null && !package_.isEmpty();
			case Java_adaptedPackage.COMPILATION_UNIT_ADAPTED__TYPES:
				return types != null && !types.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CompilationUnit_adaptedImpl
