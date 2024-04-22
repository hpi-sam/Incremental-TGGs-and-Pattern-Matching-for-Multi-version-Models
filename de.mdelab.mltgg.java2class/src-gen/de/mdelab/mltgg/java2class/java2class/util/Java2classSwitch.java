/**
 */
package de.mdelab.mltgg.java2class.java2class.util;

import de.mdelab.mlcore.MLAnnotatedElement;

import de.mdelab.mltgg.java2class.java2class.*;

import de.mdelab.mltgg.mote2.TGGNode;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * @see de.mdelab.mltgg.java2class.java2class.Java2classPackage
 * @generated
 */
public class Java2classSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Java2classPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Java2classSwitch() {
		if (modelPackage == null) {
			modelPackage = Java2classPackage.eINSTANCE;
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
		case Java2classPackage.CORR_AXIOM: {
			CorrAxiom corrAxiom = (CorrAxiom) theEObject;
			T result = caseCorrAxiom(corrAxiom);
			if (result == null)
				result = caseTGGNode(corrAxiom);
			if (result == null)
				result = caseMLAnnotatedElement(corrAxiom);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Java2classPackage.CORR_PKG: {
			CorrPkg corrPkg = (CorrPkg) theEObject;
			T result = caseCorrPkg(corrPkg);
			if (result == null)
				result = caseTGGNode(corrPkg);
			if (result == null)
				result = caseMLAnnotatedElement(corrPkg);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Java2classPackage.CORR_CLASS: {
			CorrClass corrClass = (CorrClass) theEObject;
			T result = caseCorrClass(corrClass);
			if (result == null)
				result = caseTGGNode(corrClass);
			if (result == null)
				result = caseMLAnnotatedElement(corrClass);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Java2classPackage.CORR_ASSOCIATION: {
			CorrAssociation corrAssociation = (CorrAssociation) theEObject;
			T result = caseCorrAssociation(corrAssociation);
			if (result == null)
				result = caseTGGNode(corrAssociation);
			if (result == null)
				result = caseMLAnnotatedElement(corrAssociation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Corr Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Corr Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCorrAxiom(CorrAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Corr Pkg</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Corr Pkg</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCorrPkg(CorrPkg object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Corr Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Corr Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCorrClass(CorrClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Corr Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Corr Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCorrAssociation(CorrAssociation object) {
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

} //Java2classSwitch
