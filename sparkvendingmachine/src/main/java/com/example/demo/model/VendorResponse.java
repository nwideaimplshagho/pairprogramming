package com.example.demo.model;

import java.util.List;

import lombok.Data;

@Data
public class VendorResponse {
	private String message;
	private List<Product>products;
	private int refund;
}
