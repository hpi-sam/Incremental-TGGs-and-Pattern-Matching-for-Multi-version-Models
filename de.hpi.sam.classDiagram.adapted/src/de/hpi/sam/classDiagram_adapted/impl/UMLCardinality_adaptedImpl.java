/**
 */
package de.hpi.sam.classDiagram_adapted.impl;

import de.hpi.sam.classDiagram_adapted.ClassDiagram_adaptedPackage;
import de.hpi.sam.classDiagram_adapted.UMLCardinality_adapted;
import de.hpi.sam.classDiagram_adapted.UMLCardinality_adapted_cardStringValue;
import de.hpi.sam.classDiagram_adapted.UMLCardinality_adapted_revCardItem;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UML Cardinality adapted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.hpi.sam.classDiagram_adapted.impl.UMLCardinality_adaptedImpl#getCardString <em>Card String</em>}</li>
 *   <li>{@link de.hpi.sam.classDiagram_adapted.impl.UMLCardinality_adaptedImpl#getRevCard <em>Rev Card</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UMLCardinality_adaptedImpl extends UMLIncrement_adaptedImpl implements UMLCardinality_adapted {
	/**
	 * The cached value of the '{@link #getCardString() <em>Card String</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardString()
	 * @generated
	 * @ordered
	 */
	protected EList<UMLCardinality_adapted_cardStringValue> cardString;

	/**
	 * The cached value of the '{@link #getRevCard() <em>Rev Card</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevCard()
	 * @generated
	 * @ordered
	 */
	protected EList<UMLCardinality_adapted_revCardItem> revCard;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UMLCardinality_adaptedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassDiagram_adaptedPackage.Literals.UML_CARDINALITY_ADAPTED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UMLCardinality_adapted_cardStringValue> getCardString() {
		if (cardString == null) {
			cardString = new EObjectResolvingEList<UMLCardinality_adapted_cardStringValue>(UMLCardinality_adapted_cardStringValue.class, this, ClassDiagram_adaptedPackage.UML_CARDINALITY_ADAPTED__CARD_STRING);
		}
		return cardString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UMLCardinality_adapted_revCardItem> getRevCard() {
		if (revCard == null) {
			revCard = new EObjectResolvingEList<UMLCardinality_adapted_revCardItem>(UMLCardinality_adapted_revCardItem.class, this, ClassDiagram_adaptedPackage.UML_CARDINALITY_ADAPTED__REV_CARD);
		}
		return revCard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassDiagram_adaptedPackage.UML_CARDINALITY_ADAPTED__CARD_STRING:
				return getCardString();
			case ClassDiagram_adaptedPackage.UML_CARDINALITY_ADAPTED__REV_CARD:
				return getRevCard();
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
			case ClassDiagram_adaptedPackage.UML_CARDINALITY_ADAPTED__CARD_STRING:
				getCardString().clear();
				getCardString().addAll((Collection<? extends UMLCardinality_adapted_cardStringValue>)newValue);
				return;
			case ClassDiagram_adaptedPackage.UML_CARDINALITY_ADAPTED__REV_CARD:
				getRevCard().clear();
				getRevCard().addAll((Collection<? extends UMLCardinality_adapted_revCardItem>)newValue);
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
			case ClassDiagram_adaptedPackage.UML_CARDINALITY_ADAPTED__CARD_STRING:
				getCardString().clear();
				return;
			case ClassDiagram_adaptedPackage.UML_CARDINALITY_ADAPTED__REV_CARD:
				getRevCard().clear();
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
			case ClassDiagram_adaptedPackage.UML_CARDINALITY_ADAPTED__CARD_STRING:
				return cardString != null && !cardString.isEmpty();
			case ClassDiagram_adaptedPackage.UML_CARDINALITY_ADAPTED__REV_CARD:
				return revCard != null && !revCard.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UMLCardinality_adaptedImpl
