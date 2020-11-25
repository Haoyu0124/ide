/**
 * generated by Xtext 2.23.0
 */
package org.sodalite.sdl.ansible.ansibleDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ETask Handler Error Handling</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.ETaskHandlerErrorHandling#getChanged_when <em>Changed when</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.ETaskHandlerErrorHandling#getFailed_when <em>Failed when</em>}</li>
 * </ul>
 *
 * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getETaskHandlerErrorHandling()
 * @model
 * @generated
 */
public interface ETaskHandlerErrorHandling extends EErrorHandling
{
  /**
   * Returns the value of the '<em><b>Changed when</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Changed when</em>' containment reference.
   * @see #setChanged_when(EConditionalExpression)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getETaskHandlerErrorHandling_Changed_when()
   * @model containment="true"
   * @generated
   */
  EConditionalExpression getChanged_when();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.ETaskHandlerErrorHandling#getChanged_when <em>Changed when</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Changed when</em>' containment reference.
   * @see #getChanged_when()
   * @generated
   */
  void setChanged_when(EConditionalExpression value);

  /**
   * Returns the value of the '<em><b>Failed when</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Failed when</em>' containment reference.
   * @see #setFailed_when(EConditionalExpression)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getETaskHandlerErrorHandling_Failed_when()
   * @model containment="true"
   * @generated
   */
  EConditionalExpression getFailed_when();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.ETaskHandlerErrorHandling#getFailed_when <em>Failed when</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Failed when</em>' containment reference.
   * @see #getFailed_when()
   * @generated
   */
  void setFailed_when(EConditionalExpression value);

} // ETaskHandlerErrorHandling
