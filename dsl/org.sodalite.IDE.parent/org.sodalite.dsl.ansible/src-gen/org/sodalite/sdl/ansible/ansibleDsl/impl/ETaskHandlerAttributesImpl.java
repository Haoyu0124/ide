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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage;
import org.sodalite.sdl.ansible.ansibleDsl.EAsynchronousSettings;
import org.sodalite.sdl.ansible.ansibleDsl.EDictionary;
import org.sodalite.sdl.ansible.ansibleDsl.ELoop;
import org.sodalite.sdl.ansible.ansibleDsl.EModuleCall;
import org.sodalite.sdl.ansible.ansibleDsl.ENotifiable;
import org.sodalite.sdl.ansible.ansibleDsl.ERegisterVariable;
import org.sodalite.sdl.ansible.ansibleDsl.ETaskHandlerAttributes;
import org.sodalite.sdl.ansible.ansibleDsl.ETaskHandlerErrorHandling;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ETask Handler Attributes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.ETaskHandlerAttributesImpl#getError_handling <em>Error handling</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.ETaskHandlerAttributesImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.ETaskHandlerAttributesImpl#getAsynchronous_settings <em>Asynchronous settings</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.ETaskHandlerAttributesImpl#getArgs <em>Args</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.ETaskHandlerAttributesImpl#getModule <em>Module</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.ETaskHandlerAttributesImpl#getNotifiables <em>Notifiables</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.ETaskHandlerAttributesImpl#getLoop <em>Loop</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.ETaskHandlerAttributesImpl#getRegister <em>Register</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ETaskHandlerAttributesImpl extends MinimalEObjectImpl.Container implements ETaskHandlerAttributes
{
  /**
   * The cached value of the '{@link #getError_handling() <em>Error handling</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getError_handling()
   * @generated
   * @ordered
   */
  protected ETaskHandlerErrorHandling error_handling;

  /**
   * The default value of the '{@link #getAction() <em>Action</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAction()
   * @generated
   * @ordered
   */
  protected static final String ACTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAction() <em>Action</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAction()
   * @generated
   * @ordered
   */
  protected String action = ACTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getAsynchronous_settings() <em>Asynchronous settings</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAsynchronous_settings()
   * @generated
   * @ordered
   */
  protected EAsynchronousSettings asynchronous_settings;

  /**
   * The cached value of the '{@link #getArgs() <em>Args</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgs()
   * @generated
   * @ordered
   */
  protected EDictionary args;

  /**
   * The cached value of the '{@link #getModule() <em>Module</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModule()
   * @generated
   * @ordered
   */
  protected EModuleCall module;

  /**
   * The cached value of the '{@link #getNotifiables() <em>Notifiables</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNotifiables()
   * @generated
   * @ordered
   */
  protected EList<ENotifiable> notifiables;

  /**
   * The cached value of the '{@link #getLoop() <em>Loop</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLoop()
   * @generated
   * @ordered
   */
  protected ELoop loop;

  /**
   * The cached value of the '{@link #getRegister() <em>Register</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRegister()
   * @generated
   * @ordered
   */
  protected ERegisterVariable register;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ETaskHandlerAttributesImpl()
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
    return AnsibleDslPackage.Literals.ETASK_HANDLER_ATTRIBUTES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ETaskHandlerErrorHandling getError_handling()
  {
    return error_handling;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetError_handling(ETaskHandlerErrorHandling newError_handling, NotificationChain msgs)
  {
    ETaskHandlerErrorHandling oldError_handling = error_handling;
    error_handling = newError_handling;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.ETASK_HANDLER_ATTRIBUTES__ERROR_HANDLING, oldError_handling, newError_handling);
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
  public void setError_handling(ETaskHandlerErrorHandling newError_handling)
  {
    if (newError_handling != error_handling)
    {
      NotificationChain msgs = null;
      if (error_handling != null)
        msgs = ((InternalEObject)error_handling).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.ETASK_HANDLER_ATTRIBUTES__ERROR_HANDLING, null, msgs);
      if (newError_handling != null)
        msgs = ((InternalEObject)newError_handling).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.ETASK_HANDLER_ATTRIBUTES__ERROR_HANDLING, null, msgs);
      msgs = basicSetError_handling(newError_handling, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.ETASK_HANDLER_ATTRIBUTES__ERROR_HANDLING, newError_handling, newError_handling));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getAction()
  {
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAction(String newAction)
  {
    String oldAction = action;
    action = newAction;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.ETASK_HANDLER_ATTRIBUTES__ACTION, oldAction, action));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAsynchronousSettings getAsynchronous_settings()
  {
    return asynchronous_settings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAsynchronous_settings(EAsynchronousSettings newAsynchronous_settings, NotificationChain msgs)
  {
    EAsynchronousSettings oldAsynchronous_settings = asynchronous_settings;
    asynchronous_settings = newAsynchronous_settings;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.ETASK_HANDLER_ATTRIBUTES__ASYNCHRONOUS_SETTINGS, oldAsynchronous_settings, newAsynchronous_settings);
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
  public void setAsynchronous_settings(EAsynchronousSettings newAsynchronous_settings)
  {
    if (newAsynchronous_settings != asynchronous_settings)
    {
      NotificationChain msgs = null;
      if (asynchronous_settings != null)
        msgs = ((InternalEObject)asynchronous_settings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.ETASK_HANDLER_ATTRIBUTES__ASYNCHRONOUS_SETTINGS, null, msgs);
      if (newAsynchronous_settings != null)
        msgs = ((InternalEObject)newAsynchronous_settings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.ETASK_HANDLER_ATTRIBUTES__ASYNCHRONOUS_SETTINGS, null, msgs);
      msgs = basicSetAsynchronous_settings(newAsynchronous_settings, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.ETASK_HANDLER_ATTRIBUTES__ASYNCHRONOUS_SETTINGS, newAsynchronous_settings, newAsynchronous_settings));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EDictionary getArgs()
  {
    return args;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArgs(EDictionary newArgs, NotificationChain msgs)
  {
    EDictionary oldArgs = args;
    args = newArgs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.ETASK_HANDLER_ATTRIBUTES__ARGS, oldArgs, newArgs);
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
  public void setArgs(EDictionary newArgs)
  {
    if (newArgs != args)
    {
      NotificationChain msgs = null;
      if (args != null)
        msgs = ((InternalEObject)args).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.ETASK_HANDLER_ATTRIBUTES__ARGS, null, msgs);
      if (newArgs != null)
        msgs = ((InternalEObject)newArgs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.ETASK_HANDLER_ATTRIBUTES__ARGS, null, msgs);
      msgs = basicSetArgs(newArgs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.ETASK_HANDLER_ATTRIBUTES__ARGS, newArgs, newArgs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EModuleCall getModule()
  {
    return module;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetModule(EModuleCall newModule, NotificationChain msgs)
  {
    EModuleCall oldModule = module;
    module = newModule;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.ETASK_HANDLER_ATTRIBUTES__MODULE, oldModule, newModule);
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
  public void setModule(EModuleCall newModule)
  {
    if (newModule != module)
    {
      NotificationChain msgs = null;
      if (module != null)
        msgs = ((InternalEObject)module).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.ETASK_HANDLER_ATTRIBUTES__MODULE, null, msgs);
      if (newModule != null)
        msgs = ((InternalEObject)newModule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.ETASK_HANDLER_ATTRIBUTES__MODULE, null, msgs);
      msgs = basicSetModule(newModule, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.ETASK_HANDLER_ATTRIBUTES__MODULE, newModule, newModule));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ENotifiable> getNotifiables()
  {
    if (notifiables == null)
    {
      notifiables = new EObjectContainmentEList<ENotifiable>(ENotifiable.class, this, AnsibleDslPackage.ETASK_HANDLER_ATTRIBUTES__NOTIFIABLES);
    }
    return notifiables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ELoop getLoop()
  {
    return loop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLoop(ELoop newLoop, NotificationChain msgs)
  {
    ELoop oldLoop = loop;
    loop = newLoop;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.ETASK_HANDLER_ATTRIBUTES__LOOP, oldLoop, newLoop);
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
  public void setLoop(ELoop newLoop)
  {
    if (newLoop != loop)
    {
      NotificationChain msgs = null;
      if (loop != null)
        msgs = ((InternalEObject)loop).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.ETASK_HANDLER_ATTRIBUTES__LOOP, null, msgs);
      if (newLoop != null)
        msgs = ((InternalEObject)newLoop).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.ETASK_HANDLER_ATTRIBUTES__LOOP, null, msgs);
      msgs = basicSetLoop(newLoop, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.ETASK_HANDLER_ATTRIBUTES__LOOP, newLoop, newLoop));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ERegisterVariable getRegister()
  {
    return register;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRegister(ERegisterVariable newRegister, NotificationChain msgs)
  {
    ERegisterVariable oldRegister = register;
    register = newRegister;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.ETASK_HANDLER_ATTRIBUTES__REGISTER, oldRegister, newRegister);
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
  public void setRegister(ERegisterVariable newRegister)
  {
    if (newRegister != register)
    {
      NotificationChain msgs = null;
      if (register != null)
        msgs = ((InternalEObject)register).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.ETASK_HANDLER_ATTRIBUTES__REGISTER, null, msgs);
      if (newRegister != null)
        msgs = ((InternalEObject)newRegister).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.ETASK_HANDLER_ATTRIBUTES__REGISTER, null, msgs);
      msgs = basicSetRegister(newRegister, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.ETASK_HANDLER_ATTRIBUTES__REGISTER, newRegister, newRegister));
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
      case AnsibleDslPackage.ETASK_HANDLER_ATTRIBUTES__ERROR_HANDLING:
        return basicSetError_handling(null, msgs);
      case AnsibleDslPackage.ETASK_HANDLER_ATTRIBUTES__ASYNCHRONOUS_SETTINGS:
        return basicSetAsynchronous_settings(null, msgs);
      case AnsibleDslPackage.ETASK_HANDLER_ATTRIBUTES__ARGS:
        return basicSetArgs(null, msgs);
      case AnsibleDslPackage.ETASK_HANDLER_ATTRIBUTES__MODULE:
        return basicSetModule(null, msgs);
      case AnsibleDslPackage.ETASK_HANDLER_ATTRIBUTES__NOTIFIABLES:
        return ((InternalEList<?>)getNotifiables()).basicRemove(otherEnd, msgs);
      case AnsibleDslPackage.ETASK_HANDLER_ATTRIBUTES__LOOP:
        return basicSetLoop(null, msgs);
      case AnsibleDslPackage.ETASK_HANDLER_ATTRIBUTES__REGISTER:
        return basicSetRegister(null, msgs);
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
      case AnsibleDslPackage.ETASK_HANDLER_ATTRIBUTES__ERROR_HANDLING:
        return getError_handling();
      case AnsibleDslPackage.ETASK_HANDLER_ATTRIBUTES__ACTION:
        return getAction();
      case AnsibleDslPackage.ETASK_HANDLER_ATTRIBUTES__ASYNCHRONOUS_SETTINGS:
        return getAsynchronous_settings();
      case AnsibleDslPackage.ETASK_HANDLER_ATTRIBUTES__ARGS:
        return getArgs();
      case AnsibleDslPackage.ETASK_HANDLER_ATTRIBUTES__MODULE:
        return getModule();
      case AnsibleDslPackage.ETASK_HANDLER_ATTRIBUTES__NOTIFIABLES:
        return getNotifiables();
      case AnsibleDslPackage.ETASK_HANDLER_ATTRIBUTES__LOOP:
        return getLoop();
      case AnsibleDslPackage.ETASK_HANDLER_ATTRIBUTES__REGISTER:
        return getRegister();
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
      case AnsibleDslPackage.ETASK_HANDLER_ATTRIBUTES__ERROR_HANDLING:
        setError_handling((ETaskHandlerErrorHandling)newValue);
        return;
      case AnsibleDslPackage.ETASK_HANDLER_ATTRIBUTES__ACTION:
        setAction((String)newValue);
        return;
      case AnsibleDslPackage.ETASK_HANDLER_ATTRIBUTES__ASYNCHRONOUS_SETTINGS:
        setAsynchronous_settings((EAsynchronousSettings)newValue);
        return;
      case AnsibleDslPackage.ETASK_HANDLER_ATTRIBUTES__ARGS:
        setArgs((EDictionary)newValue);
        return;
      case AnsibleDslPackage.ETASK_HANDLER_ATTRIBUTES__MODULE:
        setModule((EModuleCall)newValue);
        return;
      case AnsibleDslPackage.ETASK_HANDLER_ATTRIBUTES__NOTIFIABLES:
        getNotifiables().clear();
        getNotifiables().addAll((Collection<? extends ENotifiable>)newValue);
        return;
      case AnsibleDslPackage.ETASK_HANDLER_ATTRIBUTES__LOOP:
        setLoop((ELoop)newValue);
        return;
      case AnsibleDslPackage.ETASK_HANDLER_ATTRIBUTES__REGISTER:
        setRegister((ERegisterVariable)newValue);
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
      case AnsibleDslPackage.ETASK_HANDLER_ATTRIBUTES__ERROR_HANDLING:
        setError_handling((ETaskHandlerErrorHandling)null);
        return;
      case AnsibleDslPackage.ETASK_HANDLER_ATTRIBUTES__ACTION:
        setAction(ACTION_EDEFAULT);
        return;
      case AnsibleDslPackage.ETASK_HANDLER_ATTRIBUTES__ASYNCHRONOUS_SETTINGS:
        setAsynchronous_settings((EAsynchronousSettings)null);
        return;
      case AnsibleDslPackage.ETASK_HANDLER_ATTRIBUTES__ARGS:
        setArgs((EDictionary)null);
        return;
      case AnsibleDslPackage.ETASK_HANDLER_ATTRIBUTES__MODULE:
        setModule((EModuleCall)null);
        return;
      case AnsibleDslPackage.ETASK_HANDLER_ATTRIBUTES__NOTIFIABLES:
        getNotifiables().clear();
        return;
      case AnsibleDslPackage.ETASK_HANDLER_ATTRIBUTES__LOOP:
        setLoop((ELoop)null);
        return;
      case AnsibleDslPackage.ETASK_HANDLER_ATTRIBUTES__REGISTER:
        setRegister((ERegisterVariable)null);
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
      case AnsibleDslPackage.ETASK_HANDLER_ATTRIBUTES__ERROR_HANDLING:
        return error_handling != null;
      case AnsibleDslPackage.ETASK_HANDLER_ATTRIBUTES__ACTION:
        return ACTION_EDEFAULT == null ? action != null : !ACTION_EDEFAULT.equals(action);
      case AnsibleDslPackage.ETASK_HANDLER_ATTRIBUTES__ASYNCHRONOUS_SETTINGS:
        return asynchronous_settings != null;
      case AnsibleDslPackage.ETASK_HANDLER_ATTRIBUTES__ARGS:
        return args != null;
      case AnsibleDslPackage.ETASK_HANDLER_ATTRIBUTES__MODULE:
        return module != null;
      case AnsibleDslPackage.ETASK_HANDLER_ATTRIBUTES__NOTIFIABLES:
        return notifiables != null && !notifiables.isEmpty();
      case AnsibleDslPackage.ETASK_HANDLER_ATTRIBUTES__LOOP:
        return loop != null;
      case AnsibleDslPackage.ETASK_HANDLER_ATTRIBUTES__REGISTER:
        return register != null;
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
    result.append(" (action: ");
    result.append(action);
    result.append(')');
    return result.toString();
  }

} //ETaskHandlerAttributesImpl
