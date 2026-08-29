package examples;

/*
OrderService depends on the OrderRepository abstraction, not on a database implementation.
That seam keeps domain tests fast: use InMemoryOrderRepository in unit tests and add a JPA adapter
later without changing OrderService's business operations.
*/
interface OrderRepository { }
final class OrderService {
    private final OrderRepository repository;
    OrderService(OrderRepository repository) { this.repository = repository; }
}
