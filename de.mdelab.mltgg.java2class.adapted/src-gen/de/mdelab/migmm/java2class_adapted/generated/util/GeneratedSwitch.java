/**
 */
package de.mdelab.migmm.java2class_adapted.generated.util;

import de.mdelab.migmm.java2class_adapted.generated.*;

import de.mdelab.mltgg.mote2.operationalTGG.OperationalAxiom;
import de.mdelab.mltgg.mote2.operationalTGG.OperationalAxiomGroup;
import de.mdelab.mltgg.mote2.operationalTGG.OperationalMapping;
import de.mdelab.mltgg.mote2.operationalTGG.OperationalMappingGroup;
import de.mdelab.mltgg.mote2.operationalTGG.OperationalRule;
import de.mdelab.mltgg.mote2.operationalTGG.OperationalRuleGroup;
import de.mdelab.mltgg.mote2.operationalTGG.OperationalTGG;

import de.mdelab.mltgg.mote2.sdm.SdmOperationalTGG;

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
 * @see de.mdelab.migmm.java2class_adapted.generated.GeneratedPackage
 * @generated
 */
public class GeneratedSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GeneratedPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratedSwitch() {
		if (modelPackage == null) {
			modelPackage = GeneratedPackage.eINSTANCE;
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
		case GeneratedPackage.JAVA2CLASS_ADAPTED_OPERATIONAL_TGG: {
			java2class_adaptedOperationalTGG java2class_adaptedOperationalTGG = (java2class_adaptedOperationalTGG) theEObject;
			T result = casejava2class_adaptedOperationalTGG(java2class_adaptedOperationalTGG);
			if (result == null)
				result = caseSdmOperationalTGG(java2class_adaptedOperationalTGG);
			if (result == null)
				result = caseOperationalTGG(java2class_adaptedOperationalTGG);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.HISTORY2_HISTORY2: {
			History2History2 history2History2 = (History2History2) theEObject;
			T result = caseHistory2History2(history2History2);
			if (result == null)
				result = caseOperationalAxiomGroup(history2History2);
			if (result == null)
				result = caseOperationalMappingGroup(history2History2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.JAVA2CLASS_AXIOM_ADAPTED: {
			java2classAxiom_adapted java2classAxiom_adapted = (java2classAxiom_adapted) theEObject;
			T result = casejava2classAxiom_adapted(java2classAxiom_adapted);
			if (result == null)
				result = caseOperationalRuleGroup(java2classAxiom_adapted);
			if (result == null)
				result = caseOperationalMappingGroup(java2classAxiom_adapted);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.JAVA2CLASS_PKG_ADAPTED: {
			java2classPkg_adapted java2classPkg_adapted = (java2classPkg_adapted) theEObject;
			T result = casejava2classPkg_adapted(java2classPkg_adapted);
			if (result == null)
				result = caseOperationalRuleGroup(java2classPkg_adapted);
			if (result == null)
				result = caseOperationalMappingGroup(java2classPkg_adapted);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.JAVA2CLASS_CHILD_PKG_ADAPTED: {
			java2classChildPkg_adapted java2classChildPkg_adapted = (java2classChildPkg_adapted) theEObject;
			T result = casejava2classChildPkg_adapted(java2classChildPkg_adapted);
			if (result == null)
				result = caseOperationalRuleGroup(java2classChildPkg_adapted);
			if (result == null)
				result = caseOperationalMappingGroup(java2classChildPkg_adapted);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED: {
			java2classClassDeclaration2Class_adapted java2classClassDeclaration2Class_adapted = (java2classClassDeclaration2Class_adapted) theEObject;
			T result = casejava2classClassDeclaration2Class_adapted(java2classClassDeclaration2Class_adapted);
			if (result == null)
				result = caseOperationalRuleGroup(java2classClassDeclaration2Class_adapted);
			if (result == null)
				result = caseOperationalMappingGroup(java2classClassDeclaration2Class_adapted);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED: {
			java2classField2Association_adapted java2classField2Association_adapted = (java2classField2Association_adapted) theEObject;
			T result = casejava2classField2Association_adapted(java2classField2Association_adapted);
			if (result == null)
				result = caseOperationalRuleGroup(java2classField2Association_adapted);
			if (result == null)
				result = caseOperationalMappingGroup(java2classField2Association_adapted);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.HISTORY2_HISTORY2_HISTORY2_HISTORY: {
			History2History2_History2History history2History2_History2History = (History2History2_History2History) theEObject;
			T result = caseHistory2History2_History2History(history2History2_History2History);
			if (result == null)
				result = caseOperationalAxiom(history2History2_History2History);
			if (result == null)
				result = caseOperationalMapping(history2History2_History2History);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.JAVA2CLASS_PKG_ADAPTED_PKG_ADAPTED: {
			java2classPkg_adapted_pkg_adapted java2classPkg_adapted_pkg_adapted = (java2classPkg_adapted_pkg_adapted) theEObject;
			T result = casejava2classPkg_adapted_pkg_adapted(java2classPkg_adapted_pkg_adapted);
			if (result == null)
				result = caseOperationalRule(java2classPkg_adapted_pkg_adapted);
			if (result == null)
				result = caseOperationalMapping(java2classPkg_adapted_pkg_adapted);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED_JAVA2CLASS_CLASS_DECLARATION2_CLASS_ADAPTED: {
			java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted = (java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted) theEObject;
			T result = casejava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted(
					java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted);
			if (result == null)
				result = caseOperationalRule(
						java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted);
			if (result == null)
				result = caseOperationalMapping(
						java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED_JAVA2CLASS_FIELD2_ASSOCIATION_ADAPTED: {
			java2classField2Association_adapted_java2classField2Association_adapted java2classField2Association_adapted_java2classField2Association_adapted = (java2classField2Association_adapted_java2classField2Association_adapted) theEObject;
			T result = casejava2classField2Association_adapted_java2classField2Association_adapted(
					java2classField2Association_adapted_java2classField2Association_adapted);
			if (result == null)
				result = caseOperationalRule(java2classField2Association_adapted_java2classField2Association_adapted);
			if (result == null)
				result = caseOperationalMapping(
						java2classField2Association_adapted_java2classField2Association_adapted);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.JAVA2CLASS_CHILD_PKG_ADAPTED_CHILD_PKG_ADAPTED: {
			java2classChildPkg_adapted_childPkg_adapted java2classChildPkg_adapted_childPkg_adapted = (java2classChildPkg_adapted_childPkg_adapted) theEObject;
			T result = casejava2classChildPkg_adapted_childPkg_adapted(java2classChildPkg_adapted_childPkg_adapted);
			if (result == null)
				result = caseOperationalRule(java2classChildPkg_adapted_childPkg_adapted);
			if (result == null)
				result = caseOperationalMapping(java2classChildPkg_adapted_childPkg_adapted);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.JAVA2CLASS_AXIOM_ADAPTED_AXIOM_ADAPTED: {
			java2classAxiom_adapted_axiom_adapted java2classAxiom_adapted_axiom_adapted = (java2classAxiom_adapted_axiom_adapted) theEObject;
			T result = casejava2classAxiom_adapted_axiom_adapted(java2classAxiom_adapted_axiom_adapted);
			if (result == null)
				result = caseOperationalRule(java2classAxiom_adapted_axiom_adapted);
			if (result == null)
				result = caseOperationalMapping(java2classAxiom_adapted_axiom_adapted);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>java2class adapted Operational TGG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>java2class adapted Operational TGG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casejava2class_adaptedOperationalTGG(java2class_adaptedOperationalTGG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>History2 History2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>History2 History2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistory2History2(History2History2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>java2class Axiom adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>java2class Axiom adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casejava2classAxiom_adapted(java2classAxiom_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>java2class Pkg adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>java2class Pkg adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casejava2classPkg_adapted(java2classPkg_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>java2class Child Pkg adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>java2class Child Pkg adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casejava2classChildPkg_adapted(java2classChildPkg_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>java2class Class Declaration2 Class adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>java2class Class Declaration2 Class adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casejava2classClassDeclaration2Class_adapted(java2classClassDeclaration2Class_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>java2class Field2 Association adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>java2class Field2 Association adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casejava2classField2Association_adapted(java2classField2Association_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>History2 History2 History2 History</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>History2 History2 History2 History</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistory2History2_History2History(History2History2_History2History object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>java2class Pkg adapted pkg adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>java2class Pkg adapted pkg adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casejava2classPkg_adapted_pkg_adapted(java2classPkg_adapted_pkg_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>java2class Class Declaration2 Class adapted java2class Class Declaration2 Class adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>java2class Class Declaration2 Class adapted java2class Class Declaration2 Class adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casejava2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted(
			java2classClassDeclaration2Class_adapted_java2classClassDeclaration2Class_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>java2class Field2 Association adapted java2class Field2 Association adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>java2class Field2 Association adapted java2class Field2 Association adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casejava2classField2Association_adapted_java2classField2Association_adapted(
			java2classField2Association_adapted_java2classField2Association_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>java2class Child Pkg adapted child Pkg adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>java2class Child Pkg adapted child Pkg adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casejava2classChildPkg_adapted_childPkg_adapted(java2classChildPkg_adapted_childPkg_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>java2class Axiom adapted axiom adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>java2class Axiom adapted axiom adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casejava2classAxiom_adapted_axiom_adapted(java2classAxiom_adapted_axiom_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational TGG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational TGG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationalTGG(OperationalTGG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational TGG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational TGG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSdmOperationalTGG(SdmOperationalTGG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational Mapping Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational Mapping Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationalMappingGroup(OperationalMappingGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational Axiom Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational Axiom Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationalAxiomGroup(OperationalAxiomGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational Rule Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational Rule Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationalRuleGroup(OperationalRuleGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationalMapping(OperationalMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationalAxiom(OperationalAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationalRule(OperationalRule object) {
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

} //GeneratedSwitch
