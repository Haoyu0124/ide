/**
 * generated by Xtext 2.23.0
 */
package org.sodalite.sdl.ansible.ansibleDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EValue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EValue#getValue_string <em>Value string</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EValue#getValue_int <em>Value int</em>}</li>
 * </ul>
 *
 * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEValue()
 * @model
 * @generated
 */
public interface EValue extends EValuePassed
{
  /**
   * Returns the value of the '<em><b>Value string</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value string</em>' attribute.
   * @see #setValue_string(String)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEValue_Value_string()
   * @model
   * @generated
   */
  String getValue_string();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EValue#getValue_string <em>Value string</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value string</em>' attribute.
   * @see #getValue_string()
   * @generated
   */
  void setValue_string(String value);

  /**
   * Returns the value of the '<em><b>Value int</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value int</em>' attribute.
   * @see #setValue_int(int)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEValue_Value_int()
   * @model
   * @generated
   */
  int getValue_int();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EValue#getValue_int <em>Value int</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value int</em>' attribute.
   * @see #getValue_int()
   * @generated
   */
  void setValue_int(int value);

} // EValue
