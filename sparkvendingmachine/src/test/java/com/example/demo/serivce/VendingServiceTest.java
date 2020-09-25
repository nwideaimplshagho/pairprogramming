package com.example.demo.serivce;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.example.demo.model.Payment;
import com.example.demo.model.Product;
import com.example.demo.model.VendorResponse;

class VendingServiceTest {

	private VendingService vendingService;
	
	@Test
	void testVendingOfProductWithRefundAmount() {
		List<Product> products = vendingService.listProducts();
		assertNotNull(products);
		assertThat(products).isNotEmpty();
		Product expectedProduct = products.get(0);
		Payment productPayment = null;
		String message = vendingService.selectProduct(expectedProduct,productPayment);
		assertNotNull(message);
		assertThat(message).isEqualTo("Product Avialable");
		VendorResponse response = vendingService.confirmPurchase(expectedProduct);
		assertNotNull(response);
		int actualRefund = response.getRefund();
		int expectedRefund = 0;
		assertThat(actualRefund).isEqualTo(expectedRefund);
		
	}

}
