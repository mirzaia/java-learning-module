package examples;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

@Entity
class CustomerOrder {
    @Id String id; // The primary key identifies this row independently of its other values.
    String customerId;
}

interface CustomerOrderRepository extends JpaRepository<CustomerOrder, String> {
    // Spring Data derives a WHERE customer_id = ? query from this method name.
    java.util.List<CustomerOrder> findByCustomerId(String customerId);
}
