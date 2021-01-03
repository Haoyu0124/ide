/**
 * generated by Xtext 2.23.0
 */
package org.sodalite.sdl.ansible.ansibleDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EPlay</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EPlay#getName <em>Name</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EPlay#getHosts <em>Hosts</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EPlay#getPlay_exe_settings <em>Play exe settings</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EPlay#getPlay_error_handling <em>Play error handling</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EPlay#getFacts_settings <em>Facts settings</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EPlay#getVars_files <em>Vars files</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EPlay#getVars_prompt <em>Vars prompt</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EPlay#getForce_handlers <em>Force handlers</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EPlay#getPlaybook_inclusion <em>Playbook inclusion</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EPlay#getPre_tasks_list <em>Pre tasks list</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EPlay#getRoles_inclusions <em>Roles inclusions</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EPlay#getTasks_list <em>Tasks list</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EPlay#getPost_tasks_list <em>Post tasks list</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EPlay#getHandlers <em>Handlers</em>}</li>
 * </ul>
 *
 * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEPlay()
 * @model
 * @generated
 */
public interface EPlay extends EBase
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(EJinjaExpressionAndString)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEPlay_Name()
   * @model containment="true"
   * @generated
   */
  EJinjaExpressionAndString getName();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EPlay#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(EJinjaExpressionAndString value);

  /**
   * Returns the value of the '<em><b>Hosts</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hosts</em>' containment reference.
   * @see #setHosts(EJinjaExpressionAndString)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEPlay_Hosts()
   * @model containment="true"
   * @generated
   */
  EJinjaExpressionAndString getHosts();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EPlay#getHosts <em>Hosts</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hosts</em>' containment reference.
   * @see #getHosts()
   * @generated
   */
  void setHosts(EJinjaExpressionAndString value);

  /**
   * Returns the value of the '<em><b>Play exe settings</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Play exe settings</em>' containment reference.
   * @see #setPlay_exe_settings(EPlayExeSettings)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEPlay_Play_exe_settings()
   * @model containment="true"
   * @generated
   */
  EPlayExeSettings getPlay_exe_settings();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EPlay#getPlay_exe_settings <em>Play exe settings</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Play exe settings</em>' containment reference.
   * @see #getPlay_exe_settings()
   * @generated
   */
  void setPlay_exe_settings(EPlayExeSettings value);

  /**
   * Returns the value of the '<em><b>Play error handling</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Play error handling</em>' containment reference.
   * @see #setPlay_error_handling(EPlayErrorHandling)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEPlay_Play_error_handling()
   * @model containment="true"
   * @generated
   */
  EPlayErrorHandling getPlay_error_handling();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EPlay#getPlay_error_handling <em>Play error handling</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Play error handling</em>' containment reference.
   * @see #getPlay_error_handling()
   * @generated
   */
  void setPlay_error_handling(EPlayErrorHandling value);

  /**
   * Returns the value of the '<em><b>Facts settings</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Facts settings</em>' containment reference.
   * @see #setFacts_settings(EFactsSettings)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEPlay_Facts_settings()
   * @model containment="true"
   * @generated
   */
  EFactsSettings getFacts_settings();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EPlay#getFacts_settings <em>Facts settings</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Facts settings</em>' containment reference.
   * @see #getFacts_settings()
   * @generated
   */
  void setFacts_settings(EFactsSettings value);

  /**
   * Returns the value of the '<em><b>Vars files</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vars files</em>' containment reference.
   * @see #setVars_files(EListPassed)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEPlay_Vars_files()
   * @model containment="true"
   * @generated
   */
  EListPassed getVars_files();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EPlay#getVars_files <em>Vars files</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vars files</em>' containment reference.
   * @see #getVars_files()
   * @generated
   */
  void setVars_files(EListPassed value);

  /**
   * Returns the value of the '<em><b>Vars prompt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vars prompt</em>' containment reference.
   * @see #setVars_prompt(EListPassed)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEPlay_Vars_prompt()
   * @model containment="true"
   * @generated
   */
  EListPassed getVars_prompt();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EPlay#getVars_prompt <em>Vars prompt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vars prompt</em>' containment reference.
   * @see #getVars_prompt()
   * @generated
   */
  void setVars_prompt(EListPassed value);

  /**
   * Returns the value of the '<em><b>Force handlers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Force handlers</em>' containment reference.
   * @see #setForce_handlers(EBooleanPassed)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEPlay_Force_handlers()
   * @model containment="true"
   * @generated
   */
  EBooleanPassed getForce_handlers();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EPlay#getForce_handlers <em>Force handlers</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Force handlers</em>' containment reference.
   * @see #getForce_handlers()
   * @generated
   */
  void setForce_handlers(EBooleanPassed value);

  /**
   * Returns the value of the '<em><b>Playbook inclusion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Playbook inclusion</em>' containment reference.
   * @see #setPlaybook_inclusion(EPlaybookInclusion)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEPlay_Playbook_inclusion()
   * @model containment="true"
   * @generated
   */
  EPlaybookInclusion getPlaybook_inclusion();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EPlay#getPlaybook_inclusion <em>Playbook inclusion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Playbook inclusion</em>' containment reference.
   * @see #getPlaybook_inclusion()
   * @generated
   */
  void setPlaybook_inclusion(EPlaybookInclusion value);

  /**
   * Returns the value of the '<em><b>Pre tasks list</b></em>' containment reference list.
   * The list contents are of type {@link org.sodalite.sdl.ansible.ansibleDsl.EBlockTask}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pre tasks list</em>' containment reference list.
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEPlay_Pre_tasks_list()
   * @model containment="true"
   * @generated
   */
  EList<EBlockTask> getPre_tasks_list();

  /**
   * Returns the value of the '<em><b>Roles inclusions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Roles inclusions</em>' containment reference.
   * @see #setRoles_inclusions(ERoleInclusions)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEPlay_Roles_inclusions()
   * @model containment="true"
   * @generated
   */
  ERoleInclusions getRoles_inclusions();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EPlay#getRoles_inclusions <em>Roles inclusions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Roles inclusions</em>' containment reference.
   * @see #getRoles_inclusions()
   * @generated
   */
  void setRoles_inclusions(ERoleInclusions value);

  /**
   * Returns the value of the '<em><b>Tasks list</b></em>' containment reference list.
   * The list contents are of type {@link org.sodalite.sdl.ansible.ansibleDsl.EBlockTask}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tasks list</em>' containment reference list.
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEPlay_Tasks_list()
   * @model containment="true"
   * @generated
   */
  EList<EBlockTask> getTasks_list();

  /**
   * Returns the value of the '<em><b>Post tasks list</b></em>' containment reference list.
   * The list contents are of type {@link org.sodalite.sdl.ansible.ansibleDsl.EBlockTask}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Post tasks list</em>' containment reference list.
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEPlay_Post_tasks_list()
   * @model containment="true"
   * @generated
   */
  EList<EBlockTask> getPost_tasks_list();

  /**
   * Returns the value of the '<em><b>Handlers</b></em>' containment reference list.
   * The list contents are of type {@link org.sodalite.sdl.ansible.ansibleDsl.EHandler}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Handlers</em>' containment reference list.
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEPlay_Handlers()
   * @model containment="true"
   * @generated
   */
  EList<EHandler> getHandlers();

} // EPlay
