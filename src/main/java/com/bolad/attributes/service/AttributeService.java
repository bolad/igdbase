package com.bolad.attributes.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bolad.attributes.domain.Attribute;
import com.bolad.attributes.repository.AttributeRepository;

@Service
public class AttributeService {
	
	@Autowired
	AttributeRepository attributeRepository;
	
	public AttributeService(AttributeRepository attributeRepository) {
		this.attributeRepository = attributeRepository;
	}
	
	//add attribute
	public Attribute saveAttribute(Attribute attribute) {
		return attributeRepository.save(attribute);
	}
	
	//find all attributes
	public List<Attribute> getAllAttributes(){
	     return attributeRepository.findAll();
	}
	
	//find attribute by id
	public Optional<Attribute> findAttributeById(Long attributeId) {
		return attributeRepository.findById(attributeId);
	}
	
	//delete an attribute by id
	public void deleteAttributeById(Long attributeId) {
		attributeRepository.deleteById(attributeId);
	}
	
	//delete all attributes
	public void deleteAllAttributes() {
		attributeRepository.deleteAll();
	}

}
