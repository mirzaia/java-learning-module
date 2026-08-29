package com.learning.java.orders.domain;

/** Product data used by an order line; price is a dedicated Money value, not a bare number. */
public record Product(String id, String name, Money price) {
    public Product {
        // Validate identifiers and names where values enter the domain model.
        if (id == null || id.isBlank() || name == null || name.isBlank()) throw new IllegalArgumentException("Product fields are required");
    }
}
