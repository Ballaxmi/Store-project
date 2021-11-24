package com.user.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "APP", name = "PRODUCT")
public class Product {

	@Id
	@Column(name = "PRODUCTID")
	private String productId;

	@Column(name = "PRODUCTNAME")
	private String productName;

	@Column(name = "PRODUCTPRICE")
	private String productPrice;

	@Column(name = "PRODUCTDESC")
	private String productDescription;

	@Column(name = "STOCK")
	private String stock;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}

}