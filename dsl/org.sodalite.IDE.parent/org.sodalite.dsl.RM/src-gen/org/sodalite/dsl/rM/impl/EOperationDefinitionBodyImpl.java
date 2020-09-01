/**
 * generated by Xtext 2.17.1
 */
package org.sodalite.dsl.rM.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.sodalite.dsl.rM.EImplementation;
import org.sodalite.dsl.rM.EInputs;
import org.sodalite.dsl.rM.EOperationDefinitionBody;
import org.sodalite.dsl.rM.RMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EOperation Definition Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.rM.impl.EOperationDefinitionBodyImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.impl.EOperationDefinitionBodyImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.impl.EOperationDefinitionBodyImpl#getImplementation <em>Implementation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EOperationDefinitionBodyImpl extends MinimalEObjectImpl.Container implements EOperationDefinitionBody
{
  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInputs()
   * @generated
   * @ordered
   */
  protected EInputs inputs;

  /**
   * The cached value of the '{@link #getImplementation() <em>Implementation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImplementation()
   * @generated
   * @ordered
   */
  protected EImplementation implementation;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EOperationDefinitionBodyImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return RMPackage.Literals.EOPERATION_DEFINITION_BODY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RMPackage.EOPERATION_DEFINITION_BODY__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EInputs getInputs()
  {
    return inputs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInputs(EInputs newInputs, NotificationChain msgs)
  {
    EInputs oldInputs = inputs;
    inputs = newInputs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RMPackage.EOPERATION_DEFINITION_BODY__INPUTS, oldInputs, newInputs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInputs(EInputs newInputs)
  {
    if (newInputs != inputs)
    {
      NotificationChain msgs = null;
      if (inputs != null)
        msgs = ((InternalEObject)inputs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RMPackage.EOPERATION_DEFINITION_BODY__INPUTS, null, msgs);
      if (newInputs != null)
        msgs = ((InternalEObject)newInputs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RMPackage.EOPERATION_DEFINITION_BODY__INPUTS, null, msgs);
      msgs = basicSetInputs(newInputs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RMPackage.EOPERATION_DEFINITION_BODY__INPUTS, newInputs, newInputs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EImplementation getImplementation()
  {
    return implementation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetImplementation(EImplementation newImplementation, NotificationChain msgs)
  {
    EImplementation oldImplementation = implementation;
    implementation = newImplementation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RMPackage.EOPERATION_DEFINITION_BODY__IMPLEMENTATION, oldImplementation, newImplementation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImplementation(EImplementation newImplementation)
  {
    if (newImplementation != implementation)
    {
      NotificationChain msgs = null;
      if (implementation != null)
        msgs = ((InternalEObject)implementation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RMPackage.EOPERATION_DEFINITION_BODY__IMPLEMENTATION, null, msgs);
      if (newImplementation != null)
        msgs = ((InternalEObject)newImplementation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RMPackage.EOPERATION_DEFINITION_BODY__IMPLEMENTATION, null, msgs);
      msgs = basicSetImplementation(newImplementation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RMPackage.EOPERATION_DEFINITION_BODY__IMPLEMENTATION, newImplementation, newImplementation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case RMPackage.EOPERATION_DEFINITION_BODY__INPUTS:
        return basicSetInputs(null, msgs);
      case RMPackage.EOPERATION_DEFINITION_BODY__IMPLEMENTATION:
        return basicSetImplementation(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case RMPackage.EOPERATION_DEFINITION_BODY__DESCRIPTION:
        return getDescription();
      case RMPackage.EOPERATION_DEFINITION_BODY__INPUTS:
        return getInputs();
      case RMPackage.EOPERATION_DEFINITION_BODY__IMPLEMENTATION:
        return getImplementation();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RMPackage.EOPERATION_DEFINITION_BODY__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case RMPackage.EOPERATION_DEFINITION_BODY__INPUTS:
        setInputs((EInputs)newValue);
        return;
      case RMPackage.EOPERATION_DEFINITION_BODY__IMPLEMENTATION:
        setImplementation((EImplementation)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case RMPackage.EOPERATION_DEFINITION_BODY__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case RMPackage.EOPERATION_DEFINITION_BODY__INPUTS:
        setInputs((EInputs)null);
        return;
      case RMPackage.EOPERATION_DEFINITION_BODY__IMPLEMENTATION:
        setImplementation((EImplementation)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case RMPackage.EOPERATION_DEFINITION_BODY__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case RMPackage.EOPERATION_DEFINITION_BODY__INPUTS:
        return inputs != null;
      case RMPackage.EOPERATION_DEFINITION_BODY__IMPLEMENTATION:
        return implementation != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (description: ");
    result.append(description);
    result.append(')');
    return result.toString();
  }

} //EOperationDefinitionBodyImpl
