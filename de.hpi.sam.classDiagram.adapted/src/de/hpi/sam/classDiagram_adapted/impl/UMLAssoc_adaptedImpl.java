/**
 */
package de.hpi.sam.classDiagram_adapted.impl;

import de.hpi.sam.classDiagram_adapted.ClassDiagram_adaptedPackage;
import de.hpi.sam.classDiagram_adapted.UMLAssoc_adapted;
import de.hpi.sam.classDiagram_adapted.UMLAssoc_adapted_leftRoleItem;
import de.hpi.sam.classDiagram_adapted.UMLAssoc_adapted_rightRoleItem;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UML Assoc adapted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.hpi.sam.classDiagram_adapted.impl.UMLAssoc_adaptedImpl#getLeftRole <em>Left Role</em>}</li>
 *   <li>{@link de.hpi.sam.classDiagram_adapted.impl.UMLAssoc_adaptedImpl#getRightRole <em>Right Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UMLAssoc_adaptedImpl extends UMLDiagramItem_adaptedImpl implements UMLAssoc_adapted {
	/**
	 * The cached value of the '{@link #getLeftRole() <em>Left Role</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftRole()
	 * @generated
	 * @ordered
	 */
	protected EList<UMLAssoc_adapted_leftRoleItem> leftRole;

	/**
	 * The cached value of the '{@link #getRightRole() <em>Right Role</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightRole()
	 * @generated
	 * @ordered
	 */
	protected EList<UMLAssoc_adapted_rightRoleItem> rightRole;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UMLAssoc_adaptedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassDiagram_adaptedPackage.Literals.UML_ASSOC_ADAPTED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UMLAssoc_adapted_leftRoleItem> getLeftRole() {
		if (leftRole == null) {
			leftRole = new EObjectResolvingEList<UMLAssoc_adapted_leftRoleItem>(UMLAssoc_adapted_leftRoleItem.class, this, ClassDiagram_adaptedPackage.UML_ASSOC_ADAPTED__LEFT_ROLE);
		}
		return leftRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UMLAssoc_adapted_rightRoleItem> getRightRole() {
		if (rightRole == null) {
			rightRole = new EObjectResolvingEList<UMLAssoc_adapted_rightRoleItem>(UMLAssoc_adapted_rightRoleItem.class, this, ClassDiagram_adaptedPackage.UML_ASSOC_ADAPTED__RIGHT_ROLE);
		}
		return rightRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassDiagram_adaptedPackage.UML_ASSOC_ADAPTED__LEFT_ROLE:
				return getLeftRole();
			case ClassDiagram_adaptedPackage.UML_ASSOC_ADAPTED__RIGHT_ROLE:
				return getRightRole();
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
			case ClassDiagram_adaptedPackage.UML_ASSOC_ADAPTED__LEFT_ROLE:
				getLeftRole().clear();
				getLeftRole().addAll((Collection<? extends UMLAssoc_adapted_leftRoleItem>)newValue);
				return;
			case ClassDiagram_adaptedPackage.UML_ASSOC_ADAPTED__RIGHT_ROLE:
				getRightRole().clear();
				getRightRole().addAll((Collection<? extends UMLAssoc_adapted_rightRoleItem>)newValue);
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
			case ClassDiagram_adaptedPackage.UML_ASSOC_ADAPTED__LEFT_ROLE:
				getLeftRole().clear();
				return;
			case ClassDiagram_adaptedPackage.UML_ASSOC_ADAPTED__RIGHT_ROLE:
				getRightRole().clear();
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
			case ClassDiagram_adaptedPackage.UML_ASSOC_ADAPTED__LEFT_ROLE:
				return leftRole != null && !leftRole.isEmpty();
			case ClassDiagram_adaptedPackage.UML_ASSOC_ADAPTED__RIGHT_ROLE:
				return rightRole != null && !rightRole.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UMLAssoc_adaptedImpl
