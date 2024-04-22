/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Annotation_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Annotation_adapted_typeItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Annotation_adapted_valuesItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation adapted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.Annotation_adaptedImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.Annotation_adaptedImpl#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Annotation_adaptedImpl extends Expression_adaptedImpl implements Annotation_adapted {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation_adapted_typeItem> type;

	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation_adapted_valuesItem> values;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Annotation_adaptedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getAnnotation_adapted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation_adapted_typeItem> getType() {
		if (type == null) {
			type = new EObjectResolvingEList<Annotation_adapted_typeItem>(Annotation_adapted_typeItem.class, this, Java_adaptedPackage.ANNOTATION_ADAPTED__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation_adapted_valuesItem> getValues() {
		if (values == null) {
			values = new EObjectResolvingEList<Annotation_adapted_valuesItem>(Annotation_adapted_valuesItem.class, this, Java_adaptedPackage.ANNOTATION_ADAPTED__VALUES);
		}
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.ANNOTATION_ADAPTED__TYPE:
				return getType();
			case Java_adaptedPackage.ANNOTATION_ADAPTED__VALUES:
				return getValues();
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
			case Java_adaptedPackage.ANNOTATION_ADAPTED__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends Annotation_adapted_typeItem>)newValue);
				return;
			case Java_adaptedPackage.ANNOTATION_ADAPTED__VALUES:
				getValues().clear();
				getValues().addAll((Collection<? extends Annotation_adapted_valuesItem>)newValue);
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
			case Java_adaptedPackage.ANNOTATION_ADAPTED__TYPE:
				getType().clear();
				return;
			case Java_adaptedPackage.ANNOTATION_ADAPTED__VALUES:
				getValues().clear();
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
			case Java_adaptedPackage.ANNOTATION_ADAPTED__TYPE:
				return type != null && !type.isEmpty();
			case Java_adaptedPackage.ANNOTATION_ADAPTED__VALUES:
				return values != null && !values.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Annotation_adaptedImpl
