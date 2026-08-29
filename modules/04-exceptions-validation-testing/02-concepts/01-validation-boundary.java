package examples;

import java.math.BigDecimal;

final class ValidationBoundary {
    static void validateTotal(BigDecimal total) {
        // This is a caller error, so an unchecked argument exception is appropriate.
        if (total == null || total.signum() <= 0) {
            throw new IllegalArgumentException("total must be positive");
        }
    }

    static void main(String[] args) {
        validateTotal(new BigDecimal("12.50"));
        // validateTotal(BigDecimal.ZERO); // Try this to see the contract fail fast.
    }
}
