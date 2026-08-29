package com.learning.java.orders.domain;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

/** Aggregate root that owns its order lines and lifecycle state. */
public record Order(String id, Customer customer, List<OrderItem> items, OrderStatus status) {
    public Order {
        if (id == null || id.isBlank()) id = UUID.randomUUID().toString();
        if (customer == null || items == null || items.isEmpty()) throw new IllegalArgumentException("Order requires customer and items");
        // A defensive copy prevents callers from modifying an order through their original list.
        items = List.copyOf(items);
        if (status == null) status = OrderStatus.NEW;
    }
    /** Decimal arithmetic avoids floating-point rounding errors in currency totals. */
    public BigDecimal total() { return items.stream().map(OrderItem::total).reduce(BigDecimal.ZERO, BigDecimal::add); }
}
