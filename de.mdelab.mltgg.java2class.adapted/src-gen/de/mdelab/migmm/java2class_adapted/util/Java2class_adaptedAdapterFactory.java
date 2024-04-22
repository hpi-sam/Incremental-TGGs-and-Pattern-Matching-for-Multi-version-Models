/**
 */
package de.mdelab.migmm.java2class_adapted.util;

import de.mdelab.migmm.history.ElementWithHistory;

import de.mdelab.migmm.java2class_adapted.*;

import de.mdelab.mlcore.MLAnnotatedElement;

import de.mdelab.mltgg.mote2.TGGNode;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import tggh.TGGNodeWithHistory;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.mdelab.migmm.java2class_adapted.Java2class_adaptedPackage
 * @generated
 */
public class Java2class_adaptedAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Java2class_adaptedPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Java2class_adaptedAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Java2class_adaptedPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Java2class_adaptedSwitch<Adapter> modelSwitch = new Java2class_adaptedSwitch<Adapter>() {
		@Override
		public Adapter caseCorrAxiom_adapted(CorrAxiom_adapted object) {
			return createCorrAxiom_adaptedAdapter();
		}

		@Override
		public Adapter caseCorrPkg_adapted(CorrPkg_adapted object) {
			return createCorrPkg_adaptedAdapter();
		}

		@Override
		public Adapter caseCorrClass_adapted(CorrClass_adapted object) {
			return createCorrClass_adaptedAdapter();
		}

		@Override
		public Adapter caseCorrAssociation_adapted(CorrAssociation_adapted object) {
			return createCorrAssociation_adaptedAdapter();
		}

		@Override
		public Adapter caseHistory2History(History2History object) {
			return createHistory2HistoryAdapter();
		}

		@Override
		public Adapter caseMLAnnotatedElement(MLAnnotatedElement object) {
			return createMLAnnotatedElementAdapter();
		}

		@Override
		public Adapter caseTGGNode(TGGNode object) {
			return createTGGNodeAdapter();
		}

		@Override
		public Adapter caseElementWithHistory(ElementWithHistory object) {
			return createElementWithHistoryAdapter();
		}

		@Override
		public Adapter caseTGGNodeWithHistory(TGGNodeWithHistory object) {
			return createTGGNodeWithHistoryAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.java2class_adapted.CorrAxiom_adapted <em>Corr Axiom adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.java2class_adapted.CorrAxiom_adapted
	 * @generated
	 */
	public Adapter createCorrAxiom_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.java2class_adapted.CorrPkg_adapted <em>Corr Pkg adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.java2class_adapted.CorrPkg_adapted
	 * @generated
	 */
	public Adapter createCorrPkg_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.java2class_adapted.CorrClass_adapted <em>Corr Class adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.java2class_adapted.CorrClass_adapted
	 * @generated
	 */
	public Adapter createCorrClass_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.java2class_adapted.CorrAssociation_adapted <em>Corr Association adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.java2class_adapted.CorrAssociation_adapted
	 * @generated
	 */
	public Adapter createCorrAssociation_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.java2class_adapted.History2History <em>History2 History</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.java2class_adapted.History2History
	 * @generated
	 */
	public Adapter createHistory2HistoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.mlcore.MLAnnotatedElement <em>ML Annotated Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.mlcore.MLAnnotatedElement
	 * @generated
	 */
	public Adapter createMLAnnotatedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.mltgg.mote2.TGGNode <em>TGG Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.mltgg.mote2.TGGNode
	 * @generated
	 */
	public Adapter createTGGNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.ElementWithHistory <em>Element With History</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.ElementWithHistory
	 * @generated
	 */
	public Adapter createElementWithHistoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tggh.TGGNodeWithHistory <em>TGG Node With History</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tggh.TGGNodeWithHistory
	 * @generated
	 */
	public Adapter createTGGNodeWithHistoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Java2class_adaptedAdapterFactory
