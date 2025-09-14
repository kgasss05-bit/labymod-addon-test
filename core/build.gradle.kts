plugins {
    java
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

group = "org.ulgu"
version = "1.0.0"

tasks.jar {
    manifest {
        attributes(
            "Implementation-Title" to "AutoSubtitle",
            "Implementation-Version" to project.version
        )
    }
}