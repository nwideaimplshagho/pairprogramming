package com.example.demo.serivce;

import java.util.List;

import com.example.demo.model.Payment;
import com.example.demo.model.Product;
import com.example.demo.model.VendorResponse;
import com.example.demo.repo.ProductInventryRepository;

public class VendingService {
	
	private ProductInventryRepository productInventoryRepo;
	private PaymentService paymentService;
	
	public List<Product> listProducts() {
		return productInventoryRepo.listProducts();
	}
	
	public String selectProduct(Product product,Payment payment) {
		//TODO - Validate product amount is correct.
		boolean isCorrect = paymentService.isAmountCorrectForProduct(payment, product);
		//TODO - Validate currency inventory to accomodate refund
		if (isCorrect) {
			
		}
		return "";
	}
	
	public VendorResponse confirmPurchase(Product product) {
		return null;
	}
	
	
}
