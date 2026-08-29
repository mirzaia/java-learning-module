package com.learning.java.orders.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/** Application entry point; Spring Boot scans this package for controllers and configuration. */
@SpringBootApplication
public class OrdersApiApplication {
    public static void main(String[] args) { SpringApplication.run(OrdersApiApplication.class, args); }
}
