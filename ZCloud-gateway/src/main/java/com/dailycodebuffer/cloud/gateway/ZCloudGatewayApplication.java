package com.dailycodebuffer.cloud.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableEurekaClient
public class ZCloudGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZCloudGatewayApplication.class, args);
	}

}
