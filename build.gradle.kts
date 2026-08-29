plugins {
    java
    id("org.springframework.boot") version "3.3.5" apply false
}

allprojects { group = "com.learning.java"; version = "1.0.0" }

subprojects {
    apply(plugin = "java")
    java { toolchain { languageVersion.set(JavaLanguageVersion.of(17)) } }
    // Repositories are declared once in settings.gradle.kts so every module resolves the same sources.
    dependencies { "testImplementation"("org.junit.jupiter:junit-jupiter:5.10.2") }
    tasks.withType<Test>().configureEach { useJUnitPlatform() }
}

project(":modules:06-spring-boot-rest-api") {
    apply(plugin = "org.springframework.boot")
    dependencies {
        "implementation"(project(":modules:01-java-refresh-oop"))
        "implementation"("org.springframework.boot:spring-boot-starter-web:3.3.5")
        "testImplementation"("org.springframework.boot:spring-boot-starter-test:3.3.5")
    }
}

project(":modules:07-persistence-hibernate-jpa") {
    dependencies {
        "implementation"("org.springframework.boot:spring-boot-starter-data-jpa:3.3.5")
        "runtimeOnly"("com.h2database:h2:2.2.224")
    }
}

project(":modules:08-enterprise-api-quality") {
    dependencies {
        "implementation"("org.springframework.boot:spring-boot-starter-web:3.3.5")
        "implementation"("org.springframework.boot:spring-boot-starter-validation:3.3.5")
    }
}

project(":modules:09-security-observability-production") {
    dependencies {
        "implementation"("org.springframework.boot:spring-boot-starter-security:3.3.5")
        "implementation"("org.springframework.boot:spring-boot-starter-actuator:3.3.5")
    }
}

project(":modules:12-capstone-enterprise-orders") {
    apply(plugin = "org.springframework.boot")
    dependencies {
        "implementation"("org.springframework.boot:spring-boot-starter-web:3.3.5")
        "implementation"("org.springframework.boot:spring-boot-starter-actuator:3.3.5")
        "testImplementation"("org.springframework.boot:spring-boot-starter-test:3.3.5")
    }
}
