plugins {
    id("net.labymod.gradle-addon") version "0.4.62"
}

group = "org.ulgu"
version = "1.0.0"

repositories {
    mavenCentral()
    maven("https://repo.labymod.net/repository/maven-public/")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

labyMod {
    defaultPackageName = "org.ulgu.autosubtitle"
    addonInfo {
        namespace = "autosubtitle"
        displayName = "AutoSubtitle"
        author = "Villager_Horst"
        description = "Automatically manages subtitles with custom time settings"
        minecraftVersion = "1.21.5"
        releaseChannel = net.labymod.gradle.core.data.ReleaseChannel.RELEASE
    }
}
