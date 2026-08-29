package com.learning.java.orders.quality;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import java.math.BigDecimal;

/** Transport contract: annotations are evaluated when a controller uses this record with {@code @Valid}. */
public record CreateOrderRequest(@NotBlank String customerId, @DecimalMin(value = "0.01") BigDecimal total) { }
