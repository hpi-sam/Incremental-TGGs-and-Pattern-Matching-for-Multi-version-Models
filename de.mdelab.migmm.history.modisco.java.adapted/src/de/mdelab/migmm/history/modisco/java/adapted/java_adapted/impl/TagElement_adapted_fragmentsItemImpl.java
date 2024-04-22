/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.ContainmentEdgeWithHistoryImpl;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ASTNode_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TagElement_adapted_fragmentsItem;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tag Element adapted fragments Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.TagElement_adapted_fragmentsItemImpl#getFragments <em>Fragments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TagElement_adapted_fragmentsItemImpl extends ContainmentEdgeWithHistoryImpl implements TagElement_adapted_fragmentsItem {
	/**
	 * The cached value of the '{@link #getFragments() <em>Fragments</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFragments()
	 * @generated
	 * @ordered
	 */
	protected ASTNode_adapted fragments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TagElement_adapted_fragmentsItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getTagElement_adapted_fragmentsItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ASTNode_adapted getFragments() {
		if (fragments != null && fragments.eIsProxy()) {
			InternalEObject oldFragments = (InternalEObject)fragments;
			fragments = (ASTNode_adapted)eResolveProxy(oldFragments);
			if (fragments != oldFragments) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Java_adaptedPackage.TAG_ELEMENT_ADAPTED_FRAGMENTS_ITEM__FRAGMENTS, oldFragments, fragments));
			}
		}
		return fragments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASTNode_adapted basicGetFragments() {
		return fragments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFragments(ASTNode_adapted newFragments) {
		ASTNode_adapted oldFragments = fragments;
		fragments = newFragments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_adaptedPackage.TAG_ELEMENT_ADAPTED_FRAGMENTS_ITEM__FRAGMENTS, oldFragments, fragments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.TAG_ELEMENT_ADAPTED_FRAGMENTS_ITEM__FRAGMENTS:
				if (resolve) return getFragments();
				return basicGetFragments();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_adaptedPackage.TAG_ELEMENT_ADAPTED_FRAGMENTS_ITEM__FRAGMENTS:
				setFragments((ASTNode_adapted)newValue);
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
			case Java_adaptedPackage.TAG_ELEMENT_ADAPTED_FRAGMENTS_ITEM__FRAGMENTS:
				setFragments((ASTNode_adapted)null);
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
			case Java_adaptedPackage.TAG_ELEMENT_ADAPTED_FRAGMENTS_ITEM__FRAGMENTS:
				return fragments != null;
		}
		return super.eIsSet(featureID);
	}

} //TagElement_adapted_fragmentsItemImpl
