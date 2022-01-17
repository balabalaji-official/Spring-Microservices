package com.orderservice.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orderservice.api.entity.Order;

public interface OrderServiceRepository extends JpaRepository<Order, Integer> {

}
	