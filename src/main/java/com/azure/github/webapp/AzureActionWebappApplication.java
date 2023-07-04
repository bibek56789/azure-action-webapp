package com.azure.github.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureActionWebappApplication {
	@GetMapping("/hi")
	public String hello(){
		return  "First GitHub Action using Azure webapps.Deployment Successful";
	}

	public static void main(String[] args) {
		SpringApplication.run(AzureActionWebappApplication.class, args);
	}

}
