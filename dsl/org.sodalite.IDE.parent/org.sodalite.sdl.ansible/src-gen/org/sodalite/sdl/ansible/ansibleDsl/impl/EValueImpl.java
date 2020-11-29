/**
 * generated by Xtext 2.23.0
 */
package org.sodalite.sdl.ansible.ansibleDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage;
import org.sodalite.sdl.ansible.ansibleDsl.EValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EValue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EValueImpl#getValue_string <em>Value string</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EValueImpl#getValue_int <em>Value int</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EValueImpl extends EValuePassedImpl implements EValue
{
  /**
   * The default value of the '{@link #getValue_string() <em>Value string</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue_string()
   * @generated
   * @ordered
   */
  protected static final String VALUE_STRING_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue_string() <em>Value string</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue_string()
   * @generated
   * @ordered
   */
  protected String value_string = VALUE_STRING_EDEFAULT;

  /**
   * The default value of the '{@link #getValue_int() <em>Value int</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue_int()
   * @generated
   * @ordered
   */
  protected static final int VALUE_INT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getValue_int() <em>Value int</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue_int()
   * @generated
   * @ordered
   */
  protected int value_int = VALUE_INT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EValueImpl()
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
    return AnsibleDslPackage.Literals.EVALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getValue_string()
  {
    return value_string;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setValue_string(String newValue_string)
  {
    String oldValue_string = value_string;
    value_string = newValue_string;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EVALUE__VALUE_STRING, oldValue_string, value_string));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getValue_int()
  {
    return value_int;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setValue_int(int newValue_int)
  {
    int oldValue_int = value_int;
    value_int = newValue_int;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EVALUE__VALUE_INT, oldValue_int, value_int));
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
      case AnsibleDslPackage.EVALUE__VALUE_STRING:
        return getValue_string();
      case AnsibleDslPackage.EVALUE__VALUE_INT:
        return getValue_int();
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
      case AnsibleDslPackage.EVALUE__VALUE_STRING:
        setValue_string((String)newValue);
        return;
      case AnsibleDslPackage.EVALUE__VALUE_INT:
        setValue_int((Integer)newValue);
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
      case AnsibleDslPackage.EVALUE__VALUE_STRING:
        setValue_string(VALUE_STRING_EDEFAULT);
        return;
      case AnsibleDslPackage.EVALUE__VALUE_INT:
        setValue_int(VALUE_INT_EDEFAULT);
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
      case AnsibleDslPackage.EVALUE__VALUE_STRING:
        return VALUE_STRING_EDEFAULT == null ? value_string != null : !VALUE_STRING_EDEFAULT.equals(value_string);
      case AnsibleDslPackage.EVALUE__VALUE_INT:
        return value_int != VALUE_INT_EDEFAULT;
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
    result.append(" (value_string: ");
    result.append(value_string);
    result.append(", value_int: ");
    result.append(value_int);
    result.append(')');
    return result.toString();
  }

} //EValueImpl
