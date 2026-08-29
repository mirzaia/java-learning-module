package com.learning.java.solutions;

import java.math.BigDecimal;

/** Completed reference: reject invalid request data before later code can depend on it. */
public final class OrderValidator {
    public void validate(String customerId, BigDecimal total) {
        // Each message names the field that a caller must correct.
        if (customerId == null || customerId.isBlank()) throw new IllegalArgumentException("customerId is required");
        if (total == null || total.signum() <= 0) throw new IllegalArgumentException("total must be positive");
    }
}
