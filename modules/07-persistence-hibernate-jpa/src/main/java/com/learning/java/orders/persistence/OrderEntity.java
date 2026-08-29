package com.learning.java.orders.persistence;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.math.BigDecimal;

/** Persistence representation. Keep it separate from the public REST response contract. */
@Entity(name = "orders")
public class OrderEntity {
    @Id private String id;
    private String customerId;
    private BigDecimal total;
    private String status;
    // Hibernate needs a no-argument constructor to materialize rows via reflection.
    protected OrderEntity() { }
    public OrderEntity(String id, String customerId, BigDecimal total, String status) { this.id = id; this.customerId = customerId; this.total = total; this.status = status; }
    public String getId() { return id; }
    public String getCustomerId() { return customerId; }
    public BigDecimal getTotal() { return total; }
    public String getStatus() { return status; }
}
