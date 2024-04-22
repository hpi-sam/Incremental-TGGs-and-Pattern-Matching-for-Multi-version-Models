/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.ContainmentEdgeWithHistoryImpl;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ASTNode_adapted_commentsItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Comment_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AST Node adapted comments Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.ASTNode_adapted_commentsItemImpl#getComments <em>Comments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ASTNode_adapted_commentsItemImpl extends ContainmentEdgeWithHistoryImpl implements ASTNode_adapted_commentsItem {
	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected Comment_adapted comments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ASTNode_adapted_commentsItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getASTNode_adapted_commentsItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Comment_adapted getComments() {
		if (comments != null && comments.eIsProxy()) {
			InternalEObject oldComments = (InternalEObject)comments;
			comments = (Comment_adapted)eResolveProxy(oldComments);
			if (comments != oldComments) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Java_adaptedPackage.AST_NODE_ADAPTED_COMMENTS_ITEM__COMMENTS, oldComments, comments));
			}
		}
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment_adapted basicGetComments() {
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComments(Comment_adapted newComments) {
		Comment_adapted oldComments = comments;
		comments = newComments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_adaptedPackage.AST_NODE_ADAPTED_COMMENTS_ITEM__COMMENTS, oldComments, comments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.AST_NODE_ADAPTED_COMMENTS_ITEM__COMMENTS:
				if (resolve) return getComments();
				return basicGetComments();
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
			case Java_adaptedPackage.AST_NODE_ADAPTED_COMMENTS_ITEM__COMMENTS:
				setComments((Comment_adapted)newValue);
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
			case Java_adaptedPackage.AST_NODE_ADAPTED_COMMENTS_ITEM__COMMENTS:
				setComments((Comment_adapted)null);
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
			case Java_adaptedPackage.AST_NODE_ADAPTED_COMMENTS_ITEM__COMMENTS:
				return comments != null;
		}
		return super.eIsSet(featureID);
	}

} //ASTNode_adapted_commentsItemImpl
