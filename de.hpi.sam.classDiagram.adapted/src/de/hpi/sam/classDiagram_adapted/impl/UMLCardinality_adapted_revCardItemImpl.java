/**
 */
package de.hpi.sam.classDiagram_adapted.impl;

import de.hpi.sam.classDiagram_adapted.ClassDiagram_adaptedPackage;
import de.hpi.sam.classDiagram_adapted.UMLCardinality_adapted_revCardItem;
import de.hpi.sam.classDiagram_adapted.UMLRole_adapted;

import de.mdelab.migmm.history.impl.EdgeWithHistoryImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UML Cardinality adapted rev Card Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.hpi.sam.classDiagram_adapted.impl.UMLCardinality_adapted_revCardItemImpl#getRevCard <em>Rev Card</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UMLCardinality_adapted_revCardItemImpl extends EdgeWithHistoryImpl implements UMLCardinality_adapted_revCardItem {
	/**
	 * The cached value of the '{@link #getRevCard() <em>Rev Card</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevCard()
	 * @generated
	 * @ordered
	 */
	protected UMLRole_adapted revCard;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UMLCardinality_adapted_revCardItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassDiagram_adaptedPackage.Literals.UML_CARDINALITY_ADAPTED_REV_CARD_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UMLRole_adapted getRevCard() {
		if (revCard != null && revCard.eIsProxy()) {
			InternalEObject oldRevCard = (InternalEObject)revCard;
			revCard = (UMLRole_adapted)eResolveProxy(oldRevCard);
			if (revCard != oldRevCard) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassDiagram_adaptedPackage.UML_CARDINALITY_ADAPTED_REV_CARD_ITEM__REV_CARD, oldRevCard, revCard));
			}
		}
		return revCard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLRole_adapted basicGetRevCard() {
		return revCard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRevCard(UMLRole_adapted newRevCard) {
		UMLRole_adapted oldRevCard = revCard;
		revCard = newRevCard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagram_adaptedPackage.UML_CARDINALITY_ADAPTED_REV_CARD_ITEM__REV_CARD, oldRevCard, revCard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassDiagram_adaptedPackage.UML_CARDINALITY_ADAPTED_REV_CARD_ITEM__REV_CARD:
				if (resolve) return getRevCard();
				return basicGetRevCard();
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
			case ClassDiagram_adaptedPackage.UML_CARDINALITY_ADAPTED_REV_CARD_ITEM__REV_CARD:
				setRevCard((UMLRole_adapted)newValue);
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
			case ClassDiagram_adaptedPackage.UML_CARDINALITY_ADAPTED_REV_CARD_ITEM__REV_CARD:
				setRevCard((UMLRole_adapted)null);
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
			case ClassDiagram_adaptedPackage.UML_CARDINALITY_ADAPTED_REV_CARD_ITEM__REV_CARD:
				return revCard != null;
		}
		return super.eIsSet(featureID);
	}

} //UMLCardinality_adapted_revCardItemImpl
