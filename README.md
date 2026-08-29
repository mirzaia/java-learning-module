# Java Learning Module

A practical Java 17 path for backend engineers, using an e-commerce orders domain. Each module has objectives, concepts, exercises, and verification. Work through `00` to `12` in order.

## Prerequisites

- JDK 17 (`java -version`)
- A shell and an editor; no Android, Hadoop, or Spark installation is required

Run `./gradlew test` to verify the complete course. Import the root directory as a Gradle project in your IDE.

## Course map

| Module | Focus |
|---|---|
| [00](modules/00-setup-java-gradle) | Java, JVM, Gradle setup |
| [01](modules/01-java-refresh-oop) | OOP and domain modelling |
| [02](modules/02-collections-generics-optionals) | Collections, generics, Optional |
| [03](modules/03-functional-java-streams) | Lambdas and streams |
| [04](modules/04-exceptions-validation-testing) | Exceptions and JUnit testing |
| [05](modules/05-concurrency-and-jvm-basics) | Concurrency and JVM basics |
| [06](modules/06-spring-boot-rest-api) | REST API design |
| [07](modules/07-persistence-hibernate-jpa) | JPA persistence |
| [08](modules/08-enterprise-api-quality) | API quality and validation |
| [09](modules/09-security-observability-production) | Security and observability |
| [10](modules/10-android-java-orientation) | Java on Android (orientation) |
| [11](modules/11-big-data-java-orientation) | Java in big-data systems (orientation) |
| [12](modules/12-capstone-enterprise-orders) | Capstone enterprise order service |

The runnable examples deliberately use Java-only building blocks where possible. Spring Boot, JPA, Security, and Actuator are introduced as production integrations in the relevant lessons.

## Exercise workflow

Modules 02–05 and 11 contain an intentionally incomplete implementation in `03-exercises/src/main/java` and a completed answer in `solutions/src/main/java`. Implement the starter first, then compare it with the answer. Modules 06–09 provide focused framework examples; module 12 combines them into a runnable Spring Boot order API.
