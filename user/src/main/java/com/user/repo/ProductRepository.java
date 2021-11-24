package com.user.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.model.Product;

public interface ProductRepository extends JpaRepository<Product, String> {

}