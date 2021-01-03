/**
 * generated by Xtext 2.23.0
 */
package org.sodalite.sdl.ansible.ansibleDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage;
import org.sodalite.sdl.ansible.ansibleDsl.EEmptyCurlyBraces;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EEmpty Curly Braces</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EEmptyCurlyBracesImpl#getLeft_curly_brace <em>Left curly brace</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EEmptyCurlyBracesImpl#getRight_curly_brace <em>Right curly brace</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EEmptyCurlyBracesImpl extends EValuePassedToJinjaExpressionImpl implements EEmptyCurlyBraces
{
  /**
   * The default value of the '{@link #getLeft_curly_brace() <em>Left curly brace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft_curly_brace()
   * @generated
   * @ordered
   */
  protected static final String LEFT_CURLY_BRACE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLeft_curly_brace() <em>Left curly brace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft_curly_brace()
   * @generated
   * @ordered
   */
  protected String left_curly_brace = LEFT_CURLY_BRACE_EDEFAULT;

  /**
   * The default value of the '{@link #getRight_curly_brace() <em>Right curly brace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight_curly_brace()
   * @generated
   * @ordered
   */
  protected static final String RIGHT_CURLY_BRACE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRight_curly_brace() <em>Right curly brace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight_curly_brace()
   * @generated
   * @ordered
   */
  protected String right_curly_brace = RIGHT_CURLY_BRACE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EEmptyCurlyBracesImpl()
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
    return AnsibleDslPackage.Literals.EEMPTY_CURLY_BRACES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLeft_curly_brace()
  {
    return left_curly_brace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLeft_curly_brace(String newLeft_curly_brace)
  {
    String oldLeft_curly_brace = left_curly_brace;
    left_curly_brace = newLeft_curly_brace;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EEMPTY_CURLY_BRACES__LEFT_CURLY_BRACE, oldLeft_curly_brace, left_curly_brace));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getRight_curly_brace()
  {
    return right_curly_brace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRight_curly_brace(String newRight_curly_brace)
  {
    String oldRight_curly_brace = right_curly_brace;
    right_curly_brace = newRight_curly_brace;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EEMPTY_CURLY_BRACES__RIGHT_CURLY_BRACE, oldRight_curly_brace, right_curly_brace));
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
      case AnsibleDslPackage.EEMPTY_CURLY_BRACES__LEFT_CURLY_BRACE:
        return getLeft_curly_brace();
      case AnsibleDslPackage.EEMPTY_CURLY_BRACES__RIGHT_CURLY_BRACE:
        return getRight_curly_brace();
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
      case AnsibleDslPackage.EEMPTY_CURLY_BRACES__LEFT_CURLY_BRACE:
        setLeft_curly_brace((String)newValue);
        return;
      case AnsibleDslPackage.EEMPTY_CURLY_BRACES__RIGHT_CURLY_BRACE:
        setRight_curly_brace((String)newValue);
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
      case AnsibleDslPackage.EEMPTY_CURLY_BRACES__LEFT_CURLY_BRACE:
        setLeft_curly_brace(LEFT_CURLY_BRACE_EDEFAULT);
        return;
      case AnsibleDslPackage.EEMPTY_CURLY_BRACES__RIGHT_CURLY_BRACE:
        setRight_curly_brace(RIGHT_CURLY_BRACE_EDEFAULT);
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
      case AnsibleDslPackage.EEMPTY_CURLY_BRACES__LEFT_CURLY_BRACE:
        return LEFT_CURLY_BRACE_EDEFAULT == null ? left_curly_brace != null : !LEFT_CURLY_BRACE_EDEFAULT.equals(left_curly_brace);
      case AnsibleDslPackage.EEMPTY_CURLY_BRACES__RIGHT_CURLY_BRACE:
        return RIGHT_CURLY_BRACE_EDEFAULT == null ? right_curly_brace != null : !RIGHT_CURLY_BRACE_EDEFAULT.equals(right_curly_brace);
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
    result.append(" (left_curly_brace: ");
    result.append(left_curly_brace);
    result.append(", right_curly_brace: ");
    result.append(right_curly_brace);
    result.append(')');
    return result.toString();
  }

} //EEmptyCurlyBracesImpl
