plugins {
    id("java")
    id("net.labymod.gradle.plugin") version "0.1.21"
}

group = "org.ulgu"
version = "1.0.0"

repositories {
    mavenCentral()
    maven("https://maven.labymod.net/releases")
}

dependencies {
    compileOnly("net.labymod:api:4.0.0")
}

labyMod {
    defaultPackageName = "org.ulgu.autosubtitle"
    addonInfoFile = file("src/main/resources/addon.json")
}
