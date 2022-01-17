package com.orderservice.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.orderservice.api.entity.Order;
import com.orderservice.api.service.OrderService;

@RestController
public class OrderServiceController {

	@Autowired
	private OrderService orderService;
	
	@PostMapping("/order") 
	public String bookOrder(@RequestBody Order order) {
		return orderService.bookOrder(order);
	}
}
