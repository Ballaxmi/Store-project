package com.user.view;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.user.model.Product;
import com.user.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService productservice;

	@RequestMapping({ "/", "/product" })
	public List<Product> getProduct() {
		return productservice.getProductData();

	}

	@PostMapping({ "/saveproduct" })
	public String addProduct(@RequestParam String productId, @RequestParam String productName,
			@RequestParam String productdesc, @RequestParam String productprice, @RequestParam String stock) {
		return productservice.addProduct(productId, productName, productdesc, productprice, stock);
	}

@GetMapping("/product/{id}")
public String deleteProduct(@PathVariable("id") String productId) {
return productservice.deleteProduct(productId);
}
}
