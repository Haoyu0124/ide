/*
 * generated by Xtext 2.17.1
 */
package org.sodalite.dsl.ui.quickfix

import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.eclipse.xtext.validation.Issue
import org.eclipse.xtext.ui.editor.quickfix.Fix
import org.sodalite.dsl.aADM.ENodeTemplate
import org.sodalite.dsl.aADM.AADMFactory
import org.sodalite.dsl.ui.validation.ValidationIssue
import java.text.MessageFormat
import java.util.regex.Pattern
import java.util.regex.Matcher
import org.sodalite.dsl.aADM.ERequirementAssignment
import org.sodalite.dsl.aADM.impl.ENodeTemplatesImpl
import org.sodalite.dsl.rM.RMFactory
import java.util.StringTokenizer

/**
 * Custom quickfixes.
 *
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#quick-fixes
 */
class AADMQuickfixProvider extends DefaultQuickfixProvider {
	
	@Fix(ValidationIssue.REQUIREMENT)
	def fixRequirement(Issue issue, IssueResolutionAcceptor acceptor) {
			val String data = (issue.data as String[]).get(0)
			val String targetRequirement = getSubstring(data, "requirements\\/(.*?)\\/")
//			val String targetTemplate = getSubstring(data, "\\/(.*?)\\/requirements")
			
			val String[] matches = getSubstring(data, "\\[(.*?)\\]").split(Pattern.quote(","))
			val prefix = "https://www.sodalite.eu/ontologies/workspace/1/"
			for (String match: matches) {
				val qMatch = match.trim.substring(prefix.length)
				val targetNode = qMatch.substring(qMatch.lastIndexOf('/') + 1)
				val targetModule = qMatch.substring(0, qMatch.lastIndexOf('/'))
				val message = MessageFormat.format('Create requirement "{0}" referencing node "{1}"',
					targetRequirement, targetNode);
				val sub_message = message
				acceptor.accept(issue, message, sub_message, '') [ nodeTemplate, context |
					//Get requirement. If not created.
					//Add/replace node
					var ERequirementAssignment req = null
					var node = nodeTemplate as ENodeTemplate
					if (node.node.requirements === null){
						val requirements = AADMFactory.eINSTANCE.createERequirementAssignments
						node.node.requirements = requirements
					}
					for (ERequirementAssignment requirement:node.node.requirements.requirements){
						if (requirement.name.equalsIgnoreCase(targetRequirement)){
							req = requirement;
						}
					}
					if (req === null){
						//Create a ERequirementAssignment
						req = AADMFactory.eINSTANCE.createERequirementAssignment
						req.name = targetRequirement
						node.node.requirements.requirements.add(req)
					}
					System.out.println ("Applying targetNode: " + targetNode)
					if (req.node === null){
						var req_node = RMFactory.eINSTANCE.createEPREFIX_ID
						req.node = req_node
					}
					req.node.module = targetModule
					req.node.id = targetNode 
					
					//TODO Invoke automatic formatting
					//TODO Remove issue from model
				]
			}
	}
	
	@Fix(ValidationIssue.PROPERTY)
	def fixProperty(Issue issue, IssueResolutionAcceptor acceptor) {
		val String data = (issue.data as String[]).get(0) 
		val StringTokenizer st = new StringTokenizer(data.substring(1, data.length - 1), ",")
		val String propertyName = st.nextToken.trim
		val String nodeName = st.nextToken.trim 
		val message = MessageFormat.format('Create property "{0}" in node "{1}"',
					propertyName, nodeName);
		val sub_message = message
		acceptor.accept(issue, message, sub_message, '') [ nodeTemplate, context |
			//Add property to node
			var node = nodeTemplate as ENodeTemplate
			if (node.node.properties === null){
				val properties = RMFactory.eINSTANCE.createEPropertyAssignments
				node.node.properties = properties
			}
			var property = RMFactory.eINSTANCE.createEPropertyAssignment
			property.name = propertyName
			var value = RMFactory.eINSTANCE.createESTRING
			value.value = ""
			property.value = value
			node.node.properties.properties.add(property)
			
			//TODO Invoke automatic formatting
			//TODO Remove issue from model
		]
	}
	
	def getNode(ENodeTemplatesImpl templates, String name){
		var ENodeTemplate node = null
		for (ENodeTemplate n: templates.nodeTemplates){
			if (n.name.equals(name)){
				node = n
			}
		}
		return node
	}
	
	def getSubstring(String data, String sPattern){
		val Pattern pattern = Pattern.compile(sPattern);
		val Matcher matcher = pattern.matcher(data);
		if (matcher.find())
			return matcher.group(1);
	}
	
}
