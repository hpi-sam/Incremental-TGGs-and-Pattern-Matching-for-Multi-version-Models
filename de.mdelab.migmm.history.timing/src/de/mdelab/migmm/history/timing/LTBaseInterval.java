/**
 */
package de.mdelab.migmm.history.timing;

import de.mdelab.migmm.history.Interval;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LT Base Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.timing.LTBaseInterval#getCts <em>Cts</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.timing.LTBaseInterval#getDts <em>Dts</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.timing.TimingPackage#getLTBaseInterval()
 * @model
 * @generated
 */
public interface LTBaseInterval extends Interval {
	/**
	 * Returns the value of the '<em><b>Cts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cts</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cts</em>' attribute.
	 * @see #setCts(int)
	 * @see de.mdelab.migmm.history.timing.TimingPackage#getLTBaseInterval_Cts()
	 * @model required="true"
	 * @generated
	 */
	int getCts();

	/**
	 * Sets the value of the '{@link de.mdelab.migmm.history.timing.LTBaseInterval#getCts <em>Cts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cts</em>' attribute.
	 * @see #getCts()
	 * @generated
	 */
	void setCts(int value);

	/**
	 * Returns the value of the '<em><b>Dts</b></em>' attribute.
	 * The default value is <code>"2147483647"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dts</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dts</em>' attribute.
	 * @see #setDts(int)
	 * @see de.mdelab.migmm.history.timing.TimingPackage#getLTBaseInterval_Dts()
	 * @model default="2147483647" required="true"
	 * @generated
	 */
	int getDts();

	/**
	 * Sets the value of the '{@link de.mdelab.migmm.history.timing.LTBaseInterval#getDts <em>Dts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dts</em>' attribute.
	 * @see #getDts()
	 * @generated
	 */
	void setDts(int value);

} // LTBaseInterval
