/**
 * generated by Xtext 2.17.1
 */
package org.sodalite.dsl.rM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EValid Values</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.rM.EValid_Values#getVal <em>Val</em>}</li>
 * </ul>
 *
 * @see org.sodalite.dsl.rM.RMPackage#getEValid_Values()
 * @model
 * @generated
 */
public interface EValid_Values extends EConstraint
{
  /**
   * Returns the value of the '<em><b>Val</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Val</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val</em>' containment reference.
   * @see #setVal(ELIST)
   * @see org.sodalite.dsl.rM.RMPackage#getEValid_Values_Val()
   * @model containment="true"
   * @generated
   */
  ELIST getVal();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.EValid_Values#getVal <em>Val</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val</em>' containment reference.
   * @see #getVal()
   * @generated
   */
  void setVal(ELIST value);

} // EValid_Values
