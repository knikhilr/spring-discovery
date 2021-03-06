package com.nrk.ribbontimeapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
//@RibbonClient(name="time-service")
public class RibbonTimeAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(RibbonTimeAppApplication.class, args);
	}
}
