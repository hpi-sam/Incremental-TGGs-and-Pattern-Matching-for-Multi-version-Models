/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.EdgeWithHistoryImpl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Comment_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.CompilationUnit_adapted_commentListItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compilation Unit adapted comment List Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.CompilationUnit_adapted_commentListItemImpl#getCommentList <em>Comment List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompilationUnit_adapted_commentListItemImpl extends EdgeWithHistoryImpl implements CompilationUnit_adapted_commentListItem {
	/**
	 * The cached value of the '{@link #getCommentList() <em>Comment List</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentList()
	 * @generated
	 * @ordered
	 */
	protected Comment_adapted commentList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompilationUnit_adapted_commentListItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getCompilationUnit_adapted_commentListItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Comment_adapted getCommentList() {
		if (commentList != null && commentList.eIsProxy()) {
			InternalEObject oldCommentList = (InternalEObject)commentList;
			commentList = (Comment_adapted)eResolveProxy(oldCommentList);
			if (commentList != oldCommentList) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Java_adaptedPackage.COMPILATION_UNIT_ADAPTED_COMMENT_LIST_ITEM__COMMENT_LIST, oldCommentList, commentList));
			}
		}
		return commentList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment_adapted basicGetCommentList() {
		return commentList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommentList(Comment_adapted newCommentList) {
		Comment_adapted oldCommentList = commentList;
		commentList = newCommentList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_adaptedPackage.COMPILATION_UNIT_ADAPTED_COMMENT_LIST_ITEM__COMMENT_LIST, oldCommentList, commentList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.COMPILATION_UNIT_ADAPTED_COMMENT_LIST_ITEM__COMMENT_LIST:
				if (resolve) return getCommentList();
				return basicGetCommentList();
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
			case Java_adaptedPackage.COMPILATION_UNIT_ADAPTED_COMMENT_LIST_ITEM__COMMENT_LIST:
				setCommentList((Comment_adapted)newValue);
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
			case Java_adaptedPackage.COMPILATION_UNIT_ADAPTED_COMMENT_LIST_ITEM__COMMENT_LIST:
				setCommentList((Comment_adapted)null);
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
			case Java_adaptedPackage.COMPILATION_UNIT_ADAPTED_COMMENT_LIST_ITEM__COMMENT_LIST:
				return commentList != null;
		}
		return super.eIsSet(featureID);
	}

} //CompilationUnit_adapted_commentListItemImpl
