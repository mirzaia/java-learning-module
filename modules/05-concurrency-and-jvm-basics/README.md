# Module 05: Concurrency and JVM Basics

## Lesson map

| Step | Purpose |
|---|---|
| [Objectives](01-objectives/README.md) | Set safe concurrency and JVM goals. |
| [Concepts](02-concepts/README.md) | Explain executor ownership and cleanup. |
| [Exercise](03-exercises/README.md) | Process independent notifications as a batch. |
| [Verification](04-verification/checklist.md) | Check ordering and interruption handling. |

## How this fits the course

This module adds execution concerns to the previous data and validation work. You learn to delegate work to an executor without hiding who owns threads or what happens when interruption occurs.

## Why this module exists

Order notifications are independent units of work, but running work concurrently introduces ordering, failure, and shared-state concerns. This module starts with a deterministic executor-based example before discussing larger async designs.

## Prerequisites

- Modules 01–04.

## What you will learn

- Why an `ExecutorService` is preferable to creating raw threads.
- How `invokeAll` waits for a batch and preserves task order.
- What interruption means and why an interrupt flag must be restored.
- The difference between stack, heap, and garbage collection at a practical level.

## Learn by doing

Implement `NotificationProcessor.sendAll` using the passed executor. Use a fixed-size pool in a test and always shut it down in a `finally` block.

## Next

Continue to [Module 06](../06-spring-boot-rest-api/README.md).
