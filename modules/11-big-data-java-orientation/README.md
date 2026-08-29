# Module 11: Big Data Java Orientation

## Lesson map

| Step | Purpose |
|---|---|
| [Objectives](01-objectives/README.md) | Define batch, stream, and aggregation goals. |
| [Concepts](02-concepts/README.md) | Relate local grouping to distributed processing. |
| [Exercise](03-exercises/README.md) | Aggregate revenue by customer. |
| [Verification](04-verification/checklist.md) | Check grouped decimal totals. |

## How this fits the course

The local stream exercise uses the same key-and-reduce shape as a Spark or Hadoop workload, without requiring a cluster. It bridges Module 03's stream fundamentals to the operational concerns of partitioning and serialization.

## Why this module exists

Hadoop and Spark are JVM ecosystems, but learning their distributed deployment is not required to understand their data transformations. The local event exercise mirrors a grouped revenue aggregation without a cluster.

## Prerequisites

- Module 03: streams and reductions.

## What you will learn

- The difference between batch input and an unbounded stream.
- How grouping and reduction map to distributed data processing.
- Why partitioning and serialization affect throughput.

## Learn by doing

Implement `OrderEventAnalytics.revenueByCustomer`. Then describe a Spark version: map each event to a customer/amount pair, group by customer, and reduce each group into a sum.

## Next

Continue to [Module 12](../12-capstone-enterprise-orders/README.md).
