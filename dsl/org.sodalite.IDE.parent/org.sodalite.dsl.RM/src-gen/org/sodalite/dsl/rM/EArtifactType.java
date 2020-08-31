/**
 * generated by Xtext 2.19.0
 */
package org.sodalite.dsl.rM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EArtifact Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.rM.EArtifactType#getName <em>Name</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.EArtifactType#getArtifact <em>Artifact</em>}</li>
 * </ul>
 *
 * @see org.sodalite.dsl.rM.RMPackage#getEArtifactType()
 * @model
 * @generated
 */
public interface EArtifactType extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.sodalite.dsl.rM.RMPackage#getEArtifactType_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.EArtifactType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Artifact</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Artifact</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Artifact</em>' containment reference.
   * @see #setArtifact(EArtifactTypeBody)
   * @see org.sodalite.dsl.rM.RMPackage#getEArtifactType_Artifact()
   * @model containment="true"
   * @generated
   */
  EArtifactTypeBody getArtifact();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.EArtifactType#getArtifact <em>Artifact</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Artifact</em>' containment reference.
   * @see #getArtifact()
   * @generated
   */
  void setArtifact(EArtifactTypeBody value);

} // EArtifactType
