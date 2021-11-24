package com.user.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "APP", name = "PAYMENT")
public class Payment {

	@Id
	@Column(name = "USERID")
	private String userId;

	@Column(name = "PAYMENTID")
	private String paymentId;

	@Column(name = "TOTALAMOUNT")
	private String totalamount;

	@Column(name = "TAX_CGST")
	private String tax_cgst;

	@Column(name = "TAX_SGST")
	private String tax_sgst;

	@Column(name = "STATUS")
	private String status;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	public String getTotalamount() {
		return totalamount;
	}

	public void setTotalamount(String totalamount) {
		this.totalamount = totalamount;
	}

	public String getTax_cgst() {
		return tax_cgst;
	}

	public void setTax_cgst(String tax_cgst) {
		this.tax_cgst = tax_cgst;
	}

	public String getTax_sgst() {
		return tax_sgst;
	}

	public void setTax_sgst(String tax_sgst) {
		this.tax_sgst = tax_sgst;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
