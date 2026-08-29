# Module 04: Exceptions, Validation, and Testing

## Lesson map

| Step | Purpose |
|---|---|
| [Objectives](01-objectives/README.md) | Define validation and test outcomes. |
| [Concepts](02-concepts/README.md) | Explain fail-fast validation boundaries. |
| [Exercise](03-exercises/README.md) | Validate an order request and test it. |
| [Verification](04-verification/checklist.md) | Check valid and invalid paths. |

## How this fits the course

Earlier modules protect domain values; this module protects the boundary where external data enters. Its tests establish the feedback loop used for every later service and API change.

## Why this module exists

An API or service should reject invalid requests at its boundary, with a message that lets callers fix the input. Tests make those rules executable and protect them when the implementation changes.

## Prerequisites

- Modules 01–03.

## What you will learn

- The difference between expected validation failures and infrastructure failures.
- When `IllegalArgumentException` communicates an invalid caller input.
- The arrange-act-assert shape of a focused JUnit test.

## Learn by doing

Complete `OrderValidator`, then write tests for a blank customer, a zero total, and a valid order. The valid case should not throw.

## Key idea

Validation belongs close to the boundary where bad data first enters the system, rather than allowing it to create a broken domain object later.

## Next

Continue to [Module 05](../05-concurrency-and-jvm-basics/README.md).
