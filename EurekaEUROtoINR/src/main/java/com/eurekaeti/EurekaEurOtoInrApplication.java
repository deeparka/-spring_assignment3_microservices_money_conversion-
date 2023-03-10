package com.eurekaeti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//Below annotation is used to list down the application on the eureka server (i.e. the registry server).
@EnableDiscoveryClient
public class EurekaEurOtoInrApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaEurOtoInrApplication.class, args);
	}

}
