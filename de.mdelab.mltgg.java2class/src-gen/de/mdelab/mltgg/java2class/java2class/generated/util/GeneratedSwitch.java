/**
 */
package de.mdelab.mltgg.java2class.java2class.generated.util;

import de.mdelab.mltgg.java2class.java2class.generated.*;

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
 * @see de.mdelab.mltgg.java2class.java2class.generated.GeneratedPackage
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
		case GeneratedPackage.JAVA2CLASS_OPERATIONAL_TGG: {
			java2classOperationalTGG java2classOperationalTGG = (java2classOperationalTGG) theEObject;
			T result = casejava2classOperationalTGG(java2classOperationalTGG);
			if (result == null)
				result = caseSdmOperationalTGG(java2classOperationalTGG);
			if (result == null)
				result = caseOperationalTGG(java2classOperationalTGG);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.JAVA2CLASS_AXIOM: {
			java2classAxiom java2classAxiom = (java2classAxiom) theEObject;
			T result = casejava2classAxiom(java2classAxiom);
			if (result == null)
				result = caseOperationalAxiomGroup(java2classAxiom);
			if (result == null)
				result = caseOperationalMappingGroup(java2classAxiom);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.JAVA2CLASS_PKG: {
			java2classPkg java2classPkg = (java2classPkg) theEObject;
			T result = casejava2classPkg(java2classPkg);
			if (result == null)
				result = caseOperationalRuleGroup(java2classPkg);
			if (result == null)
				result = caseOperationalMappingGroup(java2classPkg);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.JAVA2CLASS_CLASS_DECLARATION2_CLASS: {
			java2classClassDeclaration2Class java2classClassDeclaration2Class = (java2classClassDeclaration2Class) theEObject;
			T result = casejava2classClassDeclaration2Class(java2classClassDeclaration2Class);
			if (result == null)
				result = caseOperationalRuleGroup(java2classClassDeclaration2Class);
			if (result == null)
				result = caseOperationalMappingGroup(java2classClassDeclaration2Class);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.JAVA2CLASS_CHILD_PKG: {
			java2classChildPkg java2classChildPkg = (java2classChildPkg) theEObject;
			T result = casejava2classChildPkg(java2classChildPkg);
			if (result == null)
				result = caseOperationalRuleGroup(java2classChildPkg);
			if (result == null)
				result = caseOperationalMappingGroup(java2classChildPkg);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION: {
			java2classField2Association java2classField2Association = (java2classField2Association) theEObject;
			T result = casejava2classField2Association(java2classField2Association);
			if (result == null)
				result = caseOperationalRuleGroup(java2classField2Association);
			if (result == null)
				result = caseOperationalMappingGroup(java2classField2Association);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.JAVA2CLASS_AXIOM_AXIOM: {
			java2classAxiom_axiom java2classAxiom_axiom = (java2classAxiom_axiom) theEObject;
			T result = casejava2classAxiom_axiom(java2classAxiom_axiom);
			if (result == null)
				result = caseOperationalAxiom(java2classAxiom_axiom);
			if (result == null)
				result = caseOperationalMapping(java2classAxiom_axiom);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.JAVA2CLASS_PKG_PKG: {
			java2classPkg_pkg java2classPkg_pkg = (java2classPkg_pkg) theEObject;
			T result = casejava2classPkg_pkg(java2classPkg_pkg);
			if (result == null)
				result = caseOperationalRule(java2classPkg_pkg);
			if (result == null)
				result = caseOperationalMapping(java2classPkg_pkg);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.JAVA2CLASS_CLASS_DECLARATION2_CLASS_JAVA2CLASS_CLASS_DECLARATION2_CLASS: {
			java2classClassDeclaration2Class_java2classClassDeclaration2Class java2classClassDeclaration2Class_java2classClassDeclaration2Class = (java2classClassDeclaration2Class_java2classClassDeclaration2Class) theEObject;
			T result = casejava2classClassDeclaration2Class_java2classClassDeclaration2Class(
					java2classClassDeclaration2Class_java2classClassDeclaration2Class);
			if (result == null)
				result = caseOperationalRule(java2classClassDeclaration2Class_java2classClassDeclaration2Class);
			if (result == null)
				result = caseOperationalMapping(java2classClassDeclaration2Class_java2classClassDeclaration2Class);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.JAVA2CLASS_FIELD2_ASSOCIATION_JAVA2CLASS_FIELD2_ASSOCIATION: {
			java2classField2Association_java2classField2Association java2classField2Association_java2classField2Association = (java2classField2Association_java2classField2Association) theEObject;
			T result = casejava2classField2Association_java2classField2Association(
					java2classField2Association_java2classField2Association);
			if (result == null)
				result = caseOperationalRule(java2classField2Association_java2classField2Association);
			if (result == null)
				result = caseOperationalMapping(java2classField2Association_java2classField2Association);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GeneratedPackage.JAVA2CLASS_CHILD_PKG_CHILD_PKG: {
			java2classChildPkg_childPkg java2classChildPkg_childPkg = (java2classChildPkg_childPkg) theEObject;
			T result = casejava2classChildPkg_childPkg(java2classChildPkg_childPkg);
			if (result == null)
				result = caseOperationalRule(java2classChildPkg_childPkg);
			if (result == null)
				result = caseOperationalMapping(java2classChildPkg_childPkg);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>java2class Operational TGG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>java2class Operational TGG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casejava2classOperationalTGG(java2classOperationalTGG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>java2class Axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>java2class Axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casejava2classAxiom(java2classAxiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>java2class Pkg</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>java2class Pkg</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casejava2classPkg(java2classPkg object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>java2class Class Declaration2 Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>java2class Class Declaration2 Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casejava2classClassDeclaration2Class(java2classClassDeclaration2Class object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>java2class Child Pkg</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>java2class Child Pkg</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casejava2classChildPkg(java2classChildPkg object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>java2class Field2 Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>java2class Field2 Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casejava2classField2Association(java2classField2Association object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>java2class Axiom axiom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>java2class Axiom axiom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casejava2classAxiom_axiom(java2classAxiom_axiom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>java2class Pkg pkg</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>java2class Pkg pkg</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casejava2classPkg_pkg(java2classPkg_pkg object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>java2class Class Declaration2 Class java2class Class Declaration2 Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>java2class Class Declaration2 Class java2class Class Declaration2 Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casejava2classClassDeclaration2Class_java2classClassDeclaration2Class(
			java2classClassDeclaration2Class_java2classClassDeclaration2Class object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>java2class Field2 Association java2class Field2 Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>java2class Field2 Association java2class Field2 Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casejava2classField2Association_java2classField2Association(
			java2classField2Association_java2classField2Association object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>java2class Child Pkg child Pkg</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>java2class Child Pkg child Pkg</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casejava2classChildPkg_childPkg(java2classChildPkg_childPkg object) {
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
