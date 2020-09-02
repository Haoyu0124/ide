/**
 * generated by Xtext 2.19.0
 */
package org.sodalite.dsl.optimization.optimization;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EHPC Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.EHPCCase#getHpc <em>Hpc</em>}</li>
 * </ul>
 *
 * @see org.sodalite.dsl.optimization.optimization.OptimizationPackage#getEHPCCase()
 * @model
 * @generated
 */
public interface EHPCCase extends EOptimizationCases
{
  /**
   * Returns the value of the '<em><b>Hpc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hpc</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hpc</em>' containment reference.
   * @see #setHpc(EHPC)
   * @see org.sodalite.dsl.optimization.optimization.OptimizationPackage#getEHPCCase_Hpc()
   * @model containment="true"
   * @generated
   */
  EHPC getHpc();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.optimization.optimization.EHPCCase#getHpc <em>Hpc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hpc</em>' containment reference.
   * @see #getHpc()
   * @generated
   */
  void setHpc(EHPC value);

} // EHPCCase
