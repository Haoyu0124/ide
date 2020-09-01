/**
 * generated by Xtext 2.17.1
 */
package org.sodalite.dsl.rM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ECapability Type Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.rM.ECapabilityTypeBody#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.ECapabilityTypeBody#getDescription <em>Description</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.ECapabilityTypeBody#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.ECapabilityTypeBody#getAtributes <em>Atributes</em>}</li>
 * </ul>
 *
 * @see org.sodalite.dsl.rM.RMPackage#getECapabilityTypeBody()
 * @model
 * @generated
 */
public interface ECapabilityTypeBody extends EObject
{
  /**
   * Returns the value of the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Type</em>' reference.
   * @see #setSuperType(ECapabilityType)
   * @see org.sodalite.dsl.rM.RMPackage#getECapabilityTypeBody_SuperType()
   * @model
   * @generated
   */
  ECapabilityType getSuperType();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.ECapabilityTypeBody#getSuperType <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Type</em>' reference.
   * @see #getSuperType()
   * @generated
   */
  void setSuperType(ECapabilityType value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see org.sodalite.dsl.rM.RMPackage#getECapabilityTypeBody_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.ECapabilityTypeBody#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference.
   * @see #setProperties(EProperties)
   * @see org.sodalite.dsl.rM.RMPackage#getECapabilityTypeBody_Properties()
   * @model containment="true"
   * @generated
   */
  EProperties getProperties();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.ECapabilityTypeBody#getProperties <em>Properties</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Properties</em>' containment reference.
   * @see #getProperties()
   * @generated
   */
  void setProperties(EProperties value);

  /**
   * Returns the value of the '<em><b>Atributes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Atributes</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Atributes</em>' containment reference.
   * @see #setAtributes(EAttributes)
   * @see org.sodalite.dsl.rM.RMPackage#getECapabilityTypeBody_Atributes()
   * @model containment="true"
   * @generated
   */
  EAttributes getAtributes();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.ECapabilityTypeBody#getAtributes <em>Atributes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Atributes</em>' containment reference.
   * @see #getAtributes()
   * @generated
   */
  void setAtributes(EAttributes value);

} // ECapabilityTypeBody
