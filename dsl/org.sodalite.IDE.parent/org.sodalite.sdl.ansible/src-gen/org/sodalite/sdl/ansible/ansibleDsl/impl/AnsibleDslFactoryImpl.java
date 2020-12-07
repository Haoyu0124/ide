/**
 * generated by Xtext 2.23.0
 */
package org.sodalite.sdl.ansible.ansibleDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.sodalite.sdl.ansible.ansibleDsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnsibleDslFactoryImpl extends EFactoryImpl implements AnsibleDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AnsibleDslFactory init()
  {
    try
    {
      AnsibleDslFactory theAnsibleDslFactory = (AnsibleDslFactory)EPackage.Registry.INSTANCE.getEFactory(AnsibleDslPackage.eNS_URI);
      if (theAnsibleDslFactory != null)
      {
        return theAnsibleDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new AnsibleDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnsibleDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case AnsibleDslPackage.MODEL: return createModel();
      case AnsibleDslPackage.EPLAYBOOK: return createEPlaybook();
      case AnsibleDslPackage.EBASE: return createEBase();
      case AnsibleDslPackage.EEXECUTION: return createEExecution();
      case AnsibleDslPackage.EBLOCK_TASK: return createEBlockTask();
      case AnsibleDslPackage.ETASK_HANDLER: return createETaskHandler();
      case AnsibleDslPackage.EPLAY: return createEPlay();
      case AnsibleDslPackage.EBLOCK: return createEBlock();
      case AnsibleDslPackage.ETASK: return createETask();
      case AnsibleDslPackage.EHANDLER: return createEHandler();
      case AnsibleDslPackage.EMODULE_CALL: return createEModuleCall();
      case AnsibleDslPackage.EPARAMETER: return createEParameter();
      case AnsibleDslPackage.ECONDITIONAL_EXPRESSION: return createEConditionalExpression();
      case AnsibleDslPackage.ECONDITIONAL_FORMULA: return createEConditionalFormula();
      case AnsibleDslPackage.EROLE_INCLUSION: return createERoleInclusion();
      case AnsibleDslPackage.EROLE_INCLUSIONS: return createERoleInclusions();
      case AnsibleDslPackage.ELOOP: return createELoop();
      case AnsibleDslPackage.ELOOP_OVER_LIST: return createELoopOverList();
      case AnsibleDslPackage.ELOOP_LIST: return createELoopList();
      case AnsibleDslPackage.ELOOP_CONTROL: return createELoopControl();
      case AnsibleDslPackage.EUNTIL: return createEUntil();
      case AnsibleDslPackage.EPRIVILAGE_ESCALATION: return createEPrivilageEscalation();
      case AnsibleDslPackage.EVALIDATION_MODE: return createEValidationMode();
      case AnsibleDslPackage.ECONNECTION: return createEConnection();
      case AnsibleDslPackage.EEXE_SETTINGS: return createEExeSettings();
      case AnsibleDslPackage.EPLAY_EXE_SETTINGS: return createEPlayExeSettings();
      case AnsibleDslPackage.EEXECUTION_EXE_SETTINGS: return createEExecutionExeSettings();
      case AnsibleDslPackage.EERROR_HANDLING: return createEErrorHandling();
      case AnsibleDslPackage.EBLOCK_ERROR_HANDLING: return createEBlockErrorHandling();
      case AnsibleDslPackage.EPLAY_ERROR_HANDLING: return createEPlayErrorHandling();
      case AnsibleDslPackage.ETASK_HANDLER_ERROR_HANDLING: return createETaskHandlerErrorHandling();
      case AnsibleDslPackage.EFACTS_SETTINGS: return createEFactsSettings();
      case AnsibleDslPackage.EDELEGATION: return createEDelegation();
      case AnsibleDslPackage.EASYNCHRONOUS_SETTINGS: return createEAsynchronousSettings();
      case AnsibleDslPackage.ENOTIFIABLE: return createENotifiable();
      case AnsibleDslPackage.ENOTIFIED_HANDLER: return createENotifiedHandler();
      case AnsibleDslPackage.ENOTIFIED_TOPIC: return createENotifiedTopic();
      case AnsibleDslPackage.EVALUE_PASSED: return createEValuePassed();
      case AnsibleDslPackage.EVALUE: return createEValue();
      case AnsibleDslPackage.EITEM: return createEItem();
      case AnsibleDslPackage.EFILTERED_VARIABLE: return createEFilteredVariable();
      case AnsibleDslPackage.EFILTERED_VARIABLE_OR_STRING: return createEFilteredVariableOrString();
      case AnsibleDslPackage.EFILTERED_VARIABLES_AND_STRING: return createEFilteredVariablesAndString();
      case AnsibleDslPackage.EDICTIONARY_PAIR_REFERENCE: return createEDictionaryPairReference();
      case AnsibleDslPackage.EDECLARED_VARIABLE: return createEDeclaredVariable();
      case AnsibleDslPackage.EVARIABLE_DECLARATION: return createEVariableDeclaration();
      case AnsibleDslPackage.EREGISTER_VARIABLE: return createERegisterVariable();
      case AnsibleDslPackage.EFACT_GATHERED: return createEFactGathered();
      case AnsibleDslPackage.EDICTIONARY: return createEDictionary();
      case AnsibleDslPackage.EDICTIONARY_PAIR: return createEDictionaryPair();
      case AnsibleDslPackage.ELIST: return createEList();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EPlaybook createEPlaybook()
  {
    EPlaybookImpl ePlaybook = new EPlaybookImpl();
    return ePlaybook;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EBase createEBase()
  {
    EBaseImpl eBase = new EBaseImpl();
    return eBase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EExecution createEExecution()
  {
    EExecutionImpl eExecution = new EExecutionImpl();
    return eExecution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EBlockTask createEBlockTask()
  {
    EBlockTaskImpl eBlockTask = new EBlockTaskImpl();
    return eBlockTask;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ETaskHandler createETaskHandler()
  {
    ETaskHandlerImpl eTaskHandler = new ETaskHandlerImpl();
    return eTaskHandler;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EPlay createEPlay()
  {
    EPlayImpl ePlay = new EPlayImpl();
    return ePlay;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EBlock createEBlock()
  {
    EBlockImpl eBlock = new EBlockImpl();
    return eBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ETask createETask()
  {
    ETaskImpl eTask = new ETaskImpl();
    return eTask;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EHandler createEHandler()
  {
    EHandlerImpl eHandler = new EHandlerImpl();
    return eHandler;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EModuleCall createEModuleCall()
  {
    EModuleCallImpl eModuleCall = new EModuleCallImpl();
    return eModuleCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EParameter createEParameter()
  {
    EParameterImpl eParameter = new EParameterImpl();
    return eParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EConditionalExpression createEConditionalExpression()
  {
    EConditionalExpressionImpl eConditionalExpression = new EConditionalExpressionImpl();
    return eConditionalExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EConditionalFormula createEConditionalFormula()
  {
    EConditionalFormulaImpl eConditionalFormula = new EConditionalFormulaImpl();
    return eConditionalFormula;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ERoleInclusion createERoleInclusion()
  {
    ERoleInclusionImpl eRoleInclusion = new ERoleInclusionImpl();
    return eRoleInclusion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ERoleInclusions createERoleInclusions()
  {
    ERoleInclusionsImpl eRoleInclusions = new ERoleInclusionsImpl();
    return eRoleInclusions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ELoop createELoop()
  {
    ELoopImpl eLoop = new ELoopImpl();
    return eLoop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ELoopOverList createELoopOverList()
  {
    ELoopOverListImpl eLoopOverList = new ELoopOverListImpl();
    return eLoopOverList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ELoopList createELoopList()
  {
    ELoopListImpl eLoopList = new ELoopListImpl();
    return eLoopList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ELoopControl createELoopControl()
  {
    ELoopControlImpl eLoopControl = new ELoopControlImpl();
    return eLoopControl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EUntil createEUntil()
  {
    EUntilImpl eUntil = new EUntilImpl();
    return eUntil;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EPrivilageEscalation createEPrivilageEscalation()
  {
    EPrivilageEscalationImpl ePrivilageEscalation = new EPrivilageEscalationImpl();
    return ePrivilageEscalation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EValidationMode createEValidationMode()
  {
    EValidationModeImpl eValidationMode = new EValidationModeImpl();
    return eValidationMode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EConnection createEConnection()
  {
    EConnectionImpl eConnection = new EConnectionImpl();
    return eConnection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EExeSettings createEExeSettings()
  {
    EExeSettingsImpl eExeSettings = new EExeSettingsImpl();
    return eExeSettings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EPlayExeSettings createEPlayExeSettings()
  {
    EPlayExeSettingsImpl ePlayExeSettings = new EPlayExeSettingsImpl();
    return ePlayExeSettings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EExecutionExeSettings createEExecutionExeSettings()
  {
    EExecutionExeSettingsImpl eExecutionExeSettings = new EExecutionExeSettingsImpl();
    return eExecutionExeSettings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EErrorHandling createEErrorHandling()
  {
    EErrorHandlingImpl eErrorHandling = new EErrorHandlingImpl();
    return eErrorHandling;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EBlockErrorHandling createEBlockErrorHandling()
  {
    EBlockErrorHandlingImpl eBlockErrorHandling = new EBlockErrorHandlingImpl();
    return eBlockErrorHandling;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EPlayErrorHandling createEPlayErrorHandling()
  {
    EPlayErrorHandlingImpl ePlayErrorHandling = new EPlayErrorHandlingImpl();
    return ePlayErrorHandling;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ETaskHandlerErrorHandling createETaskHandlerErrorHandling()
  {
    ETaskHandlerErrorHandlingImpl eTaskHandlerErrorHandling = new ETaskHandlerErrorHandlingImpl();
    return eTaskHandlerErrorHandling;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EFactsSettings createEFactsSettings()
  {
    EFactsSettingsImpl eFactsSettings = new EFactsSettingsImpl();
    return eFactsSettings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EDelegation createEDelegation()
  {
    EDelegationImpl eDelegation = new EDelegationImpl();
    return eDelegation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAsynchronousSettings createEAsynchronousSettings()
  {
    EAsynchronousSettingsImpl eAsynchronousSettings = new EAsynchronousSettingsImpl();
    return eAsynchronousSettings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ENotifiable createENotifiable()
  {
    ENotifiableImpl eNotifiable = new ENotifiableImpl();
    return eNotifiable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ENotifiedHandler createENotifiedHandler()
  {
    ENotifiedHandlerImpl eNotifiedHandler = new ENotifiedHandlerImpl();
    return eNotifiedHandler;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ENotifiedTopic createENotifiedTopic()
  {
    ENotifiedTopicImpl eNotifiedTopic = new ENotifiedTopicImpl();
    return eNotifiedTopic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EValuePassed createEValuePassed()
  {
    EValuePassedImpl eValuePassed = new EValuePassedImpl();
    return eValuePassed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EValue createEValue()
  {
    EValueImpl eValue = new EValueImpl();
    return eValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EItem createEItem()
  {
    EItemImpl eItem = new EItemImpl();
    return eItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EFilteredVariable createEFilteredVariable()
  {
    EFilteredVariableImpl eFilteredVariable = new EFilteredVariableImpl();
    return eFilteredVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EFilteredVariableOrString createEFilteredVariableOrString()
  {
    EFilteredVariableOrStringImpl eFilteredVariableOrString = new EFilteredVariableOrStringImpl();
    return eFilteredVariableOrString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EFilteredVariablesAndString createEFilteredVariablesAndString()
  {
    EFilteredVariablesAndStringImpl eFilteredVariablesAndString = new EFilteredVariablesAndStringImpl();
    return eFilteredVariablesAndString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EDictionaryPairReference createEDictionaryPairReference()
  {
    EDictionaryPairReferenceImpl eDictionaryPairReference = new EDictionaryPairReferenceImpl();
    return eDictionaryPairReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EDeclaredVariable createEDeclaredVariable()
  {
    EDeclaredVariableImpl eDeclaredVariable = new EDeclaredVariableImpl();
    return eDeclaredVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EVariableDeclaration createEVariableDeclaration()
  {
    EVariableDeclarationImpl eVariableDeclaration = new EVariableDeclarationImpl();
    return eVariableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ERegisterVariable createERegisterVariable()
  {
    ERegisterVariableImpl eRegisterVariable = new ERegisterVariableImpl();
    return eRegisterVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EFactGathered createEFactGathered()
  {
    EFactGatheredImpl eFactGathered = new EFactGatheredImpl();
    return eFactGathered;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EDictionary createEDictionary()
  {
    EDictionaryImpl eDictionary = new EDictionaryImpl();
    return eDictionary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EDictionaryPair createEDictionaryPair()
  {
    EDictionaryPairImpl eDictionaryPair = new EDictionaryPairImpl();
    return eDictionaryPair;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList createEList()
  {
    EListImpl eList = new EListImpl();
    return eList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AnsibleDslPackage getAnsibleDslPackage()
  {
    return (AnsibleDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static AnsibleDslPackage getPackage()
  {
    return AnsibleDslPackage.eINSTANCE;
  }

} //AnsibleDslFactoryImpl
