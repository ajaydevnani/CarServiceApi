package com.CustomCarVisualizer.CarServiceApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication(scanBasePackages = {"com.CustomCarVisualizer.CarServiceApi", "com.controller", "com.service", "com.models", "com.Repository", "com.config"})

public class CarServiceApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarServiceApiApplication.class, args);
	}

}
