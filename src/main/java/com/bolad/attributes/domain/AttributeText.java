package com.bolad.attributes.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="ATTRIBUTE_TEXT")
@EntityListeners(AuditingEntityListener.class)
public class AttributeText {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@NotEmpty
	private Long attributeId;
	
	@NotEmpty
	@Size(max=2)
	private String languageIsoCode;
	
	@Column(columnDefinition = "TEXT")
	@Size(max=40)
	private String description;
	
	@NotEmpty
	private Long version;
	
	@NotNull
	@OneToOne
	private Attribute attribute;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getAttributeId() {
		return attributeId;
	}
	public void setAttributeID(Long attributeId) {
		this.attributeId = attributeId;
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
