package examples;

import java.util.Map;
import java.util.Optional;

final class LookupAndOptionals {
    static Optional<String> findCustomerEmail(Map<String, String> emails, String customerId) {
        // get() can return null; Optional makes that absence visible in the return type.
        return Optional.ofNullable(emails.get(customerId));
    }

    static void main(String[] args) {
        Map<String, String> emails = Map.of("c-1", "learner@example.com");
        // orElse is a deliberate fallback, not a null check hidden in the caller.
        System.out.println(findCustomerEmail(emails, "missing").orElse("not found"));
    }
}
