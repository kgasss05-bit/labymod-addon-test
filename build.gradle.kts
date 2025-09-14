
plugins {
    id("net.labymod.gradle-addon") version "0.5.1"
}

group = "org.ulgu.autosubtitle"
version = "1.0.0"

labyMod {
    defaultPackageName = "org.ulgu.autosubtitle"
    addonInfo {
        namespace = "autosubtitle"
        displayName = "Auto Subtitle Addon"
        author = "Villager_Horst"
        description = "Shows a countdown timer like 1y 7M 8d 23h 34m 59s left."
        minecraftVersion = "1.21.5"
    }
}
