/**
 * generated by Xtext 2.23.0
 */
package org.sodalite.sdl.ansible.ansibleDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage;
import org.sodalite.sdl.ansible.ansibleDsl.EDelegation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EDelegation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EDelegationImpl#getDelegate_to <em>Delegate to</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EDelegationImpl#getDelegate_facts <em>Delegate facts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EDelegationImpl extends MinimalEObjectImpl.Container implements EDelegation
{
  /**
   * The default value of the '{@link #getDelegate_to() <em>Delegate to</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDelegate_to()
   * @generated
   * @ordered
   */
  protected static final String DELEGATE_TO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDelegate_to() <em>Delegate to</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDelegate_to()
   * @generated
   * @ordered
   */
  protected String delegate_to = DELEGATE_TO_EDEFAULT;

  /**
   * The default value of the '{@link #getDelegate_facts() <em>Delegate facts</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDelegate_facts()
   * @generated
   * @ordered
   */
  protected static final String DELEGATE_FACTS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDelegate_facts() <em>Delegate facts</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDelegate_facts()
   * @generated
   * @ordered
   */
  protected String delegate_facts = DELEGATE_FACTS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EDelegationImpl()
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
    return AnsibleDslPackage.Literals.EDELEGATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDelegate_to()
  {
    return delegate_to;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDelegate_to(String newDelegate_to)
  {
    String oldDelegate_to = delegate_to;
    delegate_to = newDelegate_to;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EDELEGATION__DELEGATE_TO, oldDelegate_to, delegate_to));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDelegate_facts()
  {
    return delegate_facts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDelegate_facts(String newDelegate_facts)
  {
    String oldDelegate_facts = delegate_facts;
    delegate_facts = newDelegate_facts;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EDELEGATION__DELEGATE_FACTS, oldDelegate_facts, delegate_facts));
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
      case AnsibleDslPackage.EDELEGATION__DELEGATE_TO:
        return getDelegate_to();
      case AnsibleDslPackage.EDELEGATION__DELEGATE_FACTS:
        return getDelegate_facts();
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
      case AnsibleDslPackage.EDELEGATION__DELEGATE_TO:
        setDelegate_to((String)newValue);
        return;
      case AnsibleDslPackage.EDELEGATION__DELEGATE_FACTS:
        setDelegate_facts((String)newValue);
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
      case AnsibleDslPackage.EDELEGATION__DELEGATE_TO:
        setDelegate_to(DELEGATE_TO_EDEFAULT);
        return;
      case AnsibleDslPackage.EDELEGATION__DELEGATE_FACTS:
        setDelegate_facts(DELEGATE_FACTS_EDEFAULT);
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
      case AnsibleDslPackage.EDELEGATION__DELEGATE_TO:
        return DELEGATE_TO_EDEFAULT == null ? delegate_to != null : !DELEGATE_TO_EDEFAULT.equals(delegate_to);
      case AnsibleDslPackage.EDELEGATION__DELEGATE_FACTS:
        return DELEGATE_FACTS_EDEFAULT == null ? delegate_facts != null : !DELEGATE_FACTS_EDEFAULT.equals(delegate_facts);
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (delegate_to: ");
    result.append(delegate_to);
    result.append(", delegate_facts: ");
    result.append(delegate_facts);
    result.append(')');
    return result.toString();
  }

} //EDelegationImpl
