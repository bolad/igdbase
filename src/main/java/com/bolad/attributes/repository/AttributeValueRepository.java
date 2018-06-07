package com.bolad.attributes.repository;

import org.springframework.data.repository.CrudRepository;

import com.bolad.attributes.domain.AttributeValue;

public interface AttributeValueRepository extends CrudRepository<AttributeValue, Long> {

}
