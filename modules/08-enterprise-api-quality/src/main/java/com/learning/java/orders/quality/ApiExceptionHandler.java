package com.learning.java.orders.quality;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

/** Centralising error mapping keeps controllers focused on successful use cases. */
@RestControllerAdvice
public final class ApiExceptionHandler {
    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    Map<String, String> invalidRequest(IllegalArgumentException exception) { return Map.of("error", "invalid_request", "message", exception.getMessage()); }
}
