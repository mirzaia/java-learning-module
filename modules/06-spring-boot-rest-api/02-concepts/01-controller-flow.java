package examples;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders") // All methods below start with /orders.
class ControllerFlow {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED) // A new resource should return 201, not the default 200.
    OrderResponse create(@RequestBody CreateOrderRequest request) {
        // In a real application, call a service here instead of retaining state in the controller.
        return new OrderResponse("o-1", request.customerId());
    }

    record CreateOrderRequest(String customerId) { }
    record OrderResponse(String id, String customerId) { }
}
