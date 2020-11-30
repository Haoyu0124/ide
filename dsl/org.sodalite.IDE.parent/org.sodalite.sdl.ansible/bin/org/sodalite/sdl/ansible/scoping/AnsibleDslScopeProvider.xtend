/*
 * generated by Xtext 2.23.0
 */
package org.sodalite.sdl.ansible.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.scoping.IScope
import org.eclipse.emf.ecore.EReference
import org.sodalite.sdl.ansible.ansibleDsl.impl.EFilteredVariableImpl
import org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.EcoreUtil2
import org.sodalite.sdl.ansible.ansibleDsl.impl.EPlayImpl
import org.sodalite.sdl.ansible.ansibleDsl.impl.EDeclaredVariableImpl
import org.sodalite.sdl.ansible.ansibleDsl.impl.ERoleImpl
import org.sodalite.sdl.ansible.ansibleDsl.impl.ERoleCallsImpl
import org.sodalite.sdl.ansible.ansibleDsl.impl.EVariableDeclarationImpl
import org.sodalite.sdl.ansible.ansibleDsl.impl.EDictionaryImpl
import java.util.ArrayList
import org.sodalite.sdl.ansible.ansibleDsl.EDictionaryPair
import org.sodalite.sdl.ansible.ansibleDsl.impl.EDictionaryPairReferenceImpl

/** 
 * This class contains custom scoping description.
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class AnsibleDslScopeProvider extends AbstractAnsibleDslScopeProvider {
	override IScope getScope(EObject context, EReference reference) {
		if (context instanceof EFilteredVariableImpl && reference == AnsibleDslPackage.Literals.EFILTERED_VARIABLE__VARIABLE){
			val rootPlay = EcoreUtil2.getContainerOfType(context, EPlayImpl)
			//if rootPlay is different from null then we are in a play. else, we are in a role
			if (rootPlay !== null){
				val candidates = EcoreUtil2.getAllContentsOfType(rootPlay, EDeclaredVariableImpl)
				//also the variables declared in the imported roles must be scoped
				val roleCalls = EcoreUtil2.getAllContentsOfType(rootPlay, ERoleCallsImpl)
				for (roleCall: roleCalls){
					for (role: roleCall.roles){
						val candidatesRole = EcoreUtil2.getAllContentsOfType(role, EDeclaredVariableImpl)
						for (candidateRole: candidatesRole){
							candidates.add(candidateRole)
						}
					}
				}
				return Scopes.scopeFor(candidates)
			}
			//this else is entered it we are in a role
			else {
				val rootRole = EcoreUtil2.getContainerOfType(context, ERoleImpl)
				val candidates = EcoreUtil2.getAllContentsOfType(rootRole, EDeclaredVariableImpl)
				return Scopes.scopeFor(candidates)
			}
			
		}
		
		if (context instanceof EDictionaryPairReferenceImpl && reference == AnsibleDslPackage.Literals.EDICTIONARY_PAIR_REFERENCE__NAME){
			val filteredVariable = EcoreUtil2.getContainerOfType(context, EFilteredVariableImpl)
			val tail = filteredVariable.tail
			val index = tail.indexOf(context)
			var candidatesOfDictionary = new ArrayList<EDictionaryPair>
			if (index > 0){
				val previousDictionaryPair = tail.get(index - 1).name
				if (previousDictionaryPair.value instanceof EDictionaryImpl){
					for (dictionaryPair : (previousDictionaryPair.value as EDictionaryImpl).dictionary_pairs){
						candidatesOfDictionary.add(dictionaryPair)
					}
				}
			}
			else {
				if (filteredVariable.variable instanceof EVariableDeclarationImpl){
					if ((filteredVariable.variable as EVariableDeclarationImpl).value_passed instanceof EDictionaryImpl){
						for (dictionaryPair : (((filteredVariable.variable as EVariableDeclarationImpl).value_passed) as EDictionaryImpl).dictionary_pairs){
							candidatesOfDictionary.add(dictionaryPair)
						}
					}
				}
			}
			return Scopes.scopeFor(candidatesOfDictionary)
		}
		
		return super.getScope(context, reference);
	}
}
