/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.ContainmentEdgeWithHistoryImpl;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractTypeDeclaration_adapted_commentsAfterBodyItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Comment_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Type Declaration adapted comments After Body Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.AbstractTypeDeclaration_adapted_commentsAfterBodyItemImpl#getCommentsAfterBody <em>Comments After Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractTypeDeclaration_adapted_commentsAfterBodyItemImpl extends ContainmentEdgeWithHistoryImpl implements AbstractTypeDeclaration_adapted_commentsAfterBodyItem {
	/**
	 * The cached value of the '{@link #getCommentsAfterBody() <em>Comments After Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentsAfterBody()
	 * @generated
	 * @ordered
	 */
	protected Comment_adapted commentsAfterBody;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractTypeDeclaration_adapted_commentsAfterBodyItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getAbstractTypeDeclaration_adapted_commentsAfterBodyItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Comment_adapted getCommentsAfterBody() {
		if (commentsAfterBody != null && commentsAfterBody.eIsProxy()) {
			InternalEObject oldCommentsAfterBody = (InternalEObject)commentsAfterBody;
			commentsAfterBody = (Comment_adapted)eResolveProxy(oldCommentsAfterBody);
			if (commentsAfterBody != oldCommentsAfterBody) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Java_adaptedPackage.ABSTRACT_TYPE_DECLARATION_ADAPTED_COMMENTS_AFTER_BODY_ITEM__COMMENTS_AFTER_BODY, oldCommentsAfterBody, commentsAfterBody));
			}
		}
		return commentsAfterBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment_adapted basicGetCommentsAfterBody() {
		return commentsAfterBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommentsAfterBody(Comment_adapted newCommentsAfterBody) {
		Comment_adapted oldCommentsAfterBody = commentsAfterBody;
		commentsAfterBody = newCommentsAfterBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_adaptedPackage.ABSTRACT_TYPE_DECLARATION_ADAPTED_COMMENTS_AFTER_BODY_ITEM__COMMENTS_AFTER_BODY, oldCommentsAfterBody, commentsAfterBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.ABSTRACT_TYPE_DECLARATION_ADAPTED_COMMENTS_AFTER_BODY_ITEM__COMMENTS_AFTER_BODY:
				if (resolve) return getCommentsAfterBody();
				return basicGetCommentsAfterBody();
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
			case Java_adaptedPackage.ABSTRACT_TYPE_DECLARATION_ADAPTED_COMMENTS_AFTER_BODY_ITEM__COMMENTS_AFTER_BODY:
				setCommentsAfterBody((Comment_adapted)newValue);
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
			case Java_adaptedPackage.ABSTRACT_TYPE_DECLARATION_ADAPTED_COMMENTS_AFTER_BODY_ITEM__COMMENTS_AFTER_BODY:
				setCommentsAfterBody((Comment_adapted)null);
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
			case Java_adaptedPackage.ABSTRACT_TYPE_DECLARATION_ADAPTED_COMMENTS_AFTER_BODY_ITEM__COMMENTS_AFTER_BODY:
				return commentsAfterBody != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractTypeDeclaration_adapted_commentsAfterBodyItemImpl
