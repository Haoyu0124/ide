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
import org.sodalite.dsl.aADM.EAttributeAssigments
import org.sodalite.dsl.aADM.ERequirementAssignments
import org.sodalite.dsl.aADM.ECapabilityAssignments
import org.sodalite.dsl.rM.EParameterDefinition
import org.sodalite.dsl.aADM.ENodeTemplate
import org.sodalite.dsl.aADM.ERequirementAssignment
import org.sodalite.dsl.aADM.EPropertyAssignment
import org.sodalite.dsl.rM.EPREFIX_TYPE
import org.sodalite.dsl.rM.EPropertyAssignments

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
	
	def image (ENodeTemplate entry){
		"template.png"
	}
	
	def text (ENodeTemplate entry){
		entry.name + "->" + renderType(entry.node.type)
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
	
	def text (EAttributeAssigments entry){
		"attributes"
	}
	
	def image (EAttributeAssigments entry){
		"attributes.png"
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

}
