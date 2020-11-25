/**
 * generated by Xtext 2.23.0
 */
package org.sodalite.sdl.ansible.ansibleDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EBase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EBase#getName <em>Name</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EBase#getBase_common_keywords <em>Base common keywords</em>}</li>
 * </ul>
 *
 * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEBase()
 * @model
 * @generated
 */
public interface EBase extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEBase_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EBase#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Base common keywords</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Base common keywords</em>' containment reference.
   * @see #setBase_common_keywords(EBaseCommonKeywords)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEBase_Base_common_keywords()
   * @model containment="true"
   * @generated
   */
  EBaseCommonKeywords getBase_common_keywords();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EBase#getBase_common_keywords <em>Base common keywords</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Base common keywords</em>' containment reference.
   * @see #getBase_common_keywords()
   * @generated
   */
  void setBase_common_keywords(EBaseCommonKeywords value);

} // EBase
