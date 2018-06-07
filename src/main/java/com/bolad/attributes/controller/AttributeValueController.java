package com.bolad.attributes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bolad.attributes.domain.AttributeValue;
import com.bolad.attributes.service.AttributeValueService;

@RestController
@RequestMapping("/atrributeValues")
public class AttributeValueController {
	
	@Autowired
	AttributeValueService attributeValueService;
	
	
	//Get all AttributeValues
	@GetMapping("/attributeValues")
	public Iterable<AttributeValue> getAllAttributeValues(){
		return attributeValueService.getAllAttributeValues();
	}
}
