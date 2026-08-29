# Module 08: Enterprise API Quality

## Lesson map

| Step | Purpose |
|---|---|
| [Objectives](01-objectives/README.md) | Define dependable API behaviour. |
| [Concepts](02-concepts/README.md) | Explain validation, errors, and pagination. |
| [Exercise](03-exercises/README.md) | Add request validation and predictable errors. |
| [Verification](04-verification/checklist.md) | Check client-visible contracts. |

## How this fits the course

The REST and persistence modules make the service functional. This module makes it dependable for callers by specifying what invalid input, lists, and configuration look like at the API boundary.

## Why this module exists

Clients need predictable validation errors and stable pagination contracts. Operators need useful configuration and logs. These concerns turn a demo endpoint into a dependable API boundary.

## Prerequisites

- Modules 06–07.

## What you will learn

- Bean Validation annotations such as `@NotBlank` and `@DecimalMin`.
- Centralised error mapping with `@RestControllerAdvice`.
- Why a paginated endpoint needs both data and navigation metadata.
- What belongs in configuration rather than code.

## Learn by doing

Apply `@Valid` to a create request in the REST module. Send an invalid payload and compare the response with a valid request. Then add page and size query parameters to the list endpoint.

## Key idea

An API error is part of the contract. A caller should not need to parse a stack trace or guess whether to retry.

## Next

Continue to [Module 09](../09-security-observability-production/README.md).
