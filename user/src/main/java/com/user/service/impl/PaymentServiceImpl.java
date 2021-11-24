package com.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.model.Payment;
import com.user.repo.PaymentRepository;
import com.user.service.PaymentService;

import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;
@Service
public class PaymentServiceImpl implements PaymentService {
@Autowired
PaymentRepository paymentRepo;
@Override
public List<Payment> getPaymentData() {
return paymentRepo.findAll();
}
public String addPayment(String userId, String paymentId, String totalamount, String tax_cgst, String tax_sgst, String status) {


 Payment payment = new Payment();
payment.setUserId(userId);
payment.setPaymentId(paymentId);
payment.setTotalamount(totalamount);
payment.setTax_cgst(tax_cgst);
payment.setTax_sgst(tax_sgst);
payment.setStatus(status);
paymentRepo.save(payment);
return "Payment Saved SuccessFully..";
}
@Override
public String deletePayment(String paymentId) {
java.util.Optional<Payment> payment = paymentRepo.findById(paymentId);
if(((java.util.Optional<Payment>) payment).isPresent()) {
paymentRepo.delete(payment.get());
}
return "Payment Deleted Successfully...";
}
}