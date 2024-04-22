/**
 */
package de.mdelab.migmm.history;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element With History</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.migmm.history.ElementWithHistory#getValidIn <em>Valid In</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.ElementWithHistory#getUnhandled <em>Unhandled</em>}</li>
 *   <li>{@link de.mdelab.migmm.history.ElementWithHistory#isInProjection <em>In Projection</em>}</li>
 * </ul>
 *
 * @see de.mdelab.migmm.history.HistoryPackage#getElementWithHistory()
 * @model abstract="true"
 * @generated
 */
public interface ElementWithHistory extends EObject {
	/**
	 * Returns the value of the '<em><b>Valid In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valid In</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid In</em>' containment reference.
	 * @see #setValidIn(Interval)
	 * @see de.mdelab.migmm.history.HistoryPackage#getElementWithHistory_ValidIn()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Interval getValidIn();

	/**
	 * Sets the value of the '{@link de.mdelab.migmm.history.ElementWithHistory#getValidIn <em>Valid In</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid In</em>' containment reference.
	 * @see #getValidIn()
	 * @generated
	 */
	void setValidIn(Interval value);

	/**
	 * Returns the value of the '<em><b>Unhandled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unhandled</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unhandled</em>' containment reference.
	 * @see #setUnhandled(Interval)
	 * @see de.mdelab.migmm.history.HistoryPackage#getElementWithHistory_Unhandled()
	 * @model containment="true"
	 * @generated
	 */
	Interval getUnhandled();

	/**
	 * Sets the value of the '{@link de.mdelab.migmm.history.ElementWithHistory#getUnhandled <em>Unhandled</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unhandled</em>' containment reference.
	 * @see #getUnhandled()
	 * @generated
	 */
	void setUnhandled(Interval value);

	/**
	 * Returns the value of the '<em><b>In Projection</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Projection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Projection</em>' attribute.
	 * @see #setInProjection(boolean)
	 * @see de.mdelab.migmm.history.HistoryPackage#getElementWithHistory_InProjection()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isInProjection();

	/**
	 * Sets the value of the '{@link de.mdelab.migmm.history.ElementWithHistory#isInProjection <em>In Projection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Projection</em>' attribute.
	 * @see #isInProjection()
	 * @generated
	 */
	void setInProjection(boolean value);

} // ElementWithHistory
