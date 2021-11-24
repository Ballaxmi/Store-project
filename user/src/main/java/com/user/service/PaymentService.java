package com.user.service;

import java.util.List;

import com.user.model.Payment;

public interface PaymentService {
public List<Payment> getPaymentData();
public String addPayment(String userId, String paymentId, String totalamount, String tax_cgst, String tax_sgst, String status);
public String deletePayment(String paymentId);
}