package com.miso.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
// Microservice architecture as an opposite concept of Monolithic architecture
// Once System receives request from the client, each servics is invoked through API Gateway, which means the Gateway communicate with each service using API.
// And each service is loosely decoupled and communicate each other using API as well. (A pair of Service - Database)
	     public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
                // the main() function will invoke Tomcat server to be started, Tomcat server is embedded by default in Spring boot
	}
}
