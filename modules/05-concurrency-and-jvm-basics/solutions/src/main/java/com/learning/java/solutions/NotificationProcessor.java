package com.learning.java.solutions;

import java.util.List;
import java.util.concurrent.ExecutorService;

/** Completed reference using a caller-supplied executor so lifecycle ownership stays explicit. */
public final class NotificationProcessor {
    public List<String> sendAll(List<String> orderIds, ExecutorService executor) {
        try {
            // invokeAll waits for the whole batch, and its futures retain the input task order.
            return executor.invokeAll(orderIds.stream().<java.util.concurrent.Callable<String>>map(id -> () -> "sent:" + id).toList())
                    .stream().map(future -> {
                        try { return future.get(); } catch (Exception exception) { throw new IllegalStateException(exception); }
                    }).toList();
        } catch (InterruptedException exception) {
            // Restore the signal so code higher in the call stack can honour cancellation.
            Thread.currentThread().interrupt();
            throw new IllegalStateException("Notification processing interrupted", exception);
        }
    }
}
