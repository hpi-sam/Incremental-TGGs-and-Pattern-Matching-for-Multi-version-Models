/**
 */
package de.mdelab.migmm.java2class_adapted.util;

import de.mdelab.migmm.history.ElementWithHistory;

import de.mdelab.migmm.java2class_adapted.*;

import de.mdelab.mlcore.MLAnnotatedElement;

import de.mdelab.mltgg.mote2.TGGNode;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import tggh.TGGNodeWithHistory;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.mdelab.migmm.java2class_adapted.Java2class_adaptedPackage
 * @generated
 */
public class Java2class_adaptedSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Java2class_adaptedPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Java2class_adaptedSwitch() {
		if (modelPackage == null) {
			modelPackage = Java2class_adaptedPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case Java2class_adaptedPackage.CORR_AXIOM_ADAPTED: {
			CorrAxiom_adapted corrAxiom_adapted = (CorrAxiom_adapted) theEObject;
			T result = caseCorrAxiom_adapted(corrAxiom_adapted);
			if (result == null)
				result = caseTGGNodeWithHistory(corrAxiom_adapted);
			if (result == null)
				result = caseTGGNode(corrAxiom_adapted);
			if (result == null)
				result = caseElementWithHistory(corrAxiom_adapted);
			if (result == null)
				result = caseMLAnnotatedElement(corrAxiom_adapted);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Java2class_adaptedPackage.CORR_PKG_ADAPTED: {
			CorrPkg_adapted corrPkg_adapted = (CorrPkg_adapted) theEObject;
			T result = caseCorrPkg_adapted(corrPkg_adapted);
			if (result == null)
				result = caseTGGNodeWithHistory(corrPkg_adapted);
			if (result == null)
				result = caseTGGNode(corrPkg_adapted);
			if (result == null)
				result = caseElementWithHistory(corrPkg_adapted);
			if (result == null)
				result = caseMLAnnotatedElement(corrPkg_adapted);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Java2class_adaptedPackage.CORR_CLASS_ADAPTED: {
			CorrClass_adapted corrClass_adapted = (CorrClass_adapted) theEObject;
			T result = caseCorrClass_adapted(corrClass_adapted);
			if (result == null)
				result = caseTGGNodeWithHistory(corrClass_adapted);
			if (result == null)
				result = caseTGGNode(corrClass_adapted);
			if (result == null)
				result = caseElementWithHistory(corrClass_adapted);
			if (result == null)
				result = caseMLAnnotatedElement(corrClass_adapted);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Java2class_adaptedPackage.CORR_ASSOCIATION_ADAPTED: {
			CorrAssociation_adapted corrAssociation_adapted = (CorrAssociation_adapted) theEObject;
			T result = caseCorrAssociation_adapted(corrAssociation_adapted);
			if (result == null)
				result = caseTGGNodeWithHistory(corrAssociation_adapted);
			if (result == null)
				result = caseTGGNode(corrAssociation_adapted);
			if (result == null)
				result = caseElementWithHistory(corrAssociation_adapted);
			if (result == null)
				result = caseMLAnnotatedElement(corrAssociation_adapted);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Java2class_adaptedPackage.HISTORY2_HISTORY: {
			History2History history2History = (History2History) theEObject;
			T result = caseHistory2History(history2History);
			if (result == null)
				result = caseTGGNodeWithHistory(history2History);
			if (result == null)
				result = caseTGGNode(history2History);
			if (result == null)
				result = caseElementWithHistory(history2History);
			if (result == null)
				result = caseMLAnnotatedElement(history2History);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Corr Axiom adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Corr Axiom adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCorrAxiom_adapted(CorrAxiom_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Corr Pkg adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Corr Pkg adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCorrPkg_adapted(CorrPkg_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Corr Class adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Corr Class adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCorrClass_adapted(CorrClass_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Corr Association adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Corr Association adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCorrAssociation_adapted(CorrAssociation_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>History2 History</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>History2 History</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistory2History(History2History object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ML Annotated Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ML Annotated Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMLAnnotatedElement(MLAnnotatedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TGG Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TGG Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTGGNode(TGGNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element With History</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element With History</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementWithHistory(ElementWithHistory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TGG Node With History</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TGG Node With History</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTGGNodeWithHistory(TGGNodeWithHistory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Java2class_adaptedSwitch
