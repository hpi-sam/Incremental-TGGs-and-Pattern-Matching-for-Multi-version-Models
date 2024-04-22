/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AnnotationTypeMemberDeclaration_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AnnotationTypeMemberDeclaration_adapted_defaultItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AnnotationTypeMemberDeclaration_adapted_typeItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AnnotationTypeMemberDeclaration_adapted_usagesItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation Type Member Declaration adapted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.AnnotationTypeMemberDeclaration_adaptedImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.AnnotationTypeMemberDeclaration_adaptedImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.AnnotationTypeMemberDeclaration_adaptedImpl#getUsages <em>Usages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnotationTypeMemberDeclaration_adaptedImpl extends BodyDeclaration_adaptedImpl implements AnnotationTypeMemberDeclaration_adapted {
	/**
	 * The cached value of the '{@link #getDefault() <em>Default</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected EList<AnnotationTypeMemberDeclaration_adapted_defaultItem> default_;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EList<AnnotationTypeMemberDeclaration_adapted_typeItem> type;

	/**
	 * The cached value of the '{@link #getUsages() <em>Usages</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsages()
	 * @generated
	 * @ordered
	 */
	protected EList<AnnotationTypeMemberDeclaration_adapted_usagesItem> usages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationTypeMemberDeclaration_adaptedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getAnnotationTypeMemberDeclaration_adapted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnnotationTypeMemberDeclaration_adapted_defaultItem> getDefault() {
		if (default_ == null) {
			default_ = new EObjectResolvingEList<AnnotationTypeMemberDeclaration_adapted_defaultItem>(AnnotationTypeMemberDeclaration_adapted_defaultItem.class, this, Java_adaptedPackage.ANNOTATION_TYPE_MEMBER_DECLARATION_ADAPTED__DEFAULT);
		}
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnnotationTypeMemberDeclaration_adapted_typeItem> getType() {
		if (type == null) {
			type = new EObjectResolvingEList<AnnotationTypeMemberDeclaration_adapted_typeItem>(AnnotationTypeMemberDeclaration_adapted_typeItem.class, this, Java_adaptedPackage.ANNOTATION_TYPE_MEMBER_DECLARATION_ADAPTED__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnnotationTypeMemberDeclaration_adapted_usagesItem> getUsages() {
		if (usages == null) {
			usages = new EObjectResolvingEList<AnnotationTypeMemberDeclaration_adapted_usagesItem>(AnnotationTypeMemberDeclaration_adapted_usagesItem.class, this, Java_adaptedPackage.ANNOTATION_TYPE_MEMBER_DECLARATION_ADAPTED__USAGES);
		}
		return usages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.ANNOTATION_TYPE_MEMBER_DECLARATION_ADAPTED__DEFAULT:
				return getDefault();
			case Java_adaptedPackage.ANNOTATION_TYPE_MEMBER_DECLARATION_ADAPTED__TYPE:
				return getType();
			case Java_adaptedPackage.ANNOTATION_TYPE_MEMBER_DECLARATION_ADAPTED__USAGES:
				return getUsages();
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
			case Java_adaptedPackage.ANNOTATION_TYPE_MEMBER_DECLARATION_ADAPTED__DEFAULT:
				getDefault().clear();
				getDefault().addAll((Collection<? extends AnnotationTypeMemberDeclaration_adapted_defaultItem>)newValue);
				return;
			case Java_adaptedPackage.ANNOTATION_TYPE_MEMBER_DECLARATION_ADAPTED__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends AnnotationTypeMemberDeclaration_adapted_typeItem>)newValue);
				return;
			case Java_adaptedPackage.ANNOTATION_TYPE_MEMBER_DECLARATION_ADAPTED__USAGES:
				getUsages().clear();
				getUsages().addAll((Collection<? extends AnnotationTypeMemberDeclaration_adapted_usagesItem>)newValue);
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
			case Java_adaptedPackage.ANNOTATION_TYPE_MEMBER_DECLARATION_ADAPTED__DEFAULT:
				getDefault().clear();
				return;
			case Java_adaptedPackage.ANNOTATION_TYPE_MEMBER_DECLARATION_ADAPTED__TYPE:
				getType().clear();
				return;
			case Java_adaptedPackage.ANNOTATION_TYPE_MEMBER_DECLARATION_ADAPTED__USAGES:
				getUsages().clear();
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
			case Java_adaptedPackage.ANNOTATION_TYPE_MEMBER_DECLARATION_ADAPTED__DEFAULT:
				return default_ != null && !default_.isEmpty();
			case Java_adaptedPackage.ANNOTATION_TYPE_MEMBER_DECLARATION_ADAPTED__TYPE:
				return type != null && !type.isEmpty();
			case Java_adaptedPackage.ANNOTATION_TYPE_MEMBER_DECLARATION_ADAPTED__USAGES:
				return usages != null && !usages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AnnotationTypeMemberDeclaration_adaptedImpl
