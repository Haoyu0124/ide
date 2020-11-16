/**
 * generated by Xtext 2.22.0
 */
package org.sodalite.dsl.rM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RM Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.rM.RM_Model#getModule <em>Module</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.RM_Model#getImports <em>Imports</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.RM_Model#getDataTypes <em>Data Types</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.RM_Model#getArtifactTypes <em>Artifact Types</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.RM_Model#getCapabilityTypes <em>Capability Types</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.RM_Model#getInterfaceTypes <em>Interface Types</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.RM_Model#getRelationshipTypes <em>Relationship Types</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.RM_Model#getNodeTypes <em>Node Types</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.RM_Model#getPolicyTypes <em>Policy Types</em>}</li>
 * </ul>
 *
 * @see org.sodalite.dsl.rM.RMPackage#getRM_Model()
 * @model
 * @generated
 */
public interface RM_Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Module</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Module</em>' attribute.
   * @see #setModule(String)
   * @see org.sodalite.dsl.rM.RMPackage#getRM_Model_Module()
   * @model
   * @generated
   */
  String getModule();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.RM_Model#getModule <em>Module</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Module</em>' attribute.
   * @see #getModule()
   * @generated
   */
  void setModule(String value);

  /**
   * Returns the value of the '<em><b>Imports</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' attribute list.
   * @see org.sodalite.dsl.rM.RMPackage#getRM_Model_Imports()
   * @model unique="false"
   * @generated
   */
  EList<String> getImports();

  /**
   * Returns the value of the '<em><b>Data Types</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Types</em>' containment reference.
   * @see #setDataTypes(EDataTypes)
   * @see org.sodalite.dsl.rM.RMPackage#getRM_Model_DataTypes()
   * @model containment="true"
   * @generated
   */
  EDataTypes getDataTypes();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.RM_Model#getDataTypes <em>Data Types</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data Types</em>' containment reference.
   * @see #getDataTypes()
   * @generated
   */
  void setDataTypes(EDataTypes value);

  /**
   * Returns the value of the '<em><b>Artifact Types</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Artifact Types</em>' containment reference.
   * @see #setArtifactTypes(EArtifactTypes)
   * @see org.sodalite.dsl.rM.RMPackage#getRM_Model_ArtifactTypes()
   * @model containment="true"
   * @generated
   */
  EArtifactTypes getArtifactTypes();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.RM_Model#getArtifactTypes <em>Artifact Types</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Artifact Types</em>' containment reference.
   * @see #getArtifactTypes()
   * @generated
   */
  void setArtifactTypes(EArtifactTypes value);

  /**
   * Returns the value of the '<em><b>Capability Types</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Capability Types</em>' containment reference.
   * @see #setCapabilityTypes(ECapabilityTypes)
   * @see org.sodalite.dsl.rM.RMPackage#getRM_Model_CapabilityTypes()
   * @model containment="true"
   * @generated
   */
  ECapabilityTypes getCapabilityTypes();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.RM_Model#getCapabilityTypes <em>Capability Types</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Capability Types</em>' containment reference.
   * @see #getCapabilityTypes()
   * @generated
   */
  void setCapabilityTypes(ECapabilityTypes value);

  /**
   * Returns the value of the '<em><b>Interface Types</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interface Types</em>' containment reference.
   * @see #setInterfaceTypes(EInterfaceTypes)
   * @see org.sodalite.dsl.rM.RMPackage#getRM_Model_InterfaceTypes()
   * @model containment="true"
   * @generated
   */
  EInterfaceTypes getInterfaceTypes();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.RM_Model#getInterfaceTypes <em>Interface Types</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interface Types</em>' containment reference.
   * @see #getInterfaceTypes()
   * @generated
   */
  void setInterfaceTypes(EInterfaceTypes value);

  /**
   * Returns the value of the '<em><b>Relationship Types</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relationship Types</em>' containment reference.
   * @see #setRelationshipTypes(ERelationshipTypes)
   * @see org.sodalite.dsl.rM.RMPackage#getRM_Model_RelationshipTypes()
   * @model containment="true"
   * @generated
   */
  ERelationshipTypes getRelationshipTypes();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.RM_Model#getRelationshipTypes <em>Relationship Types</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Relationship Types</em>' containment reference.
   * @see #getRelationshipTypes()
   * @generated
   */
  void setRelationshipTypes(ERelationshipTypes value);

  /**
   * Returns the value of the '<em><b>Node Types</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Node Types</em>' containment reference.
   * @see #setNodeTypes(ENodeTypes)
   * @see org.sodalite.dsl.rM.RMPackage#getRM_Model_NodeTypes()
   * @model containment="true"
   * @generated
   */
  ENodeTypes getNodeTypes();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.RM_Model#getNodeTypes <em>Node Types</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Node Types</em>' containment reference.
   * @see #getNodeTypes()
   * @generated
   */
  void setNodeTypes(ENodeTypes value);

  /**
   * Returns the value of the '<em><b>Policy Types</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Policy Types</em>' containment reference.
   * @see #setPolicyTypes(EPolicyTypes)
   * @see org.sodalite.dsl.rM.RMPackage#getRM_Model_PolicyTypes()
   * @model containment="true"
   * @generated
   */
  EPolicyTypes getPolicyTypes();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.RM_Model#getPolicyTypes <em>Policy Types</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Policy Types</em>' containment reference.
   * @see #getPolicyTypes()
   * @generated
   */
  void setPolicyTypes(EPolicyTypes value);

} // RM_Model
