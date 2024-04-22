/**
 */
package de.mdelab.migmm.history.impl;

import de.mdelab.migmm.history.ContainmentEdgeWithHistory;
import de.mdelab.migmm.history.HistoryPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Containment Edge With History</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ContainmentEdgeWithHistoryImpl extends EdgeWithHistoryImpl implements ContainmentEdgeWithHistory {
	
	/**
	 * The cached value of the '{@link #isIsContainment() <em>Is Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsContainment()
	 * @generated not
	 * @ordered
	 */
	protected boolean isContainment = true;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainmentEdgeWithHistoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HistoryPackage.Literals.CONTAINMENT_EDGE_WITH_HISTORY;
	}

} //ContainmentEdgeWithHistoryImpl
