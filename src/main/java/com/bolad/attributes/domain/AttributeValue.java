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
@Table(name="ATTRIBUTE_VALUE")
@EntityListeners(AuditingEntityListener.class)
public class AttributeValue {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@NotEmpty
	@Column(unique = true)
	@Size(max=256)
	private String qual;
	
	@NotEmpty
	private Long attributeId;
	
	@NotEmpty
	@Size(max=10)
	private String code;
	
	@NotEmpty
	private int status;
	
	@Column(nullable = true)
	private int sort;
	
	@NotEmpty
	private Long version;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getQual() {
		return qual;
	}
	public void setQual(String qual) {
		this.qual = qual;
	}
	public Long getAttributeId() {
		return attributeId;
	}
	public void setAttributeId(Long attributeId) {
		this.attributeId = attributeId;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getSort() {
		return sort;
	}
	public void setSort(int sort) {
		this.sort = sort;
	}
	public Long getVersion() {
		return version;
	}
	public void setVersion(Long version) {
		this.version = version;
	}
	
	

}
