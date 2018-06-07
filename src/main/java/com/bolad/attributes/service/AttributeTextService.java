package com.bolad.attributes.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.bolad.attributes.domain.AttributeText;
import com.bolad.attributes.repository.AttributeTextRepository;

@Service
public class AttributeTextService {
	
	AttributeTextRepository attributeTextRepository;
	
	public AttributeTextService(AttributeTextRepository attributeTextRepository) {
		this.attributeTextRepository = attributeTextRepository;
	}
	
	//find attribute text by id
	public Optional<AttributeText> findAttributeTextById(Long attributeTextId) {
		return attributeTextRepository.findById(attributeTextId);
	}
	
	//find attribute text by attribute id
	public Optional<AttributeText> findAttributeTextByAtrributeId(Long attributeId) {
		return attributeTextRepository.findById(attributeId);
	}
	
	//find all attribute texts
	public Iterable<AttributeText> getAllAttributeTexts(){
		return attributeTextRepository.findAll();
	}

}
