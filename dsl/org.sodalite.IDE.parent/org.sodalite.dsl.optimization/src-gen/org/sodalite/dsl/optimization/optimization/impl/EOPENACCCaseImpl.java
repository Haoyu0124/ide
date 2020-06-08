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

import org.sodalite.dsl.optimization.optimization.EOPENACC;
import org.sodalite.dsl.optimization.optimization.EOPENACCCase;
import org.sodalite.dsl.optimization.optimization.OptimizationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EOPENACC Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.impl.EOPENACCCaseImpl#getOpenacc <em>Openacc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EOPENACCCaseImpl extends MinimalEObjectImpl.Container implements EOPENACCCase
{
  /**
   * The cached value of the '{@link #getOpenacc() <em>Openacc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpenacc()
   * @generated
   * @ordered
   */
  protected EOPENACC openacc;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EOPENACCCaseImpl()
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
    return OptimizationPackage.Literals.EOPENACC_CASE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EOPENACC getOpenacc()
  {
    return openacc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOpenacc(EOPENACC newOpenacc, NotificationChain msgs)
  {
    EOPENACC oldOpenacc = openacc;
    openacc = newOpenacc;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OptimizationPackage.EOPENACC_CASE__OPENACC, oldOpenacc, newOpenacc);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOpenacc(EOPENACC newOpenacc)
  {
    if (newOpenacc != openacc)
    {
      NotificationChain msgs = null;
      if (openacc != null)
        msgs = ((InternalEObject)openacc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OptimizationPackage.EOPENACC_CASE__OPENACC, null, msgs);
      if (newOpenacc != null)
        msgs = ((InternalEObject)newOpenacc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OptimizationPackage.EOPENACC_CASE__OPENACC, null, msgs);
      msgs = basicSetOpenacc(newOpenacc, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptimizationPackage.EOPENACC_CASE__OPENACC, newOpenacc, newOpenacc));
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
      case OptimizationPackage.EOPENACC_CASE__OPENACC:
        return basicSetOpenacc(null, msgs);
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
      case OptimizationPackage.EOPENACC_CASE__OPENACC:
        return getOpenacc();
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
      case OptimizationPackage.EOPENACC_CASE__OPENACC:
        setOpenacc((EOPENACC)newValue);
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
      case OptimizationPackage.EOPENACC_CASE__OPENACC:
        setOpenacc((EOPENACC)null);
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
      case OptimizationPackage.EOPENACC_CASE__OPENACC:
        return openacc != null;
    }
    return super.eIsSet(featureID);
  }

} //EOPENACCCaseImpl
