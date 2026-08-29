package com.learning.java.solutions;

import java.math.BigDecimal;
import java.util.List;
import java.util.function.Predicate;

/** Completed reference implementation of the stream exercise. */
public final class OrderStreams {
    public record Sale(String customerId, BigDecimal total, boolean paid) { }
    /** filter is intermediate; toList creates the new result collection. */
    public List<Sale> filterPaid(List<Sale> sales) { return sales.stream().filter(Sale::paid).toList(); }
    /** Filter first, map each sale to its amount, then reduce amounts to one total. */
    public BigDecimal revenue(List<Sale> sales, Predicate<Sale> condition) { return sales.stream().filter(condition).map(Sale::total).reduce(BigDecimal.ZERO, BigDecimal::add); }
}
