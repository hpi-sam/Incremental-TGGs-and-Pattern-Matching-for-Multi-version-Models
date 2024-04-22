/**
 */
package de.hpi.sam.classDiagram_adapted.impl;

import de.hpi.sam.classDiagram_adapted.ClassDiagram_adaptedPackage;
import de.hpi.sam.classDiagram_adapted.UMLRole_adapted;
import de.hpi.sam.classDiagram_adapted.UMLRole_adapted_adornmentValue;
import de.hpi.sam.classDiagram_adapted.UMLRole_adapted_cardItem;
import de.hpi.sam.classDiagram_adapted.UMLRole_adapted_revLeftRoleItem;
import de.hpi.sam.classDiagram_adapted.UMLRole_adapted_revRightRoleItem;
import de.hpi.sam.classDiagram_adapted.UMLRole_adapted_targetItem;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UML Role adapted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.hpi.sam.classDiagram_adapted.impl.UMLRole_adaptedImpl#getAdornment <em>Adornment</em>}</li>
 *   <li>{@link de.hpi.sam.classDiagram_adapted.impl.UMLRole_adaptedImpl#getCard <em>Card</em>}</li>
 *   <li>{@link de.hpi.sam.classDiagram_adapted.impl.UMLRole_adaptedImpl#getRevLeftRole <em>Rev Left Role</em>}</li>
 *   <li>{@link de.hpi.sam.classDiagram_adapted.impl.UMLRole_adaptedImpl#getRevRightRole <em>Rev Right Role</em>}</li>
 *   <li>{@link de.hpi.sam.classDiagram_adapted.impl.UMLRole_adaptedImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UMLRole_adaptedImpl extends UMLIncrement_adaptedImpl implements UMLRole_adapted {
	/**
	 * The cached value of the '{@link #getAdornment() <em>Adornment</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdornment()
	 * @generated
	 * @ordered
	 */
	protected EList<UMLRole_adapted_adornmentValue> adornment;

	/**
	 * The cached value of the '{@link #getCard() <em>Card</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCard()
	 * @generated
	 * @ordered
	 */
	protected EList<UMLRole_adapted_cardItem> card;

	/**
	 * The cached value of the '{@link #getRevLeftRole() <em>Rev Left Role</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevLeftRole()
	 * @generated
	 * @ordered
	 */
	protected EList<UMLRole_adapted_revLeftRoleItem> revLeftRole;

	/**
	 * The cached value of the '{@link #getRevRightRole() <em>Rev Right Role</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevRightRole()
	 * @generated
	 * @ordered
	 */
	protected EList<UMLRole_adapted_revRightRoleItem> revRightRole;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<UMLRole_adapted_targetItem> target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UMLRole_adaptedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassDiagram_adaptedPackage.Literals.UML_ROLE_ADAPTED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UMLRole_adapted_adornmentValue> getAdornment() {
		if (adornment == null) {
			adornment = new EObjectResolvingEList<UMLRole_adapted_adornmentValue>(UMLRole_adapted_adornmentValue.class, this, ClassDiagram_adaptedPackage.UML_ROLE_ADAPTED__ADORNMENT);
		}
		return adornment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UMLRole_adapted_cardItem> getCard() {
		if (card == null) {
			card = new EObjectResolvingEList<UMLRole_adapted_cardItem>(UMLRole_adapted_cardItem.class, this, ClassDiagram_adaptedPackage.UML_ROLE_ADAPTED__CARD);
		}
		return card;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UMLRole_adapted_revLeftRoleItem> getRevLeftRole() {
		if (revLeftRole == null) {
			revLeftRole = new EObjectResolvingEList<UMLRole_adapted_revLeftRoleItem>(UMLRole_adapted_revLeftRoleItem.class, this, ClassDiagram_adaptedPackage.UML_ROLE_ADAPTED__REV_LEFT_ROLE);
		}
		return revLeftRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UMLRole_adapted_revRightRoleItem> getRevRightRole() {
		if (revRightRole == null) {
			revRightRole = new EObjectResolvingEList<UMLRole_adapted_revRightRoleItem>(UMLRole_adapted_revRightRoleItem.class, this, ClassDiagram_adaptedPackage.UML_ROLE_ADAPTED__REV_RIGHT_ROLE);
		}
		return revRightRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UMLRole_adapted_targetItem> getTarget() {
		if (target == null) {
			target = new EObjectResolvingEList<UMLRole_adapted_targetItem>(UMLRole_adapted_targetItem.class, this, ClassDiagram_adaptedPackage.UML_ROLE_ADAPTED__TARGET);
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassDiagram_adaptedPackage.UML_ROLE_ADAPTED__ADORNMENT:
				return getAdornment();
			case ClassDiagram_adaptedPackage.UML_ROLE_ADAPTED__CARD:
				return getCard();
			case ClassDiagram_adaptedPackage.UML_ROLE_ADAPTED__REV_LEFT_ROLE:
				return getRevLeftRole();
			case ClassDiagram_adaptedPackage.UML_ROLE_ADAPTED__REV_RIGHT_ROLE:
				return getRevRightRole();
			case ClassDiagram_adaptedPackage.UML_ROLE_ADAPTED__TARGET:
				return getTarget();
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
			case ClassDiagram_adaptedPackage.UML_ROLE_ADAPTED__ADORNMENT:
				getAdornment().clear();
				getAdornment().addAll((Collection<? extends UMLRole_adapted_adornmentValue>)newValue);
				return;
			case ClassDiagram_adaptedPackage.UML_ROLE_ADAPTED__CARD:
				getCard().clear();
				getCard().addAll((Collection<? extends UMLRole_adapted_cardItem>)newValue);
				return;
			case ClassDiagram_adaptedPackage.UML_ROLE_ADAPTED__REV_LEFT_ROLE:
				getRevLeftRole().clear();
				getRevLeftRole().addAll((Collection<? extends UMLRole_adapted_revLeftRoleItem>)newValue);
				return;
			case ClassDiagram_adaptedPackage.UML_ROLE_ADAPTED__REV_RIGHT_ROLE:
				getRevRightRole().clear();
				getRevRightRole().addAll((Collection<? extends UMLRole_adapted_revRightRoleItem>)newValue);
				return;
			case ClassDiagram_adaptedPackage.UML_ROLE_ADAPTED__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends UMLRole_adapted_targetItem>)newValue);
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
			case ClassDiagram_adaptedPackage.UML_ROLE_ADAPTED__ADORNMENT:
				getAdornment().clear();
				return;
			case ClassDiagram_adaptedPackage.UML_ROLE_ADAPTED__CARD:
				getCard().clear();
				return;
			case ClassDiagram_adaptedPackage.UML_ROLE_ADAPTED__REV_LEFT_ROLE:
				getRevLeftRole().clear();
				return;
			case ClassDiagram_adaptedPackage.UML_ROLE_ADAPTED__REV_RIGHT_ROLE:
				getRevRightRole().clear();
				return;
			case ClassDiagram_adaptedPackage.UML_ROLE_ADAPTED__TARGET:
				getTarget().clear();
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
			case ClassDiagram_adaptedPackage.UML_ROLE_ADAPTED__ADORNMENT:
				return adornment != null && !adornment.isEmpty();
			case ClassDiagram_adaptedPackage.UML_ROLE_ADAPTED__CARD:
				return card != null && !card.isEmpty();
			case ClassDiagram_adaptedPackage.UML_ROLE_ADAPTED__REV_LEFT_ROLE:
				return revLeftRole != null && !revLeftRole.isEmpty();
			case ClassDiagram_adaptedPackage.UML_ROLE_ADAPTED__REV_RIGHT_ROLE:
				return revRightRole != null && !revRightRole.isEmpty();
			case ClassDiagram_adaptedPackage.UML_ROLE_ADAPTED__TARGET:
				return target != null && !target.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UMLRole_adaptedImpl
