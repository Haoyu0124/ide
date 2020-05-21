/*
 * generated by Xtext 2.17.1
 */
package org.sodalite.dsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.emf.common.util.URI
import org.sodalite.dsl.rM.ENodeType
import org.sodalite.dsl.rM.EPropertyDefinition
import org.sodalite.dsl.rM.EAttributeDefinition
import org.sodalite.dsl.rM.ERequirementDefinition
import org.sodalite.dsl.rM.ECapabilityDefinition
import org.eclipse.emf.ecore.EObject
import java.util.Map
import java.util.HashMap
import org.sodalite.dsl.rM.EInterfaceDefinition
import org.sodalite.dsl.rM.EValueExpression
import org.sodalite.dsl.rM.ESTRING
import org.eclipse.emf.ecore.util.EObjectContainmentEList
import org.sodalite.dsl.rM.EValidSourceType
import org.sodalite.dsl.rM.EOperationDefinition
import org.sodalite.dsl.rM.EParameterDefinition
import org.sodalite.dsl.rM.EFunction
import org.sodalite.dsl.rM.GetProperty
import org.sodalite.dsl.rM.GetAttribute

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class RMGenerator extends AbstractGenerator {
	var int node_counter = 1
	var int property_counter = 1
	var int attribute_counter = 1
	var int requirement_counter = 1
	var int capability_counter = 1
	var int parameter_counter = 1
	var int interface_counter = 1
	var Map<EPropertyDefinition, Integer> property_numbers
	var Map<EAttributeDefinition, Integer> attribute_numbers
	var Map<ERequirementDefinition, Integer> requirement_numbers
	var Map<ECapabilityDefinition, Integer> capability_numbers
	var Map<EInterfaceDefinition, Integer> interface_numbers
	var Map<EObject, Map<String,Integer>> parameter_numbers
	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		node_counter = 1
		property_counter = 1
		attribute_counter = 1
		requirement_counter = 1
		capability_counter = 1
		parameter_counter = 1
		interface_counter = 1
		property_numbers = new HashMap<EPropertyDefinition, Integer>()
		attribute_numbers = new HashMap<EAttributeDefinition, Integer>()
		requirement_numbers = new HashMap<ERequirementDefinition, Integer>()
		capability_numbers = new HashMap<ECapabilityDefinition, Integer>()
		parameter_numbers = new HashMap<EObject, Map<String, Integer>>()
		interface_numbers = new HashMap<EInterfaceDefinition, Integer>()
		
		val filename = getFilename(resource.URI)
		fsa.generateFile(filename,  compileRM (resource))
	}
	
	
	def compileRM(Resource r) '''
	# baseURI: https://www.sodalite.eu/ontologies/exchange/rm/
	# imports: https://www.sodalite.eu/ontologies/exchange/
	
	@prefix : <https://www.sodalite.eu/ontologies/exchange/rm/> .
	@prefix exchange: <https://www.sodalite.eu/ontologies/exchange/> .
	@prefix owl: <http://www.w3.org/2002/07/owl#> .
	@prefix rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> .
	@prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> .
	@prefix xsd: <http://www.w3.org/2001/XMLSchema#> .
	
	:
	  rdf:type owl:Ontology ;
	  owl:imports exchange: ;
	  owl:versionInfo "Created by the SODALITE IDE" ;
	.
	
	:RM_1
	  rdf:type exchange:RM ;
	  exchange:userId "27827d44-0f6c-11ea-8d71-362b9e155667" ;
	.
	
	«FOR p:r.allContents.toIterable.filter(GetProperty)»
	«p.compile»
	«ENDFOR»
	
	«FOR a:r.allContents.toIterable.filter(GetAttribute)»
	«a.compile»
	«ENDFOR»
	
	«FOR p:r.allContents.toIterable.filter(EParameterDefinition)»
	«p.compile»
	«ENDFOR»

	«FOR o:r.allContents.toIterable.filter(EOperationDefinition)»
	«o.compile»
	«ENDFOR»

 	«FOR p:r.allContents.toIterable.filter(EPropertyDefinition)»
	«p.compile»
	«ENDFOR»
	
 	«FOR p:r.allContents.toIterable.filter(EAttributeDefinition)»
	«p.compile»
	«ENDFOR»
	
 	«FOR i:r.allContents.toIterable.filter(EInterfaceDefinition)»
	«i.compile»
	«ENDFOR»
	
	«FOR cap:r.allContents.toIterable.filter(ECapabilityDefinition)»
	«cap.compile»
	«ENDFOR»
	
	«FOR req:r.allContents.toIterable.filter(ERequirementDefinition)»
	«req.compile»
	«ENDFOR»
	
	«FOR n:r.allContents.toIterable.filter(ENodeType)»
	«n.compile»
	«ENDFOR»
	'''
	
	def compile (ERequirementDefinition r) '''
	«IF r.requirement.capability !== null»
	«putParameterNumber(r, "capability", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "capability" ;
	  exchange:value "«r.requirement.capability.name»" ;
	.
	«ENDIF»
	
	«IF r.requirement.node !== null»
	«putParameterNumber(r, "node", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "node" ;
	  exchange:value "«r.requirement.node.name»" ;
	.
	«ENDIF»
	
	«IF r.requirement.relationship !== null»
	«putParameterNumber(r, "relationship", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "relationship" ;	  
	  exchange:value "«r.requirement.relationship.name»" ;
	.
	«ENDIF»
	
	«requirement_numbers.put(r, requirement_counter)»
	:Requirement_«requirement_counter++»
	  rdf:type exchange:Requirement ;
	  exchange:name "«r.name»" ;
	  «IF r.requirement.capability !== null»
	  exchange:hasParameter :Parameter_«getParameterNumber(r, "capability")» ;
	  «ENDIF»
	  «IF r.requirement.node !== null»
	  exchange:hasParameter :Parameter_«getParameterNumber(r, "node")» ;
	  «ENDIF»
	  «IF r.requirement.relationship !== null»
	  exchange:hasParameter :Parameter_«getParameterNumber(r, "relationship")» ;
	  «ENDIF»
	.		
	'''
	
	def compile (ECapabilityDefinition c) '''
	«IF c.capability.type !== null»
	«putParameterNumber(c, "type", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "type" ;
	  exchange:value "«c.capability.type.name»" ;
	.
	«ENDIF»
	
	«IF c.capability.description !== null»
	«putParameterNumber(c, "description", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "description" ;
	  exchange:value "«c.capability.description»" ;
	.
	«ENDIF»
	
	«IF c.capability.valid_source_types !== null»
	«putParameterNumber(c, "valid_source_types", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "valid_source_types" ;
	  «FOR entry:(c.capability.valid_source_types as EObjectContainmentEList<EValidSourceType>)»
	  «FOR s:(entry.sourceTypes)»
	  exchange:listValue "«s.name.name»" ;
	  «ENDFOR»
	  «ENDFOR»
	.
	«ENDIF»
		
	«capability_numbers.put(c, capability_counter)»
	:Capability_«capability_counter++»
	  rdf:type exchange:Capability ;
	  exchange:name "«c.name»" ;
	  «IF c.capability.type !== null»
	  exchange:hasParameter :Parameter_«getParameterNumber(c, "type")» ;
	  «ENDIF»
	  «IF c.capability.description !== null»
	  exchange:hasParameter :Parameter_«getParameterNumber(c, "description")» ;
	  «ENDIF»
	  «IF c.capability.valid_source_types !== null»
	  exchange:hasParameter :Parameter_«getParameterNumber(c, "valid_source_types")» ;
	  «ENDIF»
	.
	'''
	
	def compile(EInterfaceDefinition i) '''
	«IF i.interface.type !== null»
	«putParameterNumber(i, "type", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "type" ;
	  exchange:value "«i.interface.type.name»" ;
	.
	«ENDIF»
	
	«IF i.interface.operations !== null»
	«putParameterNumber(i, "operations", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "operations" ;
	  «FOR op:(i.interface.operations.operations)»
	  exchange:hasParameter :Parameter_«getParameterNumber(op, "name")» ;
	  «ENDFOR»	  
	.
	«ENDIF»	
	
	«interface_numbers.put(i, interface_counter)»
	:Interface_«interface_counter++»
	  rdf:type exchange:Interface ;
	  exchange:name "«i.name»" ;
	  «IF i.interface.type !== null»
	  exchange:hasParameter :Parameter_«getParameterNumber(i, "type")» ;
	  «ENDIF»
	  «IF i.interface.operations !== null»
	  exchange:hasParameter :Parameter_«getParameterNumber(i, "operations")» ;
	  «ENDIF»
	.
	'''
	
	def compile(EOperationDefinition o) '''
	«IF o.operation.inputs !== null»
	«putParameterNumber(o, "inputs", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "inputs" ;
	  «FOR in:(o.operation.inputs.inputs)»
	  exchange:hasParameter :Parameter_«getParameterNumber(in, "name")» ;
	  «ENDFOR»	  
	.
	«ENDIF»		
	
	«IF o.operation.implementation !== null»
	«putParameterNumber(o, "implementation", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "implementation" ;
	  exchange:value "«o.operation.implementation»" ;
	.
	«ENDIF»		
	
	«putParameterNumber(o, "name", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "«o.name»" ;
	  «IF o.operation.inputs !== null»
	  exchange:hasParameter :Parameter_«getParameterNumber(o, "inputs")» ;
	  «ENDIF»
	  «IF o.operation.implementation !== null»
	  exchange:hasParameter :Parameter_«getParameterNumber(o, "implementation")» ;
	  «ENDIF»  
	.
	'''
	
	def compile(EParameterDefinition p) '''
	«IF p.parameter.value !== null»
	«putParameterNumber(p, "value", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "value" ;  
	  exchange:hasParameter :Parameter_«getParameterNumber(p.parameter.value, "name")» ;
	.
	«ENDIF»		
	
	«IF p.parameter.^default !== null»
	«putParameterNumber(p, "default", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "default" ;  
	  exchange:hasParameter :Parameter_«getParameterNumber(p.parameter.^default, "name")» ; 
	.
	«ENDIF»	
	
	«putParameterNumber(p, "name", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "«p.name»" ;
	  «IF p.parameter.type !== null»
	  exchange:value «p.parameter.type.name» ;
	  «ENDIF»
	  «IF p.parameter.value !== null»
	  «IF p.parameter.value instanceof EFunction»
	  exchange:hasParameter :Parameter_«getParameterNumber(p, "value")» ;
	  «ELSE»
	  exchange:value «p.parameter.value.compile» ;	  
	  «ENDIF»
	  «ENDIF»
	  «IF p.parameter.^default !== null»
	  «IF p.parameter.^default instanceof EFunction»
	  exchange:hasParameter :Parameter_«getParameterNumber(p, "default")» ;
	  «ELSE»
	  exchange:value «p.parameter.^default.compile» ;	  
	  «ENDIF»	  
	  «ENDIF»  
	.	
	'''

	def compile(GetProperty p) '''
	«IF p.property.property !== null»
	«putParameterNumber(p, "property", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "property" ;  
	  exchange:value «p.property.property.name» ; 
	.
	«ENDIF»	
	
	«IF p.property.entity !== null»
	«putParameterNumber(p, "entity", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "entity" ;  
	  exchange:value «p.property.entity» ; 
	.
	«ENDIF»	
	
	«IF p.property.req_cap !== null»
	«putParameterNumber(p, "req_cap", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "req_cap" ;  
	  exchange:hasParameter :Parameter_«getParameterNumber(p, "req_cap")» ; 
	.
	«ENDIF»		
	
	«putParameterNumber(p, "name", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "get_property" ;
	  «IF p.property.property !== null»
	  exchange:hasParameter :Parameter_«getParameterNumber(p, "property")» ;
	  «ENDIF»	
	  «IF p.property.entity !== null»
	  exchange:hasParameter :Parameter_«getParameterNumber(p, "entity")» ;
	  «ENDIF»
	  «IF p.property.req_cap !== null»
	  exchange:hasParameter :Parameter_«getParameterNumber(p, "req_cap")» ;
	  «ENDIF»
	.	
	'''
	
	def compile(GetAttribute a) '''
	«IF a.attribute.attribute !== null»
	«putParameterNumber(a, "attribute", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "attribute" ;  
	  exchange:value «a.attribute.attribute.name» ; 
	.
	«ENDIF»	
	
	«IF a.attribute.entity !== null»
	«putParameterNumber(a, "entity", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "entity" ;  
	  exchange:value «a.attribute.entity» ; 
	.
	«ENDIF»	
	
	«IF a.attribute.req_cap !== null»
	«putParameterNumber(a, "req_cap", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "req_cap" ;  
	  exchange:hasParameter :Parameter_«getParameterNumber(a, "req_cap")» ; 
	.
	«ENDIF»		
	
	«putParameterNumber(a, "name", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "get_property" ;
	  «IF a.attribute.attribute !== null»
	  exchange:hasParameter :Parameter_«getParameterNumber(a, "attribute")» ;
	  «ENDIF»	
	  «IF a.attribute.entity !== null»
	  exchange:hasParameter :Parameter_«getParameterNumber(a, "entity")» ;
	  «ENDIF»
	  «IF a.attribute.req_cap !== null»
	  exchange:hasParameter :Parameter_«getParameterNumber(a, "req_cap")» ;
	  «ENDIF»
	.	
	'''

	def compile(ENodeType n) '''
	:Node_«node_counter++»
	  rdf:type exchange:Node ;
	  «IF n.node.description !== null»
	  exchange:description "«n.node.description»" ;
	  «ENDIF»
	  exchange:name "«n.name»" ;
	  exchange:derivesFrom "«n.node.superType.name»" ;
	  «IF n.node.properties !== null»
	  «FOR p:n.node.properties.properties»
	  exchange:properties :Property_«property_numbers.get(p)» ; 
	  «ENDFOR»
	  «ENDIF»
	  «IF n.node.attributes !== null»
	  «FOR a:n.node.attributes.attributes»
	  exchange:attributes :Attribute_«attribute_numbers.get(a)» ; 
	  «ENDFOR»
	  «ENDIF»
	  «IF n.node.requirements !== null»
	  «FOR r:n.node.requirements.requirements»
	  exchange:requirements :Requirement_«requirement_numbers.get(r)» ; 
	  «ENDFOR»
	  «ENDIF»
	  «IF n.node.capabilities !== null»
	  «FOR c:n.node.capabilities.capabilities»
	  exchange:capabilities :Capability_«capability_numbers.get(c)» ; 
	  «ENDFOR»
	  «ENDIF»
	  «IF n.node.interfaces !== null»
	  «FOR i:n.node.interfaces.interfaces»
	  exchange:interfaces :Interface_«interface_numbers.get(i)» ; 
	  «ENDFOR»
	  «ENDIF»
	.  
	'''
	
	def compile (EPropertyDefinition p) '''
	«IF p.property.description !== null»
	«putParameterNumber(p, "description", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "description" ;
	  exchange:value "«p.property.description»" ;
	.
	«ENDIF»
	
	«IF p.property.required»
	«putParameterNumber(p, "required", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "required" ;
	  exchange:value "«p.property.required»" ;
	.
	«ENDIF»
	
	«IF p.property.^default !== null»
	«putParameterNumber(p, "default", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "default" ;
	  exchange:value "«p.property.^default.compile»" ; 
	.
	«ENDIF»
	
	«property_numbers.put(p, property_counter)»
	:Property_«property_counter++»
	  rdf:type exchange:Property ;
	  exchange:name "«p.name»" ;
	  «IF p.property.description !== null»
	  exchange:hasParameter :Parameter_«getParameterNumber(p, "description")» ;
	  «ENDIF»
	  «IF p.property.required»
	  exchange:hasParameter :Parameter_«getParameterNumber(p, "required")» ;
	  «ENDIF»
	  «IF p.property.^default !== null»
	  exchange:hasParameter :Parameter_«getParameterNumber(p, "default")» ;
	  «ENDIF»
	.
	'''
	
	def compile (EAttributeDefinition a) '''
	«IF a.attribute.type !== null»
	«putParameterNumber(a, "type", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "type" ;
	  exchange:value "«a.attribute.type.name»" ;
	.
	«ENDIF»
	
	«IF a.attribute.description !== null»
	«putParameterNumber(a, "description", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "description" ;
	  exchange:value "«a.attribute.description»" ;
	.
	«ENDIF»
	
	«IF a.attribute.entry_schema !== null»
	«putParameterNumber(a, "entry_schema", parameter_counter)»
	:Parameter_«parameter_counter++»
	  rdf:type exchange:Parameter ;
	  exchange:name "required" ;
	  exchange:value "«a.attribute.entry_schema.name»" ;
	.
	«ENDIF»
	
	«attribute_numbers.put(a, attribute_counter)»
	:Attribute_«attribute_counter++»
	  rdf:type exchange:Attribute ;
	  exchange:name "«a.name»" ;
	  «IF a.attribute.type !== null»
	  exchange:hasParameter :Parameter_«getParameterNumber(a, "type")» ;
	  «ENDIF»
	  «IF a.attribute.description !== null»
	  exchange:hasParameter :Parameter_«getParameterNumber(a, "description")» ;
	  «ENDIF»
	  «IF a.attribute.entry_schema !== null»
	  exchange:hasParameter :Parameter_«getParameterNumber(a, "entry_schema")» ;
	  «ENDIF»
	.
	'''
	
	def compile (EValueExpression ve) '''«(ve as ESTRING).string»'''
	
	def void putParameterNumber (EObject entity, String parameterName, Integer number){
		if (parameter_numbers.get(entity) === null){
			parameter_numbers.put(entity, new HashMap<String, Integer>())
		}
		parameter_numbers.get(entity).put(parameterName, number)
	}
	
	def Integer getParameterNumber (EObject entity, String parameterName){
		if (parameter_numbers.get(entity) === null)
			return null;
		return parameter_numbers.get(entity).get(parameterName)
	}
	
	def getFilename(URI uri) {
		var filename = uri.toString
		filename = filename.substring(filename.lastIndexOf('/')+1).concat('.ttl')
		return filename 
	}
		
	def String getName(Resource resource){
		return resource.URI.lastSegment.substring(0, resource.URI.lastSegment.lastIndexOf('.'))
	}
}
