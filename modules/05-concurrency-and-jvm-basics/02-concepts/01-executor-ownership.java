package examples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

final class ExecutorOwnership {
    static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        try {
            // The executor owns worker threads; submitting work is cheaper than creating threads per task.
            executor.submit(() -> System.out.println("send notification"));
        } finally {
            // Always release resources owned by this scope, even when a task fails.
            executor.shutdown();
        }
    }
}
