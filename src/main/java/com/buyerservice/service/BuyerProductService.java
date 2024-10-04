package com.buyerservice.service;

import com.buyerservice.entity.Products;

public interface BuyerProductService {

	Products findProductById(Long productId);

	void updateProductQuantity(Long productId, long quantity);

	Products getProductById(Long productId);

}
