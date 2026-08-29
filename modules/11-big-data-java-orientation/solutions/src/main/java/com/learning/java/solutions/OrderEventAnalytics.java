package com.learning.java.solutions;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/** Completed local version of a key-and-reduce aggregation used by distributed engines. */
public final class OrderEventAnalytics {
    public record OrderEvent(String customerId, BigDecimal amount) { }
    public Map<String, BigDecimal> revenueByCustomer(List<OrderEvent> events) {
        // First group by key, then reduce each customer's amounts into one decimal total.
        return events.stream().collect(Collectors.groupingBy(OrderEvent::customerId, Collectors.reducing(BigDecimal.ZERO, OrderEvent::amount, BigDecimal::add)));
    }
}
