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
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.sodalite.sdl.ansible.services.AnsibleDslGrammarAccess;

@SuppressWarnings("all")
public class AnsibleDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected AnsibleDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_EBlock___RightCurlyBracketKeyword_1_10_2_VarsKeyword_1_10_0__q;
	protected AbstractElementAlias match_EBlock___RightCurlyBracketKeyword_1_15_2_TasksKeyword_1_15_0__q;
	protected AbstractElementAlias match_EBlock___RightCurlyBracketKeyword_1_16_2_Rescue_tasksKeyword_1_16_0__q;
	protected AbstractElementAlias match_EBlock___RightCurlyBracketKeyword_1_17_2_Always_tasksKeyword_1_17_0__q;
	protected AbstractElementAlias match_EHandler_ListenKeyword_2_22_0_q;
	protected AbstractElementAlias match_EHandler_NotifyKeyword_2_19_0_q;
	protected AbstractElementAlias match_EHandler___RightCurlyBracketKeyword_2_10_2_VarsKeyword_2_10_0__q;
	protected AbstractElementAlias match_EPlay___RightCurlyBracketKeyword_1_10_2_VarsKeyword_1_10_0__q;
	protected AbstractElementAlias match_EPlay___RightCurlyBracketKeyword_1_17_2_Pre_tasksKeyword_1_17_0__q;
	protected AbstractElementAlias match_EPlay___RightCurlyBracketKeyword_1_19_2_Tasks_listKeyword_1_19_0__q;
	protected AbstractElementAlias match_EPlay___RightCurlyBracketKeyword_1_20_2_Post_tasksKeyword_1_20_0__q;
	protected AbstractElementAlias match_EPlay___RightCurlyBracketKeyword_1_21_2_HandlersKeyword_1_21_0__q;
	protected AbstractElementAlias match_ERoleInclusion___RightCurlyBracketKeyword_3_9_2_VarsKeyword_3_9_0__q;
	protected AbstractElementAlias match_ETask_NotifyKeyword_2_19_0_q;
	protected AbstractElementAlias match_ETask___RightCurlyBracketKeyword_2_10_2_VarsKeyword_2_10_0__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (AnsibleDslGrammarAccess) access;
		match_EBlock___RightCurlyBracketKeyword_1_10_2_VarsKeyword_1_10_0__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getEBlockAccess().getRightCurlyBracketKeyword_1_10_2()), new TokenAlias(false, false, grammarAccess.getEBlockAccess().getVarsKeyword_1_10_0()));
		match_EBlock___RightCurlyBracketKeyword_1_15_2_TasksKeyword_1_15_0__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getEBlockAccess().getRightCurlyBracketKeyword_1_15_2()), new TokenAlias(false, false, grammarAccess.getEBlockAccess().getTasksKeyword_1_15_0()));
		match_EBlock___RightCurlyBracketKeyword_1_16_2_Rescue_tasksKeyword_1_16_0__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getEBlockAccess().getRightCurlyBracketKeyword_1_16_2()), new TokenAlias(false, false, grammarAccess.getEBlockAccess().getRescue_tasksKeyword_1_16_0()));
		match_EBlock___RightCurlyBracketKeyword_1_17_2_Always_tasksKeyword_1_17_0__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getEBlockAccess().getRightCurlyBracketKeyword_1_17_2()), new TokenAlias(false, false, grammarAccess.getEBlockAccess().getAlways_tasksKeyword_1_17_0()));
		match_EHandler_ListenKeyword_2_22_0_q = new TokenAlias(false, true, grammarAccess.getEHandlerAccess().getListenKeyword_2_22_0());
		match_EHandler_NotifyKeyword_2_19_0_q = new TokenAlias(false, true, grammarAccess.getEHandlerAccess().getNotifyKeyword_2_19_0());
		match_EHandler___RightCurlyBracketKeyword_2_10_2_VarsKeyword_2_10_0__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getEHandlerAccess().getRightCurlyBracketKeyword_2_10_2()), new TokenAlias(false, false, grammarAccess.getEHandlerAccess().getVarsKeyword_2_10_0()));
		match_EPlay___RightCurlyBracketKeyword_1_10_2_VarsKeyword_1_10_0__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getEPlayAccess().getRightCurlyBracketKeyword_1_10_2()), new TokenAlias(false, false, grammarAccess.getEPlayAccess().getVarsKeyword_1_10_0()));
		match_EPlay___RightCurlyBracketKeyword_1_17_2_Pre_tasksKeyword_1_17_0__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getEPlayAccess().getRightCurlyBracketKeyword_1_17_2()), new TokenAlias(false, false, grammarAccess.getEPlayAccess().getPre_tasksKeyword_1_17_0()));
		match_EPlay___RightCurlyBracketKeyword_1_19_2_Tasks_listKeyword_1_19_0__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getEPlayAccess().getRightCurlyBracketKeyword_1_19_2()), new TokenAlias(false, false, grammarAccess.getEPlayAccess().getTasks_listKeyword_1_19_0()));
		match_EPlay___RightCurlyBracketKeyword_1_20_2_Post_tasksKeyword_1_20_0__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getEPlayAccess().getRightCurlyBracketKeyword_1_20_2()), new TokenAlias(false, false, grammarAccess.getEPlayAccess().getPost_tasksKeyword_1_20_0()));
		match_EPlay___RightCurlyBracketKeyword_1_21_2_HandlersKeyword_1_21_0__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getEPlayAccess().getRightCurlyBracketKeyword_1_21_2()), new TokenAlias(false, false, grammarAccess.getEPlayAccess().getHandlersKeyword_1_21_0()));
		match_ERoleInclusion___RightCurlyBracketKeyword_3_9_2_VarsKeyword_3_9_0__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getERoleInclusionAccess().getRightCurlyBracketKeyword_3_9_2()), new TokenAlias(false, false, grammarAccess.getERoleInclusionAccess().getVarsKeyword_3_9_0()));
		match_ETask_NotifyKeyword_2_19_0_q = new TokenAlias(false, true, grammarAccess.getETaskAccess().getNotifyKeyword_2_19_0());
		match_ETask___RightCurlyBracketKeyword_2_10_2_VarsKeyword_2_10_0__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getETaskAccess().getRightCurlyBracketKeyword_2_10_2()), new TokenAlias(false, false, grammarAccess.getETaskAccess().getVarsKeyword_2_10_0()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_EBlock___RightCurlyBracketKeyword_1_10_2_VarsKeyword_1_10_0__q.equals(syntax))
				emit_EBlock___RightCurlyBracketKeyword_1_10_2_VarsKeyword_1_10_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_EBlock___RightCurlyBracketKeyword_1_15_2_TasksKeyword_1_15_0__q.equals(syntax))
				emit_EBlock___RightCurlyBracketKeyword_1_15_2_TasksKeyword_1_15_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_EBlock___RightCurlyBracketKeyword_1_16_2_Rescue_tasksKeyword_1_16_0__q.equals(syntax))
				emit_EBlock___RightCurlyBracketKeyword_1_16_2_Rescue_tasksKeyword_1_16_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_EBlock___RightCurlyBracketKeyword_1_17_2_Always_tasksKeyword_1_17_0__q.equals(syntax))
				emit_EBlock___RightCurlyBracketKeyword_1_17_2_Always_tasksKeyword_1_17_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_EHandler_ListenKeyword_2_22_0_q.equals(syntax))
				emit_EHandler_ListenKeyword_2_22_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_EHandler_NotifyKeyword_2_19_0_q.equals(syntax))
				emit_EHandler_NotifyKeyword_2_19_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_EHandler___RightCurlyBracketKeyword_2_10_2_VarsKeyword_2_10_0__q.equals(syntax))
				emit_EHandler___RightCurlyBracketKeyword_2_10_2_VarsKeyword_2_10_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_EPlay___RightCurlyBracketKeyword_1_10_2_VarsKeyword_1_10_0__q.equals(syntax))
				emit_EPlay___RightCurlyBracketKeyword_1_10_2_VarsKeyword_1_10_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_EPlay___RightCurlyBracketKeyword_1_17_2_Pre_tasksKeyword_1_17_0__q.equals(syntax))
				emit_EPlay___RightCurlyBracketKeyword_1_17_2_Pre_tasksKeyword_1_17_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_EPlay___RightCurlyBracketKeyword_1_19_2_Tasks_listKeyword_1_19_0__q.equals(syntax))
				emit_EPlay___RightCurlyBracketKeyword_1_19_2_Tasks_listKeyword_1_19_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_EPlay___RightCurlyBracketKeyword_1_20_2_Post_tasksKeyword_1_20_0__q.equals(syntax))
				emit_EPlay___RightCurlyBracketKeyword_1_20_2_Post_tasksKeyword_1_20_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_EPlay___RightCurlyBracketKeyword_1_21_2_HandlersKeyword_1_21_0__q.equals(syntax))
				emit_EPlay___RightCurlyBracketKeyword_1_21_2_HandlersKeyword_1_21_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ERoleInclusion___RightCurlyBracketKeyword_3_9_2_VarsKeyword_3_9_0__q.equals(syntax))
				emit_ERoleInclusion___RightCurlyBracketKeyword_3_9_2_VarsKeyword_3_9_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ETask_NotifyKeyword_2_19_0_q.equals(syntax))
				emit_ETask_NotifyKeyword_2_19_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ETask___RightCurlyBracketKeyword_2_10_2_VarsKeyword_2_10_0__q.equals(syntax))
				emit_ETask___RightCurlyBracketKeyword_2_10_2_VarsKeyword_2_10_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ('}' 'vars{')?
	 *
	 * This ambiguous syntax occurs at:
	 *     variable_declarations+=EVariableDeclaration (ambiguity) variable_declarations+=EVariableDeclaration
	 */
	protected void emit_EBlock___RightCurlyBracketKeyword_1_10_2_VarsKeyword_1_10_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('}' 'tasks{')?
	 *
	 * This ambiguous syntax occurs at:
	 *     tasks+=ETask (ambiguity) tasks+=ETask
	 */
	protected void emit_EBlock___RightCurlyBracketKeyword_1_15_2_TasksKeyword_1_15_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('}' 'rescue_tasks{')?
	 *
	 * This ambiguous syntax occurs at:
	 *     rescue_tasks+=ETask (ambiguity) rescue_tasks+=ETask
	 */
	protected void emit_EBlock___RightCurlyBracketKeyword_1_16_2_Rescue_tasksKeyword_1_16_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('}' 'always_tasks{')?
	 *
	 * This ambiguous syntax occurs at:
	 *     always_tasks+=ETask (ambiguity) always_tasks+=ETask
	 */
	protected void emit_EBlock___RightCurlyBracketKeyword_1_17_2_Always_tasksKeyword_1_17_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'listen:'?
	 *
	 * This ambiguous syntax occurs at:
	 *     listen_to+=[ENotifiedTopic|STRING] (ambiguity) listen_to+=[ENotifiedTopic|STRING]
	 */
	protected void emit_EHandler_ListenKeyword_2_22_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'notify:'?
	 *
	 * This ambiguous syntax occurs at:
	 *     notifiables+=ENotifiable (ambiguity) notifiables+=ENotifiable
	 */
	protected void emit_EHandler_NotifyKeyword_2_19_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('}' 'vars{')?
	 *
	 * This ambiguous syntax occurs at:
	 *     variable_declarations+=EVariableDeclaration (ambiguity) variable_declarations+=EVariableDeclaration
	 */
	protected void emit_EHandler___RightCurlyBracketKeyword_2_10_2_VarsKeyword_2_10_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('}' 'vars{')?
	 *
	 * This ambiguous syntax occurs at:
	 *     variable_declarations+=EVariableDeclaration (ambiguity) variable_declarations+=EVariableDeclaration
	 */
	protected void emit_EPlay___RightCurlyBracketKeyword_1_10_2_VarsKeyword_1_10_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('}' 'pre_tasks{')?
	 *
	 * This ambiguous syntax occurs at:
	 *     pre_tasks_list+=EBlockTask (ambiguity) pre_tasks_list+=EBlockTask
	 */
	protected void emit_EPlay___RightCurlyBracketKeyword_1_17_2_Pre_tasksKeyword_1_17_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('}' 'tasks_list{')?
	 *
	 * This ambiguous syntax occurs at:
	 *     tasks_list+=EBlockTask (ambiguity) tasks_list+=EBlockTask
	 */
	protected void emit_EPlay___RightCurlyBracketKeyword_1_19_2_Tasks_listKeyword_1_19_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('}' 'post_tasks{')?
	 *
	 * This ambiguous syntax occurs at:
	 *     post_tasks_list+=EBlockTask (ambiguity) post_tasks_list+=EBlockTask
	 */
	protected void emit_EPlay___RightCurlyBracketKeyword_1_20_2_Post_tasksKeyword_1_20_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('}' 'handlers{')?
	 *
	 * This ambiguous syntax occurs at:
	 *     handlers+=EHandler (ambiguity) handlers+=EHandler
	 */
	protected void emit_EPlay___RightCurlyBracketKeyword_1_21_2_HandlersKeyword_1_21_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('}' 'vars{')?
	 *
	 * This ambiguous syntax occurs at:
	 *     variable_declarations+=EVariableDeclaration (ambiguity) variable_declarations+=EVariableDeclaration
	 */
	protected void emit_ERoleInclusion___RightCurlyBracketKeyword_3_9_2_VarsKeyword_3_9_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'notify:'?
	 *
	 * This ambiguous syntax occurs at:
	 *     notifiables+=ENotifiable (ambiguity) notifiables+=ENotifiable
	 */
	protected void emit_ETask_NotifyKeyword_2_19_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('}' 'vars{')?
	 *
	 * This ambiguous syntax occurs at:
	 *     variable_declarations+=EVariableDeclaration (ambiguity) variable_declarations+=EVariableDeclaration
	 */
	protected void emit_ETask___RightCurlyBracketKeyword_2_10_2_VarsKeyword_2_10_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
