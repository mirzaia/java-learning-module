# Module 10: Android Java Orientation

## Lesson map

| Step | Purpose |
|---|---|
| [Objectives](01-objectives/README.md) | Identify what Java knowledge transfers to Android. |
| [Concepts](02-concepts/README.md) | Model lifecycle-aware UI state. |
| [Exercise](03-exercises/README.md) | Design loading, content, and error states. |
| [Verification](04-verification/checklist.md) | Check the state model. |

## How this fits the course

This orientation module changes perspective: the order API from Module 06 is now a remote dependency for a mobile client. No SDK is required; the goal is to understand lifecycle, main-thread, and state-management constraints before choosing Android tooling.

## Why this module exists

Java knowledge transfers to Android, but Android programs have lifecycle and battery constraints that backend services do not. This orientation module deliberately needs no Android SDK.

## Prerequisites

- Java classes, interfaces, collections, and HTTP concepts from modules 01–06.

## What you will learn

- How an Activity coordinates a screen and a ViewModel holds UI state.
- Why network work cannot run on the main thread.
- How the order API becomes a client dependency rather than local service code.
- Why device rotation and process recreation change application design.

## Learn by doing

Draw three states for an order-list screen: loading, content, and error. For each state, decide what the user sees and which order API call led to it.

## Next

Continue to [Module 11](../11-big-data-java-orientation/README.md).
