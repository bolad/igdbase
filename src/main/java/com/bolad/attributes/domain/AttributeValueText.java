package com.bolad.attributes.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="ATTRIBUTE_VALUE_TEXT")
@EntityListeners(AuditingEntityListener.class)
public class AttributeValueText {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@NotEmpty
	private Long attributeValueId;
	
	@NotEmpty
	@Size(max=2)
	private String languageIsoCode;
	
	@Column(nullable = true)
	private String description;
	
	@NotEmpty
	private Long version;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getAttributeValueId() {
		return attributeValueId;
	}
	public void setAttributeValueId(Long attributeValueId) {
		this.attributeValueId = attributeValueId;
	}
	public String getLanguageIsoCode() {
		return languageIsoCode;
	}
	public void setLanguageIsoCode(String languageIsoCode) {
		this.languageIsoCode = languageIsoCode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getVersion() {
		return version;
	}
	public void setVersion(Long version) {
		this.version = version;
	}

}
