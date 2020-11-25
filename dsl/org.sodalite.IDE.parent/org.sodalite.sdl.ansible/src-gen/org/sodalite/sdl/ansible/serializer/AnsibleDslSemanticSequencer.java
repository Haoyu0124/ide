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
import org.sodalite.sdl.ansible.ansibleDsl.EAsynchronousSettings;
import org.sodalite.sdl.ansible.ansibleDsl.EBaseCommonKeywords;
import org.sodalite.sdl.ansible.ansibleDsl.EBlock;
import org.sodalite.sdl.ansible.ansibleDsl.EBlockErrorHandling;
import org.sodalite.sdl.ansible.ansibleDsl.EConditionalExpression;
import org.sodalite.sdl.ansible.ansibleDsl.EConditionalFormula;
import org.sodalite.sdl.ansible.ansibleDsl.EConnection;
import org.sodalite.sdl.ansible.ansibleDsl.EDelegation;
import org.sodalite.sdl.ansible.ansibleDsl.EDictionary;
import org.sodalite.sdl.ansible.ansibleDsl.EDictionaryPair;
import org.sodalite.sdl.ansible.ansibleDsl.EExecutionCommonKeywords;
import org.sodalite.sdl.ansible.ansibleDsl.EExecutionExeSettings;
import org.sodalite.sdl.ansible.ansibleDsl.EFactsSettings;
import org.sodalite.sdl.ansible.ansibleDsl.EFilteredVariable;
import org.sodalite.sdl.ansible.ansibleDsl.EHandler;
import org.sodalite.sdl.ansible.ansibleDsl.EList;
import org.sodalite.sdl.ansible.ansibleDsl.ELoopControl;
import org.sodalite.sdl.ansible.ansibleDsl.ELoopOverList;
import org.sodalite.sdl.ansible.ansibleDsl.EModuleCall;
import org.sodalite.sdl.ansible.ansibleDsl.ENotifiedHandler;
import org.sodalite.sdl.ansible.ansibleDsl.ENotifiedTopic;
import org.sodalite.sdl.ansible.ansibleDsl.EParameter;
import org.sodalite.sdl.ansible.ansibleDsl.EParameters;
import org.sodalite.sdl.ansible.ansibleDsl.EPlay;
import org.sodalite.sdl.ansible.ansibleDsl.EPlayErrorHandling;
import org.sodalite.sdl.ansible.ansibleDsl.EPlayExeSettings;
import org.sodalite.sdl.ansible.ansibleDsl.EPlaybook;
import org.sodalite.sdl.ansible.ansibleDsl.EPrivilageEscalation;
import org.sodalite.sdl.ansible.ansibleDsl.ERegisterVariable;
import org.sodalite.sdl.ansible.ansibleDsl.ERole;
import org.sodalite.sdl.ansible.ansibleDsl.ERoleCalls;
import org.sodalite.sdl.ansible.ansibleDsl.ERoleMetadata;
import org.sodalite.sdl.ansible.ansibleDsl.ERoleMetadataGalaxy;
import org.sodalite.sdl.ansible.ansibleDsl.ETask;
import org.sodalite.sdl.ansible.ansibleDsl.ETaskHandlerCommonKeywords;
import org.sodalite.sdl.ansible.ansibleDsl.ETaskHandlerErrorHandling;
import org.sodalite.sdl.ansible.ansibleDsl.EUntil;
import org.sodalite.sdl.ansible.ansibleDsl.EValidationMode;
import org.sodalite.sdl.ansible.ansibleDsl.EValue;
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
			case AnsibleDslPackage.EASYNCHRONOUS_SETTINGS:
				sequence_EAsynchronousSettings(context, (EAsynchronousSettings) semanticObject); 
				return; 
			case AnsibleDslPackage.EBASE_COMMON_KEYWORDS:
				sequence_EBaseCommonKeywords(context, (EBaseCommonKeywords) semanticObject); 
				return; 
			case AnsibleDslPackage.EBLOCK:
				sequence_EBlock(context, (EBlock) semanticObject); 
				return; 
			case AnsibleDslPackage.EBLOCK_ERROR_HANDLING:
				sequence_EBlockErrorHandling(context, (EBlockErrorHandling) semanticObject); 
				return; 
			case AnsibleDslPackage.ECONDITIONAL_EXPRESSION:
				sequence_EConditionalExpression(context, (EConditionalExpression) semanticObject); 
				return; 
			case AnsibleDslPackage.ECONDITIONAL_FORMULA:
				sequence_EConditionalFormula(context, (EConditionalFormula) semanticObject); 
				return; 
			case AnsibleDslPackage.ECONNECTION:
				sequence_EConnection(context, (EConnection) semanticObject); 
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
			case AnsibleDslPackage.EEXECUTION_COMMON_KEYWORDS:
				sequence_EExecutionCommonKeywords(context, (EExecutionCommonKeywords) semanticObject); 
				return; 
			case AnsibleDslPackage.EEXECUTION_EXE_SETTINGS:
				sequence_EExecutionExeSettings(context, (EExecutionExeSettings) semanticObject); 
				return; 
			case AnsibleDslPackage.EFACTS_SETTINGS:
				sequence_EFactsSettings(context, (EFactsSettings) semanticObject); 
				return; 
			case AnsibleDslPackage.EFILTERED_VARIABLE:
				sequence_EFilteredVariable(context, (EFilteredVariable) semanticObject); 
				return; 
			case AnsibleDslPackage.EHANDLER:
				sequence_EHandler(context, (EHandler) semanticObject); 
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
			case AnsibleDslPackage.EPARAMETER:
				sequence_EParameter(context, (EParameter) semanticObject); 
				return; 
			case AnsibleDslPackage.EPARAMETERS:
				sequence_EParameters(context, (EParameters) semanticObject); 
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
			case AnsibleDslPackage.EROLE:
				sequence_ERole(context, (ERole) semanticObject); 
				return; 
			case AnsibleDslPackage.EROLE_CALLS:
				sequence_ERoleCalls(context, (ERoleCalls) semanticObject); 
				return; 
			case AnsibleDslPackage.EROLE_METADATA:
				sequence_ERoleMetadata(context, (ERoleMetadata) semanticObject); 
				return; 
			case AnsibleDslPackage.EROLE_METADATA_GALAXY:
				sequence_ERoleMetadataGalaxy(context, (ERoleMetadataGalaxy) semanticObject); 
				return; 
			case AnsibleDslPackage.ETASK:
				sequence_ETask(context, (ETask) semanticObject); 
				return; 
			case AnsibleDslPackage.ETASK_HANDLER_COMMON_KEYWORDS:
				sequence_ETaskHandlerCommonKeywords(context, (ETaskHandlerCommonKeywords) semanticObject); 
				return; 
			case AnsibleDslPackage.ETASK_HANDLER_ERROR_HANDLING:
				sequence_ETaskHandlerErrorHandling(context, (ETaskHandlerErrorHandling) semanticObject); 
				return; 
			case AnsibleDslPackage.EUNTIL:
				sequence_EUntil(context, (EUntil) semanticObject); 
				return; 
			case AnsibleDslPackage.EVALIDATION_MODE:
				sequence_EValidationMode(context, (EValidationMode) semanticObject); 
				return; 
			case AnsibleDslPackage.EVALUE:
				sequence_EValue(context, (EValue) semanticObject); 
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
	 *     EAsynchronousSettings returns EAsynchronousSettings
	 *
	 * Constraint:
	 *     (async=INT | poll=INT)+
	 */
	protected void sequence_EAsynchronousSettings(ISerializationContext context, EAsynchronousSettings semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EBaseCommonKeywords returns EBaseCommonKeywords
	 *
	 * Constraint:
	 *     (
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
	 *     )
	 */
	protected void sequence_EBaseCommonKeywords(ISerializationContext context, EBaseCommonKeywords semanticObject) {
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
	 *         name=STRING? 
	 *         base_common_keywords=EBaseCommonKeywords 
	 *         exe_common_keywords=EExecutionCommonKeywords 
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
	 *     EConditionalExpression returns EConditionalExpression
	 *
	 * Constraint:
	 *     ((left_term=EValuePassed right_term=EValuePassed?) | formula=EConditionalFormula | is_true=BOOLEAN)
	 */
	protected void sequence_EConditionalExpression(ISerializationContext context, EConditionalExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EConditionalFormula returns EConditionalFormula
	 *
	 * Constraint:
	 *     ((left_expression=EConditionalExpression right_expression=EConditionalExpression) | negated_expression=EConditionalExpression)
	 */
	protected void sequence_EConditionalFormula(ISerializationContext context, EConditionalFormula semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EConnection returns EConnection
	 *
	 * Constraint:
	 *     (connection=STRING? port=INT? remote_user=STRING?)
	 */
	protected void sequence_EConnection(ISerializationContext context, EConnection semanticObject) {
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
	 *     EDictionaryPair returns EDictionaryPair
	 *
	 * Constraint:
	 *     (key=ID value=EValue)
	 */
	protected void sequence_EDictionaryPair(ISerializationContext context, EDictionaryPair semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AnsibleDslPackage.Literals.EDICTIONARY_PAIR__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AnsibleDslPackage.Literals.EDICTIONARY_PAIR__KEY));
			if (transientValues.isValueTransient(semanticObject, AnsibleDslPackage.Literals.EDICTIONARY_PAIR__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AnsibleDslPackage.Literals.EDICTIONARY_PAIR__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEDictionaryPairAccess().getKeyIDTerminalRuleCall_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getEDictionaryPairAccess().getValueEValueParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EValuePassed returns EDictionary
	 *     EValue returns EDictionary
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
	 *     EExecutionCommonKeywords returns EExecutionCommonKeywords
	 *
	 * Constraint:
	 *     (exe_settings=EExecutionExeSettings? delegation=EDelegation? when_expression=EConditionalExpression?)
	 */
	protected void sequence_EExecutionCommonKeywords(ISerializationContext context, EExecutionCommonKeywords semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EExeSettings returns EExecutionExeSettings
	 *     EExecutionExeSettings returns EExecutionExeSettings
	 *
	 * Constraint:
	 *     (throttle=INT? run_once=BOOLEAN?)
	 */
	protected void sequence_EExecutionExeSettings(ISerializationContext context, EExecutionExeSettings semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EFactsSettings returns EFactsSettings
	 *
	 * Constraint:
	 *     (gather_facts=BOOLEAN? gather_subset=EList? gather_timeout=INT? fact_path=STRING?)
	 */
	protected void sequence_EFactsSettings(ISerializationContext context, EFactsSettings semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ELoopList returns EFilteredVariable
	 *     EValuePassed returns EFilteredVariable
	 *     EFilteredVariable returns EFilteredVariable
	 *
	 * Constraint:
	 *     (variable=[EDeclaredVariable|ID] filter_commands+=STRING*)
	 */
	protected void sequence_EFilteredVariable(ISerializationContext context, EFilteredVariable semanticObject) {
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
	 *         name=STRING? 
	 *         base_common_keywords=EBaseCommonKeywords 
	 *         exe_common_keywords=EExecutionCommonKeywords 
	 *         task_handler_common_keywords=ETaskHandlerCommonKeywords 
	 *         listen_to=[ENotifiedTopic|STRING]?
	 *     )
	 */
	protected void sequence_EHandler(ISerializationContext context, EHandler semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ELoopList returns EList
	 *     EValuePassed returns EList
	 *     EValue returns EList
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
	 *     (label=EValuePassed? pause=INT? index_var=ID? loop_var=ID? extended=BOOLEAN?)
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
	 *     (loop_list=ELoopList loop_control=ELoopControl?)
	 */
	protected void sequence_ELoopOverList(ISerializationContext context, ELoopOverList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EModuleCall returns EModuleCall
	 *
	 * Constraint:
	 *     (name=ID parameters=EParameters)
	 */
	protected void sequence_EModuleCall(ISerializationContext context, EModuleCall semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AnsibleDslPackage.Literals.EMODULE_CALL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AnsibleDslPackage.Literals.EMODULE_CALL__NAME));
			if (transientValues.isValueTransient(semanticObject, AnsibleDslPackage.Literals.EMODULE_CALL__PARAMETERS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AnsibleDslPackage.Literals.EMODULE_CALL__PARAMETERS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEModuleCallAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getEModuleCallAccess().getParametersEParametersParserRuleCall_3_0(), semanticObject.getParameters());
		feeder.finish();
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
	 *     EParameters returns EParameters
	 *
	 * Constraint:
	 *     parameters+=EParameter*
	 */
	protected void sequence_EParameters(ISerializationContext context, EParameters semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EErrorHandling returns EPlayErrorHandling
	 *     EPlayErrorHandling returns EPlayErrorHandling
	 *
	 * Constraint:
	 *     (max_fail_percentage=INT? any_errors_fatal=BOOLEAN? ignore_errors=BOOLEAN? ignore_unreachable=BOOLEAN?)
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
	 *     (strategy=STRING? serial_list=EList? order=STRING? throttle=INT? run_once=BOOLEAN?)
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
	 *         (name=STRING? base_common_keywords=EBaseCommonKeywords play_exe_settings=EPlayExeSettings?) | 
	 *         error_handling=EPlayErrorHandling | 
	 *         facts_settings=EFactsSettings | 
	 *         vars_files=EList | 
	 *         vars_prompt=EList | 
	 *         force_handlers=BOOLEAN | 
	 *         pre_tasks_list+=EBlockTask | 
	 *         roles=ERoleCalls | 
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
	 *     ERoleCalls returns ERoleCalls
	 *
	 * Constraint:
	 *     (roles+=[ERole|STRING] roles+=[ERole|STRING]*)
	 */
	protected void sequence_ERoleCalls(ISerializationContext context, ERoleCalls semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ERoleMetadataGalaxy returns ERoleMetadataGalaxy
	 *
	 * Constraint:
	 *     (
	 *         author=STRING 
	 *         description=STRING 
	 *         company=STRING 
	 *         issue_tracker_url=STRING? 
	 *         license=STRING 
	 *         min_ansible_version=STRING 
	 *         min_ansible_container_version=STRING? 
	 *         githhub_branch=STRING? 
	 *         platforms=EList 
	 *         cloud_platforms=EList? 
	 *         galaxy_tags=EList?
	 *     )
	 */
	protected void sequence_ERoleMetadataGalaxy(ISerializationContext context, ERoleMetadataGalaxy semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ERoleMetadata returns ERoleMetadata
	 *
	 * Constraint:
	 *     (allow_duplicates=BOOLEAN? dependencies=EList? galaxy_tags=ERoleMetadataGalaxy?)
	 */
	protected void sequence_ERoleMetadata(ISerializationContext context, ERoleMetadata semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns ERole
	 *     ERole returns ERole
	 *
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         (tasks_list+=ETask | tasks_list+=EBlock)* 
	 *         handlers+=EHandler* 
	 *         (variable_declarations+=EVariableDeclaration variable_declarations+=EVariableDeclaration*)? 
	 *         files_names_list=EList? 
	 *         templates_names_list=EList? 
	 *         metadata=ERoleMetadata?
	 *     )
	 */
	protected void sequence_ERole(ISerializationContext context, ERole semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ETaskHandlerCommonKeywords returns ETaskHandlerCommonKeywords
	 *
	 * Constraint:
	 *     (
	 *         error_handling=ETaskHandlerErrorHandling? 
	 *         action=STRING? 
	 *         asynchronous_settings=EAsynchronousSettings? 
	 *         args=EDictionary? 
	 *         module=EModuleCall 
	 *         notifiable=ENotifiable? 
	 *         loop=ELoop? 
	 *         register=ERegisterVariable?
	 *     )
	 */
	protected void sequence_ETaskHandlerCommonKeywords(ISerializationContext context, ETaskHandlerCommonKeywords semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EErrorHandling returns ETaskHandlerErrorHandling
	 *     ETaskHandlerErrorHandling returns ETaskHandlerErrorHandling
	 *
	 * Constraint:
	 *     (
	 *         changed_when=EConditionalExpression? 
	 *         failed_when=EConditionalExpression? 
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
	 *         name=STRING? 
	 *         base_common_keywords=EBaseCommonKeywords 
	 *         exe_common_keywords=EExecutionCommonKeywords 
	 *         task_handler_common_keywords=ETaskHandlerCommonKeywords
	 *     )
	 */
	protected void sequence_ETask(ISerializationContext context, ETask semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ELoop returns EUntil
	 *     EUntil returns EUntil
	 *
	 * Constraint:
	 *     (until=EConditionalExpression | retries=INT | delay=INT)+
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
	 *     EValuePassed returns EValue
	 *     EValue returns EValue
	 *
	 * Constraint:
	 *     {EValue}
	 */
	protected void sequence_EValue(ISerializationContext context, EValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EDeclaredVariable returns EVariableDeclaration
	 *     EVariableDeclaration returns EVariableDeclaration
	 *
	 * Constraint:
	 *     (name=ID value=EValue)
	 */
	protected void sequence_EVariableDeclaration(ISerializationContext context, EVariableDeclaration semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AnsibleDslPackage.Literals.EDECLARED_VARIABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AnsibleDslPackage.Literals.EDECLARED_VARIABLE__NAME));
			if (transientValues.isValueTransient(semanticObject, AnsibleDslPackage.Literals.EVARIABLE_DECLARATION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AnsibleDslPackage.Literals.EVARIABLE_DECLARATION__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEVariableDeclarationAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getEVariableDeclarationAccess().getValueEValueParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
}
