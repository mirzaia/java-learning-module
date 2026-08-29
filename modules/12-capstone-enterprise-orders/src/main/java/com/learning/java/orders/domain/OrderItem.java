package com.learning.java.orders.domain;

import java.math.BigDecimal;

/** A line item computes its amount from the product price and requested quantity. */
public record OrderItem(Product product, int quantity) {
    public OrderItem { if (product == null || quantity < 1) throw new IllegalArgumentException("Quantity must be positive"); }
    // BigDecimal preserves exact decimal arithmetic for the order total.
    public BigDecimal total() { return product.price().amount().multiply(BigDecimal.valueOf(quantity)); }
}
