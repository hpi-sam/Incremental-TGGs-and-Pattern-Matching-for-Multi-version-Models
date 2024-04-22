/**
 */
package de.mdelab.migmm.history;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>History</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.History#getOwnedElements <em>Owned Elements</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.History#getOwnedIntervals <em>Owned Intervals</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.History#getOwnedTimingUnits <em>Owned Timing Units</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.HistoryPackage#getHistory()
 * @model
 * @generated
 */
public interface History extends ElementWithHistory {
	/**
	 * Returns the value of the '<em><b>Owned Elements</b></em>' containment reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.ElementWithHistory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Elements</em>' containment reference list.
	 * @see de.mdelab.migmm.history.HistoryPackage#getHistory_OwnedElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ElementWithHistory> getOwnedElements();

	/**
	 * Returns the value of the '<em><b>Owned Intervals</b></em>' containment reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.Interval}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Intervals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Intervals</em>' containment reference list.
	 * @see de.mdelab.migmm.history.HistoryPackage#getHistory_OwnedIntervals()
	 * @model containment="true"
	 * @generated
	 */
	EList<Interval> getOwnedIntervals();

	/**
	 * Returns the value of the '<em><b>Owned Timing Units</b></em>' containment reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.TimingUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Timing Units</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Timing Units</em>' containment reference list.
	 * @see de.mdelab.migmm.history.HistoryPackage#getHistory_OwnedTimingUnits()
	 * @model containment="true"
	 * @generated
	 */
	EList<TimingUnit> getOwnedTimingUnits();

} // History
