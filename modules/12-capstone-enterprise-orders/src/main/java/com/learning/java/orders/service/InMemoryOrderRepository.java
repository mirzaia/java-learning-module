package com.learning.java.orders.service;

import com.learning.java.orders.domain.Order;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/** Thread-safe learning implementation; production persistence is introduced in the JPA module. */
public final class InMemoryOrderRepository implements OrderRepository {
    private final Map<String, Order> orders = new ConcurrentHashMap<>();
    public Order save(Order order) { orders.put(order.id(), order); return order; }
    public Optional<Order> findById(String id) { return Optional.ofNullable(orders.get(id)); }
    public List<Order> findAll() { return orders.values().stream().sorted(Comparator.comparing(Order::id)).toList(); }
}
