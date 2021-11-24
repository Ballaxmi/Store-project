package com.user.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.user.model.ProductPurchase;
import com.user.repo.ProductPurchaseRepository;
import com.user.service.ProductPurchaseService;

@Service
public class ProductPurchaseServiceImpl implements ProductPurchaseService {

	@Autowired
	ProductPurchaseRepository productpurchaseRepo;

	@Override
	public List<ProductPurchase> getProductPurchaseData() {

		return productpurchaseRepo.findAll();
	}

	public String addProductPurchase(@RequestParam String paymentId, @RequestParam String productId,
			@RequestParam String quantity, @RequestParam String amount) {
		ProductPurchase pp = new ProductPurchase();
		pp.setPaymentId(paymentId);
		pp.setProductId(productId);
		pp.setQuantity(quantity);
		pp.setAmount(amount);
		productpurchaseRepo.save(pp);
		return "Data Saved SuccessFully..";
	}

	@Override
	public String deleteProductPurchase(String paymentId) {
		Optional<ProductPurchase> pp = productpurchaseRepo.findById(paymentId);
		if (pp.isPresent()) {
			productpurchaseRepo.delete(pp.get());
		}
		return "Data Deleted Successfully...";
	}
}