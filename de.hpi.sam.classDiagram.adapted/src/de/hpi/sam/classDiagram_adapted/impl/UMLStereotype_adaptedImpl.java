/**
 */
package de.hpi.sam.classDiagram_adapted.impl;

import de.hpi.sam.classDiagram_adapted.ClassDiagram_adaptedPackage;
import de.hpi.sam.classDiagram_adapted.UMLStereotype_adapted;
import de.hpi.sam.classDiagram_adapted.UMLStereotype_adapted_incrementItem;
import de.hpi.sam.classDiagram_adapted.UMLStereotype_adapted_textValue;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UML Stereotype adapted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.hpi.sam.classDiagram_adapted.impl.UMLStereotype_adaptedImpl#getText <em>Text</em>}</li>
 *   <li>{@link de.hpi.sam.classDiagram_adapted.impl.UMLStereotype_adaptedImpl#getIncrement <em>Increment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UMLStereotype_adaptedImpl extends UMLIncrement_adaptedImpl implements UMLStereotype_adapted {
	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected EList<UMLStereotype_adapted_textValue> text;

	/**
	 * The cached value of the '{@link #getIncrement() <em>Increment</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrement()
	 * @generated
	 * @ordered
	 */
	protected EList<UMLStereotype_adapted_incrementItem> increment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UMLStereotype_adaptedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassDiagram_adaptedPackage.Literals.UML_STEREOTYPE_ADAPTED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UMLStereotype_adapted_textValue> getText() {
		if (text == null) {
			text = new EObjectResolvingEList<UMLStereotype_adapted_textValue>(UMLStereotype_adapted_textValue.class, this, ClassDiagram_adaptedPackage.UML_STEREOTYPE_ADAPTED__TEXT);
		}
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UMLStereotype_adapted_incrementItem> getIncrement() {
		if (increment == null) {
			increment = new EObjectResolvingEList<UMLStereotype_adapted_incrementItem>(UMLStereotype_adapted_incrementItem.class, this, ClassDiagram_adaptedPackage.UML_STEREOTYPE_ADAPTED__INCREMENT);
		}
		return increment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassDiagram_adaptedPackage.UML_STEREOTYPE_ADAPTED__TEXT:
				return getText();
			case ClassDiagram_adaptedPackage.UML_STEREOTYPE_ADAPTED__INCREMENT:
				return getIncrement();
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
			case ClassDiagram_adaptedPackage.UML_STEREOTYPE_ADAPTED__TEXT:
				getText().clear();
				getText().addAll((Collection<? extends UMLStereotype_adapted_textValue>)newValue);
				return;
			case ClassDiagram_adaptedPackage.UML_STEREOTYPE_ADAPTED__INCREMENT:
				getIncrement().clear();
				getIncrement().addAll((Collection<? extends UMLStereotype_adapted_incrementItem>)newValue);
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
			case ClassDiagram_adaptedPackage.UML_STEREOTYPE_ADAPTED__TEXT:
				getText().clear();
				return;
			case ClassDiagram_adaptedPackage.UML_STEREOTYPE_ADAPTED__INCREMENT:
				getIncrement().clear();
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
			case ClassDiagram_adaptedPackage.UML_STEREOTYPE_ADAPTED__TEXT:
				return text != null && !text.isEmpty();
			case ClassDiagram_adaptedPackage.UML_STEREOTYPE_ADAPTED__INCREMENT:
				return increment != null && !increment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UMLStereotype_adaptedImpl
