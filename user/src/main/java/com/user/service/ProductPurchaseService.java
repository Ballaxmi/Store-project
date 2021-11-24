package com.user.service;

import java.util.List;

import com.user.model.ProductPurchase;

public interface ProductPurchaseService {

	List<ProductPurchase> getProductPurchaseData();
	
	String addProductPurchase(String paymentId, String productId, String quantity, String amount);
	
	String deleteProductPurchase(String paymentId);

}
