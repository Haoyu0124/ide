/**
 * generated by Xtext 2.17.1
 */
package org.sodalite.dsl.rM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ERelationship Types</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.rM.ERelationshipTypes#getRelationshipTypes <em>Relationship Types</em>}</li>
 * </ul>
 *
 * @see org.sodalite.dsl.rM.RMPackage#getERelationshipTypes()
 * @model
 * @generated
 */
public interface ERelationshipTypes extends EObject
{
  /**
   * Returns the value of the '<em><b>Relationship Types</b></em>' containment reference list.
   * The list contents are of type {@link org.sodalite.dsl.rM.ERelationshipType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relationship Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relationship Types</em>' containment reference list.
   * @see org.sodalite.dsl.rM.RMPackage#getERelationshipTypes_RelationshipTypes()
   * @model containment="true"
   * @generated
   */
  EList<ERelationshipType> getRelationshipTypes();

} // ERelationshipTypes
