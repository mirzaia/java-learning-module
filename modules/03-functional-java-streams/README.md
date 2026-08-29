# Module 03: Functional Java and Streams

## Lesson map

| Step | Purpose |
|---|---|
| [Objectives](01-objectives/README.md) | Name the lambda and aggregation skills to gain. |
| [Concepts](02-concepts/README.md) | Follow a filter-map-reduce pipeline. |
| [Exercise](03-exercises/README.md) | Calculate paid-order revenue. |
| [Verification](04-verification/checklist.md) | Check empty, unpaid, and paid data. |

## How this fits the course

Streams are used here to turn collections from Module 02 into business answers such as revenue. The same grouping-and-reducing idea reappears in Module 11, where it is connected to distributed data processing.

## Why this module exists

Streams make transformations over order data compact and composable when each step has one clear purpose. They are not automatically better than loops; they are best for a readable pipeline of filtering, mapping, grouping, or reducing.

## Prerequisites

- Module 02: collections and generics.

## What you will learn

- Lambdas and method references.
- Intermediate operations such as `filter` and `map`.
- Terminal operations such as `toList` and `reduce`.
- Why monetary totals start from `BigDecimal.ZERO`.

## Learn by doing

Implement `filterPaid` and `revenue` in `OrderStreams`. Add a sale that is not paid to ensure the predicate affects the total.

## Common pitfall

Do not mutate shared variables inside a stream pipeline. Return transformed data instead.

## Next

Continue to [Module 04](../04-exceptions-validation-testing/README.md).
