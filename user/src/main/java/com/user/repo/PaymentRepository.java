package com.user.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment, String> {

}
