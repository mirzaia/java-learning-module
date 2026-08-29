package com.learning.java.orders.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/** Spring Data supplies CRUD operations and derives this customer query from its method name. */
public interface OrderJpaRepository extends JpaRepository<OrderEntity, String> {
    List<OrderEntity> findByCustomerId(String customerId);
}
