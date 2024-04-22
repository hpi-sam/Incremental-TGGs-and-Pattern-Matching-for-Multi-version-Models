/**
 */
package mapping.impl;

import java.util.Collection;

import mapping.Mapping;
import mapping.MappingPackage;
import mapping.MappingRoot;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mapping.impl.MappingRootImpl#getMappings <em>Mappings</em>}</li>
 *   <li>{@link mapping.impl.MappingRootImpl#getPkg <em>Pkg</em>}</li>
 *   <li>{@link mapping.impl.MappingRootImpl#getAxiomClass <em>Axiom Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MappingRootImpl extends MinimalEObjectImpl.Container implements MappingRoot {
	/**
	 * The cached value of the '{@link #getMappings() <em>Mappings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<Mapping> mappings;

	/**
	 * The cached value of the '{@link #getPkg() <em>Pkg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPkg()
	 * @generated
	 * @ordered
	 */
	protected EPackage pkg;

	/**
	 * The cached value of the '{@link #getAxiomClass() <em>Axiom Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxiomClass()
	 * @generated
	 * @ordered
	 */
	protected EClass axiomClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MappingPackage.Literals.MAPPING_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Mapping> getMappings() {
		if (mappings == null) {
			mappings = new EObjectContainmentEList<Mapping>(Mapping.class, this, MappingPackage.MAPPING_ROOT__MAPPINGS);
		}
		return mappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EPackage getPkg() {
		if (pkg != null && pkg.eIsProxy()) {
			InternalEObject oldPkg = (InternalEObject)pkg;
			pkg = (EPackage)eResolveProxy(oldPkg);
			if (pkg != oldPkg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MappingPackage.MAPPING_ROOT__PKG, oldPkg, pkg));
			}
		}
		return pkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPackage basicGetPkg() {
		return pkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPkg(EPackage newPkg) {
		EPackage oldPkg = pkg;
		pkg = newPkg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.MAPPING_ROOT__PKG, oldPkg, pkg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAxiomClass() {
		if (axiomClass != null && axiomClass.eIsProxy()) {
			InternalEObject oldAxiomClass = (InternalEObject)axiomClass;
			axiomClass = (EClass)eResolveProxy(oldAxiomClass);
			if (axiomClass != oldAxiomClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MappingPackage.MAPPING_ROOT__AXIOM_CLASS, oldAxiomClass, axiomClass));
			}
		}
		return axiomClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetAxiomClass() {
		return axiomClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAxiomClass(EClass newAxiomClass) {
		EClass oldAxiomClass = axiomClass;
		axiomClass = newAxiomClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.MAPPING_ROOT__AXIOM_CLASS, oldAxiomClass, axiomClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MappingPackage.MAPPING_ROOT__MAPPINGS:
				return ((InternalEList<?>)getMappings()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MappingPackage.MAPPING_ROOT__MAPPINGS:
				return getMappings();
			case MappingPackage.MAPPING_ROOT__PKG:
				if (resolve) return getPkg();
				return basicGetPkg();
			case MappingPackage.MAPPING_ROOT__AXIOM_CLASS:
				if (resolve) return getAxiomClass();
				return basicGetAxiomClass();
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
			case MappingPackage.MAPPING_ROOT__MAPPINGS:
				getMappings().clear();
				getMappings().addAll((Collection<? extends Mapping>)newValue);
				return;
			case MappingPackage.MAPPING_ROOT__PKG:
				setPkg((EPackage)newValue);
				return;
			case MappingPackage.MAPPING_ROOT__AXIOM_CLASS:
				setAxiomClass((EClass)newValue);
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
			case MappingPackage.MAPPING_ROOT__MAPPINGS:
				getMappings().clear();
				return;
			case MappingPackage.MAPPING_ROOT__PKG:
				setPkg((EPackage)null);
				return;
			case MappingPackage.MAPPING_ROOT__AXIOM_CLASS:
				setAxiomClass((EClass)null);
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
			case MappingPackage.MAPPING_ROOT__MAPPINGS:
				return mappings != null && !mappings.isEmpty();
			case MappingPackage.MAPPING_ROOT__PKG:
				return pkg != null;
			case MappingPackage.MAPPING_ROOT__AXIOM_CLASS:
				return axiomClass != null;
		}
		return super.eIsSet(featureID);
	}

} //MappingRootImpl
