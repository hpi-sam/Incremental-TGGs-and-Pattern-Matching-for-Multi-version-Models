/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.EdgeWithHistoryImpl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractMethodDeclaration_adapted_usagesInDocCommentsItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MethodRef_adapted;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Method Declaration adapted usages In Doc Comments Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.AbstractMethodDeclaration_adapted_usagesInDocCommentsItemImpl#getUsagesInDocComments <em>Usages In Doc Comments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractMethodDeclaration_adapted_usagesInDocCommentsItemImpl extends EdgeWithHistoryImpl implements AbstractMethodDeclaration_adapted_usagesInDocCommentsItem {
	/**
	 * The cached value of the '{@link #getUsagesInDocComments() <em>Usages In Doc Comments</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsagesInDocComments()
	 * @generated
	 * @ordered
	 */
	protected MethodRef_adapted usagesInDocComments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractMethodDeclaration_adapted_usagesInDocCommentsItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getAbstractMethodDeclaration_adapted_usagesInDocCommentsItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodRef_adapted getUsagesInDocComments() {
		if (usagesInDocComments != null && usagesInDocComments.eIsProxy()) {
			InternalEObject oldUsagesInDocComments = (InternalEObject)usagesInDocComments;
			usagesInDocComments = (MethodRef_adapted)eResolveProxy(oldUsagesInDocComments);
			if (usagesInDocComments != oldUsagesInDocComments) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Java_adaptedPackage.ABSTRACT_METHOD_DECLARATION_ADAPTED_USAGES_IN_DOC_COMMENTS_ITEM__USAGES_IN_DOC_COMMENTS, oldUsagesInDocComments, usagesInDocComments));
			}
		}
		return usagesInDocComments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodRef_adapted basicGetUsagesInDocComments() {
		return usagesInDocComments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsagesInDocComments(MethodRef_adapted newUsagesInDocComments) {
		MethodRef_adapted oldUsagesInDocComments = usagesInDocComments;
		usagesInDocComments = newUsagesInDocComments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_adaptedPackage.ABSTRACT_METHOD_DECLARATION_ADAPTED_USAGES_IN_DOC_COMMENTS_ITEM__USAGES_IN_DOC_COMMENTS, oldUsagesInDocComments, usagesInDocComments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.ABSTRACT_METHOD_DECLARATION_ADAPTED_USAGES_IN_DOC_COMMENTS_ITEM__USAGES_IN_DOC_COMMENTS:
				if (resolve) return getUsagesInDocComments();
				return basicGetUsagesInDocComments();
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
			case Java_adaptedPackage.ABSTRACT_METHOD_DECLARATION_ADAPTED_USAGES_IN_DOC_COMMENTS_ITEM__USAGES_IN_DOC_COMMENTS:
				setUsagesInDocComments((MethodRef_adapted)newValue);
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
			case Java_adaptedPackage.ABSTRACT_METHOD_DECLARATION_ADAPTED_USAGES_IN_DOC_COMMENTS_ITEM__USAGES_IN_DOC_COMMENTS:
				setUsagesInDocComments((MethodRef_adapted)null);
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
			case Java_adaptedPackage.ABSTRACT_METHOD_DECLARATION_ADAPTED_USAGES_IN_DOC_COMMENTS_ITEM__USAGES_IN_DOC_COMMENTS:
				return usagesInDocComments != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractMethodDeclaration_adapted_usagesInDocCommentsItemImpl
