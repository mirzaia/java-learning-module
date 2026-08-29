package com.learning.java.orders.domain;

/** Immutable customer value. Validation keeps malformed customer data out of every order. */
public record Customer(String id, String email) {
    public Customer {
        // Records validate in their compact constructor before the fields are assigned.
        if (id == null || id.isBlank() || email == null || !email.contains("@")) throw new IllegalArgumentException("Invalid customer");
    }
}
