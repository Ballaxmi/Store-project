package com.user.view;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.user.model.Payment;
import com.user.service.PaymentService;


@RestController
public class PaymentController {
@Autowired
PaymentService paymentservice;
@RequestMapping({ "/", "/payment" })
public List<Payment> getPaymentData() {
return paymentservice.getPaymentData();
}
@PostMapping({ "/savepayment" })
public String addPayment(@RequestParam String userId, @RequestParam String paymentId,
@RequestParam String totalamount, @RequestParam String tax_cgst, @RequestParam String tax_sgst, @RequestParam String status) {
return paymentservice.addPayment(userId, paymentId, totalamount, tax_cgst, tax_sgst, status );
}
@GetMapping("/payment/{id}")
public String deletePayment(@PathVariable("id") String paymentId) {
return paymentservice.deletePayment(paymentId);
}
}