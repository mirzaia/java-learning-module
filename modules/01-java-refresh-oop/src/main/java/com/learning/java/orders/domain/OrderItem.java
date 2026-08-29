package com.learning.java.orders.domain;

import java.math.BigDecimal;

/** One product line in an order; its total is derived rather than stored separately. */
public record OrderItem(Product product, int quantity) {
    public OrderItem { if (product == null || quantity < 1) throw new IllegalArgumentException("Quantity must be positive"); }
    /** Multiply decimal values so a currency total never goes through binary floating point. */
    public BigDecimal total() { return product.price().amount().multiply(BigDecimal.valueOf(quantity)); }
}
