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
import org.sodalite.sdl.ansible.ansibleDsl.EBase;
import org.sodalite.sdl.ansible.ansibleDsl.EBooleanPassed;
import org.sodalite.sdl.ansible.ansibleDsl.EConnection;
import org.sodalite.sdl.ansible.ansibleDsl.EListPassed;
import org.sodalite.sdl.ansible.ansibleDsl.EPrivilageEscalation;
import org.sodalite.sdl.ansible.ansibleDsl.EValidationMode;
import org.sodalite.sdl.ansible.ansibleDsl.EVariableDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EBase</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EBaseImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EBaseImpl#getPrivilage_escalation <em>Privilage escalation</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EBaseImpl#getValidation_mode <em>Validation mode</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EBaseImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EBaseImpl#getNo_log <em>No log</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EBaseImpl#getDebugger <em>Debugger</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EBaseImpl#getModule_defaults <em>Module defaults</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EBaseImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EBaseImpl#getCollections <em>Collections</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EBaseImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EBaseImpl#getVariable_declarations <em>Variable declarations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EBaseImpl extends MinimalEObjectImpl.Container implements EBase
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getPrivilage_escalation() <em>Privilage escalation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrivilage_escalation()
   * @generated
   * @ordered
   */
  protected EPrivilageEscalation privilage_escalation;

  /**
   * The cached value of the '{@link #getValidation_mode() <em>Validation mode</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValidation_mode()
   * @generated
   * @ordered
   */
  protected EValidationMode validation_mode;

  /**
   * The cached value of the '{@link #getConnection() <em>Connection</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConnection()
   * @generated
   * @ordered
   */
  protected EConnection connection;

  /**
   * The cached value of the '{@link #getNo_log() <em>No log</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNo_log()
   * @generated
   * @ordered
   */
  protected EBooleanPassed no_log;

  /**
   * The default value of the '{@link #getDebugger() <em>Debugger</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDebugger()
   * @generated
   * @ordered
   */
  protected static final String DEBUGGER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDebugger() <em>Debugger</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDebugger()
   * @generated
   * @ordered
   */
  protected String debugger = DEBUGGER_EDEFAULT;

  /**
   * The cached value of the '{@link #getModule_defaults() <em>Module defaults</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModule_defaults()
   * @generated
   * @ordered
   */
  protected EListPassed module_defaults;

  /**
   * The cached value of the '{@link #getEnvironment() <em>Environment</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnvironment()
   * @generated
   * @ordered
   */
  protected EListPassed environment;

  /**
   * The cached value of the '{@link #getCollections() <em>Collections</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCollections()
   * @generated
   * @ordered
   */
  protected EListPassed collections;

  /**
   * The cached value of the '{@link #getTags() <em>Tags</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTags()
   * @generated
   * @ordered
   */
  protected EListPassed tags;

  /**
   * The cached value of the '{@link #getVariable_declarations() <em>Variable declarations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable_declarations()
   * @generated
   * @ordered
   */
  protected EList<EVariableDeclaration> variable_declarations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EBaseImpl()
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
    return AnsibleDslPackage.Literals.EBASE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EBASE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EPrivilageEscalation getPrivilage_escalation()
  {
    return privilage_escalation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrivilage_escalation(EPrivilageEscalation newPrivilage_escalation, NotificationChain msgs)
  {
    EPrivilageEscalation oldPrivilage_escalation = privilage_escalation;
    privilage_escalation = newPrivilage_escalation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EBASE__PRIVILAGE_ESCALATION, oldPrivilage_escalation, newPrivilage_escalation);
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
  public void setPrivilage_escalation(EPrivilageEscalation newPrivilage_escalation)
  {
    if (newPrivilage_escalation != privilage_escalation)
    {
      NotificationChain msgs = null;
      if (privilage_escalation != null)
        msgs = ((InternalEObject)privilage_escalation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EBASE__PRIVILAGE_ESCALATION, null, msgs);
      if (newPrivilage_escalation != null)
        msgs = ((InternalEObject)newPrivilage_escalation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EBASE__PRIVILAGE_ESCALATION, null, msgs);
      msgs = basicSetPrivilage_escalation(newPrivilage_escalation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EBASE__PRIVILAGE_ESCALATION, newPrivilage_escalation, newPrivilage_escalation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EValidationMode getValidation_mode()
  {
    return validation_mode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValidation_mode(EValidationMode newValidation_mode, NotificationChain msgs)
  {
    EValidationMode oldValidation_mode = validation_mode;
    validation_mode = newValidation_mode;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EBASE__VALIDATION_MODE, oldValidation_mode, newValidation_mode);
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
  public void setValidation_mode(EValidationMode newValidation_mode)
  {
    if (newValidation_mode != validation_mode)
    {
      NotificationChain msgs = null;
      if (validation_mode != null)
        msgs = ((InternalEObject)validation_mode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EBASE__VALIDATION_MODE, null, msgs);
      if (newValidation_mode != null)
        msgs = ((InternalEObject)newValidation_mode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EBASE__VALIDATION_MODE, null, msgs);
      msgs = basicSetValidation_mode(newValidation_mode, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EBASE__VALIDATION_MODE, newValidation_mode, newValidation_mode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EConnection getConnection()
  {
    return connection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConnection(EConnection newConnection, NotificationChain msgs)
  {
    EConnection oldConnection = connection;
    connection = newConnection;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EBASE__CONNECTION, oldConnection, newConnection);
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
  public void setConnection(EConnection newConnection)
  {
    if (newConnection != connection)
    {
      NotificationChain msgs = null;
      if (connection != null)
        msgs = ((InternalEObject)connection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EBASE__CONNECTION, null, msgs);
      if (newConnection != null)
        msgs = ((InternalEObject)newConnection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EBASE__CONNECTION, null, msgs);
      msgs = basicSetConnection(newConnection, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EBASE__CONNECTION, newConnection, newConnection));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EBooleanPassed getNo_log()
  {
    return no_log;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNo_log(EBooleanPassed newNo_log, NotificationChain msgs)
  {
    EBooleanPassed oldNo_log = no_log;
    no_log = newNo_log;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EBASE__NO_LOG, oldNo_log, newNo_log);
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
  public void setNo_log(EBooleanPassed newNo_log)
  {
    if (newNo_log != no_log)
    {
      NotificationChain msgs = null;
      if (no_log != null)
        msgs = ((InternalEObject)no_log).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EBASE__NO_LOG, null, msgs);
      if (newNo_log != null)
        msgs = ((InternalEObject)newNo_log).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EBASE__NO_LOG, null, msgs);
      msgs = basicSetNo_log(newNo_log, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EBASE__NO_LOG, newNo_log, newNo_log));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDebugger()
  {
    return debugger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDebugger(String newDebugger)
  {
    String oldDebugger = debugger;
    debugger = newDebugger;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EBASE__DEBUGGER, oldDebugger, debugger));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EListPassed getModule_defaults()
  {
    return module_defaults;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetModule_defaults(EListPassed newModule_defaults, NotificationChain msgs)
  {
    EListPassed oldModule_defaults = module_defaults;
    module_defaults = newModule_defaults;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EBASE__MODULE_DEFAULTS, oldModule_defaults, newModule_defaults);
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
  public void setModule_defaults(EListPassed newModule_defaults)
  {
    if (newModule_defaults != module_defaults)
    {
      NotificationChain msgs = null;
      if (module_defaults != null)
        msgs = ((InternalEObject)module_defaults).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EBASE__MODULE_DEFAULTS, null, msgs);
      if (newModule_defaults != null)
        msgs = ((InternalEObject)newModule_defaults).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EBASE__MODULE_DEFAULTS, null, msgs);
      msgs = basicSetModule_defaults(newModule_defaults, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EBASE__MODULE_DEFAULTS, newModule_defaults, newModule_defaults));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EListPassed getEnvironment()
  {
    return environment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEnvironment(EListPassed newEnvironment, NotificationChain msgs)
  {
    EListPassed oldEnvironment = environment;
    environment = newEnvironment;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EBASE__ENVIRONMENT, oldEnvironment, newEnvironment);
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
  public void setEnvironment(EListPassed newEnvironment)
  {
    if (newEnvironment != environment)
    {
      NotificationChain msgs = null;
      if (environment != null)
        msgs = ((InternalEObject)environment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EBASE__ENVIRONMENT, null, msgs);
      if (newEnvironment != null)
        msgs = ((InternalEObject)newEnvironment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EBASE__ENVIRONMENT, null, msgs);
      msgs = basicSetEnvironment(newEnvironment, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EBASE__ENVIRONMENT, newEnvironment, newEnvironment));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EListPassed getCollections()
  {
    return collections;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCollections(EListPassed newCollections, NotificationChain msgs)
  {
    EListPassed oldCollections = collections;
    collections = newCollections;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EBASE__COLLECTIONS, oldCollections, newCollections);
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
  public void setCollections(EListPassed newCollections)
  {
    if (newCollections != collections)
    {
      NotificationChain msgs = null;
      if (collections != null)
        msgs = ((InternalEObject)collections).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EBASE__COLLECTIONS, null, msgs);
      if (newCollections != null)
        msgs = ((InternalEObject)newCollections).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EBASE__COLLECTIONS, null, msgs);
      msgs = basicSetCollections(newCollections, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EBASE__COLLECTIONS, newCollections, newCollections));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EListPassed getTags()
  {
    return tags;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTags(EListPassed newTags, NotificationChain msgs)
  {
    EListPassed oldTags = tags;
    tags = newTags;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EBASE__TAGS, oldTags, newTags);
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
  public void setTags(EListPassed newTags)
  {
    if (newTags != tags)
    {
      NotificationChain msgs = null;
      if (tags != null)
        msgs = ((InternalEObject)tags).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EBASE__TAGS, null, msgs);
      if (newTags != null)
        msgs = ((InternalEObject)newTags).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EBASE__TAGS, null, msgs);
      msgs = basicSetTags(newTags, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EBASE__TAGS, newTags, newTags));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<EVariableDeclaration> getVariable_declarations()
  {
    if (variable_declarations == null)
    {
      variable_declarations = new EObjectContainmentEList<EVariableDeclaration>(EVariableDeclaration.class, this, AnsibleDslPackage.EBASE__VARIABLE_DECLARATIONS);
    }
    return variable_declarations;
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
      case AnsibleDslPackage.EBASE__PRIVILAGE_ESCALATION:
        return basicSetPrivilage_escalation(null, msgs);
      case AnsibleDslPackage.EBASE__VALIDATION_MODE:
        return basicSetValidation_mode(null, msgs);
      case AnsibleDslPackage.EBASE__CONNECTION:
        return basicSetConnection(null, msgs);
      case AnsibleDslPackage.EBASE__NO_LOG:
        return basicSetNo_log(null, msgs);
      case AnsibleDslPackage.EBASE__MODULE_DEFAULTS:
        return basicSetModule_defaults(null, msgs);
      case AnsibleDslPackage.EBASE__ENVIRONMENT:
        return basicSetEnvironment(null, msgs);
      case AnsibleDslPackage.EBASE__COLLECTIONS:
        return basicSetCollections(null, msgs);
      case AnsibleDslPackage.EBASE__TAGS:
        return basicSetTags(null, msgs);
      case AnsibleDslPackage.EBASE__VARIABLE_DECLARATIONS:
        return ((InternalEList<?>)getVariable_declarations()).basicRemove(otherEnd, msgs);
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
      case AnsibleDslPackage.EBASE__NAME:
        return getName();
      case AnsibleDslPackage.EBASE__PRIVILAGE_ESCALATION:
        return getPrivilage_escalation();
      case AnsibleDslPackage.EBASE__VALIDATION_MODE:
        return getValidation_mode();
      case AnsibleDslPackage.EBASE__CONNECTION:
        return getConnection();
      case AnsibleDslPackage.EBASE__NO_LOG:
        return getNo_log();
      case AnsibleDslPackage.EBASE__DEBUGGER:
        return getDebugger();
      case AnsibleDslPackage.EBASE__MODULE_DEFAULTS:
        return getModule_defaults();
      case AnsibleDslPackage.EBASE__ENVIRONMENT:
        return getEnvironment();
      case AnsibleDslPackage.EBASE__COLLECTIONS:
        return getCollections();
      case AnsibleDslPackage.EBASE__TAGS:
        return getTags();
      case AnsibleDslPackage.EBASE__VARIABLE_DECLARATIONS:
        return getVariable_declarations();
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
      case AnsibleDslPackage.EBASE__NAME:
        setName((String)newValue);
        return;
      case AnsibleDslPackage.EBASE__PRIVILAGE_ESCALATION:
        setPrivilage_escalation((EPrivilageEscalation)newValue);
        return;
      case AnsibleDslPackage.EBASE__VALIDATION_MODE:
        setValidation_mode((EValidationMode)newValue);
        return;
      case AnsibleDslPackage.EBASE__CONNECTION:
        setConnection((EConnection)newValue);
        return;
      case AnsibleDslPackage.EBASE__NO_LOG:
        setNo_log((EBooleanPassed)newValue);
        return;
      case AnsibleDslPackage.EBASE__DEBUGGER:
        setDebugger((String)newValue);
        return;
      case AnsibleDslPackage.EBASE__MODULE_DEFAULTS:
        setModule_defaults((EListPassed)newValue);
        return;
      case AnsibleDslPackage.EBASE__ENVIRONMENT:
        setEnvironment((EListPassed)newValue);
        return;
      case AnsibleDslPackage.EBASE__COLLECTIONS:
        setCollections((EListPassed)newValue);
        return;
      case AnsibleDslPackage.EBASE__TAGS:
        setTags((EListPassed)newValue);
        return;
      case AnsibleDslPackage.EBASE__VARIABLE_DECLARATIONS:
        getVariable_declarations().clear();
        getVariable_declarations().addAll((Collection<? extends EVariableDeclaration>)newValue);
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
      case AnsibleDslPackage.EBASE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AnsibleDslPackage.EBASE__PRIVILAGE_ESCALATION:
        setPrivilage_escalation((EPrivilageEscalation)null);
        return;
      case AnsibleDslPackage.EBASE__VALIDATION_MODE:
        setValidation_mode((EValidationMode)null);
        return;
      case AnsibleDslPackage.EBASE__CONNECTION:
        setConnection((EConnection)null);
        return;
      case AnsibleDslPackage.EBASE__NO_LOG:
        setNo_log((EBooleanPassed)null);
        return;
      case AnsibleDslPackage.EBASE__DEBUGGER:
        setDebugger(DEBUGGER_EDEFAULT);
        return;
      case AnsibleDslPackage.EBASE__MODULE_DEFAULTS:
        setModule_defaults((EListPassed)null);
        return;
      case AnsibleDslPackage.EBASE__ENVIRONMENT:
        setEnvironment((EListPassed)null);
        return;
      case AnsibleDslPackage.EBASE__COLLECTIONS:
        setCollections((EListPassed)null);
        return;
      case AnsibleDslPackage.EBASE__TAGS:
        setTags((EListPassed)null);
        return;
      case AnsibleDslPackage.EBASE__VARIABLE_DECLARATIONS:
        getVariable_declarations().clear();
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
      case AnsibleDslPackage.EBASE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AnsibleDslPackage.EBASE__PRIVILAGE_ESCALATION:
        return privilage_escalation != null;
      case AnsibleDslPackage.EBASE__VALIDATION_MODE:
        return validation_mode != null;
      case AnsibleDslPackage.EBASE__CONNECTION:
        return connection != null;
      case AnsibleDslPackage.EBASE__NO_LOG:
        return no_log != null;
      case AnsibleDslPackage.EBASE__DEBUGGER:
        return DEBUGGER_EDEFAULT == null ? debugger != null : !DEBUGGER_EDEFAULT.equals(debugger);
      case AnsibleDslPackage.EBASE__MODULE_DEFAULTS:
        return module_defaults != null;
      case AnsibleDslPackage.EBASE__ENVIRONMENT:
        return environment != null;
      case AnsibleDslPackage.EBASE__COLLECTIONS:
        return collections != null;
      case AnsibleDslPackage.EBASE__TAGS:
        return tags != null;
      case AnsibleDslPackage.EBASE__VARIABLE_DECLARATIONS:
        return variable_declarations != null && !variable_declarations.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(", debugger: ");
    result.append(debugger);
    result.append(')');
    return result.toString();
  }

} //EBaseImpl
