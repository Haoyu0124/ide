/*
 * generated by Xtext 2.23.0
 */
package org.sodalite.sdl.ansible.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage;
import org.sodalite.sdl.ansible.ansibleDsl.EAndExpression;
import org.sodalite.sdl.ansible.ansibleDsl.EAsynchronousSettings;
import org.sodalite.sdl.ansible.ansibleDsl.EBlock;
import org.sodalite.sdl.ansible.ansibleDsl.EBlockErrorHandling;
import org.sodalite.sdl.ansible.ansibleDsl.EConnection;
import org.sodalite.sdl.ansible.ansibleDsl.EDeclaredVariableReference;
import org.sodalite.sdl.ansible.ansibleDsl.EDelegation;
import org.sodalite.sdl.ansible.ansibleDsl.EDictionary;
import org.sodalite.sdl.ansible.ansibleDsl.EDictionaryPair;
import org.sodalite.sdl.ansible.ansibleDsl.EDictionaryPairReference;
import org.sodalite.sdl.ansible.ansibleDsl.EExecutionExeSettings;
import org.sodalite.sdl.ansible.ansibleDsl.EFactGathered;
import org.sodalite.sdl.ansible.ansibleDsl.EFactsSettings;
import org.sodalite.sdl.ansible.ansibleDsl.EFilteredExpression;
import org.sodalite.sdl.ansible.ansibleDsl.EFunctionCall;
import org.sodalite.sdl.ansible.ansibleDsl.EHandler;
import org.sodalite.sdl.ansible.ansibleDsl.EIfExpression;
import org.sodalite.sdl.ansible.ansibleDsl.EIsExpression;
import org.sodalite.sdl.ansible.ansibleDsl.EItem;
import org.sodalite.sdl.ansible.ansibleDsl.EJinjaExpressionAndString;
import org.sodalite.sdl.ansible.ansibleDsl.EJinjaExpressionEvaluation;
import org.sodalite.sdl.ansible.ansibleDsl.EJinjaExpressionOrString;
import org.sodalite.sdl.ansible.ansibleDsl.EList;
import org.sodalite.sdl.ansible.ansibleDsl.ELoopControl;
import org.sodalite.sdl.ansible.ansibleDsl.ELoopOverList;
import org.sodalite.sdl.ansible.ansibleDsl.EModuleCall;
import org.sodalite.sdl.ansible.ansibleDsl.ENotifiedHandler;
import org.sodalite.sdl.ansible.ansibleDsl.ENotifiedTopic;
import org.sodalite.sdl.ansible.ansibleDsl.EOperation;
import org.sodalite.sdl.ansible.ansibleDsl.EOrExpression;
import org.sodalite.sdl.ansible.ansibleDsl.EParameter;
import org.sodalite.sdl.ansible.ansibleDsl.EParenthesisedExpression;
import org.sodalite.sdl.ansible.ansibleDsl.EPlay;
import org.sodalite.sdl.ansible.ansibleDsl.EPlayErrorHandling;
import org.sodalite.sdl.ansible.ansibleDsl.EPlayExeSettings;
import org.sodalite.sdl.ansible.ansibleDsl.EPlaybook;
import org.sodalite.sdl.ansible.ansibleDsl.EPrivilageEscalation;
import org.sodalite.sdl.ansible.ansibleDsl.ERegisterVariable;
import org.sodalite.sdl.ansible.ansibleDsl.ERoleInclusion;
import org.sodalite.sdl.ansible.ansibleDsl.ERoleInclusions;
import org.sodalite.sdl.ansible.ansibleDsl.ESimpleValue;
import org.sodalite.sdl.ansible.ansibleDsl.ESimpleValueWithoutString;
import org.sodalite.sdl.ansible.ansibleDsl.ETask;
import org.sodalite.sdl.ansible.ansibleDsl.ETaskHandlerErrorHandling;
import org.sodalite.sdl.ansible.ansibleDsl.ETruthExpression;
import org.sodalite.sdl.ansible.ansibleDsl.EUntil;
import org.sodalite.sdl.ansible.ansibleDsl.EValidationMode;
import org.sodalite.sdl.ansible.ansibleDsl.EVariableDeclaration;
import org.sodalite.sdl.ansible.services.AnsibleDslGrammarAccess;

@SuppressWarnings("all")
public class AnsibleDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private AnsibleDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == AnsibleDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case AnsibleDslPackage.EAND_EXPRESSION:
				sequence_EAndExpression(context, (EAndExpression) semanticObject); 
				return; 
			case AnsibleDslPackage.EASYNCHRONOUS_SETTINGS:
				sequence_EAsynchronousSettings(context, (EAsynchronousSettings) semanticObject); 
				return; 
			case AnsibleDslPackage.EBLOCK:
				sequence_EBlock(context, (EBlock) semanticObject); 
				return; 
			case AnsibleDslPackage.EBLOCK_ERROR_HANDLING:
				sequence_EBlockErrorHandling(context, (EBlockErrorHandling) semanticObject); 
				return; 
			case AnsibleDslPackage.ECONNECTION:
				sequence_EConnection(context, (EConnection) semanticObject); 
				return; 
			case AnsibleDslPackage.EDECLARED_VARIABLE_REFERENCE:
				sequence_EDeclaredVariableReference(context, (EDeclaredVariableReference) semanticObject); 
				return; 
			case AnsibleDslPackage.EDELEGATION:
				sequence_EDelegation(context, (EDelegation) semanticObject); 
				return; 
			case AnsibleDslPackage.EDICTIONARY:
				sequence_EDictionary(context, (EDictionary) semanticObject); 
				return; 
			case AnsibleDslPackage.EDICTIONARY_PAIR:
				sequence_EDictionaryPair(context, (EDictionaryPair) semanticObject); 
				return; 
			case AnsibleDslPackage.EDICTIONARY_PAIR_REFERENCE:
				sequence_EDictionaryPairReference(context, (EDictionaryPairReference) semanticObject); 
				return; 
			case AnsibleDslPackage.EEXECUTION_EXE_SETTINGS:
				sequence_EExecutionExeSettings(context, (EExecutionExeSettings) semanticObject); 
				return; 
			case AnsibleDslPackage.EFACT_GATHERED:
				sequence_EFactGathered(context, (EFactGathered) semanticObject); 
				return; 
			case AnsibleDslPackage.EFACTS_SETTINGS:
				sequence_EFactsSettings(context, (EFactsSettings) semanticObject); 
				return; 
			case AnsibleDslPackage.EFILTERED_EXPRESSION:
				sequence_EFilteredExpression(context, (EFilteredExpression) semanticObject); 
				return; 
			case AnsibleDslPackage.EFUNCTION_CALL:
				sequence_EFunctionCall(context, (EFunctionCall) semanticObject); 
				return; 
			case AnsibleDslPackage.EHANDLER:
				sequence_EHandler(context, (EHandler) semanticObject); 
				return; 
			case AnsibleDslPackage.EIF_EXPRESSION:
				sequence_EIfExpression(context, (EIfExpression) semanticObject); 
				return; 
			case AnsibleDslPackage.EIS_EXPRESSION:
				sequence_EIsExpression(context, (EIsExpression) semanticObject); 
				return; 
			case AnsibleDslPackage.EITEM:
				sequence_EItem(context, (EItem) semanticObject); 
				return; 
			case AnsibleDslPackage.EJINJA_EXPRESSION_AND_STRING:
				sequence_EJinjaExpressionAndString(context, (EJinjaExpressionAndString) semanticObject); 
				return; 
			case AnsibleDslPackage.EJINJA_EXPRESSION_EVALUATION:
				sequence_EJinjaExpressionEvaluation(context, (EJinjaExpressionEvaluation) semanticObject); 
				return; 
			case AnsibleDslPackage.EJINJA_EXPRESSION_OR_STRING:
				sequence_EJinjaExpressionOrString(context, (EJinjaExpressionOrString) semanticObject); 
				return; 
			case AnsibleDslPackage.ELIST:
				sequence_EList(context, (EList) semanticObject); 
				return; 
			case AnsibleDslPackage.ELOOP_CONTROL:
				sequence_ELoopControl(context, (ELoopControl) semanticObject); 
				return; 
			case AnsibleDslPackage.ELOOP_OVER_LIST:
				sequence_ELoopOverList(context, (ELoopOverList) semanticObject); 
				return; 
			case AnsibleDslPackage.EMODULE_CALL:
				sequence_EModuleCall(context, (EModuleCall) semanticObject); 
				return; 
			case AnsibleDslPackage.ENOTIFIED_HANDLER:
				sequence_ENotifiedHandler(context, (ENotifiedHandler) semanticObject); 
				return; 
			case AnsibleDslPackage.ENOTIFIED_TOPIC:
				sequence_ENotifiedTopic(context, (ENotifiedTopic) semanticObject); 
				return; 
			case AnsibleDslPackage.EOPERATION:
				sequence_EOperation(context, (EOperation) semanticObject); 
				return; 
			case AnsibleDslPackage.EOR_EXPRESSION:
				sequence_EOrExpression(context, (EOrExpression) semanticObject); 
				return; 
			case AnsibleDslPackage.EPARAMETER:
				sequence_EParameter(context, (EParameter) semanticObject); 
				return; 
			case AnsibleDslPackage.EPARENTHESISED_EXPRESSION:
				sequence_EParenthesisedExpression(context, (EParenthesisedExpression) semanticObject); 
				return; 
			case AnsibleDslPackage.EPLAY:
				sequence_EPlay(context, (EPlay) semanticObject); 
				return; 
			case AnsibleDslPackage.EPLAY_ERROR_HANDLING:
				sequence_EPlayErrorHandling(context, (EPlayErrorHandling) semanticObject); 
				return; 
			case AnsibleDslPackage.EPLAY_EXE_SETTINGS:
				sequence_EPlayExeSettings(context, (EPlayExeSettings) semanticObject); 
				return; 
			case AnsibleDslPackage.EPLAYBOOK:
				sequence_EPlaybook(context, (EPlaybook) semanticObject); 
				return; 
			case AnsibleDslPackage.EPRIVILAGE_ESCALATION:
				sequence_EPrivilageEscalation(context, (EPrivilageEscalation) semanticObject); 
				return; 
			case AnsibleDslPackage.EREGISTER_VARIABLE:
				sequence_ERegisterVariable(context, (ERegisterVariable) semanticObject); 
				return; 
			case AnsibleDslPackage.EROLE_INCLUSION:
				sequence_ERoleInclusion(context, (ERoleInclusion) semanticObject); 
				return; 
			case AnsibleDslPackage.EROLE_INCLUSIONS:
				sequence_ERoleInclusions(context, (ERoleInclusions) semanticObject); 
				return; 
			case AnsibleDslPackage.ESIMPLE_VALUE:
				sequence_ESimpleValue(context, (ESimpleValue) semanticObject); 
				return; 
			case AnsibleDslPackage.ESIMPLE_VALUE_WITHOUT_STRING:
				sequence_ESimpleValueWithoutString(context, (ESimpleValueWithoutString) semanticObject); 
				return; 
			case AnsibleDslPackage.ETASK:
				sequence_ETask(context, (ETask) semanticObject); 
				return; 
			case AnsibleDslPackage.ETASK_HANDLER_ERROR_HANDLING:
				sequence_ETaskHandlerErrorHandling(context, (ETaskHandlerErrorHandling) semanticObject); 
				return; 
			case AnsibleDslPackage.ETRUTH_EXPRESSION:
				sequence_ETruthExpression(context, (ETruthExpression) semanticObject); 
				return; 
			case AnsibleDslPackage.EUNTIL:
				sequence_EUntil(context, (EUntil) semanticObject); 
				return; 
			case AnsibleDslPackage.EVALIDATION_MODE:
				sequence_EValidationMode(context, (EValidationMode) semanticObject); 
				return; 
			case AnsibleDslPackage.EVARIABLE_DECLARATION:
				sequence_EVariableDeclaration(context, (EVariableDeclaration) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     EAndExpression returns EAndExpression
	 *
	 * Constraint:
	 *     (left_and=ETruthExpression right_and=EAndExpression?)
	 */
	protected void sequence_EAndExpression(ISerializationContext context, EAndExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EAsynchronousSettings returns EAsynchronousSettings
	 *
	 * Constraint:
	 *     (async=NUMBER | poll=NUMBER)+
	 */
	protected void sequence_EAsynchronousSettings(ISerializationContext context, EAsynchronousSettings semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EErrorHandling returns EBlockErrorHandling
	 *     EBlockErrorHandling returns EBlockErrorHandling
	 *
	 * Constraint:
	 *     (any_errors_fatal=BOOLEAN? ignore_errors=BOOLEAN? ignore_unreachable=BOOLEAN?)
	 */
	protected void sequence_EBlockErrorHandling(ISerializationContext context, EBlockErrorHandling semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EBase returns EBlock
	 *     EExecution returns EBlock
	 *     EBlockTask returns EBlock
	 *     EBlock returns EBlock
	 *
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         privilage_escalation=EPrivilageEscalation? 
	 *         validation_mode=EValidationMode? 
	 *         connection=EConnection? 
	 *         no_log=BOOLEAN? 
	 *         (debugger='always' | debugger='never' | debugger='on_failed' | debugger='on_unreachable' | debugger='on_skipped')? 
	 *         module_defaults=EList? 
	 *         environment=EList? 
	 *         collections=EList? 
	 *         tags=EList? 
	 *         (variable_declarations+=EVariableDeclaration variable_declarations+=EVariableDeclaration*)? 
	 *         exe_settings=EExecutionExeSettings? 
	 *         delegation=EDelegation? 
	 *         when_expression=EJinjaExpressionEvaluationWithoutBrackets? 
	 *         error_handling=EBlockErrorHandling? 
	 *         tasks+=ETask+ 
	 *         rescue_tasks+=ETask* 
	 *         always_tasks+=ETask*
	 *     )
	 */
	protected void sequence_EBlock(ISerializationContext context, EBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EConnection returns EConnection
	 *
	 * Constraint:
	 *     (connection=STRING? port=NUMBER? remote_user=STRING?)
	 */
	protected void sequence_EConnection(ISerializationContext context, EConnection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EValuePassedToJinjaExpression returns EDeclaredVariableReference
	 *     EDeclaredVariableReference returns EDeclaredVariableReference
	 *
	 * Constraint:
	 *     (variable_reference=[EDeclaredVariable|ID] index=NUMBER? tail+=EDictionaryPairReference*)
	 */
	protected void sequence_EDeclaredVariableReference(ISerializationContext context, EDeclaredVariableReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EDelegation returns EDelegation
	 *
	 * Constraint:
	 *     (delegate_to=STRING delegate_facts=BOOLEAN?)
	 */
	protected void sequence_EDelegation(ISerializationContext context, EDelegation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EDictionaryPairReference returns EDictionaryPairReference
	 *
	 * Constraint:
	 *     (name=[EDictionaryPair|ID] index=NUMBER?)
	 */
	protected void sequence_EDictionaryPairReference(ISerializationContext context, EDictionaryPairReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EDictionaryPair returns EDictionaryPair
	 *
	 * Constraint:
	 *     (name=ID value=EValue)
	 */
	protected void sequence_EDictionaryPair(ISerializationContext context, EDictionaryPair semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AnsibleDslPackage.Literals.EDICTIONARY_PAIR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AnsibleDslPackage.Literals.EDICTIONARY_PAIR__NAME));
			if (transientValues.isValueTransient(semanticObject, AnsibleDslPackage.Literals.EDICTIONARY_PAIR__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AnsibleDslPackage.Literals.EDICTIONARY_PAIR__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEDictionaryPairAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getEDictionaryPairAccess().getValueEValueParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EValuePassed returns EDictionary
	 *     EValuePassedToJinjaExpression returns EDictionary
	 *     EComposedValue returns EDictionary
	 *     EValue returns EDictionary
	 *     EValueWithoutString returns EDictionary
	 *     EDictionary returns EDictionary
	 *
	 * Constraint:
	 *     (dictionary_pairs+=EDictionaryPair dictionary_pairs+=EDictionaryPair*)
	 */
	protected void sequence_EDictionary(ISerializationContext context, EDictionary semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EExeSettings returns EExecutionExeSettings
	 *     EExecutionExeSettings returns EExecutionExeSettings
	 *
	 * Constraint:
	 *     (throttle=NUMBER? run_once=BOOLEAN?)
	 */
	protected void sequence_EExecutionExeSettings(ISerializationContext context, EExecutionExeSettings semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EValuePassedToJinjaExpression returns EFactGathered
	 *     EFactGathered returns EFactGathered
	 *
	 * Constraint:
	 *     tail+=ID*
	 */
	protected void sequence_EFactGathered(ISerializationContext context, EFactGathered semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EFactsSettings returns EFactsSettings
	 *
	 * Constraint:
	 *     (gather_facts=BOOLEAN? gather_subset=EList? gather_timeout=NUMBER? fact_path=STRING?)
	 */
	protected void sequence_EFactsSettings(ISerializationContext context, EFactsSettings semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EJinjaExpressionEvaluationWithoutBrackets returns EFilteredExpression
	 *     EFilteredExpression returns EFilteredExpression
	 *
	 * Constraint:
	 *     (to_filter=EOrExpression tail+=EFunctionCall* filter=EFilteredExpression?)
	 */
	protected void sequence_EFilteredExpression(ISerializationContext context, EFilteredExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EValuePassedToJinjaExpression returns EFunctionCall
	 *     EFunctionCall returns EFunctionCall
	 *
	 * Constraint:
	 *     (name=ID (parameters+=EFilteredExpression parameters+=EFilteredExpression*)?)
	 */
	protected void sequence_EFunctionCall(ISerializationContext context, EFunctionCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EBase returns EHandler
	 *     EExecution returns EHandler
	 *     ETaskHandler returns EHandler
	 *     EHandler returns EHandler
	 *
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         privilage_escalation=EPrivilageEscalation? 
	 *         validation_mode=EValidationMode? 
	 *         connection=EConnection? 
	 *         no_log=BOOLEAN? 
	 *         (debugger='always' | debugger='never' | debugger='on_failed' | debugger='on_unreachable' | debugger='on_skipped')? 
	 *         module_defaults=EList? 
	 *         environment=EList? 
	 *         collections=EList? 
	 *         tags=EList? 
	 *         (variable_declarations+=EVariableDeclaration variable_declarations+=EVariableDeclaration*)? 
	 *         exe_settings=EExecutionExeSettings? 
	 *         delegation=EDelegation? 
	 *         when_expression=EJinjaExpressionEvaluationWithoutBrackets? 
	 *         error_handling=ETaskHandlerErrorHandling? 
	 *         action=STRING? 
	 *         asynchronous_settings=EAsynchronousSettings? 
	 *         args=EDictionary? 
	 *         module=EModuleCall 
	 *         notifiables+=ENotifiable* 
	 *         loop=ELoop? 
	 *         register=ERegisterVariable? 
	 *         listen_to+=[ENotifiedTopic|STRING]*
	 *     )
	 */
	protected void sequence_EHandler(ISerializationContext context, EHandler semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EJinjaExpressionEvaluationWithoutBrackets returns EIfExpression
	 *     EIfExpression returns EIfExpression
	 *
	 * Constraint:
	 *     (if_expression=EFilteredExpression if_condition=EFilteredExpression else_expression=EFilteredExpression?)
	 */
	protected void sequence_EIfExpression(ISerializationContext context, EIfExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EIsExpression returns EIsExpression
	 *
	 * Constraint:
	 *     (
	 *         parenthesised_expression=EParenthesisedExpression 
	 *         ((is_not='not'? status=EIsExpression) | (is_not='not'? container_expression=EIsExpression))?
	 *     )
	 */
	protected void sequence_EIsExpression(ISerializationContext context, EIsExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EValuePassedToJinjaExpression returns EItem
	 *     EItem returns EItem
	 *
	 * Constraint:
	 *     tail+=ID*
	 */
	protected void sequence_EItem(ISerializationContext context, EItem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EJinjaExpressionAndString returns EJinjaExpressionAndString
	 *     EValuePassed returns EJinjaExpressionAndString
	 *
	 * Constraint:
	 *     jinja_expression_and_string+=EJinjaExpressionOrString+
	 */
	protected void sequence_EJinjaExpressionAndString(ISerializationContext context, EJinjaExpressionAndString semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EJinjaExpressionOrString returns EJinjaExpressionEvaluation
	 *     EJinjaExpressionEvaluation returns EJinjaExpressionEvaluation
	 *
	 * Constraint:
	 *     jinja_expression=EJinjaExpressionEvaluationWithoutBrackets
	 */
	protected void sequence_EJinjaExpressionEvaluation(ISerializationContext context, EJinjaExpressionEvaluation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AnsibleDslPackage.Literals.EJINJA_EXPRESSION_EVALUATION__JINJA_EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AnsibleDslPackage.Literals.EJINJA_EXPRESSION_EVALUATION__JINJA_EXPRESSION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEJinjaExpressionEvaluationAccess().getJinja_expressionEJinjaExpressionEvaluationWithoutBracketsParserRuleCall_1_0(), semanticObject.getJinja_expression());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EJinjaExpressionOrString returns EJinjaExpressionOrString
	 *
	 * Constraint:
	 *     string=STRING
	 */
	protected void sequence_EJinjaExpressionOrString(ISerializationContext context, EJinjaExpressionOrString semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AnsibleDslPackage.Literals.EJINJA_EXPRESSION_OR_STRING__STRING) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AnsibleDslPackage.Literals.EJINJA_EXPRESSION_OR_STRING__STRING));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEJinjaExpressionOrStringAccess().getStringSTRINGTerminalRuleCall_1_0(), semanticObject.getString());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EValuePassed returns EList
	 *     EValuePassedToJinjaExpression returns EList
	 *     EComposedValue returns EList
	 *     EValue returns EList
	 *     EValueWithoutString returns EList
	 *     EList returns EList
	 *
	 * Constraint:
	 *     (elements+=EValue elements+=EValue*)
	 */
	protected void sequence_EList(ISerializationContext context, EList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ELoopControl returns ELoopControl
	 *
	 * Constraint:
	 *     (label=EValuePassed? pause=NUMBER? index_var=ID? loop_var=ID? extended=BOOLEAN?)
	 */
	protected void sequence_ELoopControl(ISerializationContext context, ELoopControl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ELoop returns ELoopOverList
	 *     ELoopOverList returns ELoopOverList
	 *
	 * Constraint:
	 *     (loop_list=EValuePassed loop_control=ELoopControl?)
	 */
	protected void sequence_ELoopOverList(ISerializationContext context, ELoopOverList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EModuleCall returns EModuleCall
	 *
	 * Constraint:
	 *     (name=ID parameters+=EParameter*)
	 */
	protected void sequence_EModuleCall(ISerializationContext context, EModuleCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ENotifiable returns ENotifiedHandler
	 *     ENotifiedHandler returns ENotifiedHandler
	 *
	 * Constraint:
	 *     name=[EHandler|STRING]
	 */
	protected void sequence_ENotifiedHandler(ISerializationContext context, ENotifiedHandler semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AnsibleDslPackage.Literals.ENOTIFIED_HANDLER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AnsibleDslPackage.Literals.ENOTIFIED_HANDLER__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getENotifiedHandlerAccess().getNameEHandlerSTRINGTerminalRuleCall_0_1(), semanticObject.eGet(AnsibleDslPackage.Literals.ENOTIFIED_HANDLER__NAME, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ENotifiable returns ENotifiedTopic
	 *     ENotifiedTopic returns ENotifiedTopic
	 *
	 * Constraint:
	 *     name=STRING
	 */
	protected void sequence_ENotifiedTopic(ISerializationContext context, ENotifiedTopic semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AnsibleDslPackage.Literals.ENOTIFIED_TOPIC__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AnsibleDslPackage.Literals.ENOTIFIED_TOPIC__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getENotifiedTopicAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EOperation returns EOperation
	 *
	 * Constraint:
	 *     (
	 *         left_operand=EIsExpression 
	 *         (
	 *             (
	 *                 operator='+' | 
	 *                 operator='-' | 
	 *                 operator='/' | 
	 *                 operator='//' | 
	 *                 operator='%' | 
	 *                 operator='*' | 
	 *                 operator='**'
	 *             ) 
	 *             right_operand=EOperation
	 *         )?
	 *     )
	 */
	protected void sequence_EOperation(ISerializationContext context, EOperation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EOrExpression returns EOrExpression
	 *
	 * Constraint:
	 *     (left_or=EAndExpression right_or=EOrExpression?)
	 */
	protected void sequence_EOrExpression(ISerializationContext context, EOrExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EParameter returns EParameter
	 *
	 * Constraint:
	 *     (name=ID value_passed=EValuePassed)
	 */
	protected void sequence_EParameter(ISerializationContext context, EParameter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AnsibleDslPackage.Literals.EPARAMETER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AnsibleDslPackage.Literals.EPARAMETER__NAME));
			if (transientValues.isValueTransient(semanticObject, AnsibleDslPackage.Literals.EPARAMETER__VALUE_PASSED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AnsibleDslPackage.Literals.EPARAMETER__VALUE_PASSED));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEParameterAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getEParameterAccess().getValue_passedEValuePassedParserRuleCall_2_0(), semanticObject.getValue_passed());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EParenthesisedExpression returns EParenthesisedExpression
	 *
	 * Constraint:
	 *     (basic_value=EValuePassedToJinjaExpression | parenthesised_term=EOrExpression)
	 */
	protected void sequence_EParenthesisedExpression(ISerializationContext context, EParenthesisedExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EErrorHandling returns EPlayErrorHandling
	 *     EPlayErrorHandling returns EPlayErrorHandling
	 *
	 * Constraint:
	 *     (max_fail_percentage=NUMBER? any_errors_fatal=BOOLEAN? ignore_errors=BOOLEAN? ignore_unreachable=BOOLEAN?)
	 */
	protected void sequence_EPlayErrorHandling(ISerializationContext context, EPlayErrorHandling semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EExeSettings returns EPlayExeSettings
	 *     EPlayExeSettings returns EPlayExeSettings
	 *
	 * Constraint:
	 *     (strategy=STRING? serial_list=EList? order=STRING? throttle=NUMBER? run_once=BOOLEAN?)
	 */
	protected void sequence_EPlayExeSettings(ISerializationContext context, EPlayExeSettings semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EBase returns EPlay
	 *     EPlay returns EPlay
	 *
	 * Constraint:
	 *     (
	 *         (
	 *             name=STRING 
	 *             privilage_escalation=EPrivilageEscalation? 
	 *             validation_mode=EValidationMode? 
	 *             connection=EConnection? 
	 *             no_log=BOOLEAN? 
	 *             (debugger='always' | debugger='never' | debugger='on_failed' | debugger='on_unreachable' | debugger='on_skipped')? 
	 *             module_defaults=EList? 
	 *             environment=EList? 
	 *             collections=EList? 
	 *             tags=EList? 
	 *             (variable_declarations+=EVariableDeclaration variable_declarations+=EVariableDeclaration*)? 
	 *             play_exe_settings=EPlayExeSettings?
	 *         ) | 
	 *         error_handling=EPlayErrorHandling | 
	 *         facts_settings=EFactsSettings | 
	 *         vars_files=EList | 
	 *         vars_prompt=EList | 
	 *         force_handlers=BOOLEAN | 
	 *         pre_tasks_list+=EBlockTask | 
	 *         roles_inclusions=ERoleInclusions | 
	 *         (tasks_list+=EBlockTask post_tasks_list+=EBlockTask* handlers+=EHandler*)
	 *     )+
	 */
	protected void sequence_EPlay(ISerializationContext context, EPlay semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns EPlaybook
	 *     EPlaybook returns EPlaybook
	 *
	 * Constraint:
	 *     (name=STRING plays+=EPlay+)
	 */
	protected void sequence_EPlaybook(ISerializationContext context, EPlaybook semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EPrivilageEscalation returns EPrivilageEscalation
	 *
	 * Constraint:
	 *     (become=BOOLEAN? become_exe=STRING? become_flags=STRING? become_method=STRING? become_user=STRING?)
	 */
	protected void sequence_EPrivilageEscalation(ISerializationContext context, EPrivilageEscalation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EDeclaredVariable returns ERegisterVariable
	 *     ERegisterVariable returns ERegisterVariable
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_ERegisterVariable(ISerializationContext context, ERegisterVariable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AnsibleDslPackage.Literals.EDECLARED_VARIABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AnsibleDslPackage.Literals.EDECLARED_VARIABLE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getERegisterVariableAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EBase returns ERoleInclusion
	 *     EExecution returns ERoleInclusion
	 *     ERoleInclusion returns ERoleInclusion
	 *
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         privilage_escalation=EPrivilageEscalation? 
	 *         validation_mode=EValidationMode? 
	 *         connection=EConnection? 
	 *         no_log=BOOLEAN? 
	 *         (debugger='always' | debugger='never' | debugger='on_failed' | debugger='on_unreachable' | debugger='on_skipped')? 
	 *         module_defaults=EList? 
	 *         environment=EList? 
	 *         collections=EList? 
	 *         tags=EList? 
	 *         (variable_declarations+=EVariableDeclaration variable_declarations+=EVariableDeclaration*)? 
	 *         exe_settings=EExecutionExeSettings? 
	 *         delegation=EDelegation? 
	 *         when_expression=EJinjaExpressionEvaluationWithoutBrackets?
	 *     )
	 */
	protected void sequence_ERoleInclusion(ISerializationContext context, ERoleInclusion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ERoleInclusions returns ERoleInclusions
	 *
	 * Constraint:
	 *     (roles+=ERoleInclusion roles+=ERoleInclusion*)
	 */
	protected void sequence_ERoleInclusions(ISerializationContext context, ERoleInclusions semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EValuePassed returns ESimpleValueWithoutString
	 *     EValueWithoutString returns ESimpleValueWithoutString
	 *     ESimpleValueWithoutString returns ESimpleValueWithoutString
	 *
	 * Constraint:
	 *     (simple_value=BOOLEAN | simple_value=NULL | simple_value=NUMBER)
	 */
	protected void sequence_ESimpleValueWithoutString(ISerializationContext context, ESimpleValueWithoutString semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EValuePassedToJinjaExpression returns ESimpleValue
	 *     EValue returns ESimpleValue
	 *     ESimpleValue returns ESimpleValue
	 *
	 * Constraint:
	 *     (simple_value_string=STRING | simple_value_string=BOOLEAN | simple_value_string=NULL | simple_value_string=NUMBER)
	 */
	protected void sequence_ESimpleValue(ISerializationContext context, ESimpleValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EErrorHandling returns ETaskHandlerErrorHandling
	 *     ETaskHandlerErrorHandling returns ETaskHandlerErrorHandling
	 *
	 * Constraint:
	 *     (
	 *         changed_when=EJinjaExpressionEvaluationWithoutBrackets? 
	 *         failed_when=EJinjaExpressionEvaluationWithoutBrackets? 
	 *         any_errors_fatal=BOOLEAN? 
	 *         ignore_errors=BOOLEAN? 
	 *         ignore_unreachable=BOOLEAN?
	 *     )
	 */
	protected void sequence_ETaskHandlerErrorHandling(ISerializationContext context, ETaskHandlerErrorHandling semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EBase returns ETask
	 *     EExecution returns ETask
	 *     EBlockTask returns ETask
	 *     ETaskHandler returns ETask
	 *     ETask returns ETask
	 *
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         privilage_escalation=EPrivilageEscalation? 
	 *         validation_mode=EValidationMode? 
	 *         connection=EConnection? 
	 *         no_log=BOOLEAN? 
	 *         (debugger='always' | debugger='never' | debugger='on_failed' | debugger='on_unreachable' | debugger='on_skipped')? 
	 *         module_defaults=EList? 
	 *         environment=EList? 
	 *         collections=EList? 
	 *         tags=EList? 
	 *         (variable_declarations+=EVariableDeclaration variable_declarations+=EVariableDeclaration*)? 
	 *         exe_settings=EExecutionExeSettings? 
	 *         delegation=EDelegation? 
	 *         when_expression=EJinjaExpressionEvaluationWithoutBrackets? 
	 *         error_handling=ETaskHandlerErrorHandling? 
	 *         action=STRING? 
	 *         asynchronous_settings=EAsynchronousSettings? 
	 *         args=EDictionary? 
	 *         module=EModuleCall 
	 *         notifiables+=ENotifiable* 
	 *         loop=ELoop? 
	 *         register=ERegisterVariable?
	 *     )
	 */
	protected void sequence_ETask(ISerializationContext context, ETask semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ETruthExpression returns ETruthExpression
	 *
	 * Constraint:
	 *     (
	 *         left_value=EOperation 
	 *         (
	 *             (
	 *                 equality_sign='==' | 
	 *                 equality_sign='!=' | 
	 *                 equality_sign='<' | 
	 *                 equality_sign='>' | 
	 *                 equality_sign='<=' | 
	 *                 equality_sign='>='
	 *             ) 
	 *             right_value=ETruthExpression
	 *         )?
	 *     )
	 */
	protected void sequence_ETruthExpression(ISerializationContext context, ETruthExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ELoop returns EUntil
	 *     EUntil returns EUntil
	 *
	 * Constraint:
	 *     (until=EJinjaExpressionEvaluationWithoutBrackets | retries=NUMBER | delay=NUMBER)+
	 */
	protected void sequence_EUntil(ISerializationContext context, EUntil semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EValidationMode returns EValidationMode
	 *
	 * Constraint:
	 *     (check_mode=BOOLEAN? diff=BOOLEAN?)
	 */
	protected void sequence_EValidationMode(ISerializationContext context, EValidationMode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EDeclaredVariable returns EVariableDeclaration
	 *     EVariableDeclaration returns EVariableDeclaration
	 *
	 * Constraint:
	 *     (name=ID value_passed=EValue)
	 */
	protected void sequence_EVariableDeclaration(ISerializationContext context, EVariableDeclaration semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AnsibleDslPackage.Literals.EDECLARED_VARIABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AnsibleDslPackage.Literals.EDECLARED_VARIABLE__NAME));
			if (transientValues.isValueTransient(semanticObject, AnsibleDslPackage.Literals.EVARIABLE_DECLARATION__VALUE_PASSED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AnsibleDslPackage.Literals.EVARIABLE_DECLARATION__VALUE_PASSED));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEVariableDeclarationAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getEVariableDeclarationAccess().getValue_passedEValueParserRuleCall_2_0(), semanticObject.getValue_passed());
		feeder.finish();
	}
	
	
}
