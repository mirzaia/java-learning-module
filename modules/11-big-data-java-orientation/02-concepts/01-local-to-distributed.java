package examples;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

final class LocalToDistributed {
    record Event(String customerId, BigDecimal amount) { }
    static Map<String, BigDecimal> aggregate(List<Event> events) {
        // This local grouping has the same logical shape as a distributed key-by/customer reduction.
        return events.stream().collect(Collectors.groupingBy(Event::customerId,
                Collectors.reducing(BigDecimal.ZERO, Event::amount, BigDecimal::add)));
    }
}
