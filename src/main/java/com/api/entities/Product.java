package com.api.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int productId;
	public String productName;
	public String types;
	public String categories;
	public float price;
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getTypes() {
		return types;
	}
	public void setTypes(String types) {
		this.types = types;
	}
	public String getCategories() {
		return categories;
	}
	public void setCategories(String categories) {
		this.categories = categories;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
}
