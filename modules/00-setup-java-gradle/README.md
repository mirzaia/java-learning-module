# Module 00: Java and Gradle Setup

## Lesson map

| Step | Purpose |
|---|---|
| [Objectives](01-objectives/README.md) | Define the tools and vocabulary you need. |
| [Concepts](02-concepts/README.md) | Explain the JVM, JDK, and Gradle Wrapper. |
| [Exercise](03-exercises/README.md) | Verify the local toolchain. |
| [Verification](04-verification/checklist.md) | Confirm the project builds correctly. |

## How this fits the course

This is the foundation module: every later example is compiled and tested through the Gradle Wrapper. It does not ask you to write Java yet; its deliverable is a repeatable Java 17 development environment.

## Why this module exists

Before writing application code, verify that the JDK, compiler, and build tool agree on Java 17. Gradle is not just a command runner: it describes how source code becomes a tested, repeatable artifact.

## Prerequisites

None. This is the starting point.

## What you will learn

- The distinction between the JDK, JRE, JVM, source code, and bytecode.
- Why a project uses a Gradle Wrapper instead of relying on a globally installed Gradle version.
- The standard `src/main/java` and `src/test/java` layout.

## Learn by doing

1. Run `java -version` and confirm Java 17.
2. Run `./gradlew test` from the project root.
3. Open [build.gradle.kts](../../build.gradle.kts) and find the Java toolchain declaration.
4. Import the root folder into IntelliJ IDEA as a Gradle project.

## Success looks like

Gradle reports successful tests and your IDE recognises Java source roots. Continue to [Module 01](../01-java-refresh-oop/README.md).
