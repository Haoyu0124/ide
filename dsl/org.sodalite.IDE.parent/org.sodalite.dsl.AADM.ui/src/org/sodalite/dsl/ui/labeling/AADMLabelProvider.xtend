/*
 * generated by Xtext 2.17.1
 */
package org.sodalite.dsl.ui.labeling

import com.google.inject.Inject
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider
import org.sodalite.dsl.aADM.AADM_Model
import org.sodalite.dsl.rM.EInputs
import org.sodalite.dsl.aADM.ENodeTemplates
import org.sodalite.dsl.aADM.EAttributeAssignments
import org.sodalite.dsl.aADM.ERequirementAssignments
import org.sodalite.dsl.aADM.ECapabilityAssignments
import org.sodalite.dsl.rM.EParameterDefinition
import org.sodalite.dsl.aADM.ENodeTemplate
import org.sodalite.dsl.aADM.ERequirementAssignment
import org.sodalite.dsl.rM.EPREFIX_TYPE
import org.sodalite.dsl.rM.EPropertyAssignments
import org.sodalite.dsl.rM.EPropertyAssignment
import org.sodalite.dsl.aADM.EPolicies
import org.sodalite.dsl.aADM.EPolicyDefinition
import org.sodalite.dsl.aADM.EAttributeAssignment
import org.sodalite.dsl.aADM.ENodeTemplateBody
import org.sodalite.dsl.aADM.EPolicyDefinitionBody
import org.sodalite.dsl.rM.EPREFIX_ID
import org.sodalite.dsl.aADM.ETriggerDefinitions
import org.sodalite.dsl.rM.ETriggerDefinition
import org.sodalite.dsl.aADM.ETarget

/**
 * Provides labels for EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#label-provider
 */
class AADMLabelProvider extends DefaultEObjectLabelProvider {

	@Inject
	new(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	// Labels and icons can be computed like this:
	def text (AADM_Model model){
		var name = model.eResource.URI.lastSegment
		name = name.substring(0, name.lastIndexOf("."))
		"AADM Model: " + name
	}
	
	def text (EInputs entry){
		"inputs"
	}
	
	def image (EInputs entry){
		"inputs.png"
	}
	
	def image (EParameterDefinition entry){
		"input.png"
	}
	
	def text (ENodeTemplates entry){
		"node_templates"
	}
	
	def image (ENodeTemplates entry){
		"templates.png"
	}
	
	def text (ETriggerDefinitions entry){
		"triggers"
	}
	
	def image (ETriggerDefinitions entry){
		"triggers.png"
	}
	
	def text (ETriggerDefinition entry){
		entry.name
	}
	
	def image (ETriggerDefinition entry){
		"trigger.png"
	}
	
	def text (ETarget entry){
		"targets"
	}
	
	def image (ETarget entry){
		"targets.png"
	}
	
	def text (EPolicies entry){
		"policies"
	}
	
	def image (EPolicies entry){
		"policies.png"
	}
	
	def image (ENodeTemplate entry){
		"template.png"
	}
	
	def text (ENodeTemplate entry){
		entry.name
	}
	
	def image (EPolicyDefinition entry){
		"policy.png"
	}
	
	def text (EPolicyDefinition entry){
		entry.name
	}
		
	def text(EPREFIX_TYPE type) {
		return type.module !== null? type.module + '/' + type.type: type.type
	}	
	
	def text(EPREFIX_ID id) {
		return id.module !== null? id.module + '/' + id.id: id.id
	}
		
	def renderType(EPREFIX_TYPE type) {
		return type.module !== null? type.module + '/' + type.type: type.type
	}
	
	def image (EPropertyAssignments entry){
		"properties.png"
	}
	
	def text (EPropertyAssignments entry){
		"properties"
	}
	
	def image (EPropertyAssignment entry){
		"property.png"
	}
	
	def text (EAttributeAssignments entry){
		"attributes"
	}
	
	def image (EAttributeAssignments entry){
		"attributes.png"
	}
	
	def image (EAttributeAssignment entry){
		"attribute.png"
	}
	
	def text (ERequirementAssignments entry){
		"requirements"
	}
	
	def image (ERequirementAssignments entry){
		"requirements.png"
	}
	
	def image (ERequirementAssignment entry){
		"requirement.png"
	}
	
	def text (ECapabilityAssignments entry){
		"capabilities"
	}
	
	def image (ECapabilityAssignments entry){
		"capabilities.png"
	}
	
	def image (EPREFIX_TYPE entry){
		if (entry.eContainer instanceof ENodeTemplateBody)
			"type.png"
		else if (entry.eContainer instanceof EPolicyDefinitionBody)
			"type.png"
	}
	
	def image (EPREFIX_ID entry){
		if (entry.eContainer instanceof ERequirementAssignment)
			"template.png"
		else if (entry.eContainer instanceof ETarget)
			"target.png"
	}

}
