/**
 */
package de.mdelab.migmm.history.timing.impl;

import de.mdelab.migmm.history.timing.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimingFactoryImpl extends EFactoryImpl implements TimingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TimingFactory init() {
		try {
			TimingFactory theTimingFactory = (TimingFactory)EPackage.Registry.INSTANCE.getEFactory(TimingPackage.eNS_URI);
			if (theTimingFactory != null) {
				return theTimingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TimingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TimingPackage.LT_BASE_INTERVAL: return createLTBaseInterval();
			case TimingPackage.LT_TIMING_UNIT: return createLTTimingUnit();
			case TimingPackage.LT_COMPOSITE_INTERVAL: return createLTCompositeInterval();
			case TimingPackage.DAG_INTERVAL: return createDAGInterval();
			case TimingPackage.DAG_VERSION: return createDAGVersion();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LTBaseInterval createLTBaseInterval() {
		LTBaseIntervalImpl ltBaseInterval = new LTBaseIntervalImpl();
		return ltBaseInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LTTimingUnit createLTTimingUnit() {
		LTTimingUnitImpl ltTimingUnit = new LTTimingUnitImpl();
		return ltTimingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LTCompositeInterval createLTCompositeInterval() {
		LTCompositeIntervalImpl ltCompositeInterval = new LTCompositeIntervalImpl();
		return ltCompositeInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DAGInterval createDAGInterval() {
		DAGIntervalImpl dagInterval = new DAGIntervalImpl();
		return dagInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DAGVersion createDAGVersion() {
		DAGVersionImpl dagVersion = new DAGVersionImpl();
		return dagVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimingPackage getTimingPackage() {
		return (TimingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TimingPackage getPackage() {
		return TimingPackage.eINSTANCE;
	}

} //TimingFactoryImpl
