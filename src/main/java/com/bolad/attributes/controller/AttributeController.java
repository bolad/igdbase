package com.bolad.attributes.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bolad.attributes.domain.Attribute;
import com.bolad.attributes.exception.ResourceNotFoundException;
import com.bolad.attributes.service.AttributeService;

@RestController
@RequestMapping("/attributes")
public class AttributeController {
	
	@Autowired
	AttributeService attributeService;
	
	//add attribute
	@PostMapping("/attributes")
	public Attribute addAttribute(@Valid @RequestBody Attribute attribute) {
		return attributeService.saveAttribute(attribute);
	}
	
	//Get all Attributes
	@GetMapping("/attributes")
	public List<Attribute> getAllAttributes(){
		return attributeService.getAllAttributes();
	}

	//Get a single Attribute
	@GetMapping("/attributes/{id}")
	public Attribute getAttributeById(@PathVariable(value="id") Long attributeId) {
		return attributeService.findAttributeById(attributeId)
				.orElseThrow(() -> new ResourceNotFoundException("Attribute", "id",attributeId));
	}

}
