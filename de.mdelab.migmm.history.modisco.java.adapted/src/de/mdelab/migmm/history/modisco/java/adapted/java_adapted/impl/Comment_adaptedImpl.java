/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Comment_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Comment_adapted_contentValue;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Comment_adapted_enclosedByParentValue;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Comment_adapted_prefixOfParentValue;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comment adapted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.Comment_adaptedImpl#getContent <em>Content</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.Comment_adaptedImpl#getEnclosedByParent <em>Enclosed By Parent</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.Comment_adaptedImpl#getPrefixOfParent <em>Prefix Of Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class Comment_adaptedImpl extends ASTNode_adaptedImpl implements Comment_adapted {
	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected EList<Comment_adapted_contentValue> content;

	/**
	 * The cached value of the '{@link #getEnclosedByParent() <em>Enclosed By Parent</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnclosedByParent()
	 * @generated
	 * @ordered
	 */
	protected EList<Comment_adapted_enclosedByParentValue> enclosedByParent;

	/**
	 * The cached value of the '{@link #getPrefixOfParent() <em>Prefix Of Parent</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefixOfParent()
	 * @generated
	 * @ordered
	 */
	protected EList<Comment_adapted_prefixOfParentValue> prefixOfParent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Comment_adaptedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getComment_adapted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comment_adapted_contentValue> getContent() {
		if (content == null) {
			content = new EObjectResolvingEList<Comment_adapted_contentValue>(Comment_adapted_contentValue.class, this, Java_adaptedPackage.COMMENT_ADAPTED__CONTENT);
		}
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comment_adapted_enclosedByParentValue> getEnclosedByParent() {
		if (enclosedByParent == null) {
			enclosedByParent = new EObjectResolvingEList<Comment_adapted_enclosedByParentValue>(Comment_adapted_enclosedByParentValue.class, this, Java_adaptedPackage.COMMENT_ADAPTED__ENCLOSED_BY_PARENT);
		}
		return enclosedByParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comment_adapted_prefixOfParentValue> getPrefixOfParent() {
		if (prefixOfParent == null) {
			prefixOfParent = new EObjectResolvingEList<Comment_adapted_prefixOfParentValue>(Comment_adapted_prefixOfParentValue.class, this, Java_adaptedPackage.COMMENT_ADAPTED__PREFIX_OF_PARENT);
		}
		return prefixOfParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.COMMENT_ADAPTED__CONTENT:
				return getContent();
			case Java_adaptedPackage.COMMENT_ADAPTED__ENCLOSED_BY_PARENT:
				return getEnclosedByParent();
			case Java_adaptedPackage.COMMENT_ADAPTED__PREFIX_OF_PARENT:
				return getPrefixOfParent();
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
			case Java_adaptedPackage.COMMENT_ADAPTED__CONTENT:
				getContent().clear();
				getContent().addAll((Collection<? extends Comment_adapted_contentValue>)newValue);
				return;
			case Java_adaptedPackage.COMMENT_ADAPTED__ENCLOSED_BY_PARENT:
				getEnclosedByParent().clear();
				getEnclosedByParent().addAll((Collection<? extends Comment_adapted_enclosedByParentValue>)newValue);
				return;
			case Java_adaptedPackage.COMMENT_ADAPTED__PREFIX_OF_PARENT:
				getPrefixOfParent().clear();
				getPrefixOfParent().addAll((Collection<? extends Comment_adapted_prefixOfParentValue>)newValue);
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
			case Java_adaptedPackage.COMMENT_ADAPTED__CONTENT:
				getContent().clear();
				return;
			case Java_adaptedPackage.COMMENT_ADAPTED__ENCLOSED_BY_PARENT:
				getEnclosedByParent().clear();
				return;
			case Java_adaptedPackage.COMMENT_ADAPTED__PREFIX_OF_PARENT:
				getPrefixOfParent().clear();
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
			case Java_adaptedPackage.COMMENT_ADAPTED__CONTENT:
				return content != null && !content.isEmpty();
			case Java_adaptedPackage.COMMENT_ADAPTED__ENCLOSED_BY_PARENT:
				return enclosedByParent != null && !enclosedByParent.isEmpty();
			case Java_adaptedPackage.COMMENT_ADAPTED__PREFIX_OF_PARENT:
				return prefixOfParent != null && !prefixOfParent.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Comment_adaptedImpl
