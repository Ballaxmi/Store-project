package com.user.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.model.ProductPurchase;

public interface ProductPurchaseRepository extends JpaRepository<ProductPurchase, String> {

}