/*
 * generated by Xtext 2.23.0
 */
package org.sodalite.sdl.ansible.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.sodalite.sdl.ansible.ansibleDsl.EPlaybook
import org.sodalite.sdl.ansible.ansibleDsl.EPlay
import org.sodalite.sdl.ansible.ansibleDsl.EDictionary
import org.sodalite.sdl.ansible.ansibleDsl.EValue
import org.sodalite.sdl.ansible.ansibleDsl.EList
import java.util.ArrayList
import org.sodalite.sdl.ansible.ansibleDsl.EPlayExeSettings
import org.sodalite.sdl.ansible.ansibleDsl.EPlayErrorHandling
import org.sodalite.sdl.ansible.ansibleDsl.EFactsSettings
import org.sodalite.sdl.ansible.ansibleDsl.EBlockTask
import org.sodalite.sdl.ansible.ansibleDsl.ETaskHandler
import org.sodalite.sdl.ansible.ansibleDsl.EBlock
import org.sodalite.sdl.ansible.ansibleDsl.ETask
import org.sodalite.sdl.ansible.ansibleDsl.EBase
import org.sodalite.sdl.ansible.ansibleDsl.EExecution
import org.sodalite.sdl.ansible.ansibleDsl.EHandler
import org.sodalite.sdl.ansible.ansibleDsl.EValuePassed
import org.sodalite.sdl.ansible.ansibleDsl.ENotifiedTopic
import org.sodalite.sdl.ansible.ansibleDsl.ENotifiedHandler
import org.sodalite.sdl.ansible.ansibleDsl.ELoopOverList
import org.sodalite.sdl.ansible.ansibleDsl.EUntil
import org.sodalite.sdl.ansible.ansibleDsl.EFactGathered
import org.sodalite.sdl.ansible.ansibleDsl.ERoleInclusion
import org.sodalite.sdl.ansible.ansibleDsl.EItem
import org.sodalite.sdl.ansible.ansibleDsl.ESimpleValue
import org.sodalite.sdl.ansible.ansibleDsl.EDeclaredVariableReference
import org.sodalite.sdl.ansible.ansibleDsl.EJinjaExpressionEvaluationWithoutBrackets
import org.sodalite.sdl.ansible.ansibleDsl.EFilteredExpression
import org.sodalite.sdl.ansible.ansibleDsl.EOrExpression
import org.sodalite.sdl.ansible.ansibleDsl.EFunctionCall
import org.sodalite.sdl.ansible.ansibleDsl.EIfExpression
import org.sodalite.sdl.ansible.ansibleDsl.EAndExpression
import org.sodalite.sdl.ansible.ansibleDsl.ETruthExpression
import org.sodalite.sdl.ansible.ansibleDsl.EOperation
import org.sodalite.sdl.ansible.ansibleDsl.EIsExpression
import org.sodalite.sdl.ansible.ansibleDsl.EParenthesisedExpression
import org.sodalite.sdl.ansible.ansibleDsl.EJinjaExpressionAndString
import org.sodalite.sdl.ansible.ansibleDsl.EValueWithoutString
import org.sodalite.sdl.ansible.ansibleDsl.EValuePassedToJinjaExpression
import org.sodalite.sdl.ansible.ansibleDsl.EComposedValue
import org.sodalite.sdl.ansible.ansibleDsl.ESimpleValueWithoutString
import org.sodalite.sdl.ansible.ansibleDsl.EJinjaExpressionOrString
import org.sodalite.sdl.ansible.ansibleDsl.EJinjaExpressionEvaluation

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class AnsibleDslGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for (e : resource.allContents.toIterable.filter(EPlaybook)){
			fsa.generateFile(e.name + '.yaml', compilePlays(e))
		}
//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
//			resource.allContents
//				.filter(Greeting)
//				.map[name]
//				.join(', '))
	}
	
	def compilePlays(EPlaybook playbook) '''
		�FOR play : playbook.plays�
			�compilePlay(play, '  ')�
		�ENDFOR�
	'''
	
	def compilePlay(EPlay play, String space) '''
		�IF play.name !== null�
			- name: �play.name�
			�space�hosts: all
		�ELSE�
			- hosts: all
		�ENDIF�
		�compileBaseCommonKeywords(play, space)�
		�IF play.play_exe_settings !== null�
			�compilePlayExeSettings(play.play_exe_settings, space)�
		�ENDIF�
		�IF play.error_handling !== null�
			�compilePlayErrorHandling(play.error_handling, space)�
		�ENDIF�
		�IF play.facts_settings !== null�
			�compileFactsSettings(play.facts_settings, space)�
		�ENDIF�
		�IF play.vars_files !== null�
			�space�vars_files: �play.vars_files.compileList�
		�ENDIF�
		�IF play.vars_prompt !== null�
			�space�vars_prompt: �play.vars_prompt.compileList�
		�ENDIF�
		�IF play.force_handlers !== null�
			�space�force_handlers: �play.force_handlers�
		�ENDIF�
		�IF play.roles_inclusions !== null�
			�space�roles:
			�FOR role: play.roles_inclusions.roles�
				�compileRoleInclusion(role, space.concat('  '))�
			�ENDFOR�
		�ENDIF�
		�IF play.pre_tasks_list.size !== 0�
			
			�space�pre_tasks:
			�FOR blockTask: play.pre_tasks_list�
				
				�compileBlockTask(blockTask, space.concat('  '))�
			�ENDFOR�
		�ENDIF�
		�IF play.tasks_list.size !== 0�
			
			�space�tasks:
			�FOR blockTask: play.tasks_list�
				
				�compileBlockTask(blockTask, space.concat('  '))�
			�ENDFOR�
		�ENDIF�
		�IF play.post_tasks_list.size !== 0�
			
			�space�post_tasks:
			�FOR blockTask: play.post_tasks_list�
				
				�compileBlockTask(blockTask, space.concat('  '))�
			�ENDFOR�
		�ENDIF�
		�IF play.handlers.size !== 0�
			
			�space�handlers:
			�FOR handler: play.handlers�
				
				�compileTaskHandler(handler, space.concat('  '))�
			�ENDFOR�
		�ENDIF�
	'''

	def compileExecution(EExecution execution, String space) '''
		�IF execution instanceof EBlock�
			�compileBlock(execution, space)�
		�ENDIF�
		�IF execution instanceof ETaskHandler�
			�compileTaskHandler(execution, space)�
		�ENDIF�
		�IF execution instanceof ERoleInclusion�
			�compileRoleInclusion(execution, space)�
		�ENDIF�
	'''
	
	def compileRoleInclusion(ERoleInclusion roleInclusion, String space)'''
		�space�- role: �roleInclusion.name�
		�compileBaseCommonKeywords(roleInclusion, space.concat('  '))�
		�compileExecutionCommonKeywords(roleInclusion, space.concat('  '))�
	'''
	
	def compileBaseCommonKeywords(EBase base, String space) '''
		�IF base.privilage_escalation !== null�
			�IF base.privilage_escalation.become !== null�
				�space�become: �base.privilage_escalation.become�
			�ENDIF�
			�IF base.privilage_escalation.become_exe !== null�
				�space�become_exe: �base.privilage_escalation.become_exe�
			�ENDIF�
			�IF base.privilage_escalation.become_flags !== null�
				�space�become_flags: �base.privilage_escalation.become_flags�
			�ENDIF�
			�IF base.privilage_escalation.become_method !== null�
				�space�become_method: �base.privilage_escalation.become_method�
			�ENDIF�
			�IF base.privilage_escalation.become_user !== null�
				�space�become_user: �base.privilage_escalation.become_user�
			�ENDIF�
		�ENDIF�
		�IF base.validation_mode !== null�
			�IF base.validation_mode.check_mode !== null�
				�space�check_moode: �base.validation_mode.check_mode�
			�ENDIF�
			�IF base.validation_mode.diff !== null�
				�space�diff: �base.validation_mode.diff�
			�ENDIF�
		�ENDIF�
		�IF base.connection !== null�
			�IF base.connection.connection !== null�
				�space�connection: �base.connection.connection�
			�ENDIF�
			�IF base.connection.port.toString() !== null�
				�space�port: �base.connection.port�
			�ENDIF�
			�IF base.connection.remote_user !== null�
				�space�remote_user: �base.connection.remote_user�
			�ENDIF�
		�ENDIF�
		�IF base.no_log !== null�
			�space�no_log: �base.no_log�
		�ENDIF�
		�IF base.debugger !== null�
			�space�debugger: �base.debugger�
		�ENDIF�
		�IF base.module_defaults !== null�
			�space�module_defaults: �base.module_defaults.compileList�
		�ENDIF�
		�IF base.environment !== null�
			�space�environment: �base.environment.compileList�
		�ENDIF�
		�IF base.collections !== null�
			�space�collections: �base.collections.compileList�
		�ENDIF�
		�IF base.tags !== null�
			�space�tags: �base.tags.compileList �
		�ENDIF�
		�IF base.variable_declarations.size !== 0�
			�space�vars: �base.compileVariableDeclarations�
		�ENDIF�
	'''
	
	def compilePlayExeSettings(EPlayExeSettings playExeSettings, String space) '''
		�IF playExeSettings.strategy !== null�
			�space�strategy: �playExeSettings.strategy�
		�ENDIF�
		�IF playExeSettings.serial_list !== null�
			�space�serial: �playExeSettings.serial_list.compileList�
		�ENDIF�
		�IF playExeSettings.order !== null�
			�space�order: �playExeSettings.order�
		�ENDIF�
		�IF playExeSettings.throttle !== null�
			�space�throttle: �playExeSettings.throttle�
		�ENDIF�
		�IF playExeSettings.run_once !== null�
			�space�run_once: �playExeSettings.run_once�
		�ENDIF�
	'''
	
	def compilePlayErrorHandling(EPlayErrorHandling playErrorHandling, String space) '''
		�IF playErrorHandling.max_fail_percentage !== null�
			�space�max_fail_percentage: �playErrorHandling.max_fail_percentage�
		�ENDIF�
		�IF playErrorHandling.any_errors_fatal !== null�
			�space�any_errors_fatal: �playErrorHandling.any_errors_fatal�
		�ENDIF�
		�IF playErrorHandling.ignore_errors !== null�
			�space�ignore_errors: �playErrorHandling.ignore_errors�
		�ENDIF�
		�IF playErrorHandling.ignore_unreachable !== null�
			�space�ignore_unreachable: �playErrorHandling.ignore_unreachable�
		�ENDIF�
	'''
	
	def compileFactsSettings(EFactsSettings factsSettings, String space) '''
		�IF factsSettings.gather_facts !== null�
			�space�gather_facts: �factsSettings.gather_facts�
		�ENDIF�
		�IF factsSettings.gather_subset !== null�
			�space�gather_subset: �factsSettings.gather_subset.compileList�
		�ENDIF�
		�IF factsSettings.gather_timeout !== null�
			�space�gather_timeout: �factsSettings.gather_timeout�
		�ENDIF�
		�IF factsSettings.fact_path !== null�
			�space�fact_path: �factsSettings.fact_path�
		�ENDIF�
	'''
	
	def compileBlockTask(EBlockTask blockTask, String space) '''
		�IF blockTask instanceof EBlock�
			�compileBlock(blockTask, space)�
		�ENDIF�
		�IF blockTask instanceof ETask�
			�compileTaskHandler(blockTask, space)�
		�ENDIF�
	'''
	
	def compileBlock(EBlock block, String space) '''
		�IF block.name !== null�
			�space�- name: �block.name�
			�space.concat('  ')�block:
		�ELSE�
			�space�- block:
		�ENDIF�
		�IF block.tasks.size !== 0�
			�FOR task: block.tasks�
				�compileTaskHandler(task, space.concat('  ').concat('  '))�
			�ENDFOR�
		�ENDIF�
		�IF block.rescue_tasks.size !== 0�
			�space.concat('  ')�rescue: 
			�FOR task: block.rescue_tasks�
				�compileTaskHandler(task, space.concat('  ').concat('  '))�
			�ENDFOR�
		�ENDIF�
		�IF block.always_tasks.size !== 0�
			�space.concat('  ')�always: 
			�FOR task: block.always_tasks�
				�compileTaskHandler(task, space.concat('  ').concat('  '))�
			�ENDFOR�
		�ENDIF�
		�compileBaseCommonKeywords(block, space.concat('  '))�
		�compileExecutionCommonKeywords(block, space.concat('  '))�
		�IF block.error_handling !== null�
			�IF block.error_handling.any_errors_fatal !== null�
				�space.concat('  ')�any_errors_fatal: �block.error_handling.any_errors_fatal�
			�ENDIF�
			�IF block.error_handling.ignore_errors !== null�
				�space.concat('  ')�ignore_errors: �block.error_handling.ignore_errors�
			�ENDIF�
			�IF block.error_handling.ignore_unreachable !== null�
				�space.concat('  ')�ignore_unreachable: �block.error_handling.ignore_unreachable�
			�ENDIF�
		�ENDIF�
	'''
	
	def compileExecutionCommonKeywords(EExecution execution, String space) '''
		�IF execution.exe_settings !== null�
			�IF execution.exe_settings.throttle != 0�
				�space�throttle: �execution.exe_settings.throttle�
			�ENDIF�
			�IF execution.exe_settings.run_once !== null�
				�space�run_once: �execution.exe_settings.run_once�
			�ENDIF�
		�ENDIF�
		�IF execution.delegation !== null�
			�IF execution.delegation.delegate_to !== null�
				�space�delegate_to: �execution.delegation.delegate_to�
			�ENDIF�
			�IF execution.delegation.delegate_facts !== null�
				�space�delegate_facts: �execution.delegation.delegate_facts�
			�ENDIF�
		�ENDIF�
		�IF execution.when_expression !== null�
			�space�when: �execution.when_expression.compileJinjaExpressionEvaluationWithoutBrackets�
		�ENDIF�
	'''
	
	def compileTaskHandler(ETaskHandler taskHandler, String space) '''
		�IF taskHandler.name !== null�
			�space�- name: �taskHandler.name�
			�IF taskHandler.module !== null�
				�space.concat('  ')��taskHandler.module.name�:
				�FOR parameter: taskHandler.module.parameters�
					�space.concat('  ').concat('  ')��parameter.name�: �parameter.value_passed.compileValuePassed�
				�ENDFOR�
			�ENDIF�
		�ELSE�
			�IF taskHandler.module !== null�
				�space�- �taskHandler.module.name�:
				�FOR parameter: taskHandler.module.parameters�
					�space.concat('  ').concat('  ')��parameter.name�: �parameter.value_passed.compileValuePassed�
				�ENDFOR�
			�ENDIF�
		�ENDIF�
		�compileBaseCommonKeywords(taskHandler, space.concat('  '))�
		�compileExecutionCommonKeywords(taskHandler, space.concat('  '))�
		�compileTaskHandlerCommonKeywords(taskHandler, space.concat('  '))�
		�IF taskHandler instanceof EHandler�
			�IF taskHandler.listen_to !== null�
				�space.concat('  ')�listen: �compileNotifiedTopics(taskHandler)�
			�ENDIF�
		�ENDIF�
	'''
	
	def compileTaskHandlerCommonKeywords(ETaskHandler taskHandler, String space) '''
		�IF taskHandler.error_handling !== null�
			�IF taskHandler.error_handling.changed_when !== null�
				�space�change_when: �taskHandler.error_handling.changed_when.compileJinjaExpressionEvaluationWithoutBrackets�
			�ENDIF�
			�IF taskHandler.error_handling.failed_when !== null�
				�space�failed_when: �taskHandler.error_handling.failed_when.compileJinjaExpressionEvaluationWithoutBrackets�
			�ENDIF�
			�IF taskHandler.error_handling.any_errors_fatal !== null�
				�space�any_errors_fatal: �taskHandler.error_handling.any_errors_fatal�
			�ENDIF�
			�IF taskHandler.error_handling.ignore_errors !== null�
				�space�ignore_errors: �taskHandler.error_handling.ignore_errors�
			�ENDIF�
			�IF taskHandler.error_handling.ignore_unreachable !== null�
				�space�ignore_unreachable: �taskHandler.error_handling.ignore_unreachable�
			�ENDIF�
		�ENDIF�
		�IF taskHandler.action !== null�
			�space�action: �taskHandler.action�
		�ENDIF�
		�IF taskHandler.asynchronous_settings !== null�
			�IF taskHandler.asynchronous_settings.async !== null�
				�space�async: �taskHandler.asynchronous_settings.async�
			�ENDIF�
			�IF taskHandler.asynchronous_settings.poll !== null�
				�space�poll: �taskHandler.asynchronous_settings.poll�
			�ENDIF�
		�ENDIF�
		�IF taskHandler.args !== null�
			�space�args: �taskHandler.args.compileValue�
		�ENDIF�
		�IF taskHandler.notifiables.size !== 0�
			�space�notify: �compileNotifiables(taskHandler)�
		�ENDIF�
		�IF taskHandler.loop !== null�
			�IF taskHandler.loop instanceof ELoopOverList�
				�space�loop: �compileLoopList((taskHandler.loop as ELoopOverList).loop_list)�
				�IF (taskHandler.loop as ELoopOverList).loop_control !== null�
					�IF (taskHandler.loop as ELoopOverList).loop_control.label !== null�
						�space�label: �(taskHandler.loop as ELoopOverList).loop_control.label.compileValuePassed�
					�ENDIF�
					�IF (taskHandler.loop as ELoopOverList).loop_control.pause !== null�
						�space�pause: �(taskHandler.loop as ELoopOverList).loop_control.pause�
					�ENDIF�
					�IF (taskHandler.loop as ELoopOverList).loop_control.index_var !== null�
						�space�index_var: �(taskHandler.loop as ELoopOverList).loop_control.index_var�
					�ENDIF�
					�IF (taskHandler.loop as ELoopOverList).loop_control.loop_var !== null�
						�space�loop_var: �(taskHandler.loop as ELoopOverList).loop_control.loop_var�
					�ENDIF�
					�IF (taskHandler.loop as ELoopOverList).loop_control.extended !== null�
						�space�extended: �(taskHandler.loop as ELoopOverList).loop_control.extended�
					�ENDIF�
				�ENDIF�
			�ENDIF�
			�IF taskHandler.loop instanceof EUntil�
				�IF (taskHandler.loop as EUntil).until !== null�
					�space�until: �(taskHandler.loop as EUntil).until.compileJinjaExpressionEvaluationWithoutBrackets�
				�ENDIF�
				�IF (taskHandler.loop as EUntil).retries !== null�
					�space�retries: �(taskHandler.loop as EUntil).retries�
				�ENDIF�
				�IF (taskHandler.loop as EUntil).delay !== null�
					�space�delay: �(taskHandler.loop as EUntil).delay�
				�ENDIF�
			�ENDIF�
		�ENDIF�
		�IF taskHandler.register !== null�
			�space�register: �taskHandler.register.name�
		�ENDIF�
	'''
	
	def compileNotifiables(ETaskHandler taskHandler){
		var newList = new ArrayList()
		for (notifiable : taskHandler.notifiables){
			if (notifiable instanceof ENotifiedTopic){
				newList.add("\"".concat(notifiable.name).concat("\""))	
			}
			else if (notifiable instanceof ENotifiedHandler){
				newList.add(notifiable.name.name)
			}
		}
		return newList
	}
	
	def compileNotifiedTopics(EHandler handler){
		var newList = new ArrayList()
		for (listenedTopic : handler.listen_to){
			newList.add("\"".concat(listenedTopic.name).concat("\""))
		}
		return newList
	}
	
	def compileJinjaExpressionEvaluationWithoutBrackets(EJinjaExpressionEvaluationWithoutBrackets jinja){
		if (jinja instanceof EFilteredExpression){
			return jinja.compileFilteredExpression
		}
		else if (jinja instanceof EIfExpression){
			return jinja.compileIfExpression
		}
	}

	def compileFunctionCall(EFunctionCall functionCall){
		var stringToReturn = functionCall.name
		stringToReturn = stringToReturn.concat("(")
		for (var index = 0; index < functionCall.parameters.size; index++){	
			//the first parameter shouldn't have a comma before it, the others yes
			if (index == 0){
				stringToReturn = stringToReturn.concat(functionCall.parameters.get(index).compileFilteredExpression.toString())
			}
			else {
				stringToReturn = stringToReturn.concat(", ").concat(functionCall.parameters.get(index).compileFilteredExpression.toString())
			}
		}
		stringToReturn = stringToReturn.concat(")")
		return stringToReturn
	}
	
	def compileIfExpression(EIfExpression ifExpression){
		var stringToReturn = ifExpression.if_expression.compileFilteredExpression
		stringToReturn = stringToReturn.concat(" if ").concat(ifExpression.if_condition.compileFilteredExpression)
		if (ifExpression.else_expression !== null){
			stringToReturn = stringToReturn.concat(" else ").concat(ifExpression.else_expression.compileFilteredExpression)
		}
		return stringToReturn
	}
	
	def compileFilteredExpression(EFilteredExpression filteredExpression){
		var stringToReturn = filteredExpression.to_filter.compileOrExpression.toString()
		for (functionCall : filteredExpression.tail){
			stringToReturn = stringToReturn.concat(".").concat(functionCall.compileFunctionCall)
		}
		if (filteredExpression.filter !== null){
			stringToReturn = stringToReturn.concat(filteredExpression.filter.compileJinjaExpressionEvaluationWithoutBrackets.toString())
		}
		return stringToReturn
	}
	
	def compileOrExpression(EOrExpression orExpression){
		var stringToReturn = orExpression.left_or.compileAndExpression.toString()
		if (orExpression.right_or !== null){
			stringToReturn = stringToReturn.concat(" or ").concat(orExpression.right_or.compileOrExpression.toString())
		}
		return stringToReturn
	}
	
	def compileAndExpression(EAndExpression andExpression){
		var stringToReturn = andExpression.left_and.compileTruthExpression.toString()
		if (andExpression.right_and !== null){
			stringToReturn = stringToReturn.concat(" and ").concat(andExpression.right_and.compileAndExpression.toString())
		}
		return stringToReturn
	}
	
	def compileTruthExpression(ETruthExpression truthExpression){
		var stringToReturn = truthExpression.left_value.compileOperation.toString()
		if (truthExpression.equality_sign !== null && truthExpression.right_value !== null){
			stringToReturn = stringToReturn.concat(" ").concat(truthExpression.equality_sign).concat(" ").concat(truthExpression.right_value.compileTruthExpression.toString())
		}
		return stringToReturn
	}
	
	def compileOperation(EOperation operation){
		var stringToReturn = operation.left_operand.compileIsExpression.toString()
		if (operation.operator !== null && operation.right_operand !== null){
			stringToReturn = stringToReturn.concat(" ").concat(operation.operator).concat(" ").concat(operation.right_operand.compileOperation.toString())
		}
		return stringToReturn
	}
	
	def compileIsExpression(EIsExpression isExpression){
		var stringToReturn = isExpression.parenthesised_expression.compileParenthesisedExpression.toString()
		if (isExpression.status !== null){
			if (isExpression.is_not !== null){
				stringToReturn = stringToReturn.concat(" is not ").concat(isExpression.status.compileIsExpression.toString())	
			}
			else {
				stringToReturn = stringToReturn.concat(" is ").concat(isExpression.status.compileIsExpression.toString())	
			}
		}
		else if (isExpression.container_expression !== null){
			if (isExpression.is_not !== null){
				stringToReturn = stringToReturn.concat(" not in ").concat(isExpression.container_expression.compileIsExpression.toString())
			}
			else {
				stringToReturn = stringToReturn.concat(" in ").concat(isExpression.container_expression.compileIsExpression.toString())
			}
		}
		return stringToReturn
	}
	
	def compileParenthesisedExpression(EParenthesisedExpression parenthesisedExpression){
		if (parenthesisedExpression.basic_value !== null) return parenthesisedExpression.basic_value.compileValuePassedToJinjaExpression
		else if (parenthesisedExpression.parenthesised_term !== null) return "(".concat(parenthesisedExpression.parenthesised_term.compileOrExpression.toString()).concat(")")
	}
	
	def compileList(EList list){
		var newList = new ArrayList()
		for (element: list.elements){
			newList.add(element.compileValue)
		}
		return newList
	}
	
	def compileValuePassed(EValuePassed valuePassed){
		if (valuePassed instanceof EJinjaExpressionAndString){
			return valuePassed.compileJinjaExpressionAndString
		}
		else if (valuePassed instanceof EValueWithoutString){
			return valuePassed.compileValueWithoutString
		}
	}
	
	def compileJinjaExpressionAndString(EJinjaExpressionAndString jinja){
		var stringToReturn = "\""
		for (jinjaOr : jinja.jinja_expression_and_string){
			stringToReturn = stringToReturn.concat(jinjaOr.compileJinjaExpressionOrString)
		}
		stringToReturn = stringToReturn.concat("\"")
		return stringToReturn
	}
	
	def compileJinjaExpressionOrString(EJinjaExpressionOrString jinja){
		if (jinja.string !== null){
			return jinja.string
		}
		else if (jinja instanceof EJinjaExpressionEvaluation){
			return jinja.compileJinjaExpressionEvaluation
		}
	}
	
	def compileJinjaExpressionEvaluation(EJinjaExpressionEvaluation jinja){
		return "{{ ".concat(jinja.jinja_expression.compileJinjaExpressionEvaluationWithoutBrackets).concat(" }}")
	}
	
	def compileValuePassedToJinjaExpression(EValuePassedToJinjaExpression valuePassedToJinjaExpression){
		if (valuePassedToJinjaExpression instanceof EValue) return compileValue(valuePassedToJinjaExpression).toString()
		else if (valuePassedToJinjaExpression instanceof EFactGathered){
			var factString = "ansible_facts"
			for (field : valuePassedToJinjaExpression.tail){
				factString = factString.concat(".").concat(field)
			}
			return factString
		}
		else if (valuePassedToJinjaExpression instanceof EItem){
			var itemString = "item"
			for (tailElement : valuePassedToJinjaExpression.tail) {
				itemString = itemString.concat(".").concat(tailElement)
			}
			return itemString
		}
		else if (valuePassedToJinjaExpression instanceof EDeclaredVariableReference){
			var declaredVariableString = ""
			//TODO non va commentata questa riga di codice
			//declaredVariableString = declaredVariableString.concat(valuePassedToJinjaExpression.variable_reference.name)
			if (valuePassedToJinjaExpression.index !== null) declaredVariableString = declaredVariableString.concat("[").concat(valuePassedToJinjaExpression.index).concat("]")
			for (dictionaryPairReference : valuePassedToJinjaExpression.tail){
				declaredVariableString = declaredVariableString.concat(".").concat(dictionaryPairReference.name.name)
				if (dictionaryPairReference.index !== null) declaredVariableString = declaredVariableString.concat("[").concat(dictionaryPairReference.index).concat("]")
			}
			return declaredVariableString
		}
		else if (valuePassedToJinjaExpression instanceof EFunctionCall){
			return valuePassedToJinjaExpression.compileFunctionCall
		}
	}
	
	def compileLoopList(EValuePassed loopList){
		if (loopList instanceof EJinjaExpressionAndString || loopList instanceof EList) return compileValuePassed(loopList)
		else return "[".concat(loopList.compileValuePassed.toString()).concat("]")
	}
	
	
	def compileValue(EValue value){
		if (value instanceof EComposedValue) value.compileComposedValue
		else if (value instanceof ESimpleValue) value.compileSimpleValue
	}
	
	def compileValueWithoutString(EValueWithoutString valueWithoutString){
		if (valueWithoutString instanceof EComposedValue) valueWithoutString.compileComposedValue
		else if (valueWithoutString instanceof ESimpleValueWithoutString) valueWithoutString.compileSimpleValueWithoutString
	}
	
	def compileComposedValue(EComposedValue composedValue){
		if (composedValue instanceof EList) return composedValue.compileList
		else if (composedValue instanceof EDictionary){
			var dictionaryString = '{'
			for (dictionary_pair : composedValue.dictionary_pairs){
				dictionaryString = dictionaryString.concat(dictionary_pair.name).concat(': ').concat(compileValue(dictionary_pair.value).toString()).concat(', ')
			}
			dictionaryString = dictionaryString.substring(0, dictionaryString.length() - 2)
			dictionaryString = dictionaryString.concat('}')
			return dictionaryString
		}
	}
	
	def compileSimpleValue(ESimpleValue simpleValue){
		return "\"".concat(simpleValue.simple_value_string).concat("\"")
	}
	
	def compileSimpleValueWithoutString(ESimpleValueWithoutString simpleValueWithoutString){
		return simpleValueWithoutString.simple_value
	}
	
	def compileVariableDeclarations(EBase base){
		var variableDeclarationsString = '{'
		for (variable_declaration : base.variable_declarations){
			variableDeclarationsString = variableDeclarationsString.concat(variable_declaration.name).concat(': ').concat(compileValue(variable_declaration.value_passed).toString()).concat(', ')
		}
		variableDeclarationsString = variableDeclarationsString.substring(0, variableDeclarationsString.length() - 2)
			variableDeclarationsString = variableDeclarationsString.concat('}')
			return variableDeclarationsString
	}
}
