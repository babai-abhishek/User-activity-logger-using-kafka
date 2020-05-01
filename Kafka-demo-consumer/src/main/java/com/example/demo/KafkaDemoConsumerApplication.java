package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"model"})

public class KafkaDemoConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaDemoConsumerApplication.class, args);
	}

}
