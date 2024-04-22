/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.ContainmentEdgeWithHistoryImpl;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AnnotationTypeMemberDeclaration_adapted_defaultItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Expression_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation Type Member Declaration adapted default Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.AnnotationTypeMemberDeclaration_adapted_defaultItemImpl#getDefault <em>Default</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnotationTypeMemberDeclaration_adapted_defaultItemImpl extends ContainmentEdgeWithHistoryImpl implements AnnotationTypeMemberDeclaration_adapted_defaultItem {
	/**
	 * The cached value of the '{@link #getDefault() <em>Default</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected Expression_adapted default_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationTypeMemberDeclaration_adapted_defaultItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getAnnotationTypeMemberDeclaration_adapted_defaultItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression_adapted getDefault() {
		if (default_ != null && default_.eIsProxy()) {
			InternalEObject oldDefault = (InternalEObject)default_;
			default_ = (Expression_adapted)eResolveProxy(oldDefault);
			if (default_ != oldDefault) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Java_adaptedPackage.ANNOTATION_TYPE_MEMBER_DECLARATION_ADAPTED_DEFAULT_ITEM__DEFAULT, oldDefault, default_));
			}
		}
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_adapted basicGetDefault() {
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefault(Expression_adapted newDefault) {
		Expression_adapted oldDefault = default_;
		default_ = newDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_adaptedPackage.ANNOTATION_TYPE_MEMBER_DECLARATION_ADAPTED_DEFAULT_ITEM__DEFAULT, oldDefault, default_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.ANNOTATION_TYPE_MEMBER_DECLARATION_ADAPTED_DEFAULT_ITEM__DEFAULT:
				if (resolve) return getDefault();
				return basicGetDefault();
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
			case Java_adaptedPackage.ANNOTATION_TYPE_MEMBER_DECLARATION_ADAPTED_DEFAULT_ITEM__DEFAULT:
				setDefault((Expression_adapted)newValue);
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
			case Java_adaptedPackage.ANNOTATION_TYPE_MEMBER_DECLARATION_ADAPTED_DEFAULT_ITEM__DEFAULT:
				setDefault((Expression_adapted)null);
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
			case Java_adaptedPackage.ANNOTATION_TYPE_MEMBER_DECLARATION_ADAPTED_DEFAULT_ITEM__DEFAULT:
				return default_ != null;
		}
		return super.eIsSet(featureID);
	}

} //AnnotationTypeMemberDeclaration_adapted_defaultItemImpl
