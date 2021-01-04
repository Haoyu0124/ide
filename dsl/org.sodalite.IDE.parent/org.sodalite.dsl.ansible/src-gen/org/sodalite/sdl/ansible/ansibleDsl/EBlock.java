/**
 * generated by Xtext 2.23.0
 */
package org.sodalite.sdl.ansible.ansibleDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EBlock</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EBlock#getName <em>Name</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EBlock#getError_handling <em>Error handling</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EBlock#getTasks <em>Tasks</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EBlock#getRescue_tasks <em>Rescue tasks</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EBlock#getAlways_tasks <em>Always tasks</em>}</li>
 * </ul>
 *
 * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEBlock()
 * @model
 * @generated
 */
public interface EBlock extends EExecution, EBlockTask
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(EJinjaExpressionAndString)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEBlock_Name()
   * @model containment="true"
   * @generated
   */
  EJinjaExpressionAndString getName();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EBlock#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(EJinjaExpressionAndString value);

  /**
   * Returns the value of the '<em><b>Error handling</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Error handling</em>' containment reference.
   * @see #setError_handling(EBlockAndRoleErrorHandling)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEBlock_Error_handling()
   * @model containment="true"
   * @generated
   */
  EBlockAndRoleErrorHandling getError_handling();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EBlock#getError_handling <em>Error handling</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Error handling</em>' containment reference.
   * @see #getError_handling()
   * @generated
   */
  void setError_handling(EBlockAndRoleErrorHandling value);

  /**
   * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
   * The list contents are of type {@link org.sodalite.sdl.ansible.ansibleDsl.ETask}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tasks</em>' containment reference list.
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEBlock_Tasks()
   * @model containment="true"
   * @generated
   */
  EList<ETask> getTasks();

  /**
   * Returns the value of the '<em><b>Rescue tasks</b></em>' containment reference list.
   * The list contents are of type {@link org.sodalite.sdl.ansible.ansibleDsl.ETask}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rescue tasks</em>' containment reference list.
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEBlock_Rescue_tasks()
   * @model containment="true"
   * @generated
   */
  EList<ETask> getRescue_tasks();

  /**
   * Returns the value of the '<em><b>Always tasks</b></em>' containment reference list.
   * The list contents are of type {@link org.sodalite.sdl.ansible.ansibleDsl.ETask}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Always tasks</em>' containment reference list.
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEBlock_Always_tasks()
   * @model containment="true"
   * @generated
   */
  EList<ETask> getAlways_tasks();

} // EBlock
