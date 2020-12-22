/**
 * generated by Xtext 2.23.0
 */
package org.sodalite.sdl.ansible.ansibleDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.sodalite.dsl.rM.EPropertyDefinition;

import org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage;
import org.sodalite.sdl.ansible.ansibleDsl.EInputInterfaceVariableReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EInput Interface Variable Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EInputInterfaceVariableReferenceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EInputInterfaceVariableReferenceImpl#getTail <em>Tail</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EInputInterfaceVariableReferenceImpl extends EVariableReferenceImpl implements EInputInterfaceVariableReference
{
  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected EPropertyDefinition name;

  /**
   * The cached value of the '{@link #getTail() <em>Tail</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTail()
   * @generated
   * @ordered
   */
  protected EList<String> tail;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EInputInterfaceVariableReferenceImpl()
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
    return AnsibleDslPackage.Literals.EINPUT_INTERFACE_VARIABLE_REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EPropertyDefinition getName()
  {
    if (name != null && name.eIsProxy())
    {
      InternalEObject oldName = (InternalEObject)name;
      name = (EPropertyDefinition)eResolveProxy(oldName);
      if (name != oldName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnsibleDslPackage.EINPUT_INTERFACE_VARIABLE_REFERENCE__NAME, oldName, name));
      }
    }
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EPropertyDefinition basicGetName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(EPropertyDefinition newName)
  {
    EPropertyDefinition oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EINPUT_INTERFACE_VARIABLE_REFERENCE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getTail()
  {
    if (tail == null)
    {
      tail = new EDataTypeEList<String>(String.class, this, AnsibleDslPackage.EINPUT_INTERFACE_VARIABLE_REFERENCE__TAIL);
    }
    return tail;
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
      case AnsibleDslPackage.EINPUT_INTERFACE_VARIABLE_REFERENCE__NAME:
        if (resolve) return getName();
        return basicGetName();
      case AnsibleDslPackage.EINPUT_INTERFACE_VARIABLE_REFERENCE__TAIL:
        return getTail();
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
      case AnsibleDslPackage.EINPUT_INTERFACE_VARIABLE_REFERENCE__NAME:
        setName((EPropertyDefinition)newValue);
        return;
      case AnsibleDslPackage.EINPUT_INTERFACE_VARIABLE_REFERENCE__TAIL:
        getTail().clear();
        getTail().addAll((Collection<? extends String>)newValue);
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
      case AnsibleDslPackage.EINPUT_INTERFACE_VARIABLE_REFERENCE__NAME:
        setName((EPropertyDefinition)null);
        return;
      case AnsibleDslPackage.EINPUT_INTERFACE_VARIABLE_REFERENCE__TAIL:
        getTail().clear();
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
      case AnsibleDslPackage.EINPUT_INTERFACE_VARIABLE_REFERENCE__NAME:
        return name != null;
      case AnsibleDslPackage.EINPUT_INTERFACE_VARIABLE_REFERENCE__TAIL:
        return tail != null && !tail.isEmpty();
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
    result.append(" (tail: ");
    result.append(tail);
    result.append(')');
    return result.toString();
  }

} //EInputInterfaceVariableReferenceImpl
