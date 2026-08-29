package com.learning.java.orders.service;

import com.learning.java.orders.domain.Order;
import java.util.*;

/** A persistence seam: OrderService depends on this contract, not a specific storage technology. */
public interface OrderRepository {
    Order save(Order order);
    Optional<Order> findById(String id);
    List<Order> findAll();
}
