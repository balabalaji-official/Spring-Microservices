package com.cognizant.eureka.server.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderServiceController {
	
	@GetMapping("/order-now/{price}")
	public String orderNowMethod(@PathVariable Integer price) {
		String message="Payment of Rs. "+price+" has been done successfully";
		return message;	
	}
	
	@GetMapping("allproducts")
	public List<String> getAllProducts(){
		List<String> products = Arrays.asList("iPhone","Samsung", "Nokia", "Lenovo");
		return products;
	}
}