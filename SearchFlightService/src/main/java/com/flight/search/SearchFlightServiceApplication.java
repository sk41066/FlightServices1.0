	package com.flight.search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//@EnableDiscoveryClient
public class SearchFlightServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SearchFlightServiceApplication.class, args);
	}
}
