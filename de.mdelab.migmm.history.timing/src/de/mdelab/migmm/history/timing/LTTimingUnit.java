/**
 */
package de.mdelab.migmm.history.timing;

import de.mdelab.migmm.history.TimingUnit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LT Timing Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.timing.LTTimingUnit#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.timing.TimingPackage#getLTTimingUnit()
 * @model
 * @generated
 */
public interface LTTimingUnit extends TimingUnit {
	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(int)
	 * @see de.mdelab.migmm.history.timing.TimingPackage#getLTTimingUnit_Time()
	 * @model required="true"
	 * @generated
	 */
	int getTime();

	/**
	 * Sets the value of the '{@link de.mdelab.migmm.history.timing.LTTimingUnit#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(int value);

} // LTTimingUnit
