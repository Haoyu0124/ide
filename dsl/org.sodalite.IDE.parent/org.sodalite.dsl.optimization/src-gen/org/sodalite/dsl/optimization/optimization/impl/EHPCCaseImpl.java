/**
 * generated by Xtext 2.19.0
 */
package org.sodalite.dsl.optimization.optimization.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.sodalite.dsl.optimization.optimization.EHPC;
import org.sodalite.dsl.optimization.optimization.EHPCCase;
import org.sodalite.dsl.optimization.optimization.OptimizationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EHPC Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.impl.EHPCCaseImpl#getHpc <em>Hpc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EHPCCaseImpl extends EOptimizationCasesImpl implements EHPCCase
{
  /**
   * The cached value of the '{@link #getHpc() <em>Hpc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHpc()
   * @generated
   * @ordered
   */
  protected EHPC hpc;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EHPCCaseImpl()
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
    return OptimizationPackage.Literals.EHPC_CASE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EHPC getHpc()
  {
    return hpc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHpc(EHPC newHpc, NotificationChain msgs)
  {
    EHPC oldHpc = hpc;
    hpc = newHpc;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OptimizationPackage.EHPC_CASE__HPC, oldHpc, newHpc);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHpc(EHPC newHpc)
  {
    if (newHpc != hpc)
    {
      NotificationChain msgs = null;
      if (hpc != null)
        msgs = ((InternalEObject)hpc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OptimizationPackage.EHPC_CASE__HPC, null, msgs);
      if (newHpc != null)
        msgs = ((InternalEObject)newHpc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OptimizationPackage.EHPC_CASE__HPC, null, msgs);
      msgs = basicSetHpc(newHpc, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptimizationPackage.EHPC_CASE__HPC, newHpc, newHpc));
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
      case OptimizationPackage.EHPC_CASE__HPC:
        return basicSetHpc(null, msgs);
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
      case OptimizationPackage.EHPC_CASE__HPC:
        return getHpc();
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
      case OptimizationPackage.EHPC_CASE__HPC:
        setHpc((EHPC)newValue);
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
      case OptimizationPackage.EHPC_CASE__HPC:
        setHpc((EHPC)null);
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
      case OptimizationPackage.EHPC_CASE__HPC:
        return hpc != null;
    }
    return super.eIsSet(featureID);
  }

} //EHPCCaseImpl
