package com.springbackend.application.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String resourceName;
	private String fieldName;
	private String fieldValue;
	
	public ResourceNotFoundException(String resourceName, String fieldName, long prod_id) {
		super(String.format("%s not found with %s : '%s'", resourceName,fieldName,prod_id));
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue = ""+prod_id;
	}

	public String getResourceName() {
		return resourceName;
	}
	public String getFieldName() {
		return fieldName;
	}
	public String getFieldValue() {
		return fieldValue;
	}
	
}
