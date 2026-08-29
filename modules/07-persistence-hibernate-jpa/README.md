# Module 07: Persistence with Hibernate and JPA

## Lesson map

| Step | Purpose |
|---|---|
| [Objectives](01-objectives/README.md) | Set entity and repository learning goals. |
| [Concepts](02-concepts/README.md) | Explain ORM identity and derived queries. |
| [Exercise](03-exercises/README.md) | Persist and query orders with H2. |
| [Verification](04-verification/checklist.md) | Check repository behaviour. |

## How this fits the course

Module 06's temporary controller map proves the API shape; this module replaces that short-lived state with a persistence boundary. It intentionally keeps entities separate from HTTP contracts so the next modules can evolve the API independently.

## Why this module exists

In-memory data disappears on restart. JPA maps Java objects to relational tables so a repository can load and store data behind a stable interface.

## Prerequisites

- Module 06: REST APIs and service boundaries.
- Basic SQL concepts: table, row, primary key.

## What you will learn

- What `@Entity` and `@Id` mean to Hibernate.
- How Spring Data derives a query from `findByCustomerId`.
- Why database entities and external API DTOs should not be the same class.
- The role of transactions and lazy loading.

## Learn by doing

Inspect `OrderEntity` and `OrderJpaRepository`, then write a `@DataJpaTest` with H2. Persist two customers and prove that `findByCustomerId` returns only the requested customer’s order.

## Common pitfall

Do not expose JPA entities directly from a controller. That leaks persistence choices and can trigger unexpected lazy loads during JSON serialization.

## Next

Continue to [Module 08](../08-enterprise-api-quality/README.md).
