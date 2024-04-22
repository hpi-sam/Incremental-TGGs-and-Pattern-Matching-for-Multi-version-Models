/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.ContainmentEdgeWithHistoryImpl;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractTypeDeclaration_adapted_commentsBeforeBodyItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Comment_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Type Declaration adapted comments Before Body Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.AbstractTypeDeclaration_adapted_commentsBeforeBodyItemImpl#getCommentsBeforeBody <em>Comments Before Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractTypeDeclaration_adapted_commentsBeforeBodyItemImpl extends ContainmentEdgeWithHistoryImpl implements AbstractTypeDeclaration_adapted_commentsBeforeBodyItem {
	/**
	 * The cached value of the '{@link #getCommentsBeforeBody() <em>Comments Before Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentsBeforeBody()
	 * @generated
	 * @ordered
	 */
	protected Comment_adapted commentsBeforeBody;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractTypeDeclaration_adapted_commentsBeforeBodyItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getAbstractTypeDeclaration_adapted_commentsBeforeBodyItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Comment_adapted getCommentsBeforeBody() {
		if (commentsBeforeBody != null && commentsBeforeBody.eIsProxy()) {
			InternalEObject oldCommentsBeforeBody = (InternalEObject)commentsBeforeBody;
			commentsBeforeBody = (Comment_adapted)eResolveProxy(oldCommentsBeforeBody);
			if (commentsBeforeBody != oldCommentsBeforeBody) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Java_adaptedPackage.ABSTRACT_TYPE_DECLARATION_ADAPTED_COMMENTS_BEFORE_BODY_ITEM__COMMENTS_BEFORE_BODY, oldCommentsBeforeBody, commentsBeforeBody));
			}
		}
		return commentsBeforeBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment_adapted basicGetCommentsBeforeBody() {
		return commentsBeforeBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommentsBeforeBody(Comment_adapted newCommentsBeforeBody) {
		Comment_adapted oldCommentsBeforeBody = commentsBeforeBody;
		commentsBeforeBody = newCommentsBeforeBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_adaptedPackage.ABSTRACT_TYPE_DECLARATION_ADAPTED_COMMENTS_BEFORE_BODY_ITEM__COMMENTS_BEFORE_BODY, oldCommentsBeforeBody, commentsBeforeBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.ABSTRACT_TYPE_DECLARATION_ADAPTED_COMMENTS_BEFORE_BODY_ITEM__COMMENTS_BEFORE_BODY:
				if (resolve) return getCommentsBeforeBody();
				return basicGetCommentsBeforeBody();
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
			case Java_adaptedPackage.ABSTRACT_TYPE_DECLARATION_ADAPTED_COMMENTS_BEFORE_BODY_ITEM__COMMENTS_BEFORE_BODY:
				setCommentsBeforeBody((Comment_adapted)newValue);
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
			case Java_adaptedPackage.ABSTRACT_TYPE_DECLARATION_ADAPTED_COMMENTS_BEFORE_BODY_ITEM__COMMENTS_BEFORE_BODY:
				setCommentsBeforeBody((Comment_adapted)null);
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
			case Java_adaptedPackage.ABSTRACT_TYPE_DECLARATION_ADAPTED_COMMENTS_BEFORE_BODY_ITEM__COMMENTS_BEFORE_BODY:
				return commentsBeforeBody != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractTypeDeclaration_adapted_commentsBeforeBodyItemImpl
