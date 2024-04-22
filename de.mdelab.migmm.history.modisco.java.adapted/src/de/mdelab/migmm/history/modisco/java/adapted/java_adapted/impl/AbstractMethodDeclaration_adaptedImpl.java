/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractMethodDeclaration_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractMethodDeclaration_adapted_bodyItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractMethodDeclaration_adapted_parametersItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractMethodDeclaration_adapted_thrownExceptionsItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractMethodDeclaration_adapted_typeParametersItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractMethodDeclaration_adapted_usagesInDocCommentsItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractMethodDeclaration_adapted_usagesItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Method Declaration adapted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.AbstractMethodDeclaration_adaptedImpl#getBody <em>Body</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.AbstractMethodDeclaration_adaptedImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.AbstractMethodDeclaration_adaptedImpl#getThrownExceptions <em>Thrown Exceptions</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.AbstractMethodDeclaration_adaptedImpl#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.AbstractMethodDeclaration_adaptedImpl#getUsagesInDocComments <em>Usages In Doc Comments</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.AbstractMethodDeclaration_adaptedImpl#getUsages <em>Usages</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractMethodDeclaration_adaptedImpl extends BodyDeclaration_adaptedImpl implements AbstractMethodDeclaration_adapted {
	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractMethodDeclaration_adapted_bodyItem> body;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractMethodDeclaration_adapted_parametersItem> parameters;

	/**
	 * The cached value of the '{@link #getThrownExceptions() <em>Thrown Exceptions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThrownExceptions()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractMethodDeclaration_adapted_thrownExceptionsItem> thrownExceptions;

	/**
	 * The cached value of the '{@link #getTypeParameters() <em>Type Parameters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractMethodDeclaration_adapted_typeParametersItem> typeParameters;

	/**
	 * The cached value of the '{@link #getUsagesInDocComments() <em>Usages In Doc Comments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsagesInDocComments()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractMethodDeclaration_adapted_usagesInDocCommentsItem> usagesInDocComments;

	/**
	 * The cached value of the '{@link #getUsages() <em>Usages</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsages()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractMethodDeclaration_adapted_usagesItem> usages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractMethodDeclaration_adaptedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getAbstractMethodDeclaration_adapted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractMethodDeclaration_adapted_bodyItem> getBody() {
		if (body == null) {
			body = new EObjectResolvingEList<AbstractMethodDeclaration_adapted_bodyItem>(AbstractMethodDeclaration_adapted_bodyItem.class, this, Java_adaptedPackage.ABSTRACT_METHOD_DECLARATION_ADAPTED__BODY);
		}
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractMethodDeclaration_adapted_parametersItem> getParameters() {
		if (parameters == null) {
			parameters = new EObjectResolvingEList<AbstractMethodDeclaration_adapted_parametersItem>(AbstractMethodDeclaration_adapted_parametersItem.class, this, Java_adaptedPackage.ABSTRACT_METHOD_DECLARATION_ADAPTED__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractMethodDeclaration_adapted_thrownExceptionsItem> getThrownExceptions() {
		if (thrownExceptions == null) {
			thrownExceptions = new EObjectResolvingEList<AbstractMethodDeclaration_adapted_thrownExceptionsItem>(AbstractMethodDeclaration_adapted_thrownExceptionsItem.class, this, Java_adaptedPackage.ABSTRACT_METHOD_DECLARATION_ADAPTED__THROWN_EXCEPTIONS);
		}
		return thrownExceptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractMethodDeclaration_adapted_typeParametersItem> getTypeParameters() {
		if (typeParameters == null) {
			typeParameters = new EObjectResolvingEList<AbstractMethodDeclaration_adapted_typeParametersItem>(AbstractMethodDeclaration_adapted_typeParametersItem.class, this, Java_adaptedPackage.ABSTRACT_METHOD_DECLARATION_ADAPTED__TYPE_PARAMETERS);
		}
		return typeParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractMethodDeclaration_adapted_usagesInDocCommentsItem> getUsagesInDocComments() {
		if (usagesInDocComments == null) {
			usagesInDocComments = new EObjectResolvingEList<AbstractMethodDeclaration_adapted_usagesInDocCommentsItem>(AbstractMethodDeclaration_adapted_usagesInDocCommentsItem.class, this, Java_adaptedPackage.ABSTRACT_METHOD_DECLARATION_ADAPTED__USAGES_IN_DOC_COMMENTS);
		}
		return usagesInDocComments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractMethodDeclaration_adapted_usagesItem> getUsages() {
		if (usages == null) {
			usages = new EObjectResolvingEList<AbstractMethodDeclaration_adapted_usagesItem>(AbstractMethodDeclaration_adapted_usagesItem.class, this, Java_adaptedPackage.ABSTRACT_METHOD_DECLARATION_ADAPTED__USAGES);
		}
		return usages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.ABSTRACT_METHOD_DECLARATION_ADAPTED__BODY:
				return getBody();
			case Java_adaptedPackage.ABSTRACT_METHOD_DECLARATION_ADAPTED__PARAMETERS:
				return getParameters();
			case Java_adaptedPackage.ABSTRACT_METHOD_DECLARATION_ADAPTED__THROWN_EXCEPTIONS:
				return getThrownExceptions();
			case Java_adaptedPackage.ABSTRACT_METHOD_DECLARATION_ADAPTED__TYPE_PARAMETERS:
				return getTypeParameters();
			case Java_adaptedPackage.ABSTRACT_METHOD_DECLARATION_ADAPTED__USAGES_IN_DOC_COMMENTS:
				return getUsagesInDocComments();
			case Java_adaptedPackage.ABSTRACT_METHOD_DECLARATION_ADAPTED__USAGES:
				return getUsages();
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
			case Java_adaptedPackage.ABSTRACT_METHOD_DECLARATION_ADAPTED__BODY:
				getBody().clear();
				getBody().addAll((Collection<? extends AbstractMethodDeclaration_adapted_bodyItem>)newValue);
				return;
			case Java_adaptedPackage.ABSTRACT_METHOD_DECLARATION_ADAPTED__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends AbstractMethodDeclaration_adapted_parametersItem>)newValue);
				return;
			case Java_adaptedPackage.ABSTRACT_METHOD_DECLARATION_ADAPTED__THROWN_EXCEPTIONS:
				getThrownExceptions().clear();
				getThrownExceptions().addAll((Collection<? extends AbstractMethodDeclaration_adapted_thrownExceptionsItem>)newValue);
				return;
			case Java_adaptedPackage.ABSTRACT_METHOD_DECLARATION_ADAPTED__TYPE_PARAMETERS:
				getTypeParameters().clear();
				getTypeParameters().addAll((Collection<? extends AbstractMethodDeclaration_adapted_typeParametersItem>)newValue);
				return;
			case Java_adaptedPackage.ABSTRACT_METHOD_DECLARATION_ADAPTED__USAGES_IN_DOC_COMMENTS:
				getUsagesInDocComments().clear();
				getUsagesInDocComments().addAll((Collection<? extends AbstractMethodDeclaration_adapted_usagesInDocCommentsItem>)newValue);
				return;
			case Java_adaptedPackage.ABSTRACT_METHOD_DECLARATION_ADAPTED__USAGES:
				getUsages().clear();
				getUsages().addAll((Collection<? extends AbstractMethodDeclaration_adapted_usagesItem>)newValue);
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
			case Java_adaptedPackage.ABSTRACT_METHOD_DECLARATION_ADAPTED__BODY:
				getBody().clear();
				return;
			case Java_adaptedPackage.ABSTRACT_METHOD_DECLARATION_ADAPTED__PARAMETERS:
				getParameters().clear();
				return;
			case Java_adaptedPackage.ABSTRACT_METHOD_DECLARATION_ADAPTED__THROWN_EXCEPTIONS:
				getThrownExceptions().clear();
				return;
			case Java_adaptedPackage.ABSTRACT_METHOD_DECLARATION_ADAPTED__TYPE_PARAMETERS:
				getTypeParameters().clear();
				return;
			case Java_adaptedPackage.ABSTRACT_METHOD_DECLARATION_ADAPTED__USAGES_IN_DOC_COMMENTS:
				getUsagesInDocComments().clear();
				return;
			case Java_adaptedPackage.ABSTRACT_METHOD_DECLARATION_ADAPTED__USAGES:
				getUsages().clear();
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
			case Java_adaptedPackage.ABSTRACT_METHOD_DECLARATION_ADAPTED__BODY:
				return body != null && !body.isEmpty();
			case Java_adaptedPackage.ABSTRACT_METHOD_DECLARATION_ADAPTED__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case Java_adaptedPackage.ABSTRACT_METHOD_DECLARATION_ADAPTED__THROWN_EXCEPTIONS:
				return thrownExceptions != null && !thrownExceptions.isEmpty();
			case Java_adaptedPackage.ABSTRACT_METHOD_DECLARATION_ADAPTED__TYPE_PARAMETERS:
				return typeParameters != null && !typeParameters.isEmpty();
			case Java_adaptedPackage.ABSTRACT_METHOD_DECLARATION_ADAPTED__USAGES_IN_DOC_COMMENTS:
				return usagesInDocComments != null && !usagesInDocComments.isEmpty();
			case Java_adaptedPackage.ABSTRACT_METHOD_DECLARATION_ADAPTED__USAGES:
				return usages != null && !usages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AbstractMethodDeclaration_adaptedImpl
