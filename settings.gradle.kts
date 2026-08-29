import org.gradle.api.initialization.resolve.RepositoriesMode

pluginManagement { repositories { gradlePluginPortal(); mavenCentral() } }
dependencyResolutionManagement { repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS); repositories { mavenCentral() } }
rootProject.name = "java-learning-module"
listOf("00-setup-java-gradle", "01-java-refresh-oop", "02-collections-generics-optionals", "03-functional-java-streams", "04-exceptions-validation-testing", "05-concurrency-and-jvm-basics", "06-spring-boot-rest-api", "07-persistence-hibernate-jpa", "08-enterprise-api-quality", "09-security-observability-production", "10-android-java-orientation", "11-big-data-java-orientation", "12-capstone-enterprise-orders").forEach { include(":modules:$it") }
