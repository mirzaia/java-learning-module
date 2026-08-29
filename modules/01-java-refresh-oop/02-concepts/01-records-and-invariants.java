package examples;

import java.math.BigDecimal;

// A record gives us final fields, accessors, equals/hashCode, and toString.
record Price(BigDecimal amount, String currency) {
    Price {
        // Constructor validation prevents invalid values from ever becoming a Price.
        if (amount == null || amount.signum() < 0) {
            throw new IllegalArgumentException("amount must not be negative");
        }
    }
}

enum ShippingStatus { NEW, SHIPPED, CANCELLED }

final class RecordsAndInvariants {
    static void main(String[] args) {
        // BigDecimal is preferred to double for values such as money.
        Price price = new Price(new BigDecimal("19.99"), "USD");
        System.out.println(price.amount());
    }
}
