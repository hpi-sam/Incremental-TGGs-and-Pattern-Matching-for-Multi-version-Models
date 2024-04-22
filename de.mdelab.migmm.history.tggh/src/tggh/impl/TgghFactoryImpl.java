/**
 */
package tggh.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tggh.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TgghFactoryImpl extends EFactoryImpl implements TgghFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TgghFactory init() {
		try {
			TgghFactory theTgghFactory = (TgghFactory)EPackage.Registry.INSTANCE.getEFactory(TgghPackage.eNS_URI);
			if (theTgghFactory != null) {
				return theTgghFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TgghFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TgghFactoryImpl() {
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
			case TgghPackage.HISTORY2_HISTORY: return createHistory2History();
			case TgghPackage.TGG_NODE_WITH_HISTORY: return createTGGNodeWithHistory();
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
	public History2History createHistory2History() {
		History2HistoryImpl history2History = new History2HistoryImpl();
		return history2History;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TGGNodeWithHistory createTGGNodeWithHistory() {
		TGGNodeWithHistoryImpl tggNodeWithHistory = new TGGNodeWithHistoryImpl();
		return tggNodeWithHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TgghPackage getTgghPackage() {
		return (TgghPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TgghPackage getPackage() {
		return TgghPackage.eINSTANCE;
	}

} //TgghFactoryImpl
