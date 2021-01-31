/*
 * generated by Xtext 2.23.0
 */
package org.sodalite.sdl.ansible.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.sodalite.sdl.ansible.services.AnsibleDslGrammarAccess;

@SuppressWarnings("all")
public class AnsibleDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected AnsibleDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_EBlockAndRoleErrorHandling_EPlayErrorHandling_ETaskHandlerErrorHandling___Error_handlingKeyword_0_BEGINTerminalRuleCall_1_ENDTerminalRuleCall_3___or___Error_handlingKeyword_0_BEGINTerminalRuleCall_1_ENDTerminalRuleCall_3___or___Error_handlingKeyword_0_BEGINTerminalRuleCall_1_ENDTerminalRuleCall_3__;
	protected AbstractElementAlias match_EBlock___ENDTerminalRuleCall_2_10_3_VarsKeyword_2_10_0_BEGINTerminalRuleCall_2_10_1__q;
	protected AbstractElementAlias match_EBlock___ENDTerminalRuleCall_2_15_3_TasksKeyword_2_15_0_BEGINTerminalRuleCall_2_15_1__q;
	protected AbstractElementAlias match_EBlock___ENDTerminalRuleCall_2_16_3_Rescue_tasksKeyword_2_16_0_BEGINTerminalRuleCall_2_16_1__q;
	protected AbstractElementAlias match_EBlock___ENDTerminalRuleCall_2_17_3_Always_tasksKeyword_2_17_0_BEGINTerminalRuleCall_2_17_1__q;
	protected AbstractElementAlias match_EExecutionExeSettings_EPlayExeSettings___Exe_settingsKeyword_0_BEGINTerminalRuleCall_1_ENDTerminalRuleCall_3___or___Play_exe_settingsKeyword_0_BEGINTerminalRuleCall_1_ENDTerminalRuleCall_3__;
	protected AbstractElementAlias match_EHandler___ENDTerminalRuleCall_3_10_3_VarsKeyword_3_10_0_BEGINTerminalRuleCall_3_10_1__q;
	protected AbstractElementAlias match_EModuleCall___BEGINTerminalRuleCall_2_0_ENDTerminalRuleCall_2_2__q;
	protected AbstractElementAlias match_EModuleCall___ENDTerminalRuleCall_2_1_1_3_ParametersKeyword_2_1_1_0_BEGINTerminalRuleCall_2_1_1_1__q;
	protected AbstractElementAlias match_EPlay___ENDTerminalRuleCall_3_11_3_VarsKeyword_3_11_0_BEGINTerminalRuleCall_3_11_1__q;
	protected AbstractElementAlias match_EPlay___ENDTerminalRuleCall_3_19_3_Pre_tasksKeyword_3_19_0_BEGINTerminalRuleCall_3_19_1__q;
	protected AbstractElementAlias match_EPlay___ENDTerminalRuleCall_3_21_3_Tasks_listKeyword_3_21_0_BEGINTerminalRuleCall_3_21_1__q;
	protected AbstractElementAlias match_EPlay___ENDTerminalRuleCall_3_22_3_Post_tasksKeyword_3_22_0_BEGINTerminalRuleCall_3_22_1__q;
	protected AbstractElementAlias match_EPlay___ENDTerminalRuleCall_3_23_3_HandlersKeyword_3_23_0_BEGINTerminalRuleCall_3_23_1__q;
	protected AbstractElementAlias match_ERoleInclusion___ENDTerminalRuleCall_2_2_9_3_VarsKeyword_2_2_9_0_BEGINTerminalRuleCall_2_2_9_1__q;
	protected AbstractElementAlias match_ETask___ENDTerminalRuleCall_3_10_3_VarsKeyword_3_10_0_BEGINTerminalRuleCall_3_10_1__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (AnsibleDslGrammarAccess) access;
		match_EBlockAndRoleErrorHandling_EPlayErrorHandling_ETaskHandlerErrorHandling___Error_handlingKeyword_0_BEGINTerminalRuleCall_1_ENDTerminalRuleCall_3___or___Error_handlingKeyword_0_BEGINTerminalRuleCall_1_ENDTerminalRuleCall_3___or___Error_handlingKeyword_0_BEGINTerminalRuleCall_1_ENDTerminalRuleCall_3__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getEBlockAndRoleErrorHandlingAccess().getError_handlingKeyword_0()), new TokenAlias(false, false, grammarAccess.getEBlockAndRoleErrorHandlingAccess().getBEGINTerminalRuleCall_1()), new TokenAlias(false, false, grammarAccess.getEBlockAndRoleErrorHandlingAccess().getENDTerminalRuleCall_3())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getEPlayErrorHandlingAccess().getError_handlingKeyword_0()), new TokenAlias(false, false, grammarAccess.getEPlayErrorHandlingAccess().getBEGINTerminalRuleCall_1()), new TokenAlias(false, false, grammarAccess.getEPlayErrorHandlingAccess().getENDTerminalRuleCall_3())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getETaskHandlerErrorHandlingAccess().getError_handlingKeyword_0()), new TokenAlias(false, false, grammarAccess.getETaskHandlerErrorHandlingAccess().getBEGINTerminalRuleCall_1()), new TokenAlias(false, false, grammarAccess.getETaskHandlerErrorHandlingAccess().getENDTerminalRuleCall_3())));
		match_EBlock___ENDTerminalRuleCall_2_10_3_VarsKeyword_2_10_0_BEGINTerminalRuleCall_2_10_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getEBlockAccess().getENDTerminalRuleCall_2_10_3()), new TokenAlias(false, false, grammarAccess.getEBlockAccess().getVarsKeyword_2_10_0()), new TokenAlias(false, false, grammarAccess.getEBlockAccess().getBEGINTerminalRuleCall_2_10_1()));
		match_EBlock___ENDTerminalRuleCall_2_15_3_TasksKeyword_2_15_0_BEGINTerminalRuleCall_2_15_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getEBlockAccess().getENDTerminalRuleCall_2_15_3()), new TokenAlias(false, false, grammarAccess.getEBlockAccess().getTasksKeyword_2_15_0()), new TokenAlias(false, false, grammarAccess.getEBlockAccess().getBEGINTerminalRuleCall_2_15_1()));
		match_EBlock___ENDTerminalRuleCall_2_16_3_Rescue_tasksKeyword_2_16_0_BEGINTerminalRuleCall_2_16_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getEBlockAccess().getENDTerminalRuleCall_2_16_3()), new TokenAlias(false, false, grammarAccess.getEBlockAccess().getRescue_tasksKeyword_2_16_0()), new TokenAlias(false, false, grammarAccess.getEBlockAccess().getBEGINTerminalRuleCall_2_16_1()));
		match_EBlock___ENDTerminalRuleCall_2_17_3_Always_tasksKeyword_2_17_0_BEGINTerminalRuleCall_2_17_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getEBlockAccess().getENDTerminalRuleCall_2_17_3()), new TokenAlias(false, false, grammarAccess.getEBlockAccess().getAlways_tasksKeyword_2_17_0()), new TokenAlias(false, false, grammarAccess.getEBlockAccess().getBEGINTerminalRuleCall_2_17_1()));
		match_EExecutionExeSettings_EPlayExeSettings___Exe_settingsKeyword_0_BEGINTerminalRuleCall_1_ENDTerminalRuleCall_3___or___Play_exe_settingsKeyword_0_BEGINTerminalRuleCall_1_ENDTerminalRuleCall_3__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getEExecutionExeSettingsAccess().getExe_settingsKeyword_0()), new TokenAlias(false, false, grammarAccess.getEExecutionExeSettingsAccess().getBEGINTerminalRuleCall_1()), new TokenAlias(false, false, grammarAccess.getEExecutionExeSettingsAccess().getENDTerminalRuleCall_3())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getEPlayExeSettingsAccess().getPlay_exe_settingsKeyword_0()), new TokenAlias(false, false, grammarAccess.getEPlayExeSettingsAccess().getBEGINTerminalRuleCall_1()), new TokenAlias(false, false, grammarAccess.getEPlayExeSettingsAccess().getENDTerminalRuleCall_3())));
		match_EHandler___ENDTerminalRuleCall_3_10_3_VarsKeyword_3_10_0_BEGINTerminalRuleCall_3_10_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getEHandlerAccess().getENDTerminalRuleCall_3_10_3()), new TokenAlias(false, false, grammarAccess.getEHandlerAccess().getVarsKeyword_3_10_0()), new TokenAlias(false, false, grammarAccess.getEHandlerAccess().getBEGINTerminalRuleCall_3_10_1()));
		match_EModuleCall___BEGINTerminalRuleCall_2_0_ENDTerminalRuleCall_2_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getEModuleCallAccess().getBEGINTerminalRuleCall_2_0()), new TokenAlias(false, false, grammarAccess.getEModuleCallAccess().getENDTerminalRuleCall_2_2()));
		match_EModuleCall___ENDTerminalRuleCall_2_1_1_3_ParametersKeyword_2_1_1_0_BEGINTerminalRuleCall_2_1_1_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getEModuleCallAccess().getENDTerminalRuleCall_2_1_1_3()), new TokenAlias(false, false, grammarAccess.getEModuleCallAccess().getParametersKeyword_2_1_1_0()), new TokenAlias(false, false, grammarAccess.getEModuleCallAccess().getBEGINTerminalRuleCall_2_1_1_1()));
		match_EPlay___ENDTerminalRuleCall_3_11_3_VarsKeyword_3_11_0_BEGINTerminalRuleCall_3_11_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getEPlayAccess().getENDTerminalRuleCall_3_11_3()), new TokenAlias(false, false, grammarAccess.getEPlayAccess().getVarsKeyword_3_11_0()), new TokenAlias(false, false, grammarAccess.getEPlayAccess().getBEGINTerminalRuleCall_3_11_1()));
		match_EPlay___ENDTerminalRuleCall_3_19_3_Pre_tasksKeyword_3_19_0_BEGINTerminalRuleCall_3_19_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getEPlayAccess().getENDTerminalRuleCall_3_19_3()), new TokenAlias(false, false, grammarAccess.getEPlayAccess().getPre_tasksKeyword_3_19_0()), new TokenAlias(false, false, grammarAccess.getEPlayAccess().getBEGINTerminalRuleCall_3_19_1()));
		match_EPlay___ENDTerminalRuleCall_3_21_3_Tasks_listKeyword_3_21_0_BEGINTerminalRuleCall_3_21_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getEPlayAccess().getENDTerminalRuleCall_3_21_3()), new TokenAlias(false, false, grammarAccess.getEPlayAccess().getTasks_listKeyword_3_21_0()), new TokenAlias(false, false, grammarAccess.getEPlayAccess().getBEGINTerminalRuleCall_3_21_1()));
		match_EPlay___ENDTerminalRuleCall_3_22_3_Post_tasksKeyword_3_22_0_BEGINTerminalRuleCall_3_22_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getEPlayAccess().getENDTerminalRuleCall_3_22_3()), new TokenAlias(false, false, grammarAccess.getEPlayAccess().getPost_tasksKeyword_3_22_0()), new TokenAlias(false, false, grammarAccess.getEPlayAccess().getBEGINTerminalRuleCall_3_22_1()));
		match_EPlay___ENDTerminalRuleCall_3_23_3_HandlersKeyword_3_23_0_BEGINTerminalRuleCall_3_23_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getEPlayAccess().getENDTerminalRuleCall_3_23_3()), new TokenAlias(false, false, grammarAccess.getEPlayAccess().getHandlersKeyword_3_23_0()), new TokenAlias(false, false, grammarAccess.getEPlayAccess().getBEGINTerminalRuleCall_3_23_1()));
		match_ERoleInclusion___ENDTerminalRuleCall_2_2_9_3_VarsKeyword_2_2_9_0_BEGINTerminalRuleCall_2_2_9_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getERoleInclusionAccess().getENDTerminalRuleCall_2_2_9_3()), new TokenAlias(false, false, grammarAccess.getERoleInclusionAccess().getVarsKeyword_2_2_9_0()), new TokenAlias(false, false, grammarAccess.getERoleInclusionAccess().getBEGINTerminalRuleCall_2_2_9_1()));
		match_ETask___ENDTerminalRuleCall_3_10_3_VarsKeyword_3_10_0_BEGINTerminalRuleCall_3_10_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getETaskAccess().getENDTerminalRuleCall_3_10_3()), new TokenAlias(false, false, grammarAccess.getETaskAccess().getVarsKeyword_3_10_0()), new TokenAlias(false, false, grammarAccess.getETaskAccess().getBEGINTerminalRuleCall_3_10_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getBEGINRule())
			return getBEGINToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getENDRule())
			return getENDToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * Synthetic terminal rule. The concrete syntax is to be specified by clients.
	 * Defaults to the empty string.
	 */
	protected String getBEGINToken(EObject semanticObject, RuleCall ruleCall, INode node) { return ""; }
	
	/**
	 * Synthetic terminal rule. The concrete syntax is to be specified by clients.
	 * Defaults to the empty string.
	 */
	protected String getENDToken(EObject semanticObject, RuleCall ruleCall, INode node) { return ""; }
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_EBlockAndRoleErrorHandling_EPlayErrorHandling_ETaskHandlerErrorHandling___Error_handlingKeyword_0_BEGINTerminalRuleCall_1_ENDTerminalRuleCall_3___or___Error_handlingKeyword_0_BEGINTerminalRuleCall_1_ENDTerminalRuleCall_3___or___Error_handlingKeyword_0_BEGINTerminalRuleCall_1_ENDTerminalRuleCall_3__.equals(syntax))
				emit_EBlockAndRoleErrorHandling_EPlayErrorHandling_ETaskHandlerErrorHandling___Error_handlingKeyword_0_BEGINTerminalRuleCall_1_ENDTerminalRuleCall_3___or___Error_handlingKeyword_0_BEGINTerminalRuleCall_1_ENDTerminalRuleCall_3___or___Error_handlingKeyword_0_BEGINTerminalRuleCall_1_ENDTerminalRuleCall_3__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_EBlock___ENDTerminalRuleCall_2_10_3_VarsKeyword_2_10_0_BEGINTerminalRuleCall_2_10_1__q.equals(syntax))
				emit_EBlock___ENDTerminalRuleCall_2_10_3_VarsKeyword_2_10_0_BEGINTerminalRuleCall_2_10_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_EBlock___ENDTerminalRuleCall_2_15_3_TasksKeyword_2_15_0_BEGINTerminalRuleCall_2_15_1__q.equals(syntax))
				emit_EBlock___ENDTerminalRuleCall_2_15_3_TasksKeyword_2_15_0_BEGINTerminalRuleCall_2_15_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_EBlock___ENDTerminalRuleCall_2_16_3_Rescue_tasksKeyword_2_16_0_BEGINTerminalRuleCall_2_16_1__q.equals(syntax))
				emit_EBlock___ENDTerminalRuleCall_2_16_3_Rescue_tasksKeyword_2_16_0_BEGINTerminalRuleCall_2_16_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_EBlock___ENDTerminalRuleCall_2_17_3_Always_tasksKeyword_2_17_0_BEGINTerminalRuleCall_2_17_1__q.equals(syntax))
				emit_EBlock___ENDTerminalRuleCall_2_17_3_Always_tasksKeyword_2_17_0_BEGINTerminalRuleCall_2_17_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_EExecutionExeSettings_EPlayExeSettings___Exe_settingsKeyword_0_BEGINTerminalRuleCall_1_ENDTerminalRuleCall_3___or___Play_exe_settingsKeyword_0_BEGINTerminalRuleCall_1_ENDTerminalRuleCall_3__.equals(syntax))
				emit_EExecutionExeSettings_EPlayExeSettings___Exe_settingsKeyword_0_BEGINTerminalRuleCall_1_ENDTerminalRuleCall_3___or___Play_exe_settingsKeyword_0_BEGINTerminalRuleCall_1_ENDTerminalRuleCall_3__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_EHandler___ENDTerminalRuleCall_3_10_3_VarsKeyword_3_10_0_BEGINTerminalRuleCall_3_10_1__q.equals(syntax))
				emit_EHandler___ENDTerminalRuleCall_3_10_3_VarsKeyword_3_10_0_BEGINTerminalRuleCall_3_10_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_EModuleCall___BEGINTerminalRuleCall_2_0_ENDTerminalRuleCall_2_2__q.equals(syntax))
				emit_EModuleCall___BEGINTerminalRuleCall_2_0_ENDTerminalRuleCall_2_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_EModuleCall___ENDTerminalRuleCall_2_1_1_3_ParametersKeyword_2_1_1_0_BEGINTerminalRuleCall_2_1_1_1__q.equals(syntax))
				emit_EModuleCall___ENDTerminalRuleCall_2_1_1_3_ParametersKeyword_2_1_1_0_BEGINTerminalRuleCall_2_1_1_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_EPlay___ENDTerminalRuleCall_3_11_3_VarsKeyword_3_11_0_BEGINTerminalRuleCall_3_11_1__q.equals(syntax))
				emit_EPlay___ENDTerminalRuleCall_3_11_3_VarsKeyword_3_11_0_BEGINTerminalRuleCall_3_11_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_EPlay___ENDTerminalRuleCall_3_19_3_Pre_tasksKeyword_3_19_0_BEGINTerminalRuleCall_3_19_1__q.equals(syntax))
				emit_EPlay___ENDTerminalRuleCall_3_19_3_Pre_tasksKeyword_3_19_0_BEGINTerminalRuleCall_3_19_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_EPlay___ENDTerminalRuleCall_3_21_3_Tasks_listKeyword_3_21_0_BEGINTerminalRuleCall_3_21_1__q.equals(syntax))
				emit_EPlay___ENDTerminalRuleCall_3_21_3_Tasks_listKeyword_3_21_0_BEGINTerminalRuleCall_3_21_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_EPlay___ENDTerminalRuleCall_3_22_3_Post_tasksKeyword_3_22_0_BEGINTerminalRuleCall_3_22_1__q.equals(syntax))
				emit_EPlay___ENDTerminalRuleCall_3_22_3_Post_tasksKeyword_3_22_0_BEGINTerminalRuleCall_3_22_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_EPlay___ENDTerminalRuleCall_3_23_3_HandlersKeyword_3_23_0_BEGINTerminalRuleCall_3_23_1__q.equals(syntax))
				emit_EPlay___ENDTerminalRuleCall_3_23_3_HandlersKeyword_3_23_0_BEGINTerminalRuleCall_3_23_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ERoleInclusion___ENDTerminalRuleCall_2_2_9_3_VarsKeyword_2_2_9_0_BEGINTerminalRuleCall_2_2_9_1__q.equals(syntax))
				emit_ERoleInclusion___ENDTerminalRuleCall_2_2_9_3_VarsKeyword_2_2_9_0_BEGINTerminalRuleCall_2_2_9_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ETask___ENDTerminalRuleCall_3_10_3_VarsKeyword_3_10_0_BEGINTerminalRuleCall_3_10_1__q.equals(syntax))
				emit_ETask___ENDTerminalRuleCall_3_10_3_VarsKeyword_3_10_0_BEGINTerminalRuleCall_3_10_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ('error_handling:' BEGIN END) | ('error_handling:' BEGIN END) | ('error_handling:' BEGIN END)
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_EBlockAndRoleErrorHandling_EPlayErrorHandling_ETaskHandlerErrorHandling___Error_handlingKeyword_0_BEGINTerminalRuleCall_1_ENDTerminalRuleCall_3___or___Error_handlingKeyword_0_BEGINTerminalRuleCall_1_ENDTerminalRuleCall_3___or___Error_handlingKeyword_0_BEGINTerminalRuleCall_1_ENDTerminalRuleCall_3__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (END 'vars:' BEGIN)?
	 *
	 * This ambiguous syntax occurs at:
	 *     variable_declarations+=EVariableDeclaration (ambiguity) variable_declarations+=EVariableDeclaration
	 */
	protected void emit_EBlock___ENDTerminalRuleCall_2_10_3_VarsKeyword_2_10_0_BEGINTerminalRuleCall_2_10_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (END 'tasks:' BEGIN)?
	 *
	 * This ambiguous syntax occurs at:
	 *     tasks+=ETask (ambiguity) tasks+=ETask
	 */
	protected void emit_EBlock___ENDTerminalRuleCall_2_15_3_TasksKeyword_2_15_0_BEGINTerminalRuleCall_2_15_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (END 'rescue_tasks:' BEGIN)?
	 *
	 * This ambiguous syntax occurs at:
	 *     rescue_tasks+=ETask (ambiguity) rescue_tasks+=ETask
	 */
	protected void emit_EBlock___ENDTerminalRuleCall_2_16_3_Rescue_tasksKeyword_2_16_0_BEGINTerminalRuleCall_2_16_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (END 'always_tasks:' BEGIN)?
	 *
	 * This ambiguous syntax occurs at:
	 *     always_tasks+=ETask (ambiguity) always_tasks+=ETask
	 */
	protected void emit_EBlock___ENDTerminalRuleCall_2_17_3_Always_tasksKeyword_2_17_0_BEGINTerminalRuleCall_2_17_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('play_exe_settings:' BEGIN END) | ('exe_settings:' BEGIN END)
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_EExecutionExeSettings_EPlayExeSettings___Exe_settingsKeyword_0_BEGINTerminalRuleCall_1_ENDTerminalRuleCall_3___or___Play_exe_settingsKeyword_0_BEGINTerminalRuleCall_1_ENDTerminalRuleCall_3__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (END 'vars:' BEGIN)?
	 *
	 * This ambiguous syntax occurs at:
	 *     variable_declarations+=EVariableDeclaration (ambiguity) variable_declarations+=EVariableDeclaration
	 */
	protected void emit_EHandler___ENDTerminalRuleCall_3_10_3_VarsKeyword_3_10_0_BEGINTerminalRuleCall_3_10_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (BEGIN END)?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=STRING (ambiguity) (rule end)
	 */
	protected void emit_EModuleCall___BEGINTerminalRuleCall_2_0_ENDTerminalRuleCall_2_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (END 'parameters:' BEGIN)?
	 *
	 * This ambiguous syntax occurs at:
	 *     parameters+=EParameter (ambiguity) parameters+=EParameter
	 */
	protected void emit_EModuleCall___ENDTerminalRuleCall_2_1_1_3_ParametersKeyword_2_1_1_0_BEGINTerminalRuleCall_2_1_1_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (END 'vars:' BEGIN)?
	 *
	 * This ambiguous syntax occurs at:
	 *     variable_declarations+=EVariableDeclaration (ambiguity) variable_declarations+=EVariableDeclaration
	 */
	protected void emit_EPlay___ENDTerminalRuleCall_3_11_3_VarsKeyword_3_11_0_BEGINTerminalRuleCall_3_11_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (END 'pre_tasks:' BEGIN)?
	 *
	 * This ambiguous syntax occurs at:
	 *     pre_tasks_list+=EBlockTask (ambiguity) pre_tasks_list+=EBlockTask
	 */
	protected void emit_EPlay___ENDTerminalRuleCall_3_19_3_Pre_tasksKeyword_3_19_0_BEGINTerminalRuleCall_3_19_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (END 'tasks_list:' BEGIN)?
	 *
	 * This ambiguous syntax occurs at:
	 *     tasks_list+=EBlockTask (ambiguity) tasks_list+=EBlockTask
	 */
	protected void emit_EPlay___ENDTerminalRuleCall_3_21_3_Tasks_listKeyword_3_21_0_BEGINTerminalRuleCall_3_21_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (END 'post_tasks:' BEGIN)?
	 *
	 * This ambiguous syntax occurs at:
	 *     post_tasks_list+=EBlockTask (ambiguity) post_tasks_list+=EBlockTask
	 */
	protected void emit_EPlay___ENDTerminalRuleCall_3_22_3_Post_tasksKeyword_3_22_0_BEGINTerminalRuleCall_3_22_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (END 'handlers:' BEGIN)?
	 *
	 * This ambiguous syntax occurs at:
	 *     handlers+=EHandler (ambiguity) handlers+=EHandler
	 */
	protected void emit_EPlay___ENDTerminalRuleCall_3_23_3_HandlersKeyword_3_23_0_BEGINTerminalRuleCall_3_23_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (END 'vars:' BEGIN)?
	 *
	 * This ambiguous syntax occurs at:
	 *     variable_declarations+=EVariableDeclaration (ambiguity) variable_declarations+=EVariableDeclaration
	 */
	protected void emit_ERoleInclusion___ENDTerminalRuleCall_2_2_9_3_VarsKeyword_2_2_9_0_BEGINTerminalRuleCall_2_2_9_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (END 'vars:' BEGIN)?
	 *
	 * This ambiguous syntax occurs at:
	 *     variable_declarations+=EVariableDeclaration (ambiguity) variable_declarations+=EVariableDeclaration
	 */
	protected void emit_ETask___ENDTerminalRuleCall_3_10_3_VarsKeyword_3_10_0_BEGINTerminalRuleCall_3_10_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
