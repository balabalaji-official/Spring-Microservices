package com.orderservice.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orderservice.api.entity.Order;
import com.orderservice.api.repository.OrderServiceRepository;

@Service
public class OrderService {

	@Autowired
	private OrderServiceRepository orderRepo;
	
	public String bookOrder(Order order) {
		orderRepo.save(order);
		return "Order has been Booked";
	}

}
