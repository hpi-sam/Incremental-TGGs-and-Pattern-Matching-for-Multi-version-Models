/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.impl.NodeWithHistoryImpl;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Model_adapted;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Model_adapted_archivesItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Model_adapted_classFilesItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Model_adapted_compilationUnitsItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Model_adapted_nameValue;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Model_adapted_orphanTypesItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Model_adapted_ownedElementsItem;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Model_adapted_unresolvedItemsItem;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model adapted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.Model_adaptedImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.Model_adaptedImpl#getOwnedElements <em>Owned Elements</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.Model_adaptedImpl#getOrphanTypes <em>Orphan Types</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.Model_adaptedImpl#getUnresolvedItems <em>Unresolved Items</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.Model_adaptedImpl#getCompilationUnits <em>Compilation Units</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.Model_adaptedImpl#getClassFiles <em>Class Files</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl.Model_adaptedImpl#getArchives <em>Archives</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Model_adaptedImpl extends NodeWithHistoryImpl implements Model_adapted {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected EList<Model_adapted_nameValue> name;

	/**
	 * The cached value of the '{@link #getOwnedElements() <em>Owned Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<Model_adapted_ownedElementsItem> ownedElements;

	/**
	 * The cached value of the '{@link #getOrphanTypes() <em>Orphan Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrphanTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Model_adapted_orphanTypesItem> orphanTypes;

	/**
	 * The cached value of the '{@link #getUnresolvedItems() <em>Unresolved Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnresolvedItems()
	 * @generated
	 * @ordered
	 */
	protected EList<Model_adapted_unresolvedItemsItem> unresolvedItems;

	/**
	 * The cached value of the '{@link #getCompilationUnits() <em>Compilation Units</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompilationUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<Model_adapted_compilationUnitsItem> compilationUnits;

	/**
	 * The cached value of the '{@link #getClassFiles() <em>Class Files</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassFiles()
	 * @generated
	 * @ordered
	 */
	protected EList<Model_adapted_classFilesItem> classFiles;

	/**
	 * The cached value of the '{@link #getArchives() <em>Archives</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchives()
	 * @generated
	 * @ordered
	 */
	protected EList<Model_adapted_archivesItem> archives;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Model_adaptedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_adaptedPackage.eINSTANCE.getModel_adapted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Model_adapted_nameValue> getName() {
		if (name == null) {
			name = new EObjectResolvingEList<Model_adapted_nameValue>(Model_adapted_nameValue.class, this, Java_adaptedPackage.MODEL_ADAPTED__NAME);
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Model_adapted_ownedElementsItem> getOwnedElements() {
		if (ownedElements == null) {
			ownedElements = new EObjectResolvingEList<Model_adapted_ownedElementsItem>(Model_adapted_ownedElementsItem.class, this, Java_adaptedPackage.MODEL_ADAPTED__OWNED_ELEMENTS);
		}
		return ownedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Model_adapted_orphanTypesItem> getOrphanTypes() {
		if (orphanTypes == null) {
			orphanTypes = new EObjectResolvingEList<Model_adapted_orphanTypesItem>(Model_adapted_orphanTypesItem.class, this, Java_adaptedPackage.MODEL_ADAPTED__ORPHAN_TYPES);
		}
		return orphanTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Model_adapted_unresolvedItemsItem> getUnresolvedItems() {
		if (unresolvedItems == null) {
			unresolvedItems = new EObjectResolvingEList<Model_adapted_unresolvedItemsItem>(Model_adapted_unresolvedItemsItem.class, this, Java_adaptedPackage.MODEL_ADAPTED__UNRESOLVED_ITEMS);
		}
		return unresolvedItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Model_adapted_compilationUnitsItem> getCompilationUnits() {
		if (compilationUnits == null) {
			compilationUnits = new EObjectResolvingEList<Model_adapted_compilationUnitsItem>(Model_adapted_compilationUnitsItem.class, this, Java_adaptedPackage.MODEL_ADAPTED__COMPILATION_UNITS);
		}
		return compilationUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Model_adapted_classFilesItem> getClassFiles() {
		if (classFiles == null) {
			classFiles = new EObjectResolvingEList<Model_adapted_classFilesItem>(Model_adapted_classFilesItem.class, this, Java_adaptedPackage.MODEL_ADAPTED__CLASS_FILES);
		}
		return classFiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Model_adapted_archivesItem> getArchives() {
		if (archives == null) {
			archives = new EObjectResolvingEList<Model_adapted_archivesItem>(Model_adapted_archivesItem.class, this, Java_adaptedPackage.MODEL_ADAPTED__ARCHIVES);
		}
		return archives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_adaptedPackage.MODEL_ADAPTED__NAME:
				return getName();
			case Java_adaptedPackage.MODEL_ADAPTED__OWNED_ELEMENTS:
				return getOwnedElements();
			case Java_adaptedPackage.MODEL_ADAPTED__ORPHAN_TYPES:
				return getOrphanTypes();
			case Java_adaptedPackage.MODEL_ADAPTED__UNRESOLVED_ITEMS:
				return getUnresolvedItems();
			case Java_adaptedPackage.MODEL_ADAPTED__COMPILATION_UNITS:
				return getCompilationUnits();
			case Java_adaptedPackage.MODEL_ADAPTED__CLASS_FILES:
				return getClassFiles();
			case Java_adaptedPackage.MODEL_ADAPTED__ARCHIVES:
				return getArchives();
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
			case Java_adaptedPackage.MODEL_ADAPTED__NAME:
				getName().clear();
				getName().addAll((Collection<? extends Model_adapted_nameValue>)newValue);
				return;
			case Java_adaptedPackage.MODEL_ADAPTED__OWNED_ELEMENTS:
				getOwnedElements().clear();
				getOwnedElements().addAll((Collection<? extends Model_adapted_ownedElementsItem>)newValue);
				return;
			case Java_adaptedPackage.MODEL_ADAPTED__ORPHAN_TYPES:
				getOrphanTypes().clear();
				getOrphanTypes().addAll((Collection<? extends Model_adapted_orphanTypesItem>)newValue);
				return;
			case Java_adaptedPackage.MODEL_ADAPTED__UNRESOLVED_ITEMS:
				getUnresolvedItems().clear();
				getUnresolvedItems().addAll((Collection<? extends Model_adapted_unresolvedItemsItem>)newValue);
				return;
			case Java_adaptedPackage.MODEL_ADAPTED__COMPILATION_UNITS:
				getCompilationUnits().clear();
				getCompilationUnits().addAll((Collection<? extends Model_adapted_compilationUnitsItem>)newValue);
				return;
			case Java_adaptedPackage.MODEL_ADAPTED__CLASS_FILES:
				getClassFiles().clear();
				getClassFiles().addAll((Collection<? extends Model_adapted_classFilesItem>)newValue);
				return;
			case Java_adaptedPackage.MODEL_ADAPTED__ARCHIVES:
				getArchives().clear();
				getArchives().addAll((Collection<? extends Model_adapted_archivesItem>)newValue);
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
			case Java_adaptedPackage.MODEL_ADAPTED__NAME:
				getName().clear();
				return;
			case Java_adaptedPackage.MODEL_ADAPTED__OWNED_ELEMENTS:
				getOwnedElements().clear();
				return;
			case Java_adaptedPackage.MODEL_ADAPTED__ORPHAN_TYPES:
				getOrphanTypes().clear();
				return;
			case Java_adaptedPackage.MODEL_ADAPTED__UNRESOLVED_ITEMS:
				getUnresolvedItems().clear();
				return;
			case Java_adaptedPackage.MODEL_ADAPTED__COMPILATION_UNITS:
				getCompilationUnits().clear();
				return;
			case Java_adaptedPackage.MODEL_ADAPTED__CLASS_FILES:
				getClassFiles().clear();
				return;
			case Java_adaptedPackage.MODEL_ADAPTED__ARCHIVES:
				getArchives().clear();
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
			case Java_adaptedPackage.MODEL_ADAPTED__NAME:
				return name != null && !name.isEmpty();
			case Java_adaptedPackage.MODEL_ADAPTED__OWNED_ELEMENTS:
				return ownedElements != null && !ownedElements.isEmpty();
			case Java_adaptedPackage.MODEL_ADAPTED__ORPHAN_TYPES:
				return orphanTypes != null && !orphanTypes.isEmpty();
			case Java_adaptedPackage.MODEL_ADAPTED__UNRESOLVED_ITEMS:
				return unresolvedItems != null && !unresolvedItems.isEmpty();
			case Java_adaptedPackage.MODEL_ADAPTED__COMPILATION_UNITS:
				return compilationUnits != null && !compilationUnits.isEmpty();
			case Java_adaptedPackage.MODEL_ADAPTED__CLASS_FILES:
				return classFiles != null && !classFiles.isEmpty();
			case Java_adaptedPackage.MODEL_ADAPTED__ARCHIVES:
				return archives != null && !archives.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Model_adaptedImpl
