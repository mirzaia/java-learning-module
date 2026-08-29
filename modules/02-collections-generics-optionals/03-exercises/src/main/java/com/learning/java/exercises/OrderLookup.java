package com.learning.java.exercises;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/** Starter exercise: implement lookup without returning null or mutable internals. */
public final class OrderLookup<T> {
    private final Map<String, T> orders;

    public OrderLookup(Map<String, T> orders) {
        // Copy at the boundary: later changes to the caller's map must not affect this lookup.
        this.orders = Map.copyOf(orders);
    }
    public Optional<T> findById(String id) { return Optional.empty(); }
    public List<T> all() { return List.of(); }
}
