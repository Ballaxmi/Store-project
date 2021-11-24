package com.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.model.Product;
import com.user.repo.ProductRepository;
import com.user.service.ProductService;

import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepo;

	@Override
	public List<Product> getProductData() {
		return productRepo.findAll();
	}

	public String addProduct(String productId, String productName, String productdesc, String productprice,
			String stock) {

		Product product = new Product();
		product.setProductId(productId);
		product.setProductName(productName);
		product.setProductDescription(productdesc);
		product.setProductPrice(productprice);
		product.setStock(stock);
		productRepo.save(product);
		return "Product Saved SuccessFully..";
	}
	@Override
	public String deleteProduct(String productId) {
	java.util.Optional<Product> product = productRepo.findById(productId);
	if(product.isPresent()) {
	productRepo.delete(product.get());
	}
	return "Product Deleted Successfully...";
	}
}