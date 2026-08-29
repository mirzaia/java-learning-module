package com.learning.java.exercises;

import java.math.BigDecimal;
import java.util.List;
import java.util.function.Predicate;

/** Starter exercise for building a readable filter-map-reduce pipeline. */
public final class OrderStreams {
    public record Sale(String customerId, BigDecimal total, boolean paid) { }
    // Return a new list; do not modify the caller's collection inside a stream pipeline.
    public List<Sale> filterPaid(List<Sale> sales) { return List.of(); }
    // Begin the reduction with zero: it is also the correct revenue for an empty input.
    public BigDecimal revenue(List<Sale> sales, Predicate<Sale> condition) { return BigDecimal.ZERO; }
}
