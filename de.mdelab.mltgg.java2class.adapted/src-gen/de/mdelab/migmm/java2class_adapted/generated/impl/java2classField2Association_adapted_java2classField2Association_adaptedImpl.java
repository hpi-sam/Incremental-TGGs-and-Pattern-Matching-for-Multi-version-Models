/**
 */
package de.mdelab.migmm.java2class_adapted.generated.impl;

import de.mdelab.migmm.java2class_adapted.generated.GeneratedPackage;
import de.mdelab.migmm.java2class_adapted.generated.java2classField2Association_adapted_java2classField2Association_adapted;

import de.mdelab.mlsdm.Activity;

import de.mdelab.mltgg.mote2.TGGNode;

import de.mdelab.mltgg.mote2.impl.TransformationException;

import de.mdelab.mltgg.mote2.operationalTGG.ErrorCodeEnum;

import de.mdelab.mltgg.mote2.operationalTGG.impl.OperationalRuleImpl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>java2class Field2 Association adapted java2class Field2 Association adapted</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.java2class_adapted.generated.impl.java2classField2Association_adapted_java2classField2Association_adaptedImpl#getAddElementActivity <em>Add Element Activity</em>}</li>
 *   <li>{@link de.mdelab.migmm.java2class_adapted.generated.impl.java2classField2Association_adapted_java2classField2Association_adaptedImpl#getMoveElementActivity <em>Move Element Activity</em>}</li>
 *   <li>{@link de.mdelab.migmm.java2class_adapted.generated.impl.java2classField2Association_adapted_java2classField2Association_adaptedImpl#getChangeAttributeActivity <em>Change Attribute Activity</em>}</li>
 *   <li>{@link de.mdelab.migmm.java2class_adapted.generated.impl.java2classField2Association_adapted_java2classField2Association_adaptedImpl#getTransformForwardActivity <em>Transform Forward Activity</em>}</li>
 *   <li>{@link de.mdelab.migmm.java2class_adapted.generated.impl.java2classField2Association_adapted_java2classField2Association_adaptedImpl#getTransformMappingActivity <em>Transform Mapping Activity</em>}</li>
 *   <li>{@link de.mdelab.migmm.java2class_adapted.generated.impl.java2classField2Association_adapted_java2classField2Association_adaptedImpl#getTransformBackwardActivity <em>Transform Backward Activity</em>}</li>
 *   <li>{@link de.mdelab.migmm.java2class_adapted.generated.impl.java2classField2Association_adapted_java2classField2Association_adaptedImpl#getConflictCheckForwardActivity <em>Conflict Check Forward Activity</em>}</li>
 *   <li>{@link de.mdelab.migmm.java2class_adapted.generated.impl.java2classField2Association_adapted_java2classField2Association_adaptedImpl#getConflictCheckMappingActivity <em>Conflict Check Mapping Activity</em>}</li>
 *   <li>{@link de.mdelab.migmm.java2class_adapted.generated.impl.java2classField2Association_adapted_java2classField2Association_adaptedImpl#getConflictCheckBackwardActivity <em>Conflict Check Backward Activity</em>}</li>
 *   <li>{@link de.mdelab.migmm.java2class_adapted.generated.impl.java2classField2Association_adapted_java2classField2Association_adaptedImpl#getSynchronizeForwardActivity <em>Synchronize Forward Activity</em>}</li>
 *   <li>{@link de.mdelab.migmm.java2class_adapted.generated.impl.java2classField2Association_adapted_java2classField2Association_adaptedImpl#getSynchronizeBackwardActivity <em>Synchronize Backward Activity</em>}</li>
 *   <li>{@link de.mdelab.migmm.java2class_adapted.generated.impl.java2classField2Association_adapted_java2classField2Association_adaptedImpl#getRepairForwardActivity <em>Repair Forward Activity</em>}</li>
 *   <li>{@link de.mdelab.migmm.java2class_adapted.generated.impl.java2classField2Association_adapted_java2classField2Association_adaptedImpl#getRepairBackwardActivity <em>Repair Backward Activity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class java2classField2Association_adapted_java2classField2Association_adaptedImpl extends OperationalRuleImpl
		implements java2classField2Association_adapted_java2classField2Association_adapted {
	/**
	 * The cached value of the '{@link #getAddElementActivity() <em>Add Element Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddElementActivity()
	 * @generated
	 * @ordered
	 */
	protected Activity addElementActivity;

	/**
	 * The cached value of the '{@link #getMoveElementActivity() <em>Move Element Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoveElementActivity()
	 * @generated
	 * @ordered
	 */
	protected Activity moveElementActivity;

	/**
	 * The cached value of the '{@link #getChangeAttributeActivity() <em>Change Attribute Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeAttributeActivity()
	 * @generated
	 * @ordered
	 */
	protected Activity changeAttributeActivity;

	/**
	 * The cached value of the '{@link #getTransformForwardActivity() <em>Transform Forward Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformForwardActivity()
	 * @generated
	 * @ordered
	 */
	protected Activity transformForwardActivity;

	/**
	 * The cached value of the '{@link #getTransformMappingActivity() <em>Transform Mapping Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformMappingActivity()
	 * @generated
	 * @ordered
	 */
	protected Activity transformMappingActivity;

	/**
	 * The cached value of the '{@link #getTransformBackwardActivity() <em>Transform Backward Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformBackwardActivity()
	 * @generated
	 * @ordered
	 */
	protected Activity transformBackwardActivity;

	/**
	 * The cached value of the '{@link #getConflictCheckForwardActivity() <em>Conflict Check Forward Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConflictCheckForwardActivity()
	 * @generated
	 * @ordered
	 */
	protected Activity conflictCheckForwardActivity;

	/**
	 * The cached value of the '{@link #getConflictCheckMappingActivity() <em>Conflict Check Mapping Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConflictCheckMappingActivity()
	 * @generated
	 * @ordered
	 */
	protected Activity conflictCheckMappingActivity;

	/**
	 * The cached value of the '{@link #getConflictCheckBackwardActivity() <em>Conflict Check Backward Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConflictCheckBackwardActivity()
	 * @generated
	 * @ordered
	 */
	protected Activity conflictCheckBackwardActivity;

	/**
	 * The cached value of the '{@link #getSynchronizeForwardActivity() <em>Synchronize Forward Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynchronizeForwardActivity()
	 * @generated
	 * @ordered
	 */
	protected Activity synchronizeForwardActivity;

	/**
	 * The cached value of the '{@link #getSynchronizeBackwardActivity() <em>Synchronize Backward Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynchronizeBackwardActivity()
	 * @generated
	 * @ordered
	 */
	protected Activity synchronizeBackwardActivity;

	/**
	 * The cached value of the '{@link #getRepairForwardActivity() <em>Repair Forward Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepairForwardActivity()
	 * @generated
	 * @ordered
	 */
	protected Activity repairForwardActivity;

	/**
	 * The cached value of the '{@link #getRepairBackwardActivity() <em>Repair Backward Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepairBackwardActivity()
	 * @generated
	 * @ordered
	 */
	protected Activity repairBackwardActivity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected java2classField2Association_adapted_java2classField2Association_adaptedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratedPackage.Literals.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getAddElementActivity() {
		if (addElementActivity != null && addElementActivity.eIsProxy()) {
			InternalEObject oldAddElementActivity = (InternalEObject) addElementActivity;
			addElementActivity = (Activity) eResolveProxy(oldAddElementActivity);
			if (addElementActivity != oldAddElementActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__ADD_ELEMENT_ACTIVITY,
							oldAddElementActivity, addElementActivity));
			}
		}
		return addElementActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetAddElementActivity() {
		return addElementActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddElementActivity(Activity newAddElementActivity) {
		Activity oldAddElementActivity = addElementActivity;
		addElementActivity = newAddElementActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__ADD_ELEMENT_ACTIVITY,
					oldAddElementActivity, addElementActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getMoveElementActivity() {
		if (moveElementActivity != null && moveElementActivity.eIsProxy()) {
			InternalEObject oldMoveElementActivity = (InternalEObject) moveElementActivity;
			moveElementActivity = (Activity) eResolveProxy(oldMoveElementActivity);
			if (moveElementActivity != oldMoveElementActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__MOVE_ELEMENT_ACTIVITY,
							oldMoveElementActivity, moveElementActivity));
			}
		}
		return moveElementActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetMoveElementActivity() {
		return moveElementActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoveElementActivity(Activity newMoveElementActivity) {
		Activity oldMoveElementActivity = moveElementActivity;
		moveElementActivity = newMoveElementActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__MOVE_ELEMENT_ACTIVITY,
					oldMoveElementActivity, moveElementActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getChangeAttributeActivity() {
		if (changeAttributeActivity != null && changeAttributeActivity.eIsProxy()) {
			InternalEObject oldChangeAttributeActivity = (InternalEObject) changeAttributeActivity;
			changeAttributeActivity = (Activity) eResolveProxy(oldChangeAttributeActivity);
			if (changeAttributeActivity != oldChangeAttributeActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__CHANGE_ATTRIBUTE_ACTIVITY,
							oldChangeAttributeActivity, changeAttributeActivity));
			}
		}
		return changeAttributeActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetChangeAttributeActivity() {
		return changeAttributeActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeAttributeActivity(Activity newChangeAttributeActivity) {
		Activity oldChangeAttributeActivity = changeAttributeActivity;
		changeAttributeActivity = newChangeAttributeActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__CHANGE_ATTRIBUTE_ACTIVITY,
					oldChangeAttributeActivity, changeAttributeActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getTransformForwardActivity() {
		if (transformForwardActivity != null && transformForwardActivity.eIsProxy()) {
			InternalEObject oldTransformForwardActivity = (InternalEObject) transformForwardActivity;
			transformForwardActivity = (Activity) eResolveProxy(oldTransformForwardActivity);
			if (transformForwardActivity != oldTransformForwardActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__TRANSFORM_FORWARD_ACTIVITY,
							oldTransformForwardActivity, transformForwardActivity));
			}
		}
		return transformForwardActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetTransformForwardActivity() {
		return transformForwardActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformForwardActivity(Activity newTransformForwardActivity) {
		Activity oldTransformForwardActivity = transformForwardActivity;
		transformForwardActivity = newTransformForwardActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__TRANSFORM_FORWARD_ACTIVITY,
					oldTransformForwardActivity, transformForwardActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getTransformMappingActivity() {
		if (transformMappingActivity != null && transformMappingActivity.eIsProxy()) {
			InternalEObject oldTransformMappingActivity = (InternalEObject) transformMappingActivity;
			transformMappingActivity = (Activity) eResolveProxy(oldTransformMappingActivity);
			if (transformMappingActivity != oldTransformMappingActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__TRANSFORM_MAPPING_ACTIVITY,
							oldTransformMappingActivity, transformMappingActivity));
			}
		}
		return transformMappingActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetTransformMappingActivity() {
		return transformMappingActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformMappingActivity(Activity newTransformMappingActivity) {
		Activity oldTransformMappingActivity = transformMappingActivity;
		transformMappingActivity = newTransformMappingActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__TRANSFORM_MAPPING_ACTIVITY,
					oldTransformMappingActivity, transformMappingActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getTransformBackwardActivity() {
		if (transformBackwardActivity != null && transformBackwardActivity.eIsProxy()) {
			InternalEObject oldTransformBackwardActivity = (InternalEObject) transformBackwardActivity;
			transformBackwardActivity = (Activity) eResolveProxy(oldTransformBackwardActivity);
			if (transformBackwardActivity != oldTransformBackwardActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__TRANSFORM_BACKWARD_ACTIVITY,
							oldTransformBackwardActivity, transformBackwardActivity));
			}
		}
		return transformBackwardActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetTransformBackwardActivity() {
		return transformBackwardActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformBackwardActivity(Activity newTransformBackwardActivity) {
		Activity oldTransformBackwardActivity = transformBackwardActivity;
		transformBackwardActivity = newTransformBackwardActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__TRANSFORM_BACKWARD_ACTIVITY,
					oldTransformBackwardActivity, transformBackwardActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getConflictCheckForwardActivity() {
		if (conflictCheckForwardActivity != null && conflictCheckForwardActivity.eIsProxy()) {
			InternalEObject oldConflictCheckForwardActivity = (InternalEObject) conflictCheckForwardActivity;
			conflictCheckForwardActivity = (Activity) eResolveProxy(oldConflictCheckForwardActivity);
			if (conflictCheckForwardActivity != oldConflictCheckForwardActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__CONFLICT_CHECK_FORWARD_ACTIVITY,
							oldConflictCheckForwardActivity, conflictCheckForwardActivity));
			}
		}
		return conflictCheckForwardActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetConflictCheckForwardActivity() {
		return conflictCheckForwardActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConflictCheckForwardActivity(Activity newConflictCheckForwardActivity) {
		Activity oldConflictCheckForwardActivity = conflictCheckForwardActivity;
		conflictCheckForwardActivity = newConflictCheckForwardActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__CONFLICT_CHECK_FORWARD_ACTIVITY,
					oldConflictCheckForwardActivity, conflictCheckForwardActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getConflictCheckMappingActivity() {
		if (conflictCheckMappingActivity != null && conflictCheckMappingActivity.eIsProxy()) {
			InternalEObject oldConflictCheckMappingActivity = (InternalEObject) conflictCheckMappingActivity;
			conflictCheckMappingActivity = (Activity) eResolveProxy(oldConflictCheckMappingActivity);
			if (conflictCheckMappingActivity != oldConflictCheckMappingActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__CONFLICT_CHECK_MAPPING_ACTIVITY,
							oldConflictCheckMappingActivity, conflictCheckMappingActivity));
			}
		}
		return conflictCheckMappingActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetConflictCheckMappingActivity() {
		return conflictCheckMappingActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConflictCheckMappingActivity(Activity newConflictCheckMappingActivity) {
		Activity oldConflictCheckMappingActivity = conflictCheckMappingActivity;
		conflictCheckMappingActivity = newConflictCheckMappingActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__CONFLICT_CHECK_MAPPING_ACTIVITY,
					oldConflictCheckMappingActivity, conflictCheckMappingActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getConflictCheckBackwardActivity() {
		if (conflictCheckBackwardActivity != null && conflictCheckBackwardActivity.eIsProxy()) {
			InternalEObject oldConflictCheckBackwardActivity = (InternalEObject) conflictCheckBackwardActivity;
			conflictCheckBackwardActivity = (Activity) eResolveProxy(oldConflictCheckBackwardActivity);
			if (conflictCheckBackwardActivity != oldConflictCheckBackwardActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__CONFLICT_CHECK_BACKWARD_ACTIVITY,
							oldConflictCheckBackwardActivity, conflictCheckBackwardActivity));
			}
		}
		return conflictCheckBackwardActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetConflictCheckBackwardActivity() {
		return conflictCheckBackwardActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConflictCheckBackwardActivity(Activity newConflictCheckBackwardActivity) {
		Activity oldConflictCheckBackwardActivity = conflictCheckBackwardActivity;
		conflictCheckBackwardActivity = newConflictCheckBackwardActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__CONFLICT_CHECK_BACKWARD_ACTIVITY,
					oldConflictCheckBackwardActivity, conflictCheckBackwardActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getSynchronizeForwardActivity() {
		if (synchronizeForwardActivity != null && synchronizeForwardActivity.eIsProxy()) {
			InternalEObject oldSynchronizeForwardActivity = (InternalEObject) synchronizeForwardActivity;
			synchronizeForwardActivity = (Activity) eResolveProxy(oldSynchronizeForwardActivity);
			if (synchronizeForwardActivity != oldSynchronizeForwardActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__SYNCHRONIZE_FORWARD_ACTIVITY,
							oldSynchronizeForwardActivity, synchronizeForwardActivity));
			}
		}
		return synchronizeForwardActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetSynchronizeForwardActivity() {
		return synchronizeForwardActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSynchronizeForwardActivity(Activity newSynchronizeForwardActivity) {
		Activity oldSynchronizeForwardActivity = synchronizeForwardActivity;
		synchronizeForwardActivity = newSynchronizeForwardActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__SYNCHRONIZE_FORWARD_ACTIVITY,
					oldSynchronizeForwardActivity, synchronizeForwardActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getSynchronizeBackwardActivity() {
		if (synchronizeBackwardActivity != null && synchronizeBackwardActivity.eIsProxy()) {
			InternalEObject oldSynchronizeBackwardActivity = (InternalEObject) synchronizeBackwardActivity;
			synchronizeBackwardActivity = (Activity) eResolveProxy(oldSynchronizeBackwardActivity);
			if (synchronizeBackwardActivity != oldSynchronizeBackwardActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__SYNCHRONIZE_BACKWARD_ACTIVITY,
							oldSynchronizeBackwardActivity, synchronizeBackwardActivity));
			}
		}
		return synchronizeBackwardActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetSynchronizeBackwardActivity() {
		return synchronizeBackwardActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSynchronizeBackwardActivity(Activity newSynchronizeBackwardActivity) {
		Activity oldSynchronizeBackwardActivity = synchronizeBackwardActivity;
		synchronizeBackwardActivity = newSynchronizeBackwardActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__SYNCHRONIZE_BACKWARD_ACTIVITY,
					oldSynchronizeBackwardActivity, synchronizeBackwardActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getRepairForwardActivity() {
		if (repairForwardActivity != null && repairForwardActivity.eIsProxy()) {
			InternalEObject oldRepairForwardActivity = (InternalEObject) repairForwardActivity;
			repairForwardActivity = (Activity) eResolveProxy(oldRepairForwardActivity);
			if (repairForwardActivity != oldRepairForwardActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__REPAIR_FORWARD_ACTIVITY,
							oldRepairForwardActivity, repairForwardActivity));
			}
		}
		return repairForwardActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetRepairForwardActivity() {
		return repairForwardActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepairForwardActivity(Activity newRepairForwardActivity) {
		Activity oldRepairForwardActivity = repairForwardActivity;
		repairForwardActivity = newRepairForwardActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__REPAIR_FORWARD_ACTIVITY,
					oldRepairForwardActivity, repairForwardActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getRepairBackwardActivity() {
		if (repairBackwardActivity != null && repairBackwardActivity.eIsProxy()) {
			InternalEObject oldRepairBackwardActivity = (InternalEObject) repairBackwardActivity;
			repairBackwardActivity = (Activity) eResolveProxy(oldRepairBackwardActivity);
			if (repairBackwardActivity != oldRepairBackwardActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__REPAIR_BACKWARD_ACTIVITY,
							oldRepairBackwardActivity, repairBackwardActivity));
			}
		}
		return repairBackwardActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetRepairBackwardActivity() {
		return repairBackwardActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepairBackwardActivity(Activity newRepairBackwardActivity) {
		Activity oldRepairBackwardActivity = repairBackwardActivity;
		repairBackwardActivity = newRepairBackwardActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__REPAIR_BACKWARD_ACTIVITY,
					oldRepairBackwardActivity, repairBackwardActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TGGNode addElement(final EMap<String, Object> parameters) throws TransformationException {
		final EMap<String, Object> parametersCopy = new org.eclipse.emf.common.util.BasicEMap<String, Object>(
				parameters.map());

		((de.mdelab.migmm.java2class_adapted.generated.java2class_adaptedOperationalTGG) this.getOperationalRuleGroup()
				.getOperationalTGG()).executeActivity(this.getAddElementActivity(), parametersCopy);

		return (TGGNode) parametersCopy.get("corrAssociation_adapted");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean changeAttributeValues(final TGGNode correspondenceNode, final EMap<String, Object> ruleParameters)
			throws TransformationException {
		org.eclipse.emf.common.util.EMap<String, Object> params = new org.eclipse.emf.common.util.BasicEMap<String, Object>(
				ruleParameters.map());

		params.put("corrAssociation_adapted", correspondenceNode);

		((de.mdelab.migmm.java2class_adapted.generated.java2class_adaptedOperationalTGG) this.getOperationalRuleGroup()
				.getOperationalTGG()).executeActivity(this.getChangeAttributeActivity(), params);

		return (Boolean) params.get("__returnValue");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean moveElement(final TGGNode correspondenceNode, final TGGNode oldPreviousCorrespondenceNode,
			final TGGNode newPreviousCorrespondenceNode) throws TransformationException {
		org.eclipse.emf.common.util.EMap<String, Object> params = new org.eclipse.emf.common.util.BasicEMap<String, Object>();

		params.put("corrAssociation_adapted", correspondenceNode);
		params.put("__oldPreviousCorrespondenceNode", oldPreviousCorrespondenceNode);
		params.put("__newPreviousCorrespondenceNode", newPreviousCorrespondenceNode);

		((de.mdelab.migmm.java2class_adapted.generated.java2class_adaptedOperationalTGG) this.getOperationalRuleGroup()
				.getOperationalTGG()).executeActivity(this.getMoveElementActivity(), params);

		return (Boolean) params.get("__returnValue");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorCodeEnum transformForward(final TGGNode inputTggNode, final boolean checkAttributeFormulae,
			final boolean considerAllLhsCorrNodes) throws TransformationException {

		final org.eclipse.emf.common.util.EMap<String, Object> parameters = new org.eclipse.emf.common.util.BasicEMap<String, Object>();

		parameters.put("__thisRule", this);
		parameters.put("__checkAttributeFormulae", checkAttributeFormulae);
		parameters.put("__considerAllLhsCorrNodes", considerAllLhsCorrNodes);
		parameters.put("__inputTggNode", inputTggNode);

		((de.mdelab.migmm.java2class_adapted.generated.java2class_adaptedOperationalTGG) this.getOperationalRuleGroup()
				.getOperationalTGG()).executeActivity(this.getTransformForwardActivity(), parameters);

		final ErrorCodeEnum errorCode = (ErrorCodeEnum) parameters.get("__errorCode");

		return errorCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorCodeEnum transformMapping(final TGGNode inputTggNode, final boolean checkAttributeFormulae,
			final boolean considerAllLhsCorrNodes) throws TransformationException {

		final org.eclipse.emf.common.util.EMap<String, Object> parameters = new org.eclipse.emf.common.util.BasicEMap<String, Object>();

		parameters.put("__thisRule", this);
		parameters.put("__checkAttributeFormulae", checkAttributeFormulae);
		parameters.put("__considerAllLhsCorrNodes", considerAllLhsCorrNodes);
		parameters.put("__inputTggNode", inputTggNode);

		((de.mdelab.migmm.java2class_adapted.generated.java2class_adaptedOperationalTGG) this.getOperationalRuleGroup()
				.getOperationalTGG()).executeActivity(this.getTransformMappingActivity(), parameters);

		final ErrorCodeEnum errorCode = (ErrorCodeEnum) parameters.get("__errorCode");

		return errorCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorCodeEnum transformBackward(final TGGNode inputTggNode, final boolean checkAttributeFormulae,
			final boolean considerAllLhsCorrNodes) throws TransformationException {

		final org.eclipse.emf.common.util.EMap<String, Object> parameters = new org.eclipse.emf.common.util.BasicEMap<String, Object>();

		parameters.put("__thisRule", this);
		parameters.put("__checkAttributeFormulae", checkAttributeFormulae);
		parameters.put("__considerAllLhsCorrNodes", considerAllLhsCorrNodes);
		parameters.put("__inputTggNode", inputTggNode);

		((de.mdelab.migmm.java2class_adapted.generated.java2class_adaptedOperationalTGG) this.getOperationalRuleGroup()
				.getOperationalTGG()).executeActivity(this.getTransformBackwardActivity(), parameters);

		final ErrorCodeEnum errorCode = (ErrorCodeEnum) parameters.get("__errorCode");

		return errorCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> conflictCheckForward(final TGGNode inputTggNode) throws TransformationException {

		final org.eclipse.emf.common.util.EMap<String, Object> parameters = new org.eclipse.emf.common.util.BasicEMap<String, Object>();

		parameters.put("__thisRule", this);
		parameters.put("__inputTggNode", inputTggNode);

		((de.mdelab.migmm.java2class_adapted.generated.java2class_adaptedOperationalTGG) this.getOperationalRuleGroup()
				.getOperationalTGG()).executeActivity(this.getConflictCheckForwardActivity(), parameters);

		@SuppressWarnings("unchecked")
		final java.util.Collection<? extends EObject> returnValue = (java.util.Collection<? extends EObject>) parameters
				.get("__returnValue");

		if (returnValue == null) {
			return null;
		} else {
			return new org.eclipse.emf.common.util.BasicEList<EObject>(returnValue);
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> conflictCheckMapping(final TGGNode inputTggNode) throws TransformationException {

		final org.eclipse.emf.common.util.EMap<String, Object> parameters = new org.eclipse.emf.common.util.BasicEMap<String, Object>();

		parameters.put("__thisRule", this);
		parameters.put("__inputTggNode", inputTggNode);

		((de.mdelab.migmm.java2class_adapted.generated.java2class_adaptedOperationalTGG) this.getOperationalRuleGroup()
				.getOperationalTGG()).executeActivity(this.getConflictCheckMappingActivity(), parameters);

		@SuppressWarnings("unchecked")
		final java.util.Collection<? extends EObject> returnValue = (java.util.Collection<? extends EObject>) parameters
				.get("__returnValue");

		if (returnValue == null) {
			return null;
		} else {
			return new org.eclipse.emf.common.util.BasicEList<EObject>(returnValue);
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> conflictCheckBackward(final TGGNode inputTggNode) throws TransformationException {

		final org.eclipse.emf.common.util.EMap<String, Object> parameters = new org.eclipse.emf.common.util.BasicEMap<String, Object>();

		parameters.put("__thisRule", this);
		parameters.put("__inputTggNode", inputTggNode);

		((de.mdelab.migmm.java2class_adapted.generated.java2class_adaptedOperationalTGG) this.getOperationalRuleGroup()
				.getOperationalTGG()).executeActivity(this.getConflictCheckBackwardActivity(), parameters);

		@SuppressWarnings("unchecked")
		final java.util.Collection<? extends EObject> returnValue = (java.util.Collection<? extends EObject>) parameters
				.get("__returnValue");

		if (returnValue == null) {
			return null;
		} else {
			return new org.eclipse.emf.common.util.BasicEList<EObject>(returnValue);
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorCodeEnum synchronizeForward(final TGGNode inputTggNode, final boolean checkAttributeFormulae)
			throws TransformationException {

		final org.eclipse.emf.common.util.EMap<String, Object> parameters = new org.eclipse.emf.common.util.BasicEMap<String, Object>();

		parameters.put("__thisRule", this);
		parameters.put("__checkAttributeFormulae", checkAttributeFormulae);
		parameters.put("__inputTggNode", inputTggNode);

		((de.mdelab.migmm.java2class_adapted.generated.java2class_adaptedOperationalTGG) this.getOperationalRuleGroup()
				.getOperationalTGG()).executeActivity(this.getSynchronizeForwardActivity(), parameters);

		final ErrorCodeEnum errorCode = (ErrorCodeEnum) parameters.get("__errorCode");

		return errorCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorCodeEnum synchronizeBackward(final TGGNode inputTggNode, final boolean checkAttributeFormulae)
			throws TransformationException {

		final org.eclipse.emf.common.util.EMap<String, Object> parameters = new org.eclipse.emf.common.util.BasicEMap<String, Object>();

		parameters.put("__thisRule", this);
		parameters.put("__checkAttributeFormulae", checkAttributeFormulae);
		parameters.put("__inputTggNode", inputTggNode);

		((de.mdelab.migmm.java2class_adapted.generated.java2class_adaptedOperationalTGG) this.getOperationalRuleGroup()
				.getOperationalTGG()).executeActivity(this.getSynchronizeBackwardActivity(), parameters);

		final ErrorCodeEnum errorCode = (ErrorCodeEnum) parameters.get("__errorCode");

		return errorCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorCodeEnum repairForward(final TGGNode inputTggNode, final boolean checkAttributeFormulae)
			throws TransformationException {

		final org.eclipse.emf.common.util.EMap<String, Object> parameters = new org.eclipse.emf.common.util.BasicEMap<String, Object>();

		parameters.put("__thisRule", this);
		parameters.put("__checkAttributeFormulae", checkAttributeFormulae);
		parameters.put("__inputTggNode", inputTggNode);

		((de.mdelab.migmm.java2class_adapted.generated.java2class_adaptedOperationalTGG) this.getOperationalRuleGroup()
				.getOperationalTGG()).executeActivity(this.getRepairForwardActivity(), parameters);

		final ErrorCodeEnum errorCode = (ErrorCodeEnum) parameters.get("__errorCode");

		return errorCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorCodeEnum repairBackward(final TGGNode inputTggNode, final boolean checkAttributeFormulae)
			throws TransformationException {

		final org.eclipse.emf.common.util.EMap<String, Object> parameters = new org.eclipse.emf.common.util.BasicEMap<String, Object>();

		parameters.put("__thisRule", this);
		parameters.put("__checkAttributeFormulae", checkAttributeFormulae);
		parameters.put("__inputTggNode", inputTggNode);

		((de.mdelab.migmm.java2class_adapted.generated.java2class_adaptedOperationalTGG) this.getOperationalRuleGroup()
				.getOperationalTGG()).executeActivity(this.getRepairBackwardActivity(), parameters);

		final ErrorCodeEnum errorCode = (ErrorCodeEnum) parameters.get("__errorCode");

		return errorCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__ADD_ELEMENT_ACTIVITY:
			if (resolve)
				return getAddElementActivity();
			return basicGetAddElementActivity();
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__MOVE_ELEMENT_ACTIVITY:
			if (resolve)
				return getMoveElementActivity();
			return basicGetMoveElementActivity();
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__CHANGE_ATTRIBUTE_ACTIVITY:
			if (resolve)
				return getChangeAttributeActivity();
			return basicGetChangeAttributeActivity();
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__TRANSFORM_FORWARD_ACTIVITY:
			if (resolve)
				return getTransformForwardActivity();
			return basicGetTransformForwardActivity();
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__TRANSFORM_MAPPING_ACTIVITY:
			if (resolve)
				return getTransformMappingActivity();
			return basicGetTransformMappingActivity();
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__TRANSFORM_BACKWARD_ACTIVITY:
			if (resolve)
				return getTransformBackwardActivity();
			return basicGetTransformBackwardActivity();
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__CONFLICT_CHECK_FORWARD_ACTIVITY:
			if (resolve)
				return getConflictCheckForwardActivity();
			return basicGetConflictCheckForwardActivity();
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__CONFLICT_CHECK_MAPPING_ACTIVITY:
			if (resolve)
				return getConflictCheckMappingActivity();
			return basicGetConflictCheckMappingActivity();
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__CONFLICT_CHECK_BACKWARD_ACTIVITY:
			if (resolve)
				return getConflictCheckBackwardActivity();
			return basicGetConflictCheckBackwardActivity();
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__SYNCHRONIZE_FORWARD_ACTIVITY:
			if (resolve)
				return getSynchronizeForwardActivity();
			return basicGetSynchronizeForwardActivity();
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__SYNCHRONIZE_BACKWARD_ACTIVITY:
			if (resolve)
				return getSynchronizeBackwardActivity();
			return basicGetSynchronizeBackwardActivity();
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__REPAIR_FORWARD_ACTIVITY:
			if (resolve)
				return getRepairForwardActivity();
			return basicGetRepairForwardActivity();
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__REPAIR_BACKWARD_ACTIVITY:
			if (resolve)
				return getRepairBackwardActivity();
			return basicGetRepairBackwardActivity();
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
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__ADD_ELEMENT_ACTIVITY:
			setAddElementActivity((Activity) newValue);
			return;
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__MOVE_ELEMENT_ACTIVITY:
			setMoveElementActivity((Activity) newValue);
			return;
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__CHANGE_ATTRIBUTE_ACTIVITY:
			setChangeAttributeActivity((Activity) newValue);
			return;
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__TRANSFORM_FORWARD_ACTIVITY:
			setTransformForwardActivity((Activity) newValue);
			return;
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__TRANSFORM_MAPPING_ACTIVITY:
			setTransformMappingActivity((Activity) newValue);
			return;
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__TRANSFORM_BACKWARD_ACTIVITY:
			setTransformBackwardActivity((Activity) newValue);
			return;
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__CONFLICT_CHECK_FORWARD_ACTIVITY:
			setConflictCheckForwardActivity((Activity) newValue);
			return;
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__CONFLICT_CHECK_MAPPING_ACTIVITY:
			setConflictCheckMappingActivity((Activity) newValue);
			return;
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__CONFLICT_CHECK_BACKWARD_ACTIVITY:
			setConflictCheckBackwardActivity((Activity) newValue);
			return;
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__SYNCHRONIZE_FORWARD_ACTIVITY:
			setSynchronizeForwardActivity((Activity) newValue);
			return;
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__SYNCHRONIZE_BACKWARD_ACTIVITY:
			setSynchronizeBackwardActivity((Activity) newValue);
			return;
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__REPAIR_FORWARD_ACTIVITY:
			setRepairForwardActivity((Activity) newValue);
			return;
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__REPAIR_BACKWARD_ACTIVITY:
			setRepairBackwardActivity((Activity) newValue);
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
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__ADD_ELEMENT_ACTIVITY:
			setAddElementActivity((Activity) null);
			return;
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__MOVE_ELEMENT_ACTIVITY:
			setMoveElementActivity((Activity) null);
			return;
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__CHANGE_ATTRIBUTE_ACTIVITY:
			setChangeAttributeActivity((Activity) null);
			return;
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__TRANSFORM_FORWARD_ACTIVITY:
			setTransformForwardActivity((Activity) null);
			return;
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__TRANSFORM_MAPPING_ACTIVITY:
			setTransformMappingActivity((Activity) null);
			return;
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__TRANSFORM_BACKWARD_ACTIVITY:
			setTransformBackwardActivity((Activity) null);
			return;
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__CONFLICT_CHECK_FORWARD_ACTIVITY:
			setConflictCheckForwardActivity((Activity) null);
			return;
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__CONFLICT_CHECK_MAPPING_ACTIVITY:
			setConflictCheckMappingActivity((Activity) null);
			return;
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__CONFLICT_CHECK_BACKWARD_ACTIVITY:
			setConflictCheckBackwardActivity((Activity) null);
			return;
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__SYNCHRONIZE_FORWARD_ACTIVITY:
			setSynchronizeForwardActivity((Activity) null);
			return;
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__SYNCHRONIZE_BACKWARD_ACTIVITY:
			setSynchronizeBackwardActivity((Activity) null);
			return;
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__REPAIR_FORWARD_ACTIVITY:
			setRepairForwardActivity((Activity) null);
			return;
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__REPAIR_BACKWARD_ACTIVITY:
			setRepairBackwardActivity((Activity) null);
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
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__ADD_ELEMENT_ACTIVITY:
			return addElementActivity != null;
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__MOVE_ELEMENT_ACTIVITY:
			return moveElementActivity != null;
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__CHANGE_ATTRIBUTE_ACTIVITY:
			return changeAttributeActivity != null;
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__TRANSFORM_FORWARD_ACTIVITY:
			return transformForwardActivity != null;
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__TRANSFORM_MAPPING_ACTIVITY:
			return transformMappingActivity != null;
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__TRANSFORM_BACKWARD_ACTIVITY:
			return transformBackwardActivity != null;
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__CONFLICT_CHECK_FORWARD_ACTIVITY:
			return conflictCheckForwardActivity != null;
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__CONFLICT_CHECK_MAPPING_ACTIVITY:
			return conflictCheckMappingActivity != null;
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__CONFLICT_CHECK_BACKWARD_ACTIVITY:
			return conflictCheckBackwardActivity != null;
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__SYNCHRONIZE_FORWARD_ACTIVITY:
			return synchronizeForwardActivity != null;
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__SYNCHRONIZE_BACKWARD_ACTIVITY:
			return synchronizeBackwardActivity != null;
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__REPAIR_FORWARD_ACTIVITY:
			return repairForwardActivity != null;
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED__REPAIR_BACKWARD_ACTIVITY:
			return repairBackwardActivity != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED___ADD_ELEMENT__EMAP:
			return addElement((EMap<String, Object>) arguments.get(0));
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED___CHANGE_ATTRIBUTE_VALUES__TGGNODE_EMAP:
			return changeAttributeValues((TGGNode) arguments.get(0), (EMap<String, Object>) arguments.get(1));
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED___MOVE_ELEMENT__TGGNODE_TGGNODE_TGGNODE:
			return moveElement((TGGNode) arguments.get(0), (TGGNode) arguments.get(1), (TGGNode) arguments.get(2));
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED___TRANSFORM_FORWARD__TGGNODE_BOOLEAN_BOOLEAN:
			return transformForward((TGGNode) arguments.get(0), (Boolean) arguments.get(1), (Boolean) arguments.get(2));
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED___TRANSFORM_MAPPING__TGGNODE_BOOLEAN_BOOLEAN:
			return transformMapping((TGGNode) arguments.get(0), (Boolean) arguments.get(1), (Boolean) arguments.get(2));
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED___TRANSFORM_BACKWARD__TGGNODE_BOOLEAN_BOOLEAN:
			return transformBackward((TGGNode) arguments.get(0), (Boolean) arguments.get(1),
					(Boolean) arguments.get(2));
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED___CONFLICT_CHECK_FORWARD__TGGNODE:
			return conflictCheckForward((TGGNode) arguments.get(0));
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED___CONFLICT_CHECK_MAPPING__TGGNODE:
			return conflictCheckMapping((TGGNode) arguments.get(0));
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED___CONFLICT_CHECK_BACKWARD__TGGNODE:
			return conflictCheckBackward((TGGNode) arguments.get(0));
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED___SYNCHRONIZE_FORWARD__TGGNODE_BOOLEAN:
			return synchronizeForward((TGGNode) arguments.get(0), (Boolean) arguments.get(1));
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED___SYNCHRONIZE_BACKWARD__TGGNODE_BOOLEAN:
			return synchronizeBackward((TGGNode) arguments.get(0), (Boolean) arguments.get(1));
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED___REPAIR_FORWARD__TGGNODE_BOOLEAN:
			return repairForward((TGGNode) arguments.get(0), (Boolean) arguments.get(1));
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED___REPAIR_BACKWARD__TGGNODE_BOOLEAN:
			return repairBackward((TGGNode) arguments.get(0), (Boolean) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //java2classField2Association_adapted_java2classField2Association_adaptedImpl
