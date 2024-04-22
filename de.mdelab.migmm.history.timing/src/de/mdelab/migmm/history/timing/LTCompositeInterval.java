/**
 */
package de.mdelab.migmm.history.timing;

import de.mdelab.migmm.history.Interval;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LT Composite Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.timing.LTCompositeInterval#getBaseIntervals <em>Base Intervals</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.timing.TimingPackage#getLTCompositeInterval()
 * @model
 * @generated
 */
public interface LTCompositeInterval extends Interval {
	/**
	 * Returns the value of the '<em><b>Base Intervals</b></em>' reference list.
	 * The list contents are of type {@link de.mdelab.migmm.history.timing.LTBaseInterval}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Intervals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Intervals</em>' reference list.
	 * @see de.mdelab.migmm.history.timing.TimingPackage#getLTCompositeInterval_BaseIntervals()
	 * @model
	 * @generated
	 */
	EList<LTBaseInterval> getBaseIntervals();

} // LTCompositeInterval
