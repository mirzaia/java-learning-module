package com.learning.java.solutions;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/** Completed reference: generic lookup keeps the stored value type known to the compiler. */
public final class OrderLookup<T> {
    private final Map<String, T> orders;
    public OrderLookup(Map<String, T> orders) { this.orders = Map.copyOf(orders); }
    /** Optional makes a missing key an explicit part of this method's contract. */
    public Optional<T> findById(String id) { return Optional.ofNullable(orders.get(id)); }
    /** Return an immutable snapshot so callers cannot mutate repository-owned state. */
    public List<T> all() { return List.copyOf(orders.values()); }
}
