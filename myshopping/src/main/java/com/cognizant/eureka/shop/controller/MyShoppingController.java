package com.cognizant.eureka.shop.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MyShoppingController {

	private static final Logger LOGGER = LoggerFactory.getLogger(MyShoppingController.class);
	@Autowired
	RestTemplate template;
	
	@Autowired
	DiscoveryClient client;

	@GetMapping("/shopping")
	public String myShop() {

		int cost = 2500;
		
		//String endPoint = "http://192.168.2.9:9091/order/"+cost;
//		String endPoint ="http://ORDER-SERVICE/order-now/"+cost;
//		String response = template.getForObject(endPoint, String.class);
		
		String endPoint ="http://ORDER-SERVICE/order-now/"+cost;
		Map<String, Integer> params = new HashMap<>();
		params.put("amount", cost);
		String response = template.getForObject(endPoint, String.class, params);
		
		List<ServiceInstance> listInstances = client.getInstances("ORDER-SERVICE");
		LOGGER.info("------------------------"+listInstances.size());
		return response +" - "+listInstances.size()+" - "+listInstances.get(0).getHost()+" - "+listInstances.get(0).getUri();
	}
	
	@GetMapping("/showproducts")
	public List<String> showAllProducts(){
		List<String> products = template.getForObject("http://ORDER-SERVICE/allproducts", List.class);
		return products;
	}
}
