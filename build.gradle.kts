plugins {
    id("java")
}

allprojects {
    repositories {
        mavenCentral()
        maven("https://maven.labymod.net/releases")
    }
}

subprojects {
    apply(plugin = "java")

    tasks.withType<JavaCompile> {
        sourceCompatibility = "21"
        targetCompatibility = "21"
    }
}
