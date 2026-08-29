# Module 12: Capstone Enterprise Orders Service

## Lesson map

| Step | Purpose |
|---|---|
| [Objectives](01-objectives/README.md) | Review the capabilities the capstone combines. |
| [Concepts](02-concepts/README.md) | Explain the service/repository architectural seam. |
| [Exercise](03-exercises/README.md) | Run and extend the complete order API. |
| [Verification](04-verification/checklist.md) | Confirm the end-to-end behaviour. |

## How this fits the course

This is the integration point for the course: the domain from Module 01, collections and streams, validation, HTTP, persistence, and production concerns all have a place here. Start with the in-memory adapter to understand the core, then replace one boundary at a time using the earlier modules.

## Why this module exists

This module assembles the course’s ideas into an order service with a framework-independent core and a Spring Boot adapter. It is intentionally small enough to read end-to-end and change safely.

## Prerequisites

- Modules 01–09. Module 11 is helpful for the reporting extension.

## What you will build

- An immutable order domain with decimal money calculations.
- A repository abstraction and an in-memory implementation.
- An `OrderService` for create, read, list, and status transitions.
- Spring MVC endpoints for the four order operations.
- A Spring Boot application entry point, ready for Actuator and security integration.

## Learn by doing

Run `./gradlew :modules:12-capstone-enterprise-orders:bootRun`. Create an order with `POST /orders`, retain its returned ID, then get it and change its status. Read `OrderBeans` to see how the framework-independent service becomes a Spring bean.

## Extension path

Replace `InMemoryOrderRepository` with the JPA repository, validate `CreateOrderRequest`, apply the security rules, then add a revenue summary endpoint.
