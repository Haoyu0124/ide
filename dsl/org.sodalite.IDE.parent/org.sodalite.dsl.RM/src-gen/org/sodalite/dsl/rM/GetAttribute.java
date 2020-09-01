/**
 * generated by Xtext 2.17.1
 */
package org.sodalite.dsl.rM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.rM.GetAttribute#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @see org.sodalite.dsl.rM.RMPackage#getGetAttribute()
 * @model
 * @generated
 */
public interface GetAttribute extends EFunction
{
  /**
   * Returns the value of the '<em><b>Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute</em>' containment reference.
   * @see #setAttribute(GetAttributeBody)
   * @see org.sodalite.dsl.rM.RMPackage#getGetAttribute_Attribute()
   * @model containment="true"
   * @generated
   */
  GetAttributeBody getAttribute();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.GetAttribute#getAttribute <em>Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute</em>' containment reference.
   * @see #getAttribute()
   * @generated
   */
  void setAttribute(GetAttributeBody value);

} // GetAttribute
