package com.example.demo.model;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class Auditable {

	static Logger log = LoggerFactory.getLogger(Auditable.class);
	
	@CreatedDate
	private LocalDateTime createDate;
	
	@LastModifiedDate
	private LocalDateTime modifiedDate;
	
	@CreatedBy
	private String createdBy;

	public Auditable() {
		super();
	}

	public LocalDateTime getCreateDate() {
		
		log.info("Getting create date: {}", this.createDate);
		return this.createDate;
	}

	public void setCreateDate(LocalDateTime createDate) {
		
		log.info("Setting create date: {}", createDate);
		this.createDate = LocalDateTime.now();
	}

	public LocalDateTime getModifiedDate() {
		return LocalDateTime.now();
	}

	public void setModifiedDate(LocalDateTime modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getCreatedBy() {
		log.info("Getting created by: {}", this.createdBy);
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@Override
	public String toString() {
		return "Auditable [createDate=" + createDate + ", modifiedDate=" + modifiedDate + ", createdBy=" + createdBy
				+ "]";
	}
	

	
	
}
