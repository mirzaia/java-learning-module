package examples;

import java.math.BigDecimal;
import java.util.List;

final class StreamPipeline {
    record Sale(BigDecimal total, boolean paid) { }

    static BigDecimal paidRevenue(List<Sale> sales) {
        return sales.stream()
                // Intermediate operation: keep only business-relevant events.
                .filter(Sale::paid)
                // Transform each Sale into the number we want to aggregate.
                .map(Sale::total)
                // The identity defines the answer for an empty list.
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
