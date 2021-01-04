/*
 * generated by Xtext 2.23.0
 */
lexer grammar InternalAnsibleDslLexer;

@header {
package org.sodalite.sdl.ansible.ide.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

Asynchronous_settings : 'asynchronous_settings:';

Privilege_escalation : 'privilege_escalation:';

Max_fail_percentage : 'max_fail_percentage:';

Registered_variable : 'registered_variable:';

Ignore_unreachable : 'ignore_unreachable:';

Playbook_inclusion : 'playbook_inclusion:';

Declared_variable : 'declared_variable:';

Index_or_loop_var : 'index_or_loop_var:';

Play_exe_settings : 'play_exe_settings:';

Any_errors_fatal : 'any_errors_fatal:';

Direct_parameter : 'direct_parameter:';

Roles_inclusions : 'roles_inclusions:';

Special_variable : 'special_variable:';

Connection_info : 'connection_info:';

Import_playbook : 'import_playbook:';

Interface_input : 'interface_input:';

Module_defaults : 'module_defaults:';

Operation_input : 'operation_input:';

Validation_mode : 'validation_mode:';

Delegate_facts : 'delegate_facts:';

Error_handling : 'error_handling:';

Facts_settings : 'facts_settings:';

Force_handlers : 'force_handlers:';

Gather_timeout : 'gather_timeout:';

Become_method : 'become_method:';

Gather_subset : 'gather_subset:';

Ignore_errors : 'ignore_errors:';

Playbook_name : 'playbook_name:';

Always_tasks : 'always_tasks:';

Become_flags : 'become_flags:';

Changed_when : 'changed_when:';

Exe_settings : 'exe_settings:';

Gather_facts : 'gather_facts:';

Handler_name : 'handler_name:';

Loop_control : 'loop_control:';

Rescue_tasks : 'rescue_tasks:';

Become_user : 'become_user:';

Collections : 'collections:';

Delegate_to : 'delegate_to:';

Environment : 'environment:';

Failed_when : 'failed_when:';

Remote_user : 'remote_user:';

Vars_prompt : 'vars_prompt:';

Become_exe : 'become_exe:';

Block_name : 'block_name:';

Check_mode : 'check_mode:';

Connection : 'connection:';

Delegation : 'delegation:';

Parameters : 'parameters:';

Post_tasks : 'post_tasks:';

Tasks_list : 'tasks_list:';

Vars_files : 'vars_files:';

Fact_path : 'fact_path:';

Index_var : 'index_var:';

Loop_over : 'loop_over:';

Node_type : 'node_type:';

Operation : 'operation:';

Play_name : 'play_name:';

Pre_tasks : 'pre_tasks:';

Role_name : 'role_name:';

Task_name : 'task_name:';

Debugger : 'debugger:';

Extended : 'extended:';

Fact_set : 'fact_set:';

Handlers : 'handlers:';

Loop_var : 'loop_var:';

Register : 'register:';

Run_once : 'run_once:';

Strategy : 'strategy:';

Throttle : 'throttle:';

Handler : 'handler:';

Retries : 'retries:';

Used_by : 'used_by:';

Action : 'action:';

Become : 'become:';

Listen : 'listen:';

Module : 'module:';

No_log : 'no_log:';

Notify : 'notify:';

Serial : 'serial:';

Async : 'async:';

Block : 'block:';

Delay : 'delay:';

Hosts : 'hosts:';

Label : 'label:';

Order : 'order:';

Pause : 'pause:';

Plays : 'plays:';

Return : 'return';

Tasks : 'tasks:';

Topic : 'topic:';

Until : 'until:';

Args : 'args:';

Diff : 'diff:';

Loop : 'loop:';

Play : 'play:';

Poll : 'poll:';

Port : 'port:';

Role : 'role:';

Tags : 'tags:';

Task : 'task:';

Vars : 'vars:';

When : 'when:';

Else : 'else';

Item : 'item';

And : 'and';

Not : 'not';

ExclamationMarkEqualsSign : '!=';

LeftParenthesisRightParenthesis : '()';

AsteriskAsterisk : '**';

SolidusSolidus : '//';

LessThanSignEqualsSign : '<=';

EqualsSignEqualsSign : '==';

GreaterThanSignEqualsSign : '>=';

If : 'if';

In : 'in';

Is : 'is';

Or : 'or';

LeftCurlyBracketLeftCurlyBracket : '{{';

RightCurlyBracketRightCurlyBracket : '}}';

PercentSign : '%';

LeftParenthesis : '(';

RightParenthesis : ')';

Asterisk : '*';

PlusSign : '+';

Comma : ',';

HyphenMinus : '-';

FullStop : '.';

Solidus : '/';

Colon : ':';

LessThanSign : '<';

GreaterThanSign : '>';

LeftSquareBracket : '[';

RightSquareBracket : ']';

LeftCurlyBracket : '{';

VerticalLine : '|';

RightCurlyBracket : '}';

RULE_BOOLEAN : ('True'|'False');

RULE_NULL : 'Null';

RULE_NONE : 'None';

RULE_NUMBER : ('1'..'9' ('0'..'9')*|'0') ('.' ('0'..'9')+)?;

fragment RULE_BEGIN : ;

fragment RULE_END : ;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
