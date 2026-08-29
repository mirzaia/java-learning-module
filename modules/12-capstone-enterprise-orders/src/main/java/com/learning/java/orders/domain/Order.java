package com.learning.java.orders.domain;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

/** The capstone aggregate keeps its state immutable; changes create a replacement value. */
public record Order(String id, Customer customer, List<OrderItem> items, OrderStatus status) {
    public Order {
        if (id == null || id.isBlank()) id = UUID.randomUUID().toString();
        if (customer == null || items == null || items.isEmpty()) throw new IllegalArgumentException("Order requires customer and items");
        // Prevent a mutable caller-owned list from changing this order after creation.
        items = List.copyOf(items);
        if (status == null) status = OrderStatus.NEW;
    }
    public BigDecimal total() { return items.stream().map(OrderItem::total).reduce(BigDecimal.ZERO, BigDecimal::add); }
    /** Records are immutable, so a status transition returns a new Order value. */
    public Order withStatus(OrderStatus next) { return new Order(id, customer, items, next); }
}
