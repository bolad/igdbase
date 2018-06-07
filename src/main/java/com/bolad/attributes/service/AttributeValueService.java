package com.bolad.attributes.service;

import org.springframework.stereotype.Service;
import com.bolad.attributes.domain.AttributeValue;
import com.bolad.attributes.repository.AttributeValueRepository;

@Service
public class AttributeValueService {
	
	AttributeValueRepository attributeValueRepository;
	
	public AttributeValueService(AttributeValueRepository attributeValueRepository) {
		this.attributeValueRepository = attributeValueRepository;
	}
	
	public Iterable<AttributeValue> getAllAttributeValues(){
		return attributeValueRepository.findAll();
	}

}
