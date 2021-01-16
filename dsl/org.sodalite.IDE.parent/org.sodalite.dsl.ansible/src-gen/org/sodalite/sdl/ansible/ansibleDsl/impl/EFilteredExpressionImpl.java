/**
 * generated by Xtext 2.23.0
 */
package org.sodalite.sdl.ansible.ansibleDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage;
import org.sodalite.sdl.ansible.ansibleDsl.EFilteredExpression;
import org.sodalite.sdl.ansible.ansibleDsl.EOrExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EFiltered Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EFilteredExpressionImpl#getTo_filter <em>To filter</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EFilteredExpressionImpl#getFilter <em>Filter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EFilteredExpressionImpl extends MinimalEObjectImpl.Container implements EFilteredExpression
{
  /**
   * The cached value of the '{@link #getTo_filter() <em>To filter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTo_filter()
   * @generated
   * @ordered
   */
  protected EOrExpression to_filter;

  /**
   * The cached value of the '{@link #getFilter() <em>Filter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilter()
   * @generated
   * @ordered
   */
  protected EFilteredExpression filter;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EFilteredExpressionImpl()
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
    return AnsibleDslPackage.Literals.EFILTERED_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EOrExpression getTo_filter()
  {
    return to_filter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTo_filter(EOrExpression newTo_filter, NotificationChain msgs)
  {
    EOrExpression oldTo_filter = to_filter;
    to_filter = newTo_filter;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EFILTERED_EXPRESSION__TO_FILTER, oldTo_filter, newTo_filter);
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
  public void setTo_filter(EOrExpression newTo_filter)
  {
    if (newTo_filter != to_filter)
    {
      NotificationChain msgs = null;
      if (to_filter != null)
        msgs = ((InternalEObject)to_filter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EFILTERED_EXPRESSION__TO_FILTER, null, msgs);
      if (newTo_filter != null)
        msgs = ((InternalEObject)newTo_filter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EFILTERED_EXPRESSION__TO_FILTER, null, msgs);
      msgs = basicSetTo_filter(newTo_filter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EFILTERED_EXPRESSION__TO_FILTER, newTo_filter, newTo_filter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EFilteredExpression getFilter()
  {
    return filter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFilter(EFilteredExpression newFilter, NotificationChain msgs)
  {
    EFilteredExpression oldFilter = filter;
    filter = newFilter;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EFILTERED_EXPRESSION__FILTER, oldFilter, newFilter);
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
  public void setFilter(EFilteredExpression newFilter)
  {
    if (newFilter != filter)
    {
      NotificationChain msgs = null;
      if (filter != null)
        msgs = ((InternalEObject)filter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EFILTERED_EXPRESSION__FILTER, null, msgs);
      if (newFilter != null)
        msgs = ((InternalEObject)newFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EFILTERED_EXPRESSION__FILTER, null, msgs);
      msgs = basicSetFilter(newFilter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EFILTERED_EXPRESSION__FILTER, newFilter, newFilter));
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
      case AnsibleDslPackage.EFILTERED_EXPRESSION__TO_FILTER:
        return basicSetTo_filter(null, msgs);
      case AnsibleDslPackage.EFILTERED_EXPRESSION__FILTER:
        return basicSetFilter(null, msgs);
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
      case AnsibleDslPackage.EFILTERED_EXPRESSION__TO_FILTER:
        return getTo_filter();
      case AnsibleDslPackage.EFILTERED_EXPRESSION__FILTER:
        return getFilter();
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
      case AnsibleDslPackage.EFILTERED_EXPRESSION__TO_FILTER:
        setTo_filter((EOrExpression)newValue);
        return;
      case AnsibleDslPackage.EFILTERED_EXPRESSION__FILTER:
        setFilter((EFilteredExpression)newValue);
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
      case AnsibleDslPackage.EFILTERED_EXPRESSION__TO_FILTER:
        setTo_filter((EOrExpression)null);
        return;
      case AnsibleDslPackage.EFILTERED_EXPRESSION__FILTER:
        setFilter((EFilteredExpression)null);
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
      case AnsibleDslPackage.EFILTERED_EXPRESSION__TO_FILTER:
        return to_filter != null;
      case AnsibleDslPackage.EFILTERED_EXPRESSION__FILTER:
        return filter != null;
    }
    return super.eIsSet(featureID);
  }

} //EFilteredExpressionImpl
