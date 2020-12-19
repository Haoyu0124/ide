/**
 * generated by Xtext 2.23.0
 */
package org.sodalite.dsl.rM.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.sodalite.dsl.rM.EAlphaNumericValue;
import org.sodalite.dsl.rM.EPREFIX_TYPE;
import org.sodalite.dsl.rM.ERequirementDefinitionBody;
import org.sodalite.dsl.rM.RMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ERequirement Definition Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.rM.impl.ERequirementDefinitionBodyImpl#getCapability <em>Capability</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.impl.ERequirementDefinitionBodyImpl#getNode <em>Node</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.impl.ERequirementDefinitionBodyImpl#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.impl.ERequirementDefinitionBodyImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.impl.ERequirementDefinitionBodyImpl#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ERequirementDefinitionBodyImpl extends MinimalEObjectImpl.Container implements ERequirementDefinitionBody
{
  /**
   * The cached value of the '{@link #getCapability() <em>Capability</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCapability()
   * @generated
   * @ordered
   */
  protected EPREFIX_TYPE capability;

  /**
   * The cached value of the '{@link #getNode() <em>Node</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNode()
   * @generated
   * @ordered
   */
  protected EPREFIX_TYPE node;

  /**
   * The cached value of the '{@link #getRelationship() <em>Relationship</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelationship()
   * @generated
   * @ordered
   */
  protected EPREFIX_TYPE relationship;

  /**
   * The cached value of the '{@link #getStart() <em>Start</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStart()
   * @generated
   * @ordered
   */
  protected EAlphaNumericValue start;

  /**
   * The cached value of the '{@link #getEnd() <em>End</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnd()
   * @generated
   * @ordered
   */
  protected EAlphaNumericValue end;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ERequirementDefinitionBodyImpl()
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
    return RMPackage.Literals.EREQUIREMENT_DEFINITION_BODY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EPREFIX_TYPE getCapability()
  {
    return capability;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCapability(EPREFIX_TYPE newCapability, NotificationChain msgs)
  {
    EPREFIX_TYPE oldCapability = capability;
    capability = newCapability;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RMPackage.EREQUIREMENT_DEFINITION_BODY__CAPABILITY, oldCapability, newCapability);
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
  public void setCapability(EPREFIX_TYPE newCapability)
  {
    if (newCapability != capability)
    {
      NotificationChain msgs = null;
      if (capability != null)
        msgs = ((InternalEObject)capability).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RMPackage.EREQUIREMENT_DEFINITION_BODY__CAPABILITY, null, msgs);
      if (newCapability != null)
        msgs = ((InternalEObject)newCapability).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RMPackage.EREQUIREMENT_DEFINITION_BODY__CAPABILITY, null, msgs);
      msgs = basicSetCapability(newCapability, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RMPackage.EREQUIREMENT_DEFINITION_BODY__CAPABILITY, newCapability, newCapability));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EPREFIX_TYPE getNode()
  {
    return node;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNode(EPREFIX_TYPE newNode, NotificationChain msgs)
  {
    EPREFIX_TYPE oldNode = node;
    node = newNode;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RMPackage.EREQUIREMENT_DEFINITION_BODY__NODE, oldNode, newNode);
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
  public void setNode(EPREFIX_TYPE newNode)
  {
    if (newNode != node)
    {
      NotificationChain msgs = null;
      if (node != null)
        msgs = ((InternalEObject)node).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RMPackage.EREQUIREMENT_DEFINITION_BODY__NODE, null, msgs);
      if (newNode != null)
        msgs = ((InternalEObject)newNode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RMPackage.EREQUIREMENT_DEFINITION_BODY__NODE, null, msgs);
      msgs = basicSetNode(newNode, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RMPackage.EREQUIREMENT_DEFINITION_BODY__NODE, newNode, newNode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EPREFIX_TYPE getRelationship()
  {
    return relationship;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRelationship(EPREFIX_TYPE newRelationship, NotificationChain msgs)
  {
    EPREFIX_TYPE oldRelationship = relationship;
    relationship = newRelationship;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RMPackage.EREQUIREMENT_DEFINITION_BODY__RELATIONSHIP, oldRelationship, newRelationship);
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
  public void setRelationship(EPREFIX_TYPE newRelationship)
  {
    if (newRelationship != relationship)
    {
      NotificationChain msgs = null;
      if (relationship != null)
        msgs = ((InternalEObject)relationship).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RMPackage.EREQUIREMENT_DEFINITION_BODY__RELATIONSHIP, null, msgs);
      if (newRelationship != null)
        msgs = ((InternalEObject)newRelationship).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RMPackage.EREQUIREMENT_DEFINITION_BODY__RELATIONSHIP, null, msgs);
      msgs = basicSetRelationship(newRelationship, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RMPackage.EREQUIREMENT_DEFINITION_BODY__RELATIONSHIP, newRelationship, newRelationship));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAlphaNumericValue getStart()
  {
    return start;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStart(EAlphaNumericValue newStart, NotificationChain msgs)
  {
    EAlphaNumericValue oldStart = start;
    start = newStart;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RMPackage.EREQUIREMENT_DEFINITION_BODY__START, oldStart, newStart);
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
  public void setStart(EAlphaNumericValue newStart)
  {
    if (newStart != start)
    {
      NotificationChain msgs = null;
      if (start != null)
        msgs = ((InternalEObject)start).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RMPackage.EREQUIREMENT_DEFINITION_BODY__START, null, msgs);
      if (newStart != null)
        msgs = ((InternalEObject)newStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RMPackage.EREQUIREMENT_DEFINITION_BODY__START, null, msgs);
      msgs = basicSetStart(newStart, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RMPackage.EREQUIREMENT_DEFINITION_BODY__START, newStart, newStart));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAlphaNumericValue getEnd()
  {
    return end;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEnd(EAlphaNumericValue newEnd, NotificationChain msgs)
  {
    EAlphaNumericValue oldEnd = end;
    end = newEnd;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RMPackage.EREQUIREMENT_DEFINITION_BODY__END, oldEnd, newEnd);
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
  public void setEnd(EAlphaNumericValue newEnd)
  {
    if (newEnd != end)
    {
      NotificationChain msgs = null;
      if (end != null)
        msgs = ((InternalEObject)end).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RMPackage.EREQUIREMENT_DEFINITION_BODY__END, null, msgs);
      if (newEnd != null)
        msgs = ((InternalEObject)newEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RMPackage.EREQUIREMENT_DEFINITION_BODY__END, null, msgs);
      msgs = basicSetEnd(newEnd, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RMPackage.EREQUIREMENT_DEFINITION_BODY__END, newEnd, newEnd));
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
      case RMPackage.EREQUIREMENT_DEFINITION_BODY__CAPABILITY:
        return basicSetCapability(null, msgs);
      case RMPackage.EREQUIREMENT_DEFINITION_BODY__NODE:
        return basicSetNode(null, msgs);
      case RMPackage.EREQUIREMENT_DEFINITION_BODY__RELATIONSHIP:
        return basicSetRelationship(null, msgs);
      case RMPackage.EREQUIREMENT_DEFINITION_BODY__START:
        return basicSetStart(null, msgs);
      case RMPackage.EREQUIREMENT_DEFINITION_BODY__END:
        return basicSetEnd(null, msgs);
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
      case RMPackage.EREQUIREMENT_DEFINITION_BODY__CAPABILITY:
        return getCapability();
      case RMPackage.EREQUIREMENT_DEFINITION_BODY__NODE:
        return getNode();
      case RMPackage.EREQUIREMENT_DEFINITION_BODY__RELATIONSHIP:
        return getRelationship();
      case RMPackage.EREQUIREMENT_DEFINITION_BODY__START:
        return getStart();
      case RMPackage.EREQUIREMENT_DEFINITION_BODY__END:
        return getEnd();
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
      case RMPackage.EREQUIREMENT_DEFINITION_BODY__CAPABILITY:
        setCapability((EPREFIX_TYPE)newValue);
        return;
      case RMPackage.EREQUIREMENT_DEFINITION_BODY__NODE:
        setNode((EPREFIX_TYPE)newValue);
        return;
      case RMPackage.EREQUIREMENT_DEFINITION_BODY__RELATIONSHIP:
        setRelationship((EPREFIX_TYPE)newValue);
        return;
      case RMPackage.EREQUIREMENT_DEFINITION_BODY__START:
        setStart((EAlphaNumericValue)newValue);
        return;
      case RMPackage.EREQUIREMENT_DEFINITION_BODY__END:
        setEnd((EAlphaNumericValue)newValue);
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
      case RMPackage.EREQUIREMENT_DEFINITION_BODY__CAPABILITY:
        setCapability((EPREFIX_TYPE)null);
        return;
      case RMPackage.EREQUIREMENT_DEFINITION_BODY__NODE:
        setNode((EPREFIX_TYPE)null);
        return;
      case RMPackage.EREQUIREMENT_DEFINITION_BODY__RELATIONSHIP:
        setRelationship((EPREFIX_TYPE)null);
        return;
      case RMPackage.EREQUIREMENT_DEFINITION_BODY__START:
        setStart((EAlphaNumericValue)null);
        return;
      case RMPackage.EREQUIREMENT_DEFINITION_BODY__END:
        setEnd((EAlphaNumericValue)null);
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
      case RMPackage.EREQUIREMENT_DEFINITION_BODY__CAPABILITY:
        return capability != null;
      case RMPackage.EREQUIREMENT_DEFINITION_BODY__NODE:
        return node != null;
      case RMPackage.EREQUIREMENT_DEFINITION_BODY__RELATIONSHIP:
        return relationship != null;
      case RMPackage.EREQUIREMENT_DEFINITION_BODY__START:
        return start != null;
      case RMPackage.EREQUIREMENT_DEFINITION_BODY__END:
        return end != null;
    }
    return super.eIsSet(featureID);
  }

} //ERequirementDefinitionBodyImpl
