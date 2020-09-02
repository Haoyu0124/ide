/**
 * generated by Xtext 2.19.0
 */
package org.sodalite.dsl.rM.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.sodalite.dsl.rM.EAttributeDefinition;
import org.sodalite.dsl.rM.EReqOrCap;
import org.sodalite.dsl.rM.GetAttributeBody;
import org.sodalite.dsl.rM.RMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Get Attribute Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.rM.impl.GetAttributeBodyImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.impl.GetAttributeBodyImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.impl.GetAttributeBodyImpl#getReq_cap <em>Req cap</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GetAttributeBodyImpl extends MinimalEObjectImpl.Container implements GetAttributeBody
{
  /**
   * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttribute()
   * @generated
   * @ordered
   */
  protected EAttributeDefinition attribute;

  /**
   * The default value of the '{@link #getEntity() <em>Entity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntity()
   * @generated
   * @ordered
   */
  protected static final String ENTITY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEntity() <em>Entity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntity()
   * @generated
   * @ordered
   */
  protected String entity = ENTITY_EDEFAULT;

  /**
   * The cached value of the '{@link #getReq_cap() <em>Req cap</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReq_cap()
   * @generated
   * @ordered
   */
  protected EReqOrCap req_cap;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GetAttributeBodyImpl()
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
    return RMPackage.Literals.GET_ATTRIBUTE_BODY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttributeDefinition getAttribute()
  {
    if (attribute != null && attribute.eIsProxy())
    {
      InternalEObject oldAttribute = (InternalEObject)attribute;
      attribute = (EAttributeDefinition)eResolveProxy(oldAttribute);
      if (attribute != oldAttribute)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RMPackage.GET_ATTRIBUTE_BODY__ATTRIBUTE, oldAttribute, attribute));
      }
    }
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttributeDefinition basicGetAttribute()
  {
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttribute(EAttributeDefinition newAttribute)
  {
    EAttributeDefinition oldAttribute = attribute;
    attribute = newAttribute;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RMPackage.GET_ATTRIBUTE_BODY__ATTRIBUTE, oldAttribute, attribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEntity()
  {
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEntity(String newEntity)
  {
    String oldEntity = entity;
    entity = newEntity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RMPackage.GET_ATTRIBUTE_BODY__ENTITY, oldEntity, entity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReqOrCap getReq_cap()
  {
    if (req_cap != null && req_cap.eIsProxy())
    {
      InternalEObject oldReq_cap = (InternalEObject)req_cap;
      req_cap = (EReqOrCap)eResolveProxy(oldReq_cap);
      if (req_cap != oldReq_cap)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RMPackage.GET_ATTRIBUTE_BODY__REQ_CAP, oldReq_cap, req_cap));
      }
    }
    return req_cap;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReqOrCap basicGetReq_cap()
  {
    return req_cap;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReq_cap(EReqOrCap newReq_cap)
  {
    EReqOrCap oldReq_cap = req_cap;
    req_cap = newReq_cap;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RMPackage.GET_ATTRIBUTE_BODY__REQ_CAP, oldReq_cap, req_cap));
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
      case RMPackage.GET_ATTRIBUTE_BODY__ATTRIBUTE:
        if (resolve) return getAttribute();
        return basicGetAttribute();
      case RMPackage.GET_ATTRIBUTE_BODY__ENTITY:
        return getEntity();
      case RMPackage.GET_ATTRIBUTE_BODY__REQ_CAP:
        if (resolve) return getReq_cap();
        return basicGetReq_cap();
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
      case RMPackage.GET_ATTRIBUTE_BODY__ATTRIBUTE:
        setAttribute((EAttributeDefinition)newValue);
        return;
      case RMPackage.GET_ATTRIBUTE_BODY__ENTITY:
        setEntity((String)newValue);
        return;
      case RMPackage.GET_ATTRIBUTE_BODY__REQ_CAP:
        setReq_cap((EReqOrCap)newValue);
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
      case RMPackage.GET_ATTRIBUTE_BODY__ATTRIBUTE:
        setAttribute((EAttributeDefinition)null);
        return;
      case RMPackage.GET_ATTRIBUTE_BODY__ENTITY:
        setEntity(ENTITY_EDEFAULT);
        return;
      case RMPackage.GET_ATTRIBUTE_BODY__REQ_CAP:
        setReq_cap((EReqOrCap)null);
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
      case RMPackage.GET_ATTRIBUTE_BODY__ATTRIBUTE:
        return attribute != null;
      case RMPackage.GET_ATTRIBUTE_BODY__ENTITY:
        return ENTITY_EDEFAULT == null ? entity != null : !ENTITY_EDEFAULT.equals(entity);
      case RMPackage.GET_ATTRIBUTE_BODY__REQ_CAP:
        return req_cap != null;
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

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (entity: ");
    result.append(entity);
    result.append(')');
    return result.toString();
  }

} //GetAttributeBodyImpl
