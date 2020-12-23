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

import org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage;
import org.sodalite.sdl.ansible.ansibleDsl.EIndexOrLoopVariable;
import org.sodalite.sdl.ansible.ansibleDsl.EIndexOrLoopVariableReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EIndex Or Loop Variable Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EIndexOrLoopVariableReferenceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EIndexOrLoopVariableReferenceImpl#getTail <em>Tail</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EIndexOrLoopVariableReferenceImpl extends EVariableReferenceImpl implements EIndexOrLoopVariableReference
{
  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected EIndexOrLoopVariable name;

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
  protected EIndexOrLoopVariableReferenceImpl()
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
    return AnsibleDslPackage.Literals.EINDEX_OR_LOOP_VARIABLE_REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EIndexOrLoopVariable getName()
  {
    if (name != null && name.eIsProxy())
    {
      InternalEObject oldName = (InternalEObject)name;
      name = (EIndexOrLoopVariable)eResolveProxy(oldName);
      if (name != oldName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnsibleDslPackage.EINDEX_OR_LOOP_VARIABLE_REFERENCE__NAME, oldName, name));
      }
    }
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EIndexOrLoopVariable basicGetName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(EIndexOrLoopVariable newName)
  {
    EIndexOrLoopVariable oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EINDEX_OR_LOOP_VARIABLE_REFERENCE__NAME, oldName, name));
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
      tail = new EDataTypeEList<String>(String.class, this, AnsibleDslPackage.EINDEX_OR_LOOP_VARIABLE_REFERENCE__TAIL);
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
      case AnsibleDslPackage.EINDEX_OR_LOOP_VARIABLE_REFERENCE__NAME:
        if (resolve) return getName();
        return basicGetName();
      case AnsibleDslPackage.EINDEX_OR_LOOP_VARIABLE_REFERENCE__TAIL:
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
      case AnsibleDslPackage.EINDEX_OR_LOOP_VARIABLE_REFERENCE__NAME:
        setName((EIndexOrLoopVariable)newValue);
        return;
      case AnsibleDslPackage.EINDEX_OR_LOOP_VARIABLE_REFERENCE__TAIL:
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
      case AnsibleDslPackage.EINDEX_OR_LOOP_VARIABLE_REFERENCE__NAME:
        setName((EIndexOrLoopVariable)null);
        return;
      case AnsibleDslPackage.EINDEX_OR_LOOP_VARIABLE_REFERENCE__TAIL:
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
      case AnsibleDslPackage.EINDEX_OR_LOOP_VARIABLE_REFERENCE__NAME:
        return name != null;
      case AnsibleDslPackage.EINDEX_OR_LOOP_VARIABLE_REFERENCE__TAIL:
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

} //EIndexOrLoopVariableReferenceImpl
