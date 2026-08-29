package com.learning.java.orders.api;

import com.learning.java.orders.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/** This configuration wires a plain Java service into Spring without adding framework annotations to it. */
@Configuration
class OrderBeans {
    @Bean OrderRepository orderRepository() { return new InMemoryOrderRepository(); }
    @Bean OrderService orderService(OrderRepository repository) { return new OrderService(repository); }
}
