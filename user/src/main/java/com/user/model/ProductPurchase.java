package com.user.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "APP", name = "PRODUCT_PURCHASE")
public class ProductPurchase {

	@Id
	@Column(name = "PAYMENTID")
	private String paymentId;

	@Column(name = "PRODUCTID")
	private String productId;

	@Column(name = "QUANTITY")
	private String quantity;

	@Column(name = "AMOUNT")
	private String amount;

	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

}
