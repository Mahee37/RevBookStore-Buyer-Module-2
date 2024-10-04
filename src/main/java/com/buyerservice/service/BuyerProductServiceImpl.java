package com.buyerservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.buyerservice.dao.ProductRepository;
import com.buyerservice.dao.UserRepository;
import com.buyerservice.entity.Products;


@Service
@Transactional
public class BuyerProductServiceImpl  implements BuyerProductService{
	
	@Autowired
	private ProductRepository productRepo;

	@Override
	public Products findProductById(Long productId) {
		// TODO Auto-generated method stub
		 return productRepo.findById(productId).orElse(null);
		
	}

	@Override
	public void updateProductQuantity(Long productId, long quantity) {
		// TODO Auto-generated method stub
		 Products product = productRepo.findById(productId).orElseThrow(() -> new RuntimeException("Product not found"));

		    // Update the quantity
		    product.setQuantity(quantity);
		    productRepo.save(product);
		
	}

	@Override
	public Products getProductById(Long productId) {
		// TODO Auto-generated method stub
		
		 Optional<Products> product = productRepo.findById(productId);
	        return product.orElse(null);
	
	}

}
