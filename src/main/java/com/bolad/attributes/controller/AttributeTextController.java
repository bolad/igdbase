package com.bolad.attributes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bolad.attributes.domain.AttributeText;
import com.bolad.attributes.exception.ResourceNotFoundException;
import com.bolad.attributes.service.AttributeTextService;

@RestController
@RequestMapping("/attributeTexts")
public class AttributeTextController {
	
	@Autowired
	AttributeTextService attributeTextService;
	
	//Get all Attributes
	@GetMapping("/attributeTexts")
	public Iterable<AttributeText> getAllAttributeTexts(){
		return attributeTextService.getAllAttributeTexts();
	}

	//Get attribute text by id
	@GetMapping("/attributeTexts/{id}")
	public AttributeText getAttributeTextById(@PathVariable(value="id") Long attributeTextId) {
		return attributeTextService.findAttributeTextById(attributeTextId)
				.orElseThrow(() -> new ResourceNotFoundException("Attribute", "id",attributeTextId));
	}
	
	//Get attribute text by attribute id
	@GetMapping("/attributeTexts/{attributeId}")
	public AttributeText getAttributeTextByAttributeId(@PathVariable(value="attributeId") Long attributeId) {
		return attributeTextService.findAttributeTextByAtrributeId(attributeId)
				.orElseThrow(() -> new ResourceNotFoundException("Attribute", "id",attributeId));
	}

}
