/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.WildCardType_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.WildCardType_adapted_boundItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.WildCardType_adapted_upperBoundValue;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wild Card Type adapted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.WildCardType_adaptedImpl#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.WildCardType_adaptedImpl#getBound <em>Bound</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WildCardType_adaptedImpl extends Type_adaptedImpl implements WildCardType_adapted {
	/**
	 * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected EList<WildCardType_adapted_upperBoundValue> upperBound;

	/**
	 * The cached value of the '{@link #getBound() <em>Bound</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBound()
	 * @generated
	 * @ordered
	 */
	protected EList<WildCardType_adapted_boundItem> bound;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WildCardType_adaptedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getWildCardType_adapted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WildCardType_adapted_upperBoundValue> getUpperBound() {
		if (upperBound == null) {
			upperBound = new EObjectResolvingEList<WildCardType_adapted_upperBoundValue>(WildCardType_adapted_upperBoundValue.class, this, Java_adaptedPackage.WILD_CARD_TYPE_ADAPTED__UPPER_BOUND);
		}
		return upperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WildCardType_adapted_boundItem> getBound() {
		if (bound == null) {
			bound = new EObjectResolvingEList<WildCardType_adapted_boundItem>(WildCardType_adapted_boundItem.class, this, Java_adaptedPackage.WILD_CARD_TYPE_ADAPTED__BOUND);
		}
		return bound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.WILD_CARD_TYPE_ADAPTED__UPPER_BOUND:
				return getUpperBound();
			case Java_adaptedPackage.WILD_CARD_TYPE_ADAPTED__BOUND:
				return getBound();
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
			case Java_adaptedPackage.WILD_CARD_TYPE_ADAPTED__UPPER_BOUND:
				getUpperBound().clear();
				getUpperBound().addAll((Collection<? extends WildCardType_adapted_upperBoundValue>)newValue);
				return;
			case Java_adaptedPackage.WILD_CARD_TYPE_ADAPTED__BOUND:
				getBound().clear();
				getBound().addAll((Collection<? extends WildCardType_adapted_boundItem>)newValue);
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
			case Java_adaptedPackage.WILD_CARD_TYPE_ADAPTED__UPPER_BOUND:
				getUpperBound().clear();
				return;
			case Java_adaptedPackage.WILD_CARD_TYPE_ADAPTED__BOUND:
				getBound().clear();
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
			case Java_adaptedPackage.WILD_CARD_TYPE_ADAPTED__UPPER_BOUND:
				return upperBound != null && !upperBound.isEmpty();
			case Java_adaptedPackage.WILD_CARD_TYPE_ADAPTED__BOUND:
				return bound != null && !bound.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WildCardType_adaptedImpl
