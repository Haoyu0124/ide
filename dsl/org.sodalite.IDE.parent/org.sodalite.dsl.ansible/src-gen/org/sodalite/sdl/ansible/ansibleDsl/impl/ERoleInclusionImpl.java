/**
 * generated by Xtext 2.23.0
 */
package org.sodalite.sdl.ansible.ansibleDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage;
import org.sodalite.sdl.ansible.ansibleDsl.EBlockAndRoleErrorHandling;
import org.sodalite.sdl.ansible.ansibleDsl.EJinjaExpressionAndString;
import org.sodalite.sdl.ansible.ansibleDsl.ERoleInclusion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ERole Inclusion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.ERoleInclusionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.ERoleInclusionImpl#getError_handling <em>Error handling</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ERoleInclusionImpl extends EExecutionImpl implements ERoleInclusion
{
  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected EJinjaExpressionAndString name;

  /**
   * The cached value of the '{@link #getError_handling() <em>Error handling</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getError_handling()
   * @generated
   * @ordered
   */
  protected EBlockAndRoleErrorHandling error_handling;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ERoleInclusionImpl()
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
    return AnsibleDslPackage.Literals.EROLE_INCLUSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EJinjaExpressionAndString getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetName(EJinjaExpressionAndString newName, NotificationChain msgs)
  {
    EJinjaExpressionAndString oldName = name;
    name = newName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EROLE_INCLUSION__NAME, oldName, newName);
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
  public void setName(EJinjaExpressionAndString newName)
  {
    if (newName != name)
    {
      NotificationChain msgs = null;
      if (name != null)
        msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EROLE_INCLUSION__NAME, null, msgs);
      if (newName != null)
        msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EROLE_INCLUSION__NAME, null, msgs);
      msgs = basicSetName(newName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EROLE_INCLUSION__NAME, newName, newName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EBlockAndRoleErrorHandling getError_handling()
  {
    return error_handling;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetError_handling(EBlockAndRoleErrorHandling newError_handling, NotificationChain msgs)
  {
    EBlockAndRoleErrorHandling oldError_handling = error_handling;
    error_handling = newError_handling;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EROLE_INCLUSION__ERROR_HANDLING, oldError_handling, newError_handling);
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
  public void setError_handling(EBlockAndRoleErrorHandling newError_handling)
  {
    if (newError_handling != error_handling)
    {
      NotificationChain msgs = null;
      if (error_handling != null)
        msgs = ((InternalEObject)error_handling).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EROLE_INCLUSION__ERROR_HANDLING, null, msgs);
      if (newError_handling != null)
        msgs = ((InternalEObject)newError_handling).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EROLE_INCLUSION__ERROR_HANDLING, null, msgs);
      msgs = basicSetError_handling(newError_handling, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EROLE_INCLUSION__ERROR_HANDLING, newError_handling, newError_handling));
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
      case AnsibleDslPackage.EROLE_INCLUSION__NAME:
        return basicSetName(null, msgs);
      case AnsibleDslPackage.EROLE_INCLUSION__ERROR_HANDLING:
        return basicSetError_handling(null, msgs);
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
      case AnsibleDslPackage.EROLE_INCLUSION__NAME:
        return getName();
      case AnsibleDslPackage.EROLE_INCLUSION__ERROR_HANDLING:
        return getError_handling();
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
      case AnsibleDslPackage.EROLE_INCLUSION__NAME:
        setName((EJinjaExpressionAndString)newValue);
        return;
      case AnsibleDslPackage.EROLE_INCLUSION__ERROR_HANDLING:
        setError_handling((EBlockAndRoleErrorHandling)newValue);
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
      case AnsibleDslPackage.EROLE_INCLUSION__NAME:
        setName((EJinjaExpressionAndString)null);
        return;
      case AnsibleDslPackage.EROLE_INCLUSION__ERROR_HANDLING:
        setError_handling((EBlockAndRoleErrorHandling)null);
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
      case AnsibleDslPackage.EROLE_INCLUSION__NAME:
        return name != null;
      case AnsibleDslPackage.EROLE_INCLUSION__ERROR_HANDLING:
        return error_handling != null;
    }
    return super.eIsSet(featureID);
  }

} //ERoleInclusionImpl
