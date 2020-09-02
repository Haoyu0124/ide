/**
 * generated by Xtext 2.19.0
 */
package org.sodalite.dsl.optimization.optimization.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.sodalite.dsl.optimization.optimization.EHPC;
import org.sodalite.dsl.optimization.optimization.EHPCConfig;
import org.sodalite.dsl.optimization.optimization.EHPCData;
import org.sodalite.dsl.optimization.optimization.EMPICase;
import org.sodalite.dsl.optimization.optimization.EOPENACCCase;
import org.sodalite.dsl.optimization.optimization.EOPENCLCase;
import org.sodalite.dsl.optimization.optimization.EOPENMPCase;
import org.sodalite.dsl.optimization.optimization.OptimizationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EHPC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.impl.EHPCImpl#getConfig <em>Config</em>}</li>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.impl.EHPCImpl#getData <em>Data</em>}</li>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.impl.EHPCImpl#getMpi <em>Mpi</em>}</li>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.impl.EHPCImpl#getOpenmp <em>Openmp</em>}</li>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.impl.EHPCImpl#getOpenacc <em>Openacc</em>}</li>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.impl.EHPCImpl#getOpencl <em>Opencl</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EHPCImpl extends MinimalEObjectImpl.Container implements EHPC
{
  /**
   * The cached value of the '{@link #getConfig() <em>Config</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConfig()
   * @generated
   * @ordered
   */
  protected EHPCConfig config;

  /**
   * The cached value of the '{@link #getData() <em>Data</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getData()
   * @generated
   * @ordered
   */
  protected EHPCData data;

  /**
   * The cached value of the '{@link #getMpi() <em>Mpi</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMpi()
   * @generated
   * @ordered
   */
  protected EMPICase mpi;

  /**
   * The cached value of the '{@link #getOpenmp() <em>Openmp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpenmp()
   * @generated
   * @ordered
   */
  protected EOPENMPCase openmp;

  /**
   * The cached value of the '{@link #getOpenacc() <em>Openacc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpenacc()
   * @generated
   * @ordered
   */
  protected EOPENACCCase openacc;

  /**
   * The cached value of the '{@link #getOpencl() <em>Opencl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpencl()
   * @generated
   * @ordered
   */
  protected EOPENCLCase opencl;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EHPCImpl()
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
    return OptimizationPackage.Literals.EHPC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EHPCConfig getConfig()
  {
    return config;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConfig(EHPCConfig newConfig, NotificationChain msgs)
  {
    EHPCConfig oldConfig = config;
    config = newConfig;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OptimizationPackage.EHPC__CONFIG, oldConfig, newConfig);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConfig(EHPCConfig newConfig)
  {
    if (newConfig != config)
    {
      NotificationChain msgs = null;
      if (config != null)
        msgs = ((InternalEObject)config).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OptimizationPackage.EHPC__CONFIG, null, msgs);
      if (newConfig != null)
        msgs = ((InternalEObject)newConfig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OptimizationPackage.EHPC__CONFIG, null, msgs);
      msgs = basicSetConfig(newConfig, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptimizationPackage.EHPC__CONFIG, newConfig, newConfig));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EHPCData getData()
  {
    return data;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetData(EHPCData newData, NotificationChain msgs)
  {
    EHPCData oldData = data;
    data = newData;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OptimizationPackage.EHPC__DATA, oldData, newData);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setData(EHPCData newData)
  {
    if (newData != data)
    {
      NotificationChain msgs = null;
      if (data != null)
        msgs = ((InternalEObject)data).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OptimizationPackage.EHPC__DATA, null, msgs);
      if (newData != null)
        msgs = ((InternalEObject)newData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OptimizationPackage.EHPC__DATA, null, msgs);
      msgs = basicSetData(newData, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptimizationPackage.EHPC__DATA, newData, newData));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMPICase getMpi()
  {
    return mpi;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMpi(EMPICase newMpi, NotificationChain msgs)
  {
    EMPICase oldMpi = mpi;
    mpi = newMpi;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OptimizationPackage.EHPC__MPI, oldMpi, newMpi);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMpi(EMPICase newMpi)
  {
    if (newMpi != mpi)
    {
      NotificationChain msgs = null;
      if (mpi != null)
        msgs = ((InternalEObject)mpi).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OptimizationPackage.EHPC__MPI, null, msgs);
      if (newMpi != null)
        msgs = ((InternalEObject)newMpi).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OptimizationPackage.EHPC__MPI, null, msgs);
      msgs = basicSetMpi(newMpi, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptimizationPackage.EHPC__MPI, newMpi, newMpi));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOPENMPCase getOpenmp()
  {
    return openmp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOpenmp(EOPENMPCase newOpenmp, NotificationChain msgs)
  {
    EOPENMPCase oldOpenmp = openmp;
    openmp = newOpenmp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OptimizationPackage.EHPC__OPENMP, oldOpenmp, newOpenmp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOpenmp(EOPENMPCase newOpenmp)
  {
    if (newOpenmp != openmp)
    {
      NotificationChain msgs = null;
      if (openmp != null)
        msgs = ((InternalEObject)openmp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OptimizationPackage.EHPC__OPENMP, null, msgs);
      if (newOpenmp != null)
        msgs = ((InternalEObject)newOpenmp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OptimizationPackage.EHPC__OPENMP, null, msgs);
      msgs = basicSetOpenmp(newOpenmp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptimizationPackage.EHPC__OPENMP, newOpenmp, newOpenmp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOPENACCCase getOpenacc()
  {
    return openacc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOpenacc(EOPENACCCase newOpenacc, NotificationChain msgs)
  {
    EOPENACCCase oldOpenacc = openacc;
    openacc = newOpenacc;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OptimizationPackage.EHPC__OPENACC, oldOpenacc, newOpenacc);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOpenacc(EOPENACCCase newOpenacc)
  {
    if (newOpenacc != openacc)
    {
      NotificationChain msgs = null;
      if (openacc != null)
        msgs = ((InternalEObject)openacc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OptimizationPackage.EHPC__OPENACC, null, msgs);
      if (newOpenacc != null)
        msgs = ((InternalEObject)newOpenacc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OptimizationPackage.EHPC__OPENACC, null, msgs);
      msgs = basicSetOpenacc(newOpenacc, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptimizationPackage.EHPC__OPENACC, newOpenacc, newOpenacc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOPENCLCase getOpencl()
  {
    return opencl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOpencl(EOPENCLCase newOpencl, NotificationChain msgs)
  {
    EOPENCLCase oldOpencl = opencl;
    opencl = newOpencl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OptimizationPackage.EHPC__OPENCL, oldOpencl, newOpencl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOpencl(EOPENCLCase newOpencl)
  {
    if (newOpencl != opencl)
    {
      NotificationChain msgs = null;
      if (opencl != null)
        msgs = ((InternalEObject)opencl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OptimizationPackage.EHPC__OPENCL, null, msgs);
      if (newOpencl != null)
        msgs = ((InternalEObject)newOpencl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OptimizationPackage.EHPC__OPENCL, null, msgs);
      msgs = basicSetOpencl(newOpencl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptimizationPackage.EHPC__OPENCL, newOpencl, newOpencl));
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
      case OptimizationPackage.EHPC__CONFIG:
        return basicSetConfig(null, msgs);
      case OptimizationPackage.EHPC__DATA:
        return basicSetData(null, msgs);
      case OptimizationPackage.EHPC__MPI:
        return basicSetMpi(null, msgs);
      case OptimizationPackage.EHPC__OPENMP:
        return basicSetOpenmp(null, msgs);
      case OptimizationPackage.EHPC__OPENACC:
        return basicSetOpenacc(null, msgs);
      case OptimizationPackage.EHPC__OPENCL:
        return basicSetOpencl(null, msgs);
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
      case OptimizationPackage.EHPC__CONFIG:
        return getConfig();
      case OptimizationPackage.EHPC__DATA:
        return getData();
      case OptimizationPackage.EHPC__MPI:
        return getMpi();
      case OptimizationPackage.EHPC__OPENMP:
        return getOpenmp();
      case OptimizationPackage.EHPC__OPENACC:
        return getOpenacc();
      case OptimizationPackage.EHPC__OPENCL:
        return getOpencl();
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
      case OptimizationPackage.EHPC__CONFIG:
        setConfig((EHPCConfig)newValue);
        return;
      case OptimizationPackage.EHPC__DATA:
        setData((EHPCData)newValue);
        return;
      case OptimizationPackage.EHPC__MPI:
        setMpi((EMPICase)newValue);
        return;
      case OptimizationPackage.EHPC__OPENMP:
        setOpenmp((EOPENMPCase)newValue);
        return;
      case OptimizationPackage.EHPC__OPENACC:
        setOpenacc((EOPENACCCase)newValue);
        return;
      case OptimizationPackage.EHPC__OPENCL:
        setOpencl((EOPENCLCase)newValue);
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
      case OptimizationPackage.EHPC__CONFIG:
        setConfig((EHPCConfig)null);
        return;
      case OptimizationPackage.EHPC__DATA:
        setData((EHPCData)null);
        return;
      case OptimizationPackage.EHPC__MPI:
        setMpi((EMPICase)null);
        return;
      case OptimizationPackage.EHPC__OPENMP:
        setOpenmp((EOPENMPCase)null);
        return;
      case OptimizationPackage.EHPC__OPENACC:
        setOpenacc((EOPENACCCase)null);
        return;
      case OptimizationPackage.EHPC__OPENCL:
        setOpencl((EOPENCLCase)null);
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
      case OptimizationPackage.EHPC__CONFIG:
        return config != null;
      case OptimizationPackage.EHPC__DATA:
        return data != null;
      case OptimizationPackage.EHPC__MPI:
        return mpi != null;
      case OptimizationPackage.EHPC__OPENMP:
        return openmp != null;
      case OptimizationPackage.EHPC__OPENACC:
        return openacc != null;
      case OptimizationPackage.EHPC__OPENCL:
        return opencl != null;
    }
    return super.eIsSet(featureID);
  }

} //EHPCImpl
