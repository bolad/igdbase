package com.bolad.attributes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bolad.attributes.domain.Attribute;

@Repository
public interface AttributeRepository extends JpaRepository<Attribute, Long>{

}
