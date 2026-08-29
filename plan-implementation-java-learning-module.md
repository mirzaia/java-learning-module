# Java Learning Module Implementation Plan

## Summary

Create a lightweight, module-based Java learning project in `/Users/mirzaaziz/workspace/java-learning-module`, modeled after the Python reference project’s structure:

```text
README.md
modules/<module-name>/{01-objectives,02-concepts,03-exercises,04-verification}
```

The course targets backend engineers with basic Java knowledge and takes them from practical core Java through enterprise backend readiness. Runnable hands-on work focuses on Java and Spring Boot. Android and Big Data are included as transfer/application modules without requiring Android SDK, Hadoop, Spark clusters, or heavy local setup.

**Defaults chosen:**

- Java baseline: Java 17 LTS
- Build tool: Gradle Wrapper
- Domain: e-commerce orders
- Exercise format: starter code plus solution files
- Scope: 13 modules (`00`–`12`)

## Key Changes

- Add root project documentation:
  - `README.md` — course map, prerequisites, setup, module order, expected outcomes
  - `BACKGROUND.md` — why Java matters for backend, Android, enterprise systems, and data platforms
  - `CLAUDE.md` — contributor guidance for maintaining the learning module style
  - `.gitignore` — Gradle, IDE, build, and OS artifacts

- Add a root Gradle build:
  - `settings.gradle.kts`
  - `build.gradle.kts`
  - `gradlew`, `gradlew.bat`, `gradle/wrapper/*`
  - Use Java 17 toolchain
  - Use JUnit 5 for runnable exercises
  - Use Spring Boot only in Spring modules
  - Avoid a global Gradle dependency (local system Gradle currently fails); learners use `./gradlew`

- Use the same learning structure for each module:
  - `01-objectives/README.md`
  - `02-concepts/*.md`
  - `03-exercises/*.md`
  - Runnable starter code under `src/main/java` or `src/test/java` where useful
  - Solution code under `solutions/`
  - `04-verification/checklist.md`

## Module Plan

1. **00-setup-java-gradle**
   - Install/verify JDK 17, explain JVM/JDK/JRE, run `./gradlew test`
   - Explain Gradle wrapper, project layout, and IDE import

2. **01-java-refresh-oop**
   - Classes, records, interfaces, enums, packages, access modifiers
   - Exercise: model `Product`, `Customer`, `Order`, and `OrderStatus`

3. **02-collections-generics-optionals**
   - Lists, maps, sets, generics, `Optional`, equality, immutability basics
   - Exercise: calculate order totals and group orders by customer/status

4. **03-functional-java-streams**
   - Lambdas, method references, streams, collectors, predicates
   - Exercise: filter, aggregate, and summarize e-commerce orders

5. **04-exceptions-validation-testing**
   - Checked vs unchecked exceptions, validation boundaries, JUnit 5, assertions
   - Exercise: validate order placement rules with unit tests

6. **05-concurrency-and-jvm-basics**
   - Threads, executors, futures, synchronization risks, JVM memory basics
   - Exercise: process order notifications concurrently with deterministic tests

7. **06-spring-boot-rest-api**
   - Controllers, services, DTOs, dependency injection, request/response flow
   - Exercise: build CRUD-style order endpoints

8. **07-persistence-hibernate-jpa**
   - Entities, repositories, transactions, lazy loading, schema basics
   - Exercise: persist orders with Spring Data JPA and H2

9. **08-enterprise-api-quality**
   - Validation, error handling, pagination, configuration, logging
   - Exercise: add request validation, structured errors, and pageable order search

10. **09-security-observability-production**
    - Authentication concepts, Spring Security basics, actuator, health checks, metrics
    - Exercise: protect write endpoints and expose operational health

11. **10-android-java-orientation**
    - How Java maps to Android app architecture, activities/services at a high level, constraints vs backend Java
    - Exercise: design-only walkthrough for consuming the order API from an Android client; no Android SDK required

12. **11-big-data-java-orientation**
    - JVM role in Hadoop/Spark ecosystems, batch vs streaming concepts, serialization, partitioning
    - Exercise: local Java-only analytics simulation over order events; explain how it maps to Spark jobs

13. **12-capstone-enterprise-orders**
    - Consolidate prior modules into a small Spring Boot order service
    - Includes REST API, validation, persistence, tests, basic security, health checks, and analytics-style reporting

## Public Interfaces And Project Shape

- Root commands:
  - `./gradlew test`
  - `./gradlew :modules:06-spring-boot-rest-api:test`
  - `./gradlew :modules:12-capstone-enterprise-orders:bootRun`

- Package naming:
  - `com.learning.java.core`
  - `com.learning.java.orders`
  - `com.learning.java.orders.api`
  - `com.learning.java.orders.domain`
  - `com.learning.java.orders.persistence`
  - `com.learning.java.orders.service`

- Core domain types:
  - `Product`
  - `Customer`
  - `Order`
  - `OrderItem`
  - `OrderStatus`
  - `Money`
  - `OrderService`
  - `OrderRepository`

- Spring API shape:
  - `GET /orders`
  - `GET /orders/{id}`
  - `POST /orders`
  - `PATCH /orders/{id}/status`
  - `GET /actuator/health`

- Keep examples intentionally small:
  - In-memory repositories in early modules
  - H2 database for persistence modules
  - No Docker requirement in v1
  - No real payment, real auth provider, Android SDK, Hadoop, or Spark runtime

## Test Plan

- Root verification:
  - `./gradlew test` passes for all runnable modules
  - Each module checklist includes exact commands and expected success signals

- Unit tests:
  - Domain modeling, collection operations, stream aggregations, validation, exception behavior, and concurrency behavior

- Spring tests:
  - Controller tests for HTTP status and JSON shape
  - Service tests for order placement/status transitions
  - Repository tests for JPA persistence
  - Security tests for protected write endpoints

- Documentation checks:
  - README navigation links resolve to real module paths

## Version Decisions

- Java 17 is selected because it is installed locally and remains a Spring Boot-compatible enterprise baseline.
- Newer Java 21/25 features can be mentioned in advanced notes, but runnable code stays on Java 17.
- Spring Boot version should be pinned during implementation to a current supported version compatible with Java 17. Official Spring docs currently state Spring Boot 4.1 requires Java 17+ and supports Java 26, while Spring Boot 3.x also uses Java 17 as a baseline.
- Gradle toolchains and the Gradle Wrapper will be used for reproducible builds, following Gradle’s official guidance.

**References:**

- [Oracle Java downloads](https://www.oracle.com/java/technologies/downloads/)
- [Spring Boot system requirements](https://docs.spring.io/spring-boot/system-requirements.html)
- [Gradle Java toolchains](https://docs.gradle.org/current/userguide/toolchains.html)
