/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MemberRef_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MemberRef_adapted_memberItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MemberRef_adapted_qualifierItem;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Member Ref adapted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.MemberRef_adaptedImpl#getMember <em>Member</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.MemberRef_adaptedImpl#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MemberRef_adaptedImpl extends ASTNode_adaptedImpl implements MemberRef_adapted {
	/**
	 * The cached value of the '{@link #getMember() <em>Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMember()
	 * @generated
	 * @ordered
	 */
	protected EList<MemberRef_adapted_memberItem> member;

	/**
	 * The cached value of the '{@link #getQualifier() <em>Qualifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifier()
	 * @generated
	 * @ordered
	 */
	protected EList<MemberRef_adapted_qualifierItem> qualifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemberRef_adaptedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getMemberRef_adapted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MemberRef_adapted_memberItem> getMember() {
		if (member == null) {
			member = new EObjectResolvingEList<MemberRef_adapted_memberItem>(MemberRef_adapted_memberItem.class, this, Java_adaptedPackage.MEMBER_REF_ADAPTED__MEMBER);
		}
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MemberRef_adapted_qualifierItem> getQualifier() {
		if (qualifier == null) {
			qualifier = new EObjectResolvingEList<MemberRef_adapted_qualifierItem>(MemberRef_adapted_qualifierItem.class, this, Java_adaptedPackage.MEMBER_REF_ADAPTED__QUALIFIER);
		}
		return qualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.MEMBER_REF_ADAPTED__MEMBER:
				return getMember();
			case Java_adaptedPackage.MEMBER_REF_ADAPTED__QUALIFIER:
				return getQualifier();
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
			case Java_adaptedPackage.MEMBER_REF_ADAPTED__MEMBER:
				getMember().clear();
				getMember().addAll((Collection<? extends MemberRef_adapted_memberItem>)newValue);
				return;
			case Java_adaptedPackage.MEMBER_REF_ADAPTED__QUALIFIER:
				getQualifier().clear();
				getQualifier().addAll((Collection<? extends MemberRef_adapted_qualifierItem>)newValue);
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
			case Java_adaptedPackage.MEMBER_REF_ADAPTED__MEMBER:
				getMember().clear();
				return;
			case Java_adaptedPackage.MEMBER_REF_ADAPTED__QUALIFIER:
				getQualifier().clear();
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
			case Java_adaptedPackage.MEMBER_REF_ADAPTED__MEMBER:
				return member != null && !member.isEmpty();
			case Java_adaptedPackage.MEMBER_REF_ADAPTED__QUALIFIER:
				return qualifier != null && !qualifier.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MemberRef_adaptedImpl
