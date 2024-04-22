/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractTypeDeclaration_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractTypeDeclaration_adapted_bodyDeclarationsItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractTypeDeclaration_adapted_commentsAfterBodyItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractTypeDeclaration_adapted_commentsBeforeBodyItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractTypeDeclaration_adapted_packageItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractTypeDeclaration_adapted_superInterfacesItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Type_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Type_adapted_usagesInTypeAccessItem;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Type Declaration adapted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.AbstractTypeDeclaration_adaptedImpl#getUsagesInTypeAccess <em>Usages In Type Access</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.AbstractTypeDeclaration_adaptedImpl#getBodyDeclarations <em>Body Declarations</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.AbstractTypeDeclaration_adaptedImpl#getCommentsBeforeBody <em>Comments Before Body</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.AbstractTypeDeclaration_adaptedImpl#getCommentsAfterBody <em>Comments After Body</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.AbstractTypeDeclaration_adaptedImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.AbstractTypeDeclaration_adaptedImpl#getSuperInterfaces <em>Super Interfaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractTypeDeclaration_adaptedImpl extends BodyDeclaration_adaptedImpl implements AbstractTypeDeclaration_adapted {
	/**
	 * The cached value of the '{@link #getUsagesInTypeAccess() <em>Usages In Type Access</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsagesInTypeAccess()
	 * @generated
	 * @ordered
	 */
	protected EList<Type_adapted_usagesInTypeAccessItem> usagesInTypeAccess;

	/**
	 * The cached value of the '{@link #getBodyDeclarations() <em>Body Declarations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractTypeDeclaration_adapted_bodyDeclarationsItem> bodyDeclarations;

	/**
	 * The cached value of the '{@link #getCommentsBeforeBody() <em>Comments Before Body</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentsBeforeBody()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractTypeDeclaration_adapted_commentsBeforeBodyItem> commentsBeforeBody;

	/**
	 * The cached value of the '{@link #getCommentsAfterBody() <em>Comments After Body</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentsAfterBody()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractTypeDeclaration_adapted_commentsAfterBodyItem> commentsAfterBody;

	/**
	 * The cached value of the '{@link #getPackage() <em>Package</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractTypeDeclaration_adapted_packageItem> package_;

	/**
	 * The cached value of the '{@link #getSuperInterfaces() <em>Super Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractTypeDeclaration_adapted_superInterfacesItem> superInterfaces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractTypeDeclaration_adaptedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getAbstractTypeDeclaration_adapted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Type_adapted_usagesInTypeAccessItem> getUsagesInTypeAccess() {
		if (usagesInTypeAccess == null) {
			usagesInTypeAccess = new EObjectResolvingEList<Type_adapted_usagesInTypeAccessItem>(Type_adapted_usagesInTypeAccessItem.class, this, Java_adaptedPackage.ABSTRACT_TYPE_DECLARATION_ADAPTED__USAGES_IN_TYPE_ACCESS);
		}
		return usagesInTypeAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractTypeDeclaration_adapted_bodyDeclarationsItem> getBodyDeclarations() {
		if (bodyDeclarations == null) {
			bodyDeclarations = new EObjectResolvingEList<AbstractTypeDeclaration_adapted_bodyDeclarationsItem>(AbstractTypeDeclaration_adapted_bodyDeclarationsItem.class, this, Java_adaptedPackage.ABSTRACT_TYPE_DECLARATION_ADAPTED__BODY_DECLARATIONS);
		}
		return bodyDeclarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractTypeDeclaration_adapted_commentsBeforeBodyItem> getCommentsBeforeBody() {
		if (commentsBeforeBody == null) {
			commentsBeforeBody = new EObjectResolvingEList<AbstractTypeDeclaration_adapted_commentsBeforeBodyItem>(AbstractTypeDeclaration_adapted_commentsBeforeBodyItem.class, this, Java_adaptedPackage.ABSTRACT_TYPE_DECLARATION_ADAPTED__COMMENTS_BEFORE_BODY);
		}
		return commentsBeforeBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractTypeDeclaration_adapted_commentsAfterBodyItem> getCommentsAfterBody() {
		if (commentsAfterBody == null) {
			commentsAfterBody = new EObjectResolvingEList<AbstractTypeDeclaration_adapted_commentsAfterBodyItem>(AbstractTypeDeclaration_adapted_commentsAfterBodyItem.class, this, Java_adaptedPackage.ABSTRACT_TYPE_DECLARATION_ADAPTED__COMMENTS_AFTER_BODY);
		}
		return commentsAfterBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractTypeDeclaration_adapted_packageItem> getPackage() {
		if (package_ == null) {
			package_ = new EObjectResolvingEList<AbstractTypeDeclaration_adapted_packageItem>(AbstractTypeDeclaration_adapted_packageItem.class, this, Java_adaptedPackage.ABSTRACT_TYPE_DECLARATION_ADAPTED__PACKAGE);
		}
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractTypeDeclaration_adapted_superInterfacesItem> getSuperInterfaces() {
		if (superInterfaces == null) {
			superInterfaces = new EObjectResolvingEList<AbstractTypeDeclaration_adapted_superInterfacesItem>(AbstractTypeDeclaration_adapted_superInterfacesItem.class, this, Java_adaptedPackage.ABSTRACT_TYPE_DECLARATION_ADAPTED__SUPER_INTERFACES);
		}
		return superInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.ABSTRACT_TYPE_DECLARATION_ADAPTED__USAGES_IN_TYPE_ACCESS:
				return getUsagesInTypeAccess();
			case Java_adaptedPackage.ABSTRACT_TYPE_DECLARATION_ADAPTED__BODY_DECLARATIONS:
				return getBodyDeclarations();
			case Java_adaptedPackage.ABSTRACT_TYPE_DECLARATION_ADAPTED__COMMENTS_BEFORE_BODY:
				return getCommentsBeforeBody();
			case Java_adaptedPackage.ABSTRACT_TYPE_DECLARATION_ADAPTED__COMMENTS_AFTER_BODY:
				return getCommentsAfterBody();
			case Java_adaptedPackage.ABSTRACT_TYPE_DECLARATION_ADAPTED__PACKAGE:
				return getPackage();
			case Java_adaptedPackage.ABSTRACT_TYPE_DECLARATION_ADAPTED__SUPER_INTERFACES:
				return getSuperInterfaces();
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
			case Java_adaptedPackage.ABSTRACT_TYPE_DECLARATION_ADAPTED__USAGES_IN_TYPE_ACCESS:
				getUsagesInTypeAccess().clear();
				getUsagesInTypeAccess().addAll((Collection<? extends Type_adapted_usagesInTypeAccessItem>)newValue);
				return;
			case Java_adaptedPackage.ABSTRACT_TYPE_DECLARATION_ADAPTED__BODY_DECLARATIONS:
				getBodyDeclarations().clear();
				getBodyDeclarations().addAll((Collection<? extends AbstractTypeDeclaration_adapted_bodyDeclarationsItem>)newValue);
				return;
			case Java_adaptedPackage.ABSTRACT_TYPE_DECLARATION_ADAPTED__COMMENTS_BEFORE_BODY:
				getCommentsBeforeBody().clear();
				getCommentsBeforeBody().addAll((Collection<? extends AbstractTypeDeclaration_adapted_commentsBeforeBodyItem>)newValue);
				return;
			case Java_adaptedPackage.ABSTRACT_TYPE_DECLARATION_ADAPTED__COMMENTS_AFTER_BODY:
				getCommentsAfterBody().clear();
				getCommentsAfterBody().addAll((Collection<? extends AbstractTypeDeclaration_adapted_commentsAfterBodyItem>)newValue);
				return;
			case Java_adaptedPackage.ABSTRACT_TYPE_DECLARATION_ADAPTED__PACKAGE:
				getPackage().clear();
				getPackage().addAll((Collection<? extends AbstractTypeDeclaration_adapted_packageItem>)newValue);
				return;
			case Java_adaptedPackage.ABSTRACT_TYPE_DECLARATION_ADAPTED__SUPER_INTERFACES:
				getSuperInterfaces().clear();
				getSuperInterfaces().addAll((Collection<? extends AbstractTypeDeclaration_adapted_superInterfacesItem>)newValue);
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
			case Java_adaptedPackage.ABSTRACT_TYPE_DECLARATION_ADAPTED__USAGES_IN_TYPE_ACCESS:
				getUsagesInTypeAccess().clear();
				return;
			case Java_adaptedPackage.ABSTRACT_TYPE_DECLARATION_ADAPTED__BODY_DECLARATIONS:
				getBodyDeclarations().clear();
				return;
			case Java_adaptedPackage.ABSTRACT_TYPE_DECLARATION_ADAPTED__COMMENTS_BEFORE_BODY:
				getCommentsBeforeBody().clear();
				return;
			case Java_adaptedPackage.ABSTRACT_TYPE_DECLARATION_ADAPTED__COMMENTS_AFTER_BODY:
				getCommentsAfterBody().clear();
				return;
			case Java_adaptedPackage.ABSTRACT_TYPE_DECLARATION_ADAPTED__PACKAGE:
				getPackage().clear();
				return;
			case Java_adaptedPackage.ABSTRACT_TYPE_DECLARATION_ADAPTED__SUPER_INTERFACES:
				getSuperInterfaces().clear();
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
			case Java_adaptedPackage.ABSTRACT_TYPE_DECLARATION_ADAPTED__USAGES_IN_TYPE_ACCESS:
				return usagesInTypeAccess != null && !usagesInTypeAccess.isEmpty();
			case Java_adaptedPackage.ABSTRACT_TYPE_DECLARATION_ADAPTED__BODY_DECLARATIONS:
				return bodyDeclarations != null && !bodyDeclarations.isEmpty();
			case Java_adaptedPackage.ABSTRACT_TYPE_DECLARATION_ADAPTED__COMMENTS_BEFORE_BODY:
				return commentsBeforeBody != null && !commentsBeforeBody.isEmpty();
			case Java_adaptedPackage.ABSTRACT_TYPE_DECLARATION_ADAPTED__COMMENTS_AFTER_BODY:
				return commentsAfterBody != null && !commentsAfterBody.isEmpty();
			case Java_adaptedPackage.ABSTRACT_TYPE_DECLARATION_ADAPTED__PACKAGE:
				return package_ != null && !package_.isEmpty();
			case Java_adaptedPackage.ABSTRACT_TYPE_DECLARATION_ADAPTED__SUPER_INTERFACES:
				return superInterfaces != null && !superInterfaces.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Type_adapted.class) {
			switch (derivedFeatureID) {
				case Java_adaptedPackage.ABSTRACT_TYPE_DECLARATION_ADAPTED__USAGES_IN_TYPE_ACCESS: return Java_adaptedPackage.TYPE_ADAPTED__USAGES_IN_TYPE_ACCESS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Type_adapted.class) {
			switch (baseFeatureID) {
				case Java_adaptedPackage.TYPE_ADAPTED__USAGES_IN_TYPE_ACCESS: return Java_adaptedPackage.ABSTRACT_TYPE_DECLARATION_ADAPTED__USAGES_IN_TYPE_ACCESS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //AbstractTypeDeclaration_adaptedImpl
