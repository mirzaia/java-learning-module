package com.learning.java.exercises;

import java.util.List;
import java.util.concurrent.ExecutorService;

public final class NotificationProcessor {
    /** The caller owns the executor lifecycle; this method only submits and collects work. */
    public List<String> sendAll(List<String> orderIds, ExecutorService executor) {
        return List.of(); // Submit each independent notification and preserve input order.
    }
}
