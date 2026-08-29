# Module 06: Spring Boot REST API

## Lesson map

| Step | Purpose |
|---|---|
| [Objectives](01-objectives/README.md) | Define the HTTP contract and status-code goals. |
| [Concepts](02-concepts/README.md) | Trace a request through a controller. |
| [Exercise](03-exercises/README.md) | Call and extend the order endpoints. |
| [Verification](04-verification/checklist.md) | Verify each route and response. |

## How this fits the course

This is where the course's plain Java order examples become an HTTP service. Keep the controller deliberately thin: persistence, validation, and security are introduced one concern at a time in Modules 07–09.

## Why this module exists

A REST controller turns HTTP requests into application calls and turns results into HTTP responses. The example gives the order service a small public contract before persistence and security complicate the implementation.

## Prerequisites

- Modules 01–05.
- Familiarity with JSON request and response bodies.

## What you will learn

- What `@RestController`, `@RequestMapping`, and HTTP method mappings do.
- Why request and response records are API contracts, not database entities.
- The difference between `200 OK`, `201 Created`, and `404 Not Found`.

## Learn by doing

Start `OrdersApiApplication`, then use curl or an HTTP client to call `POST /orders`, `GET /orders`, `GET /orders/{id}`, and `PATCH /orders/{id}/status`. Read the comments in `OrderController` before replacing its local map with a service.

## Key idea

The controller should coordinate HTTP concerns. Business rules belong in a service, which later modules can test without starting an HTTP server.

## Next

Continue to [Module 07](../07-persistence-hibernate-jpa/README.md).
