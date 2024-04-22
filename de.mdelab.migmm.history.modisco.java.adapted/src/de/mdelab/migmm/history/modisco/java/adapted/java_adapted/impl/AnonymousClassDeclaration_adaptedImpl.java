/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AnonymousClassDeclaration_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AnonymousClassDeclaration_adapted_bodyDeclarationsItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AnonymousClassDeclaration_adapted_classInstanceCreationItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Anonymous Class Declaration adapted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.AnonymousClassDeclaration_adaptedImpl#getBodyDeclarations <em>Body Declarations</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.AnonymousClassDeclaration_adaptedImpl#getClassInstanceCreation <em>Class Instance Creation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnonymousClassDeclaration_adaptedImpl extends ASTNode_adaptedImpl implements AnonymousClassDeclaration_adapted {
	/**
	 * The cached value of the '{@link #getBodyDeclarations() <em>Body Declarations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<AnonymousClassDeclaration_adapted_bodyDeclarationsItem> bodyDeclarations;

	/**
	 * The cached value of the '{@link #getClassInstanceCreation() <em>Class Instance Creation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassInstanceCreation()
	 * @generated
	 * @ordered
	 */
	protected EList<AnonymousClassDeclaration_adapted_classInstanceCreationItem> classInstanceCreation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnonymousClassDeclaration_adaptedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getAnonymousClassDeclaration_adapted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnonymousClassDeclaration_adapted_bodyDeclarationsItem> getBodyDeclarations() {
		if (bodyDeclarations == null) {
			bodyDeclarations = new EObjectResolvingEList<AnonymousClassDeclaration_adapted_bodyDeclarationsItem>(AnonymousClassDeclaration_adapted_bodyDeclarationsItem.class, this, Java_adaptedPackage.ANONYMOUS_CLASS_DECLARATION_ADAPTED__BODY_DECLARATIONS);
		}
		return bodyDeclarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnonymousClassDeclaration_adapted_classInstanceCreationItem> getClassInstanceCreation() {
		if (classInstanceCreation == null) {
			classInstanceCreation = new EObjectResolvingEList<AnonymousClassDeclaration_adapted_classInstanceCreationItem>(AnonymousClassDeclaration_adapted_classInstanceCreationItem.class, this, Java_adaptedPackage.ANONYMOUS_CLASS_DECLARATION_ADAPTED__CLASS_INSTANCE_CREATION);
		}
		return classInstanceCreation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.ANONYMOUS_CLASS_DECLARATION_ADAPTED__BODY_DECLARATIONS:
				return getBodyDeclarations();
			case Java_adaptedPackage.ANONYMOUS_CLASS_DECLARATION_ADAPTED__CLASS_INSTANCE_CREATION:
				return getClassInstanceCreation();
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
			case Java_adaptedPackage.ANONYMOUS_CLASS_DECLARATION_ADAPTED__BODY_DECLARATIONS:
				getBodyDeclarations().clear();
				getBodyDeclarations().addAll((Collection<? extends AnonymousClassDeclaration_adapted_bodyDeclarationsItem>)newValue);
				return;
			case Java_adaptedPackage.ANONYMOUS_CLASS_DECLARATION_ADAPTED__CLASS_INSTANCE_CREATION:
				getClassInstanceCreation().clear();
				getClassInstanceCreation().addAll((Collection<? extends AnonymousClassDeclaration_adapted_classInstanceCreationItem>)newValue);
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
			case Java_adaptedPackage.ANONYMOUS_CLASS_DECLARATION_ADAPTED__BODY_DECLARATIONS:
				getBodyDeclarations().clear();
				return;
			case Java_adaptedPackage.ANONYMOUS_CLASS_DECLARATION_ADAPTED__CLASS_INSTANCE_CREATION:
				getClassInstanceCreation().clear();
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
			case Java_adaptedPackage.ANONYMOUS_CLASS_DECLARATION_ADAPTED__BODY_DECLARATIONS:
				return bodyDeclarations != null && !bodyDeclarations.isEmpty();
			case Java_adaptedPackage.ANONYMOUS_CLASS_DECLARATION_ADAPTED__CLASS_INSTANCE_CREATION:
				return classInstanceCreation != null && !classInstanceCreation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AnonymousClassDeclaration_adaptedImpl
