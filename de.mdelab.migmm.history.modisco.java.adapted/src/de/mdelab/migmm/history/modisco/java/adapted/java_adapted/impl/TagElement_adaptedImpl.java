/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TagElement_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TagElement_adapted_fragmentsItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TagElement_adapted_tagNameValue;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tag Element adapted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.TagElement_adaptedImpl#getTagName <em>Tag Name</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.TagElement_adaptedImpl#getFragments <em>Fragments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TagElement_adaptedImpl extends ASTNode_adaptedImpl implements TagElement_adapted {
	/**
	 * The cached value of the '{@link #getTagName() <em>Tag Name</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTagName()
	 * @generated
	 * @ordered
	 */
	protected EList<TagElement_adapted_tagNameValue> tagName;

	/**
	 * The cached value of the '{@link #getFragments() <em>Fragments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFragments()
	 * @generated
	 * @ordered
	 */
	protected EList<TagElement_adapted_fragmentsItem> fragments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TagElement_adaptedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getTagElement_adapted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TagElement_adapted_tagNameValue> getTagName() {
		if (tagName == null) {
			tagName = new EObjectResolvingEList<TagElement_adapted_tagNameValue>(TagElement_adapted_tagNameValue.class, this, Java_adaptedPackage.TAG_ELEMENT_ADAPTED__TAG_NAME);
		}
		return tagName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TagElement_adapted_fragmentsItem> getFragments() {
		if (fragments == null) {
			fragments = new EObjectResolvingEList<TagElement_adapted_fragmentsItem>(TagElement_adapted_fragmentsItem.class, this, Java_adaptedPackage.TAG_ELEMENT_ADAPTED__FRAGMENTS);
		}
		return fragments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.TAG_ELEMENT_ADAPTED__TAG_NAME:
				return getTagName();
			case Java_adaptedPackage.TAG_ELEMENT_ADAPTED__FRAGMENTS:
				return getFragments();
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
			case Java_adaptedPackage.TAG_ELEMENT_ADAPTED__TAG_NAME:
				getTagName().clear();
				getTagName().addAll((Collection<? extends TagElement_adapted_tagNameValue>)newValue);
				return;
			case Java_adaptedPackage.TAG_ELEMENT_ADAPTED__FRAGMENTS:
				getFragments().clear();
				getFragments().addAll((Collection<? extends TagElement_adapted_fragmentsItem>)newValue);
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
			case Java_adaptedPackage.TAG_ELEMENT_ADAPTED__TAG_NAME:
				getTagName().clear();
				return;
			case Java_adaptedPackage.TAG_ELEMENT_ADAPTED__FRAGMENTS:
				getFragments().clear();
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
			case Java_adaptedPackage.TAG_ELEMENT_ADAPTED__TAG_NAME:
				return tagName != null && !tagName.isEmpty();
			case Java_adaptedPackage.TAG_ELEMENT_ADAPTED__FRAGMENTS:
				return fragments != null && !fragments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TagElement_adaptedImpl
