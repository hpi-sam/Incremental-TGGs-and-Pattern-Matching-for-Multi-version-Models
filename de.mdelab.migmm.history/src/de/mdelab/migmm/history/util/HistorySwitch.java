/**
 */
package de.mdelab.migmm.history.util;

import de.mdelab.migmm.history.*;

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
 * @see de.mdelab.migmm.history.HistoryPackage
 * @generated
 */
public class HistorySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HistoryPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistorySwitch() {
		if (modelPackage == null) {
			modelPackage = HistoryPackage.eINSTANCE;
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
			case HistoryPackage.HISTORY: {
				History history = (History)theEObject;
				T result = caseHistory(history);
				if (result == null) result = caseElementWithHistory(history);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HistoryPackage.INTERVAL: {
				Interval interval = (Interval)theEObject;
				T result = caseInterval(interval);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HistoryPackage.TIMING_UNIT: {
				TimingUnit timingUnit = (TimingUnit)theEObject;
				T result = caseTimingUnit(timingUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HistoryPackage.ELEMENT_WITH_HISTORY: {
				ElementWithHistory elementWithHistory = (ElementWithHistory)theEObject;
				T result = caseElementWithHistory(elementWithHistory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HistoryPackage.GENERIC_COMPLETE_INTERVAL: {
				GenericCompleteInterval genericCompleteInterval = (GenericCompleteInterval)theEObject;
				T result = caseGenericCompleteInterval(genericCompleteInterval);
				if (result == null) result = caseInterval(genericCompleteInterval);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HistoryPackage.EDGE_WITH_HISTORY: {
				EdgeWithHistory edgeWithHistory = (EdgeWithHistory)theEObject;
				T result = caseEdgeWithHistory(edgeWithHistory);
				if (result == null) result = caseElementWithHistory(edgeWithHistory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HistoryPackage.CONTAINMENT_EDGE_WITH_HISTORY: {
				ContainmentEdgeWithHistory containmentEdgeWithHistory = (ContainmentEdgeWithHistory)theEObject;
				T result = caseContainmentEdgeWithHistory(containmentEdgeWithHistory);
				if (result == null) result = caseEdgeWithHistory(containmentEdgeWithHistory);
				if (result == null) result = caseElementWithHistory(containmentEdgeWithHistory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HistoryPackage.ATTRIBUTE_WITH_HISTORY: {
				AttributeWithHistory attributeWithHistory = (AttributeWithHistory)theEObject;
				T result = caseAttributeWithHistory(attributeWithHistory);
				if (result == null) result = caseElementWithHistory(attributeWithHistory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HistoryPackage.NODE_WITH_HISTORY: {
				NodeWithHistory nodeWithHistory = (NodeWithHistory)theEObject;
				T result = caseNodeWithHistory(nodeWithHistory);
				if (result == null) result = caseElementWithHistory(nodeWithHistory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>History</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>History</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistory(History object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interval</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterval(Interval object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timing Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timing Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimingUnit(TimingUnit object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Generic Complete Interval</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Complete Interval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericCompleteInterval(GenericCompleteInterval object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edge With History</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edge With History</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEdgeWithHistory(EdgeWithHistory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Containment Edge With History</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Containment Edge With History</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainmentEdgeWithHistory(ContainmentEdgeWithHistory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute With History</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute With History</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeWithHistory(AttributeWithHistory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node With History</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node With History</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeWithHistory(NodeWithHistory object) {
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

} //HistorySwitch
