/**
 * generated by Xtext 2.19.0
 */
package org.sodalite.dsl.rM.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sodalite.dsl.rM.EPolicyType;
import org.sodalite.dsl.rM.EPolicyTypes;
import org.sodalite.dsl.rM.RMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EPolicy Types</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.rM.impl.EPolicyTypesImpl#getPolicyTypes <em>Policy Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EPolicyTypesImpl extends MinimalEObjectImpl.Container implements EPolicyTypes
{
  /**
   * The cached value of the '{@link #getPolicyTypes() <em>Policy Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPolicyTypes()
   * @generated
   * @ordered
   */
  protected EList<EPolicyType> policyTypes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EPolicyTypesImpl()
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
    return RMPackage.Literals.EPOLICY_TYPES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<EPolicyType> getPolicyTypes()
  {
    if (policyTypes == null)
    {
      policyTypes = new EObjectContainmentEList<EPolicyType>(EPolicyType.class, this, RMPackage.EPOLICY_TYPES__POLICY_TYPES);
    }
    return policyTypes;
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
      case RMPackage.EPOLICY_TYPES__POLICY_TYPES:
        return ((InternalEList<?>)getPolicyTypes()).basicRemove(otherEnd, msgs);
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
      case RMPackage.EPOLICY_TYPES__POLICY_TYPES:
        return getPolicyTypes();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RMPackage.EPOLICY_TYPES__POLICY_TYPES:
        getPolicyTypes().clear();
        getPolicyTypes().addAll((Collection<? extends EPolicyType>)newValue);
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
      case RMPackage.EPOLICY_TYPES__POLICY_TYPES:
        getPolicyTypes().clear();
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
      case RMPackage.EPOLICY_TYPES__POLICY_TYPES:
        return policyTypes != null && !policyTypes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EPolicyTypesImpl
