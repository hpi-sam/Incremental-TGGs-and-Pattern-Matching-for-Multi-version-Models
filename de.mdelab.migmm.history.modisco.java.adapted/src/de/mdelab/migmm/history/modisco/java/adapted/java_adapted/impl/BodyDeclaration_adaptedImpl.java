/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.BodyDeclaration_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.BodyDeclaration_adapted_abstractTypeDeclarationItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.BodyDeclaration_adapted_annotationsItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.BodyDeclaration_adapted_anonymousClassDeclarationOwnerItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.BodyDeclaration_adapted_modifierItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Body Declaration adapted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.BodyDeclaration_adaptedImpl#getAbstractTypeDeclaration <em>Abstract Type Declaration</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.BodyDeclaration_adaptedImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.BodyDeclaration_adaptedImpl#getAnonymousClassDeclarationOwner <em>Anonymous Class Declaration Owner</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.BodyDeclaration_adaptedImpl#getModifier <em>Modifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BodyDeclaration_adaptedImpl extends NamedElement_adaptedImpl implements BodyDeclaration_adapted {
	/**
	 * The cached value of the '{@link #getAbstractTypeDeclaration() <em>Abstract Type Declaration</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractTypeDeclaration()
	 * @generated
	 * @ordered
	 */
	protected EList<BodyDeclaration_adapted_abstractTypeDeclarationItem> abstractTypeDeclaration;

	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<BodyDeclaration_adapted_annotationsItem> annotations;

	/**
	 * The cached value of the '{@link #getAnonymousClassDeclarationOwner() <em>Anonymous Class Declaration Owner</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnonymousClassDeclarationOwner()
	 * @generated
	 * @ordered
	 */
	protected EList<BodyDeclaration_adapted_anonymousClassDeclarationOwnerItem> anonymousClassDeclarationOwner;

	/**
	 * The cached value of the '{@link #getModifier() <em>Modifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifier()
	 * @generated
	 * @ordered
	 */
	protected EList<BodyDeclaration_adapted_modifierItem> modifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BodyDeclaration_adaptedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getBodyDeclaration_adapted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BodyDeclaration_adapted_abstractTypeDeclarationItem> getAbstractTypeDeclaration() {
		if (abstractTypeDeclaration == null) {
			abstractTypeDeclaration = new EObjectResolvingEList<BodyDeclaration_adapted_abstractTypeDeclarationItem>(BodyDeclaration_adapted_abstractTypeDeclarationItem.class, this, Java_adaptedPackage.BODY_DECLARATION_ADAPTED__ABSTRACT_TYPE_DECLARATION);
		}
		return abstractTypeDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BodyDeclaration_adapted_annotationsItem> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectResolvingEList<BodyDeclaration_adapted_annotationsItem>(BodyDeclaration_adapted_annotationsItem.class, this, Java_adaptedPackage.BODY_DECLARATION_ADAPTED__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BodyDeclaration_adapted_anonymousClassDeclarationOwnerItem> getAnonymousClassDeclarationOwner() {
		if (anonymousClassDeclarationOwner == null) {
			anonymousClassDeclarationOwner = new EObjectResolvingEList<BodyDeclaration_adapted_anonymousClassDeclarationOwnerItem>(BodyDeclaration_adapted_anonymousClassDeclarationOwnerItem.class, this, Java_adaptedPackage.BODY_DECLARATION_ADAPTED__ANONYMOUS_CLASS_DECLARATION_OWNER);
		}
		return anonymousClassDeclarationOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BodyDeclaration_adapted_modifierItem> getModifier() {
		if (modifier == null) {
			modifier = new EObjectResolvingEList<BodyDeclaration_adapted_modifierItem>(BodyDeclaration_adapted_modifierItem.class, this, Java_adaptedPackage.BODY_DECLARATION_ADAPTED__MODIFIER);
		}
		return modifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.BODY_DECLARATION_ADAPTED__ABSTRACT_TYPE_DECLARATION:
				return getAbstractTypeDeclaration();
			case Java_adaptedPackage.BODY_DECLARATION_ADAPTED__ANNOTATIONS:
				return getAnnotations();
			case Java_adaptedPackage.BODY_DECLARATION_ADAPTED__ANONYMOUS_CLASS_DECLARATION_OWNER:
				return getAnonymousClassDeclarationOwner();
			case Java_adaptedPackage.BODY_DECLARATION_ADAPTED__MODIFIER:
				return getModifier();
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
			case Java_adaptedPackage.BODY_DECLARATION_ADAPTED__ABSTRACT_TYPE_DECLARATION:
				getAbstractTypeDeclaration().clear();
				getAbstractTypeDeclaration().addAll((Collection<? extends BodyDeclaration_adapted_abstractTypeDeclarationItem>)newValue);
				return;
			case Java_adaptedPackage.BODY_DECLARATION_ADAPTED__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends BodyDeclaration_adapted_annotationsItem>)newValue);
				return;
			case Java_adaptedPackage.BODY_DECLARATION_ADAPTED__ANONYMOUS_CLASS_DECLARATION_OWNER:
				getAnonymousClassDeclarationOwner().clear();
				getAnonymousClassDeclarationOwner().addAll((Collection<? extends BodyDeclaration_adapted_anonymousClassDeclarationOwnerItem>)newValue);
				return;
			case Java_adaptedPackage.BODY_DECLARATION_ADAPTED__MODIFIER:
				getModifier().clear();
				getModifier().addAll((Collection<? extends BodyDeclaration_adapted_modifierItem>)newValue);
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
			case Java_adaptedPackage.BODY_DECLARATION_ADAPTED__ABSTRACT_TYPE_DECLARATION:
				getAbstractTypeDeclaration().clear();
				return;
			case Java_adaptedPackage.BODY_DECLARATION_ADAPTED__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case Java_adaptedPackage.BODY_DECLARATION_ADAPTED__ANONYMOUS_CLASS_DECLARATION_OWNER:
				getAnonymousClassDeclarationOwner().clear();
				return;
			case Java_adaptedPackage.BODY_DECLARATION_ADAPTED__MODIFIER:
				getModifier().clear();
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
			case Java_adaptedPackage.BODY_DECLARATION_ADAPTED__ABSTRACT_TYPE_DECLARATION:
				return abstractTypeDeclaration != null && !abstractTypeDeclaration.isEmpty();
			case Java_adaptedPackage.BODY_DECLARATION_ADAPTED__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case Java_adaptedPackage.BODY_DECLARATION_ADAPTED__ANONYMOUS_CLASS_DECLARATION_OWNER:
				return anonymousClassDeclarationOwner != null && !anonymousClassDeclarationOwner.isEmpty();
			case Java_adaptedPackage.BODY_DECLARATION_ADAPTED__MODIFIER:
				return modifier != null && !modifier.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BodyDeclaration_adaptedImpl
