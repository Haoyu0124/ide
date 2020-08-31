/**
 * generated by Xtext 2.19.0
 */
package org.sodalite.dsl.optimization.optimization.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.sodalite.dsl.optimization.optimization.EOptimization;
import org.sodalite.dsl.optimization.optimization.OptimizationPackage;
import org.sodalite.dsl.optimization.optimization.Optimization_Model;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Optimization Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.impl.Optimization_ModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.impl.Optimization_ModelImpl#getOptimization <em>Optimization</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Optimization_ModelImpl extends MinimalEObjectImpl.Container implements Optimization_Model
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getOptimization() <em>Optimization</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOptimization()
   * @generated
   * @ordered
   */
  protected EOptimization optimization;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Optimization_ModelImpl()
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
    return OptimizationPackage.Literals.OPTIMIZATION_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptimizationPackage.OPTIMIZATION_MODEL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOptimization getOptimization()
  {
    return optimization;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOptimization(EOptimization newOptimization, NotificationChain msgs)
  {
    EOptimization oldOptimization = optimization;
    optimization = newOptimization;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OptimizationPackage.OPTIMIZATION_MODEL__OPTIMIZATION, oldOptimization, newOptimization);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOptimization(EOptimization newOptimization)
  {
    if (newOptimization != optimization)
    {
      NotificationChain msgs = null;
      if (optimization != null)
        msgs = ((InternalEObject)optimization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OptimizationPackage.OPTIMIZATION_MODEL__OPTIMIZATION, null, msgs);
      if (newOptimization != null)
        msgs = ((InternalEObject)newOptimization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OptimizationPackage.OPTIMIZATION_MODEL__OPTIMIZATION, null, msgs);
      msgs = basicSetOptimization(newOptimization, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptimizationPackage.OPTIMIZATION_MODEL__OPTIMIZATION, newOptimization, newOptimization));
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
      case OptimizationPackage.OPTIMIZATION_MODEL__OPTIMIZATION:
        return basicSetOptimization(null, msgs);
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
      case OptimizationPackage.OPTIMIZATION_MODEL__NAME:
        return getName();
      case OptimizationPackage.OPTIMIZATION_MODEL__OPTIMIZATION:
        return getOptimization();
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
      case OptimizationPackage.OPTIMIZATION_MODEL__NAME:
        setName((String)newValue);
        return;
      case OptimizationPackage.OPTIMIZATION_MODEL__OPTIMIZATION:
        setOptimization((EOptimization)newValue);
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
      case OptimizationPackage.OPTIMIZATION_MODEL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case OptimizationPackage.OPTIMIZATION_MODEL__OPTIMIZATION:
        setOptimization((EOptimization)null);
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
      case OptimizationPackage.OPTIMIZATION_MODEL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case OptimizationPackage.OPTIMIZATION_MODEL__OPTIMIZATION:
        return optimization != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //Optimization_ModelImpl
