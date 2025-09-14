plugins {
    id("java")
    id("net.labymod.gradle-addon") version "0.4.27"
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(21))
}

labyMod {
    defaultPackageName = "org.ulgu.autosubtitle"
    addonInfo {
        namespace = "autosubtitle"
        displayName = "AutoSubtitle"
        author = "Villager_Horst"
        description = "Automatically manages subtitle timing and settings."
        minecraftVersion = "1.21.5"
    }
}
