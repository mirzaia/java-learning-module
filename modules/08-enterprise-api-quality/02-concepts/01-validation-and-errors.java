package examples;

import jakarta.validation.constraints.NotBlank;
import org.springframework.web.bind.annotation.*;

record CreateOrderRequest(@NotBlank String customerId) { }

@RestControllerAdvice
class ErrorAdvice {
    @ExceptionHandler(IllegalArgumentException.class)
    // One place translates a domain exception into an API-shaped error response.
    java.util.Map<String, String> invalidInput(IllegalArgumentException error) {
        return java.util.Map.of("error", "invalid_request", "message", error.getMessage());
    }
}
