/**
 * generated by Xtext 2.23.0
 */
package org.sodalite.sdl.ansible.ansibleDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EFiltered Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EFilteredVariable#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EFilteredVariable#getIndex <em>Index</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EFilteredVariable#getTail <em>Tail</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.EFilteredVariable#getFilter_commands <em>Filter commands</em>}</li>
 * </ul>
 *
 * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEFilteredVariable()
 * @model
 * @generated
 */
public interface EFilteredVariable extends ELoopList, EFilteredVariableOrString
{
  /**
   * Returns the value of the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' reference.
   * @see #setVariable(EDeclaredVariable)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEFilteredVariable_Variable()
   * @model
   * @generated
   */
  EDeclaredVariable getVariable();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EFilteredVariable#getVariable <em>Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(EDeclaredVariable value);

  /**
   * Returns the value of the '<em><b>Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Index</em>' attribute.
   * @see #setIndex(int)
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEFilteredVariable_Index()
   * @model
   * @generated
   */
  int getIndex();

  /**
   * Sets the value of the '{@link org.sodalite.sdl.ansible.ansibleDsl.EFilteredVariable#getIndex <em>Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Index</em>' attribute.
   * @see #getIndex()
   * @generated
   */
  void setIndex(int value);

  /**
   * Returns the value of the '<em><b>Tail</b></em>' containment reference list.
   * The list contents are of type {@link org.sodalite.sdl.ansible.ansibleDsl.EDictionaryPairReference}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tail</em>' containment reference list.
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEFilteredVariable_Tail()
   * @model containment="true"
   * @generated
   */
  EList<EDictionaryPairReference> getTail();

  /**
   * Returns the value of the '<em><b>Filter commands</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Filter commands</em>' attribute list.
   * @see org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage#getEFilteredVariable_Filter_commands()
   * @model unique="false"
   * @generated
   */
  EList<String> getFilter_commands();

} // EFilteredVariable
