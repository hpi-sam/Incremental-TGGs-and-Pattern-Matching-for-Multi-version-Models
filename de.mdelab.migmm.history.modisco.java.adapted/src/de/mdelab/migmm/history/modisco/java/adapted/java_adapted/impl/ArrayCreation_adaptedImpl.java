/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ArrayCreation_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ArrayCreation_adapted_dimensionsItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ArrayCreation_adapted_initializerItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ArrayCreation_adapted_typeItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Creation adapted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.ArrayCreation_adaptedImpl#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.ArrayCreation_adaptedImpl#getInitializer <em>Initializer</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.ArrayCreation_adaptedImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrayCreation_adaptedImpl extends Expression_adaptedImpl implements ArrayCreation_adapted {
	/**
	 * The cached value of the '{@link #getDimensions() <em>Dimensions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensions()
	 * @generated
	 * @ordered
	 */
	protected EList<ArrayCreation_adapted_dimensionsItem> dimensions;

	/**
	 * The cached value of the '{@link #getInitializer() <em>Initializer</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitializer()
	 * @generated
	 * @ordered
	 */
	protected EList<ArrayCreation_adapted_initializerItem> initializer;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EList<ArrayCreation_adapted_typeItem> type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayCreation_adaptedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getArrayCreation_adapted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArrayCreation_adapted_dimensionsItem> getDimensions() {
		if (dimensions == null) {
			dimensions = new EObjectResolvingEList<ArrayCreation_adapted_dimensionsItem>(ArrayCreation_adapted_dimensionsItem.class, this, Java_adaptedPackage.ARRAY_CREATION_ADAPTED__DIMENSIONS);
		}
		return dimensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArrayCreation_adapted_initializerItem> getInitializer() {
		if (initializer == null) {
			initializer = new EObjectResolvingEList<ArrayCreation_adapted_initializerItem>(ArrayCreation_adapted_initializerItem.class, this, Java_adaptedPackage.ARRAY_CREATION_ADAPTED__INITIALIZER);
		}
		return initializer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArrayCreation_adapted_typeItem> getType() {
		if (type == null) {
			type = new EObjectResolvingEList<ArrayCreation_adapted_typeItem>(ArrayCreation_adapted_typeItem.class, this, Java_adaptedPackage.ARRAY_CREATION_ADAPTED__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.ARRAY_CREATION_ADAPTED__DIMENSIONS:
				return getDimensions();
			case Java_adaptedPackage.ARRAY_CREATION_ADAPTED__INITIALIZER:
				return getInitializer();
			case Java_adaptedPackage.ARRAY_CREATION_ADAPTED__TYPE:
				return getType();
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
			case Java_adaptedPackage.ARRAY_CREATION_ADAPTED__DIMENSIONS:
				getDimensions().clear();
				getDimensions().addAll((Collection<? extends ArrayCreation_adapted_dimensionsItem>)newValue);
				return;
			case Java_adaptedPackage.ARRAY_CREATION_ADAPTED__INITIALIZER:
				getInitializer().clear();
				getInitializer().addAll((Collection<? extends ArrayCreation_adapted_initializerItem>)newValue);
				return;
			case Java_adaptedPackage.ARRAY_CREATION_ADAPTED__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends ArrayCreation_adapted_typeItem>)newValue);
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
			case Java_adaptedPackage.ARRAY_CREATION_ADAPTED__DIMENSIONS:
				getDimensions().clear();
				return;
			case Java_adaptedPackage.ARRAY_CREATION_ADAPTED__INITIALIZER:
				getInitializer().clear();
				return;
			case Java_adaptedPackage.ARRAY_CREATION_ADAPTED__TYPE:
				getType().clear();
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
			case Java_adaptedPackage.ARRAY_CREATION_ADAPTED__DIMENSIONS:
				return dimensions != null && !dimensions.isEmpty();
			case Java_adaptedPackage.ARRAY_CREATION_ADAPTED__INITIALIZER:
				return initializer != null && !initializer.isEmpty();
			case Java_adaptedPackage.ARRAY_CREATION_ADAPTED__TYPE:
				return type != null && !type.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArrayCreation_adaptedImpl
