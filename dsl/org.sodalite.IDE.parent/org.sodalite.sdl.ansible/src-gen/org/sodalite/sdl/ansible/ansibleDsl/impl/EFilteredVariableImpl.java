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
import org.sodalite.sdl.ansible.ansibleDsl.EDeclaredVariable;
import org.sodalite.sdl.ansible.ansibleDsl.EFilteredVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EFiltered Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EFilteredVariableImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EFilteredVariableImpl#getFilter_commands <em>Filter commands</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EFilteredVariableImpl extends ELoopListImpl implements EFilteredVariable
{
  /**
   * The cached value of the '{@link #getVariable() <em>Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected EDeclaredVariable variable;

  /**
   * The cached value of the '{@link #getFilter_commands() <em>Filter commands</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilter_commands()
   * @generated
   * @ordered
   */
  protected EList<String> filter_commands;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EFilteredVariableImpl()
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
    return AnsibleDslPackage.Literals.EFILTERED_VARIABLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EDeclaredVariable getVariable()
  {
    if (variable != null && variable.eIsProxy())
    {
      InternalEObject oldVariable = (InternalEObject)variable;
      variable = (EDeclaredVariable)eResolveProxy(oldVariable);
      if (variable != oldVariable)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnsibleDslPackage.EFILTERED_VARIABLE__VARIABLE, oldVariable, variable));
      }
    }
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDeclaredVariable basicGetVariable()
  {
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVariable(EDeclaredVariable newVariable)
  {
    EDeclaredVariable oldVariable = variable;
    variable = newVariable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EFILTERED_VARIABLE__VARIABLE, oldVariable, variable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getFilter_commands()
  {
    if (filter_commands == null)
    {
      filter_commands = new EDataTypeEList<String>(String.class, this, AnsibleDslPackage.EFILTERED_VARIABLE__FILTER_COMMANDS);
    }
    return filter_commands;
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
      case AnsibleDslPackage.EFILTERED_VARIABLE__VARIABLE:
        if (resolve) return getVariable();
        return basicGetVariable();
      case AnsibleDslPackage.EFILTERED_VARIABLE__FILTER_COMMANDS:
        return getFilter_commands();
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
      case AnsibleDslPackage.EFILTERED_VARIABLE__VARIABLE:
        setVariable((EDeclaredVariable)newValue);
        return;
      case AnsibleDslPackage.EFILTERED_VARIABLE__FILTER_COMMANDS:
        getFilter_commands().clear();
        getFilter_commands().addAll((Collection<? extends String>)newValue);
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
      case AnsibleDslPackage.EFILTERED_VARIABLE__VARIABLE:
        setVariable((EDeclaredVariable)null);
        return;
      case AnsibleDslPackage.EFILTERED_VARIABLE__FILTER_COMMANDS:
        getFilter_commands().clear();
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
      case AnsibleDslPackage.EFILTERED_VARIABLE__VARIABLE:
        return variable != null;
      case AnsibleDslPackage.EFILTERED_VARIABLE__FILTER_COMMANDS:
        return filter_commands != null && !filter_commands.isEmpty();
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
    result.append(" (filter_commands: ");
    result.append(filter_commands);
    result.append(')');
    return result.toString();
  }

} //EFilteredVariableImpl
