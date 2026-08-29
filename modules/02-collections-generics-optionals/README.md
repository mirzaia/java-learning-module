# Module 02: Collections, Generics, and Optional

## Lesson map

| Step | Purpose |
|---|---|
| [Objectives](01-objectives/README.md) | Set the lookup and type-safety goals. |
| [Concepts](02-concepts/README.md) | Explain collection choice, generics, and absence. |
| [Exercise](03-exercises/README.md) | Implement an immutable generic order lookup. |
| [Verification](04-verification/checklist.md) | Confirm lookup results and defensive copies. |

## How this fits the course

Module 01 models one order; this module teaches you to safely manage many of them. Its `OrderLookup<T>` pattern leads directly into the stream transformations in Module 03 and the repository boundary in the capstone.

## Why this module exists

Most backend services spend more time moving groups of objects than creating individual objects. This module shows how `Map`, `List`, generics, immutable copies, and `Optional` make that movement explicit and safe.

## Prerequisites

- Module 01: records and the order domain.

## What you will learn

- Use `Map<String, T>` for fast lookup by an identifier.
- Use `List<T>` when ordering matters.
- Use a generic type parameter to reuse a repository-shaped utility without losing type safety.
- Return `Optional<T>` for a genuinely absent value instead of returning `null`.

## Learn by doing

Complete `03-exercises/src/main/java/com/learning/java/exercises/OrderLookup.java`. Start with `findById`, then return an immutable list from `all`. Compare only afterwards with `solutions/`.

## Common pitfall

`Map.copyOf` freezes the map structure, but it does not make mutable objects inside it immutable. Treat domain values as immutable too.

## Next

Continue to [Module 03](../03-functional-java-streams/README.md).
