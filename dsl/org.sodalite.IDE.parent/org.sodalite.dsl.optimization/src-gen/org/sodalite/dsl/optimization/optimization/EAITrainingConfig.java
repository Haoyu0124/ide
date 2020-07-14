/**
 * generated by Xtext 2.17.1
 */
package org.sodalite.dsl.optimization.optimization;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EAI Training Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.EAITrainingConfig#getAi_framework <em>Ai framework</em>}</li>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.EAITrainingConfig#getType <em>Type</em>}</li>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.EAITrainingConfig#isDistributed_training <em>Distributed training</em>}</li>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.EAITrainingConfig#getLayers <em>Layers</em>}</li>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.EAITrainingConfig#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see org.sodalite.dsl.optimization.optimization.OptimizationPackage#getEAITrainingConfig()
 * @model
 * @generated
 */
public interface EAITrainingConfig extends EObject
{
  /**
   * Returns the value of the '<em><b>Ai framework</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ai framework</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ai framework</em>' attribute.
   * @see #setAi_framework(String)
   * @see org.sodalite.dsl.optimization.optimization.OptimizationPackage#getEAITrainingConfig_Ai_framework()
   * @model
   * @generated
   */
  String getAi_framework();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.optimization.optimization.EAITrainingConfig#getAi_framework <em>Ai framework</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ai framework</em>' attribute.
   * @see #getAi_framework()
   * @generated
   */
  void setAi_framework(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see org.sodalite.dsl.optimization.optimization.OptimizationPackage#getEAITrainingConfig_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.optimization.optimization.EAITrainingConfig#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Distributed training</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Distributed training</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Distributed training</em>' attribute.
   * @see #setDistributed_training(boolean)
   * @see org.sodalite.dsl.optimization.optimization.OptimizationPackage#getEAITrainingConfig_Distributed_training()
   * @model
   * @generated
   */
  boolean isDistributed_training();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.optimization.optimization.EAITrainingConfig#isDistributed_training <em>Distributed training</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Distributed training</em>' attribute.
   * @see #isDistributed_training()
   * @generated
   */
  void setDistributed_training(boolean value);

  /**
   * Returns the value of the '<em><b>Layers</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Layers</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Layers</em>' attribute.
   * @see #setLayers(int)
   * @see org.sodalite.dsl.optimization.optimization.OptimizationPackage#getEAITrainingConfig_Layers()
   * @model
   * @generated
   */
  int getLayers();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.optimization.optimization.EAITrainingConfig#getLayers <em>Layers</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Layers</em>' attribute.
   * @see #getLayers()
   * @generated
   */
  void setLayers(int value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' attribute.
   * @see #setParameters(int)
   * @see org.sodalite.dsl.optimization.optimization.OptimizationPackage#getEAITrainingConfig_Parameters()
   * @model
   * @generated
   */
  int getParameters();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.optimization.optimization.EAITrainingConfig#getParameters <em>Parameters</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameters</em>' attribute.
   * @see #getParameters()
   * @generated
   */
  void setParameters(int value);

} // EAITrainingConfig
