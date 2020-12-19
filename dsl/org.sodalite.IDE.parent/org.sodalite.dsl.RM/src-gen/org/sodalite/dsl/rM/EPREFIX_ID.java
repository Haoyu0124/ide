/**
 * generated by Xtext 2.23.0
 */
package org.sodalite.dsl.rM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EPREFIX ID</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.rM.EPREFIX_ID#getModule <em>Module</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.EPREFIX_ID#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see org.sodalite.dsl.rM.RMPackage#getEPREFIX_ID()
 * @model
 * @generated
 */
public interface EPREFIX_ID extends EEntityReference
{
  /**
   * Returns the value of the '<em><b>Module</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Module</em>' attribute.
   * @see #setModule(String)
   * @see org.sodalite.dsl.rM.RMPackage#getEPREFIX_ID_Module()
   * @model
   * @generated
   */
  String getModule();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.EPREFIX_ID#getModule <em>Module</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Module</em>' attribute.
   * @see #getModule()
   * @generated
   */
  void setModule(String value);

  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see org.sodalite.dsl.rM.RMPackage#getEPREFIX_ID_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.EPREFIX_ID#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

} // EPREFIX_ID
