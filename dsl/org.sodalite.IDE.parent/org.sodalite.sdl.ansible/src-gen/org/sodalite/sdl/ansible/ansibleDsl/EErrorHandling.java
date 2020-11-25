/**
 * generated by Xtext 2.23.0
 */
package org.sodalite.sdl.ansible.ansibleDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EError Handling</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EErrorHandling#getAny_errors_fatal <em>Any errors fatal</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EErrorHandling#getIgnore_errors <em>Ignore errors</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EErrorHandling#getIgnore_unreachable <em>Ignore unreachable</em>}</li>
 * </ul>
 *
 * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEErrorHandling()
 * @model
 * @generated
 */
public interface EErrorHandling extends EObject
{
  /**
   * Returns the value of the '<em><b>Any errors fatal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Any errors fatal</em>' attribute.
   * @see #setAny_errors_fatal(String)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEErrorHandling_Any_errors_fatal()
   * @model
   * @generated
   */
  String getAny_errors_fatal();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EErrorHandling#getAny_errors_fatal <em>Any errors fatal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Any errors fatal</em>' attribute.
   * @see #getAny_errors_fatal()
   * @generated
   */
  void setAny_errors_fatal(String value);

  /**
   * Returns the value of the '<em><b>Ignore errors</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ignore errors</em>' attribute.
   * @see #setIgnore_errors(String)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEErrorHandling_Ignore_errors()
   * @model
   * @generated
   */
  String getIgnore_errors();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EErrorHandling#getIgnore_errors <em>Ignore errors</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ignore errors</em>' attribute.
   * @see #getIgnore_errors()
   * @generated
   */
  void setIgnore_errors(String value);

  /**
   * Returns the value of the '<em><b>Ignore unreachable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ignore unreachable</em>' attribute.
   * @see #setIgnore_unreachable(String)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEErrorHandling_Ignore_unreachable()
   * @model
   * @generated
   */
  String getIgnore_unreachable();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EErrorHandling#getIgnore_unreachable <em>Ignore unreachable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ignore unreachable</em>' attribute.
   * @see #getIgnore_unreachable()
   * @generated
   */
  void setIgnore_unreachable(String value);

} // EErrorHandling
