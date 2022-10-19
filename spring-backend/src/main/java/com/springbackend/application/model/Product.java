package com.springbackend.application.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "product")
public class Product{
	@Id
	@Column(name = "prod_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long prod_id;
	
	@Column(name = "prod_name", nullable = false)
	private String productName;
	
	@Column(name = "prod_description")
	private String productDesc;
	
	@Column(name = "prod_price")
	private long prodPrice;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "category")
	private String category;
	
	@Column(name = "rating")
	private String rating;

	public long getProd_id() {
		return prod_id;
	}

	public void setProd_id(long prod_id) {
		this.prod_id = prod_id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public long getProdPrice() {
		return prodPrice;
	}

	public void setProdPrice(long prodPrice) {
		this.prodPrice = prodPrice;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	
}
