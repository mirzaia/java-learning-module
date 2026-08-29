# Module 01: Java Refresh and Object-Oriented Modelling

## Lesson map

| Step | Purpose |
|---|---|
| [Objectives](01-objectives/README.md) | Identify the OOP and Java 17 skills to practise. |
| [Concepts](02-concepts/README.md) | Learn records, invariants, and domain boundaries. |
| [Exercise](03-exercises/README.md) | Extend the order model. |
| [Verification](04-verification/checklist.md) | Check the model's behaviour. |

## How this fits the course

The order records created here are reused by collections, streams, validation, and the capstone. The important outcome is not inheritance practice: it is a small domain whose types make invalid states difficult to represent.

## Why this module exists

Backend code is easier to change when its types mirror the business vocabulary. The order domain in `src/main/java` models products, customers, order lines, money, and order state using Java 17 records and an enum.

## Prerequisites

- Module 00: Java 17 and Gradle setup.

## What you will learn

- When a `record` is a better fit than a mutable class.
- How constructor validation protects an aggregate from invalid state.
- Why an enum is safer than arbitrary strings for an order lifecycle.
- How package boundaries communicate ownership.

## Learn by doing

Read `Money`, `Product`, and `Order` in that order. Create an order with two `OrderItem` values, call `total()`, then try an invalid quantity and observe the exception.

## Key idea

An `Order` owns its list of lines. The constructor takes an immutable copy so callers cannot modify an already-created order through a shared list reference.

## Next

Continue to [Module 02](../02-collections-generics-optionals/README.md) to store and retrieve those domain objects safely.
