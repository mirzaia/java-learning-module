package com.learning.java.orders.domain;

import java.math.BigDecimal;
import java.util.Objects;

/** Value object: a money amount is meaningful only together with its currency. */
public record Money(BigDecimal amount, String currency) {
    public Money {
        Objects.requireNonNull(amount, "amount");
        Objects.requireNonNull(currency, "currency");
        // Reject invalid values at creation time so every Money instance is safe to use later.
        if (amount.signum() < 0 || currency.isBlank()) throw new IllegalArgumentException("Invalid money");
    }
}
