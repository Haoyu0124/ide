/**
 * generated by Xtext 2.19.0
 */
package org.sodalite.dsl.rM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ECapabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.rM.ECapabilities#getCapabilities <em>Capabilities</em>}</li>
 * </ul>
 *
 * @see org.sodalite.dsl.rM.RMPackage#getECapabilities()
 * @model
 * @generated
 */
public interface ECapabilities extends EObject
{
  /**
   * Returns the value of the '<em><b>Capabilities</b></em>' containment reference list.
   * The list contents are of type {@link org.sodalite.dsl.rM.ECapabilityDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Capabilities</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Capabilities</em>' containment reference list.
   * @see org.sodalite.dsl.rM.RMPackage#getECapabilities_Capabilities()
   * @model containment="true"
   * @generated
   */
  EList<ECapabilityDefinition> getCapabilities();

} // ECapabilities
