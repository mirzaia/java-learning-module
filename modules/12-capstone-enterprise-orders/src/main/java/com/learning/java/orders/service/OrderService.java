package com.learning.java.orders.service;

import com.learning.java.orders.domain.*;
import java.util.List;
import java.util.NoSuchElementException;

/** Application service: coordinates use cases while keeping HTTP and storage concerns outside. */
public final class OrderService {
    private final OrderRepository repository;
    public OrderService(OrderRepository repository) { this.repository = repository; }
    public Order create(Order order) { return repository.save(order); }
    // The repository expresses absence with Optional; the service translates it into a use-case failure.
    public Order get(String id) { return repository.findById(id).orElseThrow(() -> new NoSuchElementException("Order not found: " + id)); }
    public Order changeStatus(String id, OrderStatus status) { return repository.save(get(id).withStatus(status)); }
    public List<Order> list() { return repository.findAll(); }
}
