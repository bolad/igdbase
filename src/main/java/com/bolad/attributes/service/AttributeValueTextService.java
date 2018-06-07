package com.bolad.attributes.service;

import com.bolad.attributes.domain.AttributeValueText;
import com.bolad.attributes.repository.AttributeValueTextRepository;

public class AttributeValueTextService {
	
AttributeValueTextRepository attributeValueTextRepository;
	
	public AttributeValueTextService(AttributeValueTextRepository attributeValueTextRepository) {
		this.attributeValueTextRepository = attributeValueTextRepository;
	}
	
	public Iterable<AttributeValueText> getAllAttributeValueTexts(){
		return attributeValueTextRepository.findAll();
	}

}
