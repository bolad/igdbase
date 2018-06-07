package com.bolad.attributes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bolad.attributes.domain.AttributeValueText;
import com.bolad.attributes.service.AttributeValueTextService;

@RestController
@RequestMapping("/attributeValueTexts")
public class AttributeValueTextController {
	
	@Autowired
	AttributeValueTextService attributeValueTextService;
	
	@GetMapping("/attributeValueTexts")
	public Iterable<AttributeValueText> getAllAttributeValueTexts(){
		return attributeValueTextService.getAllAttributeValueTexts();
	}

}
