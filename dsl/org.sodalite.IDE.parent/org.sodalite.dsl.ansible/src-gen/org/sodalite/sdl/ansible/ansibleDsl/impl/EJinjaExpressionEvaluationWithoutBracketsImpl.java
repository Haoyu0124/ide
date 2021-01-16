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
import org.sodalite.sdl.ansible.ansibleDsl.EFilteredExpression;
import org.sodalite.sdl.ansible.ansibleDsl.EIfBlock;
import org.sodalite.sdl.ansible.ansibleDsl.EJinjaExpressionEvaluationWithoutBrackets;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EJinja Expression Evaluation Without Brackets</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EJinjaExpressionEvaluationWithoutBracketsImpl#getExpression_to_evaluate <em>Expression to evaluate</em>}</li>
 *   <li>{@link org.sodalite.sdl.ansible.ansibleDsl.impl.EJinjaExpressionEvaluationWithoutBracketsImpl#getIf_chain <em>If chain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EJinjaExpressionEvaluationWithoutBracketsImpl extends MinimalEObjectImpl.Container implements EJinjaExpressionEvaluationWithoutBrackets
{
  /**
   * The cached value of the '{@link #getExpression_to_evaluate() <em>Expression to evaluate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression_to_evaluate()
   * @generated
   * @ordered
   */
  protected EFilteredExpression expression_to_evaluate;

  /**
   * The cached value of the '{@link #getIf_chain() <em>If chain</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIf_chain()
   * @generated
   * @ordered
   */
  protected EList<EIfBlock> if_chain;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EJinjaExpressionEvaluationWithoutBracketsImpl()
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
    return AnsibleDslPackage.Literals.EJINJA_EXPRESSION_EVALUATION_WITHOUT_BRACKETS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EFilteredExpression getExpression_to_evaluate()
  {
    return expression_to_evaluate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression_to_evaluate(EFilteredExpression newExpression_to_evaluate, NotificationChain msgs)
  {
    EFilteredExpression oldExpression_to_evaluate = expression_to_evaluate;
    expression_to_evaluate = newExpression_to_evaluate;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EJINJA_EXPRESSION_EVALUATION_WITHOUT_BRACKETS__EXPRESSION_TO_EVALUATE, oldExpression_to_evaluate, newExpression_to_evaluate);
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
  public void setExpression_to_evaluate(EFilteredExpression newExpression_to_evaluate)
  {
    if (newExpression_to_evaluate != expression_to_evaluate)
    {
      NotificationChain msgs = null;
      if (expression_to_evaluate != null)
        msgs = ((InternalEObject)expression_to_evaluate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EJINJA_EXPRESSION_EVALUATION_WITHOUT_BRACKETS__EXPRESSION_TO_EVALUATE, null, msgs);
      if (newExpression_to_evaluate != null)
        msgs = ((InternalEObject)newExpression_to_evaluate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsibleDslPackage.EJINJA_EXPRESSION_EVALUATION_WITHOUT_BRACKETS__EXPRESSION_TO_EVALUATE, null, msgs);
      msgs = basicSetExpression_to_evaluate(newExpression_to_evaluate, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsibleDslPackage.EJINJA_EXPRESSION_EVALUATION_WITHOUT_BRACKETS__EXPRESSION_TO_EVALUATE, newExpression_to_evaluate, newExpression_to_evaluate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<EIfBlock> getIf_chain()
  {
    if (if_chain == null)
    {
      if_chain = new EObjectContainmentEList<EIfBlock>(EIfBlock.class, this, AnsibleDslPackage.EJINJA_EXPRESSION_EVALUATION_WITHOUT_BRACKETS__IF_CHAIN);
    }
    return if_chain;
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
      case AnsibleDslPackage.EJINJA_EXPRESSION_EVALUATION_WITHOUT_BRACKETS__EXPRESSION_TO_EVALUATE:
        return basicSetExpression_to_evaluate(null, msgs);
      case AnsibleDslPackage.EJINJA_EXPRESSION_EVALUATION_WITHOUT_BRACKETS__IF_CHAIN:
        return ((InternalEList<?>)getIf_chain()).basicRemove(otherEnd, msgs);
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
      case AnsibleDslPackage.EJINJA_EXPRESSION_EVALUATION_WITHOUT_BRACKETS__EXPRESSION_TO_EVALUATE:
        return getExpression_to_evaluate();
      case AnsibleDslPackage.EJINJA_EXPRESSION_EVALUATION_WITHOUT_BRACKETS__IF_CHAIN:
        return getIf_chain();
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
      case AnsibleDslPackage.EJINJA_EXPRESSION_EVALUATION_WITHOUT_BRACKETS__EXPRESSION_TO_EVALUATE:
        setExpression_to_evaluate((EFilteredExpression)newValue);
        return;
      case AnsibleDslPackage.EJINJA_EXPRESSION_EVALUATION_WITHOUT_BRACKETS__IF_CHAIN:
        getIf_chain().clear();
        getIf_chain().addAll((Collection<? extends EIfBlock>)newValue);
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
      case AnsibleDslPackage.EJINJA_EXPRESSION_EVALUATION_WITHOUT_BRACKETS__EXPRESSION_TO_EVALUATE:
        setExpression_to_evaluate((EFilteredExpression)null);
        return;
      case AnsibleDslPackage.EJINJA_EXPRESSION_EVALUATION_WITHOUT_BRACKETS__IF_CHAIN:
        getIf_chain().clear();
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
      case AnsibleDslPackage.EJINJA_EXPRESSION_EVALUATION_WITHOUT_BRACKETS__EXPRESSION_TO_EVALUATE:
        return expression_to_evaluate != null;
      case AnsibleDslPackage.EJINJA_EXPRESSION_EVALUATION_WITHOUT_BRACKETS__IF_CHAIN:
        return if_chain != null && !if_chain.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EJinjaExpressionEvaluationWithoutBracketsImpl
