package com.learning.java.exercises;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public final class OrderEventAnalytics {
    public record OrderEvent(String customerId, BigDecimal amount) { }
    // This local method models the same key-and-reduce shape used by distributed processing engines.
    public Map<String, BigDecimal> revenueByCustomer(List<OrderEvent> events) { return Map.of(); }
}
