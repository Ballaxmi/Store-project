package com.user.service;

import java.util.List;

import com.user.model.Product;

public interface ProductService {
public List<Product> getProductData();
public String addProduct(String productId, String productName, String productdesc, String productprice, String stock);
public String deleteProduct(String productId);


}