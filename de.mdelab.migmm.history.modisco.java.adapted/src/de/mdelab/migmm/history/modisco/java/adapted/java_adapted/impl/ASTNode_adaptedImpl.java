/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.NodeWithHistoryImpl;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ASTNode_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ASTNode_adapted_commentsItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ASTNode_adapted_originalClassFileItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ASTNode_adapted_originalCompilationUnitItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AST Node adapted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.ASTNode_adaptedImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.ASTNode_adaptedImpl#getOriginalCompilationUnit <em>Original Compilation Unit</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.ASTNode_adaptedImpl#getOriginalClassFile <em>Original Class File</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ASTNode_adaptedImpl extends NodeWithHistoryImpl implements ASTNode_adapted {
	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected EList<ASTNode_adapted_commentsItem> comments;

	/**
	 * The cached value of the '{@link #getOriginalCompilationUnit() <em>Original Compilation Unit</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalCompilationUnit()
	 * @generated
	 * @ordered
	 */
	protected EList<ASTNode_adapted_originalCompilationUnitItem> originalCompilationUnit;

	/**
	 * The cached value of the '{@link #getOriginalClassFile() <em>Original Class File</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalClassFile()
	 * @generated
	 * @ordered
	 */
	protected EList<ASTNode_adapted_originalClassFileItem> originalClassFile;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ASTNode_adaptedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getASTNode_adapted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ASTNode_adapted_commentsItem> getComments() {
		if (comments == null) {
			comments = new EObjectResolvingEList<ASTNode_adapted_commentsItem>(ASTNode_adapted_commentsItem.class, this, Java_adaptedPackage.AST_NODE_ADAPTED__COMMENTS);
		}
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ASTNode_adapted_originalCompilationUnitItem> getOriginalCompilationUnit() {
		if (originalCompilationUnit == null) {
			originalCompilationUnit = new EObjectResolvingEList<ASTNode_adapted_originalCompilationUnitItem>(ASTNode_adapted_originalCompilationUnitItem.class, this, Java_adaptedPackage.AST_NODE_ADAPTED__ORIGINAL_COMPILATION_UNIT);
		}
		return originalCompilationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ASTNode_adapted_originalClassFileItem> getOriginalClassFile() {
		if (originalClassFile == null) {
			originalClassFile = new EObjectResolvingEList<ASTNode_adapted_originalClassFileItem>(ASTNode_adapted_originalClassFileItem.class, this, Java_adaptedPackage.AST_NODE_ADAPTED__ORIGINAL_CLASS_FILE);
		}
		return originalClassFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.AST_NODE_ADAPTED__COMMENTS:
				return getComments();
			case Java_adaptedPackage.AST_NODE_ADAPTED__ORIGINAL_COMPILATION_UNIT:
				return getOriginalCompilationUnit();
			case Java_adaptedPackage.AST_NODE_ADAPTED__ORIGINAL_CLASS_FILE:
				return getOriginalClassFile();
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
			case Java_adaptedPackage.AST_NODE_ADAPTED__COMMENTS:
				getComments().clear();
				getComments().addAll((Collection<? extends ASTNode_adapted_commentsItem>)newValue);
				return;
			case Java_adaptedPackage.AST_NODE_ADAPTED__ORIGINAL_COMPILATION_UNIT:
				getOriginalCompilationUnit().clear();
				getOriginalCompilationUnit().addAll((Collection<? extends ASTNode_adapted_originalCompilationUnitItem>)newValue);
				return;
			case Java_adaptedPackage.AST_NODE_ADAPTED__ORIGINAL_CLASS_FILE:
				getOriginalClassFile().clear();
				getOriginalClassFile().addAll((Collection<? extends ASTNode_adapted_originalClassFileItem>)newValue);
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
			case Java_adaptedPackage.AST_NODE_ADAPTED__COMMENTS:
				getComments().clear();
				return;
			case Java_adaptedPackage.AST_NODE_ADAPTED__ORIGINAL_COMPILATION_UNIT:
				getOriginalCompilationUnit().clear();
				return;
			case Java_adaptedPackage.AST_NODE_ADAPTED__ORIGINAL_CLASS_FILE:
				getOriginalClassFile().clear();
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
			case Java_adaptedPackage.AST_NODE_ADAPTED__COMMENTS:
				return comments != null && !comments.isEmpty();
			case Java_adaptedPackage.AST_NODE_ADAPTED__ORIGINAL_COMPILATION_UNIT:
				return originalCompilationUnit != null && !originalCompilationUnit.isEmpty();
			case Java_adaptedPackage.AST_NODE_ADAPTED__ORIGINAL_CLASS_FILE:
				return originalClassFile != null && !originalClassFile.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ASTNode_adaptedImpl
