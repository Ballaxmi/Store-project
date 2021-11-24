package com.user.view;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.user.model.ProductPurchase;
import com.user.service.ProductPurchaseService;

@RestController
public class ProductPurchaseController {

	@Autowired
	ProductPurchaseService productpurchaseservice;

	@RequestMapping({ "/", "purchase" })
	public List<ProductPurchase> getProductPurchaseData() {
		return productpurchaseservice.getProductPurchaseData();
	}

	@PostMapping({"/", "/addpurchase" })
	public String addProductPurchase(@RequestParam String paymentId, @RequestParam String productId,
			@RequestParam String quantity, @RequestParam String amount) {
		return productpurchaseservice.addProductPurchase(paymentId, productId, quantity, amount);

	}
	@GetMapping("/{paymentId}")
	public String deleteProductPurchase(@PathVariable("paymentId") String paymentId) {
		return productpurchaseservice.deleteProductPurchase(paymentId);
	}
}