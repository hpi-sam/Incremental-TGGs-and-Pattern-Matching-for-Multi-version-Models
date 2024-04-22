/**
 */
package de.mdelab.migmm.history.impl;

import de.mdelab.migmm.history.*;

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
public class HistoryFactoryImpl extends EFactoryImpl implements HistoryFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HistoryFactory init() {
		try {
			HistoryFactory theHistoryFactory = (HistoryFactory)EPackage.Registry.INSTANCE.getEFactory(HistoryPackage.eNS_URI);
			if (theHistoryFactory != null) {
				return theHistoryFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HistoryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryFactoryImpl() {
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
			case HistoryPackage.HISTORY: return createHistory();
			case HistoryPackage.GENERIC_COMPLETE_INTERVAL: return createGenericCompleteInterval();
			case HistoryPackage.EDGE_WITH_HISTORY: return createEdgeWithHistory();
			case HistoryPackage.CONTAINMENT_EDGE_WITH_HISTORY: return createContainmentEdgeWithHistory();
			case HistoryPackage.ATTRIBUTE_WITH_HISTORY: return createAttributeWithHistory();
			case HistoryPackage.NODE_WITH_HISTORY: return createNodeWithHistory();
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
	public History createHistory() {
		HistoryImpl history = new HistoryImpl();
		return history;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericCompleteInterval createGenericCompleteInterval() {
		GenericCompleteIntervalImpl genericCompleteInterval = new GenericCompleteIntervalImpl();
		return genericCompleteInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EdgeWithHistory createEdgeWithHistory() {
		EdgeWithHistoryImpl edgeWithHistory = new EdgeWithHistoryImpl();
		return edgeWithHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContainmentEdgeWithHistory createContainmentEdgeWithHistory() {
		ContainmentEdgeWithHistoryImpl containmentEdgeWithHistory = new ContainmentEdgeWithHistoryImpl();
		return containmentEdgeWithHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttributeWithHistory createAttributeWithHistory() {
		AttributeWithHistoryImpl attributeWithHistory = new AttributeWithHistoryImpl();
		return attributeWithHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodeWithHistory createNodeWithHistory() {
		NodeWithHistoryImpl nodeWithHistory = new NodeWithHistoryImpl();
		return nodeWithHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoryPackage getHistoryPackage() {
		return (HistoryPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HistoryPackage getPackage() {
		return HistoryPackage.eINSTANCE;
	}

} //HistoryFactoryImpl
