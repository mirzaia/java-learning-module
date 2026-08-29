# Module 09: Security, Observability, and Production Readiness

## Lesson map

| Step | Purpose |
|---|---|
| [Objectives](01-objectives/README.md) | Set production-readiness goals. |
| [Concepts](02-concepts/README.md) | Separate identity, permission, and health concerns. |
| [Exercise](03-exercises/README.md) | Protect writes and inspect health. |
| [Verification](04-verification/checklist.md) | Verify permitted and denied requests. |

## How this fits the course

Modules 06–08 define a useful API; this module asks whether it can be safely operated. It demonstrates the difference between protecting business actions and exposing the minimal operational signal that deployment systems require.

## Why this module exists

Production services must control who can modify data and must expose enough operational information for a platform to decide whether the service is healthy.

## Prerequisites

- Modules 06–08.

## What you will learn

- The difference between authentication and authorization.
- How URL and HTTP-method rules protect order writes.
- Why health checks must remain available without application credentials.
- How Actuator separates operational endpoints from business endpoints.

## Learn by doing

Apply `SecurityConfiguration` to the API. Verify `GET /orders` remains public, while POST and PATCH return `401` without credentials. Visit `GET /actuator/health` and inspect only the status.

## Security note

HTTP Basic in this module is a learning mechanism, not a recommended production identity system. Real systems commonly use an identity provider and short-lived bearer tokens.

## Next

Continue to [Module 10](../10-android-java-orientation/README.md).
