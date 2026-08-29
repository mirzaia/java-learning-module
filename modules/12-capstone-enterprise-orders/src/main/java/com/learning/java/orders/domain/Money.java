package com.learning.java.orders.domain;

import java.math.BigDecimal;

/** A decimal amount and currency always travel together as one value object. */
public record Money(BigDecimal amount, String currency) {
    public Money {
        // Refuse malformed monetary data at construction, before it reaches totals or persistence.
        if (amount == null || amount.signum() < 0 || currency == null || currency.isBlank()) throw new IllegalArgumentException("Invalid money");
    }
}
