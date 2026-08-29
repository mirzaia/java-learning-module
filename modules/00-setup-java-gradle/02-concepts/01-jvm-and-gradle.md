# JVM and Gradle in one build

`javac` compiles `.java` source into platform-independent `.class` bytecode. The JVM loads that bytecode and executes it. A JDK includes the JVM plus developer tools such as `javac`; a JRE is the runtime portion.

Gradle reads `build.gradle.kts`, resolves declared libraries, compiles source, and runs tests. The wrapper pins the Gradle version in `gradle/wrapper/gradle-wrapper.properties`, which makes the build reproducible across developer machines and CI.

```text
Order.java --javac--> Order.class --JVM--> running process
                  ^
             Gradle orchestrates this step and test execution
```

The Java toolchain in the root build asks Gradle for Java 17 even if a developer’s shell defaults to another version.
