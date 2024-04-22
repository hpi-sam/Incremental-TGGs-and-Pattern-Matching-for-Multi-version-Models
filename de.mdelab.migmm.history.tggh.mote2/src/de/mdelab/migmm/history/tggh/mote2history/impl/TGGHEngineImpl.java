/**
 */
package de.mdelab.migmm.history.tggh.mote2history.impl;

import de.mdelab.migmm.history.tggh.mote2history.Mote2historyPackage;
import de.mdelab.migmm.history.tggh.mote2history.TGGHEngine;

import de.mdelab.mltgg.mote2.TGGNode;

import de.mdelab.mltgg.mote2.impl.TGGEngineImpl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TGGH Engine</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class TGGHEngineImpl extends TGGEngineImpl implements TGGHEngine {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TGGHEngineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mote2historyPackage.Literals.TGGH_ENGINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void registerCoveringCorrNode(EObject element, TGGNode corrNode) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Mote2historyPackage.TGGH_ENGINE___REGISTER_COVERING_CORR_NODE__EOBJECT_TGGNODE:
				registerCoveringCorrNode((EObject)arguments.get(0), (TGGNode)arguments.get(1));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //TGGHEngineImpl
