/**
 * generated by Xtext 2.23.0
 */
package org.sodalite.sdl.ansible.ansibleDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage;
import org.sodalite.sdl.ansible.ansibleDsl.EBlock;
import org.sodalite.sdl.ansible.ansibleDsl.EBlockErrorHandling;
import org.sodalite.sdl.ansible.ansibleDsl.EJinjaExpressionAndString;
import org.sodalite.sdl.ansible.ansibleDsl.ETask;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EBlock</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EBlockImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EBlockImpl#getBlock_error_handling <em>Block error handling</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EBlockImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EBlockImpl#getRescue_tasks <em>Rescue tasks</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EBlockImpl#getAlways_tasks <em>Always tasks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EBlockImpl extends EExecutionImpl implements EBlock
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
   * The cached value of the '{@link #getBlock_error_handling() <em>Block error handling</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlock_error_handling()
   * @generated
   * @ordered
   */
  protected EBlockErrorHandling block_error_handling;

  /**
   * The cached value of the '{@link #getTasks() <em>Tasks</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTasks()
   * @generated
   * @ordered
   */
  protected EList<ETask> tasks;

  /**
   * The cached value of the '{@link #getRescue_tasks() <em>Rescue tasks</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRescue_tasks()
   * @generated
   * @ordered
   */
  protected EList<ETask> rescue_tasks;

  /**
   * The cached value of the '{@link #getAlways_tasks() <em>Always tasks</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlways_tasks()
   * @generated
   * @ordered
   */
  protected EList<ETask> always_tasks;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EBlockImpl()
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
    return AnsibleDslPackage.Literals.EBLOCK;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EBLOCK__NAME, oldName, newName);
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
        msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EBLOCK__NAME, null, msgs);
      if (newName != null)
        msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EBLOCK__NAME, null, msgs);
      msgs = basicSetName(newName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EBLOCK__NAME, newName, newName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EBlockErrorHandling getBlock_error_handling()
  {
    return block_error_handling;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBlock_error_handling(EBlockErrorHandling newBlock_error_handling, NotificationChain msgs)
  {
    EBlockErrorHandling oldBlock_error_handling = block_error_handling;
    block_error_handling = newBlock_error_handling;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EBLOCK__BLOCK_ERROR_HANDLING, oldBlock_error_handling, newBlock_error_handling);
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
  public void setBlock_error_handling(EBlockErrorHandling newBlock_error_handling)
  {
    if (newBlock_error_handling != block_error_handling)
    {
      NotificationChain msgs = null;
      if (block_error_handling != null)
        msgs = ((InternalEObject)block_error_handling).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EBLOCK__BLOCK_ERROR_HANDLING, null, msgs);
      if (newBlock_error_handling != null)
        msgs = ((InternalEObject)newBlock_error_handling).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EBLOCK__BLOCK_ERROR_HANDLING, null, msgs);
      msgs = basicSetBlock_error_handling(newBlock_error_handling, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EBLOCK__BLOCK_ERROR_HANDLING, newBlock_error_handling, newBlock_error_handling));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ETask> getTasks()
  {
    if (tasks == null)
    {
      tasks = new EObjectContainmentEList<ETask>(ETask.class, this, AnsibleDslPackage.EBLOCK__TASKS);
    }
    return tasks;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ETask> getRescue_tasks()
  {
    if (rescue_tasks == null)
    {
      rescue_tasks = new EObjectContainmentEList<ETask>(ETask.class, this, AnsibleDslPackage.EBLOCK__RESCUE_TASKS);
    }
    return rescue_tasks;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ETask> getAlways_tasks()
  {
    if (always_tasks == null)
    {
      always_tasks = new EObjectContainmentEList<ETask>(ETask.class, this, AnsibleDslPackage.EBLOCK__ALWAYS_TASKS);
    }
    return always_tasks;
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
      case AnsibleDslPackage.EBLOCK__NAME:
        return basicSetName(null, msgs);
      case AnsibleDslPackage.EBLOCK__BLOCK_ERROR_HANDLING:
        return basicSetBlock_error_handling(null, msgs);
      case AnsibleDslPackage.EBLOCK__TASKS:
        return ((InternalEList<?>)getTasks()).basicRemove(otherEnd, msgs);
      case AnsibleDslPackage.EBLOCK__RESCUE_TASKS:
        return ((InternalEList<?>)getRescue_tasks()).basicRemove(otherEnd, msgs);
      case AnsibleDslPackage.EBLOCK__ALWAYS_TASKS:
        return ((InternalEList<?>)getAlways_tasks()).basicRemove(otherEnd, msgs);
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
      case AnsibleDslPackage.EBLOCK__NAME:
        return getName();
      case AnsibleDslPackage.EBLOCK__BLOCK_ERROR_HANDLING:
        return getBlock_error_handling();
      case AnsibleDslPackage.EBLOCK__TASKS:
        return getTasks();
      case AnsibleDslPackage.EBLOCK__RESCUE_TASKS:
        return getRescue_tasks();
      case AnsibleDslPackage.EBLOCK__ALWAYS_TASKS:
        return getAlways_tasks();
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
      case AnsibleDslPackage.EBLOCK__NAME:
        setName((EJinjaExpressionAndString)newValue);
        return;
      case AnsibleDslPackage.EBLOCK__BLOCK_ERROR_HANDLING:
        setBlock_error_handling((EBlockErrorHandling)newValue);
        return;
      case AnsibleDslPackage.EBLOCK__TASKS:
        getTasks().clear();
        getTasks().addAll((Collection<? extends ETask>)newValue);
        return;
      case AnsibleDslPackage.EBLOCK__RESCUE_TASKS:
        getRescue_tasks().clear();
        getRescue_tasks().addAll((Collection<? extends ETask>)newValue);
        return;
      case AnsibleDslPackage.EBLOCK__ALWAYS_TASKS:
        getAlways_tasks().clear();
        getAlways_tasks().addAll((Collection<? extends ETask>)newValue);
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
      case AnsibleDslPackage.EBLOCK__NAME:
        setName((EJinjaExpressionAndString)null);
        return;
      case AnsibleDslPackage.EBLOCK__BLOCK_ERROR_HANDLING:
        setBlock_error_handling((EBlockErrorHandling)null);
        return;
      case AnsibleDslPackage.EBLOCK__TASKS:
        getTasks().clear();
        return;
      case AnsibleDslPackage.EBLOCK__RESCUE_TASKS:
        getRescue_tasks().clear();
        return;
      case AnsibleDslPackage.EBLOCK__ALWAYS_TASKS:
        getAlways_tasks().clear();
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
      case AnsibleDslPackage.EBLOCK__NAME:
        return name != null;
      case AnsibleDslPackage.EBLOCK__BLOCK_ERROR_HANDLING:
        return block_error_handling != null;
      case AnsibleDslPackage.EBLOCK__TASKS:
        return tasks != null && !tasks.isEmpty();
      case AnsibleDslPackage.EBLOCK__RESCUE_TASKS:
        return rescue_tasks != null && !rescue_tasks.isEmpty();
      case AnsibleDslPackage.EBLOCK__ALWAYS_TASKS:
        return always_tasks != null && !always_tasks.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EBlockImpl
