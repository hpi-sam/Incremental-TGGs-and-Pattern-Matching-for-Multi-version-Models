/**
 */
package de.hpi.sam.classDiagram_adapted.impl;

import de.hpi.sam.classDiagram_adapted.ClassDiagram_adaptedPackage;
import de.hpi.sam.classDiagram_adapted.UMLIncrement_adapted;
import de.hpi.sam.classDiagram_adapted.UMLIncrement_adapted_stereotypesItem;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UML Increment adapted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.hpi.sam.classDiagram_adapted.impl.UMLIncrement_adaptedImpl#getStereotypes <em>Stereotypes</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class UMLIncrement_adaptedImpl extends UMLElement_adaptedImpl implements UMLIncrement_adapted {
	/**
	 * The cached value of the '{@link #getStereotypes() <em>Stereotypes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStereotypes()
	 * @generated
	 * @ordered
	 */
	protected EList<UMLIncrement_adapted_stereotypesItem> stereotypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UMLIncrement_adaptedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassDiagram_adaptedPackage.Literals.UML_INCREMENT_ADAPTED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UMLIncrement_adapted_stereotypesItem> getStereotypes() {
		if (stereotypes == null) {
			stereotypes = new EObjectResolvingEList<UMLIncrement_adapted_stereotypesItem>(UMLIncrement_adapted_stereotypesItem.class, this, ClassDiagram_adaptedPackage.UML_INCREMENT_ADAPTED__STEREOTYPES);
		}
		return stereotypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassDiagram_adaptedPackage.UML_INCREMENT_ADAPTED__STEREOTYPES:
				return getStereotypes();
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
			case ClassDiagram_adaptedPackage.UML_INCREMENT_ADAPTED__STEREOTYPES:
				getStereotypes().clear();
				getStereotypes().addAll((Collection<? extends UMLIncrement_adapted_stereotypesItem>)newValue);
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
			case ClassDiagram_adaptedPackage.UML_INCREMENT_ADAPTED__STEREOTYPES:
				getStereotypes().clear();
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
			case ClassDiagram_adaptedPackage.UML_INCREMENT_ADAPTED__STEREOTYPES:
				return stereotypes != null && !stereotypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UMLIncrement_adaptedImpl
