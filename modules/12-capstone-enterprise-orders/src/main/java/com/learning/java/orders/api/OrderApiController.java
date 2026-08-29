package com.learning.java.orders.api;

import com.learning.java.orders.domain.*;
import com.learning.java.orders.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.math.BigDecimal;
import java.util.List;

/** Spring adapter that converts JSON requests into the framework-independent order service calls. */
@RestController
@RequestMapping("/orders")
public final class OrderApiController {
    private final OrderService orders;
    public OrderApiController(OrderService orders) { this.orders = orders; }
    @GetMapping public List<Order> list() { return orders.list(); }
    @GetMapping("/{id}") public Order get(@PathVariable String id) { return orders.get(id); }
    @PostMapping @ResponseStatus(HttpStatus.CREATED) public Order create(@RequestBody CreateOrderRequest request) {
        // Keep conversion at the HTTP boundary so OrderService receives domain objects only.
        var product = new Product(request.productId(), request.productName(), new Money(request.unitPrice(), request.currency()));
        return orders.create(new Order(null, new Customer(request.customerId(), request.email()), List.of(new OrderItem(product, request.quantity())), OrderStatus.NEW));
    }
    @PatchMapping("/{id}/status") public Order updateStatus(@PathVariable String id, @RequestBody StatusRequest request) { return orders.changeStatus(id, request.status()); }
    public record CreateOrderRequest(String customerId, String email, String productId, String productName, BigDecimal unitPrice, String currency, int quantity) { }
    public record StatusRequest(OrderStatus status) { }
}
