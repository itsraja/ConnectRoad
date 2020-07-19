package com.city.road;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.city.road")
@ComponentScan("com.city.road.controller")
public class RoadApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoadApplication.class, args);
	}

}
