/**
 */
package de.mdelab.migmm.history.tggh.mote2history;

import de.mdelab.mltgg.mote2.TGGEngine;
import de.mdelab.mltgg.mote2.TGGNode;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TGGH Engine</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see de.mdelab.migmm.history.tggh.mote2history.Mote2historyPackage#getTGGHEngine()
 * @model abstract="true"
 * @generated
 */
public interface TGGHEngine extends TGGEngine {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model elementRequired="true" corrNodeRequired="true"
	 * @generated
	 */
	void registerCoveringCorrNode(EObject element, TGGNode corrNode);

} // TGGHEngine
