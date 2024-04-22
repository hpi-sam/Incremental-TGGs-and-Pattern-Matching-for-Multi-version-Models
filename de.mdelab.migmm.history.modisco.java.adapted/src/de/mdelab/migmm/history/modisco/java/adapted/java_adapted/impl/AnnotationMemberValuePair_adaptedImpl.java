/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AnnotationMemberValuePair_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AnnotationMemberValuePair_adapted_memberItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AnnotationMemberValuePair_adapted_valueItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation Member Value Pair adapted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.AnnotationMemberValuePair_adaptedImpl#getMember <em>Member</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.AnnotationMemberValuePair_adaptedImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnotationMemberValuePair_adaptedImpl extends NamedElement_adaptedImpl implements AnnotationMemberValuePair_adapted {
	/**
	 * The cached value of the '{@link #getMember() <em>Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMember()
	 * @generated
	 * @ordered
	 */
	protected EList<AnnotationMemberValuePair_adapted_memberItem> member;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected EList<AnnotationMemberValuePair_adapted_valueItem> value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationMemberValuePair_adaptedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getAnnotationMemberValuePair_adapted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnnotationMemberValuePair_adapted_memberItem> getMember() {
		if (member == null) {
			member = new EObjectResolvingEList<AnnotationMemberValuePair_adapted_memberItem>(AnnotationMemberValuePair_adapted_memberItem.class, this, Java_adaptedPackage.ANNOTATION_MEMBER_VALUE_PAIR_ADAPTED__MEMBER);
		}
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnnotationMemberValuePair_adapted_valueItem> getValue() {
		if (value == null) {
			value = new EObjectResolvingEList<AnnotationMemberValuePair_adapted_valueItem>(AnnotationMemberValuePair_adapted_valueItem.class, this, Java_adaptedPackage.ANNOTATION_MEMBER_VALUE_PAIR_ADAPTED__VALUE);
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.ANNOTATION_MEMBER_VALUE_PAIR_ADAPTED__MEMBER:
				return getMember();
			case Java_adaptedPackage.ANNOTATION_MEMBER_VALUE_PAIR_ADAPTED__VALUE:
				return getValue();
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
			case Java_adaptedPackage.ANNOTATION_MEMBER_VALUE_PAIR_ADAPTED__MEMBER:
				getMember().clear();
				getMember().addAll((Collection<? extends AnnotationMemberValuePair_adapted_memberItem>)newValue);
				return;
			case Java_adaptedPackage.ANNOTATION_MEMBER_VALUE_PAIR_ADAPTED__VALUE:
				getValue().clear();
				getValue().addAll((Collection<? extends AnnotationMemberValuePair_adapted_valueItem>)newValue);
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
			case Java_adaptedPackage.ANNOTATION_MEMBER_VALUE_PAIR_ADAPTED__MEMBER:
				getMember().clear();
				return;
			case Java_adaptedPackage.ANNOTATION_MEMBER_VALUE_PAIR_ADAPTED__VALUE:
				getValue().clear();
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
			case Java_adaptedPackage.ANNOTATION_MEMBER_VALUE_PAIR_ADAPTED__MEMBER:
				return member != null && !member.isEmpty();
			case Java_adaptedPackage.ANNOTATION_MEMBER_VALUE_PAIR_ADAPTED__VALUE:
				return value != null && !value.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AnnotationMemberValuePair_adaptedImpl
