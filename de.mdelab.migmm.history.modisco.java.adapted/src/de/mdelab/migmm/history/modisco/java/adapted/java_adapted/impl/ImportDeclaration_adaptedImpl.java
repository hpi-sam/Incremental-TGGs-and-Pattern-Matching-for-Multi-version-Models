/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ImportDeclaration_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ImportDeclaration_adapted_importedElementItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ImportDeclaration_adapted_staticValue;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import Declaration adapted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.ImportDeclaration_adaptedImpl#getStatic <em>Static</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.ImportDeclaration_adaptedImpl#getImportedElement <em>Imported Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImportDeclaration_adaptedImpl extends ASTNode_adaptedImpl implements ImportDeclaration_adapted {
	/**
	 * The cached value of the '{@link #getStatic() <em>Static</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatic()
	 * @generated
	 * @ordered
	 */
	protected EList<ImportDeclaration_adapted_staticValue> static_;

	/**
	 * The cached value of the '{@link #getImportedElement() <em>Imported Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedElement()
	 * @generated
	 * @ordered
	 */
	protected EList<ImportDeclaration_adapted_importedElementItem> importedElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImportDeclaration_adaptedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getImportDeclaration_adapted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImportDeclaration_adapted_staticValue> getStatic() {
		if (static_ == null) {
			static_ = new EObjectResolvingEList<ImportDeclaration_adapted_staticValue>(ImportDeclaration_adapted_staticValue.class, this, Java_adaptedPackage.IMPORT_DECLARATION_ADAPTED__STATIC);
		}
		return static_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImportDeclaration_adapted_importedElementItem> getImportedElement() {
		if (importedElement == null) {
			importedElement = new EObjectResolvingEList<ImportDeclaration_adapted_importedElementItem>(ImportDeclaration_adapted_importedElementItem.class, this, Java_adaptedPackage.IMPORT_DECLARATION_ADAPTED__IMPORTED_ELEMENT);
		}
		return importedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.IMPORT_DECLARATION_ADAPTED__STATIC:
				return getStatic();
			case Java_adaptedPackage.IMPORT_DECLARATION_ADAPTED__IMPORTED_ELEMENT:
				return getImportedElement();
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
			case Java_adaptedPackage.IMPORT_DECLARATION_ADAPTED__STATIC:
				getStatic().clear();
				getStatic().addAll((Collection<? extends ImportDeclaration_adapted_staticValue>)newValue);
				return;
			case Java_adaptedPackage.IMPORT_DECLARATION_ADAPTED__IMPORTED_ELEMENT:
				getImportedElement().clear();
				getImportedElement().addAll((Collection<? extends ImportDeclaration_adapted_importedElementItem>)newValue);
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
			case Java_adaptedPackage.IMPORT_DECLARATION_ADAPTED__STATIC:
				getStatic().clear();
				return;
			case Java_adaptedPackage.IMPORT_DECLARATION_ADAPTED__IMPORTED_ELEMENT:
				getImportedElement().clear();
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
			case Java_adaptedPackage.IMPORT_DECLARATION_ADAPTED__STATIC:
				return static_ != null && !static_.isEmpty();
			case Java_adaptedPackage.IMPORT_DECLARATION_ADAPTED__IMPORTED_ELEMENT:
				return importedElement != null && !importedElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ImportDeclaration_adaptedImpl
