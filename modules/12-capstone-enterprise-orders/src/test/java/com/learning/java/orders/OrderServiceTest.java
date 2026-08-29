package com.learning.java.orders;

import com.learning.java.orders.domain.*;
import com.learning.java.orders.service.*;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class OrderServiceTest {
    @Test void createsTotalsAndChangesStatus() {
        // Arrange a real domain object but an in-memory adapter, keeping this a fast unit test.
        var product = new Product("p-1", "Keyboard", new Money(new BigDecimal("25.00"), "USD"));
        var order = new Order("o-1", new Customer("c-1", "user@example.com"), List.of(new OrderItem(product, 2)), null);
        var service = new OrderService(new InMemoryOrderRepository());
        // Assert observable behaviour: decimal total calculation and an immutable status transition.
        assertEquals(new BigDecimal("50.00"), service.create(order).total());
        assertEquals(OrderStatus.PAID, service.changeStatus("o-1", OrderStatus.PAID).status());
    }
}
