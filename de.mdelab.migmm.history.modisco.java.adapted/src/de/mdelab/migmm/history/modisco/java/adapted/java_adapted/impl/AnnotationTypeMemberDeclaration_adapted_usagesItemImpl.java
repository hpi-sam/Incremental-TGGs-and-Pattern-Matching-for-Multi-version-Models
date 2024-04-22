/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.EdgeWithHistoryImpl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AnnotationMemberValuePair_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AnnotationTypeMemberDeclaration_adapted_usagesItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation Type Member Declaration adapted usages Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.AnnotationTypeMemberDeclaration_adapted_usagesItemImpl#getUsages <em>Usages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnotationTypeMemberDeclaration_adapted_usagesItemImpl extends EdgeWithHistoryImpl implements AnnotationTypeMemberDeclaration_adapted_usagesItem {
	/**
	 * The cached value of the '{@link #getUsages() <em>Usages</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsages()
	 * @generated
	 * @ordered
	 */
	protected AnnotationMemberValuePair_adapted usages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationTypeMemberDeclaration_adapted_usagesItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getAnnotationTypeMemberDeclaration_adapted_usagesItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationMemberValuePair_adapted getUsages() {
		if (usages != null && usages.eIsProxy()) {
			InternalEObject oldUsages = (InternalEObject)usages;
			usages = (AnnotationMemberValuePair_adapted)eResolveProxy(oldUsages);
			if (usages != oldUsages) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Java_adaptedPackage.ANNOTATION_TYPE_MEMBER_DECLARATION_ADAPTED_USAGES_ITEM__USAGES, oldUsages, usages));
			}
		}
		return usages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationMemberValuePair_adapted basicGetUsages() {
		return usages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsages(AnnotationMemberValuePair_adapted newUsages) {
		AnnotationMemberValuePair_adapted oldUsages = usages;
		usages = newUsages;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_adaptedPackage.ANNOTATION_TYPE_MEMBER_DECLARATION_ADAPTED_USAGES_ITEM__USAGES, oldUsages, usages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.ANNOTATION_TYPE_MEMBER_DECLARATION_ADAPTED_USAGES_ITEM__USAGES:
				if (resolve) return getUsages();
				return basicGetUsages();
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
			case Java_adaptedPackage.ANNOTATION_TYPE_MEMBER_DECLARATION_ADAPTED_USAGES_ITEM__USAGES:
				setUsages((AnnotationMemberValuePair_adapted)newValue);
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
			case Java_adaptedPackage.ANNOTATION_TYPE_MEMBER_DECLARATION_ADAPTED_USAGES_ITEM__USAGES:
				setUsages((AnnotationMemberValuePair_adapted)null);
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
			case Java_adaptedPackage.ANNOTATION_TYPE_MEMBER_DECLARATION_ADAPTED_USAGES_ITEM__USAGES:
				return usages != null;
		}
		return super.eIsSet(featureID);
	}

} //AnnotationTypeMemberDeclaration_adapted_usagesItemImpl
